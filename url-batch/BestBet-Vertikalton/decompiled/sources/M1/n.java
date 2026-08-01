package M1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends Y0.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i[] f812a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f813b;

    public n(i[] iVarArr, int[] iArr) {
        this.f812a = iVarArr;
        this.f813b = iArr;
    }

    @Override // Y0.d
    public final int a() {
        return this.f812a.length;
    }

    @Override // Y0.d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f812a[i];
    }

    @Override // Y0.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // Y0.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
