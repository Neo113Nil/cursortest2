package I;

import e2.AbstractC0381e;
import j.C0503u;
import j.C0506x;

/* renamed from: I.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117r0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2342h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0117r0(int i3, int i4, Object obj, Object obj2) {
        super(1);
        this.f2339e = i4;
        this.f2341g = obj;
        this.f2340f = i3;
        this.f2342h = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    @Override // Y1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        InterfaceC0115q interfaceC0115q;
        InterfaceC0115q interfaceC0115q2;
        int i3;
        switch (this.f2339e) {
            case 0:
                InterfaceC0115q interfaceC0115q3 = (InterfaceC0115q) obj;
                C0119s0 c0119s0 = (C0119s0) this.f2341g;
                int i4 = c0119s0.f2348e;
                int i5 = this.f2340f;
                if (i4 == i5) {
                    C0503u c0503u = c0119s0.f2349f;
                    C0503u c0503u2 = (C0503u) this.f2342h;
                    if (Z1.i.a(c0503u2, c0503u) && (interfaceC0115q3 instanceof C0122u)) {
                        long[] jArr = c0503u2.f5212a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j3 = jArr[i6];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((255 & j3) < 128) {
                                            int i10 = (i6 << 3) + i9;
                                            Object obj2 = c0503u2.f5213b[i10];
                                            boolean z3 = c0503u2.f5214c[i10] != i5;
                                            if (z3) {
                                                C0122u c0122u = (C0122u) interfaceC0115q3;
                                                c0122u.f2373j.q(obj2, c0119s0);
                                                if (obj2 instanceof G) {
                                                    G g3 = (G) obj2;
                                                    interfaceC0115q2 = interfaceC0115q3;
                                                    if (!((C0506x) c0122u.f2373j.f83b).b(g3)) {
                                                        c0122u.f2376m.r(g3);
                                                    }
                                                    C0506x c0506x = c0119s0.f2350g;
                                                    if (c0506x != null) {
                                                        c0506x.g(obj2);
                                                    }
                                                    if (z3) {
                                                        c0503u2.e(i10);
                                                    }
                                                    i3 = 8;
                                                }
                                            }
                                            interfaceC0115q2 = interfaceC0115q3;
                                            if (z3) {
                                            }
                                            i3 = 8;
                                        } else {
                                            interfaceC0115q2 = interfaceC0115q3;
                                            i3 = i7;
                                        }
                                        j3 >>= i3;
                                        i9++;
                                        i7 = i3;
                                        interfaceC0115q3 = interfaceC0115q2;
                                    }
                                    interfaceC0115q = interfaceC0115q3;
                                    if (i8 != i7) {
                                    }
                                } else {
                                    interfaceC0115q = interfaceC0115q3;
                                }
                                if (i6 != length) {
                                    i6++;
                                    interfaceC0115q3 = interfaceC0115q;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                r0.G g4 = (r0.G) obj;
                n.l0 l0Var = (n.l0) this.f2341g;
                int g5 = l0Var.f6117q.f6106a.g();
                int i11 = this.f2340f;
                int r3 = AbstractC0381e.r(g5, 0, i11);
                int i12 = l0Var.f6118r ? r3 - i11 : -r3;
                boolean z4 = l0Var.f6119s;
                int i13 = z4 ? 0 : i12;
                if (!z4) {
                    i12 = 0;
                }
                r0.H h3 = (r0.H) this.f2342h;
                g4.f7113a = true;
                r0.G.g(g4, h3, i13, i12);
                g4.f7113a = false;
                break;
        }
        return L1.z.f2729a;
    }
}
