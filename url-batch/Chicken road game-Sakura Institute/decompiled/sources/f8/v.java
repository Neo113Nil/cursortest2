package f8;

import java.util.RandomAccess;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends e6.d implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final i[] f3643f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3644g;

    public v(i[] iVarArr, int[] iArr) {
        this.f3643f = iVarArr;
        this.f3644g = iArr;
    }

    @Override // e6.a
    public final int a() {
        return this.f3643f.length;
    }

    @Override // e6.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f3643f[i7];
    }

    @Override // e6.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // e6.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
