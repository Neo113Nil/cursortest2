package com.squareup.protos.cash.cashsourceoffunds.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.composer.app.Card;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashsourceoffunds/api/v1/DismissLimitsPageletMessageResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/composer/app/Card$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DismissLimitsPageletMessageResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DismissLimitsPageletMessageResponse> CREATOR;
    public final ResponseContext response;
    public final ResponseContext response_context;

    static {
        DismissLimitsPageletMessageResponse$Companion$ADAPTER$1 dismissLimitsPageletMessageResponse$Companion$ADAPTER$1 = new DismissLimitsPageletMessageResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DismissLimitsPageletMessageResponse.class), "type.googleapis.com/squareup.cash.cashsourceoffunds.api.v1.DismissLimitsPageletMessageResponse", Syntax.PROTO_2, null, "squareup/cash/cashsourceoffunds/api/v1/dismiss_limits_pagelet_message.proto");
        ADAPTER = dismissLimitsPageletMessageResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dismissLimitsPageletMessageResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissLimitsPageletMessageResponse(ResponseContext responseContext, ResponseContext responseContext2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = responseContext;
        this.response_context = responseContext2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DismissLimitsPageletMessageResponse)) {
            return false;
        }
        DismissLimitsPageletMessageResponse dismissLimitsPageletMessageResponse = (DismissLimitsPageletMessageResponse) obj;
        return Intrinsics.areEqual(unknownFields(), dismissLimitsPageletMessageResponse.unknownFields()) && Intrinsics.areEqual(this.response, dismissLimitsPageletMessageResponse.response) && Intrinsics.areEqual(this.response_context, dismissLimitsPageletMessageResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        ResponseContext responseContext2 = this.response_context;
        int hashCode3 = hashCode2 + (responseContext2 != null ? responseContext2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(7);
        builder.image_url = this.response;
        builder.asset = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response=", responseContext, arrayList);
        }
        ResponseContext responseContext2 = this.response_context;
        if (responseContext2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DismissLimitsPageletMessageResponse{", "}", 0, null, null, 56);
    }
}
