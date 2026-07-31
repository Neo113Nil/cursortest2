package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class f2 extends ld implements id {
    public final pa j;
    public final pa k;
    public final w3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, w3 w3Var) {
        super(context, paVar2, paVar4, "26787005dc4a1477", "c8ef3e50475fc527");
        context.getClass();
        paVar.getClass();
        paVar3.getClass();
        paVar4.getClass();
        this.j = paVar;
        this.k = paVar3;
        this.l = w3Var;
    }

    @Override // com.startapp.sdk.internal.ld
    public final Object a(String str) {
        return str;
    }

    @Override // com.startapp.sdk.internal.a6
    public final /* bridge */ /* synthetic */ Object c() {
        return "";
    }

    @Override // com.startapp.sdk.internal.ld
    public final long d() {
        this.l.getClass();
        BluetoothConfig k = MetaData.A().k();
        if (k != null) {
            return k.b();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.ld
    public final boolean f() {
        if (((x5) this.k.a()).b()) {
            this.l.getClass();
            BluetoothConfig k = MetaData.A().k();
            if (k != null && k.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ld
    public final void g() {
        Context context = this.f165a;
        context.getClass();
        pa paVar = this.j;
        this.l.getClass();
        long millis = TimeUnit.SECONDS.toMillis(MetaData.A().k() != null ? r2.c() : 0);
        this.l.getClass();
        com.startapp.sdk.adsbase.periodic.a aVar = new com.startapp.sdk.adsbase.periodic.a(context, this, paVar, millis, TimeUnit.MINUTES.toMillis(MetaData.A().k() != null ? r2.a() : 0));
        ((Executor) com.startapp.sdk.components.a.a(aVar.f430a).D.a()).execute(aVar.d);
    }

    @Override // com.startapp.sdk.internal.id
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
