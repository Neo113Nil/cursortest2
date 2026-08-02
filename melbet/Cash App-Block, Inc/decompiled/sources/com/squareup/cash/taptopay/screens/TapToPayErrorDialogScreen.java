package com.squareup.cash.taptopay.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.tax.primitives.Id;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface TapToPayErrorDialogScreen extends DialogScreen {

    /* loaded from: classes7.dex */
    public final class TapToPayAndroidVersionOutdatedDialogScreen implements TapToPayErrorDialogScreen {
        public static final Parcelable.Creator<TapToPayAndroidVersionOutdatedDialogScreen> CREATOR = new Id.Close.Creator(3);
        public final String errorMessage;
        public final TapToPayErrorReason errorReason;
        public final Screen exitScreen;
        public final String packagedLogs;

        public TapToPayAndroidVersionOutdatedDialogScreen(Screen screen, TapToPayErrorReason tapToPayErrorReason, String str, String str2) {
            screen.getClass();
            tapToPayErrorReason.getClass();
            this.exitScreen = screen;
            this.errorReason = tapToPayErrorReason;
            this.errorMessage = str;
            this.packagedLogs = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapToPayAndroidVersionOutdatedDialogScreen)) {
                return false;
            }
            TapToPayAndroidVersionOutdatedDialogScreen tapToPayAndroidVersionOutdatedDialogScreen = (TapToPayAndroidVersionOutdatedDialogScreen) obj;
            return Intrinsics.areEqual(this.exitScreen, tapToPayAndroidVersionOutdatedDialogScreen.exitScreen) && this.errorReason == tapToPayAndroidVersionOutdatedDialogScreen.errorReason && Intrinsics.areEqual(this.errorMessage, tapToPayAndroidVersionOutdatedDialogScreen.errorMessage) && Intrinsics.areEqual(this.packagedLogs, tapToPayAndroidVersionOutdatedDialogScreen.packagedLogs);
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final TapToPayErrorReason getErrorReason() {
            return this.errorReason;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final Screen getExitScreen() {
            return this.exitScreen;
        }

        public final int hashCode() {
            int hashCode = (this.errorReason.hashCode() + (this.exitScreen.hashCode() * 31)) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packagedLogs;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TapToPayAndroidVersionOutdatedDialogScreen(exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", errorReason=");
            sb.append(this.errorReason);
            sb.append(", errorMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ", packagedLogs=", this.packagedLogs, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeString(this.errorReason.name());
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.packagedLogs);
        }
    }

    /* loaded from: classes7.dex */
    public final class TapToPayCardTapErrorDialogScreen implements TapToPayErrorDialogScreen {
        public static final Parcelable.Creator<TapToPayCardTapErrorDialogScreen> CREATOR = new Id.Close.Creator(4);
        public final String errorMessage;
        public final TapToPayErrorReason errorReason;
        public final Screen exitScreen;
        public final String packagedLogs;

        public TapToPayCardTapErrorDialogScreen(Screen screen, TapToPayErrorReason tapToPayErrorReason, String str, String str2) {
            screen.getClass();
            tapToPayErrorReason.getClass();
            this.exitScreen = screen;
            this.errorReason = tapToPayErrorReason;
            this.errorMessage = str;
            this.packagedLogs = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapToPayCardTapErrorDialogScreen)) {
                return false;
            }
            TapToPayCardTapErrorDialogScreen tapToPayCardTapErrorDialogScreen = (TapToPayCardTapErrorDialogScreen) obj;
            return Intrinsics.areEqual(this.exitScreen, tapToPayCardTapErrorDialogScreen.exitScreen) && this.errorReason == tapToPayCardTapErrorDialogScreen.errorReason && Intrinsics.areEqual(this.errorMessage, tapToPayCardTapErrorDialogScreen.errorMessage) && Intrinsics.areEqual(this.packagedLogs, tapToPayCardTapErrorDialogScreen.packagedLogs);
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final TapToPayErrorReason getErrorReason() {
            return this.errorReason;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final Screen getExitScreen() {
            return this.exitScreen;
        }

        public final int hashCode() {
            int hashCode = (this.errorReason.hashCode() + (this.exitScreen.hashCode() * 31)) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packagedLogs;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TapToPayCardTapErrorDialogScreen(exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", errorReason=");
            sb.append(this.errorReason);
            sb.append(", errorMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ", packagedLogs=", this.packagedLogs, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeString(this.errorReason.name());
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.packagedLogs);
        }
    }

    /* loaded from: classes7.dex */
    public final class TapToPayGenericErrorSupportDialogScreen implements TapToPayErrorDialogScreen {
        public static final Parcelable.Creator<TapToPayGenericErrorSupportDialogScreen> CREATOR = new Id.Close.Creator(5);
        public final String errorMessage;
        public final TapToPayErrorReason errorReason;
        public final Screen exitScreen;
        public final String packagedLogs;

        public TapToPayGenericErrorSupportDialogScreen(Screen screen, TapToPayErrorReason tapToPayErrorReason, String str, String str2) {
            screen.getClass();
            tapToPayErrorReason.getClass();
            this.exitScreen = screen;
            this.errorReason = tapToPayErrorReason;
            this.errorMessage = str;
            this.packagedLogs = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapToPayGenericErrorSupportDialogScreen)) {
                return false;
            }
            TapToPayGenericErrorSupportDialogScreen tapToPayGenericErrorSupportDialogScreen = (TapToPayGenericErrorSupportDialogScreen) obj;
            return Intrinsics.areEqual(this.exitScreen, tapToPayGenericErrorSupportDialogScreen.exitScreen) && this.errorReason == tapToPayGenericErrorSupportDialogScreen.errorReason && Intrinsics.areEqual(this.errorMessage, tapToPayGenericErrorSupportDialogScreen.errorMessage) && Intrinsics.areEqual(this.packagedLogs, tapToPayGenericErrorSupportDialogScreen.packagedLogs);
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final TapToPayErrorReason getErrorReason() {
            return this.errorReason;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final Screen getExitScreen() {
            return this.exitScreen;
        }

        public final int hashCode() {
            int hashCode = (this.errorReason.hashCode() + (this.exitScreen.hashCode() * 31)) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packagedLogs;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TapToPayGenericErrorSupportDialogScreen(exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", errorReason=");
            sb.append(this.errorReason);
            sb.append(", errorMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ", packagedLogs=", this.packagedLogs, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeString(this.errorReason.name());
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.packagedLogs);
        }
    }

    /* loaded from: classes7.dex */
    public final class TapToPayPlayProtectErrorDialogScreen implements TapToPayErrorDialogScreen {
        public static final Parcelable.Creator<TapToPayPlayProtectErrorDialogScreen> CREATOR = new Id.Close.Creator(6);
        public final String errorMessage;
        public final TapToPayErrorReason errorReason;
        public final Screen exitScreen;
        public final String packagedLogs;

        public TapToPayPlayProtectErrorDialogScreen(Screen screen, TapToPayErrorReason tapToPayErrorReason, String str, String str2) {
            screen.getClass();
            tapToPayErrorReason.getClass();
            this.exitScreen = screen;
            this.errorReason = tapToPayErrorReason;
            this.errorMessage = str;
            this.packagedLogs = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapToPayPlayProtectErrorDialogScreen)) {
                return false;
            }
            TapToPayPlayProtectErrorDialogScreen tapToPayPlayProtectErrorDialogScreen = (TapToPayPlayProtectErrorDialogScreen) obj;
            return Intrinsics.areEqual(this.exitScreen, tapToPayPlayProtectErrorDialogScreen.exitScreen) && this.errorReason == tapToPayPlayProtectErrorDialogScreen.errorReason && Intrinsics.areEqual(this.errorMessage, tapToPayPlayProtectErrorDialogScreen.errorMessage) && Intrinsics.areEqual(this.packagedLogs, tapToPayPlayProtectErrorDialogScreen.packagedLogs);
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final TapToPayErrorReason getErrorReason() {
            return this.errorReason;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final Screen getExitScreen() {
            return this.exitScreen;
        }

        public final int hashCode() {
            int hashCode = (this.errorReason.hashCode() + (this.exitScreen.hashCode() * 31)) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packagedLogs;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TapToPayPlayProtectErrorDialogScreen(exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", errorReason=");
            sb.append(this.errorReason);
            sb.append(", errorMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ", packagedLogs=", this.packagedLogs, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeString(this.errorReason.name());
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.packagedLogs);
        }
    }

    /* loaded from: classes7.dex */
    public final class TapToPayScreenCastingDialogScreen implements TapToPayErrorDialogScreen {
        public static final Parcelable.Creator<TapToPayScreenCastingDialogScreen> CREATOR = new Id.Close.Creator(7);
        public final String errorMessage;
        public final TapToPayErrorReason errorReason;
        public final Screen exitScreen;
        public final String packagedLogs;

        public TapToPayScreenCastingDialogScreen(Screen screen, TapToPayErrorReason tapToPayErrorReason, String str, String str2) {
            screen.getClass();
            tapToPayErrorReason.getClass();
            this.exitScreen = screen;
            this.errorReason = tapToPayErrorReason;
            this.errorMessage = str;
            this.packagedLogs = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapToPayScreenCastingDialogScreen)) {
                return false;
            }
            TapToPayScreenCastingDialogScreen tapToPayScreenCastingDialogScreen = (TapToPayScreenCastingDialogScreen) obj;
            return Intrinsics.areEqual(this.exitScreen, tapToPayScreenCastingDialogScreen.exitScreen) && this.errorReason == tapToPayScreenCastingDialogScreen.errorReason && Intrinsics.areEqual(this.errorMessage, tapToPayScreenCastingDialogScreen.errorMessage) && Intrinsics.areEqual(this.packagedLogs, tapToPayScreenCastingDialogScreen.packagedLogs);
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final TapToPayErrorReason getErrorReason() {
            return this.errorReason;
        }

        @Override // com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen
        public final Screen getExitScreen() {
            return this.exitScreen;
        }

        public final int hashCode() {
            int hashCode = (this.errorReason.hashCode() + (this.exitScreen.hashCode() * 31)) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packagedLogs;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TapToPayScreenCastingDialogScreen(exitScreen=");
            sb.append(this.exitScreen);
            sb.append(", errorReason=");
            sb.append(this.errorReason);
            sb.append(", errorMessage=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorMessage, ", packagedLogs=", this.packagedLogs, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.exitScreen, i);
            parcel.writeString(this.errorReason.name());
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.packagedLogs);
        }
    }

    String getErrorMessage();

    TapToPayErrorReason getErrorReason();

    Screen getExitScreen();
}
