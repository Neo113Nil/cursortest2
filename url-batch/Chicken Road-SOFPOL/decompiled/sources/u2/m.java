package u2;

import a0.a0;
import android.view.View;
import java.util.List;
import q3.l1;
import q3.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends androidx.datastore.preferences.protobuf.j {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f7326f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(1);
        this.f7326f = nVar;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final l1 f(l1 l1Var, List list) {
        n nVar = this.f7326f;
        if (!nVar.f7330o) {
            View childAt = nVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, nVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, nVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return l1Var.f6127a.m(max, max2, max3, max4);
            }
        }
        return l1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final a0 g(u0 u0Var, a0 a0Var) {
        n nVar = this.f7326f;
        if (!nVar.f7330o) {
            View childAt = nVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, nVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, nVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                i3.c b8 = i3.c.b(max, max2, max3, max4);
                int i = b8.f3421a;
                i3.c cVar = (i3.c) a0Var.f11e;
                int i8 = b8.f3422b;
                int i9 = b8.f3423c;
                int i10 = b8.f3424d;
                return new a0(17, l1.b(cVar, i, i8, i9, i10), l1.b((i3.c) a0Var.f12f, i, i8, i9, i10));
            }
        }
        return a0Var;
    }
}
