package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpf implements gzf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bpf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v67, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                String str = ((bpc) obj).g;
                Object obj2 = this.a;
                bpr bprVar = (bpr) obj2;
                return hoq.au(bprVar.d.a(), new bpg(obj2, str, 3), bprVar.b);
            case 1:
                String str2 = ((fuf) obj).b.g;
                if (true == str2.equals("pseudonymous")) {
                    str2 = null;
                }
                boy boyVar = (boy) this.a;
                Context context = boyVar.a;
                List list = cji.n;
                cjd cjdVar = new cjd(context, "AUTHENTICATOR_ANDROID");
                cjdVar.e = boyVar.e;
                cjdVar.d = str2;
                boyVar.f = cjdVar.a();
                return boyVar.f;
            case 2:
                return hel.o(this.a);
            case 3:
                return hel.o(this.a);
            case 4:
                return this.a;
            case 5:
                bqw bqwVar = (bqw) this.a;
                return bqwVar.d.c(bqwVar.o, Instant.now().toEpochMilli());
            case 6:
                return hoq.at(((bsr) hnu.bq(((bss) this.a).b, bsr.class, ((fuf) obj).a)).m().d(), new bqh(5), huf.a);
            case 7:
                return ((bww) this.a).h.a(((fuf) obj).a);
            case 8:
                return hdb.c((hel) obj).d(new bpf(this.a, 10)).e();
            case 9:
                return hdb.c((hel) obj).d(new bqh(13)).e();
            case 10:
                return ((bww) this.a).h.a(((fuf) obj).a);
            case 11:
                return ((bww) this.a).e.b(((fuf) obj).a, false, false);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((bww) this.a).h.a(((fuf) obj).a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((bxb) this.a).a((can) obj);
                return bxe.SYNC_STATUS_NONE;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((bxb) this.a).a((kbt) obj);
                return bxe.FAILED;
            case 15:
                ((bxb) this.a).a((kbr) obj);
                return bxe.FAILED;
            case 16:
                jkj C = ((bxd) obj).C();
                if (!C.b.M()) {
                    C.t();
                }
                Object obj3 = this.a;
                bxd bxdVar = (bxd) C.b;
                bxdVar.c = ((bxe) obj3).e;
                bxdVar.b |= 1;
                return (bxd) C.q();
            case 17:
                return (bpc) ((bya) this.a).g.get(((byj) obj).b);
            case 18:
                return this.a.a(obj);
            case 19:
                return this.a.a(obj);
            default:
                return ((fuf) hdb.c((List) obj).b(new bqg(this.a, 7)).g()).b.c;
        }
    }
}
