package T5;

import java.util.Arrays;

/* renamed from: T5.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202s extends L {

    /* renamed from: a, reason: collision with root package name */
    public float[] f2460a;

    /* renamed from: b, reason: collision with root package name */
    public int f2461b;

    @Override // T5.L
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f2460a, this.f2461b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // T5.L
    public final void b(int i7) {
        float[] fArr = this.f2460a;
        if (fArr.length < i7) {
            int length = fArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2460a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2461b;
    }
}
