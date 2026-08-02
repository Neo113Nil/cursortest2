package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface RecurringReloadConfigurationResult extends Parcelable {

    public final class BalanceBasedReloadResult implements RecurringReloadConfigurationResult {
        public static final Parcelable.Creator<BalanceBasedReloadResult> CREATOR = new WalletHomeScreen.Creator(8);
        public final Money minBalance;
        public final Money reloadAmount;

        public BalanceBasedReloadResult(Money money, Money money2) {
            money.getClass();
            money2.getClass();
            this.minBalance = money;
            this.reloadAmount = money2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceBasedReloadResult)) {
                return false;
            }
            BalanceBasedReloadResult balanceBasedReloadResult = (BalanceBasedReloadResult) obj;
            return Intrinsics.areEqual(this.minBalance, balanceBasedReloadResult.minBalance) && Intrinsics.areEqual(this.reloadAmount, balanceBasedReloadResult.reloadAmount);
        }

        public final int hashCode() {
            return this.reloadAmount.hashCode() + (this.minBalance.hashCode() * 31);
        }

        public final String toString() {
            return "BalanceBasedReloadResult(minBalance=" + this.minBalance + ", reloadAmount=" + this.reloadAmount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.minBalance, i);
            parcel.writeParcelable(this.reloadAmount, i);
        }
    }

    public final class ScheduledReloadResult implements RecurringReloadConfigurationResult {
        public static final Parcelable.Creator<ScheduledReloadResult> CREATOR = new Creator();
        public final Money amount;
        public final Integer dayOfPeriod;
        public final RecurringSchedule.Frequency frequency;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ScheduledReloadResult(RecurringSchedule.Frequency.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Money) parcel.readParcelable(ScheduledReloadResult.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScheduledReloadResult[i];
            }
        }

        public ScheduledReloadResult(RecurringSchedule.Frequency frequency, Integer num, Money money) {
            frequency.getClass();
            money.getClass();
            this.frequency = frequency;
            this.dayOfPeriod = num;
            this.amount = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScheduledReloadResult)) {
                return false;
            }
            ScheduledReloadResult scheduledReloadResult = (ScheduledReloadResult) obj;
            return this.frequency == scheduledReloadResult.frequency && Intrinsics.areEqual(this.dayOfPeriod, scheduledReloadResult.dayOfPeriod) && Intrinsics.areEqual(this.amount, scheduledReloadResult.amount);
        }

        public final int hashCode() {
            int hashCode = this.frequency.hashCode() * 31;
            Integer num = this.dayOfPeriod;
            return this.amount.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "ScheduledReloadResult(frequency=" + this.frequency + ", dayOfPeriod=" + this.dayOfPeriod + ", amount=" + this.amount + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.frequency.name());
            Integer num = this.dayOfPeriod;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
            }
            parcel.writeParcelable(this.amount, i);
        }
    }
}
