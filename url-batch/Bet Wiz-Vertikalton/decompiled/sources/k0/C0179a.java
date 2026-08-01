package k0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179a extends n {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2747A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2748B;

    /* renamed from: C, reason: collision with root package name */
    public int f2749C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2750D;

    /* renamed from: E, reason: collision with root package name */
    public int f2751E;

    @Override // k0.n
    public final void A(long j2) {
        ArrayList arrayList;
        this.f2788c = j2;
        if (j2 < 0 || (arrayList = this.f2747A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2747A.get(i)).A(j2);
        }
    }

    @Override // k0.n
    public final void B(k kVar) {
        this.f2751E |= 8;
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2747A.get(i)).B(kVar);
        }
    }

    @Override // k0.n
    public final void C(TimeInterpolator timeInterpolator) {
        this.f2751E |= 1;
        ArrayList arrayList = this.f2747A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((n) this.f2747A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // k0.n
    public final void D(I0.e eVar) {
        super.D(eVar);
        this.f2751E |= 4;
        if (this.f2747A != null) {
            for (int i = 0; i < this.f2747A.size(); i++) {
                ((n) this.f2747A.get(i)).D(eVar);
            }
        }
    }

    @Override // k0.n
    public final void E() {
        this.f2751E |= 2;
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2747A.get(i)).E();
        }
    }

    @Override // k0.n
    public final void F(long j2) {
        this.f2787b = j2;
    }

    @Override // k0.n
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f2747A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((n) this.f2747A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(n nVar) {
        this.f2747A.add(nVar);
        nVar.i = this;
        long j2 = this.f2788c;
        if (j2 >= 0) {
            nVar.A(j2);
        }
        if ((this.f2751E & 1) != 0) {
            nVar.C(this.d);
        }
        if ((this.f2751E & 2) != 0) {
            nVar.E();
        }
        if ((this.f2751E & 4) != 0) {
            nVar.D(this.f2804v);
        }
        if ((this.f2751E & 8) != 0) {
            nVar.B(null);
        }
    }

    @Override // k0.n
    public final void c() {
        super.c();
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2747A.get(i)).c();
        }
    }

    @Override // k0.n
    public final void d(v vVar) {
        if (t(vVar.f2816b)) {
            Iterator it = this.f2747A.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.t(vVar.f2816b)) {
                    nVar.d(vVar);
                    vVar.f2817c.add(nVar);
                }
            }
        }
    }

    @Override // k0.n
    public final void f(v vVar) {
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2747A.get(i)).f(vVar);
        }
    }

    @Override // k0.n
    public final void g(v vVar) {
        if (t(vVar.f2816b)) {
            Iterator it = this.f2747A.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.t(vVar.f2816b)) {
                    nVar.g(vVar);
                    vVar.f2817c.add(nVar);
                }
            }
        }
    }

    @Override // k0.n
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        C0179a c0179a = (C0179a) super.clone();
        c0179a.f2747A = new ArrayList();
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            n clone = ((n) this.f2747A.get(i)).clone();
            c0179a.f2747A.add(clone);
            clone.i = c0179a;
        }
        return c0179a;
    }

    @Override // k0.n
    public final void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2787b;
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) this.f2747A.get(i);
            if (j2 > 0 && (this.f2748B || i == 0)) {
                long j3 = nVar.f2787b;
                if (j3 > 0) {
                    nVar.F(j3 + j2);
                } else {
                    nVar.F(j2);
                }
            }
            nVar.l(frameLayout, uVar, uVar2, arrayList, arrayList2);
        }
    }

    @Override // k0.n
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2747A.get(i)).w(viewGroup);
        }
    }

    @Override // k0.n
    public final n x(l lVar) {
        super.x(lVar);
        return this;
    }

    @Override // k0.n
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f2747A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2747A.get(i)).y(frameLayout);
        }
    }

    @Override // k0.n
    public final void z() {
        if (this.f2747A.isEmpty()) {
            G();
            m();
            return;
        }
        s sVar = new s();
        sVar.f2813b = this;
        Iterator it = this.f2747A.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(sVar);
        }
        this.f2749C = this.f2747A.size();
        if (this.f2748B) {
            Iterator it2 = this.f2747A.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f2747A.size(); i++) {
            ((n) this.f2747A.get(i - 1)).a(new s((n) this.f2747A.get(i)));
        }
        n nVar = (n) this.f2747A.get(0);
        if (nVar != null) {
            nVar.z();
        }
    }
}
