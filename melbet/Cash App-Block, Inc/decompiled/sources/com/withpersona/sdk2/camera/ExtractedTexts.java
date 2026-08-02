package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ExtractedTexts implements Parcelable {
    public static final Parcelable.Creator<ExtractedTexts> CREATOR = new Creator(0);
    public final Date dateOfBirth;
    public final Date expirationDate;

    /* loaded from: classes5.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new ExtractedTexts((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
                case 1:
                    parcel.getClass();
                    return new AutoCaptureRule.BarcodePdf417Rule(parcel.readInt() != 0);
                case 2:
                    parcel.getClass();
                    return new AutoCaptureRule.FrontOrBackRule(parcel.readInt() != 0);
                case 3:
                    parcel.getClass();
                    return new AutoCaptureRule.FrontRule(parcel.readInt() != 0);
                case 4:
                    parcel.getClass();
                    return new AutoCaptureRule.MrzRule(parcel.readInt() != 0);
                case 5:
                    parcel.getClass();
                    return new AutoCaptureRule.TextExtractionRule(parcel.readInt() != 0);
                case 6:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(AutoCaptureRuleSet.class, parcel, arrayList, i, 1);
                    }
                    return new AutoCaptureRuleSet(arrayList);
                case 7:
                    parcel.getClass();
                    return new CameraProperties(parcel.readString(), CameraProperties.FacingMode.valueOf(parcel.readString()), parcel.readSize(), parcel.readInt(), parcel.readInt());
                case 8:
                    parcel.getClass();
                    return new ImageIdMetadata(parcel.readString());
                default:
                    parcel.getClass();
                    return new ImageLightCondition(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new ExtractedTexts[i];
                case 1:
                    return new AutoCaptureRule.BarcodePdf417Rule[i];
                case 2:
                    return new AutoCaptureRule.FrontOrBackRule[i];
                case 3:
                    return new AutoCaptureRule.FrontRule[i];
                case 4:
                    return new AutoCaptureRule.MrzRule[i];
                case 5:
                    return new AutoCaptureRule.TextExtractionRule[i];
                case 6:
                    return new AutoCaptureRuleSet[i];
                case 7:
                    return new CameraProperties[i];
                case 8:
                    return new ImageIdMetadata[i];
                default:
                    return new ImageLightCondition[i];
            }
        }
    }

    public ExtractedTexts(Date date, Date date2) {
        date.getClass();
        date2.getClass();
        this.dateOfBirth = date;
        this.expirationDate = date2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtractedTexts)) {
            return false;
        }
        ExtractedTexts extractedTexts = (ExtractedTexts) obj;
        return Intrinsics.areEqual(this.dateOfBirth, extractedTexts.dateOfBirth) && Intrinsics.areEqual(this.expirationDate, extractedTexts.expirationDate);
    }

    public final int hashCode() {
        return this.expirationDate.hashCode() + (this.dateOfBirth.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedTexts(dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.dateOfBirth);
        parcel.writeSerializable(this.expirationDate);
    }
}
