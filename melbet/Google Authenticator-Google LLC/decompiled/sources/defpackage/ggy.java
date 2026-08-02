package defpackage;

import android.util.Base64;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ggy implements kri {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ggy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, koe] */
    @Override // defpackage.kri
    public final Object a() {
        switch (this.b) {
            case 0:
                jjq r = jjq.r(Base64.decode((String) this.a, 3));
                r.getClass();
                return r;
            case 1:
                return this.a;
            case 2:
                return new ConcurrentHashMap(((jrt) ((fym) this.a).c).a.size(), 0.75f, 4);
            case 3:
                Object a = ((ety) this.a).a();
                if (a instanceof jjq) {
                    return (jjq) a;
                }
                a.getClass();
                jjq r2 = jjq.r((byte[]) a);
                r2.getClass();
                return r2;
            case 4:
                ghn ghnVar = (ghn) this.a;
                return Boolean.valueOf(ghnVar.c.contains(ghnVar.r));
            case 5:
                ghn ghnVar2 = (ghn) this.a;
                return ghnVar2.f.f.c(ghnVar2.w.e(ghnVar2.g));
            case 6:
                ggk ggkVar = (ggk) this.a;
                jjq jjqVar = ggkVar.c == 5 ? (jjq) ggkVar.d : jjq.d;
                jjqVar.getClass();
                return jjqVar;
            case 7:
                return (iee) this.a.b();
            case 8:
                return this.a.b();
            case 9:
                return this.a.b();
            case 10:
                return Boolean.valueOf(((idq) this.a).a.f());
            case 11:
                ifv ifvVar = ifv.a;
                Object b = this.a.b();
                b.getClass();
                return (iwq) ((Optional) b).orElse(null);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Boolean.valueOf(((kbg) this.a).h());
            default:
                return this.a;
        }
    }
}
