package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b1 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f6860a;

    /* renamed from: b, reason: collision with root package name */
    public int f6861b;

    @Override // o7.q0
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f6860a, this.f6861b);
        r6.k.e(copyOf, "copyOf(...)");
        return new d6.r(copyOf);
    }

    @Override // o7.q0
    public final void b(int i7) {
        byte[] bArr = this.f6860a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6860a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6861b;
    }
}
