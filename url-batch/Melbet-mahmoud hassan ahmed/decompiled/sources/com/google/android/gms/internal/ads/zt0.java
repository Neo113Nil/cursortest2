package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
final class zt0 implements DialogInterface.OnCancelListener {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f15259f;

    zt0(JsPromptResult jsPromptResult) {
        this.f15259f = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f15259f.cancel();
    }
}
