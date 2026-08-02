package com.squareup.protos.cash.janus.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/janus/api/GetLoginScenarioPlanResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/Card$CardPii$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetLoginScenarioPlanResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetLoginScenarioPlanResponse> CREATOR;
    public final String app_attest_challenge;
    public final String play_integrity_nonce;
    public final ResponseContext response_context;
    public final Status status;

    public enum Status implements WireEnum {
        FAILED(0),
        SUCCESS(1);

        public static final GetLoginScenarioPlanResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            Status status = FAILED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new GetLoginScenarioPlanResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return FAILED;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetLoginScenarioPlanResponse$Companion$ADAPTER$1 getLoginScenarioPlanResponse$Companion$ADAPTER$1 = new GetLoginScenarioPlanResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetLoginScenarioPlanResponse.class), "type.googleapis.com/squareup.cash.janus.api.GetLoginScenarioPlanResponse", Syntax.PROTO_2, null, "squareup/cash/janus/api/GetLoginScenarioPlan.proto");
        ADAPTER = getLoginScenarioPlanResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getLoginScenarioPlanResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLoginScenarioPlanResponse(Status status, ResponseContext responseContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.response_context = responseContext;
        this.play_integrity_nonce = str;
        this.app_attest_challenge = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetLoginScenarioPlanResponse)) {
            return false;
        }
        GetLoginScenarioPlanResponse getLoginScenarioPlanResponse = (GetLoginScenarioPlanResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getLoginScenarioPlanResponse.unknownFields()) && this.status == getLoginScenarioPlanResponse.status && Intrinsics.areEqual(this.response_context, getLoginScenarioPlanResponse.response_context) && Intrinsics.areEqual(this.play_integrity_nonce, getLoginScenarioPlanResponse.play_integrity_nonce) && Intrinsics.areEqual(this.app_attest_challenge, getLoginScenarioPlanResponse.app_attest_challenge);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = (hashCode2 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.play_integrity_nonce;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.app_attest_challenge;
        int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(25, false);
        builder.expiration = this.status;
        builder.ciphertext_ = this.response_context;
        builder.postal_code = this.play_integrity_nonce;
        builder.last_four_digits = this.app_attest_challenge;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        String str = this.play_integrity_nonce;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "play_integrity_nonce=", arrayList);
        }
        String str2 = this.app_attest_challenge;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "app_attest_challenge=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetLoginScenarioPlanResponse{", "}", 0, null, null, 56);
    }
}
