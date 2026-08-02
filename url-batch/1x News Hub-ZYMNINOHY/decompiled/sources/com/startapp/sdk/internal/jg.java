package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jg extends zd implements wd {

    /* renamed from: j, reason: collision with root package name */
    public final ib f4030j;

    /* renamed from: k, reason: collision with root package name */
    public final h4 f4031k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(Context context, ib prefs, ib consentManager, ib handler, h4 configProvider) {
        super(context, prefs, handler, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(prefs, "prefs");
        kotlin.jvm.internal.j.e(consentManager, "consentManager");
        kotlin.jvm.internal.j.e(handler, "handler");
        kotlin.jvm.internal.j.e(configProvider, "configProvider");
        this.f4030j = consentManager;
        this.f4031k = configProvider;
    }

    @Override // com.startapp.sdk.internal.zd
    public final Object a(String str) {
        return str;
    }

    @Override // com.startapp.sdk.internal.j6
    public final /* bridge */ /* synthetic */ Object c() {
        return "";
    }

    @Override // com.startapp.sdk.internal.zd
    public final long d() {
        this.f4031k.getClass();
        SensorsConfig T2 = MetaData.E().T();
        if (T2 != null) {
            return T2.h();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.zd
    public final boolean f() {
        g6 g6Var = (g6) this.f4030j.a();
        Boolean valueOf = (g6Var.b() && ((sf) g6Var.f3854b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f3854b.a()).getBoolean("consentApc", false)) : null;
        if (valueOf != null && valueOf.booleanValue()) {
            this.f4031k.getClass();
            SensorsConfig T2 = MetaData.E().T();
            if (T2 != null && T2.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.zd
    public final void g() {
        g8 g8Var = new g8(this.f3998a, this);
        ((Executor) com.startapp.sdk.components.a.a(g8Var.f4705a).f3446D.a()).execute(g8Var.f4708d);
    }

    @Override // com.startapp.sdk.internal.wd
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
