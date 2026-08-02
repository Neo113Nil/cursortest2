package com.squareup.protos.cash.requirements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.franklin.accounts.AddressSource;
import com.squareup.protos.franklin.lending.Loan;
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
public final class SetAddressRequirementData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetAddressRequirementData> CREATOR;
    public final AddressCollectionValidationPolicy address_collection_validation_policy;
    public final AddressSource address_source_to_collect;
    public final ClientInfo client_info;
    public final Boolean force_set_address;
    public final String hint_text;
    public final String main_text;
    public final String parent_flow;
    public final String prefill_address_token;
    public final String region;
    public final Boolean requires_city;
    public final Boolean requires_postal_code;
    public final Boolean requires_state;
    public final Boolean requires_street_address;
    public final String sub_text;

    static {
        SetAddressRequirementData$Companion$ADAPTER$1 setAddressRequirementData$Companion$ADAPTER$1 = new SetAddressRequirementData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetAddressRequirementData.class), "type.googleapis.com/squareup.cash.requirements.SetAddressRequirementData", Syntax.PROTO_2, null, "squareup/cash/requirements/SetAddressRequirement.proto");
        ADAPTER = setAddressRequirementData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setAddressRequirementData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAddressRequirementData(ClientInfo clientInfo, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, Boolean bool5, String str2, String str3, String str4, AddressSource addressSource, AddressCollectionValidationPolicy addressCollectionValidationPolicy, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_info = clientInfo;
        this.requires_street_address = bool;
        this.requires_state = bool2;
        this.requires_city = bool3;
        this.requires_postal_code = bool4;
        this.region = str;
        this.force_set_address = bool5;
        this.main_text = str2;
        this.sub_text = str3;
        this.hint_text = str4;
        this.address_source_to_collect = addressSource;
        this.address_collection_validation_policy = addressCollectionValidationPolicy;
        this.prefill_address_token = str5;
        this.parent_flow = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetAddressRequirementData)) {
            return false;
        }
        SetAddressRequirementData setAddressRequirementData = (SetAddressRequirementData) obj;
        return Intrinsics.areEqual(unknownFields(), setAddressRequirementData.unknownFields()) && Intrinsics.areEqual(this.client_info, setAddressRequirementData.client_info) && Intrinsics.areEqual(this.requires_street_address, setAddressRequirementData.requires_street_address) && Intrinsics.areEqual(this.requires_state, setAddressRequirementData.requires_state) && Intrinsics.areEqual(this.requires_city, setAddressRequirementData.requires_city) && Intrinsics.areEqual(this.requires_postal_code, setAddressRequirementData.requires_postal_code) && Intrinsics.areEqual(this.region, setAddressRequirementData.region) && Intrinsics.areEqual(this.force_set_address, setAddressRequirementData.force_set_address) && Intrinsics.areEqual(this.main_text, setAddressRequirementData.main_text) && Intrinsics.areEqual(this.sub_text, setAddressRequirementData.sub_text) && Intrinsics.areEqual(this.hint_text, setAddressRequirementData.hint_text) && this.address_source_to_collect == setAddressRequirementData.address_source_to_collect && this.address_collection_validation_policy == setAddressRequirementData.address_collection_validation_policy && Intrinsics.areEqual(this.prefill_address_token, setAddressRequirementData.prefill_address_token) && Intrinsics.areEqual(this.parent_flow, setAddressRequirementData.parent_flow);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClientInfo clientInfo = this.client_info;
        int hashCode2 = (hashCode + (clientInfo != null ? clientInfo.hashCode() : 0)) * 37;
        Boolean bool = this.requires_street_address;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.requires_state;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.requires_city;
        int hashCode5 = (hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.requires_postal_code;
        int hashCode6 = (hashCode5 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str = this.region;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool5 = this.force_set_address;
        int hashCode8 = (hashCode7 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        String str2 = this.main_text;
        int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.sub_text;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.hint_text;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 37;
        AddressSource addressSource = this.address_source_to_collect;
        int hashCode12 = (hashCode11 + (addressSource != null ? addressSource.hashCode() : 0)) * 37;
        AddressCollectionValidationPolicy addressCollectionValidationPolicy = this.address_collection_validation_policy;
        int hashCode13 = (hashCode12 + (addressCollectionValidationPolicy != null ? addressCollectionValidationPolicy.hashCode() : 0)) * 37;
        String str5 = this.prefill_address_token;
        int hashCode14 = (hashCode13 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.parent_flow;
        int hashCode15 = hashCode14 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(10);
        builder.borrowed_at = this.client_info;
        builder.due_at = this.requires_street_address;
        builder.principal_amount = this.requires_state;
        builder.setup_fee_amount = this.requires_city;
        builder.outstanding_amount = this.requires_postal_code;
        builder.token = this.region;
        builder.late_fee_amount = this.force_set_address;
        builder.credit_line_token = this.main_text;
        builder.interest_amount = this.sub_text;
        builder.setup_fee_bps = this.hint_text;
        builder.detail_rows = this.address_source_to_collect;
        builder.state = this.address_collection_validation_policy;
        builder.lending_product = this.prefill_address_token;
        builder.bnpl_data = this.parent_flow;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClientInfo clientInfo = this.client_info;
        if (clientInfo != null) {
            arrayList.add("client_info=" + clientInfo);
        }
        Boolean bool = this.requires_street_address;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_street_address=", bool, arrayList);
        }
        Boolean bool2 = this.requires_state;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_state=", bool2, arrayList);
        }
        Boolean bool3 = this.requires_city;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_city=", bool3, arrayList);
        }
        Boolean bool4 = this.requires_postal_code;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_postal_code=", bool4, arrayList);
        }
        String str = this.region;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "region=", arrayList);
        }
        Boolean bool5 = this.force_set_address;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("force_set_address=", bool5, arrayList);
        }
        String str2 = this.main_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_text=", arrayList);
        }
        String str3 = this.sub_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "sub_text=", arrayList);
        }
        String str4 = this.hint_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "hint_text=", arrayList);
        }
        AddressSource addressSource = this.address_source_to_collect;
        if (addressSource != null) {
            arrayList.add("address_source_to_collect=" + addressSource);
        }
        AddressCollectionValidationPolicy addressCollectionValidationPolicy = this.address_collection_validation_policy;
        if (addressCollectionValidationPolicy != null) {
            arrayList.add("address_collection_validation_policy=" + addressCollectionValidationPolicy);
        }
        String str5 = this.prefill_address_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "prefill_address_token=", arrayList);
        }
        String str6 = this.parent_flow;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "parent_flow=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAddressRequirementData{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SetAddressRequirementData(Boolean bool, AddressSource addressSource) {
        this(null, null, null, null, null, null, bool, null, null, null, addressSource, null, null, null, ByteString.EMPTY);
    }
}
