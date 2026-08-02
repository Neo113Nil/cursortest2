package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzje;
import com.google.android.gms.internal.mlkit_vision_face.zzjf;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.groups.GroupExpense;
import com.squareup.protos.checkmate.sync.UiCheckDeposit;
import com.squareup.protos.cryptoinvestflow.CryptoPayrollPreference;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.protos.franklin.common.P2pPoolMemberRenderData;
import com.squareup.protos.franklin.common.PhysicalCardData;
import com.squareup.protos.franklin.common.StaticLimitGroup;
import com.squareup.protos.franklin.common.SyncAccountStatementEntity;
import com.squareup.protos.franklin.common.SyncCheckDepositReceiptEntity;
import com.squareup.protos.franklin.common.SyncCryptoPayrollPreference;
import com.squareup.protos.franklin.common.SyncCustomer;
import com.squareup.protos.franklin.common.SyncGiftCardEntity;
import com.squareup.protos.franklin.common.SyncGroup;
import com.squareup.protos.franklin.common.SyncGroupExpense;
import com.squareup.protos.franklin.common.SyncInvitation;
import com.squareup.protos.franklin.common.SyncLoyaltyAccount;
import com.squareup.protos.franklin.common.SyncLoyaltyProgram;
import com.squareup.protos.franklin.common.SyncReceiptEntity;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.franklin.common.SyncRewardSelection;
import com.squareup.protos.franklin.common.SyncShippingAddress;
import com.squareup.protos.franklin.common.TimelineRenderData;
import com.squareup.protos.franklin.common.ViewContextRenderData;
import com.squareup.protos.franklin.loyalty.LoyaltyProgram;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData;
import com.squareup.protos.lending.sync_values.AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.loyalizer.LoyaltyProfile;
import com.squareup.protos.loyalizer.UiLoyaltyNotificationPreference;
import com.squareup.protos.multipass.service.ClientCredentials;
import com.squareup.protos.multipass.service.CreateOtkRequest;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.protos.timecards.ChangeProposal;
import com.squareup.protos.timecards.CreateChangeProposalResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiCashLimits extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiCashLimits> CREATOR;
    public final StaticLimitGroup cash_limit_group;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object cash_limit_group;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiCashLimits((StaticLimitGroup) this.cash_limit_group, buildUnknownFields());
                case 1:
                    return new P2pPoolMemberRenderData((P2pPoolMemberRenderData.MembershipStatus) this.cash_limit_group, buildUnknownFields());
                case 2:
                    return new PhysicalCardData((PhysicalCardData.State) this.cash_limit_group, buildUnknownFields());
                case 3:
                    return new SyncAccountStatementEntity((Account) this.cash_limit_group, buildUnknownFields());
                case 4:
                    return new SyncCheckDepositReceiptEntity((UiCheckDeposit) this.cash_limit_group, buildUnknownFields());
                case 5:
                    return new SyncCryptoPayrollPreference((CryptoPayrollPreference) this.cash_limit_group, buildUnknownFields());
                case 6:
                    return new SyncCustomer((UiCustomer) this.cash_limit_group, buildUnknownFields());
                case 7:
                    return new SyncGiftCardEntity((GiftCard) this.cash_limit_group, buildUnknownFields());
                case 8:
                    return new SyncGroup((Group) this.cash_limit_group, buildUnknownFields());
                case 9:
                    return new SyncGroupExpense((GroupExpense) this.cash_limit_group, buildUnknownFields());
                case 10:
                    return new SyncInvitation((UiInvitation) this.cash_limit_group, buildUnknownFields());
                case 11:
                    return new SyncLoyaltyAccount((UiLoyaltyAccount) this.cash_limit_group, buildUnknownFields());
                case 12:
                    return new SyncLoyaltyProgram((UiLoyaltyProgram) this.cash_limit_group, buildUnknownFields());
                case 13:
                    return new SyncReceiptEntity((UiItemizedReceipt) this.cash_limit_group, buildUnknownFields());
                case 14:
                    return new SyncRecurringPreference((ScheduledTransactionPreference) this.cash_limit_group, buildUnknownFields());
                case 15:
                    return new SyncRewardSelection((RewardSelection) this.cash_limit_group, buildUnknownFields());
                case 16:
                    return new SyncShippingAddress((ShippingAddress) this.cash_limit_group, buildUnknownFields());
                case 17:
                    return new TimelineRenderData((Timeline) this.cash_limit_group, buildUnknownFields());
                case 18:
                    return new ViewContextRenderData((ViewContextRenderData.ViewContext) this.cash_limit_group, buildUnknownFields());
                case 19:
                    return new UiControl.IconButton((UiControl.Icon) this.cash_limit_group, buildUnknownFields());
                case 20:
                    return new UiExchangeData((ExchangeData) this.cash_limit_group, buildUnknownFields());
                case 21:
                    return new UiLoyaltyProgram((LoyaltyProgram) this.cash_limit_group, buildUnknownFields());
                case 22:
                    return new PrepurchaseAfterpayAppletData.ButtonData((zzje) this.cash_limit_group, buildUnknownFields());
                case 23:
                    return new AfterpayPrepurchaseData.CardsEntryPoint((AfterpayPrepurchaseData$CardsEntryPoint$EntryPoint$ToggleEntryPoint) this.cash_limit_group, buildUnknownFields());
                case 24:
                    return new AfterpayPrepurchaseData.CardsEntryPoint.ToggleEntrypointData.Action((zzjf) this.cash_limit_group, buildUnknownFields());
                case 25:
                    return new BorrowData.AppletData.EntryPointData.HiddenEntryPoint((BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason) this.cash_limit_group, buildUnknownFields());
                case 26:
                    return new BorrowData((BorrowData.AppletData) this.cash_limit_group, buildUnknownFields());
                case 27:
                    return new LoyaltyProfile((UiLoyaltyNotificationPreference) this.cash_limit_group, buildUnknownFields());
                case 28:
                    return new CreateOtkRequest((ClientCredentials) this.cash_limit_group, buildUnknownFields());
                default:
                    return new CreateChangeProposalResponse((ChangeProposal) this.cash_limit_group, buildUnknownFields());
            }
        }
    }

    static {
        UiCashLimits$Companion$ADAPTER$1 uiCashLimits$Companion$ADAPTER$1 = new UiCashLimits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiCashLimits.class), "type.googleapis.com/squareup.franklin.ui.UiCashLimits", Syntax.PROTO_2, null, "squareup/franklin/ui/cash_limits.proto");
        ADAPTER = uiCashLimits$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiCashLimits$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiCashLimits(StaticLimitGroup staticLimitGroup, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cash_limit_group = staticLimitGroup;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiCashLimits)) {
            return false;
        }
        UiCashLimits uiCashLimits = (UiCashLimits) obj;
        return Intrinsics.areEqual(unknownFields(), uiCashLimits.unknownFields()) && Intrinsics.areEqual(this.cash_limit_group, uiCashLimits.cash_limit_group);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        StaticLimitGroup staticLimitGroup = this.cash_limit_group;
        int hashCode2 = hashCode + (staticLimitGroup != null ? staticLimitGroup.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.cash_limit_group = this.cash_limit_group;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StaticLimitGroup staticLimitGroup = this.cash_limit_group;
        if (staticLimitGroup != null) {
            arrayList.add("cash_limit_group=" + staticLimitGroup);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiCashLimits{", "}", 0, null, null, 56);
    }
}
