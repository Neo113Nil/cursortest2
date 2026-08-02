package com.squareup.protos.cash.moneta.api.v1_0;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzka;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.common.Header;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class SelectInstrumentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectInstrumentRequest> CREATOR;
    public final zzka additional_params;
    public final ByteString encoded_selected_option;
    public final RequestContext request_context;

    public final class ApplePayPayload extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ApplePayPayload> CREATOR;
        public final String data;
        public final Header header;
        public final String signature;
        public final String version;

        public final class Header extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Header> CREATOR;
            public final String application_data;
            public final String ephemeral_public_key;
            public final String public_key_hash;
            public final String transaction_id;
            public final String wrapped_key;

            static {
                SelectInstrumentRequest$ApplePayPayload$Header$Companion$ADAPTER$1 selectInstrumentRequest$ApplePayPayload$Header$Companion$ADAPTER$1 = new SelectInstrumentRequest$ApplePayPayload$Header$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Header.class), "type.googleapis.com/squareup.cash.moneta.api.v1_0.SelectInstrumentRequest.ApplePayPayload.Header", Syntax.PROTO_2, null, "squareup/cash/moneta/api/v1_0/plasma/app.proto");
                ADAPTER = selectInstrumentRequest$ApplePayPayload$Header$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(selectInstrumentRequest$ApplePayPayload$Header$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Header(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.application_data = str;
                this.ephemeral_public_key = str2;
                this.wrapped_key = str3;
                this.public_key_hash = str4;
                this.transaction_id = str5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Header)) {
                    return false;
                }
                Header header = (Header) obj;
                return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.application_data, header.application_data) && Intrinsics.areEqual(this.ephemeral_public_key, header.ephemeral_public_key) && Intrinsics.areEqual(this.wrapped_key, header.wrapped_key) && Intrinsics.areEqual(this.public_key_hash, header.public_key_hash) && Intrinsics.areEqual(this.transaction_id, header.transaction_id);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.application_data;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.ephemeral_public_key;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.wrapped_key;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.public_key_hash;
                int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
                String str5 = this.transaction_id;
                int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ProfileRow.Builder builder = new ProfileRow.Builder(7);
                builder.client_route = this.application_data;
                builder.icon_id = this.ephemeral_public_key;
                builder.title = this.wrapped_key;
                builder.subtitle = this.public_key_hash;
                builder.call_to_action = this.transaction_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.application_data;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "application_data=", arrayList);
                }
                String str2 = this.ephemeral_public_key;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ephemeral_public_key=", arrayList);
                }
                String str3 = this.wrapped_key;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "wrapped_key=", arrayList);
                }
                String str4 = this.public_key_hash;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "public_key_hash=", arrayList);
                }
                String str5 = this.transaction_id;
                if (str5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "transaction_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56);
            }
        }

        static {
            SelectInstrumentRequest$ApplePayPayload$Companion$ADAPTER$1 selectInstrumentRequest$ApplePayPayload$Companion$ADAPTER$1 = new SelectInstrumentRequest$ApplePayPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ApplePayPayload.class), "type.googleapis.com/squareup.cash.moneta.api.v1_0.SelectInstrumentRequest.ApplePayPayload", Syntax.PROTO_2, null, "squareup/cash/moneta/api/v1_0/plasma/app.proto");
            ADAPTER = selectInstrumentRequest$ApplePayPayload$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectInstrumentRequest$ApplePayPayload$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplePayPayload(String str, Header header, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.data = str;
            this.header = header;
            this.signature = str2;
            this.version = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ApplePayPayload)) {
                return false;
            }
            ApplePayPayload applePayPayload = (ApplePayPayload) obj;
            return Intrinsics.areEqual(unknownFields(), applePayPayload.unknownFields()) && Intrinsics.areEqual(this.data, applePayPayload.data) && Intrinsics.areEqual(this.header, applePayPayload.header) && Intrinsics.areEqual(this.signature, applePayPayload.signature) && Intrinsics.areEqual(this.version, applePayPayload.version);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.data;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Header header = this.header;
            int hashCode3 = (hashCode2 + (header != null ? header.hashCode() : 0)) * 37;
            String str2 = this.signature;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.version;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCard.Builder builder = new GiftCard.Builder(25, false);
            builder.id = this.data;
            builder.gift_card_amount = this.header;
            builder.last_4 = this.signature;
            builder.gift_card_id = this.version;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.data;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "data=", arrayList);
            }
            Header header = this.header;
            if (header != null) {
                arrayList.add("header=" + header);
            }
            String str2 = this.signature;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "signature=", arrayList);
            }
            String str3 = this.version;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "version=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ApplePayPayload{", "}", 0, null, null, 56);
        }
    }

    public final class GooglePayPayload extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GooglePayPayload> CREATOR;
        public final String idempotence_token;
        public final String token;

        static {
            SelectInstrumentRequest$GooglePayPayload$Companion$ADAPTER$1 selectInstrumentRequest$GooglePayPayload$Companion$ADAPTER$1 = new SelectInstrumentRequest$GooglePayPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GooglePayPayload.class), "type.googleapis.com/squareup.cash.moneta.api.v1_0.SelectInstrumentRequest.GooglePayPayload", Syntax.PROTO_2, null, "squareup/cash/moneta/api/v1_0/plasma/app.proto");
            ADAPTER = selectInstrumentRequest$GooglePayPayload$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectInstrumentRequest$GooglePayPayload$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePayPayload(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.idempotence_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GooglePayPayload)) {
                return false;
            }
            GooglePayPayload googlePayPayload = (GooglePayPayload) obj;
            return Intrinsics.areEqual(unknownFields(), googlePayPayload.unknownFields()) && Intrinsics.areEqual(this.token, googlePayPayload.token) && Intrinsics.areEqual(this.idempotence_token, googlePayPayload.idempotence_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.idempotence_token;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(2);
            builder.name = this.token;
            builder.value = this.idempotence_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            String str2 = this.idempotence_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "idempotence_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GooglePayPayload{", "}", 0, null, null, 56);
        }
    }

    static {
        SelectInstrumentRequest$Companion$ADAPTER$1 selectInstrumentRequest$Companion$ADAPTER$1 = new SelectInstrumentRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectInstrumentRequest.class), "type.googleapis.com/squareup.cash.moneta.api.v1_0.SelectInstrumentRequest", Syntax.PROTO_2, null, "squareup/cash/moneta/api/v1_0/plasma/app.proto");
        ADAPTER = selectInstrumentRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(selectInstrumentRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectInstrumentRequest(RequestContext requestContext, ByteString byteString, zzka zzkaVar, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.request_context = requestContext;
        this.encoded_selected_option = byteString;
        this.additional_params = zzkaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectInstrumentRequest)) {
            return false;
        }
        SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectInstrumentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectInstrumentRequest.request_context) && Intrinsics.areEqual(this.encoded_selected_option, selectInstrumentRequest.encoded_selected_option) && Intrinsics.areEqual(this.additional_params, selectInstrumentRequest.additional_params);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        ByteString byteString = this.encoded_selected_option;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        zzka zzkaVar = this.additional_params;
        int hashCode4 = hashCode3 + (zzkaVar != null ? zzkaVar.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(18, false);
        builder.transmission_level = this.request_context;
        builder.advertisement_data = this.encoded_selected_option;
        builder.frequency = this.additional_params;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        ByteString byteString = this.encoded_selected_option;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("encoded_selected_option=", byteString, arrayList);
        }
        zzka zzkaVar = this.additional_params;
        if (zzkaVar != null) {
            arrayList.add("additional_params=" + zzkaVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectInstrumentRequest{", "}", 0, null, null, 56);
    }
}
