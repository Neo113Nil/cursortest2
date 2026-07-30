package a8;

import java.util.Arrays;
import q7.C4947p;

/* loaded from: classes2.dex */
public final class X extends K {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4458a;

    /* renamed from: b, reason: collision with root package name */
    public int f4459b;

    @Override // a8.K
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f4458a, this.f4459b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new C4947p(copyOf);
    }

    @Override // a8.K
    public final void b(int i) {
        int[] iArr = this.f4458a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4458a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4459b;
    }
}
