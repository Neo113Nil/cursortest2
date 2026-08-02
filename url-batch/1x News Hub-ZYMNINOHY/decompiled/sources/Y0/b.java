package Y0;

import A0.f;
import F1.c;
import K0.d;
import M0.m;
import U1.C0080a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;

/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final String f1743y;
    public final f z;

    public b(Context context, Looper looper, m mVar, m mVar2, c cVar) {
        super(context, looper, 23, cVar, mVar, mVar2);
        C0080a c0080a = new C0080a(8, this);
        this.f1743y = "locationServices";
        this.z = new f(c0080a);
    }

    @Override // L0.c
    public final int g() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a, L0.c
    public final void l() {
        synchronized (this.z) {
            if (a()) {
                try {
                    this.z.V();
                    this.z.getClass();
                } catch (Exception e3) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e3);
                }
            }
            super.l();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final d[] o() {
        return a1.b.f1923b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f1743y);
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
