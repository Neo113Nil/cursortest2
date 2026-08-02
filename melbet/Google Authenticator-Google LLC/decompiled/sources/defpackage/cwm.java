package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cwm extends bms implements cwn {
    public cwm() {
        super("com.google.android.gms.inappreach.internal.IOnAccountDataResponseListener");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        bmt.b(parcel);
        b(createByteArray);
        return true;
    }
}
