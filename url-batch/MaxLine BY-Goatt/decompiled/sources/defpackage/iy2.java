package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iy2 implements View.OnClickListener {
    public final y2 m;
    public final /* synthetic */ ky2 n;

    public iy2(ky2 ky2Var) {
        this.n = ky2Var;
        Context context = ky2Var.a.getContext();
        CharSequence charSequence = ky2Var.h;
        y2 y2Var = new y2();
        y2Var.e = 4096;
        y2Var.g = 4096;
        y2Var.l = null;
        y2Var.m = null;
        y2Var.n = false;
        y2Var.o = false;
        y2Var.p = 16;
        y2Var.i = context;
        y2Var.a = charSequence;
        this.m = y2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ky2 ky2Var = this.n;
        Window.Callback callback = ky2Var.k;
        if (callback == null || !ky2Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.m);
    }
}
