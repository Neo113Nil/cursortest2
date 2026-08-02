package com.squareup.cash.transfers.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RecurringTransferData implements Parcelable {
    public static final Parcelable.Creator<RecurringTransferData> CREATOR = new Creator();
    public final List daysOfPeriod;
    public final RecurringSchedule.Frequency frequency;
    public final Money maxAmount;
    public final Money minAmount;

    /* loaded from: classes7.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            RecurringSchedule.Frequency valueOf = parcel.readInt() == 0 ? null : RecurringSchedule.Frequency.valueOf(parcel.readString());
            Money money = (Money) parcel.readParcelable(RecurringTransferData.class.getClassLoader());
            Money money2 = (Money) parcel.readParcelable(RecurringTransferData.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new RecurringTransferData(valueOf, money, money2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringTransferData[i];
        }
    }

    public RecurringTransferData(RecurringSchedule.Frequency frequency, Money money, Money money2, List list) {
        money.getClass();
        money2.getClass();
        list.getClass();
        this.frequency = frequency;
        this.maxAmount = money;
        this.minAmount = money2;
        this.daysOfPeriod = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringTransferData)) {
            return false;
        }
        RecurringTransferData recurringTransferData = (RecurringTransferData) obj;
        return this.frequency == recurringTransferData.frequency && Intrinsics.areEqual(this.maxAmount, recurringTransferData.maxAmount) && Intrinsics.areEqual(this.minAmount, recurringTransferData.minAmount) && Intrinsics.areEqual(this.daysOfPeriod, recurringTransferData.daysOfPeriod);
    }

    public final int hashCode() {
        RecurringSchedule.Frequency frequency = this.frequency;
        return this.daysOfPeriod.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.minAmount, NavAction$$ExternalSyntheticOutline0.m(this.maxAmount, (frequency == null ? 0 : frequency.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "RecurringTransferData(frequency=" + this.frequency + ", maxAmount=" + this.maxAmount + ", minAmount=" + this.minAmount + ", daysOfPeriod=" + this.daysOfPeriod + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        RecurringSchedule.Frequency frequency = this.frequency;
        if (frequency == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(frequency.name());
        }
        parcel.writeParcelable(this.maxAmount, i);
        parcel.writeParcelable(this.minAmount, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.daysOfPeriod, parcel);
        while (m.hasNext()) {
            parcel.writeInt(((Number) m.next()).intValue());
        }
    }
}
