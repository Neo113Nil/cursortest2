package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xw extends k implements RandomAccess {
    public final t8[] f;
    public final int[] g;

    public xw(t8[] t8VarArr, int[] iArr) {
        this.f = t8VarArr;
        this.g = iArr;
    }

    @Override // defpackage.k
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.k, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof t8) {
            return super.contains((t8) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f[i];
    }

    @Override // defpackage.k, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof t8) {
            return super.indexOf((t8) obj);
        }
        return -1;
    }

    @Override // defpackage.k, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof t8) {
            return super.lastIndexOf((t8) obj);
        }
        return -1;
    }
}
