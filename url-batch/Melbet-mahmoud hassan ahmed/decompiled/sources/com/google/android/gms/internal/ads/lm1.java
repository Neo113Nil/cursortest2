package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class lm1 implements zn {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f8018f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ mm1 f8019g;

    lm1(mm1 mm1Var, String str) {
        this.f8019g = mm1Var;
        this.f8018f = str;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void o0(xn xnVar) {
        Map map;
        mo1 mo1Var;
        mo1 mo1Var2;
        mo1 mo1Var3;
        mo1 mo1Var4;
        Map map2;
        mo1 mo1Var5;
        mo1 mo1Var6;
        mo1 mo1Var7;
        if (!((Boolean) sw.c().b(m10.f8242l1)).booleanValue()) {
            if (xnVar.f14258j) {
                map = this.f8019g.D;
                map.put(this.f8018f, Boolean.TRUE);
                mm1 mm1Var = this.f8019g;
                mo1Var = mm1Var.f8629t;
                View d7 = mo1Var.d();
                mo1Var2 = this.f8019g.f8629t;
                Map<String, WeakReference<View>> k7 = mo1Var2.k();
                mo1Var3 = this.f8019g.f8629t;
                mm1Var.O(d7, k7, mo1Var3.o(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (xnVar.f14258j) {
                mo1Var4 = this.f8019g.f8629t;
                if (mo1Var4 == null) {
                    return;
                }
                map2 = this.f8019g.D;
                map2.put(this.f8018f, Boolean.TRUE);
                mm1 mm1Var2 = this.f8019g;
                mo1Var5 = mm1Var2.f8629t;
                View d8 = mo1Var5.d();
                mo1Var6 = this.f8019g.f8629t;
                Map<String, WeakReference<View>> k8 = mo1Var6.k();
                mo1Var7 = this.f8019g.f8629t;
                mm1Var2.O(d8, k8, mo1Var7.o(), true);
            }
        }
    }
}
