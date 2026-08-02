package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class r1 implements qi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f4376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f4377b;

    public r1(s1 s1Var, s1 s1Var2) {
        this.f4377b = s1Var;
        this.f4376a = s1Var2;
    }

    @Override // com.startapp.sdk.internal.qi
    public final void a() {
        ((y6) ((x6) this.f4377b.f3300i.a())).c(this.f4376a, fi.v);
        s1 s1Var = this.f4377b;
        Context context = s1Var.f3293a;
        AdEventListener adEventListener = s1Var.f3296d;
        s1Var.f3296d = null;
        a0.b(context, adEventListener, s1Var.f3294b, false);
    }

    @Override // com.startapp.sdk.internal.qi
    public final void a(String str) {
        ((y6) ((x6) this.f4377b.f3300i.a())).c(this.f4376a, fi.f3830w);
        this.f4377b.f3294b.setErrorMessage(str);
        s1 s1Var = this.f4377b;
        Context context = s1Var.f3293a;
        AdEventListener adEventListener = s1Var.f3296d;
        s1Var.f3296d = null;
        a0.a(context, adEventListener, s1Var.f3294b, false);
    }
}
