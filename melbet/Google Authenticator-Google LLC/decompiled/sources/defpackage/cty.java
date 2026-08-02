package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cty extends cqd {
    public cty(Context context, Looper looper, cmt cmtVar, cmu cmuVar, cpr cprVar) {
        super(context, looper, 29, cprVar, cmtVar, cmuVar);
        des.a(context);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return queryLocalInterface instanceof ctz ? (ctz) queryLocalInterface : new ctz(iBinder);
    }

    @Override // defpackage.cpo
    protected final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.cpo
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.cpo
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cpo
    public final cli[] g() {
        return ctl.b;
    }
}
