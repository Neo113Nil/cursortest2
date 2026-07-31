package T5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public short[] f2428a;

    /* renamed from: b, reason: collision with root package name */
    public int f2429b;

    @Override // T5.L
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f2428a, this.f2429b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return new k5.u(copyOf);
    }

    @Override // T5.L
    public final void b(int i7) {
        short[] sArr = this.f2428a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2428a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2429b;
    }
}
