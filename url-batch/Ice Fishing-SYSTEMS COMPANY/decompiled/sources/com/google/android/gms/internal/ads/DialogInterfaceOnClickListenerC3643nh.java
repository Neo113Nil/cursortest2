package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.nh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC3643nh implements DialogInterface.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32876n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JsResult f32877u;

    public /* synthetic */ DialogInterfaceOnClickListenerC3643nh(JsResult jsResult, int i) {
        this.f32876n = i;
        this.f32877u = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f32876n) {
            case 0:
                this.f32877u.cancel();
                break;
            default:
                this.f32877u.confirm();
                break;
        }
    }
}
