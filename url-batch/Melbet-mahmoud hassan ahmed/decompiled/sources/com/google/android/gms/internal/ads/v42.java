package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
final class v42 extends TimerTask {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AlertDialog f13122f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Timer f13123g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ z2.o f13124h;

    v42(AlertDialog alertDialog, Timer timer, z2.o oVar) {
        this.f13122f = alertDialog;
        this.f13123g = timer;
        this.f13124h = oVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f13122f.dismiss();
        this.f13123g.cancel();
        z2.o oVar = this.f13124h;
        if (oVar != null) {
            oVar.a();
        }
    }
}
