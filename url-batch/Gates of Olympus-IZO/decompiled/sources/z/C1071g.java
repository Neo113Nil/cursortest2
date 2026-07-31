package z;

import B0.C;
import B0.C0007d;
import B0.y;
import B0.z;
import b0.C0288u;
import java.util.List;
import t0.AbstractC0898f;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071g extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1072h f8911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1071g(C1072h c1072h, int i3) {
        super(1);
        this.f8910e = i3;
        this.f8911f = c1072h;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        z zVar;
        switch (this.f8910e) {
            case 0:
                List list = (List) obj;
                C1072h c1072h = this.f8911f;
                z zVar2 = c1072h.v0().f8890n;
                if (zVar2 != null) {
                    y yVar = zVar2.f394a;
                    C0007d c0007d = yVar.f384a;
                    C c3 = c1072h.f8916r;
                    A2.g gVar = c1072h.f8912A;
                    zVar = new z(new y(c0007d, C.d(c3, gVar != null ? gVar.o() : C0288u.f4296f, 0L, null, null, null, 0L, null, 0, 0L, 16777214), yVar.f386c, yVar.f387d, yVar.f388e, yVar.f389f, yVar.f390g, yVar.f391h, yVar.f392i, yVar.f393j), zVar2.f395b, zVar2.f396c);
                    list.add(zVar);
                } else {
                    zVar = null;
                }
                break;
            case 1:
                C0007d c0007d2 = (C0007d) obj;
                C1072h c1072h2 = this.f8911f;
                C1070f c1070f = c1072h2.f8914F;
                if (c1070f == null) {
                    C1070f c1070f2 = new C1070f(c1072h2.f8915q, c0007d2);
                    C1068d c1068d = new C1068d(c0007d2, c1072h2.f8916r, c1072h2.f8917s, c1072h2.f8919u, c1072h2.f8920v, c1072h2.f8921w, c1072h2.f8922x, c1072h2.f8923y);
                    c1068d.a(c1072h2.v0().f8887k);
                    c1070f2.f8909d = c1068d;
                    c1072h2.f8914F = c1070f2;
                } else if (!Z1.i.a(c0007d2, c1070f.f8907b)) {
                    c1070f.f8907b = c0007d2;
                    C1068d c1068d2 = c1070f.f8909d;
                    if (c1068d2 != null) {
                        C c4 = c1072h2.f8916r;
                        F0.e eVar = c1072h2.f8917s;
                        int i3 = c1072h2.f8919u;
                        boolean z3 = c1072h2.f8920v;
                        int i4 = c1072h2.f8921w;
                        int i5 = c1072h2.f8922x;
                        List list2 = c1072h2.f8923y;
                        c1068d2.f8877a = c0007d2;
                        c1068d2.f8878b = c4;
                        c1068d2.f8879c = eVar;
                        c1068d2.f8880d = i3;
                        c1068d2.f8881e = z3;
                        c1068d2.f8882f = i4;
                        c1068d2.f8883g = i5;
                        c1068d2.f8884h = list2;
                        c1068d2.f8888l = null;
                        c1068d2.f8890n = null;
                        L1.z zVar3 = L1.z.f2729a;
                    }
                }
                AbstractC0898f.o(c1072h2);
                AbstractC0898f.n(c1072h2);
                AbstractC0898f.m(c1072h2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C1072h c1072h3 = this.f8911f;
                C1070f c1070f3 = c1072h3.f8914F;
                if (c1070f3 != null) {
                    Y1.c cVar = c1072h3.B;
                    if (cVar != null) {
                        cVar.j(c1070f3);
                    }
                    C1070f c1070f4 = c1072h3.f8914F;
                    if (c1070f4 != null) {
                        c1070f4.f8908c = booleanValue;
                    }
                    AbstractC0898f.o(c1072h3);
                    AbstractC0898f.n(c1072h3);
                    AbstractC0898f.m(c1072h3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
