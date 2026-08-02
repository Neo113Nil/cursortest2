package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dcu extends cqd implements cml {
    public final cpr v;
    public final Integer w;
    private final boolean x;
    private final Bundle y;

    public dcu(Context context, Looper looper, cpr cprVar, Bundle bundle, cmt cmtVar, cmu cmuVar) {
        super(context, looper, 44, cprVar, cmtVar, cmuVar);
        this.x = true;
        this.v = cprVar;
        this.y = bundle;
        this.w = cprVar.g;
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof dcs ? (dcs) queryLocalInterface : new dcs(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.cpo, defpackage.cml
    public final boolean o() {
        return this.x;
    }

    @Override // defpackage.cpo
    protected final Bundle u() {
        cpr cprVar = this.v;
        String packageName = this.b.getPackageName();
        String str = cprVar.d;
        if (!packageName.equals(str)) {
            this.y.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.y;
    }
}
