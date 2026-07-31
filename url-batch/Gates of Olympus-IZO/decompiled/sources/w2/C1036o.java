package w2;

import java.util.Arrays;

/* renamed from: w2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036o extends P {

    /* renamed from: a, reason: collision with root package name */
    public double[] f8687a;

    /* renamed from: b, reason: collision with root package name */
    public int f8688b;

    @Override // w2.P
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f8687a, this.f8688b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        double[] dArr = this.f8687a;
        if (dArr.length < i3) {
            int length = dArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8687a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8688b;
    }
}
