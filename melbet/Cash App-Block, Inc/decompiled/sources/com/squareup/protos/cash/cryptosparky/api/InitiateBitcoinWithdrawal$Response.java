package com.squareup.protos.cash.cryptosparky.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.SetGiftCardActiveResponse;
import com.squareup.protos.franklin.common.ResponseContext;
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
public final class InitiateBitcoinWithdrawal$Response extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateBitcoinWithdrawal$Response> CREATOR;
    public final ResponseContext response_context;

    static {
        InitiateBitcoinWithdrawal$Response$Companion$ADAPTER$1 initiateBitcoinWithdrawal$Response$Companion$ADAPTER$1 = new InitiateBitcoinWithdrawal$Response$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateBitcoinWithdrawal$Response.class), "type.googleapis.com/squareup.cash.cryptosparky.api.InitiateBitcoinWithdrawal.Response", Syntax.PROTO_2, null, "squareup/cash/cryptosparky/api/public.proto");
        ADAPTER = initiateBitcoinWithdrawal$Response$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateBitcoinWithdrawal$Response$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateBitcoinWithdrawal$Response(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateBitcoinWithdrawal$Response)) {
            return false;
        }
        InitiateBitcoinWithdrawal$Response initiateBitcoinWithdrawal$Response = (InitiateBitcoinWithdrawal$Response) obj;
        return Intrinsics.areEqual(unknownFields(), initiateBitcoinWithdrawal$Response.unknownFields()) && Intrinsics.areEqual(this.response_context, initiateBitcoinWithdrawal$Response.response_context);
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
        SetGiftCardActiveResponse.Builder builder = new SetGiftCardActiveResponse.Builder(1);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "Response{", "}", 0, null, null, 56);
    }
}
