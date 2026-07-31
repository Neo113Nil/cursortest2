package w2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8657a;

    /* renamed from: b, reason: collision with root package name */
    public int f8658b;

    @Override // w2.P
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f8657a, this.f8658b);
        Z1.i.e(copyOf, "copyOf(...)");
        return new L1.t(copyOf);
    }

    @Override // w2.P
    public final void b(int i3) {
        int[] iArr = this.f8657a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8657a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8658b;
    }
}
