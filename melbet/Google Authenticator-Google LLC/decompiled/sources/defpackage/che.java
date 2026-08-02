package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class che extends cqd {
    public che(Context context, Looper looper, cpr cprVar, cmt cmtVar, cmu cmuVar) {
        super(context, looper, 154, cprVar, cmtVar, cmuVar);
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 12200000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
        return queryLocalInterface instanceof chf ? (chf) queryLocalInterface : new chf(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.audit.service.START";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }
}
