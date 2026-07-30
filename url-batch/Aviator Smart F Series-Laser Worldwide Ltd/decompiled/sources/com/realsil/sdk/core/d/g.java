package com.realsil.sdk.core.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.realsil.sdk.core.bluetooth.scanner.BasicFilter;

/* loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BasicFilter(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i8) {
        return new BasicFilter[i8];
    }
}
