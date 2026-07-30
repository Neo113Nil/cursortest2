package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4913s0 extends Z2.a implements InterfaceC4915t0 {
    public C4913s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 2);
    }

    @Override // q2.InterfaceC4915t0
    public final void r2(String str, V2.a aVar, V2.a aVar2) {
        Parcel A02 = A0();
        A02.writeString(str);
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, aVar2);
        G0(A02, 1);
    }
}
