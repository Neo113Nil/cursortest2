package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class coj extends bms implements cok {
    public coj() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) bmt.a(parcel, Status.CREATOR);
        bmt.b(parcel);
        b(status);
        return true;
    }
}
