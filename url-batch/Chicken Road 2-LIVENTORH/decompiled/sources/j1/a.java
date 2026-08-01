package j1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.w0;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends o {
    public int I;
    public ArrayList G = new ArrayList();
    public boolean H = true;
    public boolean J = false;
    public int K = 0;

    public a() {
        M(1);
        J(new h(2));
        J(new f());
        J(new h(1));
    }

    @Override // j1.o
    public final void A() {
        if (this.G.isEmpty()) {
            H();
            m();
            return;
        }
        t tVar = new t();
        tVar.f1965b = this;
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((o) obj).a(tVar);
        }
        this.I = this.G.size();
        if (this.H) {
            ArrayList arrayList2 = this.G;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((o) obj2).A();
            }
            return;
        }
        for (int i5 = 1; i5 < this.G.size(); i5++) {
            ((o) this.G.get(i5 - 1)).a(new t((o) this.G.get(i5)));
        }
        o oVar = (o) this.G.get(0);
        if (oVar != null) {
            oVar.A();
        }
    }

    @Override // j1.o
    public final void C(h.a aVar) {
        this.K |= 8;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((o) this.G.get(i)).C(aVar);
        }
    }

    @Override // j1.o
    public final void E(l2.f fVar) {
        super.E(fVar);
        this.K |= 4;
        if (this.G != null) {
            for (int i = 0; i < this.G.size(); i++) {
                ((o) this.G.get(i)).E(fVar);
            }
        }
    }

    @Override // j1.o
    public final void F() {
        this.K |= 2;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((o) this.G.get(i)).F();
        }
    }

    @Override // j1.o
    public final void G(long j4) {
        this.f1938g = j4;
    }

    @Override // j1.o
    public final String I(String str) {
        String I = super.I(str);
        for (int i = 0; i < this.G.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(I);
            sb.append("\n");
            sb.append(((o) this.G.get(i)).I(str + "  "));
            I = sb.toString();
        }
        return I;
    }

    public final void J(o oVar) {
        this.G.add(oVar);
        oVar.f1945o = this;
        long j4 = this.f1939h;
        if (j4 >= 0) {
            oVar.B(j4);
        }
        if ((this.K & 1) != 0) {
            oVar.D(this.i);
        }
        if ((this.K & 2) != 0) {
            oVar.F();
        }
        if ((this.K & 4) != 0) {
            oVar.E(this.B);
        }
        if ((this.K & 8) != 0) {
            oVar.C(null);
        }
    }

    @Override // j1.o
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void B(long j4) {
        ArrayList arrayList;
        this.f1939h = j4;
        if (j4 < 0 || (arrayList = this.G) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o) this.G.get(i)).B(j4);
        }
    }

    @Override // j1.o
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void D(TimeInterpolator timeInterpolator) {
        this.K |= 1;
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o) this.G.get(i)).D(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    public final void M(int i) {
        if (i == 0) {
            this.H = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(w0.d("Invalid parameter for TransitionSet ordering: ", i));
            }
            this.H = false;
        }
    }

    @Override // j1.o
    public final void c() {
        super.c();
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((o) this.G.get(i)).c();
        }
    }

    @Override // j1.o
    public final void d(w wVar) {
        View view = wVar.f1968b;
        if (u(view)) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o oVar = (o) obj;
                if (oVar.u(view)) {
                    oVar.d(wVar);
                    wVar.f1969c.add(oVar);
                }
            }
        }
    }

    @Override // j1.o
    public final void f(w wVar) {
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((o) this.G.get(i)).f(wVar);
        }
    }

    @Override // j1.o
    public final void g(w wVar) {
        View view = wVar.f1968b;
        if (u(view)) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o oVar = (o) obj;
                if (oVar.u(view)) {
                    oVar.g(wVar);
                    wVar.f1969c.add(oVar);
                }
            }
        }
    }

    @Override // j1.o
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final o clone() {
        a aVar = (a) super.clone();
        aVar.G = new ArrayList();
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            o clone = ((o) this.G.get(i)).clone();
            aVar.G.add(clone);
            clone.f1945o = aVar;
        }
        return aVar;
    }

    @Override // j1.o
    public final void l(ViewGroup viewGroup, a0.j jVar, a0.j jVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f1938g;
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.G.get(i);
            if (j4 > 0 && (this.H || i == 0)) {
                long j5 = oVar.f1938g;
                if (j5 > 0) {
                    oVar.G(j5 + j4);
                } else {
                    oVar.G(j4);
                }
            }
            oVar.l(viewGroup, jVar, jVar2, arrayList, arrayList2);
        }
    }

    @Override // j1.o
    public final void n() {
        for (int i = 0; i < this.G.size(); i++) {
            ((o) this.G.get(i)).n();
        }
        super.n();
    }

    @Override // j1.o
    public final void x(View view) {
        super.x(view);
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((o) this.G.get(i)).x(view);
        }
    }

    @Override // j1.o
    public final o y(m mVar) {
        super.y(mVar);
        return this;
    }

    @Override // j1.o
    public final void z(View view) {
        super.z(view);
        int size = this.G.size();
        for (int i = 0; i < size; i++) {
            ((o) this.G.get(i)).z(view);
        }
    }
}
