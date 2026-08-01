package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f50 extends n implements RandomAccess {
    public final y9[] f;
    public final int[] g;

    public f50(y9[] y9VarArr, int[] iArr) {
        this.f = y9VarArr;
        this.g = iArr;
    }

    @Override // defpackage.n
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.n, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y9) {
            return super.contains((y9) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f[i];
    }

    @Override // defpackage.n, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof y9) {
            return super.indexOf((y9) obj);
        }
        return -1;
    }

    @Override // defpackage.n, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof y9) {
            return super.lastIndexOf((y9) obj);
        }
        return -1;
    }
}
