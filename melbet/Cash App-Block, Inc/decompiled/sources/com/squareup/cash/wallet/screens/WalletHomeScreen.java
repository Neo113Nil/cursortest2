package com.squareup.cash.wallet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseSurface;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsNuxScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.screens.PendingTransfersConfirmationDialog;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationResult;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsChangeInstrumentScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsDismissDialogScreen;
import com.squareup.cash.transfers.screens.ScheduledReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.SetDefaultInstrumentScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;
import com.squareup.cash.transfers.screens.TransfersScreens;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreen;
import com.squareup.cash.ui.widget.recycler.RecyclerViewSavedState;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes.dex */
public final class WalletHomeScreen implements Screen, PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent {
    public static final Parcelable.Creator<WalletHomeScreen> CREATOR = new Creator(0);
    public final String copyId;
    public final Integer initialPaymentDevicePage;
    public final PrepurchaseCashCardScreen$PrepurchaseSurface prepurchaseSurface;
    public final boolean shouldNavigateToPrepurchaseCashCard;

    /* loaded from: classes7.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = 0;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    boolean z = false;
                    parcel.getClass();
                    String readString = parcel.readString();
                    Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    return new WalletHomeScreen(readString, valueOf, z);
                case 1:
                    parcel.getClass();
                    return new InstrumentLinkingOptionsScreen.Option.Icon.RemoteIcon(parcel.readString());
                case 2:
                    parcel.getClass();
                    return new InstrumentNotLinkedScreen((BlockersData) parcel.readParcelable(InstrumentNotLinkedScreen.class.getClassLoader()), TransferType.valueOf(parcel.readString()), parcel.readInt() != 0 ? DepositPreference.valueOf(parcel.readString()) : null, (Screen) parcel.readParcelable(InstrumentNotLinkedScreen.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return LinkedAccountsNuxScreen.INSTANCE;
                case 4:
                    parcel.getClass();
                    parcel.readInt();
                    return LinkedAccountsScreen.INSTANCE;
                case 5:
                    parcel.getClass();
                    return new PendingTransfersConfirmationDialog(PendingTransfersConfirmationDialog.Destination.valueOf(parcel.readString()), PendingTransfersConfirmationDialog.DestinationParams.CREATOR.createFromParcel(parcel));
                case 6:
                    parcel.getClass();
                    BlockersData blockersData = (BlockersData) parcel.readParcelable(PendingTransfersConfirmationDialog.DestinationParams.class.getClassLoader());
                    Money money = (Money) parcel.readParcelable(PendingTransfersConfirmationDialog.DestinationParams.class.getClassLoader());
                    String readString2 = parcel.readString();
                    boolean z2 = true;
                    String readString3 = parcel.readString();
                    Money money2 = (Money) parcel.readParcelable(PendingTransfersConfirmationDialog.DestinationParams.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        z2 = false;
                    }
                    return new PendingTransfersConfirmationDialog.DestinationParams(blockersData, money, readString2, readString3, money2, z2);
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return RecurringReloadConfigurationQuestion.INSTANCE;
                case 8:
                    parcel.getClass();
                    return new RecurringReloadConfigurationResult.BalanceBasedReloadResult((Money) parcel.readParcelable(RecurringReloadConfigurationResult.BalanceBasedReloadResult.class.getClassLoader()), (Money) parcel.readParcelable(RecurringReloadConfigurationResult.BalanceBasedReloadResult.class.getClassLoader()));
                case 9:
                    parcel.getClass();
                    return new RecurringReloadConfigurationScreen((AskedQuestion) parcel.readParcelable(RecurringReloadConfigurationScreen.class.getClassLoader()), (RecurringReloadConfigurationScreen.Mode) parcel.readParcelable(RecurringReloadConfigurationScreen.class.getClassLoader()));
                case 10:
                    parcel.getClass();
                    return new RecurringReloadConfigurationScreen.Mode.BalanceBased((Money) parcel.readParcelable(RecurringReloadConfigurationScreen.Mode.BalanceBased.class.getClassLoader()), (Money) parcel.readParcelable(RecurringReloadConfigurationScreen.Mode.BalanceBased.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                case 11:
                    parcel.getClass();
                    return RecurringReloadConfigurationScreen.ScheduledStartAt.valueOf(parcel.readString());
                case 12:
                    parcel.getClass();
                    return new RecurringReloadOptionScreen(RecurringReloadOptionScreen.ReloadType.valueOf(parcel.readString()), (Screen) parcel.readParcelable(RecurringReloadOptionScreen.class.getClassLoader()));
                case 13:
                    parcel.getClass();
                    parcel.readInt();
                    return RecurringReloadsChangeInstrumentScreen.INSTANCE;
                case 14:
                    parcel.getClass();
                    return new RecurringReloadsDismissDialogScreen((Screen) parcel.readParcelable(RecurringReloadsDismissDialogScreen.class.getClassLoader()), (BlockersData) parcel.readParcelable(RecurringReloadsDismissDialogScreen.class.getClassLoader()), parcel.readInt() != 0 ? RecurringReloadOptionScreen.ReloadType.valueOf(parcel.readString()) : null);
                case 15:
                    parcel.getClass();
                    return new ScheduledReloadConfirmationScreen((BlockersData) parcel.readParcelable(ScheduledReloadConfirmationScreen.class.getClassLoader()));
                case 16:
                    parcel.getClass();
                    return new SetDefaultInstrumentScreen((BlockersData) parcel.readParcelable(SetDefaultInstrumentScreen.class.getClassLoader()), parcel.readString());
                case 17:
                    parcel.getClass();
                    return new TransfersRouterScreen((TransfersScreens) parcel.readParcelable(TransfersRouterScreen.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    return new WithdrawScreen((BlockersData) parcel.readParcelable(WithdrawScreen.class.getClassLoader()), (Money) parcel.readParcelable(WithdrawScreen.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? DepositPreference.valueOf(parcel.readString()) : null);
                case 19:
                    parcel.getClass();
                    return new RecurringReloadConfigurationViewModel.AmountPickerItem.Amount((Money) parcel.readParcelable(RecurringReloadConfigurationViewModel.AmountPickerItem.Amount.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                case 20:
                    parcel.getClass();
                    return new RecurringReloadConfigurationViewModel.AmountPickerItem.Custom(parcel.readString(), parcel.readInt() != 0);
                case 21:
                    Money money3 = (Money) NavAction$$ExternalSyntheticOutline0.m(parcel, RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker.class);
                    Money money4 = (Money) parcel.readParcelable(RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker.class.getClassLoader());
                    boolean z3 = parcel.readInt() != 0;
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    while (i2 != readInt) {
                        i2 = CameraState$Type$EnumUnboxingLocalUtility.m(RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker.class, parcel, arrayList, i2, 1);
                    }
                    return new RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker(money3, money4, z3, readString4, readString5, arrayList);
                case 22:
                    parcel.getClass();
                    return new RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad((Money) parcel.readParcelable(RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad.class.getClassLoader()), (Money) parcel.readParcelable(RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 23:
                    Money money5 = (Money) NavAction$$ExternalSyntheticOutline0.m(parcel, RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker.class);
                    Money money6 = (Money) parcel.readParcelable(RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker.class.getClassLoader());
                    boolean z4 = parcel.readInt() != 0;
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker.class, parcel, arrayList2, i, 1);
                    }
                    return new RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker(money5, money6, z4, readString6, readString7, arrayList2);
                case 24:
                    parcel.getClass();
                    return new RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad((Money) parcel.readParcelable(RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad.class.getClassLoader()), (Money) parcel.readParcelable(RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
                case 25:
                    parcel.getClass();
                    return new TreehouseScreen(parcel.readString(), parcel.readString(), (ByteString) parcel.readSerializable(), parcel.readInt() != 0);
                case 26:
                    parcel.getClass();
                    return new RecyclerViewSavedState(parcel.readParcelable(RecyclerViewSavedState.class.getClassLoader()), parcel.readParcelable(RecyclerViewSavedState.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new CardControlDialogScreen((CardModule.CardElementAction.OpenDialog) parcel.readParcelable(CardControlDialogScreen.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new CardLockHalfSheetScreen(parcel.readString(), parcel.readString());
                default:
                    parcel.getClass();
                    return new PresentationTimelineScreen((PresentationTimelineViewModel) parcel.readParcelable(PresentationTimelineScreen.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new WalletHomeScreen[i];
                case 1:
                    return new InstrumentLinkingOptionsScreen.Option.Icon.RemoteIcon[i];
                case 2:
                    return new InstrumentNotLinkedScreen[i];
                case 3:
                    return new LinkedAccountsNuxScreen[i];
                case 4:
                    return new LinkedAccountsScreen[i];
                case 5:
                    return new PendingTransfersConfirmationDialog[i];
                case 6:
                    return new PendingTransfersConfirmationDialog.DestinationParams[i];
                case 7:
                    return new RecurringReloadConfigurationQuestion[i];
                case 8:
                    return new RecurringReloadConfigurationResult.BalanceBasedReloadResult[i];
                case 9:
                    return new RecurringReloadConfigurationScreen[i];
                case 10:
                    return new RecurringReloadConfigurationScreen.Mode.BalanceBased[i];
                case 11:
                    return new RecurringReloadConfigurationScreen.ScheduledStartAt[i];
                case 12:
                    return new RecurringReloadOptionScreen[i];
                case 13:
                    return new RecurringReloadsChangeInstrumentScreen[i];
                case 14:
                    return new RecurringReloadsDismissDialogScreen[i];
                case 15:
                    return new ScheduledReloadConfirmationScreen[i];
                case 16:
                    return new SetDefaultInstrumentScreen[i];
                case 17:
                    return new TransfersRouterScreen[i];
                case 18:
                    return new WithdrawScreen[i];
                case 19:
                    return new RecurringReloadConfigurationViewModel.AmountPickerItem.Amount[i];
                case 20:
                    return new RecurringReloadConfigurationViewModel.AmountPickerItem.Custom[i];
                case 21:
                    return new RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker[i];
                case 22:
                    return new RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad[i];
                case 23:
                    return new RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker[i];
                case 24:
                    return new RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad[i];
                case 25:
                    return new TreehouseScreen[i];
                case 26:
                    return new RecyclerViewSavedState[i];
                case 27:
                    return new CardControlDialogScreen[i];
                case 28:
                    return new CardLockHalfSheetScreen[i];
                default:
                    return new PresentationTimelineScreen[i];
            }
        }
    }

    public /* synthetic */ WalletHomeScreen(int i, Integer num, String str) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) == 0);
    }

    public static WalletHomeScreen copy$default(WalletHomeScreen walletHomeScreen, boolean z) {
        String str = walletHomeScreen.copyId;
        Integer num = walletHomeScreen.initialPaymentDevicePage;
        walletHomeScreen.getClass();
        return new WalletHomeScreen(str, num, z);
    }

    @Override // com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent
    public final PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent copyWithOrWithoutSheet(boolean z) {
        return copy$default(this, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletHomeScreen)) {
            return false;
        }
        WalletHomeScreen walletHomeScreen = (WalletHomeScreen) obj;
        return Intrinsics.areEqual(this.copyId, walletHomeScreen.copyId) && Intrinsics.areEqual(this.initialPaymentDevicePage, walletHomeScreen.initialPaymentDevicePage) && this.shouldNavigateToPrepurchaseCashCard == walletHomeScreen.shouldNavigateToPrepurchaseCashCard;
    }

    @Override // com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent
    public final PrepurchaseCashCardScreen$PrepurchaseSurface getPrepurchaseSurface() {
        return this.prepurchaseSurface;
    }

    public final int hashCode() {
        String str = this.copyId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.initialPaymentDevicePage;
        return Boolean.hashCode(this.shouldNavigateToPrepurchaseCashCard) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.initialPaymentDevicePage, "WalletHomeScreen(copyId=", this.copyId, ", initialPaymentDevicePage=", ", shouldNavigateToPrepurchaseCashCard="), this.shouldNavigateToPrepurchaseCashCard, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.copyId);
        Integer num = this.initialPaymentDevicePage;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeInt(this.shouldNavigateToPrepurchaseCashCard ? 1 : 0);
    }

    public WalletHomeScreen(String str, Integer num, boolean z) {
        this.copyId = str;
        this.initialPaymentDevicePage = num;
        this.shouldNavigateToPrepurchaseCashCard = z;
        this.prepurchaseSurface = PrepurchaseCashCardScreen$PrepurchaseSurface.CARD_TAB;
    }
}
