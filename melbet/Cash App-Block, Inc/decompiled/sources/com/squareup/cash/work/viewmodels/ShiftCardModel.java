package com.squareup.cash.work.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.work.viewmodels.ClockInButtonState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftCardModel {
    public final ClockInButtonState clockInButtonState;
    public final String dateText;
    public final String locationAndJobText;
    public final String merchantName;
    public final SellerCardViewModel sellerCardViewModel;
    public final String shiftId;
    public final String shiftTimeText;
    public final boolean showDetailsButton;
    public final OffsetDateTime startDateTime;
    public final String timeZoneId;

    public ShiftCardModel(String str, String str2, SellerCardViewModel sellerCardViewModel, String str3, String str4, String str5, ClockInButtonState clockInButtonState, boolean z, OffsetDateTime offsetDateTime, String str6) {
        str2.getClass();
        sellerCardViewModel.getClass();
        str4.getClass();
        clockInButtonState.getClass();
        this.shiftId = str;
        this.merchantName = str2;
        this.sellerCardViewModel = sellerCardViewModel;
        this.dateText = str3;
        this.shiftTimeText = str4;
        this.locationAndJobText = str5;
        this.clockInButtonState = clockInButtonState;
        this.showDetailsButton = z;
        this.startDateTime = offsetDateTime;
        this.timeZoneId = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftCardModel)) {
            return false;
        }
        ShiftCardModel shiftCardModel = (ShiftCardModel) obj;
        return Intrinsics.areEqual(this.shiftId, shiftCardModel.shiftId) && Intrinsics.areEqual(this.merchantName, shiftCardModel.merchantName) && Intrinsics.areEqual(this.sellerCardViewModel, shiftCardModel.sellerCardViewModel) && Intrinsics.areEqual(this.dateText, shiftCardModel.dateText) && Intrinsics.areEqual(this.shiftTimeText, shiftCardModel.shiftTimeText) && Intrinsics.areEqual(this.locationAndJobText, shiftCardModel.locationAndJobText) && Intrinsics.areEqual(this.clockInButtonState, shiftCardModel.clockInButtonState) && this.showDetailsButton == shiftCardModel.showDetailsButton && Intrinsics.areEqual(this.startDateTime, shiftCardModel.startDateTime) && Intrinsics.areEqual(this.timeZoneId, shiftCardModel.timeZoneId);
    }

    public final int hashCode() {
        String str = this.shiftId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.sellerCardViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.merchantName)) * 31, 31, this.dateText), 31, this.shiftTimeText);
        String str2 = this.locationAndJobText;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.clockInButtonState.hashCode() + ((m + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.showDetailsButton);
        OffsetDateTime offsetDateTime = this.startDateTime;
        int hashCode = (m2 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str3 = this.timeZoneId;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftCardModel(shiftId=", this.shiftId, ", merchantName=", this.merchantName, ", sellerCardViewModel=");
        m.append(this.sellerCardViewModel);
        m.append(", dateText=");
        m.append(this.dateText);
        m.append(", shiftTimeText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.shiftTimeText, ", locationAndJobText=", this.locationAndJobText, ", clockInButtonState=");
        m.append(this.clockInButtonState);
        m.append(", showDetailsButton=");
        m.append(this.showDetailsButton);
        m.append(", startDateTime=");
        m.append(this.startDateTime);
        m.append(", timeZoneId=");
        m.append(this.timeZoneId);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ ShiftCardModel(String str, String str2, SellerCardViewModel sellerCardViewModel, String str3, String str4, String str5, ClockInButtonState clockInButtonState, boolean z, int i) {
        this(str, str2, sellerCardViewModel, str3, str4, str5, (i & 64) != 0 ? ClockInButtonState.Hidden.INSTANCE : clockInButtonState, z, null, null);
    }
}
