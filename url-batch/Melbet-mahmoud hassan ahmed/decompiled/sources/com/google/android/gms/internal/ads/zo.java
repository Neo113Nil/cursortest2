package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zo {

    /* renamed from: h, reason: collision with root package name */
    public static final zo f15200h = new g4().c();

    /* renamed from: i, reason: collision with root package name */
    public static final my3<zo> f15201i = new my3() { // from class: com.google.android.gms.internal.ads.e2
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f15202a;

    /* renamed from: b, reason: collision with root package name */
    public final vj f15203b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final xl f15204c;

    /* renamed from: d, reason: collision with root package name */
    public final th f15205d;

    /* renamed from: e, reason: collision with root package name */
    public final fu f15206e;

    /* renamed from: f, reason: collision with root package name */
    public final k8 f15207f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final ma f15208g;

    /* synthetic */ zo(String str, ma maVar, xl xlVar, th thVar, fu fuVar, yn ynVar) {
        this.f15202a = str;
        this.f15203b = xlVar;
        this.f15204c = xlVar;
        this.f15205d = thVar;
        this.f15206e = fuVar;
        this.f15207f = maVar;
        this.f15208g = maVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo)) {
            return false;
        }
        zo zoVar = (zo) obj;
        return n13.p(this.f15202a, zoVar.f15202a) && this.f15207f.equals(zoVar.f15207f) && n13.p(this.f15203b, zoVar.f15203b) && n13.p(this.f15205d, zoVar.f15205d) && n13.p(this.f15206e, zoVar.f15206e);
    }

    public final int hashCode() {
        int hashCode = this.f15202a.hashCode() * 31;
        vj vjVar = this.f15203b;
        return ((((((hashCode + (vjVar != null ? vjVar.hashCode() : 0)) * 31) + this.f15205d.hashCode()) * 31) + this.f15207f.hashCode()) * 31) + this.f15206e.hashCode();
    }
}
