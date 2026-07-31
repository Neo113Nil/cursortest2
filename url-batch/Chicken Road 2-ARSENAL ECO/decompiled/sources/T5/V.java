package T5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class V extends L {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2409a;

    /* renamed from: b, reason: collision with root package name */
    public int f2410b;

    @Override // T5.L
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f2409a, this.f2410b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return new k5.n(copyOf);
    }

    @Override // T5.L
    public final void b(int i7) {
        byte[] bArr = this.f2409a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2409a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2410b;
    }
}
