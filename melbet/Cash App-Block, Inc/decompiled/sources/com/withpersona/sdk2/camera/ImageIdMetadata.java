package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.camera.ExtractedTexts;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ImageIdMetadata implements Parcelable {
    public static final Parcelable.Creator<ImageIdMetadata> CREATOR = new ExtractedTexts.Creator(8);
    public final String textOnImage;

    public ImageIdMetadata(String str) {
        str.getClass();
        this.textOnImage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageIdMetadata) && Intrinsics.areEqual(this.textOnImage, ((ImageIdMetadata) obj).textOnImage);
    }

    public final int hashCode() {
        return this.textOnImage.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ImageIdMetadata(textOnImage=", this.textOnImage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.textOnImage);
    }
}
