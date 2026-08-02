package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AddMoneyScreen implements TransfersScreens, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<AddMoneyScreen> CREATOR = new TaxMenuSheet.Creator(12);
    public final BlockersData blockersData;
    public final Money customSuggestedAmount;
    public final String customTitle;
    public final Money initialAmount;
    public final String instrumentToken;
    public final boolean startInKeypad;

    public AddMoneyScreen(BlockersData blockersData, Money money, String str, String str2, Money money2, boolean z) {
        blockersData.getClass();
        this.blockersData = blockersData;
        this.initialAmount = money;
        this.instrumentToken = str;
        this.customTitle = str2;
        this.customSuggestedAmount = money2;
        this.startInKeypad = z;
    }

    public static AddMoneyScreen copy$default(AddMoneyScreen addMoneyScreen, BlockersData blockersData, Money money, String str, int i) {
        if ((i & 1) != 0) {
            blockersData = addMoneyScreen.blockersData;
        }
        BlockersData blockersData2 = blockersData;
        if ((i & 2) != 0) {
            money = addMoneyScreen.initialAmount;
        }
        Money money2 = money;
        if ((i & 4) != 0) {
            str = addMoneyScreen.instrumentToken;
        }
        String str2 = addMoneyScreen.customTitle;
        Money money3 = addMoneyScreen.customSuggestedAmount;
        boolean z = addMoneyScreen.startInKeypad;
        addMoneyScreen.getClass();
        blockersData2.getClass();
        return new AddMoneyScreen(blockersData2, money2, str, str2, money3, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddMoneyScreen)) {
            return false;
        }
        AddMoneyScreen addMoneyScreen = (AddMoneyScreen) obj;
        return Intrinsics.areEqual(this.blockersData, addMoneyScreen.blockersData) && Intrinsics.areEqual(this.initialAmount, addMoneyScreen.initialAmount) && Intrinsics.areEqual(this.instrumentToken, addMoneyScreen.instrumentToken) && Intrinsics.areEqual(this.customTitle, addMoneyScreen.customTitle) && Intrinsics.areEqual(this.customSuggestedAmount, addMoneyScreen.customSuggestedAmount) && this.startInKeypad == addMoneyScreen.startInKeypad;
    }

    public final int hashCode() {
        int hashCode = this.blockersData.hashCode() * 31;
        Money money = this.initialAmount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.instrumentToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customTitle;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Money money2 = this.customSuggestedAmount;
        return Boolean.hashCode(this.startInKeypad) + ((hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddMoneyScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", initialAmount=");
        sb.append(this.initialAmount);
        sb.append(", instrumentToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.instrumentToken, ", customTitle=", this.customTitle, ", customSuggestedAmount=");
        sb.append(this.customSuggestedAmount);
        sb.append(", startInKeypad=");
        sb.append(this.startInKeypad);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.initialAmount, i);
        parcel.writeString(this.instrumentToken);
        parcel.writeString(this.customTitle);
        parcel.writeParcelable(this.customSuggestedAmount, i);
        parcel.writeInt(this.startInKeypad ? 1 : 0);
    }
}
