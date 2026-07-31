package w2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class X extends P {

    /* renamed from: a, reason: collision with root package name */
    public short[] f8641a;

    /* renamed from: b, reason: collision with root package name */
    public int f8642b;

    @Override // w2.P
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f8641a, this.f8642b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        short[] sArr = this.f8641a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8641a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8642b;
    }
}
