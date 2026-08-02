package com.squareup.cash.taptopay.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.tax.primitives.Id;
import com.squareup.protos.common.Money;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface TapToPayScreen extends Screen, NeverInBackStackScreen {

    public final class TapToPayInitialScreen implements TapToPayScreen {
        public static final Parcelable.Creator<TapToPayInitialScreen> CREATOR = new Id.Close.Creator(14);
        public final Money amount;
        public final Screen exitScreen;
        public final UUID paymentPadUUID;

        public TapToPayInitialScreen(Money money, Screen screen, UUID uuid) {
            money.getClass();
            screen.getClass();
            this.amount = money;
            this.exitScreen = screen;
            this.paymentPadUUID = uuid;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapToPayInitialScreen)) {
                return false;
            }
            TapToPayInitialScreen tapToPayInitialScreen = (TapToPayInitialScreen) obj;
            return Intrinsics.areEqual(this.amount, tapToPayInitialScreen.amount) && Intrinsics.areEqual(this.exitScreen, tapToPayInitialScreen.exitScreen) && Intrinsics.areEqual(this.paymentPadUUID, tapToPayInitialScreen.paymentPadUUID);
        }

        public final int hashCode() {
            int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, this.amount.hashCode() * 31, 31);
            UUID uuid = this.paymentPadUUID;
            return m + (uuid == null ? 0 : uuid.hashCode());
        }

        public final String toString() {
            return "TapToPayInitialScreen(amount=" + this.amount + ", exitScreen=" + this.exitScreen + ", paymentPadUUID=" + this.paymentPadUUID + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.amount, i);
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeSerializable(this.paymentPadUUID);
        }
    }

    /* loaded from: classes7.dex */
    public final class TapToPayReturnScreen implements TapToPayScreen {
        public static final TapToPayReturnScreen INSTANCE = new TapToPayReturnScreen();
        public static final Parcelable.Creator<TapToPayReturnScreen> CREATOR = new Id.Close.Creator(15);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapToPayReturnScreen);
        }

        public final int hashCode() {
            return -652430363;
        }

        public final String toString() {
            return "TapToPayReturnScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
