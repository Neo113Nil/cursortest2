package z;

import A0.C0036g;
import A0.H;
import A0.I;
import A0.L;
import A0.o;
import A0.q;
import M2.p;
import Z.C0323u;
import Z.InterfaceC0324v;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import u3.l;
import z2.C1405I;

/* renamed from: z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1355j extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1356k f11766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1355j(C1356k c1356k, int i2) {
        super(1);
        this.f11765d = i2;
        this.f11766e = c1356k;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        M0.b bVar;
        I i2;
        I i4;
        switch (this.f11765d) {
            case 0:
                List list = (List) obj;
                C1356k c1356k = this.f11766e;
                C1350e B02 = c1356k.B0();
                L l4 = c1356k.f11772u;
                InterfaceC0324v interfaceC0324v = c1356k.f11767A;
                L e4 = L.e(l4, interfaceC0324v != null ? interfaceC0324v.a() : C0323u.f4547g, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
                M0.k kVar = B02.f11736o;
                if (kVar != null && (bVar = B02.f11730i) != null) {
                    C0036g c0036g = new C0036g(B02.f11722a, null, 6);
                    if (B02.f11731j != null && B02.f11735n != null) {
                        long b4 = M0.a.b(B02.f11737p, 0, 0, 0, 0, 10);
                        C1405I c1405i = C1405I.f11931d;
                        int i5 = B02.f11727f;
                        boolean z4 = B02.f11726e;
                        int i6 = B02.f11725d;
                        F0.d dVar = B02.f11724c;
                        i2 = new I(new H(c0036g, e4, c1405i, i5, z4, i6, bVar, kVar, dVar, b4), new o(new q(c0036g, e4, c1405i, bVar, dVar), b4, B02.f11727f, l.b0(B02.f11725d, 2)), B02.f11733l);
                        if (i2 == null) {
                            list.add(i2);
                            i4 = i2;
                        } else {
                            i4 = null;
                        }
                        break;
                    }
                }
                i2 = null;
                if (i2 == null) {
                }
                break;
            case 1:
                String str = ((C0036g) obj).f328a;
                C1356k c1356k2 = this.f11766e;
                C1354i c1354i = c1356k2.f11770E;
                if (c1354i == null) {
                    C1354i c1354i2 = new C1354i(c1356k2.f11771t, str);
                    C1350e c1350e = new C1350e(str, c1356k2.f11772u, c1356k2.f11773v, c1356k2.f11774w, c1356k2.f11775x, c1356k2.f11776y, c1356k2.f11777z);
                    c1350e.c(c1356k2.B0().f11730i);
                    c1354i2.f11764d = c1350e;
                    c1356k2.f11770E = c1354i2;
                } else if (!Intrinsics.a(str, c1354i.f11762b)) {
                    c1354i.f11762b = str;
                    C1350e c1350e2 = c1354i.f11764d;
                    if (c1350e2 != null) {
                        L l5 = c1356k2.f11772u;
                        F0.d dVar2 = c1356k2.f11773v;
                        int i7 = c1356k2.f11774w;
                        boolean z5 = c1356k2.f11775x;
                        int i8 = c1356k2.f11776y;
                        int i9 = c1356k2.f11777z;
                        c1350e2.f11722a = str;
                        c1350e2.f11723b = l5;
                        c1350e2.f11724c = dVar2;
                        c1350e2.f11725d = i7;
                        c1350e2.f11726e = z5;
                        c1350e2.f11727f = i8;
                        c1350e2.f11728g = i9;
                        c1350e2.f11731j = null;
                        c1350e2.f11735n = null;
                        c1350e2.f11736o = null;
                        c1350e2.f11738q = -1;
                        c1350e2.f11739r = -1;
                        c1350e2.f11737p = u3.d.t(0, 0, 0, 0);
                        c1350e2.f11733l = u3.d.c(0, 0);
                        c1350e2.f11732k = false;
                        Unit unit = Unit.f7487a;
                    }
                }
                AbstractC1065f.p(c1356k2);
                AbstractC1065f.o(c1356k2);
                AbstractC1065f.n(c1356k2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C1356k c1356k3 = this.f11766e;
                C1354i c1354i3 = c1356k3.f11770E;
                if (c1354i3 != null) {
                    c1354i3.f11763c = booleanValue;
                    AbstractC1065f.p(c1356k3);
                    AbstractC1065f.o(c1356k3);
                    AbstractC1065f.n(c1356k3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
