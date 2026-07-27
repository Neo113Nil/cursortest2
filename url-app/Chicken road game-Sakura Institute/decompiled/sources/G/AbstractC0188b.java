package G;

import android.os.Looper;
import y2.C1336k;

/* renamed from: G.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0188b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2788a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2789b = 0;

    static {
        long j4;
        C1336k.a(C0186a.f2785e);
        try {
            j4 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j4 = -1;
        }
        f2788a = j4;
    }
}
