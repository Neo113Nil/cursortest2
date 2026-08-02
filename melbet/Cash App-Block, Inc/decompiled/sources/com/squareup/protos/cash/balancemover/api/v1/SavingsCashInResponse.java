package com.squareup.protos.cash.balancemover.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.moneta.api.CashInResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/balancemover/api/v1/SavingsCashInResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/moneta/api/CashInResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavingsCashInResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsCashInResponse> CREATOR;
    public final String passcode_token;
    public final ResponseContext response_context;

    static {
        SavingsCashInResponse$Companion$ADAPTER$1 savingsCashInResponse$Companion$ADAPTER$1 = new SavingsCashInResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsCashInResponse.class), "type.googleapis.com/squareup.cash.balancemover.api.v1.SavingsCashInResponse", Syntax.PROTO_2, null, "squareup/cash/balancemover/api/v1/savings_cash_in.proto");
        ADAPTER = savingsCashInResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsCashInResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsCashInResponse(ResponseContext responseContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.passcode_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsCashInResponse)) {
            return false;
        }
        SavingsCashInResponse savingsCashInResponse = (SavingsCashInResponse) obj;
        return Intrinsics.areEqual(unknownFields(), savingsCashInResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, savingsCashInResponse.response_context) && Intrinsics.areEqual(this.passcode_token, savingsCashInResponse.passcode_token);
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
        CashInResponse.Builder builder = new CashInResponse.Builder(2);
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
        String str = this.passcode_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "passcode_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsCashInResponse{", "}", 0, null, null, 56);
    }
}
