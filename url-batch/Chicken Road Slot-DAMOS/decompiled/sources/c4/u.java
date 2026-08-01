package c4;

import android.util.SparseArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1788a;

    /* renamed from: b, reason: collision with root package name */
    public x f1789b;

    public u(int i3) {
        this.f1788a = new SparseArray(i3);
    }

    public final void a(x xVar, int i3, int i10) {
        int a9 = xVar.a(i3);
        SparseArray sparseArray = this.f1788a;
        u uVar = sparseArray == null ? null : (u) sparseArray.get(a9);
        if (uVar == null) {
            uVar = new u(1);
            sparseArray.put(xVar.a(i3), uVar);
        }
        if (i10 > i3) {
            uVar.a(xVar, i3 + 1, i10);
        } else {
            uVar.f1789b = xVar;
        }
    }
}
