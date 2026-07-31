package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class jt1 implements rb1 {

    /* renamed from: f, reason: collision with root package name */
    private final eu0 f7246f;

    jt1(eu0 eu0Var) {
        this.f7246f = eu0Var;
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void f(Context context) {
        eu0 eu0Var = this.f7246f;
        if (eu0Var != null) {
            eu0Var.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void r(Context context) {
        eu0 eu0Var = this.f7246f;
        if (eu0Var != null) {
            eu0Var.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.rb1
    public final void y(Context context) {
        eu0 eu0Var = this.f7246f;
        if (eu0Var != null) {
            eu0Var.destroy();
        }
    }
}
