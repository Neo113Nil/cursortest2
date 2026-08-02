package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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
public final class LocalActionP2P extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalActionP2P> CREATOR;
    public final String customer_token;
    public final Boolean enabled;
    public final Boolean pay_enabled;
    public final Boolean request_enabled;

    static {
        LocalActionP2P$Companion$ADAPTER$1 localActionP2P$Companion$ADAPTER$1 = new LocalActionP2P$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalActionP2P.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalActionP2P", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_actions.proto");
        ADAPTER = localActionP2P$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localActionP2P$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalActionP2P(Boolean bool, String str, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.customer_token = str;
        this.pay_enabled = bool2;
        this.request_enabled = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalActionP2P)) {
            return false;
        }
        LocalActionP2P localActionP2P = (LocalActionP2P) obj;
        return Intrinsics.areEqual(unknownFields(), localActionP2P.unknownFields()) && Intrinsics.areEqual(this.enabled, localActionP2P.enabled) && Intrinsics.areEqual(this.customer_token, localActionP2P.customer_token) && Intrinsics.areEqual(this.pay_enabled, localActionP2P.pay_enabled) && Intrinsics.areEqual(this.request_enabled, localActionP2P.request_enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.customer_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool2 = this.pay_enabled;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.request_enabled;
        int hashCode5 = hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(6, false);
        builder.last_4 = this.enabled;
        builder.id = this.customer_token;
        builder.gift_card_id = this.pay_enabled;
        builder.gift_card_amount = this.request_enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Boolean bool2 = this.pay_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pay_enabled=", bool2, arrayList);
        }
        Boolean bool3 = this.request_enabled;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("request_enabled=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalActionP2P{", "}", 0, null, null, 56);
    }
}
