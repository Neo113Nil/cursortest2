package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l2 extends zd implements wd {

    /* renamed from: j, reason: collision with root package name */
    public final ib f7205j;

    /* renamed from: k, reason: collision with root package name */
    public final ib f7206k;

    /* renamed from: l, reason: collision with root package name */
    public final e4 f7207l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Context context, ib commonPrefs, ib prefs, ib consentManager, ib handler, e4 configProvider) {
        super(context, prefs, handler, "26787005dc4a1477", "c8ef3e50475fc527");
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(commonPrefs, "commonPrefs");
        kotlin.jvm.internal.i.e(prefs, "prefs");
        kotlin.jvm.internal.i.e(consentManager, "consentManager");
        kotlin.jvm.internal.i.e(handler, "handler");
        kotlin.jvm.internal.i.e(configProvider, "configProvider");
        this.f7205j = commonPrefs;
        this.f7206k = consentManager;
        this.f7207l = configProvider;
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
        this.f7207l.getClass();
        BluetoothConfig l4 = MetaData.E().l();
        if (l4 != null) {
            return l4.b();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.zd
    public final boolean f() {
        g6 g6Var = (g6) this.f7206k.a();
        Boolean valueOf = (g6Var.b() && ((sf) g6Var.f6973b.a()).contains("consentApc")) ? Boolean.valueOf(((sf) g6Var.f6973b.a()).getBoolean("consentApc", false)) : null;
        if (valueOf != null && valueOf.booleanValue()) {
            this.f7207l.getClass();
            BluetoothConfig l4 = MetaData.E().l();
            if (l4 != null && l4.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.zd
    public final void g() {
        Context context = this.f7124a;
        kotlin.jvm.internal.i.d(context, "context");
        ib ibVar = this.f7205j;
        this.f7207l.getClass();
        long millis = TimeUnit.SECONDS.toMillis(MetaData.E().l() != null ? r2.c() : 0);
        this.f7207l.getClass();
        com.startapp.sdk.adsbase.periodic.a aVar = new com.startapp.sdk.adsbase.periodic.a(context, this, ibVar, millis, TimeUnit.MINUTES.toMillis(MetaData.E().l() != null ? r2.a() : 0));
        ((Executor) com.startapp.sdk.components.a.a(aVar.f7851a).f6544D.a()).execute(aVar.f7854d);
    }

    @Override // com.startapp.sdk.internal.wd
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
