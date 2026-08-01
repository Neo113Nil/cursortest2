package k0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180a extends n {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2698A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2699B;

    /* renamed from: C, reason: collision with root package name */
    public int f2700C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2701D;

    /* renamed from: E, reason: collision with root package name */
    public int f2702E;

    @Override // k0.n
    public final void A(long j2) {
        ArrayList arrayList;
        this.f2739c = j2;
        if (j2 < 0 || (arrayList = this.f2698A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2698A.get(i)).A(j2);
        }
    }

    @Override // k0.n
    public final void B(k kVar) {
        this.f2702E |= 8;
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2698A.get(i)).B(kVar);
        }
    }

    @Override // k0.n
    public final void C(TimeInterpolator timeInterpolator) {
        this.f2702E |= 1;
        ArrayList arrayList = this.f2698A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((n) this.f2698A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // k0.n
    public final void D(I0.e eVar) {
        super.D(eVar);
        this.f2702E |= 4;
        if (this.f2698A != null) {
            for (int i = 0; i < this.f2698A.size(); i++) {
                ((n) this.f2698A.get(i)).D(eVar);
            }
        }
    }

    @Override // k0.n
    public final void E() {
        this.f2702E |= 2;
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2698A.get(i)).E();
        }
    }

    @Override // k0.n
    public final void F(long j2) {
        this.f2738b = j2;
    }

    @Override // k0.n
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f2698A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((n) this.f2698A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(n nVar) {
        this.f2698A.add(nVar);
        nVar.i = this;
        long j2 = this.f2739c;
        if (j2 >= 0) {
            nVar.A(j2);
        }
        if ((this.f2702E & 1) != 0) {
            nVar.C(this.d);
        }
        if ((this.f2702E & 2) != 0) {
            nVar.E();
        }
        if ((this.f2702E & 4) != 0) {
            nVar.D(this.f2755v);
        }
        if ((this.f2702E & 8) != 0) {
            nVar.B(null);
        }
    }

    @Override // k0.n
    public final void c() {
        super.c();
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2698A.get(i)).c();
        }
    }

    @Override // k0.n
    public final void d(v vVar) {
        if (t(vVar.f2767b)) {
            Iterator it = this.f2698A.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.t(vVar.f2767b)) {
                    nVar.d(vVar);
                    vVar.f2768c.add(nVar);
                }
            }
        }
    }

    @Override // k0.n
    public final void f(v vVar) {
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2698A.get(i)).f(vVar);
        }
    }

    @Override // k0.n
    public final void g(v vVar) {
        if (t(vVar.f2767b)) {
            Iterator it = this.f2698A.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.t(vVar.f2767b)) {
                    nVar.g(vVar);
                    vVar.f2768c.add(nVar);
                }
            }
        }
    }

    @Override // k0.n
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        C0180a c0180a = (C0180a) super.clone();
        c0180a.f2698A = new ArrayList();
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            n clone = ((n) this.f2698A.get(i)).clone();
            c0180a.f2698A.add(clone);
            clone.i = c0180a;
        }
        return c0180a;
    }

    @Override // k0.n
    public final void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2738b;
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) this.f2698A.get(i);
            if (j2 > 0 && (this.f2699B || i == 0)) {
                long j3 = nVar.f2738b;
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
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2698A.get(i)).w(viewGroup);
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
        int size = this.f2698A.size();
        for (int i = 0; i < size; i++) {
            ((n) this.f2698A.get(i)).y(frameLayout);
        }
    }

    @Override // k0.n
    public final void z() {
        if (this.f2698A.isEmpty()) {
            G();
            m();
            return;
        }
        s sVar = new s();
        sVar.f2764b = this;
        Iterator it = this.f2698A.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a(sVar);
        }
        this.f2700C = this.f2698A.size();
        if (this.f2699B) {
            Iterator it2 = this.f2698A.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f2698A.size(); i++) {
            ((n) this.f2698A.get(i - 1)).a(new s((n) this.f2698A.get(i)));
        }
        n nVar = (n) this.f2698A.get(0);
        if (nVar != null) {
            nVar.z();
        }
    }
}
