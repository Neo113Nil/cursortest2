package z2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f9148m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f9141e = 2;
        } else {
            this.f9141e = 3;
        }
    }

    @Override // z2.f
    public final void d(int i) {
        if (this.f9145j) {
            return;
        }
        this.f9145j = true;
        this.f9143g = i;
        ArrayList arrayList = this.f9146k;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
