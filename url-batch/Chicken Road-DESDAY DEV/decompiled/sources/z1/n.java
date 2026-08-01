package z1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends T0.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i[] f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4282b;

    public n(i[] iVarArr, int[] iArr) {
        this.f4281a = iVarArr;
        this.f4282b = iArr;
    }

    @Override // T0.d
    public final int a() {
        return this.f4281a.length;
    }

    @Override // T0.d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f4281a[i];
    }

    @Override // T0.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // T0.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
