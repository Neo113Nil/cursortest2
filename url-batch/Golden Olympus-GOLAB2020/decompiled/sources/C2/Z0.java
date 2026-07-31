package C2;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Z0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f267a;

    /* renamed from: b, reason: collision with root package name */
    private int f268b;

    public /* synthetic */ Z0(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // C2.A0
    public /* bridge */ /* synthetic */ Object a() {
        return W1.z.b(f());
    }

    @Override // C2.A0
    public void b(int i4) {
        if (W1.z.n(this.f267a) < i4) {
            short[] sArr = this.f267a;
            short[] copyOf = Arrays.copyOf(sArr, kotlin.ranges.g.d(i4, W1.z.n(sArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f267a = W1.z.e(copyOf);
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f268b;
    }

    public final void e(short s4) {
        A0.c(this, 0, 1, null);
        short[] sArr = this.f267a;
        int d4 = d();
        this.f268b = d4 + 1;
        W1.z.r(sArr, d4, s4);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f267a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return W1.z.e(copyOf);
    }

    private Z0(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f267a = bufferWithData;
        this.f268b = W1.z.n(bufferWithData);
        b(10);
    }
}
