package C2;

import java.util.Arrays;

/* renamed from: C2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048k extends P {

    /* renamed from: a, reason: collision with root package name */
    public char[] f761a;

    /* renamed from: b, reason: collision with root package name */
    public int f762b;

    @Override // C2.P
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f761a, this.f762b);
        f2.j.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // C2.P
    public final void b(int i3) {
        char[] cArr = this.f761a;
        if (cArr.length < i3) {
            int length = cArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f761a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f762b;
    }
}
