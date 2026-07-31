package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class n1 implements xh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f344a;
    public final /* synthetic */ o1 b;

    public n1(o1 o1Var, o1 o1Var2) {
        this.b = o1Var;
        this.f344a = o1Var2;
    }

    @Override // com.startapp.sdk.internal.xh
    public final void a() {
        ((w6) this.b.i.a()).c(this.f344a, mh.v);
        o1 o1Var = this.b;
        Context context = o1Var.f132a;
        AdEventListener adEventListener = o1Var.d;
        o1Var.d = null;
        a0.b(context, adEventListener, o1Var.b, false);
    }

    @Override // com.startapp.sdk.internal.xh
    public final void a(String str) {
        ((w6) this.b.i.a()).c(this.f344a, mh.w);
        this.b.b.setErrorMessage(str);
        o1 o1Var = this.b;
        Context context = o1Var.f132a;
        AdEventListener adEventListener = o1Var.d;
        o1Var.d = null;
        a0.a(context, adEventListener, o1Var.b, false);
    }
}
