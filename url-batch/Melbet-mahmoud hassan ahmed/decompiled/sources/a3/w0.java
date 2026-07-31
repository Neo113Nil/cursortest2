package a3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.be;
import x3.a;

/* loaded from: classes.dex */
public abstract class w0 extends ae implements x0 {
    public w0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            boolean zzf = zzf(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            be.c(parcel2, zzf);
        } else {
            if (i7 != 2) {
                return false;
            }
            zze(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
