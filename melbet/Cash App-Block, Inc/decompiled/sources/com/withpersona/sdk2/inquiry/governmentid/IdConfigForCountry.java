package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class IdConfigForCountry implements Parcelable {
    public static final Parcelable.Creator<IdConfigForCountry> CREATOR = new RawExtraction.Creator(2);
    public final String countryCode;
    public final String countryName;
    public final ArrayList ids;

    public IdConfigForCountry(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.countryName = str;
        this.countryCode = str2;
        this.ids = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdConfigForCountry)) {
            return false;
        }
        IdConfigForCountry idConfigForCountry = (IdConfigForCountry) obj;
        return Intrinsics.areEqual(this.countryName, idConfigForCountry.countryName) && Intrinsics.areEqual(this.countryCode, idConfigForCountry.countryCode) && this.ids.equals(idConfigForCountry.ids);
    }

    public final int hashCode() {
        return this.ids.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.countryName.hashCode() * 31, 31, this.countryCode);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IdConfigForCountry(countryName=", this.countryName, ", countryCode=", this.countryCode, ", ids="), this.ids);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.countryName);
        parcel.writeString(this.countryCode);
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.ids, parcel);
        while (m.hasNext()) {
            ((IdConfig) m.next()).writeToParcel(parcel, i);
        }
    }
}
