package a8;

import java.util.Arrays;
import q7.C4949r;

/* loaded from: classes2.dex */
public final class a0 extends K {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4463a;

    /* renamed from: b, reason: collision with root package name */
    public int f4464b;

    @Override // a8.K
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f4463a, this.f4464b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new C4949r(copyOf);
    }

    @Override // a8.K
    public final void b(int i) {
        long[] jArr = this.f4463a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4463a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4464b;
    }
}
