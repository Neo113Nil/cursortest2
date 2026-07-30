package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.BinderC3317hd;

/* loaded from: classes.dex */
public final class Q extends Z2.a implements S {
    public Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader", 2);
    }

    @Override // q2.S
    public final void O(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 18);
    }

    @Override // q2.S
    public final void m2(BinderC3317hd binderC3317hd) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, binderC3317hd);
        G0(A02, 8);
    }
}
