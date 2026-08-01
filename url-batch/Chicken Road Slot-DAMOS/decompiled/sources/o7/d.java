package o7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: i, reason: collision with root package name */
    public final transient int f7543i;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f7544r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f7545s;

    public d(e eVar, int i3, int i10) {
        this.f7545s = eVar;
        this.f7543i = i3;
        this.f7544r = i10;
    }

    @Override // o7.a
    public final Object[] b() {
        return this.f7545s.b();
    }

    @Override // o7.a
    public final int c() {
        return this.f7545s.c() + this.f7543i;
    }

    @Override // o7.a
    public final int e() {
        return this.f7545s.c() + this.f7543i + this.f7544r;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        a.a.f0(i3, this.f7544r);
        return this.f7545s.get(i3 + this.f7543i);
    }

    @Override // o7.e, java.util.List
    /* renamed from: h */
    public final e subList(int i3, int i10) {
        a.a.g0(i3, i10, this.f7544r);
        int i11 = this.f7543i;
        return this.f7545s.subList(i3 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7544r;
    }
}
