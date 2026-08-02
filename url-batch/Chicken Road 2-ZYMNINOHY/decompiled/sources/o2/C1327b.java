package o2;

import B1.j;
import L1.h;
import a0.C0144j;
import a2.C0164d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import c2.m;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327b extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final String f14625y;
    public final j z;

    public C1327b(Context context, Looper looper, m mVar, m mVar2, h hVar) {
        super(context, looper, 23, hVar, mVar, mVar2, 0);
        C0144j c0144j = new C0144j(25, this);
        this.f14625y = "locationServices";
        this.z = new j(c0144j, (byte) 0);
    }

    @Override // com.google.android.gms.common.internal.a, b2.c
    public final void e() {
        synchronized (this.z) {
            if (g()) {
                try {
                    this.z.E();
                    this.z.getClass();
                } catch (Exception e4) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e4);
                }
            }
            super.e();
        }
    }

    @Override // b2.c
    public final int i() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C1326a ? (C1326a) queryLocalInterface : new C1326a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final C0164d[] o() {
        return q2.b.f15087b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f14625y);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean u() {
        return true;
    }
}
