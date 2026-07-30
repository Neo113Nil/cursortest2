package q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.C4015uc;
import com.google.android.gms.internal.ads.InterfaceC3423jd;
import com.google.android.gms.internal.ads.InterfaceC4231yc;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4886e0 extends Z2.a implements InterfaceC4890g0 {
    public C4886e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 2);
    }

    @Override // q2.InterfaceC4890g0
    public final void A1(V2.a aVar, String str) {
        Parcel A02 = A0();
        A02.writeString(null);
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 6);
    }

    @Override // q2.InterfaceC4890g0
    public final void O0(InterfaceC4231yc interfaceC4231yc) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4231yc);
        G0(A02, 12);
    }

    @Override // q2.InterfaceC4890g0
    public final void W(String str) {
        Parcel A02 = A0();
        A02.writeString(str);
        G0(A02, 18);
    }

    @Override // q2.InterfaceC4890g0
    public final void X() {
        G0(A0(), 19);
    }

    @Override // q2.InterfaceC4890g0
    public final void c() {
        G0(A0(), 1);
    }

    @Override // q2.InterfaceC4890g0
    public final void d0(boolean z8) {
        Parcel A02 = A0();
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        A02.writeInt(z8 ? 1 : 0);
        G0(A02, 4);
    }

    @Override // q2.InterfaceC4890g0
    public final void g2(X0 x02) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, x02);
        G0(A02, 14);
    }

    @Override // q2.InterfaceC4890g0
    public final List n() {
        Parcel D02 = D0(A0(), 13);
        ArrayList createTypedArrayList = D02.createTypedArrayList(C4015uc.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // q2.InterfaceC4890g0
    public final void w() {
        G0(A0(), 15);
    }

    @Override // q2.InterfaceC4890g0
    public final void z2(InterfaceC3423jd interfaceC3423jd) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC3423jd);
        G0(A02, 11);
    }
}
