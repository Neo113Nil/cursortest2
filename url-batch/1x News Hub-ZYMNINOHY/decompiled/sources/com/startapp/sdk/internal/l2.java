package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l2 extends zd implements wd {

    /* renamed from: j, reason: collision with root package name */
    public final ib f4077j;

    /* renamed from: k, reason: collision with root package name */
    public final ib f4078k;

    /* renamed from: l, reason: collision with root package name */
    public final e4 f4079l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Context context, ib commonPrefs, ib prefs, ib consentManager, ib handler, e4 configProvider) {
        super(context, prefs, handler, "26787005dc4a1477", "c8ef3e50475fc527");
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(commonPrefs, "commonPrefs");
        kotlin.jvm.internal.j.e(prefs, "prefs");
        kotlin.jvm.internal.j.e(consentManager, "consentManager");
        kotlin.jvm.internal.j.e(handler, "handler");
        kotlin.jvm.internal.j.e(configProvider, "configProvider");
        this.f4077j = commonPrefs;
        this.f4078k = consentManager;
        this.f4079l = configProvider;
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
        this.f4079l.getClass();
        BluetoothConfig l3 = MetaData.E().l();
        if (l3 != null) {
            return l3.b();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.zd
    public final boolean f() {
        g6 g6Var = (g6) this.f4078k.a();
        Boolean valueOf = (g6Var.b() && ((sf) g6Var.f3854b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f3854b.a()).getBoolean("consentApc", false)) : null;
        if (valueOf != null && valueOf.booleanValue()) {
            this.f4079l.getClass();
            BluetoothConfig l3 = MetaData.E().l();
            if (l3 != null && l3.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.zd
    public final void g() {
        Context context = this.f3998a;
        kotlin.jvm.internal.j.d(context, "context");
        ib ibVar = this.f4077j;
        this.f4079l.getClass();
        long millis = TimeUnit.SECONDS.toMillis(MetaData.E().l() != null ? r2.c() : 0);
        this.f4079l.getClass();
        com.startapp.sdk.adsbase.periodic.a aVar = new com.startapp.sdk.adsbase.periodic.a(context, this, ibVar, millis, TimeUnit.MINUTES.toMillis(MetaData.E().l() != null ? r2.a() : 0));
        ((Executor) com.startapp.sdk.components.a.a(aVar.f4705a).f3446D.a()).execute(aVar.f4708d);
    }

    @Override // com.startapp.sdk.internal.wd
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
