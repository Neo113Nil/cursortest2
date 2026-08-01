package n0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import t.C0356n;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f3131A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3132B;

    /* renamed from: C, reason: collision with root package name */
    public int f3133C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3134D;

    /* renamed from: E, reason: collision with root package name */
    public int f3135E;

    @Override // n0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f3169c = j2;
        if (j2 < 0 || (arrayList = this.f3131A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3131A.get(i)).A(j2);
        }
    }

    @Override // n0.m
    public final void B(h0.g gVar) {
        this.f3135E |= 8;
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3131A.get(i)).B(gVar);
        }
    }

    @Override // n0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f3135E |= 1;
        ArrayList arrayList = this.f3131A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f3131A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // n0.m
    public final void D(C0356n c0356n) {
        super.D(c0356n);
        this.f3135E |= 4;
        if (this.f3131A != null) {
            for (int i = 0; i < this.f3131A.size(); i++) {
                ((m) this.f3131A.get(i)).D(c0356n);
            }
        }
    }

    @Override // n0.m
    public final void E() {
        this.f3135E |= 2;
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3131A.get(i)).E();
        }
    }

    @Override // n0.m
    public final void F(long j2) {
        this.f3168b = j2;
    }

    @Override // n0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f3131A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f3131A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f3131A.add(mVar);
        mVar.i = this;
        long j2 = this.f3169c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f3135E & 1) != 0) {
            mVar.C(this.d);
        }
        if ((this.f3135E & 2) != 0) {
            mVar.E();
        }
        if ((this.f3135E & 4) != 0) {
            mVar.D(this.f3185v);
        }
        if ((this.f3135E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // n0.m
    public final void c() {
        super.c();
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3131A.get(i)).c();
        }
    }

    @Override // n0.m
    public final void d(u uVar) {
        if (t(uVar.f3197b)) {
            Iterator it = this.f3131A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3197b)) {
                    mVar.d(uVar);
                    uVar.f3198c.add(mVar);
                }
            }
        }
    }

    @Override // n0.m
    public final void f(u uVar) {
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3131A.get(i)).f(uVar);
        }
    }

    @Override // n0.m
    public final void g(u uVar) {
        if (t(uVar.f3197b)) {
            Iterator it = this.f3131A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f3197b)) {
                    mVar.g(uVar);
                    uVar.f3198c.add(mVar);
                }
            }
        }
    }

    @Override // n0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0258a c0258a = (C0258a) super.clone();
        c0258a.f3131A = new ArrayList();
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f3131A.get(i)).clone();
            c0258a.f3131A.add(clone);
            clone.i = c0258a;
        }
        return c0258a;
    }

    @Override // n0.m
    public final void l(FrameLayout frameLayout, T.w wVar, T.w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f3168b;
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f3131A.get(i);
            if (j2 > 0 && (this.f3132B || i == 0)) {
                long j3 = mVar.f3168b;
                if (j3 > 0) {
                    mVar.F(j3 + j2);
                } else {
                    mVar.F(j2);
                }
            }
            mVar.l(frameLayout, wVar, wVar2, arrayList, arrayList2);
        }
    }

    @Override // n0.m
    public final void w(ViewGroup viewGroup) {
        super.w(viewGroup);
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3131A.get(i)).w(viewGroup);
        }
    }

    @Override // n0.m
    public final m x(k kVar) {
        super.x(kVar);
        return this;
    }

    @Override // n0.m
    public final void y(FrameLayout frameLayout) {
        super.y(frameLayout);
        int size = this.f3131A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f3131A.get(i)).y(frameLayout);
        }
    }

    @Override // n0.m
    public final void z() {
        if (this.f3131A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f3194b = this;
        Iterator it = this.f3131A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f3133C = this.f3131A.size();
        if (this.f3132B) {
            Iterator it2 = this.f3131A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f3131A.size(); i++) {
            ((m) this.f3131A.get(i - 1)).a(new r((m) this.f3131A.get(i)));
        }
        m mVar = (m) this.f3131A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
