package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class j extends b implements k {
    public j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    protected final boolean a(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 2) {
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            e(bundle);
            return true;
        }
        if (i4 == 3) {
            Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            c(bundle2);
            return true;
        }
        if (i4 == 4) {
            Bundle bundle3 = (Bundle) c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            d(bundle3);
            return true;
        }
        if (i4 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) c.a(parcel, Bundle.CREATOR);
        c.b(parcel);
        b(bundle4);
        return true;
    }
}
