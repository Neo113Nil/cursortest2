package j$.time.format;

import java.util.Locale;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class n implements g {
    public final j$.time.temporal.n a;
    public final w b;
    public final c c;
    public volatile j d;

    public n(j$.time.temporal.n nVar, w wVar, c cVar) {
        this.a = nVar;
        this.b = wVar;
        this.c = cVar;
    }

    @Override // j$.time.format.g
    public final boolean f(q qVar, StringBuilder sb) {
        String a;
        Long a2 = qVar.a(this.a);
        if (a2 == null) {
            return false;
        }
        j$.time.chrono.a aVar = (j$.time.chrono.a) ((j$.time.temporal.k) qVar.c).k(j$.time.temporal.o.b);
        if (aVar == null || aVar == j$.time.chrono.s.c) {
            c cVar = this.c;
            long longValue = a2.longValue();
            w wVar = this.b;
            Locale locale = ((a) qVar.d).b;
            a = cVar.a.a(longValue, wVar);
        } else {
            c cVar2 = this.c;
            long longValue2 = a2.longValue();
            w wVar2 = this.b;
            Locale locale2 = ((a) qVar.d).b;
            a = cVar2.a.a(longValue2, wVar2);
        }
        if (a != null) {
            sb.append(a);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.a, 1, 19, v.NORMAL);
        }
        return this.d.f(qVar, sb);
    }

    public final String toString() {
        w wVar = w.FULL;
        w wVar2 = this.b;
        j$.time.temporal.n nVar = this.a;
        if (wVar2 == wVar) {
            return "Text(" + String.valueOf(nVar) + ")";
        }
        return "Text(" + String.valueOf(nVar) + "," + String.valueOf(wVar2) + ")";
    }
}
