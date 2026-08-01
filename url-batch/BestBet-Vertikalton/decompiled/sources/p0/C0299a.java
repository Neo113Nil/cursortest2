package p0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3641A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3642B;

    /* renamed from: C, reason: collision with root package name */
    public int f3643C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3644D;

    /* renamed from: E, reason: collision with root package name */
    public int f3645E;

    @Override // p0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f3679c = j2;
        if (j2 < 0 || (arrayList = this.f3641A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3641A.get(i)).A(j2);
        }
    }

    @Override // p0.m
    public final void B(b1.g gVar) {
        this.f3645E |= 8;
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3641A.get(i)).B(gVar);
        }
    }

    @Override // p0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3645E |= 1;
        ArrayList arrayList = this.f3641A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f3641A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // p0.m
    public final void D(R0.e eVar) {
        super.D(eVar);
        this.f3645E |= 4;
        if (this.f3641A != null) {
            for (int i = 0; i < this.f3641A.size(); i++) {
                ((m) this.f3641A.get(i)).D(eVar);
            }
        }
    }

    @Override // p0.m
    public final void E() {
        this.f3645E |= 2;
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3641A.get(i)).E();
        }
    }

    @Override // p0.m
    public final void F(long j2) {
        this.f3678b = j2;
    }

    @Override // p0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f3641A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f3641A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f3641A.add(mVar);
        mVar.i = this;
        long j2 = this.f3679c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f3645E & 1) != 0) {
            mVar.C(this.d);
        }
        if ((this.f3645E & 2) != 0) {
            mVar.E();
        }
        if ((this.f3645E & 4) != 0) {
            mVar.D(this.f3695v);
        }
        if ((this.f3645E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // p0.m
    public final void c() {
        super.c();
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3641A.get(i)).c();
        }
    }

    @Override // p0.m
    public final void d(u uVar) {
        if (t(uVar.f3707b)) {
            Iterator it = this.f3641A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3707b)) {
                    mVar.d(uVar);
                    uVar.f3708c.add(mVar);
                }
            }
        }
    }

    @Override // p0.m
    public final void f(u uVar) {
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3641A.get(i)).f(uVar);
        }
    }

    @Override // p0.m
    public final void g(u uVar) {
        if (t(uVar.f3707b)) {
            Iterator it = this.f3641A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3707b)) {
                    mVar.g(uVar);
                    uVar.f3708c.add(mVar);
                }
            }
        }
    }

    @Override // p0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0299a c0299a = (C0299a) super.clone();
        c0299a.f3641A = new ArrayList();
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f3641A.get(i)).clone();
            c0299a.f3641A.add(clone);
            clone.i = c0299a;
        }
        return c0299a;
    }

    @Override // p0.m
    public final void l(FrameLayout frameLayout, T0.m mVar, T0.m mVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3678b;
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            m mVar3 = (m) this.f3641A.get(i);
            if (j2 > 0 && (this.f3642B || i == 0)) {
                long j3 = mVar3.f3678b;
                if (j3 > 0) {
                    mVar3.F(j3 + j2);
                } else {
                    mVar3.F(j2);
                }
            }
            mVar3.l(frameLayout, mVar, mVar2, arrayList, arrayList2);
        }
    }

    @Override // p0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3641A.get(i)).w(viewGroup);
        }
    }

    @Override // p0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // p0.m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3641A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3641A.get(i)).y(frameLayout);
        }
    }

    @Override // p0.m
    public final void z() {
        if (this.f3641A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f3704b = this;
        Iterator it = this.f3641A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f3643C = this.f3641A.size();
        if (this.f3642B) {
            Iterator it2 = this.f3641A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3641A.size(); i++) {
            ((m) this.f3641A.get(i - 1)).a(new r((m) this.f3641A.get(i)));
        }
        m mVar = (m) this.f3641A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
