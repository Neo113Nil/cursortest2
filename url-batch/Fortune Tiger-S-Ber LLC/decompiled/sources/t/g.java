package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f3342m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f3336e = 2;
        } else {
            this.f3336e = 3;
        }
    }

    @Override // t.f
    public final void d(int i4) {
        if (this.f3339j) {
            return;
        }
        this.f3339j = true;
        this.g = i4;
        ArrayList arrayList = this.f3340k;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
