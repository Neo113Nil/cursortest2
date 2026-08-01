package a6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.i4;
import s7.e0;
import s7.o1;
import s7.q1;
import s7.v0;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f297b;

    public d(q1 q1Var) {
        this.f297b = q1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f296a) {
            case 0:
                context.getClass();
                intent.getClass();
                a aVar = (a) this.f297b;
                int i3 = aVar.g;
                intent.getClass();
                switch (i3) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            o.d().a(b.f294a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            o.d().a(c.f295a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode == -1980154005) {
                                    if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                        aVar.c(Boolean.TRUE);
                                        break;
                                    }
                                } else if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    aVar.c(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            o.d().a(l.f311a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 == -1181163412) {
                                    if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                        aVar.c(Boolean.FALSE);
                                        break;
                                    }
                                } else if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    aVar.c(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                }
            default:
                q1 q1Var = (q1) this.f297b;
                if (intent != null) {
                    String action4 = intent.getAction();
                    if (action4 != null) {
                        int hashCode3 = action4.hashCode();
                        if (hashCode3 == -1928239649) {
                            if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                                i4.a();
                                if (q1Var.f8935r.D(null, e0.P0)) {
                                    v0 v0Var = q1Var.f8937t;
                                    q1.l(v0Var);
                                    v0Var.B.a("App receiver notified triggers are available");
                                    o1 o1Var = q1Var.f8938u;
                                    q1.l(o1Var);
                                    o1Var.B(new b7.k(18, q1Var));
                                    break;
                                }
                            }
                        } else if (hashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                            v0 v0Var2 = q1Var.f8937t;
                            q1.l(v0Var2);
                            v0Var2.B.a("[sgtm] App Receiver notified batches are available");
                            o1 o1Var2 = q1Var.f8938u;
                            q1.l(o1Var2);
                            o1Var2.B(new b7.k(17, this));
                            break;
                        }
                        v0 v0Var3 = q1Var.f8937t;
                        q1.l(v0Var3);
                        v0Var3.f9053w.a("App receiver called with unknown action");
                        break;
                    } else {
                        v0 v0Var4 = q1Var.f8937t;
                        q1.l(v0Var4);
                        v0Var4.f9053w.a("App receiver called with null action");
                        break;
                    }
                } else {
                    v0 v0Var5 = q1Var.f8937t;
                    q1.l(v0Var5);
                    v0Var5.f9053w.a("App receiver called with null intent");
                    break;
                }
                break;
        }
    }

    public d(a aVar) {
        this.f297b = aVar;
    }
}
