package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f6961a;

    /* renamed from: b, reason: collision with root package name */
    public int f6962b;

    @Override // o7.q0
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f6961a, this.f6962b);
        r6.k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // o7.q0
    public final void b(int i7) {
        int[] iArr = this.f6961a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6961a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6962b;
    }
}
