package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ejt implements ejv {
    private final lgx a;
    private final Comparable b;

    public ejt(lgx lgxVar, Comparable comparable) {
        this.a = lgxVar;
        this.b = comparable;
    }

    @Override // defpackage.ejv
    public final long a() {
        return this.a.c(null);
    }

    @Override // defpackage.ejv
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((ejt) obj).b);
    }
}
