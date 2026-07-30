package l3;

import android.util.SparseArray;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5934a;

    /* renamed from: b, reason: collision with root package name */
    public v f5935b;

    public u(int i7) {
        this.f5934a = new SparseArray(i7);
    }

    public final void a(v vVar, int i7, int i8) {
        int a3 = vVar.a(i7);
        SparseArray sparseArray = this.f5934a;
        u uVar = sparseArray == null ? null : (u) sparseArray.get(a3);
        if (uVar == null) {
            uVar = new u(1);
            sparseArray.put(vVar.a(i7), uVar);
        }
        if (i8 > i7) {
            uVar.a(vVar, i7 + 1, i8);
        } else {
            uVar.f5935b = vVar;
        }
    }
}
