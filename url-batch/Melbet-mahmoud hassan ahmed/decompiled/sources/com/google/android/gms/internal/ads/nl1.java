package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class nl1 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<rl1> f9151a;

    /* synthetic */ nl1(rl1 rl1Var, ml1 ml1Var) {
        this.f9151a = new WeakReference<>(rl1Var);
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        ta1 ta1Var;
        ni1 ni1Var;
        rl1 rl1Var = this.f9151a.get();
        if (rl1Var == null) {
            return;
        }
        ta1Var = rl1Var.f11205h;
        ta1Var.M();
        if (((Boolean) sw.c().b(m10.m7)).booleanValue()) {
            ni1Var = rl1Var.f11206i;
            ni1Var.r();
        }
    }
}
