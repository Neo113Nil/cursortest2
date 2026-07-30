package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4923x0 extends Z2.a implements A0 {
    public C4923x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 2);
    }

    @Override // q2.A0
    public final void d2(C0 c02) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, c02);
        G0(A02, 8);
    }

    @Override // q2.A0
    public final float h() {
        throw null;
    }

    @Override // q2.A0
    public final float j() {
        throw null;
    }

    @Override // q2.A0
    public final float m() {
        throw null;
    }

    @Override // q2.A0
    public final void o0(boolean z8) {
        Parcel A02 = A0();
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        A02.writeInt(z8 ? 1 : 0);
        G0(A02, 3);
    }

    @Override // q2.A0
    public final C0 q() {
        C0 b02;
        Parcel D02 = D0(A0(), 11);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            b02 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            b02 = queryLocalInterface instanceof C0 ? (C0) queryLocalInterface : new B0(readStrongBinder);
        }
        D02.recycle();
        return b02;
    }
}
