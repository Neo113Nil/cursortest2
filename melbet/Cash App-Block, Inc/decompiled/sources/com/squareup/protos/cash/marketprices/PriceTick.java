package com.squareup.protos.cash.marketprices;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tigers.Tigers;
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
public final class PriceTick extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PriceTick> CREATOR;
    public final Long price;
    public final Long time_sec;

    static {
        PriceTick$Companion$ADAPTER$1 priceTick$Companion$ADAPTER$1 = new PriceTick$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PriceTick.class), "type.googleapis.com/squareup.cash.marketprices.PriceTick", Syntax.PROTO_2, null, "squareup/cash/marketprices/prices.proto");
        ADAPTER = priceTick$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(priceTick$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceTick(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.price = l;
        this.time_sec = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PriceTick)) {
            return false;
        }
        PriceTick priceTick = (PriceTick) obj;
        return Intrinsics.areEqual(unknownFields(), priceTick.unknownFields()) && Intrinsics.areEqual(this.price, priceTick.price) && Intrinsics.areEqual(this.time_sec, priceTick.time_sec);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.price;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.time_sec;
        int hashCode3 = hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Tigers.Builder builder = new Tigers.Builder(2);
        builder.tiger_count = this.price;
        builder.fetch_version = this.time_sec;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.price;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("price=", l, arrayList);
        }
        Long l2 = this.time_sec;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("time_sec=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PriceTick{", "}", 0, null, null, 56);
    }
}
