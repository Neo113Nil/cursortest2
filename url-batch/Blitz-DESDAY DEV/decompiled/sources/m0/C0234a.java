package m0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h0.a0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3135A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3136B;

    /* renamed from: C, reason: collision with root package name */
    public int f3137C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3138D;

    /* renamed from: E, reason: collision with root package name */
    public int f3139E;

    @Override // m0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f3174c = j2;
        if (j2 < 0 || (arrayList = this.f3135A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3135A.get(i)).A(j2);
        }
    }

    @Override // m0.m
    public final void B(a0 a0Var) {
        this.f3139E |= 8;
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3135A.get(i)).B(a0Var);
        }
    }

    @Override // m0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3139E |= 1;
        ArrayList arrayList = this.f3135A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f3135A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // m0.m
    public final void D(L0.e eVar) {
        super.D(eVar);
        this.f3139E |= 4;
        if (this.f3135A != null) {
            for (int i = 0; i < this.f3135A.size(); i++) {
                ((m) this.f3135A.get(i)).D(eVar);
            }
        }
    }

    @Override // m0.m
    public final void E() {
        this.f3139E |= 2;
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3135A.get(i)).E();
        }
    }

    @Override // m0.m
    public final void F(long j2) {
        this.f3173b = j2;
    }

    @Override // m0.m
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.f3135A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H);
            sb.append("\n");
            sb.append(((m) this.f3135A.get(i)).H(str + "  "));
            H = sb.toString();
        }
        return H;
    }

    public final void I(m mVar) {
        this.f3135A.add(mVar);
        mVar.i = this;
        long j2 = this.f3174c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f3139E & 1) != 0) {
            mVar.C(this.d);
        }
        if ((this.f3139E & 2) != 0) {
            mVar.E();
        }
        if ((this.f3139E & 4) != 0) {
            mVar.D(this.f3190v);
        }
        if ((this.f3139E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // m0.m
    public final void c() {
        super.c();
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3135A.get(i)).c();
        }
    }

    @Override // m0.m
    public final void d(u uVar) {
        if (t(uVar.f3202b)) {
            Iterator it = this.f3135A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3202b)) {
                    mVar.d(uVar);
                    uVar.f3203c.add(mVar);
                }
            }
        }
    }

    @Override // m0.m
    public final void f(u uVar) {
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3135A.get(i)).f(uVar);
        }
    }

    @Override // m0.m
    public final void g(u uVar) {
        if (t(uVar.f3202b)) {
            Iterator it = this.f3135A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3202b)) {
                    mVar.g(uVar);
                    uVar.f3203c.add(mVar);
                }
            }
        }
    }

    @Override // m0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0234a c0234a = (C0234a) super.clone();
        c0234a.f3135A = new ArrayList();
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f3135A.get(i)).clone();
            c0234a.f3135A.add(clone);
            clone.i = c0234a;
        }
        return c0234a;
    }

    @Override // m0.m
    public final void l(FrameLayout frameLayout, T0.g gVar, T0.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3173b;
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f3135A.get(i);
            if (j2 > 0 && (this.f3136B || i == 0)) {
                long j3 = mVar.f3173b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(frameLayout, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // m0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3135A.get(i)).w(viewGroup);
        }
    }

    @Override // m0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // m0.m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3135A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3135A.get(i)).y(frameLayout);
        }
    }

    @Override // m0.m
    public final void z() {
        if (this.f3135A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f3199b = this;
        Iterator it = this.f3135A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f3137C = this.f3135A.size();
        if (this.f3136B) {
            Iterator it2 = this.f3135A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3135A.size(); i++) {
            ((m) this.f3135A.get(i - 1)).a(new r((m) this.f3135A.get(i)));
        }
        m mVar = (m) this.f3135A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
