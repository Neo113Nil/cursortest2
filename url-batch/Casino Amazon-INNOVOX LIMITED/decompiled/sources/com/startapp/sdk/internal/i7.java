package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class i7 extends com.startapp.sdk.adsbase.d {
    public final pa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(Context context, x7 x7Var, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, String str) {
        super(x7Var, paVar, context, adEventListener, str);
        context.getClass();
        paVar.getClass();
        paVar2.getClass();
        paVar3.getClass();
        str.getClass();
        this.g = paVar2;
    }

    @Override // com.startapp.sdk.adsbase.d
    public Object a(String str) {
        str.getClass();
        try {
            x7 x7Var = (x7) this.f140a;
            x7Var.d(str);
            q0.a(x7Var.b, 0);
            return x7Var;
        } catch (Throwable unused) {
            return null;
        }
    }
}
