package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class fz extends ae implements gz {
    public fz() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            h();
        } else if (i7 == 2) {
            f();
        } else if (i7 == 3) {
            e();
        } else if (i7 == 4) {
            b();
        } else {
            if (i7 != 5) {
                return false;
            }
            S3(be.g(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
