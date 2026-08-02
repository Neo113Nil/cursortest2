package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cns implements Runnable {
    public final Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cns(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnCancelListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        gb gbVar;
        int i = this.c;
        if (i != 0) {
            Object obj = this.b;
            if (i != 1) {
                kky kkyVar = (kky) obj;
                kkw b = kkyVar.b(kkyVar.r.e, false, true);
                if (b == null) {
                    return;
                }
                kkyVar.g.execute(new kga(this, b, 17));
                return;
            }
            hk hkVar = (hk) obj;
            gd gdVar = hkVar.c;
            if (gdVar != null && (gbVar = gdVar.b) != null) {
                gbVar.F(gdVar);
            }
            View view = (View) hkVar.f;
            if (view != null && view.getWindowToken() != null) {
                Object obj2 = this.a;
                if (((gn) obj2).h()) {
                    hkVar.j = (hi) obj2;
                }
            }
            hkVar.m = null;
            return;
        }
        ?? r0 = this.b;
        cnt cntVar = (cnt) r0;
        if (cntVar.a) {
            Object obj3 = this.a;
            cll cllVar = cntVar.d;
            bsh bshVar = (bsh) obj3;
            Object obj4 = bshVar.b;
            clg clgVar = (clg) obj4;
            int i2 = clgVar.c;
            if (!cllVar.f(i2)) {
                Log.w("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(obj4))));
                cntVar.a(clgVar, bshVar.a);
                return;
            }
            if (clgVar.b()) {
                com comVar = cntVar.f;
                Activity l = ((col) r0).l();
                PendingIntent pendingIntent = clgVar.d;
                oy.at(pendingIntent);
                comVar.startActivityForResult(GoogleApiActivity.a(l, pendingIntent, bshVar.a, false), 1);
                return;
            }
            col colVar = (col) r0;
            if (cllVar.m(colVar.l(), i2, null) != null) {
                Activity l2 = colVar.l();
                Dialog g = cllVar.g(l2, i2, new cpz(cllVar.m(l2, i2, "d"), cntVar.f), r0);
                if (g != null) {
                    cllVar.e(l2, g, "GooglePlayServicesErrorDialog", r0);
                }
                cllVar.d(colVar.l().getApplicationContext(), clgVar, true);
                return;
            }
            if (i2 != 18) {
                cntVar.a(clgVar, bshVar.a);
                return;
            }
            Activity l3 = colVar.l();
            ProgressBar progressBar = new ProgressBar(l3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(l3);
            builder.setView(progressBar);
            builder.setMessage(cpu.b(l3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog create = builder.create();
            cllVar.e(l3, create, "GooglePlayServicesUpdatingDialog", r0);
            Context applicationContext = colVar.l().getApplicationContext();
            ehn ehnVar = new ehn(this, create, null);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            coi coiVar = new coi(ehnVar);
            if (Build.VERSION.SDK_INT >= 33) {
                applicationContext.registerReceiver(coiVar, intentFilter, null, null, 2);
            } else {
                applicationContext.registerReceiver(coiVar, intentFilter, null, null, 0);
            }
            coiVar.a = applicationContext;
            if (!cmd.g(applicationContext)) {
                ehnVar.d();
                coiVar.a();
            }
            cllVar.d(colVar.l().getApplicationContext(), clgVar, true);
        }
    }
}
