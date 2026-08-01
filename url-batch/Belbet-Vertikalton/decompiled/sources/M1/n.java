package M1;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends X0.e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final i[] f841a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f842b;

    public n(i[] iVarArr, int[] iArr) {
        this.f841a = iVarArr;
        this.f842b = iArr;
    }

    @Override // X0.e
    public final int a() {
        return this.f841a.length;
    }

    @Override // X0.e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f841a[i];
    }

    @Override // X0.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // X0.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
