package C2;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class W0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f259a;

    /* renamed from: b, reason: collision with root package name */
    private int f260b;

    public /* synthetic */ W0(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // C2.A0
    public /* bridge */ /* synthetic */ Object a() {
        return W1.w.b(f());
    }

    @Override // C2.A0
    public void b(int i4) {
        if (W1.w.n(this.f259a) < i4) {
            long[] jArr = this.f259a;
            long[] copyOf = Arrays.copyOf(jArr, kotlin.ranges.g.d(i4, W1.w.n(jArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f259a = W1.w.e(copyOf);
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f260b;
    }

    public final void e(long j4) {
        A0.c(this, 0, 1, null);
        long[] jArr = this.f259a;
        int d4 = d();
        this.f260b = d4 + 1;
        W1.w.r(jArr, d4, j4);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f259a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return W1.w.e(copyOf);
    }

    private W0(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f259a = bufferWithData;
        this.f260b = W1.w.n(bufferWithData);
        b(10);
    }
}
