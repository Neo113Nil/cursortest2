package com.squareup.protos.cash.cryptosparky.api.deposits;

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
public final class RefreshInvoice$Response extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshInvoice$Response> CREATOR;
    public final ResponseContext response_context;

    static {
        RefreshInvoice$Response$Companion$ADAPTER$1 refreshInvoice$Response$Companion$ADAPTER$1 = new RefreshInvoice$Response$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RefreshInvoice$Response.class), "type.googleapis.com/squareup.cash.cryptosparky.api.deposits.RefreshInvoice.Response", Syntax.PROTO_2, null, "squareup/cash/cryptosparky/api/deposits/public.proto");
        ADAPTER = refreshInvoice$Response$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(refreshInvoice$Response$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshInvoice$Response(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshInvoice$Response)) {
            return false;
        }
        RefreshInvoice$Response refreshInvoice$Response = (RefreshInvoice$Response) obj;
        return Intrinsics.areEqual(unknownFields(), refreshInvoice$Response.unknownFields()) && Intrinsics.areEqual(this.response_context, refreshInvoice$Response.response_context);
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
        SetGiftCardActiveResponse.Builder builder = new SetGiftCardActiveResponse.Builder(2);
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
