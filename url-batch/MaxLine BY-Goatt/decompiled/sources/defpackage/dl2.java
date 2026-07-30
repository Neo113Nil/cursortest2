package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dl2 extends pv0 {
    public final boolean L;
    public final sf M;
    public final Bundle N;
    public final Integer O;

    public dl2(Context context, Looper looper, sf sfVar, Bundle bundle, uv0 uv0Var, vv0 vv0Var) {
        super(context, looper, 44, sfVar, uv0Var, vv0Var);
        this.L = true;
        this.M = sfVar;
        this.N = bundle;
        this.O = (Integer) sfVar.f;
    }

    @Override // defpackage.ln, defpackage.ce
    public final int e() {
        return 12451000;
    }

    @Override // defpackage.ln, defpackage.ce
    public final boolean k() {
        return this.L;
    }

    @Override // defpackage.ln
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof na3 ? (na3) queryLocalInterface : new na3(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // defpackage.ln
    public final Bundle r() {
        sf sfVar = this.M;
        boolean equals = this.o.getPackageName().equals((String) sfVar.c);
        Bundle bundle = this.N;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) sfVar.c);
        }
        return bundle;
    }

    @Override // defpackage.ln
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.ln
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
