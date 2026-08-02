package com.squareup.protos.cash.groups;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.bugsnag.android.IOUtils;
import com.bugsnag.android.internal.StringUtils;
import com.bumptech.glide.RegistryFactory;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.module.AppGlideModule;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.thread.ThreadExtKt;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.core.internal.utils.MiscUtilsKt;
import com.datadog.android.core.persistence.SerializerKt;
import com.datadog.android.rum.Rum;
import com.google.android.gms.internal.mlkit_vision_common.zzhi;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.android.gms.internal.mlkit_vision_common.zzhm;
import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import com.google.android.gms.internal.mlkit_vision_common.zzhw;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.sandbox.MagicValue;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.SandboxMetadata;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.Incident;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import com.squareup.protos.cash.instantpay.api.InstantPayoutAttemptStatus;
import com.squareup.protos.cash.instantpay.api.serverpush.InstantPayoutAttempt;
import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerControls;
import com.squareup.protos.cash.investcustomer.api.v1.SetCustomerControlsResponse;
import com.squareup.protos.cash.janus.api.AccountParams;
import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest;
import com.squareup.protos.cash.librarian.api.LegalDocumentsRequest;
import com.squareup.protos.cash.local.activity.CashAppLocalPaymentRenderData;
import com.squareup.protos.cash.local.client.app.v1.ReportMarketingMessageViewedRequest;
import com.squareup.protos.cash.local.client.v1.AddRoundToTabResponse;
import com.squareup.protos.cash.local.client.v1.AutoCompleteAddressResponse;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse;
import com.squareup.protos.cash.local.client.v1.CancelAppointmentResponse;
import com.squareup.protos.cash.local.client.v1.ConfirmArrivalResponse;
import com.squareup.protos.cash.local.client.v1.CreateLoyaltyAccountResponse;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.EducationalSheetImage;
import com.squareup.protos.cash.local.client.v1.GetAppointmentResponse;
import com.squareup.protos.cash.local.client.v1.GetBrandLocationsResponse;
import com.squareup.protos.cash.local.client.v1.GetBuyerAccountResponse;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.GetDeliveryQuoteResponse;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.franklin.api.Region;
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
public final class GroupParticipant extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GroupParticipant> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final IOUtils f1275type;

    public final class Anonymous extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Anonymous> CREATOR;

        static {
            GroupParticipant$Anonymous$Companion$ADAPTER$1 groupParticipant$Anonymous$Companion$ADAPTER$1 = new GroupParticipant$Anonymous$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Anonymous.class), "type.googleapis.com/squareup.cash.groups.GroupParticipant.Anonymous", Syntax.PROTO_2, null, "squareup/cash/groups/group.proto");
            ADAPTER = groupParticipant$Anonymous$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(groupParticipant$Anonymous$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Anonymous(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Anonymous) && Intrinsics.areEqual(unknownFields(), ((Anonymous) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.OpenID.Builder builder = new Action.OpenID.Builder(3);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Anonymous{}";
        }
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        /* renamed from: type, reason: collision with root package name */
        public Object f1276type;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GroupParticipant((IOUtils) this.f1276type, buildUnknownFields());
                case 1:
                    return new SandboxMetadata.Scenario((MagicValue) this.f1276type, buildUnknownFields());
                case 2:
                    return new GetIncidentResponse((Incident) this.f1276type, buildUnknownFields());
                case 3:
                    return new SubscribeToIncidentResponse((StringUtils) this.f1276type, buildUnknownFields());
                case 4:
                    return new UnsubscribeFromIncidentResponse((RegistryFactory) this.f1276type, buildUnknownFields());
                case 5:
                    return new InstantPayoutAttempt((InstantPayoutAttemptStatus) this.f1276type, buildUnknownFields());
                case 6:
                    return new Automation.AllocationStrategy((ImageHeaderParserUtils) this.f1276type, buildUnknownFields());
                case 7:
                    return new Order.FeatureMetadata((MediaStoreUtil) this.f1276type, buildUnknownFields());
                case 8:
                    return new SetCustomerControlsResponse((CustomerControls) this.f1276type, buildUnknownFields());
                case 9:
                    return new AccountParams((AccountParams.EntryDialog) this.f1276type, buildUnknownFields());
                case 10:
                    return new StartWebAuthnAuthenticationRequest((AppGlideModule) this.f1276type, buildUnknownFields());
                case 11:
                    Region region = (Region) this.f1276type;
                    if (region != null) {
                        return new LegalDocumentsRequest(region, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(region, "region");
                    throw null;
                case 12:
                    return new CashAppLocalPaymentRenderData((CashAppLocalPaymentRenderData.Actions) this.f1276type, buildUnknownFields());
                case 13:
                    return new ReportMarketingMessageViewedRequest((zzhi) this.f1276type, buildUnknownFields());
                case 14:
                    return new AddRoundToTabResponse((RemovalReason) this.f1276type, buildUnknownFields());
                case 15:
                    return new AutoCompleteAddressResponse((zzhk) this.f1276type, buildUnknownFields());
                case 16:
                    return new CalculateLineItemsResponse((ThreadExtKt) this.f1276type, buildUnknownFields());
                case 17:
                    return new CancelAppointmentResponse((zzhm) this.f1276type, buildUnknownFields());
                case 18:
                    return new ConfirmArrivalResponse((ByteArrayExtKt) this.f1276type, buildUnknownFields());
                case 19:
                    return new ConfirmArrivalResponse.Success((LocalOrder) this.f1276type, buildUnknownFields());
                case 20:
                    return new CreateLoyaltyAccountResponse((MiscUtilsKt) this.f1276type, buildUnknownFields());
                case 21:
                    return new CreateOrderResponse((SerializerKt) this.f1276type, buildUnknownFields());
                case 22:
                    return new CreateOrderResponse.OpenTab((LocalCart) this.f1276type, buildUnknownFields());
                case 23:
                    return new EducationalSheetImage((zzhu) this.f1276type, buildUnknownFields());
                case 24:
                    return new GetAppointmentResponse((Rum) this.f1276type, buildUnknownFields());
                case 25:
                    return new GetBrandLocationsResponse((zzhw) this.f1276type, buildUnknownFields());
                case 26:
                    return new GetBuyerAccountResponse((zzhy) this.f1276type, buildUnknownFields());
                case 27:
                    return new GetBuyerAccountResponse.Success((LocalBuyer.LocalBuyerAccount) this.f1276type, buildUnknownFields());
                case 28:
                    return new GetBuyerInfoResponse((zzhz) this.f1276type, buildUnknownFields());
                default:
                    return new GetDeliveryQuoteResponse((zzia) this.f1276type, buildUnknownFields());
            }
        }
    }

    public final class Customer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Customer> CREATOR;
        public final String customer_token;

        static {
            GroupParticipant$Customer$Companion$ADAPTER$1 groupParticipant$Customer$Companion$ADAPTER$1 = new GroupParticipant$Customer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Customer.class), "type.googleapis.com/squareup.cash.groups.GroupParticipant.Customer", Syntax.PROTO_2, null, "squareup/cash/groups/group.proto");
            ADAPTER = groupParticipant$Customer$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(groupParticipant$Customer$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Customer(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.customer_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Customer)) {
                return false;
            }
            Customer customer = (Customer) obj;
            return Intrinsics.areEqual(unknownFields(), customer.unknownFields()) && Intrinsics.areEqual(this.customer_token, customer.customer_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.customer_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Favorite.Builder builder = new Favorite.Builder(17);
            builder.favorite_customer_token = this.customer_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.customer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Customer{", "}", 0, null, null, 56);
        }
    }

    static {
        GroupParticipant$Companion$ADAPTER$1 groupParticipant$Companion$ADAPTER$1 = new GroupParticipant$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GroupParticipant.class), "type.googleapis.com/squareup.cash.groups.GroupParticipant", Syntax.PROTO_2, null, "squareup/cash/groups/group.proto");
        ADAPTER = groupParticipant$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(groupParticipant$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupParticipant(IOUtils iOUtils, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1275type = iOUtils;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupParticipant)) {
            return false;
        }
        GroupParticipant groupParticipant = (GroupParticipant) obj;
        return Intrinsics.areEqual(unknownFields(), groupParticipant.unknownFields()) && Intrinsics.areEqual(this.f1275type, groupParticipant.f1275type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        IOUtils iOUtils = this.f1275type;
        int hashCode2 = hashCode + (iOUtils != null ? iOUtils.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1276type = this.f1275type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        IOUtils iOUtils = this.f1275type;
        if (iOUtils != null) {
            arrayList.add("type=" + iOUtils);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GroupParticipant{", "}", 0, null, null, 56);
    }
}
