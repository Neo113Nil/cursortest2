package androidx.emoji2.text;

import android.util.SparseArray;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f364a;

    /* renamed from: b, reason: collision with root package name */
    public z f365b;

    public w(int i) {
        this.f364a = new SparseArray(i);
    }

    public final void a(z zVar, int i, int i4) {
        int a2 = zVar.a(i);
        SparseArray sparseArray = this.f364a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(a2);
        if (wVar == null) {
            wVar = new w(1);
            sparseArray.put(zVar.a(i), wVar);
        }
        if (i4 > i) {
            wVar.a(zVar, i + 1, i4);
        } else {
            wVar.f365b = zVar;
        }
    }
}
