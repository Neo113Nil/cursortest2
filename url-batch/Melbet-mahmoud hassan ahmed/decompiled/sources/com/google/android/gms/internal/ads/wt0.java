package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
final class wt0 implements DialogInterface.OnCancelListener {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ JsResult f13937f;

    wt0(JsResult jsResult) {
        this.f13937f = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f13937f.cancel();
    }
}
