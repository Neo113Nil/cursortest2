package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.camera.ExtractedTexts;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class ImageLightCondition implements Parcelable {
    public static final Parcelable.Creator<ImageLightCondition> CREATOR = new ExtractedTexts.Creator(9);
    public final double lowHighContrast;
    public final double luminosity;
    public final double rmsContrast;
    public final int sampleSize;

    public ImageLightCondition(double d, double d2, double d3, int i) {
        this.luminosity = d;
        this.rmsContrast = d2;
        this.lowHighContrast = d3;
        this.sampleSize = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageLightCondition)) {
            return false;
        }
        ImageLightCondition imageLightCondition = (ImageLightCondition) obj;
        return Double.compare(this.luminosity, imageLightCondition.luminosity) == 0 && Double.compare(this.rmsContrast, imageLightCondition.rmsContrast) == 0 && Double.compare(this.lowHighContrast, imageLightCondition.lowHighContrast) == 0 && this.sampleSize == imageLightCondition.sampleSize;
    }

    public final int hashCode() {
        return Integer.hashCode(this.sampleSize) + Fragment$5$$ExternalSyntheticOutline0.m(this.lowHighContrast, Fragment$5$$ExternalSyntheticOutline0.m(this.rmsContrast, Double.hashCode(this.luminosity) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ImageLightCondition(luminosity=", ", rmsContrast=", this.luminosity);
        m.append(this.rmsContrast);
        m.append(", lowHighContrast=");
        m.append(this.lowHighContrast);
        m.append(", sampleSize=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sampleSize, ")", m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeDouble(this.luminosity);
        parcel.writeDouble(this.rmsContrast);
        parcel.writeDouble(this.lowHighContrast);
        parcel.writeInt(this.sampleSize);
    }
}
