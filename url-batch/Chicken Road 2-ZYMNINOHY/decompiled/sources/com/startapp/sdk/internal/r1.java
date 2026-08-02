package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class r1 implements qi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f7513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f7514b;

    public r1(s1 s1Var, s1 s1Var2) {
        this.f7514b = s1Var;
        this.f7513a = s1Var2;
    }

    @Override // com.startapp.sdk.internal.qi
    public final void a() {
        ((y6) ((x6) this.f7514b.f6390i.a())).c(this.f7513a, fi.v);
        s1 s1Var = this.f7514b;
        Context context = s1Var.f6382a;
        AdEventListener adEventListener = s1Var.f6385d;
        s1Var.f6385d = null;
        a0.b(context, adEventListener, s1Var.f6383b, false);
    }

    @Override // com.startapp.sdk.internal.qi
    public final void a(String str) {
        ((y6) ((x6) this.f7514b.f6390i.a())).c(this.f7513a, fi.f6948w);
        this.f7514b.f6383b.setErrorMessage(str);
        s1 s1Var = this.f7514b;
        Context context = s1Var.f6382a;
        AdEventListener adEventListener = s1Var.f6385d;
        s1Var.f6385d = null;
        a0.a(context, adEventListener, s1Var.f6383b, false);
    }
}
