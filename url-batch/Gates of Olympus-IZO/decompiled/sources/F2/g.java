package F2;

import A2.q;
import A2.r;
import A2.w;
import A2.y;
import E.G;
import Z1.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final E2.h f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1494c;

    /* renamed from: d, reason: collision with root package name */
    public final G f1495d;

    /* renamed from: e, reason: collision with root package name */
    public final w f1496e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1497f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1498g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1499h;

    /* renamed from: i, reason: collision with root package name */
    public int f1500i;

    public g(E2.h hVar, ArrayList arrayList, int i3, G g3, w wVar, int i4, int i5, int i6) {
        i.f(hVar, "call");
        this.f1492a = hVar;
        this.f1493b = arrayList;
        this.f1494c = i3;
        this.f1495d = g3;
        this.f1496e = wVar;
        this.f1497f = i4;
        this.f1498g = i5;
        this.f1499h = i6;
    }

    public static g a(g gVar, int i3, G g3, w wVar, int i4) {
        if ((i4 & 1) != 0) {
            i3 = gVar.f1494c;
        }
        int i5 = i3;
        if ((i4 & 2) != 0) {
            g3 = gVar.f1495d;
        }
        G g4 = g3;
        if ((i4 & 4) != 0) {
            wVar = gVar.f1496e;
        }
        w wVar2 = wVar;
        int i6 = gVar.f1497f;
        int i7 = gVar.f1498g;
        int i8 = gVar.f1499h;
        gVar.getClass();
        i.f(wVar2, "request");
        return new g(gVar.f1492a, gVar.f1493b, i5, g4, wVar2, i6, i7, i8);
    }

    public final y b(w wVar) {
        i.f(wVar, "request");
        ArrayList arrayList = this.f1493b;
        int size = arrayList.size();
        int i3 = this.f1494c;
        if (i3 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f1500i++;
        G g3 = this.f1495d;
        if (g3 != null) {
            if (!((E2.e) g3.f623c).b((q) wVar.f193b)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must retain the same host and port").toString());
            }
            if (this.f1500i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i3 + 1;
        g a3 = a(this, i4, null, wVar, 58);
        r rVar = (r) arrayList.get(i3);
        y a4 = rVar.a(a3);
        if (a4 == null) {
            throw new NullPointerException("interceptor " + rVar + " returned null");
        }
        if (g3 != null && i4 < arrayList.size() && a3.f1500i != 1) {
            throw new IllegalStateException(("network interceptor " + rVar + " must call proceed() exactly once").toString());
        }
        if (a4.f217j != null) {
            return a4;
        }
        throw new IllegalStateException(("interceptor " + rVar + " returned a response with no body").toString());
    }
}
