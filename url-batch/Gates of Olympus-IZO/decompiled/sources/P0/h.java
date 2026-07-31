package P0;

import L1.z;
import java.util.ArrayList;
import r0.G;
import r0.H;

/* loaded from: classes.dex */
public final class h extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, ArrayList arrayList) {
        super(1);
        this.f3041e = i3;
        this.f3042f = arrayList;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f3041e) {
            case 0:
                G g3 = (G) obj;
                ArrayList arrayList = this.f3042f;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    G.f(g3, (H) arrayList.get(i3), 0, 0);
                }
                break;
            case 1:
                G g4 = (G) obj;
                ArrayList arrayList2 = this.f3042f;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    G.d(g4, (H) arrayList2.get(i4), 0, 0);
                }
                break;
            default:
                G g5 = (G) obj;
                ArrayList arrayList3 = this.f3042f;
                int size3 = arrayList3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    G.g(g5, (H) arrayList3.get(i5), 0, 0);
                }
                break;
        }
        return z.f2729a;
    }
}
