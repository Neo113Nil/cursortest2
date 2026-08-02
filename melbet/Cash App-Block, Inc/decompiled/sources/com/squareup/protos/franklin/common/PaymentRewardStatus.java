package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.protos.cash.familynotifications.api.v1.RealtimeNotificationSetting;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageBadge;
import com.squareup.protos.cash.messagingplatformcommon.templates.detail.DetailsPageText;
import com.squareup.protos.cash.referly.api.incentives.client.SetPromotionControlsRequest;
import com.squareup.protos.cash.weaver.api.PromoterMessagingMetadata;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.stafftasks.resources.UploadDocumentMetadata;
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
public final class PaymentRewardStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentRewardStatus> CREATOR;
    public final String main_text;
    public final Boolean show_payments;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String main_text;
        public Boolean show_payments;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PaymentRewardStatus(this.main_text, this.show_payments, buildUnknownFields());
                case 1:
                    return new GenericProfileElement.ButtonElement.BlockAction(this.main_text, this.show_payments, buildUnknownFields());
                case 2:
                    return new GetPersonalizedAdsStateResponse.State(this.main_text, this.show_payments, buildUnknownFields());
                case 3:
                    return new UserData2Response.InteractionEvents(this.main_text, this.show_payments, buildUnknownFields());
                case 4:
                    return new RealtimeNotificationSetting(this.main_text, this.show_payments, buildUnknownFields());
                case 5:
                    return new Action.LinkAccountTidal(this.main_text, this.show_payments, buildUnknownFields());
                case 6:
                    return new MarketingMessageBadge(this.main_text, this.show_payments, buildUnknownFields());
                case 7:
                    return new DetailsPageText(this.main_text, this.show_payments, buildUnknownFields());
                case 8:
                    return new SetPromotionControlsRequest(this.main_text, this.show_payments, buildUnknownFields());
                case 9:
                    return new PromoterMessagingMetadata(this.main_text, this.show_payments, buildUnknownFields());
                case 10:
                    return new SubmitFormRequest.ElementResult.CellDefaultResult(this.main_text, this.show_payments, buildUnknownFields());
                default:
                    return new UploadDocumentMetadata(this.main_text, this.show_payments, buildUnknownFields());
            }
        }
    }

    static {
        PaymentRewardStatus$Companion$ADAPTER$1 paymentRewardStatus$Companion$ADAPTER$1 = new PaymentRewardStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentRewardStatus.class), "type.googleapis.com/squareup.franklin.common.PaymentRewardStatus", Syntax.PROTO_2, null, "squareup/franklin/common/payment_reward_status.proto");
        ADAPTER = paymentRewardStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentRewardStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentRewardStatus(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.main_text = str;
        this.show_payments = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentRewardStatus)) {
            return false;
        }
        PaymentRewardStatus paymentRewardStatus = (PaymentRewardStatus) obj;
        return Intrinsics.areEqual(unknownFields(), paymentRewardStatus.unknownFields()) && Intrinsics.areEqual(this.main_text, paymentRewardStatus.main_text) && Intrinsics.areEqual(this.show_payments, paymentRewardStatus.show_payments);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.show_payments;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.main_text = this.main_text;
        builder.show_payments = this.show_payments;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        Boolean bool = this.show_payments;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_payments=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentRewardStatus{", "}", 0, null, null, 56);
    }
}
