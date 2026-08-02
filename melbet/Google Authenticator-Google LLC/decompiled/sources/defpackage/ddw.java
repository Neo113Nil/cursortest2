package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddw extends cms implements cmw {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ddw(Context context, byte[] bArr, byte[] bArr2) {
        super(context, null, r3, r4, r8.a());
        bxm bxmVar = cji.l;
        cmj cmjVar = cmk.a;
        cmq cmqVar = new cmq();
        cmqVar.b = new ox(null);
    }

    public static boolean p(hvi hviVar) {
        if (hviVar.isDone() && !hviVar.isCancelled()) {
            try {
                a.n(hviVar);
                return true;
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return false;
    }

    public static final ddi r(cjf cjfVar, gzf gzfVar) {
        hvi hviVar;
        jom jomVar;
        jom jomVar2;
        jom jomVar3;
        int i = 1;
        if (cjfVar.k) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            hviVar = hve.a;
        } else {
            cjfVar.k = true;
            cje cjeVar = cjfVar.a;
            cjn cjnVar = cjeVar.j;
            cjp a = cjnVar != null ? cjnVar.a() : null;
            if (a != null && (jomVar = a.b) != (jomVar2 = jom.LOGGER_OVERRIDE_PROVIDER) && jomVar != (jomVar3 = jom.LOGGER_DEFERRING_PROVIDER)) {
                Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + jomVar.toString() + " is not one of the values expected for a logger-level provider: " + String.valueOf(jomVar2) + " or " + String.valueOf(jomVar3));
                a = null;
            }
            if (a == null || a.b != jom.LOGGER_OVERRIDE_PROVIDER) {
                cjp cjpVar = cjfVar.i;
                if (cjpVar != null && cjpVar.b == jom.CPS_APP_PROCESS_GLOBAL_PROVIDER) {
                    cjfVar.a(cjpVar);
                } else if (a != null) {
                    cjfVar.a(a);
                } else if (cjpVar != null) {
                    cjfVar.a(cjpVar);
                }
            } else {
                cjfVar.a(a);
            }
            if (cjeVar.c()) {
                hviVar = hve.a;
            } else {
                hvi aJ = hnu.aJ(null);
                bpg bpgVar = new bpg(cjfVar, aJ, 18);
                huf hufVar = huf.a;
                hviVar = hti.f(hti.g(aJ, bpgVar, hufVar), new ccb(cjfVar, 2), hufVar);
            }
        }
        return p(hviVar) ? (ddi) gzfVar.a(cjfVar) : dja.a(hviVar).a(huf.a, new cke(gzfVar, cjfVar, i));
    }

    public final ddi a() {
        cpa cpaVar = new cpa();
        cpaVar.a = new czc(6);
        cpaVar.c = 4501;
        return super.i(0, cpaVar.a());
    }

    public final void b(dec decVar) {
        cme v = ox.v(decVar, this.f, "dec");
        dds ddsVar = new dds(this, v, ((dea) this.d).b, 0);
        czj czjVar = new czj(this, 5);
        cow cowVar = new cow();
        cowVar.a = ddsVar;
        cowVar.b = czjVar;
        cowVar.f = v;
        cowVar.c = new cli[]{ddr.a};
        cowVar.e = 4507;
        n(cowVar.a());
    }

    public final ddi c() {
        cpa cpaVar = new cpa();
        cpaVar.a = new czc(5);
        cpaVar.c = 3901;
        return super.i(0, cpaVar.a());
    }

    public final ddi d(Uri uri) {
        cxp cxpVar = new cxp(uri);
        cpa cpaVar = new cpa();
        cpaVar.a = new ciu(cxpVar, 16);
        cpaVar.b = new cli[]{cva.c};
        cpaVar.c = 7802;
        return super.i(0, cpaVar.a());
    }

    public final ddi e(Uri uri, int i) {
        cya cyaVar = new cya(uri, i);
        cpa cpaVar = new cpa();
        cpaVar.a = new ciu(cyaVar, 17);
        cpaVar.b = i == 1 ? new cli[]{cva.c} : null;
        cpaVar.c = 7801;
        return super.i(0, cpaVar.a());
    }

    public final ddi f(Uri uri, Uri uri2) {
        cyc cycVar = new cyc(uri, uri2);
        cpa cpaVar = new cpa();
        cpaVar.a = new ciu(cycVar, 15);
        cpaVar.b = new cli[]{cva.d};
        cpaVar.b(false);
        cpaVar.c = 7803;
        return super.i(0, cpaVar.a());
    }

    public final ddi o(cjf cjfVar, cjx cjxVar) {
        ckm.b().d(1007, this.a);
        ckh ckhVar = new ckh(this, cjfVar, this.h, cjxVar);
        super.k(2, ckhVar);
        return oy.av(ckhVar);
    }

    public final void q(ckd ckdVar) {
        if (ckdVar.a.isEmpty()) {
            dih.w(Status.a);
            return;
        }
        cpa cpaVar = new cpa();
        cpaVar.a = new ciu(ckdVar, 2);
        cpaVar.b = new cli[]{cjs.a};
        cpaVar.b(false);
        super.i(2, cpaVar.a());
    }

    public ddw(Context context, byte[] bArr) {
        super(context, null, cxw.a, cmk.a, cmr.a);
    }

    public ddw(Context context) {
        super(context, null, dcf.a, cmk.a, cmr.a);
    }

    public ddw(Context context, dea deaVar) {
        super(context, null, deb.a, deaVar, cmr.a);
    }
}
