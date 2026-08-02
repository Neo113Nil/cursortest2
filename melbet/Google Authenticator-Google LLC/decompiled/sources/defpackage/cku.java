package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.WeakHashMap;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cku extends cjg {
    public static final WeakHashMap b = new WeakHashMap();
    public final clc c;
    private final ckz d;

    public cku(int i, cjj cjjVar, ckz ckzVar) {
        int i2 = cjjVar.d;
        int i3 = i2 <= 0 ? 35 : i2;
        int i4 = cjjVar.e;
        this.c = new clc(i - 2, cjjVar.c, i3, i4 <= 0 ? i3 : i4, cjjVar.f);
        this.d = ckzVar;
    }

    @Override // defpackage.cjg
    public final hvi a(cjw cjwVar) {
        cld cldVar;
        hvi f;
        clc clcVar = this.c;
        if (clcVar.b <= 0.0d) {
            return hnu.aJ(cjx.a);
        }
        Instant instant = cjwVar.a;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            cldVar = (cld) weakHashMap.get(Integer.valueOf(clcVar.hashCode()));
        }
        if (cldVar == null || !instant.isBefore(cldVar.a())) {
            hvi d = dih.d(this.d.a(this.c));
            ckt cktVar = new ckt(this, 0);
            huf hufVar = huf.a;
            hnu.aS(d, cktVar, hufVar);
            f = hti.f(d, new cvr(1), hufVar);
        } else {
            f = hnu.aJ(Boolean.valueOf(cldVar.a));
        }
        return hti.f(f, new ccb(this, 4), huf.a);
    }

    @Override // defpackage.cjg
    public final jok b() {
        cld cldVar;
        jkj k = joi.a.k();
        if (!k.b.M()) {
            k.t();
        }
        clc clcVar = this.c;
        jkp jkpVar = k.b;
        joi joiVar = (joi) jkpVar;
        joiVar.b |= 1;
        joiVar.c = (float) clcVar.b;
        if (!jkpVar.M()) {
            k.t();
        }
        int i = clcVar.c;
        jkp jkpVar2 = k.b;
        joi joiVar2 = (joi) jkpVar2;
        joiVar2.b |= 2;
        joiVar2.d = i;
        int i2 = clcVar.d;
        if (!jkpVar2.M()) {
            k.t();
        }
        joi joiVar3 = (joi) k.b;
        int i3 = 8;
        joiVar3.b |= 8;
        joiVar3.f = i2;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            cldVar = (cld) weakHashMap.get(Integer.valueOf(clcVar.hashCode()));
        }
        if (cldVar != null) {
            int ba = hnu.ba(ChronoUnit.DAYS.between(cldVar.a().minus(Duration.ofDays(this.c.c)), Instant.now()));
            if (!k.b.M()) {
                k.t();
            }
            joi joiVar4 = (joi) k.b;
            joiVar4.b |= 4;
            joiVar4.e = ba;
        }
        int i4 = this.c.a;
        if (i4 != 0) {
            switch (i4) {
                case 4:
                    i3 = 6;
                    break;
                case 5:
                    i3 = 7;
                    break;
                case 6:
                    break;
                case 7:
                    i3 = 9;
                    break;
                case 8:
                    i3 = 10;
                    break;
                case 9:
                    i3 = 11;
                    break;
                case 10:
                    i3 = 12;
                    break;
                case 11:
                    i3 = 13;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    i3 = 14;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    i3 = 15;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    i3 = 16;
                    break;
                case 15:
                    i3 = 17;
                    break;
                case 16:
                    i3 = 18;
                    break;
                case 17:
                    i3 = 19;
                    break;
                case 18:
                    i3 = 20;
                    break;
                default:
                    switch (i4) {
                        case 100000:
                            i3 = 100002;
                            break;
                        case 100001:
                            i3 = 100003;
                            break;
                        case 100002:
                            i3 = 100004;
                            break;
                        case 100003:
                            i3 = 100005;
                            break;
                        case 100004:
                            i3 = 100006;
                            break;
                        case 100005:
                            i3 = 100007;
                            break;
                        case 100006:
                            i3 = 100008;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
            }
        } else {
            i3 = 2;
        }
        int i5 = i3 != 0 ? i3 : 0;
        if (i5 == 0) {
            i5 = 2;
        }
        jkj k2 = jok.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        jok jokVar = (jok) k2.b;
        jokVar.c = imo.a(i5);
        jokVar.b |= 1;
        if (!k2.b.M()) {
            k2.t();
        }
        jok jokVar2 = (jok) k2.b;
        joi joiVar5 = (joi) k.q();
        joiVar5.getClass();
        jokVar2.d = joiVar5;
        jokVar2.b |= 2;
        return (jok) k2.q();
    }
}
