package com.umeng.commonsdk.proguard;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: UMCrashUtils.java */
/* loaded from: classes2.dex */
public class c {
    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            String obj = stringWriter.toString();
            try {
                printWriter.close();
                stringWriter.close();
                return obj;
            } catch (Exception unused) {
                return obj;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
