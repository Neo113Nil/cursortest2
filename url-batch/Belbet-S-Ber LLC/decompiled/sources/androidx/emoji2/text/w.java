package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f481a;

    /* renamed from: b, reason: collision with root package name */
    public z f482b;

    public w(int i) {
        this.f481a = new SparseArray(i);
    }

    public final void a(z zVar, int i, int i4) {
        int a5 = zVar.a(i);
        SparseArray sparseArray = this.f481a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(a5);
        if (wVar == null) {
            wVar = new w(1);
            sparseArray.put(zVar.a(i), wVar);
        }
        if (i4 > i) {
            wVar.a(zVar, i + 1, i4);
        } else {
            wVar.f482b = zVar;
        }
    }
}
