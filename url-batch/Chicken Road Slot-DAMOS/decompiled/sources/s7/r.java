package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f8959a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8960b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8961c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8962d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8963e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8964f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f8965h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f8966i;
    public final Long j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f8967k;

    public r(String str, String str2, long j, long j3, long j10, long j11, long j12, Long l10, Long l11, Long l12, Boolean bool) {
        c7.c0.d(str);
        c7.c0.d(str2);
        c7.c0.b(j >= 0);
        c7.c0.b(j3 >= 0);
        c7.c0.b(j10 >= 0);
        c7.c0.b(j12 >= 0);
        this.f8959a = str;
        this.f8960b = str2;
        this.f8961c = j;
        this.f8962d = j3;
        this.f8963e = j10;
        this.f8964f = j11;
        this.g = j12;
        this.f8965h = l10;
        this.f8966i = l11;
        this.j = l12;
        this.f8967k = bool;
    }

    public final r a(long j) {
        return new r(this.f8959a, this.f8960b, this.f8961c, this.f8962d, this.f8963e, j, this.g, this.f8965h, this.f8966i, this.j, this.f8967k);
    }

    public final r b(Long l10, Long l11, Boolean bool) {
        return new r(this.f8959a, this.f8960b, this.f8961c, this.f8962d, this.f8963e, this.f8964f, this.g, this.f8965h, l10, l11, bool);
    }
}
