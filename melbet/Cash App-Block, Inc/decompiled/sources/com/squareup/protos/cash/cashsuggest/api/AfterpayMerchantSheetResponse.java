package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/AfterpayMerchantSheetResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AfterpayMerchantSheetResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayMerchantSheetResponse> CREATOR;
    public final Long expire_at_ms;
    public final AfterpayMerchantSheet sheet;

    static {
        AfterpayMerchantSheetResponse$Companion$ADAPTER$1 afterpayMerchantSheetResponse$Companion$ADAPTER$1 = new AfterpayMerchantSheetResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayMerchantSheetResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayMerchantSheetResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpaySheet.proto");
        ADAPTER = afterpayMerchantSheetResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayMerchantSheetResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayMerchantSheetResponse(AfterpayMerchantSheet afterpayMerchantSheet, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sheet = afterpayMerchantSheet;
        this.expire_at_ms = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayMerchantSheetResponse)) {
            return false;
        }
        AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayMerchantSheetResponse.unknownFields()) && Intrinsics.areEqual(this.sheet, afterpayMerchantSheetResponse.sheet) && Intrinsics.areEqual(this.expire_at_ms, afterpayMerchantSheetResponse.expire_at_ms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AfterpayMerchantSheet afterpayMerchantSheet = this.sheet;
        int hashCode2 = (hashCode + (afterpayMerchantSheet != null ? afterpayMerchantSheet.hashCode() : 0)) * 37;
        Long l = this.expire_at_ms;
        int hashCode3 = hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(14);
        builder.image_url = this.sheet;
        builder.asset = this.expire_at_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AfterpayMerchantSheet afterpayMerchantSheet = this.sheet;
        if (afterpayMerchantSheet != null) {
            arrayList.add("sheet=" + afterpayMerchantSheet);
        }
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayMerchantSheetResponse{", "}", 0, null, null, 56);
    }
}
