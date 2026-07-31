package C2;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Q0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f243a;

    /* renamed from: b, reason: collision with root package name */
    private int f244b;

    public /* synthetic */ Q0(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // C2.A0
    public /* bridge */ /* synthetic */ Object a() {
        return W1.s.b(f());
    }

    @Override // C2.A0
    public void b(int i4) {
        if (W1.s.n(this.f243a) < i4) {
            byte[] bArr = this.f243a;
            byte[] copyOf = Arrays.copyOf(bArr, kotlin.ranges.g.d(i4, W1.s.n(bArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f243a = W1.s.e(copyOf);
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f244b;
    }

    public final void e(byte b4) {
        A0.c(this, 0, 1, null);
        byte[] bArr = this.f243a;
        int d4 = d();
        this.f244b = d4 + 1;
        W1.s.r(bArr, d4, b4);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f243a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return W1.s.e(copyOf);
    }

    private Q0(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f243a = bufferWithData;
        this.f244b = W1.s.n(bufferWithData);
        b(10);
    }
}
