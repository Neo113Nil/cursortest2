package i4;

import android.os.Parcel;
import c4.w0;

/* loaded from: classes.dex */
public abstract class e extends a4.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // a4.b
    protected final boolean B3(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 3:
                break;
            case 4:
            case 6:
                break;
            case 5:
            default:
                return false;
            case w0.f2149o /* 7 */:
                break;
            case w0.f2150p /* 8 */:
                b2((l) a4.c.a(parcel, l.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
