package g4;

import java.util.List;
import java.util.RandomAccess;
import u1.AbstractC1477a;

/* renamed from: g4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458c extends AbstractC0459d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0459d f5740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5742c;

    public C0458c(AbstractC0459d list, int i2, int i3) {
        kotlin.jvm.internal.i.e(list, "list");
        this.f5740a = list;
        this.f5741b = i2;
        AbstractC1477a.d(i2, i3, list.c());
        this.f5742c = i3 - i2;
    }

    @Override // g4.AbstractC0456a
    public final int c() {
        return this.f5742c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f5742c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(B0.o.h("index: ", i2, i3, ", size: "));
        }
        return this.f5740a.get(this.f5741b + i2);
    }

    @Override // g4.AbstractC0459d, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC1477a.d(i2, i3, this.f5742c);
        int i6 = this.f5741b;
        return new C0458c(this.f5740a, i2 + i6, i6 + i3);
    }
}
