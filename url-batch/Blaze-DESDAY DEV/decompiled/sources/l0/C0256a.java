package l0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3076A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3077B;

    /* renamed from: C, reason: collision with root package name */
    public int f3078C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3079D;

    /* renamed from: E, reason: collision with root package name */
    public int f3080E;

    @Override // l0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f3114c = j2;
        if (j2 < 0 || (arrayList = this.f3076A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3076A.get(i)).A(j2);
        }
    }

    @Override // l0.m
    public final void B(i0.g gVar) {
        this.f3080E |= 8;
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3076A.get(i)).B(gVar);
        }
    }

    @Override // l0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3080E |= 1;
        ArrayList arrayList = this.f3076A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f3076A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // l0.m
    public final void D(J0.e eVar) {
        super.D(eVar);
        this.f3080E |= 4;
        if (this.f3076A != null) {
            for (int i = 0; i < this.f3076A.size(); i++) {
                ((m) this.f3076A.get(i)).D(eVar);
            }
        }
    }

    @Override // l0.m
    public final void E() {
        this.f3080E |= 2;
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3076A.get(i)).E();
        }
    }

    @Override // l0.m
    public final void F(long j2) {
        this.f3113b = j2;
    }

    @Override // l0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f3076A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f3076A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f3076A.add(mVar);
        mVar.i = this;
        long j2 = this.f3114c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f3080E & 1) != 0) {
            mVar.C(this.d);
        }
        if ((this.f3080E & 2) != 0) {
            mVar.E();
        }
        if ((this.f3080E & 4) != 0) {
            mVar.D(this.f3130v);
        }
        if ((this.f3080E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // l0.m
    public final void c() {
        super.c();
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3076A.get(i)).c();
        }
    }

    @Override // l0.m
    public final void d(u uVar) {
        if (t(uVar.f3142b)) {
            Iterator it = this.f3076A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3142b)) {
                    mVar.d(uVar);
                    uVar.f3143c.add(mVar);
                }
            }
        }
    }

    @Override // l0.m
    public final void f(u uVar) {
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3076A.get(i)).f(uVar);
        }
    }

    @Override // l0.m
    public final void g(u uVar) {
        if (t(uVar.f3142b)) {
            Iterator it = this.f3076A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3142b)) {
                    mVar.g(uVar);
                    uVar.f3143c.add(mVar);
                }
            }
        }
    }

    @Override // l0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0256a c0256a = (C0256a) super.clone();
        c0256a.f3076A = new ArrayList();
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f3076A.get(i)).clone();
            c0256a.f3076A.add(clone);
            clone.i = c0256a;
        }
        return c0256a;
    }

    @Override // l0.m
    public final void l(FrameLayout frameLayout, U.u uVar, U.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3113b;
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f3076A.get(i);
            if (j2 > 0 && (this.f3077B || i == 0)) {
                long j3 = mVar.f3113b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(frameLayout, uVar, uVar2, arrayList, arrayList2);
        }
    }

    @Override // l0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3076A.get(i)).w(viewGroup);
        }
    }

    @Override // l0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // l0.m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3076A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3076A.get(i)).y(frameLayout);
        }
    }

    @Override // l0.m
    public final void z() {
        if (this.f3076A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f3139b = this;
        Iterator it = this.f3076A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f3078C = this.f3076A.size();
        if (this.f3077B) {
            Iterator it2 = this.f3076A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3076A.size(); i++) {
            ((m) this.f3076A.get(i - 1)).a(new r((m) this.f3076A.get(i)));
        }
        m mVar = (m) this.f3076A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
