package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rh extends sh {

    /* renamed from: d, reason: collision with root package name */
    public final qh f4400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f4401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        super(vhVar, telephonyManager, cls);
        this.f4401e = vhVar;
        this.f4400d = new qh(this);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void a() {
        this.f4435a.registerTelephonyCallback((Executor) this.f4401e.f4619b.a(), this.f4400d);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void b() {
        this.f4435a.unregisterTelephonyCallback(this.f4400d);
    }
}
