package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ah extends bh {
    public final zg d;
    public final /* synthetic */ eh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(eh ehVar, TelephonyManager telephonyManager, Class cls) {
        super(ehVar, telephonyManager, cls);
        this.e = ehVar;
        this.d = new zg(this);
    }

    @Override // com.startapp.sdk.internal.bh
    public final void a() {
        this.f187a.registerTelephonyCallback((Executor) this.e.b.a(), this.d);
    }

    @Override // com.startapp.sdk.internal.bh
    public final void b() {
        this.f187a.unregisterTelephonyCallback(this.d);
    }
}
