package com.squareup.cash.tax.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.primitives.TaxLocation;
import com.squareup.cash.tax.views.TaxWebAppView;
import com.squareup.cash.tax.web.models.BridgeSavedState;
import com.squareup.cash.transfers.backend.api.FeeStepTiers;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferFee;
import com.squareup.cash.transfers.data.TransferSource;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.screens.BalanceBasedAddCashDisabledDialogScreen;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.InstrumentDetailsFullscreenScreen;
import com.squareup.cash.transfers.screens.InstrumentDetailsSheetScreen;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsQuestion;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.ConfirmationSheetData;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.SignalsContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TaxMenuSheet extends MainScreens implements BottomSheetScreen {
    public static final Parcelable.Creator<TaxMenuSheet> CREATOR = new Creator(0);
    public final List menuItems;

    /* loaded from: classes7.dex */
    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            Money money;
            Money money2;
            Instrument instrument;
            TransferType transferType;
            DepositPreference depositPreference;
            DepositPreferenceData depositPreferenceData;
            TransfersWithdrawManager.FeeData feeData;
            TransferFee transferFee;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = CameraState$Type$EnumUnboxingLocalUtility.m(TaxMenuSheet.class, parcel, arrayList, i, 1);
                    }
                    return new TaxMenuSheet(arrayList);
                case 1:
                    parcel.getClass();
                    return new TaxAuthorizationScreen((TaxLocation) parcel.readParcelable(TaxAuthorizationScreen.class.getClassLoader()), (Screen) parcel.readParcelable(TaxAuthorizationScreen.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return TaxReturnsScreen.INSTANCE;
                case 3:
                    parcel.getClass();
                    return new TaxTooltipScreen(parcel.readInt(), parcel.readInt(), parcel.readInt());
                case 4:
                    parcel.getClass();
                    return new TaxWebBridgeDialog((TaxDialogDataModel) parcel.readParcelable(TaxWebBridgeDialog.class.getClassLoader()));
                case 5:
                    parcel.getClass();
                    return new TaxWebAppView.State(parcel.readParcelable(TaxWebAppView.State.class.getClassLoader()), parcel.readParcelable(TaxWebAppView.State.class.getClassLoader()));
                case 6:
                    parcel.getClass();
                    return new BridgeSavedState(parcel.readString());
                case 7:
                    parcel.getClass();
                    int readInt2 = parcel.readInt();
                    TreeMap treeMap = new TreeMap();
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        treeMap.put(Long.valueOf(parcel.readLong()), TransfersWithdrawManager.FeeData.FeeStepTier.CREATOR.createFromParcel(parcel));
                    }
                    if (!treeMap.isEmpty()) {
                        return new FeeStepTiers(treeMap);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("tiers must not be empty");
                    return null;
                case 8:
                    parcel.getClass();
                    return new TransfersWithdrawManager.FeeData(FeeStepTiers.CREATOR.createFromParcel(parcel).tiers);
                case 9:
                    parcel.getClass();
                    return new TransfersWithdrawManager.FeeData.FeeStepTier(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
                case 10:
                    parcel.getClass();
                    Money money3 = (Money) parcel.readParcelable(TransferData.class.getClassLoader());
                    Money money4 = (Money) parcel.readParcelable(TransferData.class.getClassLoader());
                    Instrument instrument2 = (Instrument) parcel.readParcelable(TransferData.class.getClassLoader());
                    TransferType valueOf = TransferType.valueOf(parcel.readString());
                    DepositPreference valueOf2 = parcel.readInt() == 0 ? null : DepositPreference.valueOf(parcel.readString());
                    DepositPreferenceData depositPreferenceData2 = (DepositPreferenceData) parcel.readParcelable(TransferData.class.getClassLoader());
                    TransfersWithdrawManager.FeeData feeData2 = (TransfersWithdrawManager.FeeData) parcel.readParcelable(TransferData.class.getClassLoader());
                    TransferFee createFromParcel = parcel.readInt() == 0 ? null : TransferFee.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        cls = TransferData.class;
                        money = money3;
                        money2 = money4;
                        instrument = instrument2;
                        transferType = valueOf;
                        depositPreference = valueOf2;
                        depositPreferenceData = depositPreferenceData2;
                        feeData = feeData2;
                        transferFee = createFromParcel;
                        z = true;
                    } else {
                        cls = TransferData.class;
                        money = money3;
                        money2 = money4;
                        instrument = instrument2;
                        transferType = valueOf;
                        depositPreference = valueOf2;
                        depositPreferenceData = depositPreferenceData2;
                        feeData = feeData2;
                        transferFee = createFromParcel;
                        z = false;
                    }
                    return new TransferData(money, money2, instrument, transferType, depositPreference, depositPreferenceData, feeData, transferFee, z, (SignalsContext) parcel.readParcelable(cls.getClassLoader()), (ConfirmationSheetData) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0, parcel.readInt() != 0 ? TransferSource.valueOf(parcel.readString()) : null, (Instrument) parcel.readParcelable(cls.getClassLoader()));
                case 11:
                    parcel.getClass();
                    return new TransferFee((Money) parcel.readParcelable(TransferFee.class.getClassLoader()), (TransfersWithdrawManager.FeeData.FeeStepTier) parcel.readParcelable(TransferFee.class.getClassLoader()));
                case 12:
                    parcel.getClass();
                    return new AddMoneyScreen((BlockersData) parcel.readParcelable(AddMoneyScreen.class.getClassLoader()), (Money) parcel.readParcelable(AddMoneyScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), (Money) parcel.readParcelable(AddMoneyScreen.class.getClassLoader()), parcel.readInt() != 0);
                case 13:
                    parcel.getClass();
                    return new BalanceBasedAddCashDisabledDialogScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig(parcel.readString(), (Money) parcel.readParcelable(BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig.class.getClassLoader()), (Money) parcel.readParcelable(BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig.class.getClassLoader()), (Money) parcel.readParcelable(BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig.class.getClassLoader()), (Money) parcel.readParcelable(BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig.class.getClassLoader()), (Money) parcel.readParcelable(BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig.class.getClassLoader()), parcel.readInt() != 0);
                case 15:
                    parcel.getClass();
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Parcelable.Creator<BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig> creator = BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig.CREATOR;
                    return new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData(readString, readString2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.FundingSource.CREATOR.createFromParcel(parcel));
                case 16:
                    parcel.getClass();
                    return new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.FundingSource(parcel.readString(), parcel.readString(), (Instrument) parcel.readParcelable(BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.FundingSource.class.getClassLoader()));
                case 17:
                    parcel.getClass();
                    return new BalanceBasedAutoReloadConfirmationScreen((BlockersData) parcel.readParcelable(BalanceBasedAutoReloadConfirmationScreen.class.getClassLoader()), BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.CREATOR.createFromParcel(parcel));
                case 18:
                    parcel.getClass();
                    return new InstrumentDetailsFullscreenScreen((Screen) parcel.readParcelable(InstrumentDetailsFullscreenScreen.class.getClassLoader()), CashInstrumentType.valueOf(parcel.readString()), parcel.readString());
                case 19:
                    parcel.getClass();
                    return new InstrumentDetailsSheetScreen((Screen) parcel.readParcelable(InstrumentDetailsSheetScreen.class.getClassLoader()), CashInstrumentType.valueOf(parcel.readString()), parcel.readString());
                case 20:
                    parcel.getClass();
                    return new InstrumentLinkingOption.Link(CashInstrumentType.valueOf(parcel.readString()));
                case 21:
                    parcel.getClass();
                    return new InstrumentLinkingOption.Replace(CashInstrumentType.valueOf(parcel.readString()));
                case 22:
                    parcel.getClass();
                    return new InstrumentLinkingOption.ReplaceInstrument(CashInstrumentType.valueOf(parcel.readString()), parcel.readString());
                case 23:
                    parcel.getClass();
                    parcel.readInt();
                    return InstrumentLinkingOptionsQuestion.INSTANCE;
                case 24:
                    parcel.getClass();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt3);
                    int i3 = 0;
                    while (i3 != readInt3) {
                        i3 = CameraState$Type$EnumUnboxingLocalUtility.m(InstrumentLinkingOptionsScreen.Option.CREATOR, parcel, arrayList2, i3, 1);
                    }
                    return new InstrumentLinkingOptionsScreen(readString3, readString4, arrayList2, (InstrumentLinkingOptionsScreen.Mode) parcel.readParcelable(InstrumentLinkingOptionsScreen.class.getClassLoader()), parcel.readInt() != 0);
                case 25:
                    parcel.getClass();
                    return new InstrumentLinkingOptionsScreen.Mode.Navigation((Screen) parcel.readParcelable(InstrumentLinkingOptionsScreen.Mode.Navigation.class.getClassLoader()));
                case 26:
                    parcel.getClass();
                    return new InstrumentLinkingOptionsScreen.Mode.Question((AskedQuestion) parcel.readParcelable(InstrumentLinkingOptionsScreen.Mode.Question.class.getClassLoader()));
                case 27:
                    parcel.getClass();
                    return new InstrumentLinkingOptionsScreen.Option(parcel.readString(), parcel.readString(), (InstrumentLinkingOption) parcel.readParcelable(InstrumentLinkingOptionsScreen.Option.class.getClassLoader()), (InstrumentLinkingOptionsScreen.Option.Icon) parcel.readParcelable(InstrumentLinkingOptionsScreen.Option.class.getClassLoader()));
                case 28:
                    parcel.getClass();
                    return new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon(parcel.readString());
                default:
                    parcel.getClass();
                    return new InstrumentLinkingOptionsScreen.Option.Icon.LocalResource(parcel.readInt(), parcel.readInt());
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new TaxMenuSheet[i];
                case 1:
                    return new TaxAuthorizationScreen[i];
                case 2:
                    return new TaxReturnsScreen[i];
                case 3:
                    return new TaxTooltipScreen[i];
                case 4:
                    return new TaxWebBridgeDialog[i];
                case 5:
                    return new TaxWebAppView.State[i];
                case 6:
                    return new BridgeSavedState[i];
                case 7:
                    return new FeeStepTiers[i];
                case 8:
                    return new TransfersWithdrawManager.FeeData[i];
                case 9:
                    return new TransfersWithdrawManager.FeeData.FeeStepTier[i];
                case 10:
                    return new TransferData[i];
                case 11:
                    return new TransferFee[i];
                case 12:
                    return new AddMoneyScreen[i];
                case 13:
                    return new BalanceBasedAddCashDisabledDialogScreen[i];
                case 14:
                    return new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.AmountSelectionConfig[i];
                case 15:
                    return new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData[i];
                case 16:
                    return new BalanceBasedAutoReloadConfirmationScreen.ConfirmationData.FundingSource[i];
                case 17:
                    return new BalanceBasedAutoReloadConfirmationScreen[i];
                case 18:
                    return new InstrumentDetailsFullscreenScreen[i];
                case 19:
                    return new InstrumentDetailsSheetScreen[i];
                case 20:
                    return new InstrumentLinkingOption.Link[i];
                case 21:
                    return new InstrumentLinkingOption.Replace[i];
                case 22:
                    return new InstrumentLinkingOption.ReplaceInstrument[i];
                case 23:
                    return new InstrumentLinkingOptionsQuestion[i];
                case 24:
                    return new InstrumentLinkingOptionsScreen[i];
                case 25:
                    return new InstrumentLinkingOptionsScreen.Mode.Navigation[i];
                case 26:
                    return new InstrumentLinkingOptionsScreen.Mode.Question[i];
                case 27:
                    return new InstrumentLinkingOptionsScreen.Option[i];
                case 28:
                    return new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon[i];
                default:
                    return new InstrumentLinkingOptionsScreen.Option.Icon.LocalResource[i];
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxMenuSheet(List list) {
        super(3);
        list.getClass();
        this.menuItems = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxMenuSheet) && Intrinsics.areEqual(this.menuItems, ((TaxMenuSheet) obj).menuItems);
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        return this.menuItems.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("TaxMenuSheet(menuItems=", ")", this.menuItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.menuItems, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
