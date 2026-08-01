package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class oz extends m implements RandomAccess {
    public final l9[] f;
    public final int[] g;

    public oz(l9[] l9VarArr, int[] iArr) {
        this.f = l9VarArr;
        this.g = iArr;
    }

    @Override // defpackage.m
    public final int a() {
        return this.f.length;
    }

    @Override // defpackage.m, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l9) {
            return super.contains((l9) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f[i];
    }

    @Override // defpackage.m, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l9) {
            return super.indexOf((l9) obj);
        }
        return -1;
    }

    @Override // defpackage.m, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l9) {
            return super.lastIndexOf((l9) obj);
        }
        return -1;
    }
}
