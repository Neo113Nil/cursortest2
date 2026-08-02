package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.DeepLinkSpec;
import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.TransactionAuthRenderData;
import com.squareup.protos.franklin.common.TransferInstrumentMap;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.lending.InitiateLoanRequest;
import com.squareup.protos.franklin.loyalty.PointsReward;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.protos.franklin.ui.C4BIdentityHubState;
import com.squareup.protos.franklin.ui.CustomerData;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessageButton;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.hieroglyph.WrappedKey;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.invest.ui.Section;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.protos.payrollconnector.common.DirectDepositInfo;
import com.squareup.protos.payrollconnector.common.PayrollProvider;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiSpecification;
import com.squareup.protos.payrollconnector.common.Platform;
import com.squareup.protos.payrollconnector.common.PlatformType;
import com.squareup.protos.payrollconnector.common.SourceIdentifier;
import com.squareup.protos.rewardly.ui.AppVersion;
import com.squareup.protos.rewardly.ui.IconAsset;
import com.squareup.protos.rewardly.ui.UiRewardAvatar;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.teamapp.ui.ParameterizedText;
import com.squareup.protos.teamapp.ui.ParameterizedTextParameters;
import com.squareup.protos.timecards.BreakRule;
import com.squareup.protos.timecards.CreateOrUpdateTimecardResponse;
import com.squareup.protos.timecards.CreateOrUpdateTimecardResponse$Error$ConflictError;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiDda extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiDda> CREATOR;
    public final DirectDepositAccount account;
    public final BalanceData.Button button;
    public final BalanceData.Button dda_form;
    public final Boolean enabled;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object account;
        public Object button;
        public Object dda_form;
        public Object enabled;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiDda((DirectDepositAccount) this.account, (Boolean) this.enabled, (BalanceData.Button) this.button, (BalanceData.Button) this.dda_form, buildUnknownFields());
                case 1:
                    return new TransactionAuthRenderData((TransactionAuthRenderData.TransactionAuthRequestStatus) this.account, (String) this.enabled, (String) this.button, (String) this.dda_form, buildUnknownFields());
                case 2:
                    return new TransferInstrumentMap((String) this.account, (List) this.enabled, (CashInstrumentType) this.button, (List) this.dda_form, buildUnknownFields());
                case 3:
                    return new CreditLine.Alert((String) this.account, (String) this.enabled, (String) this.button, (CreditLine.Alert.DisplayTime) this.dda_form, buildUnknownFields());
                case 4:
                    return new InitiateLoanRequest((RequestContext) this.account, (String) this.enabled, (String) this.button, (Money) this.dda_form, buildUnknownFields());
                case 5:
                    return new PointsReward((Long) this.account, (String) this.enabled, (String) this.button, (Money) this.dda_form, buildUnknownFields());
                case 6:
                    return new BalanceSnapshot((String) this.account, (Long) this.enabled, (Money) this.button, (BalanceSnapshot.Type) this.dda_form, buildUnknownFields());
                case 7:
                    return new C4BIdentityHubState.AccountVerification((LocalizedString) this.account, (LocalizedString) this.enabled, (C4BIdentityHubState.C4BIdentityVerificationBadgeIcon) this.button, (C4BIdentityHubState.ClientRouteAction) this.dda_form, buildUnknownFields());
                case 8:
                    return new CustomerData.IDVStatus((CustomerData.IDVStatus.VerificationStatus) this.account, (Long) this.enabled, (CustomerData.IDVStatus.VerificationStatus) this.button, (CustomerData.IDVStatus.VerificationStatus) this.dda_form, buildUnknownFields());
                case 9:
                    return new LimitsPageletInlineMessageButton((String) this.account, (LocalizableString) this.enabled, (LimitsPageletInlineMessageButton.ButtonAction) this.button, (String) this.dda_form, buildUnknownFields());
                case 10:
                    return new RewardSelection((String) this.account, (String) this.enabled, (Long) this.button, (zzee) this.dda_form, buildUnknownFields());
                case 11:
                    return new UiJurisdictionConfig((CurrencyCode) this.account, (Country) this.enabled, (List) this.button, (List) this.dda_form, buildUnknownFields());
                case 12:
                    return new WrappedKey((KeyScope) this.account, (ByteString) this.enabled, (Long) this.button, (Long) this.dda_form, buildUnknownFields());
                case 13:
                    return new Section.Row((String) this.account, (Section.Row.Value) this.enabled, (Section.Row.MoreInfo) this.button, (String) this.dda_form, buildUnknownFields());
                case 14:
                    return new Section.Row.Value((String) this.account, (Section.Row.Value.Icon) this.enabled, (Section.Row.Value.Color) this.button, (ClientDriven) this.dda_form, buildUnknownFields());
                case 15:
                    return new BorrowAppletLinksTile.Data.LinkCell((Icon) this.account, (LocalizedString) this.enabled, (LocalizedString) this.button, (String) this.dda_form, buildUnknownFields());
                case 16:
                    return new BorrowData.AppletData.EntryPointData.RowEntryPoint((LocalizedString) this.account, (LocalizedString) this.button, (Boolean) this.enabled, (String) this.dda_form, buildUnknownFields());
                case 17:
                    return new BorrowData.AppletData.EntryPointData.TileEntryPoint((String) this.account, (BorrowData.AppletData.EntryPointData.RowEntryPoint) this.enabled, (BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile) this.button, (BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile) this.dda_form, buildUnknownFields());
                case 18:
                    return new BorrowLimitHubData.LimitProgressSection.TextStack((LocalizedString) this.account, (LocalizedString) this.enabled, (Color) this.button, (Color) this.dda_form, buildUnknownFields());
                case 19:
                    return new LendingInfo.FirstTimeBorrowData((LendingInfo.FirstTimeBorrowData.HomeScreen) this.account, (LendingInfo.FirstTimeBorrowData.LimitCheckerScreen) this.enabled, (LendingInfo.FirstTimeBorrowData.ConfirmationScreen) this.button, (LendingInfo.FirstTimeBorrowData.LimitInfoScreen) this.dda_form, buildUnknownFields());
                case 20:
                    return new LendingInfo.FirstTimeBorrowData.LimitCheckerScreen((String) this.account, (String) this.enabled, (List) this.button, (Integer) this.dda_form, buildUnknownFields());
                case 21:
                    return new DirectDepositInfo((Boolean) this.enabled, (Boolean) this.account, (Long) this.button, (Long) this.dda_form, buildUnknownFields());
                case 22:
                    return new PayrollProvider((DeepLinkSpec.Companion) this.account, (PayrollProviderUiSpecification) this.enabled, (List) this.button, (DirectDepositInfo) this.dda_form, buildUnknownFields());
                case 23:
                    return new Platform((String) this.account, (String) this.enabled, (SourceIdentifier) this.button, (PlatformType) this.dda_form, buildUnknownFields());
                case 24:
                    return new AppVersion((com.squareup.protos.rewardly.ui.Platform) this.account, (Integer) this.enabled, (Integer) this.button, (Integer) this.dda_form, buildUnknownFields());
                case 25:
                    return new UiRewardAvatar((Image) this.button, (Color) this.dda_form, (String) this.account, (String) this.enabled, buildUnknownFields());
                case 26:
                    return new UiRewardProgramDetails.BoostDetail((com.squareup.protos.rewardly.ui.common.Icon) this.account, (IconAsset) this.enabled, (String) this.button, (Icon) this.dda_form, buildUnknownFields());
                case 27:
                    String str = (String) this.account;
                    if (str != null) {
                        return new ParameterizedText(str, (ParameterizedTextParameters) this.enabled, (Map) this.button, (String) this.dda_form, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "text");
                    throw null;
                case 28:
                    return new BreakRule((String) this.account, (String) this.enabled, (String) this.button, (RoutesKt) this.dda_form, buildUnknownFields());
                default:
                    return new CreateOrUpdateTimecardResponse((Timecard) this.account, (List) this.enabled, (List) this.button, (CreateOrUpdateTimecardResponse$Error$ConflictError) this.dda_form, buildUnknownFields());
            }
        }
    }

    static {
        UiDda$Companion$ADAPTER$1 uiDda$Companion$ADAPTER$1 = new UiDda$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiDda.class), "type.googleapis.com/squareup.franklin.ui.UiDda", Syntax.PROTO_2, null, "squareup/franklin/ui/dda.proto");
        ADAPTER = uiDda$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiDda$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiDda(DirectDepositAccount directDepositAccount, Boolean bool, BalanceData.Button button, BalanceData.Button button2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account = directDepositAccount;
        this.enabled = bool;
        this.button = button;
        this.dda_form = button2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiDda)) {
            return false;
        }
        UiDda uiDda = (UiDda) obj;
        return Intrinsics.areEqual(unknownFields(), uiDda.unknownFields()) && Intrinsics.areEqual(this.account, uiDda.account) && Intrinsics.areEqual(this.enabled, uiDda.enabled) && Intrinsics.areEqual(this.button, uiDda.button) && Intrinsics.areEqual(this.dda_form, uiDda.dda_form);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DirectDepositAccount directDepositAccount = this.account;
        int hashCode2 = (hashCode + (directDepositAccount != null ? directDepositAccount.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        BalanceData.Button button = this.button;
        int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
        BalanceData.Button button2 = this.dda_form;
        int hashCode5 = hashCode4 + (button2 != null ? button2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.account = this.account;
        builder.enabled = this.enabled;
        builder.button = this.button;
        builder.dda_form = this.dda_form;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DirectDepositAccount directDepositAccount = this.account;
        if (directDepositAccount != null) {
            arrayList.add("account=" + directDepositAccount);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        BalanceData.Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        BalanceData.Button button2 = this.dda_form;
        if (button2 != null) {
            arrayList.add("dda_form=" + button2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiDda{", "}", 0, null, null, 56);
    }
}
