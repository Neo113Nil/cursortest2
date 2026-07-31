package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class mg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f339a;
    public final /* synthetic */ com.startapp.sdk.components.a b;
    public final /* synthetic */ af c;

    public mg(Context context, com.startapp.sdk.components.a aVar, af afVar) {
        this.f339a = context;
        this.b = aVar;
        this.c = afVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            jf jfVar = new jf(this.f339a);
            jfVar.a(this.f339a, new AdPreferences());
            z7 z7Var = (z7) this.b.m.a();
            y7 y7Var = new y7(z7Var, jfVar.a(MetaData.A().W() + f0.c));
            y7Var.d = z7Var.a(jfVar.Z);
            c8 a2 = y7Var.a();
            if (a2 != null) {
                String str = a2.b;
                if (!TextUtils.isEmpty(str)) {
                    String a3 = zh.a(str, "@ct@", "@ct@");
                    String a4 = zh.a(str, "@tsc@", "@tsc@");
                    String a5 = zh.a(str, "@apc@", "@apc@");
                    try {
                        Integer valueOf = !TextUtils.isEmpty(a3) ? Integer.valueOf(Integer.parseInt(a3)) : null;
                        Long valueOf2 = !TextUtils.isEmpty(a4) ? Long.valueOf(Long.parseLong(a4)) : null;
                        Boolean valueOf3 = TextUtils.isEmpty(a5) ? null : Boolean.valueOf(Boolean.parseBoolean(a5));
                        if (valueOf != null || valueOf2 != null || valueOf3 != null) {
                            ((x5) this.b.i.a()).a(valueOf, valueOf2, valueOf3, false, true);
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                }
            }
            this.c.edit().putBoolean("shared_prefs_first_init", false).apply();
        } catch (Throwable th2) {
            n8.a(th2);
        }
    }
}
