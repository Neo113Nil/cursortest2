package s7;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.p6;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b3 extends g0 {

    /* renamed from: i, reason: collision with root package name */
    public volatile y2 f8522i;

    /* renamed from: r, reason: collision with root package name */
    public volatile y2 f8523r;

    /* renamed from: s, reason: collision with root package name */
    public y2 f8524s;

    /* renamed from: t, reason: collision with root package name */
    public final ConcurrentHashMap f8525t;

    /* renamed from: u, reason: collision with root package name */
    public p6 f8526u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f8527v;

    /* renamed from: w, reason: collision with root package name */
    public volatile y2 f8528w;

    /* renamed from: x, reason: collision with root package name */
    public y2 f8529x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8530y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f8531z;

    public b3(q1 q1Var) {
        super(q1Var);
        this.f8531z = new Object();
        this.f8525t = new ConcurrentHashMap();
    }

    public final void A(String str, y2 y2Var, boolean z10) {
        y2 y2Var2;
        y2 y2Var3 = this.f8522i == null ? this.f8523r : this.f8522i;
        if (y2Var.f9127b == null) {
            y2Var2 = new y2(y2Var.f9126a, str != null ? x(str) : null, y2Var.f9128c, y2Var.f9130e, y2Var.f9131f, y2Var.g);
        } else {
            y2Var2 = y2Var;
        }
        this.f8523r = this.f8522i;
        this.f8522i = y2Var2;
        q1 q1Var = (q1) this.f1478d;
        q1Var.f8942y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        o1 o1Var = q1Var.f8938u;
        q1.l(o1Var);
        o1Var.B(new z2(this, y2Var2, y2Var3, elapsedRealtime, z10));
    }

    public final void B(y2 y2Var, boolean z10, long j) {
        q1 q1Var = (q1) this.f1478d;
        z zVar = q1Var.B;
        q1.i(zVar);
        q1Var.f8942y.getClass();
        zVar.v(SystemClock.elapsedRealtime());
        boolean z11 = y2Var != null && y2Var.f9129d;
        t3 t3Var = q1Var.f8939v;
        q1.k(t3Var);
        if (!t3Var.f9029t.a(z11, z10, j) || y2Var == null) {
            return;
        }
        y2Var.f9129d = false;
    }

    public final y2 C(p6 p6Var) {
        c7.c0.g(p6Var);
        Integer valueOf = Integer.valueOf(p6Var.f2667d);
        ConcurrentHashMap concurrentHashMap = this.f8525t;
        y2 y2Var = (y2) concurrentHashMap.get(valueOf);
        if (y2Var == null) {
            String x10 = x(p6Var.f2668e);
            p4 p4Var = ((q1) this.f1478d).f8940w;
            q1.j(p4Var);
            y2 y2Var2 = new y2(null, x10, p4Var.q0());
            concurrentHashMap.put(valueOf, y2Var2);
            y2Var = y2Var2;
        }
        return this.f8528w != null ? this.f8528w : y2Var;
    }

    @Override // s7.g0
    public final boolean v() {
        return false;
    }

    public final y2 w(boolean z10) {
        t();
        s();
        y2 y2Var = this.f8524s;
        return !z10 ? y2Var : y2Var != null ? y2Var : this.f8529x;
    }

    public final String x(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        q1 q1Var = (q1) this.f1478d;
        int length2 = str2.length();
        q1Var.f8935r.getClass();
        if (length2 <= 500) {
            return str2;
        }
        q1Var.f8935r.getClass();
        return str2.substring(0, PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(y2 y2Var, y2 y2Var2, long j, boolean z10, Bundle bundle) {
        boolean z11;
        long j3;
        Bundle bundle2;
        boolean z12 = y2Var.f9130e;
        q1 q1Var = (q1) this.f1478d;
        s();
        boolean z13 = false;
        if (y2Var2 != null) {
            if (y2Var2.f9128c == y2Var.f9128c && Objects.equals(y2Var2.f9127b, y2Var.f9127b) && Objects.equals(y2Var2.f9126a, y2Var.f9126a)) {
                z11 = false;
                if (z10 && this.f8524s != null) {
                    z13 = true;
                }
                if (z11) {
                    Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
                    p4.o0(y2Var, bundle3, true);
                    if (y2Var2 != null) {
                        String str = y2Var2.f9126a;
                        if (str != null) {
                            bundle3.putString("_pn", str);
                        }
                        String str2 = y2Var2.f9127b;
                        if (str2 != null) {
                            bundle3.putString("_pc", str2);
                        }
                        bundle3.putLong("_pi", y2Var2.f9128c);
                    }
                    if (z13) {
                        t3 t3Var = q1Var.f8939v;
                        q1.k(t3Var);
                        s3 s3Var = t3Var.f9029t;
                        long j10 = j - s3Var.f9000b;
                        s3Var.f9000b = j;
                        if (j10 > 0) {
                            p4 p4Var = q1Var.f8940w;
                            q1.j(p4Var);
                            p4Var.e0(bundle3, j10);
                        }
                    }
                    g gVar = q1Var.f8935r;
                    g7.a aVar = q1Var.f8942y;
                    if (!gVar.H()) {
                        bundle3.putLong("_mst", 1L);
                    }
                    String str3 = true != z12 ? "auto" : "app";
                    aVar.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z12) {
                        long j11 = y2Var.f9131f;
                        if (j11 != 0) {
                            j3 = j11;
                            long elapsedRealtime = !q1Var.f8935r.D(null, e0.f8619e1) ? SystemClock.elapsedRealtime() : 0L;
                            if (z12) {
                                bundle2 = bundle3;
                            } else {
                                bundle2 = bundle3;
                                long j12 = y2Var.g;
                                if (j12 != 0) {
                                    elapsedRealtime = j12;
                                }
                            }
                            q2 q2Var = q1Var.A;
                            q1.k(q2Var);
                            q2Var.A(j3, elapsedRealtime, bundle2, str3, "_vs");
                        }
                    }
                    j3 = currentTimeMillis;
                    if (!q1Var.f8935r.D(null, e0.f8619e1)) {
                    }
                    if (z12) {
                    }
                    q2 q2Var2 = q1Var.A;
                    q1.k(q2Var2);
                    q2Var2.A(j3, elapsedRealtime, bundle2, str3, "_vs");
                }
                if (z13) {
                    B(this.f8524s, true, j);
                }
                this.f8524s = y2Var;
                if (z12) {
                    this.f8529x = y2Var;
                }
                l3 o6 = q1Var.o();
                o6.s();
                o6.t();
                o6.G(new f8.j0(o6, y2Var));
            }
        }
        z11 = true;
        if (z10) {
            z13 = true;
        }
        if (z11) {
        }
        if (z13) {
        }
        this.f8524s = y2Var;
        if (z12) {
        }
        l3 o62 = q1Var.o();
        o62.s();
        o62.t();
        o62.G(new f8.j0(o62, y2Var));
    }

    public final void z(p6 p6Var, Bundle bundle) {
        Bundle bundle2;
        if (!((q1) this.f1478d).f8935r.H() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f8525t.put(Integer.valueOf(p6Var.f2667d), new y2(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
