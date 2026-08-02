package g0;

import T.C0097o;
import W.J;
import a.AbstractC0124a;
import androidx.datastore.preferences.protobuf.C0179l;
import java.util.ArrayList;
import java.util.Iterator;
import q0.b0;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class n implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8916a;

    /* renamed from: b, reason: collision with root package name */
    public final s f8917b;

    /* renamed from: c, reason: collision with root package name */
    public int f8918c = -1;

    public n(s sVar, int i4) {
        this.f8917b = sVar;
        this.f8916a = i4;
    }

    @Override // q0.b0
    public final void a() {
        int i4 = this.f8918c;
        s sVar = this.f8917b;
        if (i4 == -2) {
            sVar.k();
            throw new C0179l(AbstractC1514c.a("Unable to bind a sample queue to TrackGroup with MIME type ", sVar.f8942I.a(this.f8916a).f2708d[0].n, "."));
        }
        if (i4 == -1) {
            sVar.G();
        } else if (i4 != -3) {
            sVar.G();
            sVar.v[i4].z();
        }
    }

    public final void b() {
        AbstractC0124a.h(this.f8918c == -1);
        s sVar = this.f8917b;
        sVar.k();
        sVar.f8944K.getClass();
        int[] iArr = sVar.f8944K;
        int i4 = this.f8916a;
        int i5 = iArr[i4];
        if (i5 == -1) {
            if (sVar.f8943J.contains(sVar.f8942I.a(i4))) {
                i5 = -3;
            }
            i5 = -2;
        } else {
            boolean[] zArr = sVar.f8946N;
            if (!zArr[i5]) {
                zArr[i5] = true;
            }
            i5 = -2;
        }
        this.f8918c = i5;
    }

    public final boolean c() {
        int i4 = this.f8918c;
        return (i4 == -1 || i4 == -3 || i4 == -2) ? false : true;
    }

    @Override // q0.b0
    public final boolean isReady() {
        if (this.f8918c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i4 = this.f8918c;
        s sVar = this.f8917b;
        return !sVar.E() && sVar.v[i4].x(sVar.f8952T);
    }

    @Override // q0.b0
    public final int k(long j4) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i4 = this.f8918c;
        s sVar = this.f8917b;
        if (sVar.E()) {
            return 0;
        }
        r rVar = sVar.v[i4];
        int v = rVar.v(j4, sVar.f8952T);
        ArrayList arrayList = sVar.n;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(arrayList.size() - 1);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        k kVar = (k) obj;
        if (kVar != null && !kVar.h()) {
            v = Math.min(v, kVar.g(i4) - rVar.t());
        }
        rVar.H(v);
        return v;
    }

    @Override // q0.b0
    public final int n(l2.e eVar, Z.f fVar, int i4) {
        C0097o c0097o;
        if (this.f8918c == -3) {
            fVar.a(4);
            return -4;
        }
        if (c()) {
            int i5 = this.f8918c;
            s sVar = this.f8917b;
            ArrayList arrayList = sVar.n;
            if (!sVar.E()) {
                int i6 = 0;
                if (!arrayList.isEmpty()) {
                    int i7 = 0;
                    loop0: while (i7 < arrayList.size() - 1) {
                        int i8 = ((k) arrayList.get(i7)).f8874k;
                        int length = sVar.v.length;
                        for (int i9 = 0; i9 < length; i9++) {
                            if (sVar.f8946N[i9] && sVar.v[i9].B() == i8) {
                                break loop0;
                            }
                        }
                        i7++;
                    }
                    J.R(arrayList, 0, i7);
                    k kVar = (k) arrayList.get(0);
                    C0097o c0097o2 = kVar.f15141d;
                    if (!c0097o2.equals(sVar.f8940G)) {
                        sVar.f8967k.b(sVar.f8958b, c0097o2, kVar.f15142e, kVar.f15143f, kVar.f15144g);
                    }
                    sVar.f8940G = c0097o2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).h()) {
                    int C4 = sVar.v[i5].C(eVar, fVar, i4, sVar.f8952T);
                    if (C4 == -5) {
                        C0097o c0097o3 = (C0097o) eVar.f14271c;
                        c0097o3.getClass();
                        if (i5 == sVar.f8935B) {
                            int g4 = O3.d.g(sVar.v[i5].B());
                            while (i6 < arrayList.size() && ((k) arrayList.get(i6)).f8874k != g4) {
                                i6++;
                            }
                            if (i6 < arrayList.size()) {
                                c0097o = ((k) arrayList.get(i6)).f15141d;
                            } else {
                                c0097o = sVar.f8939F;
                                c0097o.getClass();
                            }
                            c0097o3 = c0097o3.d(c0097o);
                        }
                        eVar.f14271c = c0097o3;
                    }
                    return C4;
                }
            }
        }
        return -3;
    }
}
