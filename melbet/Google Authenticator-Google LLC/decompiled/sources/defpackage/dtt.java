package defpackage;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtt extends BroadcastReceiver {
    final /* synthetic */ dtw a;

    public dtt(dtw dtwVar) {
        this.a = dtwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Window window;
        context.getClass();
        intent.getClass();
        if (ksp.g(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS", false)) {
            dtw dtwVar = this.a;
            Dialog dialog = dtwVar.e;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(0);
            }
            View view = dtwVar.R;
            if (view != null) {
                view.requestLayout();
            }
            View view2 = dtwVar.R;
            if (view2 != null) {
                view2.addOnLayoutChangeListener(new dxx(dtwVar, 1));
            }
        }
    }
}
