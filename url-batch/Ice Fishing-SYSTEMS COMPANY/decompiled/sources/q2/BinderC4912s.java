package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import k2.AbstractC4642m;

/* renamed from: q2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4912s extends AbstractBinderC3186f8 implements InterfaceC4878a0 {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC4642m f40121n;

    public BinderC4912s(AbstractC4642m abstractC4642m) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f40121n = abstractC4642m;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            O1(c4927z0);
        } else if (i == 2) {
            x();
        } else if (i == 3) {
            o();
        } else if (i == 4) {
            c();
        } else {
            if (i != 5) {
                return false;
            }
            f();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.InterfaceC4878a0
    public final void O1(C4927z0 c4927z0) {
        AbstractC4642m abstractC4642m = this.f40121n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdFailedToShowFullScreenContent(c4927z0.a());
        }
    }

    @Override // q2.InterfaceC4878a0
    public final void c() {
        AbstractC4642m abstractC4642m = this.f40121n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdImpression();
        }
    }

    @Override // q2.InterfaceC4878a0
    public final void f() {
        AbstractC4642m abstractC4642m = this.f40121n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdClicked();
        }
    }

    @Override // q2.InterfaceC4878a0
    public final void o() {
        AbstractC4642m abstractC4642m = this.f40121n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdDismissedFullScreenContent();
        }
    }

    @Override // q2.InterfaceC4878a0
    public final void x() {
        AbstractC4642m abstractC4642m = this.f40121n;
        if (abstractC4642m != null) {
            abstractC4642m.onAdShowedFullScreenContent();
        }
    }
}
