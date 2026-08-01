package k1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends n {
    public ArrayList F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;

    @Override // k1.n
    public final void A(long j2) {
        ArrayList arrayList;
        this.h = j2;
        if (j2 < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n) this.F.get(i)).A(j2);
        }
    }

    @Override // k1.n
    public final void B(b4.d dVar) {
        this.J |= 8;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((n) this.F.get(i)).B(dVar);
        }
    }

    @Override // k1.n
    public final void C(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((n) this.F.get(i)).C(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    @Override // k1.n
    public final void D(o2.f fVar) {
        super.D(fVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                ((n) this.F.get(i)).D(fVar);
            }
        }
    }

    @Override // k1.n
    public final void E() {
        this.J |= 2;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((n) this.F.get(i)).E();
        }
    }

    @Override // k1.n
    public final void F(long j2) {
        this.f2348g = j2;
    }

    @Override // k1.n
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.F.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H);
            sb.append("\n");
            sb.append(((n) this.F.get(i)).H(str + "  "));
            H = sb.toString();
        }
        return H;
    }

    public final void I(n nVar) {
        this.F.add(nVar);
        nVar.f2353n = this;
        long j2 = this.h;
        if (j2 >= 0) {
            nVar.A(j2);
        }
        if ((this.J & 1) != 0) {
            nVar.C(this.i);
        }
        if ((this.J & 2) != 0) {
            nVar.E();
        }
        if ((this.J & 4) != 0) {
            nVar.D(this.A);
        }
        if ((this.J & 8) != 0) {
            nVar.B(null);
        }
    }

    @Override // k1.n
    public final void c() {
        super.c();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((n) this.F.get(i)).c();
        }
    }

    @Override // k1.n
    public final void d(v vVar) {
        View view = vVar.f2377b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                n nVar = (n) obj;
                if (nVar.t(view)) {
                    nVar.d(vVar);
                    vVar.f2378c.add(nVar);
                }
            }
        }
    }

    @Override // k1.n
    public final void f(v vVar) {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((n) this.F.get(i)).f(vVar);
        }
    }

    @Override // k1.n
    public final void g(v vVar) {
        View view = vVar.f2377b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                n nVar = (n) obj;
                if (nVar.t(view)) {
                    nVar.g(vVar);
                    vVar.f2378c.add(nVar);
                }
            }
        }
    }

    @Override // k1.n
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        a aVar = (a) super.clone();
        aVar.F = new ArrayList();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            n clone = ((n) this.F.get(i)).clone();
            aVar.F.add(clone);
            clone.f2353n = aVar;
        }
        return aVar;
    }

    @Override // k1.n
    public final void l(ViewGroup viewGroup, a0.k kVar, a0.k kVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2348g;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) this.F.get(i);
            if (j2 > 0 && (this.G || i == 0)) {
                long j4 = nVar.f2348g;
                if (j4 > 0) {
                    nVar.F(j4 + j2);
                } else {
                    nVar.F(j2);
                }
            }
            nVar.l(viewGroup, kVar, kVar2, arrayList, arrayList2);
        }
    }

    @Override // k1.n
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((n) this.F.get(i)).w(view);
        }
    }

    @Override // k1.n
    public final n x(l lVar) {
        super.x(lVar);
        return this;
    }

    @Override // k1.n
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((n) this.F.get(i)).y(view);
        }
    }

    @Override // k1.n
    public final void z() {
        if (this.F.isEmpty()) {
            G();
            m();
            return;
        }
        s sVar = new s();
        sVar.f2374b = this;
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((n) obj).a(sVar);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList2 = this.F;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((n) obj2).z();
            }
            return;
        }
        for (int i5 = 1; i5 < this.F.size(); i5++) {
            ((n) this.F.get(i5 - 1)).a(new s((n) this.F.get(i5)));
        }
        n nVar = (n) this.F.get(0);
        if (nVar != null) {
            nVar.z();
        }
    }
}
