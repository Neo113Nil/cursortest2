package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppLocalesStorageHelper;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes8.dex */
class AppLocalesStorageHelper {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals("locales") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String readLocales(Context context) {
        String str = "";
        try {
            FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
                if (!str.isEmpty()) {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + str);
                } else {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
                return str;
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    static void persistLocales(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + str, e);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    static void syncLocalesToFramework(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (AppCompatDelegate.getApplicationLocales().isEmpty()) {
                    String readLocales = readLocales(context);
                    Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                    if (systemService != null) {
                        AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(systemService, AppCompatDelegate.Api24Impl.localeListForLanguageTags(readLocales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static class ThreadPerTaskExecutor implements Executor {
        ThreadPerTaskExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    static class SerialExecutor implements Executor {
        Runnable mActive;
        final Executor mExecutor;
        private final Object mLock = new Object();
        final Queue mTasks = new ArrayDeque();

        SerialExecutor(Executor executor) {
            this.mExecutor = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.mLock) {
                try {
                    this.mTasks.add(new Runnable() { // from class: androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLocalesStorageHelper.SerialExecutor.this.lambda$execute$0(runnable);
                        }
                    });
                    if (this.mActive == null) {
                        scheduleNext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$execute$0(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                scheduleNext();
            }
        }

        protected void scheduleNext() {
            synchronized (this.mLock) {
                try {
                    Runnable runnable = (Runnable) this.mTasks.poll();
                    this.mActive = runnable;
                    if (runnable != null) {
                        this.mExecutor.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
