package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626e extends AbstractC0627f implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0627f f6128e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6129i;

    /* renamed from: l, reason: collision with root package name */
    public final int f6130l;

    public C0626e(AbstractC0627f list, int i2, int i5) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f6128e = list;
        this.f6129i = i2;
        C0624c c0624c = AbstractC0627f.f6131d;
        int a7 = list.a();
        c0624c.getClass();
        C0624c.d(i2, i5, a7);
        this.f6130l = i5 - i2;
    }

    @Override // kotlin.collections.AbstractC0622a
    public final int a() {
        return this.f6130l;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0627f.f6131d.getClass();
        C0624c.b(i2, this.f6130l);
        return this.f6128e.get(this.f6129i + i2);
    }

    @Override // kotlin.collections.AbstractC0627f, java.util.List
    public final List subList(int i2, int i5) {
        AbstractC0627f.f6131d.getClass();
        C0624c.d(i2, i5, this.f6130l);
        int i7 = this.f6129i;
        return new C0626e(this.f6128e, i2 + i7, i7 + i5);
    }
}
