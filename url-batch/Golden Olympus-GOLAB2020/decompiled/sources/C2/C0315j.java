package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0315j extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f298a;

    /* renamed from: b, reason: collision with root package name */
    private int f299b;

    public C0315j(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f298a = bufferWithData;
        this.f299b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        byte[] bArr = this.f298a;
        if (bArr.length < i4) {
            byte[] copyOf = Arrays.copyOf(bArr, kotlin.ranges.g.d(i4, bArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f298a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f299b;
    }

    public final void e(byte b4) {
        A0.c(this, 0, 1, null);
        byte[] bArr = this.f298a;
        int d4 = d();
        this.f299b = d4 + 1;
        bArr[d4] = b4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f298a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
