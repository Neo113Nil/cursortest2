package a8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class P extends K {

    /* renamed from: a, reason: collision with root package name */
    public short[] f4446a;

    /* renamed from: b, reason: collision with root package name */
    public int f4447b;

    @Override // a8.K
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f4446a, this.f4447b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        short[] sArr = this.f4446a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4446a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4447b;
    }
}
