package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class GovernmentIdRequestArguments implements Parcelable {
    public static final Parcelable.Creator<GovernmentIdRequestArguments> CREATOR = new RawExtraction.Creator(22);
    public final String fieldKeyDocument;
    public final String fieldKeyIdClass;
    public final List ids;

    public GovernmentIdRequestArguments(List list, String str, String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.ids = list;
        this.fieldKeyDocument = str;
        this.fieldKeyIdClass = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GovernmentIdRequestArguments)) {
            return false;
        }
        GovernmentIdRequestArguments governmentIdRequestArguments = (GovernmentIdRequestArguments) obj;
        return Intrinsics.areEqual(this.ids, governmentIdRequestArguments.ids) && Intrinsics.areEqual(this.fieldKeyDocument, governmentIdRequestArguments.fieldKeyDocument) && Intrinsics.areEqual(this.fieldKeyIdClass, governmentIdRequestArguments.fieldKeyIdClass);
    }

    public final int hashCode() {
        return this.fieldKeyIdClass.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.ids.hashCode() * 31, 31, this.fieldKeyDocument);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m("GovernmentIdRequestArguments(ids=", ", fieldKeyDocument=", this.fieldKeyDocument, ", fieldKeyIdClass=", this.ids), this.fieldKeyIdClass, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.ids, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeString(this.fieldKeyDocument);
        parcel.writeString(this.fieldKeyIdClass);
    }
}
