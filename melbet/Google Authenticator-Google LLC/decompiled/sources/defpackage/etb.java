package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etb {
    public static final /* synthetic */ int a = 0;
    private static Boolean b;
    private static final qi c = new qi();

    private etb() {
    }

    public static synchronized Uri a(String str) {
        synchronized (etb.class) {
            qi qiVar = c;
            Uri uri = (Uri) qiVar.get(str);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
            qiVar.put(str, parse);
            return parse;
        }
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static String c(String str) {
        int indexOf = str.indexOf("#");
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        if (str.contains("@")) {
            throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(str)));
        }
        return str;
    }

    public static boolean d() {
        boolean isIsolated;
        Boolean bool = b;
        if (bool == null) {
            isIsolated = Process.isIsolated();
            bool = Boolean.valueOf(isIsolated);
            b = bool;
        }
        return bool.booleanValue();
    }

    public static String e(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        return str + "#" + context.getPackageName();
    }
}
