package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f6916a;

    /* renamed from: b, reason: collision with root package name */
    public int f6917b;

    @Override // o7.q0
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f6916a, this.f6917b);
        r6.k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // o7.q0
    public final void b(int i7) {
        double[] dArr = this.f6916a;
        if (dArr.length < i7) {
            int length = dArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6916a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6917b;
    }
}
