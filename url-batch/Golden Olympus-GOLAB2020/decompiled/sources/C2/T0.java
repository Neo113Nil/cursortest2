package C2;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class T0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f251a;

    /* renamed from: b, reason: collision with root package name */
    private int f252b;

    public /* synthetic */ T0(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // C2.A0
    public /* bridge */ /* synthetic */ Object a() {
        return W1.u.b(f());
    }

    @Override // C2.A0
    public void b(int i4) {
        if (W1.u.n(this.f251a) < i4) {
            int[] iArr = this.f251a;
            int[] copyOf = Arrays.copyOf(iArr, kotlin.ranges.g.d(i4, W1.u.n(iArr) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f251a = W1.u.e(copyOf);
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f252b;
    }

    public final void e(int i4) {
        A0.c(this, 0, 1, null);
        int[] iArr = this.f251a;
        int d4 = d();
        this.f252b = d4 + 1;
        W1.u.r(iArr, d4, i4);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f251a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return W1.u.e(copyOf);
    }

    private T0(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f251a = bufferWithData;
        this.f252b = W1.u.n(bufferWithData);
        b(10);
    }
}
