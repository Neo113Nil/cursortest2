package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class J0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f217a;

    /* renamed from: b, reason: collision with root package name */
    private int f218b;

    public J0(short[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f217a = bufferWithData;
        this.f218b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        short[] sArr = this.f217a;
        if (sArr.length < i4) {
            short[] copyOf = Arrays.copyOf(sArr, kotlin.ranges.g.d(i4, sArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f217a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f218b;
    }

    public final void e(short s4) {
        A0.c(this, 0, 1, null);
        short[] sArr = this.f217a;
        int d4 = d();
        this.f218b = d4 + 1;
        sArr[d4] = s4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f217a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
