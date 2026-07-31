package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes.dex */
final class bu0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f3524a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f3525b;

    bu0(JsPromptResult jsPromptResult, EditText editText) {
        this.f3524a = jsPromptResult;
        this.f3525b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f3524a.confirm(this.f3525b.getText().toString());
    }
}
