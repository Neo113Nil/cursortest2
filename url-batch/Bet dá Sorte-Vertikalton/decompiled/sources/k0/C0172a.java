package k0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172a extends m {

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2734A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2735B;

    /* renamed from: C, reason: collision with root package name */
    public int f2736C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2737D;

    /* renamed from: E, reason: collision with root package name */
    public int f2738E;

    @Override // k0.m
    public final void A(long j2) {
        ArrayList arrayList;
        this.f2772c = j2;
        if (j2 < 0 || (arrayList = this.f2734A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2734A.get(i)).A(j2);
        }
    }

    @Override // k0.m
    public final void B(u1.l lVar) {
        this.f2738E |= 8;
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2734A.get(i)).B(lVar);
        }
    }

    @Override // k0.m
    public final void C(TimeInterpolator timeInterpolator) {
        this.f2738E |= 1;
        ArrayList arrayList = this.f2734A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((m) this.f2734A.get(i)).C(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // k0.m
    public final void D(M0.e eVar) {
        super.D(eVar);
        this.f2738E |= 4;
        if (this.f2734A != null) {
            for (int i = 0; i < this.f2734A.size(); i++) {
                ((m) this.f2734A.get(i)).D(eVar);
            }
        }
    }

    @Override // k0.m
    public final void E() {
        this.f2738E |= 2;
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2734A.get(i)).E();
        }
    }

    @Override // k0.m
    public final void F(long j2) {
        this.f2771b = j2;
    }

    @Override // k0.m
    public final String H(String str) {
        String H2 = super.H(str);
        for (int i = 0; i < this.f2734A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H2);
            sb.append("\n");
            sb.append(((m) this.f2734A.get(i)).H(str + "  "));
            H2 = sb.toString();
        }
        return H2;
    }

    public final void I(m mVar) {
        this.f2734A.add(mVar);
        mVar.i = this;
        long j2 = this.f2772c;
        if (j2 >= 0) {
            mVar.A(j2);
        }
        if ((this.f2738E & 1) != 0) {
            mVar.C(this.d);
        }
        if ((this.f2738E & 2) != 0) {
            mVar.E();
        }
        if ((this.f2738E & 4) != 0) {
            mVar.D(this.f2788v);
        }
        if ((this.f2738E & 8) != 0) {
            mVar.B(null);
        }
    }

    @Override // k0.m
    public final void c() {
        super.c();
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2734A.get(i)).c();
        }
    }

    @Override // k0.m
    public final void d(u uVar) {
        if (t(uVar.f2800b)) {
            Iterator it = this.f2734A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f2800b)) {
                    mVar.d(uVar);
                    uVar.f2801c.add(mVar);
                }
            }
        }
    }

    @Override // k0.m
    public final void f(u uVar) {
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2734A.get(i)).f(uVar);
        }
    }

    @Override // k0.m
    public final void g(u uVar) {
        if (t(uVar.f2800b)) {
            Iterator it = this.f2734A.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                if (mVar.t(uVar.f2800b)) {
                    mVar.g(uVar);
                    uVar.f2801c.add(mVar);
                }
            }
        }
    }

    @Override // k0.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        C0172a c0172a = (C0172a) super.clone();
        c0172a.f2734A = new ArrayList();
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            m clone = ((m) this.f2734A.get(i)).clone();
            c0172a.f2734A.add(clone);
            clone.i = c0172a;
        }
        return c0172a;
    }

    @Override // k0.m
    public final void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f2771b;
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) this.f2734A.get(i);
            if (j2 > 0 && (this.f2735B || i == 0)) {
                long j3 = mVar.f2771b;
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
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2734A.get(i)).w(viewGroup);
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
        int size = this.f2734A.size();
        for (int i = 0; i < size; i++) {
            ((m) this.f2734A.get(i)).y(frameLayout);
        }
    }

    @Override // k0.m
    public final void z() {
        if (this.f2734A.isEmpty()) {
            G();
            m();
            return;
        }
        r rVar = new r();
        rVar.f2797b = this;
        Iterator it = this.f2734A.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(rVar);
        }
        this.f2736C = this.f2734A.size();
        if (this.f2735B) {
            Iterator it2 = this.f2734A.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z();
            }
            return;
        }
        for (int i = 1; i < this.f2734A.size(); i++) {
            ((m) this.f2734A.get(i - 1)).a(new r((m) this.f2734A.get(i)));
        }
        m mVar = (m) this.f2734A.get(0);
        if (mVar != null) {
            mVar.z();
        }
    }
}
