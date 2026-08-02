package com.squareup.protos.cash.favorites;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopDynamicScreenRequest;
import com.squareup.protos.cash.discover.api.app.v1.model.TapAction;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageRequest;
import com.squareup.protos.cash.fiatly.api.v1.AdminCreatePaymentLinkResponse;
import com.squareup.protos.cash.fiatly.api.v1.GetP2PControlsRequest;
import com.squareup.protos.cash.fiatly.api.v2.PaymentUpdateHeartbeat;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.DeliveryInstructions;
import com.squareup.protos.cash.grantly.api.RiskMetadata;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentRequest;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcustomer.api.v1.GetCustomerControlsRequest;
import com.squareup.protos.cash.janus.api.RemoveAccountRequest;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest;
import com.squareup.protos.cash.janus.syncvalues.AuthorizedPrincipal;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
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

/* loaded from: classes7.dex */
public final class Favorite extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Favorite> CREATOR;
    public final String favorite_customer_token;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String favorite_customer_token;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Favorite(this.favorite_customer_token, buildUnknownFields());
                case 1:
                    return new ShopDynamicScreenRequest(this.favorite_customer_token, buildUnknownFields());
                case 2:
                    return new TapAction(this.favorite_customer_token, buildUnknownFields());
                case 3:
                    return new SectionPageRequest(this.favorite_customer_token, buildUnknownFields());
                case 4:
                    return new AdminCreatePaymentLinkResponse(this.favorite_customer_token, buildUnknownFields());
                case 5:
                    return new GetP2PControlsRequest(this.favorite_customer_token, buildUnknownFields());
                case 6:
                    return new PaymentUpdateHeartbeat(this.favorite_customer_token, buildUnknownFields());
                case 7:
                    return new Action.OpenUrlAction(this.favorite_customer_token, buildUnknownFields());
                case 8:
                    return new Action.CustomerProfileSharing(this.favorite_customer_token, buildUnknownFields());
                case 9:
                    return new Action.OAuth.Metadata.AgentConnection(this.favorite_customer_token, buildUnknownFields());
                case 10:
                    return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount(this.favorite_customer_token, buildUnknownFields());
                case 11:
                    return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount(this.favorite_customer_token, buildUnknownFields());
                case 12:
                    return new Action.OAuth.Metadata.FinancialDataSharing.DataRecipient(this.favorite_customer_token, buildUnknownFields());
                case 13:
                    return new Action.OAuth.Metadata.FinancialDataSharing.Intermediary(this.favorite_customer_token, buildUnknownFields());
                case 14:
                    return new Action.OnFilePayment.Context(this.favorite_customer_token, buildUnknownFields());
                case 15:
                    return new DeliveryInstructions(this.favorite_customer_token, buildUnknownFields());
                case 16:
                    return new RiskMetadata(this.favorite_customer_token, buildUnknownFields());
                case 17:
                    return new GroupParticipant.Customer(this.favorite_customer_token, buildUnknownFields());
                case 18:
                    return new GetIncidentRequest(this.favorite_customer_token, buildUnknownFields());
                case 19:
                    return new SubscribeToIncidentRequest(this.favorite_customer_token, buildUnknownFields());
                case 20:
                    return new SubscribeToIncidentResponse.Failure(this.favorite_customer_token, buildUnknownFields());
                case 21:
                    return new UnsubscribeFromIncidentRequest(this.favorite_customer_token, buildUnknownFields());
                case 22:
                    return new UnsubscribeFromIncidentResponse.Failure(this.favorite_customer_token, buildUnknownFields());
                case 23:
                    return new Order.FeatureMetadata.ReversalMetadata(this.favorite_customer_token, buildUnknownFields());
                case 24:
                    return new GetCustomerControlsRequest(this.favorite_customer_token, buildUnknownFields());
                case 25:
                    return new RemoveAccountRequest(this.favorite_customer_token, buildUnknownFields());
                case 26:
                    return new StartWebAuthnAuthenticationRequest.Customer(this.favorite_customer_token, buildUnknownFields());
                case 27:
                    return new AuthorizedPrincipal(this.favorite_customer_token, buildUnknownFields());
                case 28:
                    return new CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail(this.favorite_customer_token, buildUnknownFields());
                default:
                    return new CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail(this.favorite_customer_token, buildUnknownFields());
            }
        }
    }

    static {
        Favorite$Companion$ADAPTER$1 favorite$Companion$ADAPTER$1 = new Favorite$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Favorite.class), "type.googleapis.com/squareup.cash.favorites.Favorite", Syntax.PROTO_2, null, "squareup/cash/favorites/favorite.proto");
        ADAPTER = favorite$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(favorite$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Favorite(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.favorite_customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Favorite)) {
            return false;
        }
        Favorite favorite = (Favorite) obj;
        return Intrinsics.areEqual(unknownFields(), favorite.unknownFields()) && Intrinsics.areEqual(this.favorite_customer_token, favorite.favorite_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.favorite_customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.favorite_customer_token = this.favorite_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.favorite_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "favorite_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Favorite{", "}", 0, null, null, 56);
    }
}
