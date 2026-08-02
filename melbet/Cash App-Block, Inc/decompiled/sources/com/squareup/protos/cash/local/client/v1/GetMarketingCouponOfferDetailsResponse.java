package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.resources.api.v1.StickerResource;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetMarketingCouponOfferDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/datadog/android/rum/internal/utils/RuntimeUtilsKt", "CouponOfferDetails", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMarketingCouponOfferDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMarketingCouponOfferDetailsResponse> CREATOR;
    public final RuntimeUtilsKt response;

    public final class CouponOfferDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CouponOfferDetails> CREATOR;
        public final Boolean all_products;
        public final String coupon_code;
        public final String display_subtitle;
        public final String display_title;
        public final List offer_lines;
        public final String redemption_instructions;
        public final String terms_text;
        public final String terms_url;
        public final String validity_text;

        public final class OfferLine extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OfferLine> CREATOR;
            public final String name;
            public final String token;

            static {
                GetMarketingCouponOfferDetailsResponse$CouponOfferDetails$OfferLine$Companion$ADAPTER$1 getMarketingCouponOfferDetailsResponse$CouponOfferDetails$OfferLine$Companion$ADAPTER$1 = new GetMarketingCouponOfferDetailsResponse$CouponOfferDetails$OfferLine$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferLine.class), "type.googleapis.com/squareup.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse.CouponOfferDetails.OfferLine", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
                ADAPTER = getMarketingCouponOfferDetailsResponse$CouponOfferDetails$OfferLine$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getMarketingCouponOfferDetailsResponse$CouponOfferDetails$OfferLine$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OfferLine(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.token = str;
                this.name = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof OfferLine)) {
                    return false;
                }
                OfferLine offerLine = (OfferLine) obj;
                return Intrinsics.areEqual(unknownFields(), offerLine.unknownFields()) && Intrinsics.areEqual(this.token, offerLine.token) && Intrinsics.areEqual(this.name, offerLine.name);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.name;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                FullName.Builder builder = new FullName.Builder(19);
                builder.given_name = this.token;
                builder.family_name = this.name;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
                }
                String str2 = this.name;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OfferLine{", "}", 0, null, null, 56);
            }
        }

        static {
            GetMarketingCouponOfferDetailsResponse$CouponOfferDetails$Companion$ADAPTER$1 getMarketingCouponOfferDetailsResponse$CouponOfferDetails$Companion$ADAPTER$1 = new GetMarketingCouponOfferDetailsResponse$CouponOfferDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CouponOfferDetails.class), "type.googleapis.com/squareup.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse.CouponOfferDetails", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getMarketingCouponOfferDetailsResponse$CouponOfferDetails$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getMarketingCouponOfferDetailsResponse$CouponOfferDetails$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CouponOfferDetails(String str, String str2, String str3, Boolean bool, List list, String str4, String str5, String str6, String str7, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.coupon_code = str;
            this.display_title = str2;
            this.display_subtitle = str3;
            this.all_products = bool;
            this.validity_text = str4;
            this.redemption_instructions = str5;
            this.terms_text = str6;
            this.terms_url = str7;
            this.offer_lines = TransactorKt.immutableCopyOf("offer_lines", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CouponOfferDetails)) {
                return false;
            }
            CouponOfferDetails couponOfferDetails = (CouponOfferDetails) obj;
            return Intrinsics.areEqual(unknownFields(), couponOfferDetails.unknownFields()) && Intrinsics.areEqual(this.coupon_code, couponOfferDetails.coupon_code) && Intrinsics.areEqual(this.display_title, couponOfferDetails.display_title) && Intrinsics.areEqual(this.display_subtitle, couponOfferDetails.display_subtitle) && Intrinsics.areEqual(this.all_products, couponOfferDetails.all_products) && Intrinsics.areEqual(this.offer_lines, couponOfferDetails.offer_lines) && Intrinsics.areEqual(this.validity_text, couponOfferDetails.validity_text) && Intrinsics.areEqual(this.redemption_instructions, couponOfferDetails.redemption_instructions) && Intrinsics.areEqual(this.terms_text, couponOfferDetails.terms_text) && Intrinsics.areEqual(this.terms_url, couponOfferDetails.terms_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.coupon_code;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.display_title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.display_subtitle;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Boolean bool = this.all_products;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.offer_lines);
            String str4 = this.validity_text;
            int hashCode5 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.redemption_instructions;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.terms_text;
            int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.terms_url;
            int hashCode8 = hashCode7 + (str7 != null ? str7.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            StickerResource.Builder builder = new StickerResource.Builder(1);
            builder.id = this.coupon_code;
            builder.svg_data = this.display_title;
            builder.name = this.display_subtitle;
            builder.is_active = this.all_products;
            builder.effects = this.offer_lines;
            builder.resourceSetToken = this.validity_text;
            builder.mainUrl = this.redemption_instructions;
            builder.previewUrl = this.terms_text;
            builder.accessibility_description = this.terms_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.coupon_code;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "coupon_code=", arrayList);
            }
            String str2 = this.display_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_title=", arrayList);
            }
            String str3 = this.display_subtitle;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_subtitle=", arrayList);
            }
            Boolean bool = this.all_products;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("all_products=", bool, arrayList);
            }
            List list = this.offer_lines;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("offer_lines=", arrayList, list);
            }
            String str4 = this.validity_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "validity_text=", arrayList);
            }
            String str5 = this.redemption_instructions;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "redemption_instructions=", arrayList);
            }
            String str6 = this.terms_text;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "terms_text=", arrayList);
            }
            String str7 = this.terms_url;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "terms_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CouponOfferDetails{", "}", 0, null, null, 56);
        }
    }

    static {
        GetMarketingCouponOfferDetailsResponse$Companion$ADAPTER$1 getMarketingCouponOfferDetailsResponse$Companion$ADAPTER$1 = new GetMarketingCouponOfferDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMarketingCouponOfferDetailsResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getMarketingCouponOfferDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMarketingCouponOfferDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMarketingCouponOfferDetailsResponse(RuntimeUtilsKt runtimeUtilsKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = runtimeUtilsKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMarketingCouponOfferDetailsResponse)) {
            return false;
        }
        GetMarketingCouponOfferDetailsResponse getMarketingCouponOfferDetailsResponse = (GetMarketingCouponOfferDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMarketingCouponOfferDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.response, getMarketingCouponOfferDetailsResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RuntimeUtilsKt runtimeUtilsKt = this.response;
        int hashCode2 = hashCode + (runtimeUtilsKt != null ? runtimeUtilsKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(4);
        builder.local_buyer = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RuntimeUtilsKt runtimeUtilsKt = this.response;
        if (runtimeUtilsKt != null) {
            arrayList.add("response=" + runtimeUtilsKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMarketingCouponOfferDetailsResponse{", "}", 0, null, null, 56);
    }
}
