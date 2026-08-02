package com.withpersona.sdk2.camera.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.hcaptcha.HCaptchaStateListener;

/* loaded from: classes9.dex */
public final class SelfieBrightnessInfo implements Parcelable {
    public static final Parcelable.Creator<SelfieBrightnessInfo> CREATOR = new HCaptchaStateListener.Creator(20);
    public final Float[] averageBrightness3x3;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SelfieBrightnessInfo() {
        this(r1);
        Float[] fArr = new Float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = Float.valueOf(RecyclerView.DECELERATION_RATE);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float getBottomBrightness() {
        Float[] fArr = this.averageBrightness3x3;
        return (((fArr[8].floatValue() + fArr[6].floatValue()) * 0.5f) + (fArr[7].floatValue() * 2.0f)) / 3.0f;
    }

    public final float getLeftBrightness() {
        Float[] fArr = this.averageBrightness3x3;
        return (((fArr[6].floatValue() + fArr[0].floatValue()) * 0.5f) + (fArr[3].floatValue() * 2.0f)) / 3.0f;
    }

    public final float getRightBrightness() {
        Float[] fArr = this.averageBrightness3x3;
        return (((fArr[8].floatValue() + fArr[2].floatValue()) * 0.5f) + (fArr[5].floatValue() * 2.0f)) / 3.0f;
    }

    public final float getTopBrightness() {
        Float[] fArr = this.averageBrightness3x3;
        return (((fArr[2].floatValue() + fArr[0].floatValue()) * 0.5f) + (fArr[1].floatValue() * 2.0f)) / 3.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Float[] fArr = this.averageBrightness3x3;
        int length = fArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 != length; i2++) {
            parcel.writeFloat(fArr[i2].floatValue());
        }
    }

    public SelfieBrightnessInfo(Float[] fArr) {
        this.averageBrightness3x3 = fArr;
    }
}
