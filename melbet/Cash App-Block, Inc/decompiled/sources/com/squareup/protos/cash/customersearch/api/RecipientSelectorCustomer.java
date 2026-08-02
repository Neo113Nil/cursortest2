package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.franklin.api.Region;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RecipientSelectorCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecipientSelectorCustomer> CREATOR;
    public final String account_holder_token;
    public final Avatar avatar;
    public final C4bInfo c4b_info;
    public final Boolean can_accept_payments;
    public final Cashtag cashtag;
    public final Long credit_card_fee_bps;
    public final String full_name;
    public final Boolean is_blocked;
    public final Boolean is_business;
    public final Boolean is_verified;
    public final String matched_sms;
    public final Metadata metadata;
    public final Region region;
    public final String subtitle;
    public final String token;

    public final class C4bInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<C4bInfo> CREATOR;
        public final String c4b_category;

        static {
            RecipientSelectorCustomer$C4bInfo$Companion$ADAPTER$1 recipientSelectorCustomer$C4bInfo$Companion$ADAPTER$1 = new RecipientSelectorCustomer$C4bInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(C4bInfo.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorCustomer.C4bInfo", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorCustomer$C4bInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorCustomer$C4bInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4bInfo(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.c4b_category = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4bInfo)) {
                return false;
            }
            C4bInfo c4bInfo = (C4bInfo) obj;
            return Intrinsics.areEqual(unknownFields(), c4bInfo.unknownFields()) && Intrinsics.areEqual(this.c4b_category, c4bInfo.c4b_category);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.c4b_category;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Banner.Builder builder = new Banner.Builder(24);
            builder.banner_color = this.c4b_category;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.c4b_category;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "c4b_category=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "C4bInfo{", "}", 0, null, null, 56);
        }
    }

    public final class Metadata extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Metadata> CREATOR;
        public final Boolean is_c4b_account;
        public final Boolean is_cash_customer;
        public final Boolean is_client_candidate;
        public final Boolean is_first_linked_account;
        public final Boolean is_linked_account;
        public final Boolean is_multiple_account_holder;
        public final List match_fields;
        public final Integer match_length;
        public final String model_version;
        public final String query_token;

        static {
            RecipientSelectorCustomer$Metadata$Companion$ADAPTER$1 recipientSelectorCustomer$Metadata$Companion$ADAPTER$1 = new RecipientSelectorCustomer$Metadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Metadata.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorCustomer.Metadata", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
            ADAPTER = recipientSelectorCustomer$Metadata$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorCustomer$Metadata$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Metadata(String str, Integer num, Boolean bool, List list, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.model_version = str;
            this.match_length = num;
            this.is_cash_customer = bool;
            this.query_token = str2;
            this.is_linked_account = bool2;
            this.is_c4b_account = bool3;
            this.is_multiple_account_holder = bool4;
            this.is_first_linked_account = bool5;
            this.is_client_candidate = bool6;
            this.match_fields = TransactorKt.immutableCopyOf("match_fields", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return Intrinsics.areEqual(unknownFields(), metadata.unknownFields()) && Intrinsics.areEqual(this.model_version, metadata.model_version) && Intrinsics.areEqual(this.match_length, metadata.match_length) && Intrinsics.areEqual(this.is_cash_customer, metadata.is_cash_customer) && Intrinsics.areEqual(this.match_fields, metadata.match_fields) && Intrinsics.areEqual(this.query_token, metadata.query_token) && Intrinsics.areEqual(this.is_linked_account, metadata.is_linked_account) && Intrinsics.areEqual(this.is_c4b_account, metadata.is_c4b_account) && Intrinsics.areEqual(this.is_multiple_account_holder, metadata.is_multiple_account_holder) && Intrinsics.areEqual(this.is_first_linked_account, metadata.is_first_linked_account) && Intrinsics.areEqual(this.is_client_candidate, metadata.is_client_candidate);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.model_version;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.match_length;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Boolean bool = this.is_cash_customer;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.match_fields);
            String str2 = this.query_token;
            int hashCode4 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool2 = this.is_linked_account;
            int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Boolean bool3 = this.is_c4b_account;
            int hashCode6 = (hashCode5 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
            Boolean bool4 = this.is_multiple_account_holder;
            int hashCode7 = (hashCode6 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
            Boolean bool5 = this.is_first_linked_account;
            int hashCode8 = (hashCode7 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
            Boolean bool6 = this.is_client_candidate;
            int hashCode9 = hashCode8 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashInRequest.Builder builder = new CashInRequest.Builder(3);
            builder.external_id = this.model_version;
            builder.request_context = this.match_length;
            builder.external_client_transfer_token = this.is_cash_customer;
            builder.source = this.match_fields;
            builder.passcode_token = this.query_token;
            builder.target = this.is_linked_account;
            builder.amount = this.is_c4b_account;
            builder.call_context = this.is_multiple_account_holder;
            builder.forwarded_call_context = this.is_first_linked_account;
            builder.client_verified_digital_wallet = this.is_client_candidate;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.model_version != null) {
                arrayList.add("model_version=██");
            }
            Integer num = this.match_length;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("match_length=", num, arrayList);
            }
            Boolean bool = this.is_cash_customer;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool, arrayList);
            }
            List list = this.match_fields;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("match_fields=", arrayList, list);
            }
            String str = this.query_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "query_token=", arrayList);
            }
            Boolean bool2 = this.is_linked_account;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_linked_account=", bool2, arrayList);
            }
            Boolean bool3 = this.is_c4b_account;
            if (bool3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_c4b_account=", bool3, arrayList);
            }
            Boolean bool4 = this.is_multiple_account_holder;
            if (bool4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_multiple_account_holder=", bool4, arrayList);
            }
            Boolean bool5 = this.is_first_linked_account;
            if (bool5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_first_linked_account=", bool5, arrayList);
            }
            Boolean bool6 = this.is_client_candidate;
            if (bool6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_client_candidate=", bool6, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Metadata{", "}", 0, null, null, 56);
        }
    }

    static {
        RecipientSelectorCustomer$Companion$ADAPTER$1 recipientSelectorCustomer$Companion$ADAPTER$1 = new RecipientSelectorCustomer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecipientSelectorCustomer.class), "type.googleapis.com/squareup.cash.customersearch.api.RecipientSelectorCustomer", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/RecipientSelectorSearch.proto");
        ADAPTER = recipientSelectorCustomer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientSelectorCustomer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientSelectorCustomer(String str, Avatar avatar, String str2, Cashtag cashtag, Region region, Boolean bool, Boolean bool2, Long l, Metadata metadata, Boolean bool3, Boolean bool4, String str3, C4bInfo c4bInfo, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.avatar = avatar;
        this.full_name = str2;
        this.cashtag = cashtag;
        this.region = region;
        this.is_verified = bool;
        this.is_business = bool2;
        this.credit_card_fee_bps = l;
        this.metadata = metadata;
        this.can_accept_payments = bool3;
        this.is_blocked = bool4;
        this.account_holder_token = str3;
        this.c4b_info = c4bInfo;
        this.subtitle = str4;
        this.matched_sms = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecipientSelectorCustomer)) {
            return false;
        }
        RecipientSelectorCustomer recipientSelectorCustomer = (RecipientSelectorCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), recipientSelectorCustomer.unknownFields()) && Intrinsics.areEqual(this.token, recipientSelectorCustomer.token) && Intrinsics.areEqual(this.avatar, recipientSelectorCustomer.avatar) && Intrinsics.areEqual(this.full_name, recipientSelectorCustomer.full_name) && Intrinsics.areEqual(this.cashtag, recipientSelectorCustomer.cashtag) && this.region == recipientSelectorCustomer.region && Intrinsics.areEqual(this.is_verified, recipientSelectorCustomer.is_verified) && Intrinsics.areEqual(this.is_business, recipientSelectorCustomer.is_business) && Intrinsics.areEqual(this.credit_card_fee_bps, recipientSelectorCustomer.credit_card_fee_bps) && Intrinsics.areEqual(this.metadata, recipientSelectorCustomer.metadata) && Intrinsics.areEqual(this.can_accept_payments, recipientSelectorCustomer.can_accept_payments) && Intrinsics.areEqual(this.is_blocked, recipientSelectorCustomer.is_blocked) && Intrinsics.areEqual(this.account_holder_token, recipientSelectorCustomer.account_holder_token) && Intrinsics.areEqual(this.c4b_info, recipientSelectorCustomer.c4b_info) && Intrinsics.areEqual(this.subtitle, recipientSelectorCustomer.subtitle) && Intrinsics.areEqual(this.matched_sms, recipientSelectorCustomer.matched_sms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Avatar avatar = this.avatar;
        int hashCode3 = (hashCode2 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        String str2 = this.full_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Cashtag cashtag = this.cashtag;
        int hashCode5 = (hashCode4 + (cashtag != null ? cashtag.hashCode() : 0)) * 37;
        Region region = this.region;
        int hashCode6 = (hashCode5 + (region != null ? region.hashCode() : 0)) * 37;
        Boolean bool = this.is_verified;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_business;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Long l = this.credit_card_fee_bps;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Metadata metadata = this.metadata;
        int hashCode10 = (hashCode9 + (metadata != null ? metadata.hashCode() : 0)) * 37;
        Boolean bool3 = this.can_accept_payments;
        int hashCode11 = (hashCode10 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.is_blocked;
        int hashCode12 = (hashCode11 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str3 = this.account_holder_token;
        int hashCode13 = (hashCode12 + (str3 != null ? str3.hashCode() : 0)) * 37;
        C4bInfo c4bInfo = this.c4b_info;
        int hashCode14 = (hashCode13 + (c4bInfo != null ? c4bInfo.hashCode() : 0)) * 37;
        String str4 = this.subtitle;
        int hashCode15 = (hashCode14 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.matched_sms;
        int hashCode16 = hashCode15 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(2);
        builder.user_agent = this.token;
        builder.device_name = this.avatar;
        builder.device_uuid = this.full_name;
        builder.accept_language = this.cashtag;
        builder.device_installation_id = this.region;
        builder.drm_id = this.is_verified;
        builder.device_vendor_id = this.is_business;
        builder.device_id = this.credit_card_fee_bps;
        builder.threatmetrix_smart_id = this.metadata;
        builder.timestamp = this.can_accept_payments;
        builder.navigation_paradigm = this.is_blocked;
        builder.date_format = this.account_holder_token;
        builder.client_scenario = this.c4b_info;
        builder.time_format = this.subtitle;
        builder.ip_address = this.matched_sms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.region != null) {
            arrayList.add("region=██");
        }
        if (this.is_verified != null) {
            arrayList.add("is_verified=██");
        }
        if (this.is_business != null) {
            arrayList.add("is_business=██");
        }
        Long l = this.credit_card_fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("credit_card_fee_bps=", l, arrayList);
        }
        Metadata metadata = this.metadata;
        if (metadata != null) {
            arrayList.add("metadata=" + metadata);
        }
        Boolean bool = this.can_accept_payments;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_accept_payments=", bool, arrayList);
        }
        if (this.is_blocked != null) {
            arrayList.add("is_blocked=██");
        }
        String str2 = this.account_holder_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "account_holder_token=", arrayList);
        }
        C4bInfo c4bInfo = this.c4b_info;
        if (c4bInfo != null) {
            arrayList.add("c4b_info=" + c4bInfo);
        }
        if (this.subtitle != null) {
            arrayList.add("subtitle=██");
        }
        if (this.matched_sms != null) {
            arrayList.add("matched_sms=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientSelectorCustomer{", "}", 0, null, null, 56);
    }
}
