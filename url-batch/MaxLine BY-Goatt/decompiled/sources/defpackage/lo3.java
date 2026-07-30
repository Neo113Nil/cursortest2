package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.firebase.encoders.json.BuildConfig;
import defpackage.l5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lo3 extends vp3 {
    public final HashMap p;
    public final li3 q;
    public final li3 r;
    public final li3 s;
    public final li3 t;
    public final li3 u;
    public final li3 v;

    public lo3(oq3 oq3Var) {
        super(oq3Var);
        this.p = new HashMap();
        qi3 qi3Var = ((pj3) this.m).q;
        pj3.k(qi3Var);
        this.q = new li3(qi3Var, "last_delete_stale", 0L);
        qi3 qi3Var2 = ((pj3) this.m).q;
        pj3.k(qi3Var2);
        this.r = new li3(qi3Var2, "last_delete_stale_batch", 0L);
        qi3 qi3Var3 = ((pj3) this.m).q;
        pj3.k(qi3Var3);
        this.s = new li3(qi3Var3, "backoff", 0L);
        qi3 qi3Var4 = ((pj3) this.m).q;
        pj3.k(qi3Var4);
        this.t = new li3(qi3Var4, "last_upload", 0L);
        qi3 qi3Var5 = ((pj3) this.m).q;
        pj3.k(qi3Var5);
        this.u = new li3(qi3Var5, "last_upload_attempt", 0L);
        qi3 qi3Var6 = ((pj3) this.m).q;
        pj3.k(qi3Var6);
        this.v = new li3(qi3Var6, "midnight_offset", 0L);
    }

    public final Pair A(String str) {
        ko3 ko3Var;
        l5.a aVar;
        v();
        pj3 pj3Var = (pj3) this.m;
        qb2 qb2Var = pj3Var.w;
        ec3 ec3Var = pj3Var.p;
        qb2Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.p;
        ko3 ko3Var2 = (ko3) hashMap.get(str);
        if (ko3Var2 != null && elapsedRealtime < ko3Var2.c) {
            return new Pair(ko3Var2.a, Boolean.valueOf(ko3Var2.b));
        }
        long D = ec3Var.D(str, ug3.b) + elapsedRealtime;
        try {
            try {
                aVar = l5.a(pj3Var.m);
            } catch (PackageManager.NameNotFoundException unused) {
                if (ko3Var2 != null && elapsedRealtime < ko3Var2.c + ec3Var.D(str, ug3.c)) {
                    return new Pair(ko3Var2.a, Boolean.valueOf(ko3Var2.b));
                }
                aVar = null;
            }
        } catch (Exception e) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.y.c(e, "Unable to get advertising id");
            ko3Var = new ko3(BuildConfig.FLAVOR, D, false);
        }
        if (aVar == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = aVar.a;
        ko3Var = str2 != null ? new ko3(str2, D, aVar.b) : new ko3(BuildConfig.FLAVOR, D, aVar.b);
        hashMap.put(str, ko3Var);
        return new Pair(ko3Var.a, Boolean.valueOf(ko3Var.b));
    }

    public final String B(String str, boolean z) {
        v();
        String str2 = z ? (String) A(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest N = zq3.N();
        if (N == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, N.digest(str2.getBytes())));
    }

    @Override // defpackage.vp3
    public final void z() {
    }
}
