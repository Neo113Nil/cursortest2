package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class qn1 implements a40 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mo1 f10761a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f10762b;

    qn1(mo1 mo1Var, ViewGroup viewGroup) {
        this.f10761a = mo1Var;
        this.f10762b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final JSONObject a() {
        return this.f10761a.l();
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final void b(MotionEvent motionEvent) {
        this.f10761a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final void c() {
        mo1 mo1Var = this.f10761a;
        e73<String> e73Var = mn1.f8642s;
        Map<String, WeakReference<View>> o7 = mo1Var.o();
        if (o7 == null) {
            return;
        }
        int size = e73Var.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            if (o7.get(e73Var.get(i7)) != null) {
                this.f10761a.onClick(this.f10762b);
                return;
            }
            i7 = i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.a40
    public final JSONObject zza() {
        return this.f10761a.n();
    }
}
