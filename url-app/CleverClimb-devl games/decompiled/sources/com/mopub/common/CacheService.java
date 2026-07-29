package com.mopub.common;

import android.content.Context;
import android.os.AsyncTask;
import com.mopub.common.DiskLruCache;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Streams;
import com.mopub.common.util.Utils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class CacheService {
    private static final int APP_VERSION = 1;
    private static final int DISK_CACHE_INDEX = 0;
    static final String UNIQUE_CACHE_NAME = "mopub-cache";
    private static final int VALUE_COUNT = 1;
    private static DiskLruCache sDiskLruCache;

    public interface DiskLruCacheGetListener {
        void onComplete(String str, byte[] bArr);
    }

    public static boolean initializeDiskCache(Context context) {
        if (context == null) {
            return false;
        }
        if (sDiskLruCache == null) {
            File diskCacheDirectory = getDiskCacheDirectory(context);
            if (diskCacheDirectory == null) {
                return false;
            }
            try {
                sDiskLruCache = DiskLruCache.open(diskCacheDirectory, 1, 1, DeviceUtils.diskCacheSizeBytes(diskCacheDirectory));
            } catch (IOException e) {
                MoPubLog.d("Unable to create DiskLruCache", e);
                return false;
            }
        }
        return true;
    }

    public static void initialize(Context context) {
        initializeDiskCache(context);
    }

    public static String createValidDiskCacheKey(String str) {
        return Utils.sha1(str);
    }

    public static File getDiskCacheDirectory(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        return new File(cacheDir.getPath() + File.separator + UNIQUE_CACHE_NAME);
    }

    public static boolean containsKeyDiskCache(String str) {
        if (sDiskLruCache == null) {
            return false;
        }
        try {
            return sDiskLruCache.get(createValidDiskCacheKey(str)) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getFilePathDiskCache(String str) {
        if (sDiskLruCache == null) {
            return null;
        }
        return sDiskLruCache.getDirectory() + File.separator + createValidDiskCacheKey(str) + ".0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (r6 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] getFromDiskCache(String str) {
        DiskLruCache.Snapshot snapshot;
        byte[] bArr;
        Exception e;
        if (sDiskLruCache == null) {
            return null;
        }
        try {
            snapshot = sDiskLruCache.get(createValidDiskCacheKey(str));
            if (snapshot == null) {
                if (snapshot != null) {
                    snapshot.close();
                }
                return null;
            }
            try {
                try {
                    InputStream inputStream = snapshot.getInputStream(0);
                    if (inputStream != null) {
                        bArr = new byte[(int) snapshot.getLength(0)];
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                            try {
                                Streams.readStream(bufferedInputStream, bArr);
                                Streams.closeStream(bufferedInputStream);
                            } catch (Throwable th) {
                                Streams.closeStream(bufferedInputStream);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            MoPubLog.d("Unable to get from DiskLruCache", e);
                        }
                    } else {
                        bArr = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bArr = null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (snapshot != null) {
                    snapshot.close();
                }
                throw th;
            }
        } catch (Exception e4) {
            bArr = null;
            e = e4;
            snapshot = null;
        } catch (Throwable th3) {
            th = th3;
            snapshot = null;
        }
    }

    public static void getFromDiskCacheAsync(String str, DiskLruCacheGetListener diskLruCacheGetListener) {
        new DiskLruCacheGetTask(str, diskLruCacheGetListener).execute(new Void[0]);
    }

    public static boolean putToDiskCache(String str, byte[] bArr) {
        return putToDiskCache(str, new ByteArrayInputStream(bArr));
    }

    public static boolean putToDiskCache(String str, InputStream inputStream) {
        DiskLruCache.Editor editor;
        if (sDiskLruCache == null) {
            return false;
        }
        try {
            editor = sDiskLruCache.edit(createValidDiskCacheKey(str));
            if (editor == null) {
                return false;
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(editor.newOutputStream(0));
                Streams.copyContent(inputStream, bufferedOutputStream);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                sDiskLruCache.flush();
                editor.commit();
                return true;
            } catch (Exception e) {
                e = e;
                MoPubLog.d("Unable to put to DiskLruCache", e);
                if (editor != null) {
                    try {
                        editor.abort();
                    } catch (IOException unused) {
                    }
                }
                return false;
            }
        } catch (Exception e2) {
            e = e2;
            editor = null;
        }
    }

    public static void putToDiskCacheAsync(String str, byte[] bArr) {
        new DiskLruCachePutTask(str, bArr).execute(new Void[0]);
    }

    private static class DiskLruCacheGetTask extends AsyncTask<Void, Void, byte[]> {
        private final DiskLruCacheGetListener mDiskLruCacheGetListener;
        private final String mKey;

        DiskLruCacheGetTask(String str, DiskLruCacheGetListener diskLruCacheGetListener) {
            this.mDiskLruCacheGetListener = diskLruCacheGetListener;
            this.mKey = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public byte[] doInBackground(Void... voidArr) {
            return CacheService.getFromDiskCache(this.mKey);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(byte[] bArr) {
            if (isCancelled()) {
                onCancelled();
            } else if (this.mDiskLruCacheGetListener != null) {
                this.mDiskLruCacheGetListener.onComplete(this.mKey, bArr);
            }
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            if (this.mDiskLruCacheGetListener != null) {
                this.mDiskLruCacheGetListener.onComplete(this.mKey, null);
            }
        }
    }

    private static class DiskLruCachePutTask extends AsyncTask<Void, Void, Void> {
        private final byte[] mContent;
        private final String mKey;

        DiskLruCachePutTask(String str, byte[] bArr) {
            this.mKey = str;
            this.mContent = bArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            CacheService.putToDiskCache(this.mKey, this.mContent);
            return null;
        }
    }

    @VisibleForTesting
    @Deprecated
    public static void clearAndNullCaches() {
        if (sDiskLruCache != null) {
            try {
                sDiskLruCache.delete();
                sDiskLruCache = null;
            } catch (IOException unused) {
                sDiskLruCache = null;
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    public static DiskLruCache getDiskLruCache() {
        return sDiskLruCache;
    }
}
