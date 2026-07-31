package a3;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.zd;

/* loaded from: classes.dex */
public final class v0 extends zd implements x0 {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // a3.x0
    public final void zze(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(2, E);
    }

    @Override // a3.x0
    public final boolean zzf(x3.a aVar, String str, String str2) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        E.writeString(str2);
        Parcel q02 = q0(1, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }
}
