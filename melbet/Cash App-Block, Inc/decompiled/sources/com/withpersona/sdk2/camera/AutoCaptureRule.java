package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.camera.ExtractedTexts;

/* loaded from: classes5.dex */
public abstract class AutoCaptureRule implements Parcelable {

    public final class BarcodePdf417Rule extends AutoCaptureRule {
        public static final Parcelable.Creator<BarcodePdf417Rule> CREATOR = new ExtractedTexts.Creator(1);
        public final boolean isRequired;

        public BarcodePdf417Rule(boolean z) {
            this.isRequired = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BarcodePdf417Rule) && this.isRequired == ((BarcodePdf417Rule) obj).isRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("BarcodePdf417Rule(isRequired=", ")", this.isRequired);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isRequired ? 1 : 0);
        }
    }

    public final class FrontOrBackRule extends AutoCaptureRule {
        public static final Parcelable.Creator<FrontOrBackRule> CREATOR = new ExtractedTexts.Creator(2);
        public final boolean isRequired;

        public FrontOrBackRule(boolean z) {
            this.isRequired = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrontOrBackRule) && this.isRequired == ((FrontOrBackRule) obj).isRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("FrontOrBackRule(isRequired=", ")", this.isRequired);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isRequired ? 1 : 0);
        }
    }

    public final class FrontRule extends AutoCaptureRule {
        public static final Parcelable.Creator<FrontRule> CREATOR = new ExtractedTexts.Creator(3);
        public final boolean isRequired;

        public FrontRule(boolean z) {
            this.isRequired = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrontRule) && this.isRequired == ((FrontRule) obj).isRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("FrontRule(isRequired=", ")", this.isRequired);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isRequired ? 1 : 0);
        }
    }

    public final class MrzRule extends AutoCaptureRule {
        public static final Parcelable.Creator<MrzRule> CREATOR = new ExtractedTexts.Creator(4);
        public final boolean isRequired;

        public MrzRule(boolean z) {
            this.isRequired = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MrzRule) && this.isRequired == ((MrzRule) obj).isRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("MrzRule(isRequired=", ")", this.isRequired);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isRequired ? 1 : 0);
        }
    }

    public final class TextExtractionRule extends AutoCaptureRule {
        public static final Parcelable.Creator<TextExtractionRule> CREATOR = new ExtractedTexts.Creator(5);
        public final boolean isRequired;

        public TextExtractionRule(boolean z) {
            this.isRequired = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextExtractionRule) && this.isRequired == ((TextExtractionRule) obj).isRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRequired);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("TextExtractionRule(isRequired=", ")", this.isRequired);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isRequired ? 1 : 0);
        }
    }
}
