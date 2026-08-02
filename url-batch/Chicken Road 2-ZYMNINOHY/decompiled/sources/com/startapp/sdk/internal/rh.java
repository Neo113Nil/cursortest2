package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rh extends sh {

    /* renamed from: d, reason: collision with root package name */
    public final qh f7538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f7539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        super(vhVar, telephonyManager, cls);
        this.f7539e = vhVar;
        this.f7538d = new qh(this);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void a() {
        this.f7572a.registerTelephonyCallback((Executor) this.f7539e.f7761b.a(), this.f7538d);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void b() {
        this.f7572a.unregisterTelephonyCallback(this.f7538d);
    }
}
