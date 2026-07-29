package com.mopub.mobileads;

import android.os.AsyncTask;
import com.mopub.common.CacheService;
import com.mopub.common.MoPubHttpUrlConnection;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Streams;
import java.io.BufferedInputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class VideoDownloader {
    private static final int MAX_VIDEO_SIZE = 26214400;
    private static final Deque<WeakReference<VideoDownloaderTask>> sDownloaderTasks = new ArrayDeque();

    interface VideoDownloaderListener {
        void onComplete(boolean z);
    }

    private VideoDownloader() {
    }

    public static void cache(String str, VideoDownloaderListener videoDownloaderListener) {
        Preconditions.checkNotNull(videoDownloaderListener);
        if (str == null) {
            MoPubLog.d("VideoDownloader attempted to cache video with null url.");
            videoDownloaderListener.onComplete(false);
        } else {
            try {
                AsyncTasks.safeExecuteOnExecutor(new VideoDownloaderTask(videoDownloaderListener), str);
            } catch (Exception unused) {
                videoDownloaderListener.onComplete(false);
            }
        }
    }

    public static void cancelAllDownloaderTasks() {
        Iterator<WeakReference<VideoDownloaderTask>> it = sDownloaderTasks.iterator();
        while (it.hasNext()) {
            cancelOneTask(it.next());
        }
        sDownloaderTasks.clear();
    }

    public static void cancelLastDownloadTask() {
        if (sDownloaderTasks.isEmpty()) {
            return;
        }
        cancelOneTask(sDownloaderTasks.peekLast());
        sDownloaderTasks.removeLast();
    }

    private static boolean cancelOneTask(WeakReference<VideoDownloaderTask> weakReference) {
        VideoDownloaderTask videoDownloaderTask;
        if (weakReference == null || (videoDownloaderTask = weakReference.get()) == null) {
            return false;
        }
        return videoDownloaderTask.cancel(true);
    }

    @VisibleForTesting
    static class VideoDownloaderTask extends AsyncTask<String, Void, Boolean> {
        private final VideoDownloaderListener mListener;
        private final WeakReference<VideoDownloaderTask> mWeakSelf = new WeakReference<>(this);

        @VisibleForTesting
        VideoDownloaderTask(VideoDownloaderListener videoDownloaderListener) {
            this.mListener = videoDownloaderListener;
            VideoDownloader.sDownloaderTasks.add(this.mWeakSelf);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(String... strArr) {
            HttpURLConnection httpURLConnection;
            BufferedInputStream bufferedInputStream;
            if (strArr == null || strArr.length == 0 || strArr[0] == null) {
                MoPubLog.d("VideoDownloader task tried to execute null or empty url.");
                return false;
            }
            String str = strArr[0];
            BufferedInputStream bufferedInputStream2 = null;
            try {
                try {
                    httpURLConnection = MoPubHttpUrlConnection.getHttpUrlConnection(str);
                    try {
                        bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = null;
                }
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = null;
                bufferedInputStream = null;
            }
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    int contentLength = httpURLConnection.getContentLength();
                    if (contentLength > VideoDownloader.MAX_VIDEO_SIZE) {
                        MoPubLog.d(String.format("VideoDownloader encountered video larger than disk cap. (%d bytes / %d maximum).", Integer.valueOf(contentLength), Integer.valueOf(VideoDownloader.MAX_VIDEO_SIZE)));
                        Streams.closeStream(bufferedInputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return false;
                    }
                    Boolean valueOf = Boolean.valueOf(CacheService.putToDiskCache(str, bufferedInputStream));
                    Streams.closeStream(bufferedInputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return valueOf;
                }
                MoPubLog.d("VideoDownloader encountered unexpected statusCode: " + responseCode);
                Streams.closeStream(bufferedInputStream);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return false;
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream2 = bufferedInputStream;
                MoPubLog.d("VideoDownloader task threw an internal exception.", e);
                Streams.closeStream(bufferedInputStream2);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                Streams.closeStream(bufferedInputStream);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (!isCancelled()) {
                VideoDownloader.sDownloaderTasks.remove(this.mWeakSelf);
                if (bool == null) {
                    this.mListener.onComplete(false);
                    return;
                } else {
                    this.mListener.onComplete(bool.booleanValue());
                    return;
                }
            }
            onCancelled();
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            MoPubLog.d("VideoDownloader task was cancelled.");
            VideoDownloader.sDownloaderTasks.remove(this.mWeakSelf);
            this.mListener.onComplete(false);
        }
    }

    @VisibleForTesting
    @Deprecated
    public static Deque<WeakReference<VideoDownloaderTask>> getDownloaderTasks() {
        return sDownloaderTasks;
    }

    @VisibleForTesting
    @Deprecated
    public static void clearDownloaderTasks() {
        sDownloaderTasks.clear();
    }
}
