package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* loaded from: classes.dex */
public final class s10 {
    public static final void a(r10 r10Var, p10 p10Var) {
        if (p10Var.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(p10Var.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        r10Var.d(p10Var.a(), p10Var.b(), p10Var.c(), p10Var.d());
    }
}
