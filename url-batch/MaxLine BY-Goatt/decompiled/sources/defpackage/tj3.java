package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tj3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ cs3 n;
    public final /* synthetic */ mk3 o;

    public /* synthetic */ tj3(mk3 mk3Var, cs3 cs3Var, int i) {
        this.m = i;
        this.n = cs3Var;
        this.o = mk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        cs3 cs3Var = this.n;
        mk3 mk3Var = this.o;
        switch (i) {
            case 0:
                mk3Var.g.B();
                mk3Var.g.Y(cs3Var);
                break;
            case 1:
                mk3Var.g.B();
                oq3 oq3Var = mk3Var.g;
                oq3Var.c().v();
                oq3Var.l0();
                ll3.v(cs3Var);
                String str = cs3Var.m;
                ll3.s(str);
                int i2 = 0;
                if (oq3Var.e0().G(null, ug3.z0)) {
                    oq3Var.e().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int E = oq3Var.e0().E(null, ug3.i0);
                    oq3Var.e0();
                    long longValue = currentTimeMillis - ((Long) ug3.e.a(null)).longValue();
                    while (i2 < E && oq3Var.I(longValue, null)) {
                        i2++;
                    }
                } else {
                    oq3Var.e0();
                    long intValue = ((Integer) ug3.l.a(null)).intValue();
                    while (i2 < intValue && oq3Var.I(0L, str)) {
                        i2++;
                    }
                }
                if (oq3Var.e0().G(null, ug3.A0)) {
                    oq3Var.c().v();
                    oq3Var.H();
                }
                zp3 zp3Var = oq3Var.v;
                int d = in1.d(cs3Var.Q);
                zp3Var.v();
                if (d == 2 && !zp3.z(str)) {
                    dj3 dj3Var = zp3Var.n.m;
                    oq3.U(dj3Var);
                    mh3 I = dj3Var.I(str);
                    if (I != null && I.D() && !I.E().q().isEmpty()) {
                        oq3Var.a().z.c(str, "[sgtm] Going background, trigger client side upload. appId");
                        oq3Var.e().getClass();
                        oq3Var.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                mk3Var.g.B();
                oq3 oq3Var2 = mk3Var.g;
                oq3Var2.c().v();
                oq3Var2.l0();
                ll3.s(cs3Var.m);
                oq3Var2.c0(cs3Var);
                break;
            case 3:
                mk3Var.g.B();
                oq3 oq3Var3 = mk3Var.g;
                if (oq3Var3.K != null) {
                    ArrayList arrayList = new ArrayList();
                    oq3Var3.L = arrayList;
                    arrayList.addAll(oq3Var3.K);
                }
                tc3 tc3Var = oq3Var3.o;
                oq3.U(tc3Var);
                pj3 pj3Var = (pj3) tc3Var.m;
                String str2 = cs3Var.m;
                ll3.v(str2);
                ll3.s(str2);
                tc3Var.v();
                tc3Var.x();
                try {
                    SQLiteDatabase l0 = tc3Var.l0();
                    String[] strArr = {str2};
                    int delete = l0.delete("apps", "app_id=?", strArr) + l0.delete("events", "app_id=?", strArr) + l0.delete("events_snapshot", "app_id=?", strArr) + l0.delete("user_attributes", "app_id=?", strArr) + l0.delete("conditional_properties", "app_id=?", strArr) + l0.delete("raw_events", "app_id=?", strArr) + l0.delete("raw_events_metadata", "app_id=?", strArr) + l0.delete("queue", "app_id=?", strArr) + l0.delete("audience_filter_values", "app_id=?", strArr) + l0.delete("main_event_params", "app_id=?", strArr) + l0.delete("default_event_params", "app_id=?", strArr) + l0.delete("trigger_uris", "app_id=?", strArr) + l0.delete("upload_queue", "app_id=?", strArr);
                    if (pj3Var.p.G(null, ug3.h1)) {
                        delete += l0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (delete > 0) {
                        vh3 vh3Var = pj3Var.r;
                        pj3.m(vh3Var);
                        vh3Var.z.d(str2, Integer.valueOf(delete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    vh3 vh3Var2 = pj3Var.r;
                    pj3.m(vh3Var2);
                    vh3Var2.r.d(vh3.E(str2), e, "Error resetting analytics data. appId, error");
                }
                if (cs3Var.t) {
                    oq3Var3.Y(cs3Var);
                    break;
                }
                break;
            case 4:
                mk3Var.g.B();
                oq3 oq3Var4 = mk3Var.g;
                oq3Var4.c().v();
                oq3Var4.l0();
                ll3.s(cs3Var.m);
                oq3Var4.m0(cs3Var);
                oq3Var4.n0(cs3Var);
                break;
            case 5:
                oq3 oq3Var5 = mk3Var.g;
                oq3Var5.B();
                oq3Var5.n0(cs3Var);
                break;
            default:
                oq3 oq3Var6 = mk3Var.g;
                oq3Var6.B();
                oq3Var6.m0(cs3Var);
                break;
        }
    }
}
