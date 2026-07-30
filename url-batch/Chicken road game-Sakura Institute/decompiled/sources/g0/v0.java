package g0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r6.l f3951h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(q6.c cVar, int i7) {
        super(1);
        this.f3950g = i7;
        switch (i7) {
            case 2:
                this.f3951h = (r6.l) cVar;
                super(1);
                break;
            case 3:
                this.f3951h = (r6.l) cVar;
                super(1);
                break;
            default:
                this.f3951h = (r6.l) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q6.e, r6.l] */
    /* JADX WARN: Type inference failed for: r0v7, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r5v11, types: [q6.c, r6.l] */
    /* JADX WARN: Type inference failed for: r5v2, types: [q6.c, r6.l] */
    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f3950g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.f3951h.f(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                l.j jVar = (l.j) obj;
                ?? r02 = this.f3951h;
                Object value = jVar.f5545e.getValue();
                l.w1 w1Var = l.x1.f5722a;
                r02.d(value, Float.valueOf(((l.m) jVar.f5546f).f5569a));
                return d6.z.f2639a;
            case 2:
                return this.f3951h.f(Long.valueOf(((Number) obj).longValue()));
            default:
                q0.g gVar = (q0.g) this.f3951h.f((q0.l) obj);
                synchronized (q0.n.f7427b) {
                    q0.n.f7428c = q0.n.f7428c.x(gVar.d());
                }
                return gVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v0(q6.e eVar) {
        super(1);
        this.f3950g = 1;
        l.w1 w1Var = l.x1.f5722a;
        this.f3951h = (r6.l) eVar;
    }
}
