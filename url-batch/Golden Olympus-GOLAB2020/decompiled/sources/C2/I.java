package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class I extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private float[] f214a;

    /* renamed from: b, reason: collision with root package name */
    private int f215b;

    public I(float[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f214a = bufferWithData;
        this.f215b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        float[] fArr = this.f214a;
        if (fArr.length < i4) {
            float[] copyOf = Arrays.copyOf(fArr, kotlin.ranges.g.d(i4, fArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f214a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f215b;
    }

    public final void e(float f4) {
        A0.c(this, 0, 1, null);
        float[] fArr = this.f214a;
        int d4 = d();
        this.f215b = d4 + 1;
        fArr[d4] = f4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f214a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
