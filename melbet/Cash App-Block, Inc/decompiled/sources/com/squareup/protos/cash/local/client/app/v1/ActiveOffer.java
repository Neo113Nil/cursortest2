package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

/* loaded from: classes7.dex */
public final class ActiveOffer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActiveOffer> CREATOR;
    public final String buyer_offer_token;
    public final String custom_discount_code;
    public final Long discount_amount_cents;
    public final Integer discount_bps;
    public final String discount_code;
    public final Long ends_at;
    public final Long max_discount_amount_cents;
    public final String offer_token;
    public final String offer_type;
    public final Long starts_at;
    public final String subject_token;
    public final String subject_type;

    static {
        ActiveOffer$Companion$ADAPTER$1 activeOffer$Companion$ADAPTER$1 = new ActiveOffer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActiveOffer.class), "type.googleapis.com/squareup.cash.local.client.app.v1.ActiveOffer", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = activeOffer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activeOffer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOffer(String str, String str2, String str3, String str4, Long l, Long l2, String str5, String str6, String str7, Long l3, Integer num, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.offer_token = str;
        this.subject_type = str2;
        this.subject_token = str3;
        this.offer_type = str4;
        this.starts_at = l;
        this.ends_at = l2;
        this.buyer_offer_token = str5;
        this.discount_code = str6;
        this.custom_discount_code = str7;
        this.discount_amount_cents = l3;
        this.discount_bps = num;
        this.max_discount_amount_cents = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActiveOffer)) {
            return false;
        }
        ActiveOffer activeOffer = (ActiveOffer) obj;
        return Intrinsics.areEqual(unknownFields(), activeOffer.unknownFields()) && Intrinsics.areEqual(this.offer_token, activeOffer.offer_token) && Intrinsics.areEqual(this.subject_type, activeOffer.subject_type) && Intrinsics.areEqual(this.subject_token, activeOffer.subject_token) && Intrinsics.areEqual(this.offer_type, activeOffer.offer_type) && Intrinsics.areEqual(this.starts_at, activeOffer.starts_at) && Intrinsics.areEqual(this.ends_at, activeOffer.ends_at) && Intrinsics.areEqual(this.buyer_offer_token, activeOffer.buyer_offer_token) && Intrinsics.areEqual(this.discount_code, activeOffer.discount_code) && Intrinsics.areEqual(this.custom_discount_code, activeOffer.custom_discount_code) && Intrinsics.areEqual(this.discount_amount_cents, activeOffer.discount_amount_cents) && Intrinsics.areEqual(this.discount_bps, activeOffer.discount_bps) && Intrinsics.areEqual(this.max_discount_amount_cents, activeOffer.max_discount_amount_cents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.offer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subject_type;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subject_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.offer_type;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.starts_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.ends_at;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str5 = this.buyer_offer_token;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.discount_code;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.custom_discount_code;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Long l3 = this.discount_amount_cents;
        int hashCode11 = (hashCode10 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Integer num = this.discount_bps;
        int hashCode12 = (hashCode11 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l4 = this.max_discount_amount_cents;
        int hashCode13 = hashCode12 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(10, false);
        builder.string_literal = this.offer_token;
        builder.key_path_ref = this.subject_type;
        builder.float_literal = this.subject_token;
        builder.bool_literal = this.offer_type;
        builder.int_literal = this.starts_at;
        builder.blob_literal = this.ends_at;
        builder.unary_op = this.buyer_offer_token;
        builder.binary_op = this.discount_code;
        builder.conditional_op = this.custom_discount_code;
        builder.filter_op = this.discount_amount_cents;
        builder.collection_literal = this.discount_bps;
        builder.format_string_op = this.max_discount_amount_cents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.offer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "offer_token=", arrayList);
        }
        String str2 = this.subject_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subject_type=", arrayList);
        }
        String str3 = this.subject_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subject_token=", arrayList);
        }
        String str4 = this.offer_type;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "offer_type=", arrayList);
        }
        Long l = this.starts_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("starts_at=", l, arrayList);
        }
        Long l2 = this.ends_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ends_at=", l2, arrayList);
        }
        String str5 = this.buyer_offer_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "buyer_offer_token=", arrayList);
        }
        String str6 = this.discount_code;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "discount_code=", arrayList);
        }
        String str7 = this.custom_discount_code;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "custom_discount_code=", arrayList);
        }
        Long l3 = this.discount_amount_cents;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_amount_cents=", l3, arrayList);
        }
        Integer num = this.discount_bps;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("discount_bps=", num, arrayList);
        }
        Long l4 = this.max_discount_amount_cents;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("max_discount_amount_cents=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActiveOffer{", "}", 0, null, null, 56);
    }
}
