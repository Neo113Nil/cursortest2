package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class oc2 {
    public static void a(String str, String str2, Throwable th) {
        Log.e(str, c(str2, th));
    }

    public static void b(String str, String str2, Throwable th) {
        Log.w(str, c(str2, th));
    }

    private static String c(String str, Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
                if (th2 instanceof UnknownHostException) {
                    replace = "UnknownHostException (no network)";
                    break;
                }
                th2 = th2.getCause();
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace2 = replace.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace2).length());
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace2);
        sb.append('\n');
        return sb.toString();
    }
}
