package s7;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n3 extends d4 {

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f8874r;

    /* renamed from: s, reason: collision with root package name */
    public final d1 f8875s;

    /* renamed from: t, reason: collision with root package name */
    public final d1 f8876t;

    /* renamed from: u, reason: collision with root package name */
    public final d1 f8877u;

    /* renamed from: v, reason: collision with root package name */
    public final d1 f8878v;

    /* renamed from: w, reason: collision with root package name */
    public final d1 f8879w;

    /* renamed from: x, reason: collision with root package name */
    public final d1 f8880x;

    public n3(j4 j4Var) {
        super(j4Var);
        this.f8874r = new HashMap();
        f1 f1Var = ((q1) this.f1478d).f8936s;
        q1.j(f1Var);
        this.f8875s = new d1(f1Var, "last_delete_stale", 0L);
        f1 f1Var2 = ((q1) this.f1478d).f8936s;
        q1.j(f1Var2);
        this.f8876t = new d1(f1Var2, "last_delete_stale_batch", 0L);
        f1 f1Var3 = ((q1) this.f1478d).f8936s;
        q1.j(f1Var3);
        this.f8877u = new d1(f1Var3, "backoff", 0L);
        f1 f1Var4 = ((q1) this.f1478d).f8936s;
        q1.j(f1Var4);
        this.f8878v = new d1(f1Var4, "last_upload", 0L);
        f1 f1Var5 = ((q1) this.f1478d).f8936s;
        q1.j(f1Var5);
        this.f8879w = new d1(f1Var5, "last_upload_attempt", 0L);
        f1 f1Var6 = ((q1) this.f1478d).f8936s;
        q1.j(f1Var6);
        this.f8880x = new d1(f1Var6, "midnight_offset", 0L);
    }

    public final Pair w(r4 r4Var, c2 c2Var) {
        String str = r4Var.f8976d;
        c7.c0.d(str);
        return (c2Var.i(b2.AD_STORAGE) && r4Var.B) ? x(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair x(String str) {
        m3 m3Var;
        c7.p0 p0Var;
        s();
        q1 q1Var = (q1) this.f1478d;
        g7.a aVar = q1Var.f8942y;
        g gVar = q1Var.f8935r;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.f8874r;
        m3 m3Var2 = (m3) hashMap.get(str);
        if (m3Var2 != null && elapsedRealtime < m3Var2.f8850c) {
            return new Pair(m3Var2.f8848a, Boolean.valueOf(m3Var2.f8849b));
        }
        long A = gVar.A(str, e0.f8608b) + elapsedRealtime;
        try {
            try {
                p0Var = v6.a.a(q1Var.f8932d);
            } catch (PackageManager.NameNotFoundException unused) {
                if (m3Var2 != null && elapsedRealtime < m3Var2.f8850c + gVar.A(str, e0.f8611c)) {
                    return new Pair(m3Var2.f8848a, Boolean.valueOf(m3Var2.f8849b));
                }
                p0Var = null;
            }
        } catch (Exception e2) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.A.b(e2, "Unable to get advertising id");
            m3Var = new m3("", A, false);
        }
        if (p0Var == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = p0Var.f1971b;
        m3Var = str2 != null ? new m3(str2, A, p0Var.f1972c) : new m3("", A, p0Var.f1972c);
        hashMap.put(str, m3Var);
        return new Pair(m3Var.f8848a, Boolean.valueOf(m3Var.f8849b));
    }

    public final String y(r4 r4Var, c2 c2Var) {
        String str = r4Var.f8976d;
        c7.c0.d(str);
        if (!c2Var.i(b2.AD_STORAGE) || !r4Var.B) {
            return "";
        }
        s();
        String str2 = (String) x(str).first;
        MessageDigest L = p4.L();
        if (L == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, L.digest(str2.getBytes())));
    }

    @Override // s7.d4
    public final void v() {
    }
}
