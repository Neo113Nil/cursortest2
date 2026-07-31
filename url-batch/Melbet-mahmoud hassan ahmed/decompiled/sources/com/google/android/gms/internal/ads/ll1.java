package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class ll1 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<rl1> f8006a;

    /* synthetic */ ll1(rl1 rl1Var, kl1 kl1Var) {
        this.f8006a = new WeakReference<>(rl1Var);
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        ta1 ta1Var;
        ni1 ni1Var;
        rl1 rl1Var = this.f8006a.get();
        if (rl1Var != null && "_ac".equals(map.get("eventName"))) {
            ta1Var = rl1Var.f11205h;
            ta1Var.M();
            if (((Boolean) sw.c().b(m10.m7)).booleanValue()) {
                ni1Var = rl1Var.f11206i;
                ni1Var.r();
            }
        }
    }
}
