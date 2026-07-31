package T5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q extends L {

    /* renamed from: a, reason: collision with root package name */
    public short[] f2402a;

    /* renamed from: b, reason: collision with root package name */
    public int f2403b;

    @Override // T5.L
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f2402a, this.f2403b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // T5.L
    public final void b(int i7) {
        short[] sArr = this.f2402a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2402a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2403b;
    }
}
