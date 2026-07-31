package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class ql1 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<rl1> f10748a;

    /* synthetic */ ql1(rl1 rl1Var, pl1 pl1Var) {
        this.f10748a = new WeakReference<>(rl1Var);
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        ob1 ob1Var;
        rl1 rl1Var = this.f10748a.get();
        if (rl1Var == null) {
            return;
        }
        ob1Var = rl1Var.f11204g;
        ob1Var.zza();
    }
}
