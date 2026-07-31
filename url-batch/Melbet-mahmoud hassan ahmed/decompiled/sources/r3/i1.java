package r3;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class i1 extends b4.b implements j1 {
    public i1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // b4.b
    protected final boolean E(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            x3.a g7 = g();
            parcel2.writeNoException();
            b4.c.c(parcel2, g7);
        } else {
            if (i7 != 2) {
                return false;
            }
            int b7 = b();
            parcel2.writeNoException();
            parcel2.writeInt(b7);
        }
        return true;
    }
}
