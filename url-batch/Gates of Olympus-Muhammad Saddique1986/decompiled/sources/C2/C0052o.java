package C2;

import java.util.Arrays;

/* renamed from: C2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052o extends P {

    /* renamed from: a, reason: collision with root package name */
    public double[] f774a;

    /* renamed from: b, reason: collision with root package name */
    public int f775b;

    @Override // C2.P
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f774a, this.f775b);
        f2.j.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // C2.P
    public final void b(int i3) {
        double[] dArr = this.f774a;
        if (dArr.length < i3) {
            int length = dArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f774a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f775b;
    }
}
