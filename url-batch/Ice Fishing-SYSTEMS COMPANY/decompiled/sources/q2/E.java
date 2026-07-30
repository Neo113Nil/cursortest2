package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.C3261gb;
import com.google.android.gms.internal.ads.InterfaceC2514Db;
import com.google.android.gms.internal.ads.InterfaceC2548Fb;
import com.google.android.gms.internal.ads.InterfaceC2616Jb;

/* loaded from: classes.dex */
public final class E extends Z2.a implements G {
    public E(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 2);
    }

    @Override // q2.G
    public final void A2(InterfaceC4922x interfaceC4922x) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4922x);
        G0(A02, 2);
    }

    @Override // q2.G
    public final InterfaceC4876D c() {
        InterfaceC4876D c4874b;
        Parcel D02 = D0(A0(), 1);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c4874b = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c4874b = queryLocalInterface instanceof InterfaceC4876D ? (InterfaceC4876D) queryLocalInterface : new C4874B(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 2);
        }
        D02.recycle();
        return c4874b;
    }

    @Override // q2.G
    public final void q2(InterfaceC2616Jb interfaceC2616Jb) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC2616Jb);
        G0(A02, 10);
    }

    @Override // q2.G
    public final void t0(C3261gb c3261gb) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c3261gb);
        G0(A02, 6);
    }

    @Override // q2.G
    public final void u3(String str, InterfaceC2548Fb interfaceC2548Fb, InterfaceC2514Db interfaceC2514Db) {
        Parcel A02 = A0();
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC2548Fb);
        AbstractC3241g8.e(A02, interfaceC2514Db);
        G0(A02, 5);
    }
}
