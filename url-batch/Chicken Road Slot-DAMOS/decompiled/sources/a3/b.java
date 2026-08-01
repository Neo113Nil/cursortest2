package a3;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import o3.k1;
import o3.q0;
import x3.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends androidx.datastore.preferences.protobuf.i {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f196i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f197r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ViewGroup viewGroup, int i3) {
        super(1);
        this.f196i = i3;
        this.f197r = viewGroup;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final k1 g(k1 k1Var, List list) {
        switch (this.f196i) {
            case 0:
                return ((e0) this.f197r).m(k1Var);
            default:
                b3.n nVar = (b3.n) this.f197r;
                if (nVar.A) {
                    return k1Var;
                }
                View childAt = nVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, nVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, nVar.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? k1Var : k1Var.f7415a.r(max, max2, max3, max4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final c6.e h(q0 q0Var, c6.e eVar) {
        switch (this.f196i) {
            case 0:
                c2.q qVar = (c2.q) ((e0) this.f197r).N.S.f1493d;
                if (!qVar.f1639d0.B) {
                    return eVar;
                }
                long c10 = j0.c(qVar.K(0L));
                int i3 = (int) (c10 >> 32);
                if (i3 < 0) {
                    i3 = 0;
                }
                int i10 = (int) (c10 & 4294967295L);
                if (i10 < 0) {
                    i10 = 0;
                }
                long J = a2.q.h(qVar).J();
                int i11 = (int) (J >> 32);
                int i12 = (int) (J & 4294967295L);
                long j = qVar.f133i;
                long c11 = j0.c(qVar.K((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i13 = i11 - ((int) (c11 >> 32));
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = i12 - ((int) (4294967295L & c11));
                int i15 = i14 >= 0 ? i14 : 0;
                return (i3 == 0 && i10 == 0 && i13 == 0 && i15 == 0) ? eVar : new c6.e(9, n.l((h3.b) eVar.f1814e, i3, i10, i13, i15), n.l((h3.b) eVar.f1815i, i3, i10, i13, i15));
            default:
                b3.n nVar = (b3.n) this.f197r;
                if (nVar.A) {
                    return eVar;
                }
                View childAt = nVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, nVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, nVar.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return eVar;
                }
                h3.b b10 = h3.b.b(max, max2, max3, max4);
                int i16 = b10.f4443a;
                h3.b bVar = (h3.b) eVar.f1814e;
                int i17 = b10.f4444b;
                int i18 = b10.f4445c;
                int i19 = b10.f4446d;
                return new c6.e(9, k1.a(bVar, i16, i17, i18, i19), k1.a((h3.b) eVar.f1815i, i16, i17, i18, i19));
        }
    }
}
