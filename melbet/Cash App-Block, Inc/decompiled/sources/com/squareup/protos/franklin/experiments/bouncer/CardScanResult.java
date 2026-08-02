package com.squareup.protos.franklin.experiments.bouncer;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes8.dex */
public final class CardScanResult extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardScanResult> CREATOR;
    public final String cardholder_name;
    public final String cvv;
    public final String encrypted_bouncer_payload;
    public final String expiry_day;
    public final String expiry_month;
    public final String expiry_year;
    public final Boolean mobile_is_card_valid;
    public final String mobile_validation_failure_reason;
    public final String pan;
    public final String payload_version;
    public final String postal_code;
    public final ByteString scanned_image;

    static {
        CardScanResult$Companion$ADAPTER$1 cardScanResult$Companion$ADAPTER$1 = new CardScanResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardScanResult.class), "type.googleapis.com/squareup.franklin.experiments.bouncer.CardScanResult", Syntax.PROTO_2, null, "squareup/franklin/experiments/bouncer.proto");
        ADAPTER = cardScanResult$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardScanResult$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScanResult(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, String str7, String str8, String str9, Boolean bool, String str10, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.pan = str;
        this.expiry_day = str2;
        this.expiry_month = str3;
        this.expiry_year = str4;
        this.cvv = str5;
        this.cardholder_name = str6;
        this.scanned_image = byteString;
        this.encrypted_bouncer_payload = str7;
        this.payload_version = str8;
        this.postal_code = str9;
        this.mobile_is_card_valid = bool;
        this.mobile_validation_failure_reason = str10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardScanResult)) {
            return false;
        }
        CardScanResult cardScanResult = (CardScanResult) obj;
        return Intrinsics.areEqual(unknownFields(), cardScanResult.unknownFields()) && Intrinsics.areEqual(this.pan, cardScanResult.pan) && Intrinsics.areEqual(this.expiry_day, cardScanResult.expiry_day) && Intrinsics.areEqual(this.expiry_month, cardScanResult.expiry_month) && Intrinsics.areEqual(this.expiry_year, cardScanResult.expiry_year) && Intrinsics.areEqual(this.cvv, cardScanResult.cvv) && Intrinsics.areEqual(this.cardholder_name, cardScanResult.cardholder_name) && Intrinsics.areEqual(this.scanned_image, cardScanResult.scanned_image) && Intrinsics.areEqual(this.encrypted_bouncer_payload, cardScanResult.encrypted_bouncer_payload) && Intrinsics.areEqual(this.payload_version, cardScanResult.payload_version) && Intrinsics.areEqual(this.postal_code, cardScanResult.postal_code) && Intrinsics.areEqual(this.mobile_is_card_valid, cardScanResult.mobile_is_card_valid) && Intrinsics.areEqual(this.mobile_validation_failure_reason, cardScanResult.mobile_validation_failure_reason);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.pan;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.expiry_day;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.expiry_month;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.expiry_year;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.cvv;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.cardholder_name;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        ByteString byteString = this.scanned_image;
        int hashCode8 = (hashCode7 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str7 = this.encrypted_bouncer_payload;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.payload_version;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.postal_code;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Boolean bool = this.mobile_is_card_valid;
        int hashCode12 = (hashCode11 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str10 = this.mobile_validation_failure_reason;
        int hashCode13 = hashCode12 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(24, false);
        builder.string_literal = this.pan;
        builder.key_path_ref = this.expiry_day;
        builder.int_literal = this.expiry_month;
        builder.float_literal = this.expiry_year;
        builder.unary_op = this.cvv;
        builder.binary_op = this.cardholder_name;
        builder.blob_literal = this.scanned_image;
        builder.conditional_op = this.encrypted_bouncer_payload;
        builder.filter_op = this.payload_version;
        builder.collection_literal = this.postal_code;
        builder.bool_literal = this.mobile_is_card_valid;
        builder.format_string_op = this.mobile_validation_failure_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.pan != null) {
            arrayList.add("pan=██");
        }
        if (this.expiry_day != null) {
            arrayList.add("expiry_day=██");
        }
        if (this.expiry_month != null) {
            arrayList.add("expiry_month=██");
        }
        if (this.expiry_year != null) {
            arrayList.add("expiry_year=██");
        }
        if (this.cvv != null) {
            arrayList.add("cvv=██");
        }
        if (this.cardholder_name != null) {
            arrayList.add("cardholder_name=██");
        }
        if (this.scanned_image != null) {
            arrayList.add("scanned_image=██");
        }
        if (this.encrypted_bouncer_payload != null) {
            arrayList.add("encrypted_bouncer_payload=██");
        }
        String str = this.payload_version;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payload_version=", arrayList);
        }
        if (this.postal_code != null) {
            arrayList.add("postal_code=██");
        }
        Boolean bool = this.mobile_is_card_valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("mobile_is_card_valid=", bool, arrayList);
        }
        String str2 = this.mobile_validation_failure_reason;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "mobile_validation_failure_reason=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardScanResult{", "}", 0, null, null, 56);
    }
}
