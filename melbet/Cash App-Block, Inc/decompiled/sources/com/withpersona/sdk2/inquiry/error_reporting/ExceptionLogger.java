package com.withpersona.sdk2.inquiry.error_reporting;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.withpersona.sdk2.inquiry.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class ExceptionLogger {
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public final File errDir;

    public ExceptionLogger(Context context) {
        context.getClass();
        this.errDir = new File(new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "errors");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void logException(Throwable th) {
        File file;
        Throwable th2;
        String str;
        File file2 = this.errDir;
        try {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    file2.delete();
                }
                file = new File(file2, "last_error.txt");
                if (file.isDirectory()) {
                    file.delete();
                }
                String canonicalName = th.getClass().getCanonicalName();
                th2 = th;
                loop0: while (true) {
                    if (th2 != null) {
                        str = null;
                        break;
                    }
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    stackTrace.getClass();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        String className = stackTraceElement.getClassName();
                        className.getClass();
                        if (StringsKt__StringsJVMKt.startsWith(className, BuildConfig.LIBRARY_PACKAGE_NAME, false)) {
                            str = stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
                            break loop0;
                        }
                    }
                    th2 = th2.getCause();
                }
                if (str == null) {
                    StackTraceElement[] stackTrace2 = th.getStackTrace();
                    stackTrace2.getClass();
                    StackTraceElement stackTraceElement2 = (StackTraceElement) ArraysKt___ArraysKt.firstOrNull(stackTrace2);
                    str = stackTraceElement2 != null ? stackTraceElement2.getClassName() + " in " + stackTraceElement2.getMethodName() + " at line " + stackTraceElement2.getLineNumber() : null;
                }
                String m = Recorder$$ExternalSyntheticOutline2.m(canonicalName, " in ", str);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
                outputStreamWriter.write(m);
                outputStreamWriter.close();
                return;
            }
            outputStreamWriter.write(m);
            outputStreamWriter.close();
            return;
        } finally {
        }
        file2.mkdirs();
        file = new File(file2, "last_error.txt");
        if (file.isDirectory()) {
        }
        String canonicalName2 = th.getClass().getCanonicalName();
        th2 = th;
        loop0: while (true) {
            if (th2 != null) {
            }
            th2 = th2.getCause();
        }
        if (str == null) {
        }
        String m2 = Recorder$$ExternalSyntheticOutline2.m(canonicalName2, " in ", str);
        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
    }
}
