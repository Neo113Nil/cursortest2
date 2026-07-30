package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067g extends L {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8785a;

    /* renamed from: b, reason: collision with root package name */
    public int f8786b;

    @Override // z6.L
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f8785a, this.f8786b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        byte[] bArr = this.f8785a;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8785a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8786b;
    }
}
