package w2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8667a;

    /* renamed from: b, reason: collision with root package name */
    public int f8668b;

    @Override // w2.P
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f8667a, this.f8668b);
        Z1.i.e(copyOf, "copyOf(...)");
        return new L1.v(copyOf);
    }

    @Override // w2.P
    public final void b(int i3) {
        long[] jArr = this.f8667a;
        if (jArr.length < i3) {
            int length = jArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8667a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8668b;
    }
}
