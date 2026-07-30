package q2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class U extends Z2.a implements V {
    public U(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 2);
    }

    @Override // q2.V
    public final void m0(String str, String str2) {
        Parcel A02 = A0();
        A02.writeString(str);
        A02.writeString(str2);
        G0(A02, 1);
    }
}
