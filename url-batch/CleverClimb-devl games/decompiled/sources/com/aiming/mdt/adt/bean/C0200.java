package com.aiming.mdt.adt.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.aiming.mdt.adt.bean.ʻʽ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0200 implements Parcelable.Creator<AdBean> {
    C0200() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AdBean createFromParcel(Parcel parcel) {
        return new AdBean(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdBean[] newArray(int i) {
        return new AdBean[i];
    }
}
