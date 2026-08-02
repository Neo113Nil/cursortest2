package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.play_billing.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0217e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2850a = 0;

    static {
        AbstractC0217e.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AbstractC0033i.h(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
