package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;

/* renamed from: q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4909q extends AbstractBinderC3186f8 implements InterfaceC4916u {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4877a f40115n;

    public BinderC4909q(InterfaceC4877a interfaceC4877a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f40115n = interfaceC4877a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        z();
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.InterfaceC4916u
    public final void z() {
        this.f40115n.onAdClicked();
    }
}
