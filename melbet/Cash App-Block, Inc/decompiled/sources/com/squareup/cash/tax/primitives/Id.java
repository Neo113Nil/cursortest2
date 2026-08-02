package com.squareup.cash.tax.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.screens.TapToPayErrorReason;
import com.squareup.cash.taptopay.screens.TapToPayErrorScreen;
import com.squareup.cash.taptopay.screens.TapToPayFirstTimeScreen;
import com.squareup.cash.taptopay.screens.TapToPayInitiatorNotesScreen;
import com.squareup.cash.taptopay.screens.TapToPayOnboardingCompleteScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentRequestScreen;
import com.squareup.cash.taptopay.screens.TapToPayPaymentScreen;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.primitives.TaxLocation;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class Id implements Parcelable {

    public final class BrowseWildcard extends Id {
        public static final BrowseWildcard INSTANCE = new BrowseWildcard();
        public static final Parcelable.Creator<BrowseWildcard> CREATOR = new Close.Creator(16);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrowseWildcard);
        }

        public final int hashCode() {
            return 1651238026;
        }

        public final String toString() {
            return "BrowseWildcard";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Close extends Id {
        public static final Close INSTANCE = new Close();
        public static final Parcelable.Creator<Close> CREATOR = new Creator(0);

        public final class Creator implements Parcelable.Creator {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Creator(int i) {
                this.$r8$classId = i;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                switch (this.$r8$classId) {
                    case 0:
                        parcel.getClass();
                        parcel.readInt();
                        return Close.INSTANCE;
                    case 1:
                        parcel.getClass();
                        parcel.readInt();
                        return SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.Yes.INSTANCE;
                    case 2:
                        parcel.getClass();
                        return new SupportScreens.UnauthenticatedArticleScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    case 3:
                        parcel.getClass();
                        return new TapToPayErrorDialogScreen.TapToPayAndroidVersionOutdatedDialogScreen((Screen) parcel.readParcelable(TapToPayErrorDialogScreen.TapToPayAndroidVersionOutdatedDialogScreen.class.getClassLoader()), TapToPayErrorReason.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                    case 4:
                        parcel.getClass();
                        return new TapToPayErrorDialogScreen.TapToPayCardTapErrorDialogScreen((Screen) parcel.readParcelable(TapToPayErrorDialogScreen.TapToPayCardTapErrorDialogScreen.class.getClassLoader()), TapToPayErrorReason.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                    case 5:
                        parcel.getClass();
                        return new TapToPayErrorDialogScreen.TapToPayGenericErrorSupportDialogScreen((Screen) parcel.readParcelable(TapToPayErrorDialogScreen.TapToPayGenericErrorSupportDialogScreen.class.getClassLoader()), TapToPayErrorReason.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                    case 6:
                        parcel.getClass();
                        return new TapToPayErrorDialogScreen.TapToPayPlayProtectErrorDialogScreen((Screen) parcel.readParcelable(TapToPayErrorDialogScreen.TapToPayPlayProtectErrorDialogScreen.class.getClassLoader()), TapToPayErrorReason.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                    case 7:
                        parcel.getClass();
                        return new TapToPayErrorDialogScreen.TapToPayScreenCastingDialogScreen((Screen) parcel.readParcelable(TapToPayErrorDialogScreen.TapToPayScreenCastingDialogScreen.class.getClassLoader()), TapToPayErrorReason.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
                    case 8:
                        parcel.getClass();
                        return new TapToPayErrorScreen(TapToPayErrorReason.valueOf(parcel.readString()));
                    case 9:
                        parcel.getClass();
                        return new TapToPayFirstTimeScreen(parcel.readString());
                    case 10:
                        parcel.getClass();
                        parcel.readInt();
                        return TapToPayInitiatorNotesScreen.INSTANCE;
                    case 11:
                        parcel.getClass();
                        parcel.readInt();
                        return TapToPayOnboardingCompleteScreen.INSTANCE;
                    case 12:
                        parcel.getClass();
                        return new TapToPayPaymentRequestScreen(parcel.createByteArray(), (Money) parcel.readParcelable(TapToPayPaymentRequestScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    case 13:
                        parcel.getClass();
                        return new TapToPayPaymentScreen(parcel.readString());
                    case 14:
                        parcel.getClass();
                        return new TapToPayScreen.TapToPayInitialScreen((Money) parcel.readParcelable(TapToPayScreen.TapToPayInitialScreen.class.getClassLoader()), (Screen) parcel.readParcelable(TapToPayScreen.TapToPayInitialScreen.class.getClassLoader()), (UUID) parcel.readSerializable());
                    case 15:
                        parcel.getClass();
                        parcel.readInt();
                        return TapToPayScreen.TapToPayReturnScreen.INSTANCE;
                    case 16:
                        parcel.getClass();
                        parcel.readInt();
                        return BrowseWildcard.INSTANCE;
                    case 17:
                        parcel.getClass();
                        parcel.readInt();
                        return ExitCashAppTaxes.INSTANCE;
                    case 18:
                        parcel.getClass();
                        return new JavascriptMenuItem(parcel.readString());
                    case 19:
                        parcel.getClass();
                        parcel.readInt();
                        return PhotoGallery.INSTANCE;
                    case 20:
                        parcel.getClass();
                        parcel.readInt();
                        return TakePhoto.INSTANCE;
                    case 21:
                        parcel.getClass();
                        return new TaxDialogDataModel.Action(parcel.readInt());
                    case 22:
                        parcel.getClass();
                        return new TaxDialogDataModel.Button(parcel.readString(), parcel.readString(), TaxDialogDataModel.Style.valueOf(parcel.readString()), TaxDialogDataModel.Action.CREATOR.createFromParcel(parcel));
                    case 23:
                        parcel.getClass();
                        return new TaxDialogDataModel(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TaxDialogDataModel.Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TaxDialogDataModel.Button.CREATOR.createFromParcel(parcel) : null);
                    case 24:
                        parcel.getClass();
                        return new TaxLocation.DeepLink(parcel.readString());
                    case 25:
                        parcel.getClass();
                        parcel.readInt();
                        return TaxLocation.EFile.INSTANCE;
                    case 26:
                        parcel.getClass();
                        parcel.readInt();
                        return TaxLocation.EstimateYourRefund.INSTANCE;
                    case 27:
                        parcel.getClass();
                        parcel.readInt();
                        return TaxLocation.TaxHub.INSTANCE;
                    case 28:
                        parcel.getClass();
                        return new TaxLocation.TaxHubWithDeepLink(parcel.readString());
                    default:
                        parcel.getClass();
                        return new TaxMenuItem((Id) parcel.readParcelable(TaxMenuItem.class.getClassLoader()), parcel.readString(), MenuItemStyle.valueOf(parcel.readString()));
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        return new Close[i];
                    case 1:
                        return new SupportScreens.SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.Yes[i];
                    case 2:
                        return new SupportScreens.UnauthenticatedArticleScreen[i];
                    case 3:
                        return new TapToPayErrorDialogScreen.TapToPayAndroidVersionOutdatedDialogScreen[i];
                    case 4:
                        return new TapToPayErrorDialogScreen.TapToPayCardTapErrorDialogScreen[i];
                    case 5:
                        return new TapToPayErrorDialogScreen.TapToPayGenericErrorSupportDialogScreen[i];
                    case 6:
                        return new TapToPayErrorDialogScreen.TapToPayPlayProtectErrorDialogScreen[i];
                    case 7:
                        return new TapToPayErrorDialogScreen.TapToPayScreenCastingDialogScreen[i];
                    case 8:
                        return new TapToPayErrorScreen[i];
                    case 9:
                        return new TapToPayFirstTimeScreen[i];
                    case 10:
                        return new TapToPayInitiatorNotesScreen[i];
                    case 11:
                        return new TapToPayOnboardingCompleteScreen[i];
                    case 12:
                        return new TapToPayPaymentRequestScreen[i];
                    case 13:
                        return new TapToPayPaymentScreen[i];
                    case 14:
                        return new TapToPayScreen.TapToPayInitialScreen[i];
                    case 15:
                        return new TapToPayScreen.TapToPayReturnScreen[i];
                    case 16:
                        return new BrowseWildcard[i];
                    case 17:
                        return new ExitCashAppTaxes[i];
                    case 18:
                        return new JavascriptMenuItem[i];
                    case 19:
                        return new PhotoGallery[i];
                    case 20:
                        return new TakePhoto[i];
                    case 21:
                        return new TaxDialogDataModel.Action[i];
                    case 22:
                        return new TaxDialogDataModel.Button[i];
                    case 23:
                        return new TaxDialogDataModel[i];
                    case 24:
                        return new TaxLocation.DeepLink[i];
                    case 25:
                        return new TaxLocation.EFile[i];
                    case 26:
                        return new TaxLocation.EstimateYourRefund[i];
                    case 27:
                        return new TaxLocation.TaxHub[i];
                    case 28:
                        return new TaxLocation.TaxHubWithDeepLink[i];
                    default:
                        return new TaxMenuItem[i];
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1298796850;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class ExitCashAppTaxes extends Id {
        public static final ExitCashAppTaxes INSTANCE = new ExitCashAppTaxes();
        public static final Parcelable.Creator<ExitCashAppTaxes> CREATOR = new Close.Creator(17);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitCashAppTaxes);
        }

        public final int hashCode() {
            return -1670512369;
        }

        public final String toString() {
            return "ExitCashAppTaxes";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class JavascriptMenuItem extends Id {
        public static final Parcelable.Creator<JavascriptMenuItem> CREATOR = new Close.Creator(18);
        public final String id;

        public JavascriptMenuItem(String str) {
            str.getClass();
            this.id = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof JavascriptMenuItem) && Intrinsics.areEqual(this.id, ((JavascriptMenuItem) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("JavascriptMenuItem(id=", this.id, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
        }
    }

    public final class PhotoGallery extends Id {
        public static final PhotoGallery INSTANCE = new PhotoGallery();
        public static final Parcelable.Creator<PhotoGallery> CREATOR = new Close.Creator(19);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PhotoGallery);
        }

        public final int hashCode() {
            return -262968250;
        }

        public final String toString() {
            return "PhotoGallery";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class TakePhoto extends Id {
        public static final TakePhoto INSTANCE = new TakePhoto();
        public static final Parcelable.Creator<TakePhoto> CREATOR = new Close.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TakePhoto);
        }

        public final int hashCode() {
            return -266019803;
        }

        public final String toString() {
            return "TakePhoto";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
