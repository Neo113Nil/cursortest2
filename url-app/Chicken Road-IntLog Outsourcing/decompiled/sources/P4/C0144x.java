package P4;

import java.util.Arrays;

/* renamed from: P4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144x extends K {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2413a;

    /* renamed from: b, reason: collision with root package name */
    public int f2414b;

    @Override // P4.K
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f2413a, this.f2414b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // P4.K
    public final void b(int i2) {
        int[] iArr = this.f2413a;
        if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i2);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2413a = copyOf;
        }
    }

    @Override // P4.K
    public final int d() {
        return this.f2414b;
    }
}
