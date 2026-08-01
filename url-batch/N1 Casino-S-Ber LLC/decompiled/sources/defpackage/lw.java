package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class lw extends k implements RandomAccess {
    public final y8[] f;
    public final int[] g;

    public lw(y8[] y8VarArr, int[] iArr) {
        this.f = y8VarArr;
        this.g = iArr;
    }

    @Override // defpackage.k
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.k, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y8) {
            return super.contains((y8) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f[i];
    }

    @Override // defpackage.k, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof y8) {
            return super.indexOf((y8) obj);
        }
        return -1;
    }

    @Override // defpackage.k, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof y8) {
            return super.lastIndexOf((y8) obj);
        }
        return -1;
    }
}
