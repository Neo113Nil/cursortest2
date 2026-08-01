package s7;

import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f8846e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q2 f8847i;

    public /* synthetic */ m2(q2 q2Var, Bundle bundle, int i3) {
        this.f8845d = i3;
        this.f8846e = bundle;
        this.f8847i = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8845d) {
            case 0:
                q2 q2Var = this.f8847i;
                q2Var.s();
                q2Var.t();
                Bundle bundle = this.f8846e;
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                c7.c0.d(string);
                c7.c0.d(string2);
                c7.c0.g(bundle.get("value"));
                q1 q1Var = (q1) q2Var.f1478d;
                if (!q1Var.c()) {
                    v0 v0Var = q1Var.f8937t;
                    q1.l(v0Var);
                    v0Var.B.a("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    m4 m4Var = new m4(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        p4 p4Var = q1Var.f8940w;
                        q1.j(p4Var);
                        bundle.getString("app_id");
                        u Z = p4Var.Z(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        q1.j(p4Var);
                        bundle.getString("app_id");
                        u Z2 = p4Var.Z(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        q1Var.o().L(new e(bundle.getString("app_id"), string2, m4Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), Z2, bundle.getLong("trigger_timeout"), Z, bundle.getLong("time_to_live"), p4Var.Z(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                q2 q2Var2 = this.f8847i;
                q2Var2.s();
                q2Var2.t();
                Bundle bundle2 = this.f8846e;
                String string3 = bundle2.getString("name");
                c7.c0.d(string3);
                q1 q1Var2 = (q1) q2Var2.f1478d;
                if (!q1Var2.c()) {
                    v0 v0Var2 = q1Var2.f8937t;
                    q1.l(v0Var2);
                    v0Var2.B.a("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    m4 m4Var2 = new m4(0L, null, string3, "");
                    try {
                        p4 p4Var2 = q1Var2.f8940w;
                        q1.j(p4Var2);
                        bundle2.getString("app_id");
                        q1Var2.o().L(new e(bundle2.getString("app_id"), "", m4Var2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), p4Var2.Z(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                q2 q2Var3 = this.f8847i;
                l.d dVar = q2Var3.J;
                q1 q1Var3 = (q1) q2Var3.f1478d;
                Bundle bundle3 = this.f8846e;
                if (!bundle3.isEmpty()) {
                    f1 f1Var = q1Var3.f8936s;
                    p4 p4Var3 = q1Var3.f8940w;
                    g gVar = q1Var3.f8935r;
                    v0 v0Var3 = q1Var3.f8937t;
                    q1.j(f1Var);
                    Bundle bundle4 = new Bundle(f1Var.M.d());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            q1.j(p4Var3);
                            if (p4.E0(obj)) {
                                p4.K(dVar, null, 27, null, null, 0);
                            }
                            q1.l(v0Var3);
                            v0Var3.f9055y.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (p4.W(str)) {
                            q1.l(v0Var3);
                            v0Var3.f9055y.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle4.remove(str);
                        } else {
                            q1.j(p4Var3);
                            gVar.getClass();
                            if (p4Var3.w("param", str, PermissionsActivity.DELAY_TIME_CALLBACK_CALL, obj)) {
                                p4Var3.J(bundle4, str, obj);
                            }
                        }
                    }
                    q1.j(p4Var3);
                    p4 p4Var4 = ((q1) gVar.f1478d).f8940w;
                    q1.j(p4Var4);
                    int i3 = p4Var4.c0(201500000) ? 100 : 25;
                    if (bundle4.size() > i3) {
                        Iterator it = new TreeSet(bundle4.keySet()).iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i10++;
                            if (i10 > i3) {
                                bundle4.remove(str2);
                            }
                        }
                        q1.j(p4Var3);
                        p4.K(dVar, null, 26, null, null, 0);
                        q1.l(v0Var3);
                        v0Var3.f9055y.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle3 = bundle4;
                }
                f1 f1Var2 = q1Var3.f8936s;
                q1.j(f1Var2);
                f1Var2.M.e(bundle3);
                q1Var3.o().x(bundle3);
                break;
        }
    }
}
