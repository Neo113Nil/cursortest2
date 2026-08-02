package f2;

import L1.h;
import a2.C0164d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c2.m;
import d2.k;
import m2.AbstractC1310b;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422d extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final k f8812y;

    public C0422d(Context context, Looper looper, h hVar, k kVar, m mVar, m mVar2) {
        super(context, looper, 270, hVar, mVar, mVar2, 0);
        this.f8812y = kVar;
    }

    @Override // b2.c
    public final int i() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C0419a ? (C0419a) queryLocalInterface : new C0419a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final C0164d[] o() {
        return AbstractC1310b.f14499b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        this.f8812y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
