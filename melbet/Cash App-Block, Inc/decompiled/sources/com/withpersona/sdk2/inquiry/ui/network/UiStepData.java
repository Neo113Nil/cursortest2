package com.withpersona.sdk2.inquiry.ui.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public final class UiStepData implements StepData {
    public static final Parcelable.Creator<UiStepData> CREATOR = new Element.AnonymousClass1(25);
    public final LinkedHashMap componentParams;
    public final String stepName;

    public UiStepData(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.stepName = str;
        this.componentParams = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiStepData)) {
            return false;
        }
        UiStepData uiStepData = (UiStepData) obj;
        return Intrinsics.areEqual(this.stepName, uiStepData.stepName) && this.componentParams.equals(uiStepData.componentParams);
    }

    public final int hashCode() {
        return this.componentParams.hashCode() + (this.stepName.hashCode() * 31);
    }

    public final String toString() {
        return "UiStepData(stepName=" + this.stepName + ", componentParams=" + this.componentParams + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.stepName);
        LinkedHashMap linkedHashMap = this.componentParams;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
