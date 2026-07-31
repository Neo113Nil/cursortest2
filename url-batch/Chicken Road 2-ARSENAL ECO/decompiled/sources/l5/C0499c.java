package l5;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499c extends AbstractC0500d implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0500d f5293f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5294g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5295h;

    public C0499c(AbstractC0500d abstractC0500d, int i7, int i8) {
        this.f5293f = abstractC0500d;
        this.f5294g = i7;
        i6.g.h(i7, i8, abstractC0500d.a());
        this.f5295h = i8 - i7;
    }

    @Override // l5.AbstractC0497a
    public final int a() {
        return this.f5295h;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f5295h;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(C1.c.f(i7, i8, "index: ", ", size: "));
        }
        return this.f5293f.get(this.f5294g + i7);
    }

    @Override // l5.AbstractC0500d, java.util.List
    public final List subList(int i7, int i8) {
        i6.g.h(i7, i8, this.f5295h);
        int i9 = this.f5294g;
        return new C0499c(this.f5293f, i7 + i9, i9 + i8);
    }
}
