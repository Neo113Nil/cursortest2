package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class ShopMerchantInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopMerchantInfo> CREATOR;
    public final String merchant_url;
    public final String user_agent;

    static {
        ShopMerchantInfo$Companion$ADAPTER$1 shopMerchantInfo$Companion$ADAPTER$1 = new ShopMerchantInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopMerchantInfo.class), "type.googleapis.com/squareup.cash.cashsuggest.api.ShopMerchantInfo", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/ShopMerchantInfo.proto");
        ADAPTER = shopMerchantInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopMerchantInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopMerchantInfo(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_url = str;
        this.user_agent = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopMerchantInfo)) {
            return false;
        }
        ShopMerchantInfo shopMerchantInfo = (ShopMerchantInfo) obj;
        return Intrinsics.areEqual(unknownFields(), shopMerchantInfo.unknownFields()) && Intrinsics.areEqual(this.merchant_url, shopMerchantInfo.merchant_url) && Intrinsics.areEqual(this.user_agent, shopMerchantInfo.user_agent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.user_agent;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(24);
        builder.prefix = this.merchant_url;
        builder.name = this.user_agent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_url=", arrayList);
        }
        String str2 = this.user_agent;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "user_agent=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopMerchantInfo{", "}", 0, null, null, 56);
    }
}
