package s7;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8989d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f8990e;

    /* renamed from: i, reason: collision with root package name */
    public final String f8991i;

    /* renamed from: r, reason: collision with root package name */
    public final Object f8992r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f8993s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f8994t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f8995u;

    public /* synthetic */ s0(String str, x0 x0Var, int i3, IOException iOException, byte[] bArr, Map map) {
        c7.c0.g(x0Var);
        this.f8992r = x0Var;
        this.f8990e = i3;
        this.f8993s = iOException;
        this.f8994t = bArr;
        this.f8991i = str;
        this.f8995u = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8989d) {
            case 0:
                v0 v0Var = (v0) this.f8995u;
                f1 f1Var = ((q1) v0Var.f1478d).f8936s;
                q1.j(f1Var);
                if (!f1Var.f9095e) {
                    Log.println(6, v0Var.C(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (v0Var.f9047i == 0) {
                    g gVar = ((q1) v0Var.f1478d).f8935r;
                    if (gVar.f8702s == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f8702s == null) {
                                    q1 q1Var = (q1) gVar.f1478d;
                                    ApplicationInfo applicationInfo = q1Var.f8932d.getApplicationInfo();
                                    String a9 = g7.b.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.f8702s = Boolean.valueOf(str != null && str.equals(a9));
                                    }
                                    if (gVar.f8702s == null) {
                                        gVar.f8702s = Boolean.TRUE;
                                        v0 v0Var2 = q1Var.f8937t;
                                        q1.l(v0Var2);
                                        v0Var2.f9050t.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (gVar.f8702s.booleanValue()) {
                        v0Var.f9047i = 'C';
                    } else {
                        v0Var.f9047i = 'c';
                    }
                }
                if (v0Var.f9048r < 0) {
                    ((q1) v0Var.f1478d).f8935r.y();
                    v0Var.f9048r = 161000L;
                }
                int i3 = this.f8990e;
                char c10 = v0Var.f9047i;
                long j = v0Var.f9048r;
                String str2 = this.f8991i;
                Object obj = this.f8992r;
                Object obj2 = this.f8993s;
                Object obj3 = this.f8994t;
                char charAt = "01VDIWEA?".charAt(i3);
                String D = v0.D(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c10).length() + String.valueOf(j).length() + 1 + D.length());
                sb2.append("2");
                sb2.append(charAt);
                sb2.append(c10);
                sb2.append(j);
                sb2.append(":");
                sb2.append(D);
                String sb3 = sb2.toString();
                if (sb3.length() > 1024) {
                    sb3 = str2.substring(0, 1024);
                }
                e1 e1Var = f1Var.f8684s;
                if (e1Var != null) {
                    String str3 = (String) e1Var.f8667d;
                    f1 f1Var2 = (f1) e1Var.f8668e;
                    f1Var2.s();
                    if (((f1) e1Var.f8668e).w().getLong((String) e1Var.f8665b, 0L) == 0) {
                        e1Var.b();
                    }
                    SharedPreferences w6 = f1Var2.w();
                    String str4 = (String) e1Var.f8666c;
                    long j3 = w6.getLong(str4, 0L);
                    if (j3 <= 0) {
                        SharedPreferences.Editor edit = f1Var2.w().edit();
                        edit.putString(str3, sb3);
                        edit.putLong(str4, 1L);
                        edit.apply();
                        return;
                    }
                    p4 p4Var = ((q1) f1Var2.f1478d).f8940w;
                    q1.j(p4Var);
                    long nextLong = p4Var.r0().nextLong() & Long.MAX_VALUE;
                    long j10 = j3 + 1;
                    long j11 = Long.MAX_VALUE / j10;
                    SharedPreferences.Editor edit2 = f1Var2.w().edit();
                    if (nextLong < j11) {
                        edit2.putString(str3, sb3);
                    }
                    edit2.putLong(str4, j10);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((x0) this.f8992r).b(this.f8991i, this.f8990e, (Throwable) this.f8993s, (byte[]) this.f8994t, (Map) this.f8995u);
                return;
        }
    }

    public s0(v0 v0Var, int i3, String str, Object obj, Object obj2, Object obj3) {
        this.f8990e = i3;
        this.f8991i = str;
        this.f8992r = obj;
        this.f8993s = obj2;
        this.f8994t = obj3;
        this.f8995u = v0Var;
    }
}
