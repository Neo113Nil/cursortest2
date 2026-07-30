package E1;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: i, reason: collision with root package name */
    public final transient int f663i;

    /* renamed from: l, reason: collision with root package name */
    public final transient int f664l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f665m;

    public d(e eVar, int i2, int i5) {
        this.f665m = eVar;
        this.f663i = i2;
        this.f664l = i5;
    }

    @Override // E1.a
    public final Object[] a() {
        return this.f665m.a();
    }

    @Override // E1.a
    public final int b() {
        return this.f665m.b() + this.f663i;
    }

    @Override // E1.a
    public final int c() {
        return this.f665m.b() + this.f663i + this.f664l;
    }

    @Override // E1.e, java.util.List
    /* renamed from: f */
    public final e subList(int i2, int i5) {
        d4.c.Q(i2, i5, this.f664l);
        int i7 = this.f663i;
        return this.f665m.subList(i2 + i7, i5 + i7);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        d4.c.P(i2, this.f664l);
        return this.f665m.get(i2 + this.f663i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f664l;
    }
}
