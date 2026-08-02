package com.squareup.cash.tax.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class TaxTooltipScreen extends MainScreens implements OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<TaxTooltipScreen> CREATOR = new TaxMenuSheet.Creator(3);
    public final int anchorBottom;
    public final int anchorLeft;
    public final int anchorWidth;

    public TaxTooltipScreen(int i, int i2, int i3) {
        super(3);
        this.anchorBottom = i;
        this.anchorLeft = i2;
        this.anchorWidth = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxTooltipScreen)) {
            return false;
        }
        TaxTooltipScreen taxTooltipScreen = (TaxTooltipScreen) obj;
        return this.anchorBottom == taxTooltipScreen.anchorBottom && this.anchorLeft == taxTooltipScreen.anchorLeft && this.anchorWidth == taxTooltipScreen.anchorWidth;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return Integer.hashCode(this.anchorWidth) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.anchorLeft, Integer.hashCode(this.anchorBottom) * 31, 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.anchorWidth, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.anchorBottom, this.anchorLeft, "TaxTooltipScreen(anchorBottom=", ", anchorLeft=", ", anchorWidth="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.anchorBottom);
        parcel.writeInt(this.anchorLeft);
        parcel.writeInt(this.anchorWidth);
    }
}
