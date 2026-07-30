package d0;

import android.graphics.Path;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2165j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2166k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2168m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        super(1);
        this.f2162g = i7;
        this.f2163h = obj;
        this.f2164i = obj2;
        this.f2165j = obj3;
        this.f2166k = obj4;
        this.f2167l = obj5;
        this.f2168m = obj6;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        float f9;
        switch (this.f2162g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b1.e eVar = (b1.e) obj;
                float floor = (float) Math.floor(eVar.y(p0.f2270c));
                long j8 = ((z0.u) ((g0.m2) this.f2163h).getValue()).f10059a;
                long j9 = ((z0.u) ((g0.m2) this.f2164i).getValue()).f10059a;
                float y4 = eVar.y(p0.f2271d);
                float f10 = floor / 2.0f;
                b1.i iVar = new b1.i(floor, 0.0f, 0, 0, 30);
                float d8 = y0.f.d(eVar.d());
                boolean c4 = z0.u.c(j8, j9);
                b1.h hVar = b1.h.f1238a;
                if (c4) {
                    b1.e.s(eVar, j8, 0L, v0.d.a(d8, d8), v1.g.a(y4, y4), hVar, 226);
                    f9 = floor;
                } else {
                    long a3 = u3.r.a(floor, floor);
                    float f11 = d8 - (2 * floor);
                    long a9 = v0.d.a(f11, f11);
                    float max = Math.max(0.0f, y4 - floor);
                    f9 = floor;
                    b1.e.s(eVar, j8, a3, a9, v1.g.a(max, max), hVar, 224);
                    long a10 = u3.r.a(f10, f10);
                    float f12 = d8 - f9;
                    long a11 = v0.d.a(f12, f12);
                    float f13 = y4 - f10;
                    b1.e.s(eVar, j9, a10, a11, v1.g.a(f13, f13), iVar, 224);
                }
                long j10 = ((z0.u) ((g0.m2) this.f2165j).getValue()).f10059a;
                float floatValue = ((Number) ((g0.m2) this.f2166k).getValue()).floatValue();
                float floatValue2 = ((Number) ((g0.m2) this.f2167l).getValue()).floatValue();
                i0 i0Var = (i0) this.f2168m;
                b1.i iVar2 = new b1.i(f9, 0.0f, 2, 0, 26);
                float d9 = y0.f.d(eVar.d());
                float D = a8.m.D(0.4f, 0.5f, floatValue2);
                float D2 = a8.m.D(0.7f, 0.5f, floatValue2);
                float D3 = a8.m.D(0.5f, 0.5f, floatValue2);
                float D4 = a8.m.D(0.3f, 0.5f, floatValue2);
                z0.j jVar = i0Var.f2032a;
                z0.j jVar2 = i0Var.f2034c;
                jVar.d();
                z0.j jVar3 = i0Var.f2032a;
                Path path = jVar3.f10002a;
                Path path2 = jVar3.f10002a;
                path.moveTo(0.2f * d9, D3 * d9);
                path2.lineTo(D * d9, D2 * d9);
                path2.lineTo(0.8f * d9, d9 * D4);
                z0.k kVar = i0Var.f2033b;
                kVar.f10005a.setPath(jVar3 != null ? jVar3.f10002a : null, false);
                jVar2.d();
                kVar.a(0.0f, kVar.f10005a.getLength() * floatValue, jVar2);
                eVar.Y(jVar2, j10, iVar2);
                break;
            default:
                p1.m0 m0Var = (p1.m0) obj;
                p1.n0[] n0VarArr = (p1.n0[]) this.f2163h;
                List list = (List) this.f2164i;
                p1.h0 h0Var = (p1.h0) this.f2165j;
                r6.t tVar = (r6.t) this.f2166k;
                r6.t tVar2 = (r6.t) this.f2167l;
                q.p pVar = (q.p) this.f2168m;
                int length = n0VarArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i8 < length) {
                    p1.n0 n0Var = n0VarArr[i8];
                    r6.k.d(n0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    q.n.b(m0Var, n0Var, (p1.e0) list.get(i7), h0Var.getLayoutDirection(), tVar.f7966f, tVar2.f7966f, pVar.f7325a);
                    i8++;
                    i7++;
                }
                break;
        }
        return d6.z.f2639a;
    }
}
