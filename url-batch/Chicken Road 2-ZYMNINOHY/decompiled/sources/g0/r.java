package g0;

import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.D;
import T.E;
import java.util.Map;
import q0.a0;

/* loaded from: classes.dex */
public final class r extends a0 {

    /* renamed from: H, reason: collision with root package name */
    public final Map f8931H;

    /* renamed from: I, reason: collision with root package name */
    public C0094l f8932I;

    public r(B1.j jVar, f0.i iVar, f0.e eVar, Map map) {
        super(jVar, iVar, eVar);
        this.f8931H = map;
    }

    @Override // q0.a0
    public final C0097o p(C0097o c0097o) {
        C0094l c0094l;
        C0094l c0094l2 = this.f8932I;
        if (c0094l2 == null) {
            c0094l2 = c0097o.f2871r;
        }
        if (c0094l2 != null && (c0094l = (C0094l) this.f8931H.get(c0094l2.f2803c)) != null) {
            c0094l2 = c0094l;
        }
        E e4 = c0097o.f2867l;
        E e5 = null;
        if (e4 != null) {
            D[] dArr = e4.f2655a;
            int length = dArr.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                }
                D d4 = dArr[i5];
                if ((d4 instanceof M0.m) && "com.apple.streaming.transportStreamTimestamp".equals(((M0.m) d4).f1731b)) {
                    break;
                }
                i5++;
            }
            if (i5 != -1) {
                if (length != 1) {
                    D[] dArr2 = new D[length - 1];
                    while (i4 < length) {
                        if (i4 != i5) {
                            dArr2[i4 < i5 ? i4 : i4 - 1] = dArr[i4];
                        }
                        i4++;
                    }
                    e5 = new E(dArr2);
                }
            }
            if (c0094l2 == c0097o.f2871r || e4 != c0097o.f2867l) {
                C0096n a3 = c0097o.a();
                a3.f2833q = c0094l2;
                a3.f2829k = e4;
                c0097o = new C0097o(a3);
            }
            return super.p(c0097o);
        }
        e4 = e5;
        if (c0094l2 == c0097o.f2871r) {
        }
        C0096n a32 = c0097o.a();
        a32.f2833q = c0094l2;
        a32.f2829k = e4;
        c0097o = new C0097o(a32);
        return super.p(c0097o);
    }
}
