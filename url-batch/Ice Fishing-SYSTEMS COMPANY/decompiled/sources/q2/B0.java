package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* loaded from: classes.dex */
public final class B0 extends Z2.a implements C0 {
    public B0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks", 2);
    }

    @Override // q2.C0
    public final void c() {
        G0(A0(), 1);
    }

    @Override // q2.C0
    public final void e() {
        G0(A0(), 3);
    }

    @Override // q2.C0
    public final void f() {
        G0(A0(), 2);
    }

    @Override // q2.C0
    public final void g() {
        G0(A0(), 4);
    }

    @Override // q2.C0
    public final void y2(boolean z8) {
        Parcel A02 = A0();
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        A02.writeInt(z8 ? 1 : 0);
        G0(A02, 5);
    }
}
