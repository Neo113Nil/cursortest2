package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class T extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f249a;

    /* renamed from: b, reason: collision with root package name */
    private int f250b;

    public T(int[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f249a = bufferWithData;
        this.f250b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        int[] iArr = this.f249a;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, kotlin.ranges.g.d(i4, iArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f249a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f250b;
    }

    public final void e(int i4) {
        A0.c(this, 0, 1, null);
        int[] iArr = this.f249a;
        int d4 = d();
        this.f250b = d4 + 1;
        iArr[d4] = i4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f249a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
