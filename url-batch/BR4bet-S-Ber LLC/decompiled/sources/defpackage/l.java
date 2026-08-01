package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class l extends m implements RandomAccess {
    public final m f;
    public final int g;
    public final int h;

    public l(m mVar, int i, int i2) {
        this.f = mVar;
        this.g = i;
        xf.h(i, i2, mVar.a());
        this.h = i2 - i;
    }

    @Override // defpackage.m
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(f60.d(i, i2, "index: ", ", size: "));
        }
        return this.f.get(this.g + i);
    }

    @Override // defpackage.m, java.util.List
    public final List subList(int i, int i2) {
        xf.h(i, i2, this.h);
        int i3 = this.g;
        return new l(this.f, i + i3, i3 + i2);
    }
}
