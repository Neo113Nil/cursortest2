package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ckq;
import defpackage.cri;
import defpackage.oy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BitmapTeleporter extends cri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ckq(14);
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            oy.at(null);
            throw null;
        }
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, this.a);
        oy.H(parcel, 2, this.b, i | 1);
        oy.v(parcel, 3, this.c);
        oy.r(parcel, q);
        this.b = null;
    }
}
