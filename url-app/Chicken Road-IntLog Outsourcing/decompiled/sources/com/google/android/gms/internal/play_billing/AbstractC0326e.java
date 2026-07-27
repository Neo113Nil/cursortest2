package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import b2.AbstractC0279e;

/* renamed from: com.google.android.gms.internal.play_billing.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0326e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5173a = 0;

    static {
        AbstractC0326e.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AbstractC0279e.d(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
