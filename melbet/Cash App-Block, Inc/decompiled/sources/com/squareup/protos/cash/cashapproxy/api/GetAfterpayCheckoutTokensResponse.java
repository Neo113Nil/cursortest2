package com.squareup.protos.cash.cashapproxy.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.protos.franklin.common.Stamp;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cashapproxy/api/GetAfterpayCheckoutTokensResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/TrustsData$Builder;", "Builder", "CheckoutToken", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAfterpayCheckoutTokensResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAfterpayCheckoutTokensResponse> CREATOR;
    public final List tokens;

    public final class CheckoutToken extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CheckoutToken> CREATOR;
        public final String domain;
        public final Integer expires_in_seconds;
        public final String name;
        public final String token;

        static {
            GetAfterpayCheckoutTokensResponse$CheckoutToken$Companion$ADAPTER$1 getAfterpayCheckoutTokensResponse$CheckoutToken$Companion$ADAPTER$1 = new GetAfterpayCheckoutTokensResponse$CheckoutToken$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckoutToken.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.GetAfterpayCheckoutTokensResponse.CheckoutToken", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_tokens.proto");
            ADAPTER = getAfterpayCheckoutTokensResponse$CheckoutToken$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getAfterpayCheckoutTokensResponse$CheckoutToken$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckoutToken(Integer num, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.expires_in_seconds = num;
            this.name = str2;
            this.domain = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckoutToken)) {
                return false;
            }
            CheckoutToken checkoutToken = (CheckoutToken) obj;
            return Intrinsics.areEqual(unknownFields(), checkoutToken.unknownFields()) && Intrinsics.areEqual(this.token, checkoutToken.token) && Intrinsics.areEqual(this.expires_in_seconds, checkoutToken.expires_in_seconds) && Intrinsics.areEqual(this.name, checkoutToken.name) && Intrinsics.areEqual(this.domain, checkoutToken.domain);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.expires_in_seconds;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            String str2 = this.name;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.domain;
            int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Stamp.Builder builder = new Stamp.Builder(1);
            builder.name = this.token;
            builder.min_scale = this.expires_in_seconds;
            builder.accessibility_text = this.name;
            builder.svg = this.domain;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            Integer num = this.expires_in_seconds;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("expires_in_seconds=", num, arrayList);
            }
            String str2 = this.name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
            }
            String str3 = this.domain;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "domain=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CheckoutToken{", "}", 0, null, null, 56);
        }
    }

    static {
        GetAfterpayCheckoutTokensResponse$Companion$ADAPTER$1 getAfterpayCheckoutTokensResponse$Companion$ADAPTER$1 = new GetAfterpayCheckoutTokensResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAfterpayCheckoutTokensResponse.class), "type.googleapis.com/squareup.cash.cashapproxy.api.v1.GetAfterpayCheckoutTokensResponse", Syntax.PROTO_2, null, "squareup/cash/cashapproxy/api/v1/afterpay_tokens.proto");
        ADAPTER = getAfterpayCheckoutTokensResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAfterpayCheckoutTokensResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAfterpayCheckoutTokensResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.tokens = TransactorKt.immutableCopyOf("tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAfterpayCheckoutTokensResponse)) {
            return false;
        }
        GetAfterpayCheckoutTokensResponse getAfterpayCheckoutTokensResponse = (GetAfterpayCheckoutTokensResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAfterpayCheckoutTokensResponse.unknownFields()) && Intrinsics.areEqual(this.tokens, getAfterpayCheckoutTokensResponse.tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.tokens.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TrustsData.Builder builder = new TrustsData.Builder(1);
        builder.trust = this.tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tokens;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAfterpayCheckoutTokensResponse{", "}", 0, null, null, 56);
    }
}
