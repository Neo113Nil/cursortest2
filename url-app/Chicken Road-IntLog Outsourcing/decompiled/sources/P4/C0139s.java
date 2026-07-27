package P4;

import java.util.Arrays;

/* renamed from: P4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139s extends K {

    /* renamed from: a, reason: collision with root package name */
    public float[] f2397a;

    /* renamed from: b, reason: collision with root package name */
    public int f2398b;

    @Override // P4.K
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f2397a, this.f2398b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        float[] fArr = this.f2397a;
        if (fArr.length < i2) {
            int length = fArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2397a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2398b;
    }
}
