package s7;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.a8;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r4 f8997e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w1 f8998i;

    public /* synthetic */ s1(w1 w1Var, r4 r4Var, int i3) {
        this.f8996d = i3;
        this.f8997e = r4Var;
        this.f8998i = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8996d) {
            case 0:
                w1 w1Var = this.f8998i;
                w1Var.f9082d.V();
                w1Var.f9082d.Y(this.f8997e);
                break;
            case 1:
                w1 w1Var2 = this.f8998i;
                w1Var2.f9082d.V();
                j4 j4Var = w1Var2.f9082d;
                j4Var.d().s();
                j4Var.l0();
                r4 r4Var = this.f8997e;
                c7.c0.g(r4Var);
                String str = r4Var.f8976d;
                c7.c0.d(str);
                int i3 = 0;
                if (j4Var.e0().D(null, e0.f8661y0)) {
                    j4Var.f().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int B = j4Var.e0().B(null, e0.h0);
                    j4Var.e0();
                    long longValue = currentTimeMillis - ((Long) e0.f8617e.a(null)).longValue();
                    while (i3 < B && j4Var.I(null, longValue)) {
                        i3++;
                    }
                } else {
                    j4Var.e0();
                    long intValue = ((Integer) e0.f8634l.a(null)).intValue();
                    while (i3 < intValue && j4Var.I(str, 0L)) {
                        i3++;
                    }
                }
                if (j4Var.e0().D(null, e0.f8663z0)) {
                    j4Var.d().s();
                    j4Var.H();
                }
                f4 f4Var = j4Var.f8769x;
                int b10 = v4.a.b(r4Var.S);
                f4Var.s();
                if (b10 == 2 && !f4.v(str)) {
                    k1 k1Var = f4Var.f9150e.f8760d;
                    j4.T(k1Var);
                    a8 E = k1Var.E(str);
                    if (E != null && E.H() && !E.I().u().isEmpty()) {
                        j4Var.b().B.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        j4Var.f().getClass();
                        j4Var.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                w1 w1Var3 = this.f8998i;
                w1Var3.f9082d.V();
                j4 j4Var2 = w1Var3.f9082d;
                j4Var2.d().s();
                j4Var2.l0();
                r4 r4Var2 = this.f8997e;
                c7.c0.d(r4Var2.f8976d);
                j4Var2.c0(r4Var2);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                w1 w1Var4 = this.f8998i;
                w1Var4.f9082d.V();
                j4 j4Var3 = w1Var4.f9082d;
                if (j4Var3.M != null) {
                    ArrayList arrayList = new ArrayList();
                    j4Var3.N = arrayList;
                    arrayList.addAll(j4Var3.M);
                }
                m mVar = j4Var3.f8762i;
                j4.T(mVar);
                q1 q1Var = (q1) mVar.f1478d;
                r4 r4Var3 = this.f8997e;
                String str2 = r4Var3.f8976d;
                c7.c0.g(str2);
                c7.c0.d(str2);
                mVar.s();
                mVar.t();
                try {
                    SQLiteDatabase j02 = mVar.j0();
                    String[] strArr = {str2};
                    int delete = j02.delete("apps", "app_id=?", strArr) + j02.delete("events", "app_id=?", strArr) + j02.delete("events_snapshot", "app_id=?", strArr) + j02.delete("user_attributes", "app_id=?", strArr) + j02.delete("conditional_properties", "app_id=?", strArr) + j02.delete("raw_events", "app_id=?", strArr) + j02.delete("raw_events_metadata", "app_id=?", strArr) + j02.delete("queue", "app_id=?", strArr) + j02.delete("audience_filter_values", "app_id=?", strArr) + j02.delete("main_event_params", "app_id=?", strArr) + j02.delete("default_event_params", "app_id=?", strArr) + j02.delete("trigger_uris", "app_id=?", strArr) + j02.delete("upload_queue", "app_id=?", strArr);
                    if (q1Var.f8935r.D(null, e0.f8613c1)) {
                        delete += j02.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int delete2 = delete + j02.delete("diagnostic_signals", "app_id=?", strArr);
                    if (delete2 > 0) {
                        v0 v0Var = q1Var.f8937t;
                        q1.l(v0Var);
                        v0Var.B.c(str2, Integer.valueOf(delete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e2) {
                    v0 v0Var2 = q1Var.f8937t;
                    q1.l(v0Var2);
                    v0Var2.f9050t.c(v0.A(str2), e2, "Error resetting analytics data. appId, error");
                }
                if (r4Var3.f8983v) {
                    j4Var3.Y(r4Var3);
                    break;
                }
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                w1 w1Var5 = this.f8998i;
                w1Var5.f9082d.V();
                j4 j4Var4 = w1Var5.f9082d;
                j4Var4.d().s();
                j4Var4.l0();
                r4 r4Var4 = this.f8997e;
                c7.c0.d(r4Var4.f8976d);
                j4Var4.m0(r4Var4);
                j4Var4.n0(r4Var4);
                break;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                j4 j4Var5 = this.f8998i.f9082d;
                j4Var5.V();
                j4Var5.n0(this.f8997e);
                break;
            default:
                j4 j4Var6 = this.f8998i.f9082d;
                j4Var6.V();
                j4Var6.m0(this.f8997e);
                break;
        }
    }
}
