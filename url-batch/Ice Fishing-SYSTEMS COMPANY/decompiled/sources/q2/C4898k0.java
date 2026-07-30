package q2;

import android.os.Parcel;

/* renamed from: q2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4898k0 extends Z2.a implements InterfaceC4900l0 {
    @Override // q2.InterfaceC4900l0
    public final String c() {
        Parcel D02 = D0(A0(), 1);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4900l0
    public final String f() {
        Parcel D02 = D0(A0(), 2);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }
}
