package g7;

import c7.x0;
import com.android.installreferrer.api.InstallReferrerClient;
import w.g0;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4499h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4501j;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4497f = i7;
        this.f4498g = obj;
        this.f4499h = obj2;
        this.f4500i = obj3;
        this.f4501j = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    @Override // f7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, h6.d dVar) {
        i iVar;
        int i7;
        j jVar;
        switch (this.f4497f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (dVar instanceof i) {
                    iVar = (i) dVar;
                    int i8 = iVar.f4496j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        iVar.f4496j = i8 - Integer.MIN_VALUE;
                        Object obj2 = iVar.f4494h;
                        i7 = iVar.f4496j;
                        if (i7 != 0) {
                            d6.a.e(obj2);
                            x0 x0Var = (x0) ((r6.v) this.f4498g).f7968f;
                            if (x0Var != null) {
                                x0Var.c(new l("Child of the scoped flow was cancelled"));
                                iVar.f4492f = this;
                                iVar.f4493g = obj;
                                iVar.f4496j = 1;
                                Object N = x0Var.N(iVar);
                                i6.a aVar = i6.a.f4956f;
                                if (N == aVar) {
                                    return aVar;
                                }
                            }
                            jVar = this;
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = iVar.f4493g;
                            jVar = iVar.f4492f;
                            d6.a.e(obj2);
                        }
                        ((r6.v) jVar.f4498g).f7968f = c7.a0.p((c7.x) jVar.f4499h, null, c7.y.f1759i, new h((k) jVar.f4500i, (f7.g) jVar.f4501j, obj, null), 1);
                        return d6.z.f2639a;
                    }
                }
                iVar = new i(this, dVar);
                Object obj22 = iVar.f4494h;
                i7 = iVar.f4496j;
                if (i7 != 0) {
                }
                ((r6.v) jVar.f4498g).f7968f = c7.a0.p((c7.x) jVar.f4499h, null, c7.y.f1759i, new h((k) jVar.f4500i, (f7.g) jVar.f4501j, obj, null), 1);
                return d6.z.f2639a;
            case 1:
                p.h hVar = (p.h) obj;
                r6.t tVar = (r6.t) this.f4500i;
                r6.t tVar2 = (r6.t) this.f4499h;
                r6.t tVar3 = (r6.t) this.f4498g;
                boolean z8 = true;
                if (hVar instanceof p.l) {
                    tVar3.f7966f++;
                } else if (hVar instanceof p.m) {
                    tVar3.f7966f--;
                } else if (hVar instanceof p.k) {
                    tVar3.f7966f--;
                } else if (hVar instanceof p.f) {
                    tVar2.f7966f++;
                } else if (hVar instanceof p.g) {
                    tVar2.f7966f--;
                } else if (hVar instanceof p.d) {
                    tVar.f7966f++;
                } else if (hVar instanceof p.e) {
                    tVar.f7966f--;
                }
                int i9 = tVar3.f7966f;
                boolean z9 = false;
                boolean z10 = i9 > 0;
                boolean z11 = tVar2.f7966f > 0;
                boolean z12 = tVar.f7966f > 0;
                m.t tVar4 = (m.t) this.f4501j;
                if (tVar4.f6257t != z10) {
                    tVar4.f6257t = z10;
                    z9 = true;
                }
                if (tVar4.f6258u != z11) {
                    tVar4.f6258u = z11;
                    z9 = true;
                }
                if (tVar4.f6259v != z12) {
                    tVar4.f6259v = z12;
                } else {
                    z8 = z9;
                }
                if (z8) {
                    r1.f.m(tVar4);
                }
                return d6.z.f2639a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a0.x0 x0Var2 = (a0.x0) this.f4500i;
                j0 j0Var = (j0) this.f4498g;
                if (booleanValue && j0Var.b()) {
                    g0.j((g2.x) this.f4499h, j0Var, x0Var2.j(), (g2.m) this.f4501j, x0Var2.f176b);
                } else {
                    g0.g(j0Var);
                }
                return d6.z.f2639a;
        }
    }
}
