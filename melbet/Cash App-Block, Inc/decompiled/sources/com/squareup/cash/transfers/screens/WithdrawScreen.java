package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WithdrawScreen implements TransfersScreens, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<WithdrawScreen> CREATOR = new WalletHomeScreen.Creator(18);
    public final Money amount;
    public final BlockersData blockersData;
    public final DepositPreference depositPreference;
    public final String instrumentToken;

    public WithdrawScreen(BlockersData blockersData, Money money, String str, DepositPreference depositPreference) {
        blockersData.getClass();
        this.blockersData = blockersData;
        this.amount = money;
        this.instrumentToken = str;
        this.depositPreference = depositPreference;
    }

    public static WithdrawScreen copy$default(WithdrawScreen withdrawScreen, BlockersData blockersData, Money money, String str, DepositPreference depositPreference, int i) {
        if ((i & 1) != 0) {
            blockersData = withdrawScreen.blockersData;
        }
        if ((i & 2) != 0) {
            money = withdrawScreen.amount;
        }
        if ((i & 4) != 0) {
            str = withdrawScreen.instrumentToken;
        }
        if ((i & 8) != 0) {
            depositPreference = withdrawScreen.depositPreference;
        }
        withdrawScreen.getClass();
        blockersData.getClass();
        return new WithdrawScreen(blockersData, money, str, depositPreference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawScreen)) {
            return false;
        }
        WithdrawScreen withdrawScreen = (WithdrawScreen) obj;
        return Intrinsics.areEqual(this.blockersData, withdrawScreen.blockersData) && Intrinsics.areEqual(this.amount, withdrawScreen.amount) && Intrinsics.areEqual(this.instrumentToken, withdrawScreen.instrumentToken) && this.depositPreference == withdrawScreen.depositPreference;
    }

    public final int hashCode() {
        int hashCode = this.blockersData.hashCode() * 31;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        String str = this.instrumentToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DepositPreference depositPreference = this.depositPreference;
        return hashCode3 + (depositPreference != null ? depositPreference.hashCode() : 0);
    }

    public final String toString() {
        return "WithdrawScreen(blockersData=" + this.blockersData + ", amount=" + this.amount + ", instrumentToken=" + this.instrumentToken + ", depositPreference=" + this.depositPreference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.amount, i);
        parcel.writeString(this.instrumentToken);
        DepositPreference depositPreference = this.depositPreference;
        if (depositPreference == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(depositPreference.name());
        }
    }
}
