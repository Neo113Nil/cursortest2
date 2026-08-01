package p3;

import java.util.RandomAccess;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n extends n2.c implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final i[] f3038f;
    public final int[] g;

    public n(i[] iVarArr, int[] iArr) {
        this.f3038f = iVarArr;
        this.g = iArr;
    }

    @Override // n2.c
    public final int a() {
        return this.f3038f.length;
    }

    @Override // n2.c, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return this.f3038f[i4];
    }

    @Override // n2.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    @Override // n2.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
