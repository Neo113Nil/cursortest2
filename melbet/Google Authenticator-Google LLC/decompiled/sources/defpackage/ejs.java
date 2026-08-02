package defpackage;

import android.util.SparseArray;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ejs implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ejs(int i) {
        this.a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                lgx lgxVar = (lgx) obj;
                return new ejt(lgxVar, eju.c(lgxVar.c == 3 ? (lhg) lgxVar.d : lhg.a));
            case 1:
                return Stream.CC.ofNullable(((cjg) obj).b());
            case 2:
                return eju.d((lfs) obj);
            case 3:
                lgx lgxVar2 = (lgx) obj;
                return new ejt(lgxVar2, eju.d(lgxVar2.c == 1 ? (lfs) lgxVar2.d : lfs.a));
            case 4:
                return eju.c((lhg) obj);
            case 5:
                return ((ejv) obj).b();
            case 6:
                return 9;
            case 7:
                return Long.valueOf(((lhf) obj).n);
            case 8:
                Long l = fbc.a;
                return new Semaphore(1);
            case 9:
                return ((gqs) obj).b.b();
            case 10:
                gwb gwbVar = (gwb) obj;
                new SparseArray();
                int i = hel.d;
                return hoq.ak(gwbVar.c, gwbVar.d, 0.0f, null, his.a, false).c;
            case 11:
                gwb gwbVar2 = (gwb) obj;
                gvy gvyVar = gwbVar2.c;
                gxn a = gxo.a();
                a.f(gvyVar);
                a.e(gwbVar2.d);
                a.d(true);
                return hoq.al(a.a()).a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ?? r8 = ((brn) obj).a;
                heg hegVar = new heg(r8.size());
                hip hipVar = hip.a;
                Collections.sort(r8, hio.a);
                Iterator it = r8.iterator();
                hgk hgkVar = it instanceof hgk ? (hgk) it : new hgk(it);
                while (hgkVar.hasNext()) {
                    hip hipVar2 = (hip) hgkVar.next();
                    while (hgkVar.hasNext()) {
                        if (!hgkVar.b) {
                            hgkVar.c = hgkVar.a.next();
                            hgkVar.b = true;
                        }
                        hip hipVar3 = (hip) hgkVar.c;
                        hoq.F(((hipVar2.b.compareTo(hipVar3.b) < 0 || hipVar2.c.compareTo(hipVar3.c) > 0) ? hipVar3 : hipVar2).b(), "Overlapping ranges not permitted but found %s overlapping %s", hipVar2, hipVar3);
                        hip hipVar4 = (hip) hgkVar.next();
                        hcu hcuVar = hipVar4.b;
                        hcu hcuVar2 = hipVar4.c;
                    }
                    hegVar.h(hipVar2);
                }
                hel g = hegVar.g();
                return g.isEmpty() ? hfj.a : (((his) g).c == 1 && ((hip) hnu.X(g)).equals(hip.a)) ? hfj.b : new hfj(g);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((heg) obj).g();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((hfk) obj).g();
            case 15:
                hhs hhsVar = (hhs) obj;
                Object obj2 = hht.a;
                if (hhsVar.a == null) {
                    throw new NoSuchElementException();
                }
                if (!hhsVar.b.isEmpty()) {
                    throw hhsVar.a(false);
                }
                Object obj3 = hhsVar.a;
                if (obj3 == hht.a) {
                    return null;
                }
                return obj3;
            default:
                hhs hhsVar2 = (hhs) obj;
                if (hhsVar2.b.isEmpty()) {
                    return Optional.ofNullable(hhsVar2.a);
                }
                throw hhsVar2.a(false);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
