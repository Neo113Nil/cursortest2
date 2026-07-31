package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class dh extends bh {
    public final ch d;
    public final /* synthetic */ eh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(eh ehVar, TelephonyManager telephonyManager, Class cls) {
        super(ehVar, telephonyManager, cls);
        this.e = ehVar;
        this.d = new ch(this);
    }

    @Override // com.startapp.sdk.internal.bh
    public final void a() {
        this.f187a.listen(this.d, 257);
    }

    @Override // com.startapp.sdk.internal.bh
    public final void b() {
        this.f187a.listen(this.d, 0);
    }
}
