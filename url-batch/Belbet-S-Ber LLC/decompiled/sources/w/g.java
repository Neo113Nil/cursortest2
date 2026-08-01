package w;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f3759m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f3753e = 2;
        } else {
            this.f3753e = 3;
        }
    }

    @Override // w.f
    public final void d(int i) {
        if (this.f3756j) {
            return;
        }
        this.f3756j = true;
        this.f3755g = i;
        ArrayList arrayList = this.f3757k;
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
