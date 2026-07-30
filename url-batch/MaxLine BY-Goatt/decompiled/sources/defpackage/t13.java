package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t13 implements rh, uu1, mm3, xh3 {
    public static t13 q;
    public final /* synthetic */ int m;
    public final Object n;
    public Object o;
    public Object p;

    public t13(Context context, pj3 pj3Var) {
        this.m = 4;
        this.n = new AtomicLong(-1L);
        this.p = new wa3(context, wa3.i, new tt2("measurement:api"), qv0.b);
        this.o = pj3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.String] */
    @Override // defpackage.mm3, defpackage.xh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        int i2;
        qm3 qm3Var;
        AtomicReference atomicReference;
        switch (this.m) {
            case 5:
                jm3 jm3Var = (jm3) this.o;
                jm3Var.v();
                np3 np3Var = (np3) this.n;
                if (i == 200 || i == 204) {
                    i2 = i;
                } else {
                    i2 = 304;
                    if (i != 304) {
                        i2 = i;
                        vh3 vh3Var = ((pj3) jm3Var.m).r;
                        pj3.m(vh3Var);
                        vh3Var.u.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(np3Var.m), Integer.valueOf(i2), th);
                        qm3Var = !Arrays.asList(((String) ug3.u.a(null)).split(",")).contains(String.valueOf(i2)) ? qm3.BACKOFF : qm3.FAILURE;
                        atomicReference = (AtomicReference) this.p;
                        jo3 p = ((pj3) jm3Var.m).p();
                        long j = np3Var.m;
                        tb3 tb3Var = new tb3(j, np3Var.r, qm3Var.m);
                        p.v();
                        p.x();
                        p.K(new f92((Object) p, (Object) p.M(true), (Object) tb3Var, 9));
                        vh3 vh3Var2 = ((pj3) jm3Var.m).r;
                        pj3.m(vh3Var2);
                        vh3Var2.z.d(Long.valueOf(j), qm3Var, "[sgtm] Updated status for row_id");
                        synchronized (atomicReference) {
                            atomicReference.set(qm3Var);
                            atomicReference.notifyAll();
                        }
                        return;
                    }
                }
                if (th == null) {
                    vh3 vh3Var3 = ((pj3) jm3Var.m).r;
                    pj3.m(vh3Var3);
                    vh3Var3.z.c(Long.valueOf(np3Var.m), "[sgtm] Upload succeeded for row_id");
                    qm3Var = qm3.SUCCESS;
                    atomicReference = (AtomicReference) this.p;
                    jo3 p2 = ((pj3) jm3Var.m).p();
                    long j2 = np3Var.m;
                    tb3 tb3Var2 = new tb3(j2, np3Var.r, qm3Var.m);
                    p2.v();
                    p2.x();
                    p2.K(new f92((Object) p2, (Object) p2.M(true), (Object) tb3Var2, 9));
                    vh3 vh3Var22 = ((pj3) jm3Var.m).r;
                    pj3.m(vh3Var22);
                    vh3Var22.z.d(Long.valueOf(j2), qm3Var, "[sgtm] Updated status for row_id");
                    synchronized (atomicReference) {
                    }
                }
                vh3 vh3Var4 = ((pj3) jm3Var.m).r;
                pj3.m(vh3Var4);
                vh3Var4.u.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(np3Var.m), Integer.valueOf(i2), th);
                if (!Arrays.asList(((String) ug3.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                }
                atomicReference = (AtomicReference) this.p;
                jo3 p22 = ((pj3) jm3Var.m).p();
                long j22 = np3Var.m;
                tb3 tb3Var22 = new tb3(j22, np3Var.r, qm3Var.m);
                p22.v();
                p22.x();
                p22.K(new f92((Object) p22, (Object) p22.M(true), (Object) tb3Var22, 9));
                vh3 vh3Var222 = ((pj3) jm3Var.m).r;
                pj3.m(vh3Var222);
                vh3Var222.z.d(Long.valueOf(j22), qm3Var, "[sgtm] Updated status for row_id");
                synchronized (atomicReference) {
                }
            case 6:
                ((oq3) this.p).y(true, i, th, bArr, (String) this.o, (ArrayList) this.n);
                return;
            default:
                long j3 = ((rq3) this.p).a;
                oq3 oq3Var = (oq3) this.n;
                String str2 = (String) this.o;
                oq3Var.c().v();
                oq3Var.l0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } catch (Throwable th2) {
                        oq3Var.G = false;
                        oq3Var.O();
                        throw th2;
                    }
                }
                if (i != 200) {
                    if (i == 204) {
                        i = 204;
                    }
                    String str3 = new String(bArr, StandardCharsets.UTF_8);
                    ?? substring = str3.substring(0, Math.min(32, str3.length()));
                    g10 g10Var = oq3Var.a().w;
                    Integer valueOf = Integer.valueOf(i);
                    if (th == null) {
                        th = substring;
                    }
                    g10Var.e("Network upload failed. Will retry later. appId, status, error", str2, valueOf, th);
                    tc3 tc3Var = oq3Var.o;
                    oq3.U(tc3Var);
                    tc3Var.I(Long.valueOf(j3));
                    oq3Var.N();
                    oq3Var.G = false;
                    oq3Var.O();
                    return;
                }
                if (th == null) {
                    tc3 tc3Var2 = oq3Var.o;
                    oq3.U(tc3Var2);
                    tc3Var2.D(Long.valueOf(j3));
                    oq3Var.a().z.d(str2, Integer.valueOf(i), "Successfully uploaded batch from upload queue. appId, status");
                    bi3 bi3Var = oq3Var.n;
                    oq3.U(bi3Var);
                    if (bi3Var.Q()) {
                        tc3 tc3Var3 = oq3Var.o;
                        oq3.U(tc3Var3);
                        if (tc3Var3.C(str2)) {
                            oq3Var.t(str2);
                            oq3Var.G = false;
                            oq3Var.O();
                            return;
                        }
                    }
                    oq3Var.N();
                    oq3Var.G = false;
                    oq3Var.O();
                    return;
                }
                String str32 = new String(bArr, StandardCharsets.UTF_8);
                ?? substring2 = str32.substring(0, Math.min(32, str32.length()));
                g10 g10Var2 = oq3Var.a().w;
                Integer valueOf2 = Integer.valueOf(i);
                if (th == null) {
                }
                g10Var2.e("Network upload failed. Will retry later. appId, status, error", str2, valueOf2, th);
                tc3 tc3Var4 = oq3Var.o;
                oq3.U(tc3Var4);
                tc3Var4.I(Long.valueOf(j3));
                oq3Var.N();
                oq3Var.G = false;
                oq3Var.O();
                return;
        }
    }

    @Override // defpackage.rh
    public void b(int i, Object obj) {
        ((i91) this.p).A(i, (i91) obj);
    }

    @Override // defpackage.rh
    public void c(Object obj) {
        ((ArrayList) this.n).add(this.p);
        this.p = obj;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.m) {
            case 1:
                t13 t13Var = new t13(((jb3) this.o).clone());
                ArrayList arrayList = (ArrayList) this.n;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) t13Var.n).add(((jb3) obj).clone());
                }
                return t13Var;
            default:
                return super.clone();
        }
    }

    @Override // defpackage.rh
    public void d() {
        v6 v6Var;
        i91 i91Var = (i91) this.p;
        fs1 fs1Var = i91Var.P;
        if (!i91Var.I()) {
            h21.a("onReuse is only expected on attached node");
        }
        v91 v91Var = i91Var.R;
        if (v91Var != null) {
            v91Var.e(false);
        }
        i91Var.D = false;
        if (i91Var.Y) {
            i91Var.Y = false;
        } else {
            ul1 ul1Var = i91Var.P.e;
            for (ul1 ul1Var2 = ul1Var; ul1Var2 != null; ul1Var2 = ul1Var2.q) {
                if (ul1Var2.z) {
                    ul1Var2.B0();
                }
            }
            for (ul1 ul1Var3 = ul1Var; ul1Var3 != null; ul1Var3 = ul1Var3.q) {
                if (ul1Var3.z) {
                    ul1Var3.D0();
                }
            }
            while (ul1Var != null) {
                if (ul1Var.z) {
                    ul1Var.x0();
                }
                ul1Var = ul1Var.q;
            }
        }
        int i = i91Var.n;
        i91Var.n = wh2.a.addAndGet(1);
        rx1 rx1Var = i91Var.y;
        if (rx1Var != null) {
            t7 t7Var = (t7) rx1Var;
            t7Var.getLayoutNodes().g(i);
            t7Var.getLayoutNodes().h(i91Var.n, i91Var);
        }
        for (ul1 ul1Var4 = fs1Var.f; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
            ul1Var4.w0();
        }
        fs1Var.e();
        if (fs1Var.d(8)) {
            i91Var.G();
        }
        i91.X(i91Var);
        rx1 rx1Var2 = i91Var.y;
        if (rx1Var2 != null) {
            t7 t7Var2 = (t7) rx1Var2;
            if (t7.e() && (v6Var = t7Var2.Q) != null) {
                t7 t7Var3 = v6Var.c;
                mm mmVar = v6Var.a;
                an1 an1Var = v6Var.g;
                if (an1Var.e(i)) {
                    mmVar.h(t7Var3, i, false);
                }
                sh2 w = i91Var.w();
                if (w != null && w.m.b(gi2.q)) {
                    an1Var.a(i91Var.n);
                    mmVar.h(t7Var3, i91Var.n, true);
                }
            }
            t7Var2.getRectManager().g(i91Var, true);
        }
    }

    public void e() {
        ((ArrayList) this.n).clear();
        this.p = this.o;
        ((i91) this.o).Q();
    }

    @Override // defpackage.rh
    public /* bridge */ /* synthetic */ void f(int i, Object obj) {
    }

    @Override // defpackage.rh
    public void g() {
        rx1 rx1Var = ((i91) this.o).y;
        if (rx1Var != null) {
            ((t7) rx1Var).x();
        }
    }

    @Override // defpackage.rh
    public void h(int i, int i2, int i3) {
        ((i91) this.p).M(i, i2, i3);
    }

    @Override // defpackage.rh
    public Object i() {
        return this.p;
    }

    @Override // defpackage.rh
    public void j(int i, int i2) {
        ((i91) this.p).R(i, i2);
    }

    public synchronized void k(int i, int i2, long j, long j2) {
        ((pj3) this.o).w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.n;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ys3 b = ((wa3) this.p).b(new st2(0, Arrays.asList(new nl1(36301, i, 0, j, j2, null, null, 0, i2))));
        nx0 nx0Var = new nx0(this, elapsedRealtime);
        b.getClass();
        b.d(lt2.a, nx0Var);
    }

    @Override // defpackage.uu1
    public void onComplete(jt2 jt2Var) {
        ic2 ic2Var = (ic2) this.o;
        String str = (String) this.p;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.n;
        synchronized (ic2Var.a) {
            ic2Var.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.rh
    public void p() {
        this.p = ((ArrayList) this.n).remove(r0.size() - 1);
    }

    public t13() {
        this.m = 1;
        this.o = new jb3(BuildConfig.FLAVOR, 0L, null);
        this.p = new jb3(BuildConfig.FLAVOR, 0L, null);
        this.n = new ArrayList();
    }

    public /* synthetic */ t13(Object obj, Serializable serializable, Object obj2, int i) {
        this.m = i;
        this.o = obj;
        this.p = serializable;
        this.n = obj2;
    }

    public t13(oq3 oq3Var, String str, ArrayList arrayList) {
        this.m = 6;
        this.o = str;
        this.n = arrayList;
        this.p = oq3Var;
    }

    public t13(oq3 oq3Var, String str, rq3 rq3Var) {
        this.m = 7;
        this.o = str;
        this.p = rq3Var;
        this.n = oq3Var;
    }

    public t13(jb3 jb3Var) {
        this.m = 1;
        this.o = jb3Var;
        this.p = jb3Var.clone();
        this.n = new ArrayList();
    }

    public t13(i91 i91Var) {
        this.m = 0;
        this.o = i91Var;
        this.n = new ArrayList();
        this.p = i91Var;
    }
}
