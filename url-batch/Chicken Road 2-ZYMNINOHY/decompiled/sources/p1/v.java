package p1;

import a0.C0144j;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class v extends q {

    /* renamed from: x, reason: collision with root package name */
    public int f14799x;
    public ArrayList v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f14798w = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14800y = false;
    public int z = 0;

    @Override // p1.q
    public final void A(O3.d dVar) {
        this.f14789q = dVar;
        this.z |= 8;
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.v.get(i4)).A(dVar);
        }
    }

    @Override // p1.q
    public final void B() {
        this.z |= 1;
        ArrayList arrayList = this.v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((q) this.v.get(i4)).B();
            }
        }
    }

    @Override // p1.q
    public final void C(C0144j c0144j) {
        super.C(c0144j);
        this.z |= 4;
        if (this.v != null) {
            for (int i4 = 0; i4 < this.v.size(); i4++) {
                ((q) this.v.get(i4)).C(c0144j);
            }
        }
    }

    @Override // p1.q
    public final void D() {
        this.z |= 2;
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.v.get(i4)).D();
        }
    }

    @Override // p1.q
    public final void E(long j4) {
        this.f14776b = j4;
    }

    @Override // p1.q
    public final String G(String str) {
        String G4 = super.G(str);
        for (int i4 = 0; i4 < this.v.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G4);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(((q) this.v.get(i4)).G(str + "  "));
            G4 = sb.toString();
        }
        return G4;
    }

    public final void H(q qVar) {
        this.v.add(qVar);
        qVar.f14781g = this;
        if ((this.z & 1) != 0) {
            qVar.B();
        }
        if ((this.z & 2) != 0) {
            qVar.D();
        }
        if ((this.z & 4) != 0) {
            qVar.C(this.f14790r);
        }
        if ((this.z & 8) != 0) {
            qVar.A(this.f14789q);
        }
    }

    @Override // p1.q
    public final void b(View view) {
        for (int i4 = 0; i4 < this.v.size(); i4++) {
            ((q) this.v.get(i4)).b(view);
        }
        this.f14778d.add(view);
    }

    @Override // p1.q
    public final void d() {
        super.d();
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.v.get(i4)).d();
        }
    }

    @Override // p1.q
    public final void e(x xVar) {
        if (t(xVar.f14805b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                q qVar = (q) obj;
                if (qVar.t(xVar.f14805b)) {
                    qVar.e(xVar);
                    xVar.f14806c.add(qVar);
                }
            }
        }
    }

    @Override // p1.q
    public final void g(x xVar) {
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.v.get(i4)).g(xVar);
        }
    }

    @Override // p1.q
    public final void h(x xVar) {
        if (t(xVar.f14805b)) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                q qVar = (q) obj;
                if (qVar.t(xVar.f14805b)) {
                    qVar.h(xVar);
                    xVar.f14806c.add(qVar);
                }
            }
        }
    }

    @Override // p1.q
    /* renamed from: k */
    public final q clone() {
        v vVar = (v) super.clone();
        vVar.v = new ArrayList();
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            q clone = ((q) this.v.get(i4)).clone();
            vVar.v.add(clone);
            clone.f14781g = vVar;
        }
        return vVar;
    }

    @Override // p1.q
    public final void m(ViewGroup viewGroup, G1.c cVar, G1.c cVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f14776b;
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) this.v.get(i4);
            if (j4 > 0 && (this.f14798w || i4 == 0)) {
                long j5 = qVar.f14776b;
                if (j5 > 0) {
                    qVar.E(j5 + j4);
                } else {
                    qVar.E(j4);
                }
            }
            qVar.m(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    @Override // p1.q
    public final void v(View view) {
        super.v(view);
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.v.get(i4)).v(view);
        }
    }

    @Override // p1.q
    public final void x(View view) {
        for (int i4 = 0; i4 < this.v.size(); i4++) {
            ((q) this.v.get(i4)).x(view);
        }
        this.f14778d.remove(view);
    }

    @Override // p1.q
    public final void y(View view) {
        super.y(view);
        int size = this.v.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.v.get(i4)).y(view);
        }
    }

    @Override // p1.q
    public final void z() {
        if (this.v.isEmpty()) {
            F();
            n();
            return;
        }
        g gVar = new g();
        gVar.f14755b = this;
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((q) obj).a(gVar);
        }
        this.f14799x = this.v.size();
        if (this.f14798w) {
            ArrayList arrayList2 = this.v;
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                ((q) obj2).z();
            }
            return;
        }
        for (int i6 = 1; i6 < this.v.size(); i6++) {
            ((q) this.v.get(i6 - 1)).a(new g(1, (q) this.v.get(i6)));
        }
        q qVar = (q) this.v.get(0);
        if (qVar != null) {
            qVar.z();
        }
    }
}
