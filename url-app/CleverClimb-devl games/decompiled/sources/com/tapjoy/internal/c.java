package com.tapjoy.internal;

import android.R;
import android.app.Dialog;
import android.content.Context;

/* loaded from: classes2.dex */
public final class c extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7877a;

    public c(Context context) {
        super(context, R.style.Theme.Dialog);
        this.f7877a = false;
        requestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
    }

    @Override // android.app.Dialog
    public final void show() {
        this.f7877a = false;
        super.show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        this.f7877a = true;
        super.cancel();
    }
}
