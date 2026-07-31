package T5;

import java.util.Arrays;

/* renamed from: T5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188d extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f2423a;

    /* renamed from: b, reason: collision with root package name */
    public int f2424b;

    @Override // T5.L
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f2423a, this.f2424b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // T5.L
    public final void b(int i7) {
        boolean[] zArr = this.f2423a;
        if (zArr.length < i7) {
            int length = zArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2423a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2424b;
    }
}
