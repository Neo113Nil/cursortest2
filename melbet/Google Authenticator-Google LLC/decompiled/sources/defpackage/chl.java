package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chl implements chn {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public chl(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
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
        Bundle bundle = this.b;
        Parcel a = cckVar.a();
        a.writeString(str);
        bmt.c(a, bundle);
        Parcel b = cckVar.b(2, a);
        Bundle bundle2 = (Bundle) bmt.a(b, Bundle.CREATOR);
        b.recycle();
        cho.j(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new chh(string);
    }
}
