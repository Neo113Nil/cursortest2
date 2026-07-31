package w2;

import java.util.Arrays;

/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028g extends P {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8662a;

    /* renamed from: b, reason: collision with root package name */
    public int f8663b;

    @Override // w2.P
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f8662a, this.f8663b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        byte[] bArr = this.f8662a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8662a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8663b;
    }
}
