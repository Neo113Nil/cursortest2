package C1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends W0.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i[] f195a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f196b;

    public n(i[] iVarArr, int[] iArr) {
        this.f195a = iVarArr;
        this.f196b = iArr;
    }

    @Override // W0.d
    public final int a() {
        return this.f195a.length;
    }

    @Override // W0.d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f195a[i];
    }

    @Override // W0.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // W0.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
