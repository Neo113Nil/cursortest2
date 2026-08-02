package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
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
public final class ShopDynamicScreenRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopDynamicScreenRequest> CREATOR;
    public final String request_body;

    static {
        ShopDynamicScreenRequest$Companion$ADAPTER$1 shopDynamicScreenRequest$Companion$ADAPTER$1 = new ShopDynamicScreenRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopDynamicScreenRequest.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.ShopDynamicScreenRequest", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/preload_request_context.proto");
        ADAPTER = shopDynamicScreenRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopDynamicScreenRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDynamicScreenRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_body = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopDynamicScreenRequest)) {
            return false;
        }
        ShopDynamicScreenRequest shopDynamicScreenRequest = (ShopDynamicScreenRequest) obj;
        return Intrinsics.areEqual(unknownFields(), shopDynamicScreenRequest.unknownFields()) && Intrinsics.areEqual(this.request_body, shopDynamicScreenRequest.request_body);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.request_body;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(1);
        builder.favorite_customer_token = this.request_body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.request_body;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "request_body=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopDynamicScreenRequest{", "}", 0, null, null, 56);
    }
}
