package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuv extends cqd {
    public final cut v;

    public cuv(Context context, Looper looper, cpr cprVar, cmt cmtVar, cmu cmuVar) {
        super(context, looper, 63, cprVar, cmtVar, cmuVar);
        this.v = new cut();
    }

    @Override // defpackage.cqd, defpackage.cpo, defpackage.cml
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.cpo
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return queryLocalInterface instanceof cux ? (cux) queryLocalInterface : new cux(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }
}
