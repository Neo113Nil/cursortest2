package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RecurringReloadConfigurationScreen implements TransfersScreens, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<RecurringReloadConfigurationScreen> CREATOR = new WalletHomeScreen.Creator(9);
    public final Mode mode;
    public final AskedQuestion question;

    /* loaded from: classes7.dex */
    public interface Mode extends Parcelable {

        public final class BalanceBased implements Mode {
            public static final Parcelable.Creator<BalanceBased> CREATOR = new WalletHomeScreen.Creator(10);
            public final Money existingMinBalance;
            public final Money existingReloadAmount;
            public final String flowToken;
            public final boolean startAtReloadAmount;

            public BalanceBased(Money money, Money money2, boolean z, String str) {
                this.existingMinBalance = money;
                this.existingReloadAmount = money2;
                this.startAtReloadAmount = z;
                this.flowToken = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BalanceBased)) {
                    return false;
                }
                BalanceBased balanceBased = (BalanceBased) obj;
                return Intrinsics.areEqual(this.existingMinBalance, balanceBased.existingMinBalance) && Intrinsics.areEqual(this.existingReloadAmount, balanceBased.existingReloadAmount) && this.startAtReloadAmount == balanceBased.startAtReloadAmount && Intrinsics.areEqual(this.flowToken, balanceBased.flowToken);
            }

            public final int hashCode() {
                Money money = this.existingMinBalance;
                int hashCode = (money == null ? 0 : money.hashCode()) * 31;
                Money money2 = this.existingReloadAmount;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (money2 == null ? 0 : money2.hashCode())) * 31, 31, this.startAtReloadAmount);
                String str = this.flowToken;
                return m + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "BalanceBased(existingMinBalance=" + this.existingMinBalance + ", existingReloadAmount=" + this.existingReloadAmount + ", startAtReloadAmount=" + this.startAtReloadAmount + ", flowToken=" + this.flowToken + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.existingMinBalance, i);
                parcel.writeParcelable(this.existingReloadAmount, i);
                parcel.writeInt(this.startAtReloadAmount ? 1 : 0);
                parcel.writeString(this.flowToken);
            }
        }

        public final class Scheduled implements Mode {
            public static final Parcelable.Creator<Scheduled> CREATOR = new Creator();
            public final Money existingAmount;
            public final Integer existingDayOfPeriod;
            public final RecurringSchedule.Frequency existingFrequency;
            public final ScheduledStartAt startAt;

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Scheduled(parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (Money) parcel.readParcelable(Scheduled.class.getClassLoader()), ScheduledStartAt.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Scheduled[i];
                }
            }

            public Scheduled(RecurringSchedule.Frequency frequency, Integer num, Money money, ScheduledStartAt scheduledStartAt) {
                scheduledStartAt.getClass();
                this.existingFrequency = frequency;
                this.existingDayOfPeriod = num;
                this.existingAmount = money;
                this.startAt = scheduledStartAt;
                if (num != null && frequency == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("existingDayOfPeriod requires existingFrequency to be set");
                    throw null;
                }
                if (scheduledStartAt == ScheduledStartAt.FREQUENCY || frequency != null) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m("startAt=", scheduledStartAt, " requires existingFrequency to be set");
                throw null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Scheduled)) {
                    return false;
                }
                Scheduled scheduled = (Scheduled) obj;
                return this.existingFrequency == scheduled.existingFrequency && Intrinsics.areEqual(this.existingDayOfPeriod, scheduled.existingDayOfPeriod) && Intrinsics.areEqual(this.existingAmount, scheduled.existingAmount) && this.startAt == scheduled.startAt;
            }

            public final int hashCode() {
                RecurringSchedule.Frequency frequency = this.existingFrequency;
                int hashCode = (frequency == null ? 0 : frequency.hashCode()) * 31;
                Integer num = this.existingDayOfPeriod;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Money money = this.existingAmount;
                return this.startAt.hashCode() + ((hashCode2 + (money != null ? money.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Scheduled(existingFrequency=" + this.existingFrequency + ", existingDayOfPeriod=" + this.existingDayOfPeriod + ", existingAmount=" + this.existingAmount + ", startAt=" + this.startAt + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                RecurringSchedule.Frequency frequency = this.existingFrequency;
                if (frequency == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(frequency.name());
                }
                Integer num = this.existingDayOfPeriod;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
                }
                parcel.writeParcelable(this.existingAmount, i);
                this.startAt.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class ScheduledStartAt implements Parcelable {
        public static final /* synthetic */ ScheduledStartAt[] $VALUES;
        public static final ScheduledStartAt AMOUNT;
        public static final Parcelable.Creator<ScheduledStartAt> CREATOR;
        public static final ScheduledStartAt DAY;
        public static final ScheduledStartAt FREQUENCY;

        static {
            ScheduledStartAt scheduledStartAt = new ScheduledStartAt("FREQUENCY", 0);
            FREQUENCY = scheduledStartAt;
            ScheduledStartAt scheduledStartAt2 = new ScheduledStartAt("DAY", 1);
            DAY = scheduledStartAt2;
            ScheduledStartAt scheduledStartAt3 = new ScheduledStartAt("AMOUNT", 2);
            AMOUNT = scheduledStartAt3;
            $VALUES = new ScheduledStartAt[]{scheduledStartAt, scheduledStartAt2, scheduledStartAt3};
            CREATOR = new WalletHomeScreen.Creator(11);
        }

        public static ScheduledStartAt valueOf(String str) {
            return (ScheduledStartAt) Enum.valueOf(ScheduledStartAt.class, str);
        }

        public static ScheduledStartAt[] values() {
            return (ScheduledStartAt[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(name());
        }
    }

    public RecurringReloadConfigurationScreen(AskedQuestion askedQuestion, Mode mode) {
        askedQuestion.getClass();
        mode.getClass();
        this.question = askedQuestion;
        this.mode = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringReloadConfigurationScreen)) {
            return false;
        }
        RecurringReloadConfigurationScreen recurringReloadConfigurationScreen = (RecurringReloadConfigurationScreen) obj;
        return Intrinsics.areEqual(this.question, recurringReloadConfigurationScreen.question) && Intrinsics.areEqual(this.mode, recurringReloadConfigurationScreen.mode);
    }

    public final int hashCode() {
        return this.mode.hashCode() + (this.question.hashCode() * 31);
    }

    public final String toString() {
        return "RecurringReloadConfigurationScreen(question=" + this.question + ", mode=" + this.mode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.question, i);
        parcel.writeParcelable(this.mode, i);
    }
}
