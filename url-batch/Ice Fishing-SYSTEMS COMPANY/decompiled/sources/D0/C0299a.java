package D0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import u.AbstractC5088e;

/* renamed from: D0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299a extends o {

    /* renamed from: T, reason: collision with root package name */
    public ArrayList f596T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f597U;

    /* renamed from: V, reason: collision with root package name */
    public int f598V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f599W;

    /* renamed from: X, reason: collision with root package name */
    public int f600X;

    @Override // D0.o
    public final void B(ViewGroup viewGroup) {
        super.B(viewGroup);
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f596T.get(i)).B(viewGroup);
        }
    }

    @Override // D0.o
    public final o C(m mVar) {
        super.C(mVar);
        return this;
    }

    @Override // D0.o
    public final void D(FrameLayout frameLayout) {
        super.D(frameLayout);
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f596T.get(i)).D(frameLayout);
        }
    }

    @Override // D0.o
    public final void E() {
        if (this.f596T.isEmpty()) {
            L();
            r();
            return;
        }
        t tVar = new t();
        tVar.f669b = this;
        Iterator it = this.f596T.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(tVar);
        }
        this.f598V = this.f596T.size();
        if (this.f597U) {
            Iterator it2 = this.f596T.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).E();
            }
            return;
        }
        for (int i = 1; i < this.f596T.size(); i++) {
            ((o) this.f596T.get(i - 1)).a(new t((o) this.f596T.get(i)));
        }
        o oVar = (o) this.f596T.get(0);
        if (oVar != null) {
            oVar.E();
        }
    }

    @Override // D0.o
    public final void F(long j9) {
        ArrayList arrayList;
        this.f656v = j9;
        if (j9 < 0 || (arrayList = this.f596T) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f596T.get(i)).F(j9);
        }
    }

    @Override // D0.o
    public final void G(com.bumptech.glide.d dVar) {
        this.f600X |= 8;
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f596T.get(i)).G(dVar);
        }
    }

    @Override // D0.o
    public final void H(TimeInterpolator timeInterpolator) {
        this.f600X |= 1;
        ArrayList arrayList = this.f596T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o) this.f596T.get(i)).H(timeInterpolator);
            }
        }
        this.f657w = timeInterpolator;
    }

    @Override // D0.o
    public final void I(W3.e eVar) {
        super.I(eVar);
        this.f600X |= 4;
        if (this.f596T != null) {
            for (int i = 0; i < this.f596T.size(); i++) {
                ((o) this.f596T.get(i)).I(eVar);
            }
        }
    }

    @Override // D0.o
    public final void J() {
        this.f600X |= 2;
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f596T.get(i)).J();
        }
    }

    @Override // D0.o
    public final void K(long j9) {
        this.f655u = j9;
    }

    @Override // D0.o
    public final String M(String str) {
        String M8 = super.M(str);
        for (int i = 0; i < this.f596T.size(); i++) {
            StringBuilder c4 = AbstractC5088e.c(M8, "\n");
            c4.append(((o) this.f596T.get(i)).M(str + "  "));
            M8 = c4.toString();
        }
        return M8;
    }

    public final void N(o oVar) {
        this.f596T.add(oVar);
        oVar.f641B = this;
        long j9 = this.f656v;
        if (j9 >= 0) {
            oVar.F(j9);
        }
        if ((this.f600X & 1) != 0) {
            oVar.H(this.f657w);
        }
        if ((this.f600X & 2) != 0) {
            oVar.J();
        }
        if ((this.f600X & 4) != 0) {
            oVar.I(this.f653O);
        }
        if ((this.f600X & 8) != 0) {
            oVar.G(null);
        }
    }

    @Override // D0.o
    public final void h() {
        super.h();
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f596T.get(i)).h();
        }
    }

    @Override // D0.o
    public final void i(w wVar) {
        if (y(wVar.f672b)) {
            Iterator it = this.f596T.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.y(wVar.f672b)) {
                    oVar.i(wVar);
                    wVar.f673c.add(oVar);
                }
            }
        }
    }

    @Override // D0.o
    public final void k(w wVar) {
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            ((o) this.f596T.get(i)).k(wVar);
        }
    }

    @Override // D0.o
    public final void l(w wVar) {
        if (y(wVar.f672b)) {
            Iterator it = this.f596T.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.y(wVar.f672b)) {
                    oVar.l(wVar);
                    wVar.f673c.add(oVar);
                }
            }
        }
    }

    @Override // D0.o
    /* renamed from: o */
    public final o clone() {
        C0299a c0299a = (C0299a) super.clone();
        c0299a.f596T = new ArrayList();
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            o clone = ((o) this.f596T.get(i)).clone();
            c0299a.f596T.add(clone);
            clone.f641B = c0299a;
        }
        return c0299a;
    }

    @Override // D0.o
    public final void q(FrameLayout frameLayout, S0.n nVar, S0.n nVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j9 = this.f655u;
        int size = this.f596T.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.f596T.get(i);
            if (j9 > 0 && (this.f597U || i == 0)) {
                long j10 = oVar.f655u;
                if (j10 > 0) {
                    oVar.K(j10 + j9);
                } else {
                    oVar.K(j9);
                }
            }
            oVar.q(frameLayout, nVar, nVar2, arrayList, arrayList2);
        }
    }
}
