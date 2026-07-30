package defpackage;

import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pb1 implements so2 {
    public final int m;
    public final int n;
    public final lz1 o;
    public int p;

    public pb1(int i, int i2, int i3) {
        this.m = i2;
        this.n = i3;
        int i4 = (i / i2) * i2;
        this.o = new lz1(d.f(Math.max(i4 - i3, 0), i4 + i2 + i3), by1.B);
        this.p = i;
    }

    public final void a(int i) {
        if (i != this.p) {
            this.p = i;
            int i2 = this.m;
            int i3 = (i / i2) * i2;
            int i4 = this.n;
            this.o.setValue(d.f(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.so2
    public final Object getValue() {
        return (IntRange) this.o.getValue();
    }
}
