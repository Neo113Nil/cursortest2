package j0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2891A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2892B;

    /* renamed from: C, reason: collision with root package name */
    public int f2893C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2894D;

    /* renamed from: E, reason: collision with root package name */
    public int f2895E;

    @Override // j0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f2932c = j2;
        if (j2 < 0 || (arrayList = this.f2891A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2891A.get(i)).A(j2);
        }
    }

    @Override // j0.m
    public final void B(i1.r rVar) {
        this.f2895E |= 8;
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2891A.get(i)).B(rVar);
        }
    }

    @Override // j0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f2895E |= 1;
        ArrayList arrayList = this.f2891A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f2891A.get(i)).C(timeInterpolator);
            }
        }
        this.f2933d = timeInterpolator;
    }

    @Override // j0.m
    public final void D(H0.e eVar) {
        super.D(eVar);
        this.f2895E |= 4;
        if (this.f2891A != null) {
            for (int i = 0; i < this.f2891A.size(); i++) {
                ((m) this.f2891A.get(i)).D(eVar);
            }
        }
    }

    @Override // j0.m
    public final void E() {
        this.f2895E |= 2;
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2891A.get(i)).E();
        }
    }

    @Override // j0.m
    public final void F(long j2) {
        this.f2931b = j2;
    }

    @Override // j0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f2891A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f2891A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f2891A.add(mVar);
        mVar.i = this;
        long j2 = this.f2932c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f2895E & 1) != 0) {
            mVar.C(this.f2933d);
        }
        if ((this.f2895E & 2) != 0) {
            mVar.E();
        }
        if ((this.f2895E & 4) != 0) {
            mVar.D(this.f2949v);
        }
        if ((this.f2895E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // j0.m
    public final void c() {
        super.c();
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2891A.get(i)).c();
        }
    }

    @Override // j0.m
    public final void d(u uVar) {
        if (t(uVar.f2961b)) {
            Iterator it = this.f2891A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f2961b)) {
                    mVar.d(uVar);
                    uVar.f2962c.add(mVar);
                }
            }
        }
    }

    @Override // j0.m
    public final void f(u uVar) {
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2891A.get(i)).f(uVar);
        }
    }

    @Override // j0.m
    public final void g(u uVar) {
        if (t(uVar.f2961b)) {
            Iterator it = this.f2891A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f2961b)) {
                    mVar.g(uVar);
                    uVar.f2962c.add(mVar);
                }
            }
        }
    }

    @Override // j0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0176a c0176a = (C0176a) super.clone();
        c0176a.f2891A = new ArrayList();
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f2891A.get(i)).clone();
            c0176a.f2891A.add(clone);
            clone.i = c0176a;
        }
        return c0176a;
    }

    @Override // j0.m
    public final void l(FrameLayout frameLayout, T.v vVar, T.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2931b;
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f2891A.get(i);
            if (j2 > 0 && (this.f2892B || i == 0)) {
                long j3 = mVar.f2931b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(frameLayout, vVar, vVar2, arrayList, arrayList2);
        }
    }

    @Override // j0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2891A.get(i)).w(viewGroup);
        }
    }

    @Override // j0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // j0.m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f2891A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2891A.get(i)).y(frameLayout);
        }
    }

    @Override // j0.m
    public final void z() {
        if (this.f2891A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f2958b = this;
        Iterator it = this.f2891A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f2893C = this.f2891A.size();
        if (this.f2892B) {
            Iterator it2 = this.f2891A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f2891A.size(); i++) {
            ((m) this.f2891A.get(i - 1)).a(new r((m) this.f2891A.get(i)));
        }
        m mVar = (m) this.f2891A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
