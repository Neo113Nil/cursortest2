package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.OpenTaxHubResponse;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/OverflowOptionPickerResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/OpenTaxHubResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OverflowOptionPickerResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OverflowOptionPickerResponse> CREATOR;
    public final ResponseContext response_context;

    static {
        OverflowOptionPickerResponse$Companion$ADAPTER$1 overflowOptionPickerResponse$Companion$ADAPTER$1 = new OverflowOptionPickerResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OverflowOptionPickerResponse.class), "type.googleapis.com/squareup.franklin.app.OverflowOptionPickerResponse", Syntax.PROTO_2, null, "squareup/franklin/app/overflow_option_picker.proto");
        ADAPTER = overflowOptionPickerResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(overflowOptionPickerResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowOptionPickerResponse(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverflowOptionPickerResponse)) {
            return false;
        }
        OverflowOptionPickerResponse overflowOptionPickerResponse = (OverflowOptionPickerResponse) obj;
        return Intrinsics.areEqual(unknownFields(), overflowOptionPickerResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, overflowOptionPickerResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = hashCode + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpenTaxHubResponse.Builder builder = new OpenTaxHubResponse.Builder(26);
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OverflowOptionPickerResponse{", "}", 0, null, null, 56);
    }
}
