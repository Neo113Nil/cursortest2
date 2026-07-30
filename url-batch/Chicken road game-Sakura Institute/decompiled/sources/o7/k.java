package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f6898a;

    /* renamed from: b, reason: collision with root package name */
    public int f6899b;

    @Override // o7.q0
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f6898a, this.f6899b);
        r6.k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // o7.q0
    public final void b(int i7) {
        char[] cArr = this.f6898a;
        if (cArr.length < i7) {
            int length = cArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6898a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6899b;
    }
}
