package com.withpersona.sdk2.inquiry.types.collected_data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.types.collected_data.GovernmentIdCapture;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.Element;

/* loaded from: classes9.dex */
public abstract class StepData implements Closeable, Parcelable {

    public final class DocumentStepData extends StepData {
        public static final Parcelable.Creator<DocumentStepData> CREATOR = new Element.AnonymousClass1(11);
        public final ArrayList documents;
        public final String stepName;

        public DocumentStepData(String str, ArrayList arrayList) {
            str.getClass();
            this.stepName = str;
            this.documents = arrayList;
        }

        @Override // com.withpersona.sdk2.inquiry.types.collected_data.StepData, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.documents.iterator();
            while (it.hasNext()) {
                ((DocumentFile) it.next()).data.delete();
            }
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
            return Intrinsics.areEqual(this.stepName, documentStepData.stepName) && this.documents.equals(documentStepData.documents);
        }

        public final int hashCode() {
            return this.documents.hashCode() + (this.stepName.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.documents, "DocumentStepData(stepName=", this.stepName, ", documents=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.stepName);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.documents, parcel);
            while (m.hasNext()) {
                DocumentFile documentFile = (DocumentFile) m.next();
                documentFile.getClass();
                parcel.writeSerializable(documentFile.data);
            }
        }
    }

    public final class GovernmentIdStepData extends StepData {
        public static final Parcelable.Creator<GovernmentIdStepData> CREATOR = new Element.AnonymousClass1(12);
        public final ArrayList captures;
        public final CollectedGovernmentIdDetails idDetails;
        public final String stepName;

        public GovernmentIdStepData(String str, ArrayList arrayList, CollectedGovernmentIdDetails collectedGovernmentIdDetails) {
            str.getClass();
            collectedGovernmentIdDetails.getClass();
            this.stepName = str;
            this.captures = arrayList;
            this.idDetails = collectedGovernmentIdDetails;
        }

        @Override // com.withpersona.sdk2.inquiry.types.collected_data.StepData, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.captures.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((GovernmentIdCapture) it.next()).frames.iterator();
                while (it2.hasNext()) {
                    ((GovernmentIdCapture.Frame) it2.next()).data.delete();
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GovernmentIdStepData)) {
                return false;
            }
            GovernmentIdStepData governmentIdStepData = (GovernmentIdStepData) obj;
            return Intrinsics.areEqual(this.stepName, governmentIdStepData.stepName) && this.captures.equals(governmentIdStepData.captures) && Intrinsics.areEqual(this.idDetails, governmentIdStepData.idDetails);
        }

        public final int hashCode() {
            return this.idDetails.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.captures, this.stepName.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.captures, "GovernmentIdStepData(stepName=", this.stepName, ", captures=", ", idDetails=");
            m.append(this.idDetails);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.stepName);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.captures, parcel);
            while (m.hasNext()) {
                ((GovernmentIdCapture) m.next()).writeToParcel(parcel, i);
            }
            this.idDetails.writeToParcel(parcel, i);
        }
    }

    public final class SelfieStepData extends StepData {
        public static final Parcelable.Creator<SelfieStepData> CREATOR = new Element.AnonymousClass1(13);
        public final SelfieCapture centerCapture;
        public final SelfieCapture leftCapture;
        public final SelfieCapture rightCapture;
        public final String stepName;

        public SelfieStepData(String str, SelfieCapture selfieCapture, SelfieCapture selfieCapture2, SelfieCapture selfieCapture3) {
            str.getClass();
            this.stepName = str;
            this.centerCapture = selfieCapture;
            this.leftCapture = selfieCapture2;
            this.rightCapture = selfieCapture3;
        }

        @Override // com.withpersona.sdk2.inquiry.types.collected_data.StepData, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            File file;
            for (SelfieCapture selfieCapture : CollectionsKt__CollectionsKt.listOf((Object[]) new SelfieCapture[]{this.centerCapture, this.leftCapture, this.rightCapture})) {
                if (selfieCapture != null && (file = selfieCapture.data) != null) {
                    file.delete();
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelfieStepData)) {
                return false;
            }
            SelfieStepData selfieStepData = (SelfieStepData) obj;
            return Intrinsics.areEqual(this.stepName, selfieStepData.stepName) && Intrinsics.areEqual(this.centerCapture, selfieStepData.centerCapture) && Intrinsics.areEqual(this.leftCapture, selfieStepData.leftCapture) && Intrinsics.areEqual(this.rightCapture, selfieStepData.rightCapture);
        }

        public final int hashCode() {
            int hashCode = this.stepName.hashCode() * 31;
            SelfieCapture selfieCapture = this.centerCapture;
            int hashCode2 = (hashCode + (selfieCapture == null ? 0 : selfieCapture.hashCode())) * 31;
            SelfieCapture selfieCapture2 = this.leftCapture;
            int hashCode3 = (hashCode2 + (selfieCapture2 == null ? 0 : selfieCapture2.hashCode())) * 31;
            SelfieCapture selfieCapture3 = this.rightCapture;
            return hashCode3 + (selfieCapture3 != null ? selfieCapture3.hashCode() : 0);
        }

        public final String toString() {
            return "SelfieStepData(stepName=" + this.stepName + ", centerCapture=" + this.centerCapture + ", leftCapture=" + this.leftCapture + ", rightCapture=" + this.rightCapture + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.stepName);
            SelfieCapture selfieCapture = this.centerCapture;
            if (selfieCapture == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieCapture.writeToParcel(parcel, i);
            }
            SelfieCapture selfieCapture2 = this.leftCapture;
            if (selfieCapture2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieCapture2.writeToParcel(parcel, i);
            }
            SelfieCapture selfieCapture3 = this.rightCapture;
            if (selfieCapture3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selfieCapture3.writeToParcel(parcel, i);
            }
        }
    }

    public final class UiStepData extends StepData {
        public static final Parcelable.Creator<UiStepData> CREATOR = new Element.AnonymousClass1(14);
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
                parcel.writeValue(entry.getValue());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
