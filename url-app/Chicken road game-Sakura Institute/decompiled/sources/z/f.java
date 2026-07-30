package z;

import a2.g0;
import a2.h0;
import a2.k0;
import a2.o;
import a2.q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import m2.k;
import r6.l;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f9973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i7) {
        super(1);
        this.f9972g = i7;
        this.f9973h = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0147  */
    @Override // q6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        m2.b bVar;
        h0 h0Var;
        switch (this.f9972g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                List list = (List) obj;
                g gVar = this.f9973h;
                d A0 = gVar.A0();
                k0 e9 = k0.e(gVar.f9975t, u.f10057g, 0L, 0L, null, 0, 0L, 16777214);
                k kVar = A0.f9964o;
                h0 h0Var2 = null;
                if (kVar != null && (bVar = A0.f9958i) != null) {
                    a2.g gVar2 = new a2.g(A0.f9950a, null, 6);
                    if (A0.f9959j != null && A0.f9963n != null) {
                        long a3 = m2.a.a(A0.f9965p, 0, 0, 0, 0, 10);
                        int i7 = A0.f9955f;
                        boolean z8 = A0.f9954e;
                        int i8 = A0.f9953d;
                        f2.d dVar = A0.f9952c;
                        e6.u uVar = e6.u.f2826f;
                        h0Var = new h0(new g0(gVar2, e9, uVar, i7, z8, i8, bVar, kVar, dVar, a3), new o(new q(gVar2, e9, uVar, bVar, dVar), a3, A0.f9955f, A0.f9953d == 2), A0.f9961l);
                        if (h0Var != null) {
                            list.add(h0Var);
                            h0Var2 = h0Var;
                        }
                        break;
                    }
                }
                h0Var = null;
                if (h0Var != null) {
                }
                break;
            case 1:
                String str = ((a2.g) obj).f373f;
                g gVar3 = this.f9973h;
                e eVar = gVar3.C;
                if (eVar == null) {
                    e eVar2 = new e(gVar3.f9974s, str);
                    d dVar2 = new d(str, gVar3.f9975t, gVar3.f9976u, gVar3.f9977v, gVar3.f9978w, gVar3.f9979x, gVar3.f9980y);
                    dVar2.c(gVar3.A0().f9958i);
                    eVar2.f9971d = dVar2;
                    gVar3.C = eVar2;
                } else if (!r6.k.a(str, eVar.f9969b)) {
                    eVar.f9969b = str;
                    d dVar3 = eVar.f9971d;
                    if (dVar3 != null) {
                        k0 k0Var = gVar3.f9975t;
                        f2.d dVar4 = gVar3.f9976u;
                        int i9 = gVar3.f9977v;
                        boolean z9 = gVar3.f9978w;
                        int i10 = gVar3.f9979x;
                        int i11 = gVar3.f9980y;
                        dVar3.f9950a = str;
                        dVar3.f9951b = k0Var;
                        dVar3.f9952c = dVar4;
                        dVar3.f9953d = i9;
                        dVar3.f9954e = z9;
                        dVar3.f9955f = i10;
                        dVar3.f9956g = i11;
                        dVar3.f9959j = null;
                        dVar3.f9963n = null;
                        dVar3.f9964o = null;
                        dVar3.f9966q = -1;
                        dVar3.f9967r = -1;
                        dVar3.f9965p = r4.a.z(0, 0, 0, 0);
                        dVar3.f9961l = j1.c.G(0, 0);
                        dVar3.f9960k = false;
                    }
                }
                r1.f.o(gVar3);
                r1.f.n(gVar3);
                r1.f.m(gVar3);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g gVar4 = this.f9973h;
                e eVar3 = gVar4.C;
                if (eVar3 != null) {
                    eVar3.f9970c = booleanValue;
                    r1.f.o(gVar4);
                    r1.f.n(gVar4);
                    r1.f.m(gVar4);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
