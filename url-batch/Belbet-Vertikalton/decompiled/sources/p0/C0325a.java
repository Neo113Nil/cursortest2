package p0;

import a.AbstractC0058a;
import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3806A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3807B;

    /* renamed from: C, reason: collision with root package name */
    public int f3808C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3809D;

    /* renamed from: E, reason: collision with root package name */
    public int f3810E;

    @Override // p0.m
    public final void A(long j) {
        ArrayList arrayList;
        this.f3844c = j;
        if (j < 0 || (arrayList = this.f3806A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3806A.get(i)).A(j);
        }
    }

    @Override // p0.m
    public final void B(AbstractC0058a abstractC0058a) {
        this.f3810E |= 8;
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3806A.get(i)).B(abstractC0058a);
        }
    }

    @Override // p0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3810E |= 1;
        ArrayList arrayList = this.f3806A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f3806A.get(i)).C(timeInterpolator);
            }
        }
        this.f3845d = timeInterpolator;
    }

    @Override // p0.m
    public final void D(i iVar) {
        super.D(iVar);
        this.f3810E |= 4;
        if (this.f3806A != null) {
            for (int i = 0; i < this.f3806A.size(); i++) {
                ((m) this.f3806A.get(i)).D(iVar);
            }
        }
    }

    @Override // p0.m
    public final void E() {
        this.f3810E |= 2;
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3806A.get(i)).E();
        }
    }

    @Override // p0.m
    public final void F(long j) {
        this.f3843b = j;
    }

    @Override // p0.m
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.f3806A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H);
            sb.append("\n");
            sb.append(((m) this.f3806A.get(i)).H(str + "  "));
            H = sb.toString();
        }
        return H;
    }

    public final void I(m mVar) {
        this.f3806A.add(mVar);
        mVar.i = this;
        long j = this.f3844c;
        if (j >= 0) {
            mVar.A(j);
        }
        if ((this.f3810E & 1) != 0) {
            mVar.C(this.f3845d);
        }
        if ((this.f3810E & 2) != 0) {
            mVar.E();
        }
        if ((this.f3810E & 4) != 0) {
            mVar.D(this.f3860v);
        }
        if ((this.f3810E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // p0.m
    public final void c() {
        super.c();
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3806A.get(i)).c();
        }
    }

    @Override // p0.m
    public final void d(u uVar) {
        if (t(uVar.f3872b)) {
            Iterator it = this.f3806A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3872b)) {
                    mVar.d(uVar);
                    uVar.f3873c.add(mVar);
                }
            }
        }
    }

    @Override // p0.m
    public final void f(u uVar) {
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3806A.get(i)).f(uVar);
        }
    }

    @Override // p0.m
    public final void g(u uVar) {
        if (t(uVar.f3872b)) {
            Iterator it = this.f3806A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3872b)) {
                    mVar.g(uVar);
                    uVar.f3873c.add(mVar);
                }
            }
        }
    }

    @Override // p0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0325a c0325a = (C0325a) super.clone();
        c0325a.f3806A = new ArrayList();
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f3806A.get(i)).clone();
            c0325a.f3806A.add(clone);
            clone.i = c0325a;
        }
        return c0325a;
    }

    @Override // p0.m
    public final void l(FrameLayout frameLayout, V.v vVar, V.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f3843b;
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f3806A.get(i);
            if (j > 0 && (this.f3807B || i == 0)) {
                long j2 = mVar.f3843b;
                if (j2 > 0) {
                    mVar.F(j2 + j);
                } else {
                    mVar.F(j);
                }
            }
            mVar.l(frameLayout, vVar, vVar2, arrayList, arrayList2);
        }
    }

    @Override // p0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3806A.get(i)).w(viewGroup);
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
        int size = this.f3806A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3806A.get(i)).y(frameLayout);
        }
    }

    @Override // p0.m
    public final void z() {
        if (this.f3806A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f3869b = this;
        Iterator it = this.f3806A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f3808C = this.f3806A.size();
        if (this.f3807B) {
            Iterator it2 = this.f3806A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3806A.size(); i++) {
            ((m) this.f3806A.get(i - 1)).a(new r((m) this.f3806A.get(i)));
        }
        m mVar = (m) this.f3806A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
