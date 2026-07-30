package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f6957a;

    /* renamed from: b, reason: collision with root package name */
    public int f6958b;

    @Override // o7.q0
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f6957a, this.f6958b);
        r6.k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // o7.q0
    public final void b(int i7) {
        short[] sArr = this.f6957a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6957a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6958b;
    }
}
