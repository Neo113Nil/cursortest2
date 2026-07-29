package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes2.dex */
final class zzaqp implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzdbk;

    zzaqp(JsResult jsResult) {
        this.zzdbk = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzdbk.cancel();
    }
}
