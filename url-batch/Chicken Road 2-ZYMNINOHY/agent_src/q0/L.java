package q0;

import T.C0101t;
import T.C0102u;
import T.C0103v;
import T.C0105x;
import T.C0107z;
import a0.C0144j;
import androidx.datastore.preferences.protobuf.C0179l;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import v2.C1474v;

/* loaded from: classes.dex */
public final class L extends AbstractC1370l {

    /* renamed from: s, reason: collision with root package name */
    public static final C0107z f14846s;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1359a[] f14847k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f14848l;

    /* renamed from: m, reason: collision with root package name */
    public final T.T[] f14849m;
    public final ArrayList n;
    public final C0144j o;

    /* renamed from: p, reason: collision with root package name */
    public int f14850p;

    /* renamed from: q, reason: collision with root package name */
    public long[][] f14851q;

    /* renamed from: r, reason: collision with root package name */
    public C0179l f14852r;

    static {
        T.r rVar = new T.r();
        v2.G g4 = v2.I.f15571b;
        v2.a0 a0Var = v2.a0.f15605e;
        List list = Collections.EMPTY_LIST;
        v2.a0 a0Var2 = v2.a0.f15605e;
        C0102u c0102u = new C0102u();
        f14846s = new C0107z("MergingMediaSource", new C0101t(rVar), null, new C0103v(c0102u), T.C.f2631B, C0105x.f2898a);
    }

    public L(AbstractC1359a... abstractC1359aArr) {
        C0144j c0144j = new C0144j(28, false);
        this.f14847k = abstractC1359aArr;
        this.o = c0144j;
        this.n = new ArrayList(Arrays.asList(abstractC1359aArr));
        this.f14850p = -1;
        this.f14848l = new ArrayList(abstractC1359aArr.length);
        for (int i4 = 0; i4 < abstractC1359aArr.length; i4++) {
            this.f14848l.add(new ArrayList());
        }
        this.f14849m = new T.T[abstractC1359aArr.length];
        this.f14851q = new long[0][];
        new HashMap();
        v2.r.d(8, "expectedKeys");
        v2.r.d(2, "expectedValuesPerKey");
        new v2.W(C1474v.b(8)).f15596f = new v2.V();
    }

    @Override // q0.AbstractC1370l
    public final void A(Object obj, AbstractC1359a abstractC1359a, T.T t4) {
        Integer num = (Integer) obj;
        if (this.f14852r != null) {
            return;
        }
        if (this.f14850p == -1) {
            this.f14850p = t4.h();
        } else if (t4.h() != this.f14850p) {
            this.f14852r = new C0179l();
            return;
        }
        int length = this.f14851q.length;
        T.T[] tArr = this.f14849m;
        if (length == 0) {
            this.f14851q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f14850p, tArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(abstractC1359a);
        tArr[num.intValue()] = t4;
        if (arrayList.isEmpty()) {
            q(tArr[0]);
        }
    }

    @Override // q0.AbstractC1359a
    public final InterfaceC1383z b(C1353B c1353b, B1.j jVar, long j4) {
        AbstractC1359a[] abstractC1359aArr = this.f14847k;
        int length = abstractC1359aArr.length;
        InterfaceC1383z[] interfaceC1383zArr = new InterfaceC1383z[length];
        T.T[] tArr = this.f14849m;
        int b4 = tArr[0].b(c1353b.f14812a);
        for (int i4 = 0; i4 < length; i4++) {
            C1353B a3 = c1353b.a(tArr[i4].l(b4));
            interfaceC1383zArr[i4] = abstractC1359aArr[i4].b(a3, jVar, j4 - this.f14851q[b4][i4]);
            ((List) this.f14848l.get(i4)).add(new K(a3, interfaceC1383zArr[i4]));
        }
        return new J(this.o, this.f14851q[b4], interfaceC1383zArr);
    }

    @Override // q0.AbstractC1359a
    public final C0107z i() {
        AbstractC1359a[] abstractC1359aArr = this.f14847k;
        return abstractC1359aArr.length > 0 ? abstractC1359aArr[0].i() : f14846s;
    }

    @Override // q0.AbstractC1370l, q0.AbstractC1359a
    public final void k() {
        C0179l c0179l = this.f14852r;
        if (c0179l != null) {
            throw c0179l;
        }
        super.k();
    }

    @Override // q0.AbstractC1359a
    public final void n(Y.A a3) {
        this.f15043j = a3;
        this.f15042i = W.J.o(null);
        int i4 = 0;
        while (true) {
            AbstractC1359a[] abstractC1359aArr = this.f14847k;
            if (i4 >= abstractC1359aArr.length) {
                return;
            }
            B(Integer.valueOf(i4), abstractC1359aArr[i4]);
            i4++;
        }
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        J j4 = (J) interfaceC1383z;
        int i4 = 0;
        while (true) {
            AbstractC1359a[] abstractC1359aArr = this.f14847k;
            if (i4 >= abstractC1359aArr.length) {
                return;
            }
            List list = (List) this.f14848l.get(i4);
            InterfaceC1383z[] interfaceC1383zArr = j4.f14834a;
            boolean[] zArr = j4.f14835b;
            InterfaceC1383z interfaceC1383z2 = zArr[i4] ? ((h0) interfaceC1383zArr[i4]).f15023a : interfaceC1383zArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                if (((K) list.get(i5)).f14845b.equals(interfaceC1383z2)) {
                    list.remove(i5);
                    break;
                }
                i5++;
            }
            AbstractC1359a abstractC1359a = abstractC1359aArr[i4];
            InterfaceC1383z[] interfaceC1383zArr2 = j4.f14834a;
            abstractC1359a.r(zArr[i4] ? ((h0) interfaceC1383zArr2[i4]).f15023a : interfaceC1383zArr2[i4]);
            i4++;
        }
    }

    @Override // q0.AbstractC1370l, q0.AbstractC1359a
    public final void t() {
        super.t();
        Arrays.fill(this.f14849m, (Object) null);
        this.f14850p = -1;
        this.f14852r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f14847k);
    }

    @Override // q0.AbstractC1359a
    public final void w(C0107z c0107z) {
        this.f14847k[0].w(c0107z);
    }

    @Override // q0.AbstractC1370l
    public final C1353B x(Object obj, C1353B c1353b) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f14848l;
        List list = (List) arrayList.get(intValue);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (((K) list.get(i4)).f14844a.equals(c1353b)) {
                return ((K) ((List) arrayList.get(0)).get(i4)).f14844a;
            }
        }
        return null;
    }
}
