package T5;

import java.util.Arrays;

/* renamed from: T5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191g extends L {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2433a;

    /* renamed from: b, reason: collision with root package name */
    public int f2434b;

    @Override // T5.L
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f2433a, this.f2434b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // T5.L
    public final void b(int i7) {
        byte[] bArr = this.f2433a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2433a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2434b;
    }
}
