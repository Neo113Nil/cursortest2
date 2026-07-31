package c5;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends o {
    public ArrayList D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;

    @Override // c5.o
    public final void A(long j7) {
        ArrayList arrayList;
        this.f1705f = j7;
        if (j7 < 0 || (arrayList = this.D) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o) this.D.get(i)).A(j7);
        }
    }

    @Override // c5.o
    public final void B(a.a aVar) {
        this.H |= 8;
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((o) this.D.get(i)).B(aVar);
        }
    }

    @Override // c5.o
    public final void C(TimeInterpolator timeInterpolator) {
        this.H |= 1;
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((o) this.D.get(i)).C(timeInterpolator);
            }
        }
        this.f1706g = timeInterpolator;
    }

    @Override // c5.o
    public final void D(w5.f fVar) {
        super.D(fVar);
        this.H |= 4;
        if (this.D != null) {
            for (int i = 0; i < this.D.size(); i++) {
                ((o) this.D.get(i)).D(fVar);
            }
        }
    }

    @Override // c5.o
    public final void E() {
        this.H |= 2;
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((o) this.D.get(i)).E();
        }
    }

    @Override // c5.o
    public final void F(long j7) {
        this.f1704e = j7;
    }

    @Override // c5.o
    public final String H(String str) {
        String H = super.H(str);
        for (int i = 0; i < this.D.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H);
            sb.append("\n");
            sb.append(((o) this.D.get(i)).H(str + "  "));
            H = sb.toString();
        }
        return H;
    }

    public final void I(o oVar) {
        this.D.add(oVar);
        oVar.f1710l = this;
        long j7 = this.f1705f;
        if (j7 >= 0) {
            oVar.A(j7);
        }
        if ((this.H & 1) != 0) {
            oVar.C(this.f1706g);
        }
        if ((this.H & 2) != 0) {
            oVar.E();
        }
        if ((this.H & 4) != 0) {
            oVar.D(this.f1723y);
        }
        if ((this.H & 8) != 0) {
            oVar.B(null);
        }
    }

    @Override // c5.o
    public final void c() {
        super.c();
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((o) this.D.get(i)).c();
        }
    }

    @Override // c5.o
    public final void d(w wVar) {
        View view = wVar.f1735b;
        if (t(view)) {
            ArrayList arrayList = this.D;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o oVar = (o) obj;
                if (oVar.t(view)) {
                    oVar.d(wVar);
                    wVar.f1736c.add(oVar);
                }
            }
        }
    }

    @Override // c5.o
    public final void f(w wVar) {
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((o) this.D.get(i)).f(wVar);
        }
    }

    @Override // c5.o
    public final void g(w wVar) {
        View view = wVar.f1735b;
        if (t(view)) {
            ArrayList arrayList = this.D;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o oVar = (o) obj;
                if (oVar.t(view)) {
                    oVar.g(wVar);
                    wVar.f1736c.add(oVar);
                }
            }
        }
    }

    @Override // c5.o
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final o clone() {
        a aVar = (a) super.clone();
        aVar.D = new ArrayList();
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            o clone = ((o) this.D.get(i)).clone();
            aVar.D.add(clone);
            clone.f1710l = aVar;
        }
        return aVar;
    }

    @Override // c5.o
    public final void l(ViewGroup viewGroup, x xVar, x xVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j7 = this.f1704e;
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) this.D.get(i);
            if (j7 > 0 && (this.E || i == 0)) {
                long j8 = oVar.f1704e;
                if (j8 > 0) {
                    oVar.F(j8 + j7);
                } else {
                    oVar.F(j7);
                }
            }
            oVar.l(viewGroup, xVar, xVar2, arrayList, arrayList2);
        }
    }

    @Override // c5.o
    public final void w(View view) {
        super.w(view);
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((o) this.D.get(i)).w(view);
        }
    }

    @Override // c5.o
    public final o x(m mVar) {
        super.x(mVar);
        return this;
    }

    @Override // c5.o
    public final void y(View view) {
        super.y(view);
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((o) this.D.get(i)).y(view);
        }
    }

    @Override // c5.o
    public final void z() {
        if (this.D.isEmpty()) {
            G();
            m();
            return;
        }
        t tVar = new t();
        tVar.f1732b = this;
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            ((o) obj).a(tVar);
        }
        this.F = this.D.size();
        if (this.E) {
            ArrayList arrayList2 = this.D;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((o) obj2).z();
            }
            return;
        }
        for (int i9 = 1; i9 < this.D.size(); i9++) {
            ((o) this.D.get(i9 - 1)).a(new t((o) this.D.get(i9)));
        }
        o oVar = (o) this.D.get(0);
        if (oVar != null) {
            oVar.z();
        }
    }
}
