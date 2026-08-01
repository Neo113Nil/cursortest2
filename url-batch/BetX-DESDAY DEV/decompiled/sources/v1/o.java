package v1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o extends O0.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final j[] f4504a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4505b;

    public o(j[] jVarArr, int[] iArr) {
        this.f4504a = jVarArr;
        this.f4505b = iArr;
    }

    @Override // O0.d
    public final int a() {
        return this.f4504a.length;
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
        return this.f4504a[i];
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
