package T5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Y extends L {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2414a;

    /* renamed from: b, reason: collision with root package name */
    public int f2415b;

    @Override // T5.L
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f2414a, this.f2415b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return new k5.p(copyOf);
    }

    @Override // T5.L
    public final void b(int i7) {
        int[] iArr = this.f2414a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2414a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2415b;
    }
}
