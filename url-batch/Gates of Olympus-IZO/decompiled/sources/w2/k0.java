package w2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public short[] f8676a;

    /* renamed from: b, reason: collision with root package name */
    public int f8677b;

    @Override // w2.P
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f8676a, this.f8677b);
        Z1.i.e(copyOf, "copyOf(...)");
        return new L1.y(copyOf);
    }

    @Override // w2.P
    public final void b(int i3) {
        short[] sArr = this.f8676a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8676a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8677b;
    }
}
