package h0;

import T.C0094l;
import java.util.List;
import java.util.Map;
import v2.I;
import v2.f0;

/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: d, reason: collision with root package name */
    public final int f9130d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9131e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9132f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9133g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9134h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9135i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9136j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9137k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9138l;

    /* renamed from: m, reason: collision with root package name */
    public final long f9139m;
    public final long n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9140p;

    /* renamed from: q, reason: collision with root package name */
    public final C0094l f9141q;

    /* renamed from: r, reason: collision with root package name */
    public final I f9142r;

    /* renamed from: s, reason: collision with root package name */
    public final I f9143s;

    /* renamed from: t, reason: collision with root package name */
    public final f0 f9144t;

    /* renamed from: u, reason: collision with root package name */
    public final long f9145u;
    public final k v;

    /* renamed from: w, reason: collision with root package name */
    public final I f9146w;

    public l(int i4, String str, List list, long j4, boolean z, long j5, boolean z4, int i5, long j6, int i6, long j7, long j8, boolean z5, boolean z6, boolean z7, C0094l c0094l, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z5);
        this.f9130d = i4;
        this.f9134h = j5;
        this.f9133g = z;
        this.f9135i = z4;
        this.f9136j = i5;
        this.f9137k = j6;
        this.f9138l = i6;
        this.f9139m = j7;
        this.n = j8;
        this.o = z6;
        this.f9140p = z7;
        this.f9141q = c0094l;
        this.f9142r = I.k(list2);
        this.f9143s = I.k(list3);
        this.f9144t = f0.a(map);
        this.f9146w = I.k(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) v2.r.j(list3);
            this.f9145u = gVar.f9118e + gVar.f9116c;
        } else if (list2.isEmpty()) {
            this.f9145u = 0L;
        } else {
            i iVar = (i) v2.r.j(list2);
            this.f9145u = iVar.f9118e + iVar.f9116c;
        }
        this.f9131e = j4 != -9223372036854775807L ? j4 >= 0 ? Math.min(this.f9145u, j4) : Math.max(0L, this.f9145u + j4) : -9223372036854775807L;
        this.f9132f = j4 >= 0;
        this.v = kVar;
    }

    @Override // l0.InterfaceC1243a
    public final Object a(List list) {
        return this;
    }
}
