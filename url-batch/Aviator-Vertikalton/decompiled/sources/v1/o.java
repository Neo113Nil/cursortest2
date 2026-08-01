package v1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o extends O0.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final j[] f4500a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4501b;

    public o(j[] jVarArr, int[] iArr) {
        this.f4500a = jVarArr;
        this.f4501b = iArr;
    }

    @Override // O0.d
    public final int a() {
        return this.f4500a.length;
    }

    @Override // O0.d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f4500a[i];
    }

    @Override // O0.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    @Override // O0.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }
}
