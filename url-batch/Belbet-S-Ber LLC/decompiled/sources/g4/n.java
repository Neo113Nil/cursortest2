package g4;

import java.util.RandomAccess;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n extends x2.c implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final i[] f1945f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1946g;

    public n(i[] iVarArr, int[] iArr) {
        this.f1945f = iVarArr;
        this.f1946g = iArr;
    }

    @Override // x2.c
    public final int a() {
        return this.f1945f.length;
    }

    @Override // x2.c, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f1945f[i];
    }

    @Override // x2.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // x2.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
