package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rh3 implements Runnable {
    public final /* synthetic */ int m = 1;
    public final int n;
    public final String o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;

    public /* synthetic */ rh3(String str, xh3 xh3Var, int i, IOException iOException, byte[] bArr, Map map) {
        ll3.v(xh3Var);
        this.p = xh3Var;
        this.n = i;
        this.q = iOException;
        this.r = bArr;
        this.o = str;
        this.s = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                vh3 vh3Var = (vh3) this.s;
                qi3 qi3Var = ((pj3) vh3Var.m).q;
                pj3.k(qi3Var);
                if (!qi3Var.n) {
                    Log.println(6, vh3Var.G(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (vh3Var.o == 0) {
                    ec3 ec3Var = ((pj3) vh3Var.m).p;
                    if (ec3Var.q == null) {
                        synchronized (ec3Var) {
                            try {
                                if (ec3Var.q == null) {
                                    pj3 pj3Var = (pj3) ec3Var.m;
                                    ApplicationInfo applicationInfo = pj3Var.m.getApplicationInfo();
                                    String f = km.f();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        ec3Var.q = Boolean.valueOf(str != null && str.equals(f));
                                    }
                                    if (ec3Var.q == null) {
                                        ec3Var.q = Boolean.TRUE;
                                        vh3 vh3Var2 = pj3Var.r;
                                        pj3.m(vh3Var2);
                                        vh3Var2.r.b("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (ec3Var.q.booleanValue()) {
                        vh3Var.o = 'C';
                    } else {
                        vh3Var.o = 'c';
                    }
                }
                if (vh3Var.p < 0) {
                    ((pj3) vh3Var.m).p.B();
                    vh3Var.p = 133005L;
                }
                int i = this.n;
                char c = vh3Var.o;
                long j = vh3Var.p;
                String str2 = this.o;
                Object obj = this.p;
                Object obj2 = this.q;
                Object obj3 = this.r;
                char charAt = "01VDIWEA?".charAt(i);
                String H = vh3.H(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + H.length());
                sb.append("2");
                sb.append(charAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(H);
                String sb2 = sb.toString();
                if (sb2.length() > 1024) {
                    sb2 = str2.substring(0, 1024);
                }
                ni3 ni3Var = qi3Var.q;
                if (ni3Var != null) {
                    String str3 = (String) ni3Var.d;
                    qi3 qi3Var2 = (qi3) ni3Var.e;
                    qi3Var2.v();
                    if (((qi3) ni3Var.e).A().getLong((String) ni3Var.b, 0L) == 0) {
                        ni3Var.b();
                    }
                    SharedPreferences A = qi3Var2.A();
                    String str4 = (String) ni3Var.c;
                    long j2 = A.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor edit = qi3Var2.A().edit();
                        edit.putString(str3, sb2);
                        edit.putLong(str4, 1L);
                        edit.apply();
                        return;
                    }
                    zq3 zq3Var = ((pj3) qi3Var2.m).u;
                    pj3.k(zq3Var);
                    long nextLong = zq3Var.u0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor edit2 = qi3Var2.A().edit();
                    if (nextLong < j4) {
                        edit2.putString(str3, sb2);
                    }
                    edit2.putLong(str4, j3);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((xh3) this.p).a(this.o, this.n, (Throwable) this.q, (byte[]) this.r, (Map) this.s);
                return;
        }
    }

    public rh3(vh3 vh3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.n = i;
        this.o = str;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = vh3Var;
    }
}
