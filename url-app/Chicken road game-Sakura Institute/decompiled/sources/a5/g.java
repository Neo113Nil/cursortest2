package a5;

import c7.s0;
import com.android.installreferrer.api.InstallReferrerClient;
import e5.t;
import e5.v;
import java.util.concurrent.Executor;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements e5.f {

    /* renamed from: b, reason: collision with root package name */
    public static final g f507b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f508c = new g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final g f509d = new g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final g f510e = new g(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f511a;

    public /* synthetic */ g(int i7) {
        this.f511a = i7;
    }

    @Override // e5.f
    public final Object b(v vVar) {
        switch (this.f511a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object d8 = vVar.d(new t(b5.a.class, Executor.class));
                k.e(d8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d8);
            case 1:
                Object d9 = vVar.d(new t(b5.c.class, Executor.class));
                k.e(d9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d9);
            case 2:
                Object d10 = vVar.d(new t(b5.b.class, Executor.class));
                k.e(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d10);
            default:
                Object d11 = vVar.d(new t(b5.d.class, Executor.class));
                k.e(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new s0((Executor) d11);
        }
    }
}
