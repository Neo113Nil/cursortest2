package T;

import android.util.SparseBooleanArray;

/* renamed from: T.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095m {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f2805a;

    public C0095m(SparseBooleanArray sparseBooleanArray) {
        this.f2805a = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0095m) {
            return this.f2805a.equals(((C0095m) obj).f2805a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2805a.hashCode();
    }
}
