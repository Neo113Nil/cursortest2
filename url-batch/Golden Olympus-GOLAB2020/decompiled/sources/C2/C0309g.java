package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0309g extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean[] f282a;

    /* renamed from: b, reason: collision with root package name */
    private int f283b;

    public C0309g(boolean[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f282a = bufferWithData;
        this.f283b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        boolean[] zArr = this.f282a;
        if (zArr.length < i4) {
            boolean[] copyOf = Arrays.copyOf(zArr, kotlin.ranges.g.d(i4, zArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f282a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f283b;
    }

    public final void e(boolean z4) {
        A0.c(this, 0, 1, null);
        boolean[] zArr = this.f282a;
        int d4 = d();
        this.f283b = d4 + 1;
        zArr[d4] = z4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f282a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
