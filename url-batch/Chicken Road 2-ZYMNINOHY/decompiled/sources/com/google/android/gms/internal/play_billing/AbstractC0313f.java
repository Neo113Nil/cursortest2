package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.play_billing.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0313f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5945a = 0;

    static {
        AbstractC0313f.class.getClassLoader();
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
            throw new BadParcelableException(AbstractC0005f.j(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
