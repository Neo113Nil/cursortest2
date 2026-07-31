package A2;

import E.G;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final w f211d;

    /* renamed from: e, reason: collision with root package name */
    public final v f212e;

    /* renamed from: f, reason: collision with root package name */
    public final String f213f;

    /* renamed from: g, reason: collision with root package name */
    public final int f214g;

    /* renamed from: h, reason: collision with root package name */
    public final m f215h;

    /* renamed from: i, reason: collision with root package name */
    public final o f216i;

    /* renamed from: j, reason: collision with root package name */
    public final z f217j;

    /* renamed from: k, reason: collision with root package name */
    public final y f218k;

    /* renamed from: l, reason: collision with root package name */
    public final y f219l;

    /* renamed from: m, reason: collision with root package name */
    public final y f220m;

    /* renamed from: n, reason: collision with root package name */
    public final long f221n;

    /* renamed from: o, reason: collision with root package name */
    public final long f222o;
    public final G p;

    public y(w wVar, v vVar, String str, int i3, m mVar, o oVar, z zVar, y yVar, y yVar2, y yVar3, long j3, long j4, G g3) {
        Z1.i.f(wVar, "request");
        Z1.i.f(vVar, "protocol");
        Z1.i.f(str, "message");
        this.f211d = wVar;
        this.f212e = vVar;
        this.f213f = str;
        this.f214g = i3;
        this.f215h = mVar;
        this.f216i = oVar;
        this.f217j = zVar;
        this.f218k = yVar;
        this.f219l = yVar2;
        this.f220m = yVar3;
        this.f221n = j3;
        this.f222o = j4;
        this.p = g3;
    }

    public static String a(y yVar, String str) {
        yVar.getClass();
        String b2 = yVar.f216i.b(str);
        if (b2 == null) {
            return null;
        }
        return b2;
    }

    public final x b() {
        x xVar = new x();
        xVar.f198a = this.f211d;
        xVar.f199b = this.f212e;
        xVar.f200c = this.f214g;
        xVar.f201d = this.f213f;
        xVar.f202e = this.f215h;
        xVar.f203f = this.f216i.d();
        xVar.f204g = this.f217j;
        xVar.f205h = this.f218k;
        xVar.f206i = this.f219l;
        xVar.f207j = this.f220m;
        xVar.f208k = this.f221n;
        xVar.f209l = this.f222o;
        xVar.f210m = this.p;
        return xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f217j;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f212e + ", code=" + this.f214g + ", message=" + this.f213f + ", url=" + ((q) this.f211d.f193b) + '}';
    }
}
