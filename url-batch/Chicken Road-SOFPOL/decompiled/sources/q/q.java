package q;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5894f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, ArrayList arrayList) {
        super(1);
        this.f5893e = i;
        this.f5894f = arrayList;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f5893e) {
            case 0:
                u1.k0 k0Var = (u1.k0) obj;
                ArrayList arrayList = this.f5894f;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    u1.k0.g(k0Var, (u1.l0) arrayList.get(i), 0, 0);
                }
                break;
            case 1:
                u1.k0 k0Var2 = (u1.k0) obj;
                ArrayList arrayList2 = this.f5894f;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    u1.k0.m(k0Var2, (u1.l0) arrayList2.get(i8), 0, 0);
                }
                break;
            default:
                u1.k0 k0Var3 = (u1.k0) obj;
                ArrayList arrayList3 = this.f5894f;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    u1.k0.k(k0Var3, (u1.l0) arrayList3.get(i9), 0, 0);
                }
                break;
        }
        return c6.m.f1757a;
    }
}
