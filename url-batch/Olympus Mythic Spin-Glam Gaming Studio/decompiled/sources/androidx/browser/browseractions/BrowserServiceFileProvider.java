package androidx.browser.browseractions;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.FileProvider;
import androidx.core.util.AtomicFile;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RestrictTo
@Deprecated
/* loaded from: classes12.dex */
public final class BrowserServiceFileProvider extends FileProvider {
    static Object sFileCleanupLock = new Object();

    private static class FileCleanupTask extends AsyncTask<Void, Void, Void> {
        private static final long CLEANUP_REQUIRED_TIME_SPAN;
        private static final long DELETION_FAILED_REATTEMPT_DURATION;
        private static final long IMAGE_RETENTION_DURATION;
        private final Context mAppContext;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            IMAGE_RETENTION_DURATION = timeUnit.toMillis(7L);
            CLEANUP_REQUIRED_TIME_SPAN = timeUnit.toMillis(7L);
            DELETION_FAILED_REATTEMPT_DURATION = timeUnit.toMillis(1L);
        }

        FileCleanupTask(Context context) {
            this.mAppContext = context.getApplicationContext();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            long currentTimeMillis;
            SharedPreferences sharedPreferences = this.mAppContext.getSharedPreferences(this.mAppContext.getPackageName() + ".image_provider", 0);
            if (!shouldCleanUp(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    File file = new File(this.mAppContext.getFilesDir(), "image_provider");
                    if (!file.exists()) {
                        return null;
                    }
                    File[] listFiles = file.listFiles();
                    long currentTimeMillis2 = System.currentTimeMillis() - IMAGE_RETENTION_DURATION;
                    boolean z = true;
                    for (File file2 : listFiles) {
                        if (isImageFile(file2) && file2.lastModified() < currentTimeMillis2 && !file2.delete()) {
                            Log.e("BrowserServiceFP", "Fail to delete image: " + file2.getAbsoluteFile());
                            z = false;
                        }
                    }
                    if (z) {
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        currentTimeMillis = (System.currentTimeMillis() - CLEANUP_REQUIRED_TIME_SPAN) + DELETION_FAILED_REATTEMPT_DURATION;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong("last_cleanup_time", currentTimeMillis);
                    edit.apply();
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private static boolean isImageFile(File file) {
            return file.getName().endsWith("..png");
        }

        private static boolean shouldCleanUp(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + CLEANUP_REQUIRED_TIME_SPAN;
        }
    }

    private static class FileSaveTask extends AsyncTask<String, Void, Void> {
        private final Context mAppContext;
        private final Bitmap mBitmap;
        private final Uri mFileUri;
        private final String mFilename;
        private final ResolvableFuture mResultFuture;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Void doInBackground(String... strArr) {
            saveFileIfNeededBlocking();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r3) {
            new FileCleanupTask(this.mAppContext).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }

        private void saveFileIfNeededBlocking() {
            File file = new File(this.mAppContext.getFilesDir(), "image_provider");
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                try {
                    if (!file.exists() && !file.mkdir()) {
                        this.mResultFuture.setException(new IOException("Could not create file directory."));
                        return;
                    }
                    File file2 = new File(file, this.mFilename + ".png");
                    if (file2.exists()) {
                        this.mResultFuture.set(this.mFileUri);
                    } else {
                        saveFileBlocking(file2);
                    }
                    file2.setLastModified(System.currentTimeMillis());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void saveFileBlocking(File file) {
            FileOutputStream fileOutputStream;
            AtomicFile atomicFile = new AtomicFile(file);
            try {
                fileOutputStream = atomicFile.startWrite();
            } catch (IOException e) {
                e = e;
                fileOutputStream = null;
            }
            try {
                this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                atomicFile.finishWrite(fileOutputStream);
                this.mResultFuture.set(this.mFileUri);
            } catch (IOException e2) {
                e = e2;
                atomicFile.failWrite(fileOutputStream);
                this.mResultFuture.setException(e);
            }
        }
    }

    public static ListenableFuture loadBitmap(final ContentResolver contentResolver, final Uri uri) {
        final ResolvableFuture create = ResolvableFuture.create();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: androidx.browser.browseractions.BrowserServiceFileProvider.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    if (openFileDescriptor == null) {
                        create.setException(new FileNotFoundException());
                        return;
                    }
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                    openFileDescriptor.close();
                    if (decodeFileDescriptor == null) {
                        create.setException(new IOException("File could not be decoded."));
                    } else {
                        create.set(decodeFileDescriptor);
                    }
                } catch (IOException e) {
                    create.setException(e);
                }
            }
        });
        return create;
    }
}
