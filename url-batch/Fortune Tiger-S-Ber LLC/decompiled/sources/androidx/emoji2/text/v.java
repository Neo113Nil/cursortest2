package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f366a;

    /* renamed from: b, reason: collision with root package name */
    public z f367b;

    public v(int i4) {
        this.f366a = new SparseArray(i4);
    }

    public final void a(z zVar, int i4, int i5) {
        int a4 = zVar.a(i4);
        SparseArray sparseArray = this.f366a;
        v vVar = sparseArray == null ? null : (v) sparseArray.get(a4);
        if (vVar == null) {
            vVar = new v(1);
            sparseArray.put(zVar.a(i4), vVar);
        }
        if (i5 > i4) {
            vVar.a(zVar, i4 + 1, i5);
        } else {
            vVar.f367b = zVar;
        }
    }
}
