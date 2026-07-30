package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;

/* renamed from: q2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4920w extends AbstractBinderC3186f8 implements InterfaceC4922x {
    public AbstractBinderC4920w() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                z();
                break;
            case 2:
                int readInt = parcel.readInt();
                AbstractC3241g8.f(parcel);
                D(readInt);
                break;
            case 3:
                break;
            case 4:
                f();
                break;
            case 5:
                e();
                break;
            case 6:
                g();
                break;
            case 7:
                h();
                break;
            case 8:
                C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
                AbstractC3241g8.f(parcel);
                h0(c4927z0);
                break;
            case 9:
                l();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
