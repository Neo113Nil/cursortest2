package w2;

import java.util.Arrays;

/* renamed from: w2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032k extends P {

    /* renamed from: a, reason: collision with root package name */
    public char[] f8674a;

    /* renamed from: b, reason: collision with root package name */
    public int f8675b;

    @Override // w2.P
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f8674a, this.f8675b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        char[] cArr = this.f8674a;
        if (cArr.length < i3) {
            int length = cArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8674a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8675b;
    }
}
