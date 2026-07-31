package I;

import android.os.Looper;

/* renamed from: I.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0085b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2234a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2235b = 0;

    static {
        long j3;
        I2.d.F(C0083a.f2231f);
        try {
            j3 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j3 = -1;
        }
        f2234a = j3;
    }
}
