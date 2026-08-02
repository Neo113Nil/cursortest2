package com.withpersona.sdk2.inquiry.document.network;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class DocumentStepData implements StepData {
    public static final Parcelable.Creator<DocumentStepData> CREATOR = new Frame.Creator(6);
    public final List documents;
    public final String stepName;

    public DocumentStepData(String str, List list) {
        str.getClass();
        list.getClass();
        this.stepName = str;
        this.documents = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentStepData)) {
            return false;
        }
        DocumentStepData documentStepData = (DocumentStepData) obj;
        return Intrinsics.areEqual(this.stepName, documentStepData.stepName) && Intrinsics.areEqual(this.documents, documentStepData.documents);
    }

    public final int hashCode() {
        return this.documents.hashCode() + (this.stepName.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("DocumentStepData(stepName=", this.stepName, ", documents=", ")", this.documents);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.stepName);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.documents, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
