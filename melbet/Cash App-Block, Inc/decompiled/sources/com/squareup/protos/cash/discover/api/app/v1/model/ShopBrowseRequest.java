package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.protos.cash.cashlimitsxp.api.v1.Empty;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopBrowseRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopBrowseRequest> CREATOR;

    static {
        ShopBrowseRequest$Companion$ADAPTER$1 shopBrowseRequest$Companion$ADAPTER$1 = new ShopBrowseRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopBrowseRequest.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.ShopBrowseRequest", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/preload_request_context.proto");
        ADAPTER = shopBrowseRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopBrowseRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopBrowseRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ShopBrowseRequest) && Intrinsics.areEqual(unknownFields(), ((ShopBrowseRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Empty.Builder builder = new Empty.Builder(25);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "ShopBrowseRequest{}";
    }
}
