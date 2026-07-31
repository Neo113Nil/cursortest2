package O0;

import android.util.Log;

/* loaded from: classes.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1132a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f1133b = 4;

    private static String a() {
        return "FormalHASDK_2.2.0.315" + X.a();
    }

    public void b(int i4) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + a() + "" + System.lineSeparator() + "=======================================");
        this.f1133b = i4;
        this.f1132a = true;
    }

    public void c(int i4, String str, String str2) {
        if (i4 == 3) {
            Log.d(str, str2);
            return;
        }
        if (i4 == 5) {
            Log.w(str, str2);
        } else if (i4 != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public void d(int i4, String str, String str2) {
        c(i4, "FormalHASDK", str + "=> " + str2);
    }

    public boolean e(int i4) {
        return this.f1132a && i4 >= this.f1133b;
    }
}
