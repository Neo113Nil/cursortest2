package com.squareup.protos.cash.lynx.api.v1_0;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.TransferFundsResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/lynx/api/v1_0/CompleteStripeLinkResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/TransferFundsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompleteStripeLinkResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompleteStripeLinkResponse> CREATOR;
    public final String instrument_link_token;
    public final String instrument_token;
    public final ResponseContext response_context;

    static {
        CompleteStripeLinkResponse$Companion$ADAPTER$1 completeStripeLinkResponse$Companion$ADAPTER$1 = new CompleteStripeLinkResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompleteStripeLinkResponse.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.CompleteStripeLinkResponse", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/StripeBankLinking.proto");
        ADAPTER = completeStripeLinkResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(completeStripeLinkResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompleteStripeLinkResponse(ResponseContext responseContext, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_link_token = str;
        this.response_context = responseContext;
        this.instrument_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteStripeLinkResponse)) {
            return false;
        }
        CompleteStripeLinkResponse completeStripeLinkResponse = (CompleteStripeLinkResponse) obj;
        return Intrinsics.areEqual(unknownFields(), completeStripeLinkResponse.unknownFields()) && Intrinsics.areEqual(this.instrument_link_token, completeStripeLinkResponse.instrument_link_token) && Intrinsics.areEqual(this.response_context, completeStripeLinkResponse.response_context) && Intrinsics.areEqual(this.instrument_token, completeStripeLinkResponse.instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instrument_link_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = (hashCode2 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str2 = this.instrument_token;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        TransferFundsResponse.Builder builder = new TransferFundsResponse.Builder(1);
        builder.passcode_token = this.instrument_link_token;
        builder.response_context = this.response_context;
        builder.status_text = this.instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.instrument_link_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_link_token=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        String str2 = this.instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompleteStripeLinkResponse{", "}", 0, null, null, 56);
    }
}
