package M1;

import H2.AbstractC0080b;
import java.util.RandomAccess;

/* renamed from: M1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142c extends AbstractC0143d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0143d f2791d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2792e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2793f;

    public C0142c(AbstractC0143d abstractC0143d, int i3, int i4) {
        Z1.i.f(abstractC0143d, "list");
        this.f2791d = abstractC0143d;
        this.f2792e = i3;
        I2.d.r(i3, i4, abstractC0143d.b());
        this.f2793f = i4 - i3;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        return this.f2793f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        int i4 = this.f2793f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "index: ", ", size: "));
        }
        return this.f2791d.get(this.f2792e + i3);
    }
}
