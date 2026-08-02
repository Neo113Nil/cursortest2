package com.squareup.protos.moneta.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.balancemover.api.v1.SavingsCashInResponse;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.SetProfileBannerResponse;
import com.squareup.protos.cash.piggybank.appapi.GetOrCreateSavingsBalanceResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.InitiateInvestmentOrderResponse;
import com.squareup.protos.franklin.lending.TogglePrepurchaseAfterpayResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/moneta/api/CashInResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/moneta/api/CashInResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashInResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashInResponse> CREATOR;
    public final String passcode_token;
    public final ResponseContext response_context;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String passcode_token;
        public ResponseContext response_context;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new CashInResponse(this.response_context, this.passcode_token, buildUnknownFields());
                case 1:
                    return new com.squareup.cash.moneta.api.v1_0.CashInResponse(this.response_context, this.passcode_token, buildUnknownFields());
                case 2:
                    return new SavingsCashInResponse(this.response_context, this.passcode_token, buildUnknownFields());
                case 3:
                    return new SetProfileBannerResponse(this.response_context, this.passcode_token, buildUnknownFields());
                case 4:
                    return new GetOrCreateSavingsBalanceResponse(this.response_context, this.passcode_token, buildUnknownFields());
                case 5:
                    return new InitiateInvestmentOrderResponse(this.response_context, this.passcode_token, buildUnknownFields());
                default:
                    return new TogglePrepurchaseAfterpayResponse(this.response_context, this.passcode_token, buildUnknownFields());
            }
        }
    }

    static {
        CashInResponse$Companion$ADAPTER$1 cashInResponse$Companion$ADAPTER$1 = new CashInResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashInResponse.class), "type.googleapis.com/squareup.moneta.api.CashInResponse", Syntax.PROTO_2, null, "squareup/moneta/api/CashInResponseProto.proto");
        ADAPTER = cashInResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashInResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashInResponse(ResponseContext responseContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.passcode_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashInResponse)) {
            return false;
        }
        CashInResponse cashInResponse = (CashInResponse) obj;
        return Intrinsics.areEqual(unknownFields(), cashInResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, cashInResponse.response_context) && Intrinsics.areEqual(this.passcode_token, cashInResponse.passcode_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.passcode_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.response_context = this.response_context;
        builder.passcode_token = this.passcode_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashInResponse{", "}", 0, null, null, 56);
    }
}
