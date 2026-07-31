package T5;

import java.util.Arrays;

/* renamed from: T5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194j extends L {

    /* renamed from: a, reason: collision with root package name */
    public char[] f2442a;

    /* renamed from: b, reason: collision with root package name */
    public int f2443b;

    @Override // T5.L
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f2442a, this.f2443b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // T5.L
    public final void b(int i7) {
        char[] cArr = this.f2442a;
        if (cArr.length < i7) {
            int length = cArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2442a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2443b;
    }
}
