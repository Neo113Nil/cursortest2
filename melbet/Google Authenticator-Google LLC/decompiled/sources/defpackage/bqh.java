package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bqh implements gzf {
    private final /* synthetic */ int a;

    public /* synthetic */ bqh(int i) {
        this.a = i;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return bqz.a(((fuf) obj).b, false);
            case 1:
                return bqz.a(((fuf) obj).b, true);
            case 2:
                return ((fuf) obj).b.c;
            case 3:
                return Integer.valueOf(((bsj) obj).c);
            case 4:
                jkj C = ((bsj) obj).C();
                if (!C.b.M()) {
                    C.t();
                }
                bsj bsjVar = (bsj) C.b;
                bsjVar.b = 1 | bsjVar.b;
                bsjVar.c = -1;
                return (bsj) C.q();
            case 5:
                return Boolean.valueOf(((btj) obj).c);
            case 6:
                return ((fuf) obj).b;
            case 7:
                jkj C2 = ((bti) obj).C();
                if (!C2.b.M()) {
                    C2.t();
                }
                bti btiVar = (bti) C2.b;
                btiVar.b = 1 | btiVar.b;
                btiVar.c = false;
                return (bti) C2.q();
            case 8:
                return Boolean.valueOf(((bti) obj).c);
            case 9:
                return hdb.c((hel) obj).d(new bqh(11)).e();
            case 10:
                return ((cam) obj).b;
            case 11:
                bpb b = ((bpc) obj).b();
                b.h(Instant.now().toEpochMilli());
                return b.a();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return (fuf) hdb.c((List) obj).b(new bwt(2)).g();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                bpb b2 = ((bpc) obj).b();
                b2.i(a.R());
                b2.h(Instant.now().toEpochMilli());
                return b2.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return hdb.c((hel) obj).b(new bwt(0)).e();
            case 15:
                return hdb.c((hel) obj).d(new bqh(10)).e();
            case 16:
                return null;
            case 17:
                heg hegVar = new heg(4);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    hegVar.j((hel) it.next());
                }
                return hegVar.g();
            case 18:
                return hdb.c((hel) obj).d(new bqh(19)).e();
            case 19:
                return ((cam) obj).a;
            default:
                return ((car) obj).g();
        }
    }
}
