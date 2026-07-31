package h1;

import android.util.Log;

/* loaded from: classes2.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f36718a = false;

    public static void a(int i4, String str) {
        if (f36718a) {
            return;
        }
        if (i4 == 6) {
            Log.e("Unity", str);
        }
        if (i4 == 5) {
            Log.w("Unity", str);
        }
    }
}
