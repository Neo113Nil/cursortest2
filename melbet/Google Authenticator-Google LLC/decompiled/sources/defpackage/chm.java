package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chm implements chn {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    public chm(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    @Override // defpackage.chn
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        cck cckVar;
        if (iBinder == null) {
            cckVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            cckVar = queryLocalInterface instanceof cck ? (cck) queryLocalInterface : new cck(iBinder);
        }
        String str = this.a;
        Parcel a = cckVar.a();
        a.writeString(str);
        Parcel b = cckVar.b(8, a);
        Bundle bundle = (Bundle) bmt.a(b, Bundle.CREATOR);
        b.recycle();
        cho.j(bundle);
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        if (ciz.SUCCESS.equals(ciz.a(string))) {
            return true;
        }
        cho.g(this.b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new chh("Invalid state. Shouldn't happen");
    }
}
