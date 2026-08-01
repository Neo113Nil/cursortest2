package k0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2688A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2689B;

    /* renamed from: C, reason: collision with root package name */
    public int f2690C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2691D;

    /* renamed from: E, reason: collision with root package name */
    public int f2692E;

    @Override // k0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f2726c = j2;
        if (j2 < 0 || (arrayList = this.f2688A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2688A.get(i)).A(j2);
        }
    }

    @Override // k0.m
    public final void B(s1.d dVar) {
        this.f2692E |= 8;
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2688A.get(i)).B(dVar);
        }
    }

    @Override // k0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f2692E |= 1;
        ArrayList arrayList = this.f2688A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f2688A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // k0.m
    public final void D(I0.e eVar) {
        super.D(eVar);
        this.f2692E |= 4;
        if (this.f2688A != null) {
            for (int i = 0; i < this.f2688A.size(); i++) {
                ((m) this.f2688A.get(i)).D(eVar);
            }
        }
    }

    @Override // k0.m
    public final void E() {
        this.f2692E |= 2;
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2688A.get(i)).E();
        }
    }

    @Override // k0.m
    public final void F(long j2) {
        this.f2725b = j2;
    }

    @Override // k0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f2688A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f2688A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f2688A.add(mVar);
        mVar.i = this;
        long j2 = this.f2726c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f2692E & 1) != 0) {
            mVar.C(this.d);
        }
        if ((this.f2692E & 2) != 0) {
            mVar.E();
        }
        if ((this.f2692E & 4) != 0) {
            mVar.D(this.f2742v);
        }
        if ((this.f2692E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // k0.m
    public final void c() {
        super.c();
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2688A.get(i)).c();
        }
    }

    @Override // k0.m
    public final void d(u uVar) {
        if (t(uVar.f2754b)) {
            Iterator it = this.f2688A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f2754b)) {
                    mVar.d(uVar);
                    uVar.f2755c.add(mVar);
                }
            }
        }
    }

    @Override // k0.m
    public final void f(u uVar) {
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2688A.get(i)).f(uVar);
        }
    }

    @Override // k0.m
    public final void g(u uVar) {
        if (t(uVar.f2754b)) {
            Iterator it = this.f2688A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f2754b)) {
                    mVar.g(uVar);
                    uVar.f2755c.add(mVar);
                }
            }
        }
    }

    @Override // k0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0177a c0177a = (C0177a) super.clone();
        c0177a.f2688A = new ArrayList();
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f2688A.get(i)).clone();
            c0177a.f2688A.add(clone);
            clone.i = c0177a;
        }
        return c0177a;
    }

    @Override // k0.m
    public final void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2725b;
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f2688A.get(i);
            if (j2 > 0 && (this.f2689B || i == 0)) {
                long j3 = mVar.f2725b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(frameLayout, uVar, uVar2, arrayList, arrayList2);
        }
    }

    @Override // k0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2688A.get(i)).w(viewGroup);
        }
    }

    @Override // k0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // k0.m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f2688A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2688A.get(i)).y(frameLayout);
        }
    }

    @Override // k0.m
    public final void z() {
        if (this.f2688A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f2751b = this;
        Iterator it = this.f2688A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f2690C = this.f2688A.size();
        if (this.f2689B) {
            Iterator it2 = this.f2688A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f2688A.size(); i++) {
            ((m) this.f2688A.get(i - 1)).a(new r((m) this.f2688A.get(i)));
        }
        m mVar = (m) this.f2688A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
