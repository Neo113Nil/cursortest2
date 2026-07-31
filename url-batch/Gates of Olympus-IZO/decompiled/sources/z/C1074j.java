package z;

import A2.w;
import B0.C;
import B0.C0007d;
import B0.y;
import B0.z;
import I2.l;
import M1.u;
import a.AbstractC0157a;
import b0.C0288u;
import java.util.List;
import t0.AbstractC0898f;

/* renamed from: z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074j extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1075k f8930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1074j(C1075k c1075k, int i3) {
        super(1);
        this.f8929e = i3;
        this.f8930f = c1075k;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    @Override // Y1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        M0.b bVar;
        z zVar;
        z zVar2;
        switch (this.f8929e) {
            case 0:
                List list = (List) obj;
                C1075k c1075k = this.f8930f;
                C1069e v0 = c1075k.v0();
                C c3 = c1075k.f8933r;
                A2.g gVar = c1075k.f8939x;
                C d3 = C.d(c3, gVar != null ? gVar.o() : C0288u.f4296f, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                M0.j jVar = v0.f8905o;
                if (jVar != null && (bVar = v0.f8899i) != null) {
                    C0007d c0007d = new C0007d(v0.f8891a, null, null, null);
                    if (v0.f8900j != null && v0.f8904n != null) {
                        long a3 = M0.a.a(v0.p, 0, 0, 0, 0, 10);
                        u uVar = u.f2803d;
                        int i3 = v0.f8896f;
                        boolean z3 = v0.f8895e;
                        int i4 = v0.f8894d;
                        F0.e eVar = v0.f8893c;
                        zVar = new z(new y(c0007d, d3, uVar, i3, z3, i4, bVar, jVar, eVar, a3), new B0.j(new w(c0007d, d3, uVar, bVar, eVar), a3, v0.f8896f, AbstractC0157a.y(v0.f8894d, 2)), v0.f8902l);
                        if (zVar == null) {
                            list.add(zVar);
                            zVar2 = zVar;
                        } else {
                            zVar2 = null;
                        }
                        break;
                    }
                }
                zVar = null;
                if (zVar == null) {
                }
                break;
            case 1:
                String str = ((C0007d) obj).f251a;
                C1075k c1075k2 = this.f8930f;
                C1073i c1073i = c1075k2.B;
                if (c1073i == null) {
                    C1073i c1073i2 = new C1073i(c1075k2.f8932q, str);
                    C1069e c1069e = new C1069e(str, c1075k2.f8933r, c1075k2.f8934s, c1075k2.f8935t, c1075k2.f8936u, c1075k2.f8937v, c1075k2.f8938w);
                    c1069e.a(c1075k2.v0().f8899i);
                    c1073i2.f8928d = c1069e;
                    c1075k2.B = c1073i2;
                } else if (!Z1.i.a(str, c1073i.f8926b)) {
                    c1073i.f8926b = str;
                    C1069e c1069e2 = c1073i.f8928d;
                    if (c1069e2 != null) {
                        C c4 = c1075k2.f8933r;
                        F0.e eVar2 = c1075k2.f8934s;
                        int i5 = c1075k2.f8935t;
                        boolean z4 = c1075k2.f8936u;
                        int i6 = c1075k2.f8937v;
                        int i7 = c1075k2.f8938w;
                        c1069e2.f8891a = str;
                        c1069e2.f8892b = c4;
                        c1069e2.f8893c = eVar2;
                        c1069e2.f8894d = i5;
                        c1069e2.f8895e = z4;
                        c1069e2.f8896f = i6;
                        c1069e2.f8897g = i7;
                        c1069e2.f8900j = null;
                        c1069e2.f8904n = null;
                        c1069e2.f8905o = null;
                        c1069e2.p = l.s(0, 0, 0, 0);
                        c1069e2.f8902l = l.e(0, 0);
                        c1069e2.f8901k = false;
                        L1.z zVar3 = L1.z.f2729a;
                    }
                }
                AbstractC0898f.o(c1075k2);
                AbstractC0898f.n(c1075k2);
                AbstractC0898f.m(c1075k2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C1075k c1075k3 = this.f8930f;
                C1073i c1073i3 = c1075k3.B;
                if (c1073i3 != null) {
                    c1073i3.f8927c = booleanValue;
                    AbstractC0898f.o(c1075k3);
                    AbstractC0898f.n(c1075k3);
                    AbstractC0898f.m(c1075k3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
