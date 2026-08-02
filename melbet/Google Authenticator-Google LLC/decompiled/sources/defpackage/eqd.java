package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqd extends eqc implements ekq, emk {
    public final Context a;
    public final jpt b;
    public final jpt d;
    public final koe e;
    public final fwm h;
    private final emi i;
    private final hvm j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public eqd(ldt ldtVar, Context context, ekv ekvVar, hvm hvmVar, jpt jptVar, jpt jptVar2, koe koeVar, Executor executor, fwm fwmVar) {
        this.h = fwmVar;
        this.i = ldtVar.n(executor, jptVar, koeVar);
        this.a = context;
        this.j = hvmVar;
        this.b = jptVar;
        this.d = jptVar2;
        this.e = koeVar;
        ekvVar.a(this);
    }

    @Override // defpackage.eqc
    public final void a(eqa eqaVar) {
        String str;
        String str2;
        int i;
        if (eqaVar.b <= 0 && eqaVar.c <= 0 && eqaVar.d <= 0 && eqaVar.e <= 0 && (i = eqaVar.v) != 3 && i != 4 && eqaVar.p <= 0) {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).s("skip logging NetworkEvent due to empty bandwidth/latency data");
            hvi hviVar = hve.a;
            return;
        }
        emi emiVar = this.i;
        String str3 = eqaVar.g;
        if (str3 == null || !eqaVar.h) {
            str = eqaVar.f;
        } else {
            str = str3 + "/" + eqaVar.f;
        }
        String str4 = eqaVar.k;
        Pattern pattern = eqb.a;
        if (hoq.S(str)) {
            str = "";
        } else {
            Matcher matcher = eqb.a.matcher(str);
            if (matcher.find()) {
                str = matcher.group(1);
            } else {
                Matcher matcher2 = eqb.c.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.group(1);
                } else {
                    Matcher matcher3 = eqb.b.matcher(str);
                    if (matcher3.find() && str4 != null && !str4.startsWith("application/")) {
                        str = matcher3.group(1);
                    }
                }
            }
        }
        int i2 = eqaVar.s;
        if (i2 != 0) {
            switch (i2) {
                case 1:
                    str2 = "NONE";
                    break;
                case 2:
                    str2 = "MOBILE";
                    break;
                case 3:
                    str2 = "WIFI";
                    break;
                case 4:
                    str2 = "MOBILE_MMS";
                    break;
                case 5:
                    str2 = "MOBILE_SUPL";
                    break;
                case 6:
                    str2 = "MOBILE_DUN";
                    break;
                case 7:
                    str2 = "MOBILE_HIPRI";
                    break;
                case 8:
                    str2 = "WIMAX";
                    break;
                case 9:
                    str2 = "BLUETOOTH";
                    break;
                case 10:
                    str2 = "DUMMY";
                    break;
                case 11:
                    str2 = "ETHERNET";
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    str2 = "MOBILE_FOTA";
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    str2 = "MOBILE_IMS";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str2 = "MOBILE_CBS";
                    break;
                case 15:
                    str2 = "WIFI_P2P";
                    break;
                case 16:
                    str2 = "MOBILE_IA";
                    break;
                case 17:
                    str2 = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str2 = "PROXY";
                    break;
                default:
                    str2 = "VPN";
                    break;
            }
        } else {
            str2 = null;
        }
        gzl gzlVar = new gzl(":");
        eru a = emiVar.a(new gzj(gzlVar, gzlVar).c(new gzk(new Object[]{str2, eqaVar.i}, str, eqaVar.k)));
        if (a.e()) {
            hvi hviVar2 = hve.a;
        } else {
            this.g.incrementAndGet();
            hnu.aN(new cap(this, eqaVar, a, 6), this.j);
        }
    }

    public final hvi b(lgv lgvVar) {
        try {
            gzp gzpVar = ((epz) this.b.b()).b;
        } catch (Exception e) {
            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 192, "NetworkMetricServiceImpl.java")).s("Exception while getting network metric extension!");
        }
        emi emiVar = this.i;
        eme a = emf.a();
        a.f(lgvVar);
        a.b = null;
        return emiVar.b(a.a());
    }

    public final hvi c() {
        if (this.g.get() > 0) {
            cbc cbcVar = new cbc(this, 9);
            hvm hvmVar = this.j;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            hwd hwdVar = new hwd(cbcVar);
            hwdVar.c(new iaq(hvmVar.schedule(hwdVar, 1L, timeUnit), 1), huf.a);
            return hwdVar;
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return hve.a;
            }
            ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return hnu.aN(new bwr(this, arrayList, 6), this.j);
        }
    }

    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        c();
    }

    @Override // defpackage.emk
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.ekq
    public final /* synthetic */ void j(eik eikVar) {
    }
}
