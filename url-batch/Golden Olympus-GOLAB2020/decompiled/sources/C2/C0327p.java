package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: C2.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0327p extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private char[] f315a;

    /* renamed from: b, reason: collision with root package name */
    private int f316b;

    public C0327p(char[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f315a = bufferWithData;
        this.f316b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        char[] cArr = this.f315a;
        if (cArr.length < i4) {
            char[] copyOf = Arrays.copyOf(cArr, kotlin.ranges.g.d(i4, cArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f315a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f316b;
    }

    public final void e(char c4) {
        A0.c(this, 0, 1, null);
        char[] cArr = this.f315a;
        int d4 = d();
        this.f316b = d4 + 1;
        cArr[d4] = c4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f315a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
