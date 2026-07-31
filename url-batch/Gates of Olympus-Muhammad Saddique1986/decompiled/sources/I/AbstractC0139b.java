package I;

import android.os.Looper;

/* renamed from: I.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0139b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2791a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2792b = 0;

    static {
        long j3;
        R1.a.d(C0137a.f2788f);
        try {
            j3 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j3 = -1;
        }
        f2791a = j3;
    }
}
