package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpg implements htr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bpg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v50, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v51, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v52, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v53, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v54, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        hqs hqsVar;
        hqs hqsVar2;
        int i = 1;
        switch (this.c) {
            case 0:
                Object obj2 = this.b;
                final bpr bprVar = (bpr) this.a;
                final String str = (String) obj2;
                return bprVar.e.p(new fds() { // from class: bpj
                    @Override // defpackage.fds
                    public final Object a(fwm fwmVar) {
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        sb.append("SELECT * FROM otp_table WHERE unique_id = ?");
                        arrayList.add(str);
                        Cursor p = fwmVar.p(exf.q(sb, arrayList));
                        bpr bprVar2 = bpr.this;
                        try {
                            if (!p.moveToFirst()) {
                                if (p != null) {
                                    p.close();
                                }
                                throw new bpe("Otp not found in the database during a get() query");
                            }
                            bpc a = bprVar2.a(p);
                            if (p != null) {
                                p.close();
                            }
                            return a;
                        } catch (Throwable th) {
                            if (p != null) {
                                try {
                                    p.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                });
            case 1:
                return ((bpr) this.b).e.p(new bpi(this.a, i));
            case 2:
                return ((bpr) this.a).d((String) this.b);
            case 3:
                return ((bpr) this.a).e.p(new bpi(this.b, 3));
            case 4:
                return ((bpr) this.a).d((String) this.b);
            case 5:
                ?? r7 = this.b;
                bpr bprVar2 = (bpr) this.a;
                return bprVar2.e.q(new bpl(bprVar2, (List) r7, 2));
            case 6:
                return ((bpr) this.a).g((String) this.b, Integer.MIN_VALUE);
            case 7:
                Object obj3 = this.a;
                bpr bprVar3 = (bpr) this.b;
                return bprVar3.e.q(new bpl(bprVar3, (bpc) obj3, i));
            case 8:
                Status status = (Status) obj;
                boolean c = status.c();
                Object obj4 = this.a;
                if (c) {
                    jkj k = hqs.a.k();
                    if (!k.b.M()) {
                        k.t();
                    }
                    hqs hqsVar3 = (hqs) k.b;
                    hqsVar3.c = 21;
                    hqsVar3.b = 1 | hqsVar3.b;
                    String a = cch.a(((btc) obj4).b);
                    if (!k.b.M()) {
                        k.t();
                    }
                    hqs hqsVar4 = (hqs) k.b;
                    a.getClass();
                    hqsVar4.b |= 64;
                    hqsVar4.g = a;
                    hqsVar = (hqs) k.q();
                } else {
                    jkj k2 = hqs.a.k();
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    jkp jkpVar = k2.b;
                    hqs hqsVar5 = (hqs) jkpVar;
                    hqsVar5.c = 22;
                    hqsVar5.b = 1 | hqsVar5.b;
                    int i2 = status.f;
                    if (!jkpVar.M()) {
                        k2.t();
                    }
                    hqs hqsVar6 = (hqs) k2.b;
                    hqsVar6.b |= 4;
                    hqsVar6.e = i2;
                    String a2 = cch.a(((btc) obj4).b);
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    hqs hqsVar7 = (hqs) k2.b;
                    a2.getClass();
                    hqsVar7.b |= 64;
                    hqsVar7.g = a2;
                    hqsVar = (hqs) k2.q();
                }
                bov bovVar = ((btc) obj4).c;
                ?? r6 = this.b;
                bovVar.a(hqsVar);
                return r6;
            case 9:
                Status status2 = (Status) obj;
                boolean c2 = status2.c();
                Object obj5 = this.a;
                if (c2) {
                    jkj k3 = hqs.a.k();
                    if (!k3.b.M()) {
                        k3.t();
                    }
                    hqs hqsVar8 = (hqs) k3.b;
                    hqsVar8.c = 23;
                    hqsVar8.b = 1 | hqsVar8.b;
                    String a3 = cch.a(((btc) obj5).b);
                    if (!k3.b.M()) {
                        k3.t();
                    }
                    hqs hqsVar9 = (hqs) k3.b;
                    a3.getClass();
                    hqsVar9.b |= 64;
                    hqsVar9.g = a3;
                    hqsVar2 = (hqs) k3.q();
                } else {
                    jkj k4 = hqs.a.k();
                    if (!k4.b.M()) {
                        k4.t();
                    }
                    jkp jkpVar2 = k4.b;
                    hqs hqsVar10 = (hqs) jkpVar2;
                    hqsVar10.c = 24;
                    hqsVar10.b = 1 | hqsVar10.b;
                    int i3 = status2.f;
                    if (!jkpVar2.M()) {
                        k4.t();
                    }
                    hqs hqsVar11 = (hqs) k4.b;
                    hqsVar11.b |= 4;
                    hqsVar11.e = i3;
                    String a4 = cch.a(((btc) obj5).b);
                    if (!k4.b.M()) {
                        k4.t();
                    }
                    hqs hqsVar12 = (hqs) k4.b;
                    a4.getClass();
                    hqsVar12.b |= 64;
                    hqsVar12.g = a4;
                    hqsVar2 = (hqs) k4.q();
                }
                bov bovVar2 = ((btc) obj5).c;
                ?? r62 = this.b;
                bovVar2.a(hqsVar2);
                return r62;
            case 10:
                return ((bww) this.a).g.f((List) hnu.aR(this.b));
            case 11:
                return ((bww) this.a).g.f((List) hnu.aR(this.b));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return ((Boolean) hnu.aR(this.b)).booleanValue() ? hve.a : ((cba) hnu.bp((Context) ((cbe) this.a).g.a, cba.class)).s().a(new bwv(14), huf.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((AtomicInteger) this.b).incrementAndGet();
                return this.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((cbz) this.a).f.incrementAndGet();
                return this.b;
            case 15:
                ((cbz) this.a).g.incrementAndGet();
                return this.b;
            case 16:
                ((cbz) this.a).d.incrementAndGet();
                return this.b;
            case 17:
                ((cbz) this.a).e.incrementAndGet();
                return this.b;
            case 18:
                cjq cjqVar = (cjq) obj;
                ?? r0 = this.b;
                if (cjqVar != null) {
                    return r0;
                }
                hvi hviVar = ((cjf) this.a).j;
                return hviVar == null ? hnu.aJ(null) : hviVar;
            case 19:
                dop dopVar = (dop) obj;
                if (((ikc) this.b).b.size() > 0) {
                    ikc ikcVar = dopVar.b;
                    if (ikcVar == null) {
                        ikcVar = ikc.a;
                    }
                    if (ikcVar.b.size() == 0) {
                        dok dokVar = (dok) this.a;
                        ehn ehnVar = dokVar.c;
                        ((fcf) ((jdd) ehnVar.b).j).a((Uri) ehnVar.a);
                        return dokVar.d.b();
                    }
                }
                return hnu.aJ(dopVar);
            default:
                gzp gzpVar = (gzp) obj;
                if (!gzpVar.f()) {
                    return hnu.aJ(((dok) this.a).a());
                }
                if (dok.i((dop) this.b)) {
                    return hnu.aJ(gzpVar);
                }
                dih.n((InputStream) gzpVar.b());
                return hnu.aI(new doh());
        }
    }

    public /* synthetic */ bpg(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
