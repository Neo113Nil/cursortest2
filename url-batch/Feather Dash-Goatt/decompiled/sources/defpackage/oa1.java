package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oa1 extends a {
    public final Bundle A;
    public final Integer B;
    public final boolean y;
    public final jb z;

    public oa1(Context context, Looper looper, jb jbVar, Bundle bundle, e50 e50Var, f50 f50Var) {
        super(context, looper, 44, jbVar, e50Var, f50Var);
        this.y = true;
        this.z = jbVar;
        this.A = bundle;
        this.B = (Integer) jbVar.b;
    }

    @Override // defpackage.b8
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.b8
    public final boolean k() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof ts1 ? (ts1) queryLocalInterface : new ts1(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        jb jbVar = this.z;
        boolean equals = this.c.getPackageName().equals((String) jbVar.a);
        Bundle bundle = this.A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) jbVar.a);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
