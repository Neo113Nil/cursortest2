package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes.dex */
final class uf0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wf0 f12772a;

    uf0(wf0 wf0Var) {
        this.f12772a = wf0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        Context context;
        Intent i8 = this.f12772a.i();
        y2.t.q();
        context = this.f12772a.f13808d;
        a3.g2.q(context, i8);
    }
}
