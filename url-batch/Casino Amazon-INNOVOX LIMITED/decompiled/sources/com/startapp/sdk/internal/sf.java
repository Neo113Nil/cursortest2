package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sf extends ld implements id {
    public final pa j;
    public final a4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(Context context, pa paVar, pa paVar2, pa paVar3, a4 a4Var) {
        super(context, paVar, paVar3, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        context.getClass();
        paVar2.getClass();
        paVar3.getClass();
        this.j = paVar2;
        this.k = a4Var;
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
        this.k.getClass();
        SensorsConfig O = MetaData.A().O();
        if (O != null) {
            return O.h();
        }
        return 0L;
    }

    @Override // com.startapp.sdk.internal.ld
    public final boolean f() {
        if (((x5) this.j.a()).b()) {
            this.k.getClass();
            SensorsConfig O = MetaData.A().O();
            if (O != null && O.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.startapp.sdk.internal.ld
    public final void g() {
        r7 r7Var = new r7(this.f165a, this);
        ((Executor) com.startapp.sdk.components.a.a(r7Var.f430a).D.a()).execute(r7Var.d);
    }

    @Override // com.startapp.sdk.internal.id
    public final void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }
}
