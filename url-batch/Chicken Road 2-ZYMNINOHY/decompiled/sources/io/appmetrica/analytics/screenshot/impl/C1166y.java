package io.appmetrica.analytics.screenshot.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1167z(parcel.readByte() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new C1167z[i4];
    }
}
