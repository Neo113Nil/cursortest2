package h0;

import android.util.SparseArray;

/* renamed from: h0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146L {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2924a;

    /* renamed from: b, reason: collision with root package name */
    public int f2925b;

    public final C0145K a(int i) {
        SparseArray sparseArray = this.f2924a;
        C0145K c0145k = (C0145K) sparseArray.get(i);
        if (c0145k != null) {
            return c0145k;
        }
        C0145K c0145k2 = new C0145K();
        sparseArray.put(i, c0145k2);
        return c0145k2;
    }
}
