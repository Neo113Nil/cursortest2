package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0306e0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f278a;

    /* renamed from: b, reason: collision with root package name */
    private int f279b;

    public C0306e0(long[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f278a = bufferWithData;
        this.f279b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        long[] jArr = this.f278a;
        if (jArr.length < i4) {
            long[] copyOf = Arrays.copyOf(jArr, kotlin.ranges.g.d(i4, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f278a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f279b;
    }

    public final void e(long j4) {
        A0.c(this, 0, 1, null);
        long[] jArr = this.f278a;
        int d4 = d();
        this.f279b = d4 + 1;
        jArr[d4] = j4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f278a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
