package A2;

import E.G;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public w f198a;

    /* renamed from: b, reason: collision with root package name */
    public v f199b;

    /* renamed from: d, reason: collision with root package name */
    public String f201d;

    /* renamed from: e, reason: collision with root package name */
    public m f202e;

    /* renamed from: g, reason: collision with root package name */
    public z f204g;

    /* renamed from: h, reason: collision with root package name */
    public y f205h;

    /* renamed from: i, reason: collision with root package name */
    public y f206i;

    /* renamed from: j, reason: collision with root package name */
    public y f207j;

    /* renamed from: k, reason: collision with root package name */
    public long f208k;

    /* renamed from: l, reason: collision with root package name */
    public long f209l;

    /* renamed from: m, reason: collision with root package name */
    public G f210m;

    /* renamed from: c, reason: collision with root package name */
    public int f200c = -1;

    /* renamed from: f, reason: collision with root package name */
    public n f203f = new n(0);

    public static void b(y yVar, String str) {
        if (yVar != null) {
            if (yVar.f217j != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (yVar.f218k != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (yVar.f219l != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (yVar.f220m != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final y a() {
        int i3 = this.f200c;
        if (i3 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f200c).toString());
        }
        w wVar = this.f198a;
        if (wVar == null) {
            throw new IllegalStateException("request == null");
        }
        v vVar = this.f199b;
        if (vVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f201d;
        if (str != null) {
            return new y(wVar, vVar, str, i3, this.f202e, this.f203f.b(), this.f204g, this.f205h, this.f206i, this.f207j, this.f208k, this.f209l, this.f210m);
        }
        throw new IllegalStateException("message == null");
    }
}
