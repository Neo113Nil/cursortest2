package com.squareup.protos.cash.groups;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.google.android.gms.internal.mlkit_vision_common.zzhh;
import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import com.google.android.gms.internal.mlkit_vision_common.zzit;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.cash.investautomator.api.flows.InitiateRoundUpOnboardingFlowParameters;
import com.squareup.protos.cash.investautomator.api.flows.SubmitAutomationForFlowRequest;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investcrypto.event.CryptoOrderEvent;
import com.squareup.protos.cash.investcrypto.resources.OrderRejectionReason$Reason;
import com.squareup.protos.cash.investcrypto.server.CancelOrderResponse;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerLimit;
import com.squareup.protos.cash.investcustomer.api.v1.SetCustomerControlsRequest;
import com.squareup.protos.cash.investflow.flows.DisableRecurringEquityBuyParams;
import com.squareup.protos.cash.janus.api.GetAuthorizedAccountAuthorizedRelationship;
import com.squareup.protos.cash.janus.api.GetAuthorizedAccountResponse;
import com.squareup.protos.cash.janus.api.StartAccountRecoveryResponse;
import com.squareup.protos.cash.janus.api.trusthub.GetTrustHubResponse;
import com.squareup.protos.cash.janus.api.trusthub.StatusIndicator;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenContent;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenLargeCell;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenRowCell;
import com.squareup.protos.cash.local.client.app.v1.UpdateEarningCardRequest;
import com.squareup.protos.cash.local.client.app.v1.account.LocalEarningCard;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.v1.AppointmentSlotSpec;
import com.squareup.protos.cash.local.client.v1.EducationalSheetButton;
import com.squareup.protos.cash.local.client.v1.GetOrderResponse;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalActionP2P;
import com.squareup.protos.cash.local.client.v1.LocalActionRedemption;
import com.squareup.protos.cash.local.client.v1.LocalActions;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutBrandSummary;
import com.squareup.protos.cash.local.client.v1.LocalComboSlotPriceAdjustment;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentOption;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMenuHours;
import com.squareup.protos.cash.local.client.v1.LocalMenuHoursState;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.SignupOrEnrollUpsell;
import com.squareup.protos.cash.plasma.common.CallContext;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.HeroHeader;

/* loaded from: classes7.dex */
public final class Group extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Group> CREATOR;
    public final Avatar group_image;
    public final String name;
    public final List participants;

    static {
        Group$Companion$ADAPTER$1 group$Companion$ADAPTER$1 = new Group$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Group.class), "type.googleapis.com/squareup.cash.groups.Group", Syntax.PROTO_2, null, "squareup/cash/groups/group.proto");
        ADAPTER = group$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(group$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Group(String str, Avatar avatar, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name = str;
        this.group_image = avatar;
        this.participants = TransactorKt.immutableCopyOf("participants", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        return Intrinsics.areEqual(unknownFields(), group.unknownFields()) && Intrinsics.areEqual(this.name, group.name) && Intrinsics.areEqual(this.group_image, group.group_image) && Intrinsics.areEqual(this.participants, group.participants);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Avatar avatar = this.group_image;
        int hashCode3 = this.participants.hashCode() + ((hashCode2 + (avatar != null ? avatar.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.name = this.name;
        builder.group_image = this.group_image;
        builder.participants = this.participants;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        Avatar avatar = this.group_image;
        if (avatar != null) {
            arrayList.add("group_image=" + avatar);
        }
        List list = this.participants;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("participants=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Group{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object group_image;
        public Object name;
        public Object participants;

        public Builder() {
            this.$r8$classId = 13;
            EmptyList emptyList = EmptyList.INSTANCE;
            this.participants = emptyList;
            this.group_image = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Group((String) this.name, (Avatar) this.group_image, (List) this.participants, buildUnknownFields());
                case 1:
                    return new InitiateRoundUpOnboardingFlowParameters((CallContext) this.name, (Automation) this.group_image, (Boolean) this.participants, buildUnknownFields());
                case 2:
                    return new SubmitAutomationForFlowRequest((RequestContext) this.group_image, (Automation) this.participants, (String) this.name, buildUnknownFields());
                case 3:
                    return new CancelOrderResponse((CancelOrderResponse.Result) this.name, (ResponseContext) this.group_image, (CancelOrderResponse.InternalResponse) this.participants, buildUnknownFields());
                case 4:
                    return new CancelOrderResponse.InternalResponse((StoredValueBalance) this.name, (OrderRejectionReason$Reason) this.group_image, (CryptoOrderEvent) this.participants, buildUnknownFields());
                case 5:
                    return new CustomerLimit((CustomerLimit.Frequency) this.name, (Money) this.group_image, (Money) this.participants, buildUnknownFields());
                case 6:
                    return new SetCustomerControlsRequest((String) this.name, (Boolean) this.group_image, (CustomerLimit) this.participants, buildUnknownFields());
                case 7:
                    return new DisableRecurringEquityBuyParams((String) this.name, (Money) this.group_image, (RecurringSchedule) this.participants, buildUnknownFields());
                case 8:
                    return new GetAuthorizedAccountResponse((GetAuthorizedAccountAuthorizedRelationship) this.group_image, (String) this.name, (String) this.participants, buildUnknownFields());
                case 9:
                    return new StartAccountRecoveryResponse((ResponseContext) this.group_image, (StartAccountRecoveryResponse.Status) this.participants, (String) this.name, buildUnknownFields());
                case 10:
                    return new GetTrustHubResponse((StatusIndicator) this.name, (HeroHeader) this.group_image, (List) this.participants, buildUnknownFields());
                case 11:
                    return new CashAppLocalOrderRenderData.OrderActivityEntry((CashAppLocalOrderRenderData.OrderActivityEntrySubject) this.group_image, (String) this.name, (Long) this.participants, buildUnknownFields());
                case 12:
                    return new CashAppLocalOrderRenderData.OrderLine((String) this.name, (Integer) this.group_image, (Money) this.participants, buildUnknownFields());
                case 13:
                    return new BulkUpdateBrandsRequest((RequestContext) this.name, (List) this.participants, (List) this.group_image, buildUnknownFields());
                case 14:
                    return new MarketScreenContent((zzhh) this.group_image, (String) this.name, (Long) this.participants, buildUnknownFields());
                case 15:
                    return new MarketScreenLargeCell((List) this.participants, (MarketScreenRowCell) this.group_image, (String) this.name, buildUnknownFields());
                case 16:
                    return new UpdateEarningCardRequest((RequestContext) this.group_image, (String) this.name, (LocalEarningCard.EarningState) this.participants, buildUnknownFields());
                case 17:
                    return new LocalCard.ActionButton((String) this.name, (String) this.group_image, (LocalCard.ActionButton.DisplayCondition) this.participants, buildUnknownFields());
                case 18:
                    return new AppointmentSlotSpec((Long) this.group_image, (String) this.name, (List) this.participants, buildUnknownFields());
                case 19:
                    return new EducationalSheetButton((zzhs) this.group_image, (String) this.name, (EducationalSheetButton.Style) this.participants, buildUnknownFields());
                case 20:
                    return new GetOrderResponse((SdkCoreExtKt) this.group_image, (SignupOrEnrollUpsell) this.participants, (String) this.name, buildUnknownFields());
                case 21:
                    return new GetShortlinkRequest((String) this.name, (String) this.group_image, (GetShortlinkRequest.InvocationContext) this.participants, buildUnknownFields());
                case 22:
                    return new LocalActions((LocalActionOrdering) this.name, (LocalActionP2P) this.group_image, (LocalActionRedemption) this.participants, buildUnknownFields());
                case 23:
                    return new LocalBrand.FulfillmentSelection((List) this.participants, (List) this.name, (LocalFulfillmentType) this.group_image, buildUnknownFields());
                case 24:
                    return new LocalCashEarningsConfiguration((String) this.name, (List) this.participants, (LocalMoney) this.group_image, buildUnknownFields());
                case 25:
                    return new LocalCheckoutBrandSummary.AfterPayConfiguration((Boolean) this.name, (LocalMoney) this.group_image, (LocalMoney) this.participants, buildUnknownFields());
                case 26:
                    return new LocalComboSlotPriceAdjustment((String) this.name, (String) this.group_image, (LocalMoney) this.participants, buildUnknownFields());
                case 27:
                    return new LocalFulfillmentOption((LocalFulfillmentOption.Type) this.name, (LocalEstimatedCompletionDuration) this.group_image, (LocalFulfillmentType) this.participants, buildUnknownFields());
                case 28:
                    return new LocalMenuHours((LocalMenuHoursState) this.group_image, (String) this.name, (String) this.participants, buildUnknownFields());
                default:
                    return new LocalMenuItemModifierList((String) this.name, (String) this.group_image, (zzit) this.participants, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(boolean z) {
            this.$r8$classId = 6;
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
