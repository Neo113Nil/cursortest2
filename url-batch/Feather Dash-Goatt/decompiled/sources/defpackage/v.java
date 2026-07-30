package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v extends w implements RandomAccess {
    public final w e;
    public final int g;
    public final int h;

    public v(w wVar, int i, int i2) {
        this.e = wVar;
        this.g = i;
        s sVar = w.d;
        int a = wVar.a();
        sVar.getClass();
        s.c(i, i2, a);
        this.h = i2 - i;
    }

    @Override // defpackage.m
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        w.d.getClass();
        s.a(i, this.h);
        return this.e.get(this.g + i);
    }

    @Override // defpackage.w, java.util.List
    public final List subList(int i, int i2) {
        w.d.getClass();
        s.c(i, i2, this.h);
        int i3 = this.g;
        return new v(this.e, i + i3, i3 + i2);
    }
}
