package m0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258a extends l {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3242A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3243B;

    /* renamed from: C, reason: collision with root package name */
    public int f3244C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3245D;

    /* renamed from: E, reason: collision with root package name */
    public int f3246E;

    @Override // m0.l
    public final void A(long j2) {
        ArrayList arrayList;
        this.f3280c = j2;
        if (j2 < 0 || (arrayList = this.f3242A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f3242A.get(i)).A(j2);
        }
    }

    @Override // m0.l
    public final void B(AbstractC0112a abstractC0112a) {
        this.f3246E |= 8;
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f3242A.get(i)).B(abstractC0112a);
        }
    }

    @Override // m0.l
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3246E |= 1;
        ArrayList arrayList = this.f3242A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((l) this.f3242A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // m0.l
    public final void D(K0.e eVar) {
        super.D(eVar);
        this.f3246E |= 4;
        if (this.f3242A != null) {
            for (int i = 0; i < this.f3242A.size(); i++) {
                ((l) this.f3242A.get(i)).D(eVar);
            }
        }
    }

    @Override // m0.l
    public final void E() {
        this.f3246E |= 2;
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f3242A.get(i)).E();
        }
    }

    @Override // m0.l
    public final void F(long j2) {
        this.f3279b = j2;
    }

    @Override // m0.l
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f3242A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((l) this.f3242A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(l lVar) {
        this.f3242A.add(lVar);
        lVar.i = this;
        long j2 = this.f3280c;
        if (j2 >= 0) {
            lVar.A(j2);
        }
        if ((this.f3246E & 1) != 0) {
            lVar.C(this.d);
        }
        if ((this.f3246E & 2) != 0) {
            lVar.E();
        }
        if ((this.f3246E & 4) != 0) {
            lVar.D(this.f3297v);
        }
        if ((this.f3246E & 8) != 0) {
            lVar.B(null);
        }
    }

    @Override // m0.l
    public final void c() {
        super.c();
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f3242A.get(i)).c();
        }
    }

    @Override // m0.l
    public final void d(t tVar) {
        if (t(tVar.f3309b)) {
            Iterator it = this.f3242A.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.t(tVar.f3309b)) {
                    lVar.d(tVar);
                    tVar.f3310c.add(lVar);
                }
            }
        }
    }

    @Override // m0.l
    public final void f(t tVar) {
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f3242A.get(i)).f(tVar);
        }
    }

    @Override // m0.l
    public final void g(t tVar) {
        if (t(tVar.f3309b)) {
            Iterator it = this.f3242A.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.t(tVar.f3309b)) {
                    lVar.g(tVar);
                    tVar.f3310c.add(lVar);
                }
            }
        }
    }

    @Override // m0.l
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        C0258a c0258a = (C0258a) super.clone();
        c0258a.f3242A = new ArrayList();
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            l clone = ((l) this.f3242A.get(i)).clone();
            c0258a.f3242A.add(clone);
            clone.i = c0258a;
        }
        return c0258a;
    }

    @Override // m0.l
    public final void l(FrameLayout frameLayout, S0.g gVar, S0.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3279b;
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) this.f3242A.get(i);
            if (j2 > 0 && (this.f3243B || i == 0)) {
                long j3 = lVar.f3279b;
                if (j3 > 0) {
                    lVar.F(j3 + j2);
                } else {
                    lVar.F(j2);
                }
            }
            lVar.l(frameLayout, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // m0.l
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f3242A.get(i)).w(viewGroup);
        }
    }

    @Override // m0.l
    public final l x(j jVar) {
        super.x(jVar);
        return this;
    }

    @Override // m0.l
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3242A.size();
        for (int i = 0; i < size; i++) {
            ((l) this.f3242A.get(i)).y(frameLayout);
        }
    }

    @Override // m0.l
    public final void z() {
        if (this.f3242A.isEmpty()) {
            G();
            m();
            return;
        }
        q qVar = new q();
        qVar.f3306b = this;
        Iterator it = this.f3242A.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(qVar);
        }
        this.f3244C = this.f3242A.size();
        if (this.f3243B) {
            Iterator it2 = this.f3242A.iterator();
            while (it2.hasNext()) {
                ((l) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3242A.size(); i++) {
            ((l) this.f3242A.get(i - 1)).a(new q((l) this.f3242A.get(i)));
        }
        l lVar = (l) this.f3242A.get(0);
        if (lVar != null) {
            lVar.z();
        }
    }
}
