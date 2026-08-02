package com.startapp.sdk.internal;

import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class uh extends sh {

    /* renamed from: d, reason: collision with root package name */
    public final th f7710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh f7711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(vh vhVar, TelephonyManager telephonyManager, Class cls) {
        super(vhVar, telephonyManager, cls);
        this.f7711e = vhVar;
        this.f7710d = new th(this);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void a() {
        this.f7572a.listen(this.f7710d, 257);
    }

    @Override // com.startapp.sdk.internal.sh
    public final void b() {
        this.f7572a.listen(this.f7710d, 0);
    }
}
