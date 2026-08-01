package f1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends o {
    public ArrayList F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;

    @Override // f1.o
    public final void A(long j4) {
        ArrayList arrayList;
        this.h = j4;
        if (j4 < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.F.get(i4)).A(j4);
        }
    }

    @Override // f1.o
    public final void B(k3.m mVar) {
        this.J |= 8;
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.F.get(i4)).B(mVar);
        }
    }

    @Override // f1.o
    public final void C(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((o) this.F.get(i4)).C(timeInterpolator);
            }
        }
        this.f1698i = timeInterpolator;
    }

    @Override // f1.o
    public final void D(g2.f fVar) {
        super.D(fVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i4 = 0; i4 < this.F.size(); i4++) {
                ((o) this.F.get(i4)).D(fVar);
            }
        }
    }

    @Override // f1.o
    public final void E() {
        this.J |= 2;
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.F.get(i4)).E();
        }
    }

    @Override // f1.o
    public final void F(long j4) {
        this.g = j4;
    }

    @Override // f1.o
    public final String H(String str) {
        String H = super.H(str);
        for (int i4 = 0; i4 < this.F.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(H);
            sb.append("\n");
            sb.append(((o) this.F.get(i4)).H(str + "  "));
            H = sb.toString();
        }
        return H;
    }

    public final void I(o oVar) {
        this.F.add(oVar);
        oVar.f1703n = this;
        long j4 = this.h;
        if (j4 >= 0) {
            oVar.A(j4);
        }
        if ((this.J & 1) != 0) {
            oVar.C(this.f1698i);
        }
        if ((this.J & 2) != 0) {
            oVar.E();
        }
        if ((this.J & 4) != 0) {
            oVar.D(this.A);
        }
        if ((this.J & 8) != 0) {
            oVar.B(null);
        }
    }

    @Override // f1.o
    public final void c() {
        super.c();
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.F.get(i4)).c();
        }
    }

    @Override // f1.o
    public final void d(w wVar) {
        View view = wVar.f1725b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.t(view)) {
                    oVar.d(wVar);
                    wVar.c.add(oVar);
                }
            }
        }
    }

    @Override // f1.o
    public final void f(w wVar) {
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.F.get(i4)).f(wVar);
        }
    }

    @Override // f1.o
    public final void g(w wVar) {
        View view = wVar.f1725b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.t(view)) {
                    oVar.g(wVar);
                    wVar.c.add(oVar);
                }
            }
        }
    }

    @Override // f1.o
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final o clone() {
        a aVar = (a) super.clone();
        aVar.F = new ArrayList();
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            o clone = ((o) this.F.get(i4)).clone();
            aVar.F.add(clone);
            clone.f1703n = aVar;
        }
        return aVar;
    }

    @Override // f1.o
    public final void l(ViewGroup viewGroup, androidx.emoji2.text.w wVar, androidx.emoji2.text.w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.g;
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) this.F.get(i4);
            if (j4 > 0 && (this.G || i4 == 0)) {
                long j5 = oVar.g;
                if (j5 > 0) {
                    oVar.F(j5 + j4);
                } else {
                    oVar.F(j4);
                }
            }
            oVar.l(viewGroup, wVar, wVar2, arrayList, arrayList2);
        }
    }

    @Override // f1.o
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.F.get(i4)).w(view);
        }
    }

    @Override // f1.o
    public final o x(m mVar) {
        super.x(mVar);
        return this;
    }

    @Override // f1.o
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.F.get(i4)).y(view);
        }
    }

    @Override // f1.o
    public final void z() {
        if (this.F.isEmpty()) {
            G();
            m();
            return;
        }
        t tVar = new t();
        tVar.f1722b = this;
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((o) obj).a(tVar);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList2 = this.F;
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                ((o) obj2).z();
            }
            return;
        }
        for (int i6 = 1; i6 < this.F.size(); i6++) {
            ((o) this.F.get(i6 - 1)).a(new t((o) this.F.get(i6)));
        }
        o oVar = (o) this.F.get(0);
        if (oVar != null) {
            oVar.z();
        }
    }
}
