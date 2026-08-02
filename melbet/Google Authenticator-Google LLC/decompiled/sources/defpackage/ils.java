package defpackage;

import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ils {
    public static jkf a(Object obj) {
        return ((jkm) obj).l;
    }

    public static jkf b(Object obj) {
        return ((jkm) obj).b();
    }

    public static void c(jjv jjvVar, Object obj, jkd jkdVar, jkf jkfVar) {
        iwq iwqVar = (iwq) obj;
        jkfVar.k((jko) iwqVar.c, jjvVar.t(iwqVar.a.getClass(), jkdVar));
    }

    public static final void d(Object obj) {
        a(obj).e();
    }

    public static void e(ikk ikkVar, Map.Entry entry) {
        jko jkoVar = (jko) entry.getKey();
        jmr jmrVar = jmr.DOUBLE;
        switch (jkoVar.b.ordinal()) {
            case 0:
                ikkVar.e(jkoVar.a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                ikkVar.i(jkoVar.a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                ikkVar.l(jkoVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                ikkVar.u(jkoVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ikkVar.k(jkoVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                ikkVar.h(jkoVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                ikkVar.g(jkoVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                ikkVar.c(jkoVar.a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                ikkVar.s(jkoVar.a, (String) entry.getValue());
                break;
            case 9:
                ikkVar.j(jkoVar.a, entry.getValue(), jlt.a.b(((jkp) entry.getValue()).getClass()));
                break;
            case 10:
                ikkVar.m(jkoVar.a, entry.getValue(), jlt.a.b(((jkp) entry.getValue()).getClass()));
                break;
            case 11:
                ikkVar.d(jkoVar.a, (jjq) entry.getValue());
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ikkVar.t(jkoVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ikkVar.k(jkoVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ikkVar.o(jkoVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ikkVar.p(jkoVar.a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                ikkVar.q(jkoVar.a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                ikkVar.r(jkoVar.a, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
