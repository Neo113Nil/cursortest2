package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f3537m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f3530e = 2;
        } else {
            this.f3530e = 3;
        }
    }

    @Override // w.f
    public final void d(int i) {
        if (this.f3534j) {
            return;
        }
        this.f3534j = true;
        this.f3532g = i;
        ArrayList arrayList = this.f3535k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
