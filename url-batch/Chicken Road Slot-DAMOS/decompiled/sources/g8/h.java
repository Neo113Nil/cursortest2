package g8;

import com.google.android.gms.internal.measurement.se;
import ge.a0;
import java.util.concurrent.Executor;
import l8.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements l8.e {

    /* renamed from: e, reason: collision with root package name */
    public static final h f4308e = new h(0);

    /* renamed from: i, reason: collision with root package name */
    public static final h f4309i = new h(1);

    /* renamed from: r, reason: collision with root package name */
    public static final h f4310r = new h(2);

    /* renamed from: s, reason: collision with root package name */
    public static final h f4311s = new h(3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4312d;

    public /* synthetic */ h(int i3) {
        this.f4312d = i3;
    }

    @Override // l8.e
    public final Object b(se seVar) {
        switch (this.f4312d) {
            case 0:
                Object d10 = seVar.d(new r(k8.a.class, Executor.class));
                d10.getClass();
                return a0.k((Executor) d10);
            case 1:
                Object d11 = seVar.d(new r(k8.c.class, Executor.class));
                d11.getClass();
                return a0.k((Executor) d11);
            case 2:
                Object d12 = seVar.d(new r(k8.b.class, Executor.class));
                d12.getClass();
                return a0.k((Executor) d12);
            default:
                Object d13 = seVar.d(new r(k8.d.class, Executor.class));
                d13.getClass();
                return a0.k((Executor) d13);
        }
    }
}
