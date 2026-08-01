package v1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends Q0.d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i[] f4087a;

    public n(i[] iVarArr) {
        this.f4087a = iVarArr;
    }

    @Override // Q0.d
    public final int a() {
        return this.f4087a.length;
    }

    @Override // Q0.d, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f4087a[i];
    }

    @Override // Q0.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // Q0.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
