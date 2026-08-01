package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new androidx.fragment.app.b(9);

    /* renamed from: f, reason: collision with root package name */
    public Long f1067f;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Long l4 = this.f1067f;
        if (l4 != null) {
            arrayList.add(l4);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f1067f);
    }
}
