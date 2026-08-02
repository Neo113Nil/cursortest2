package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
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
public final class PoolSurcharge extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PoolSurcharge> CREATOR;
    public final Long in_network_p2p_credit_card_fee_bps;

    static {
        PoolSurcharge$Companion$ADAPTER$1 poolSurcharge$Companion$ADAPTER$1 = new PoolSurcharge$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoolSurcharge.class), "type.googleapis.com/squareup.cash.pools.v1beta.PoolSurcharge", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = poolSurcharge$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(poolSurcharge$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolSurcharge(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.in_network_p2p_credit_card_fee_bps = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoolSurcharge)) {
            return false;
        }
        PoolSurcharge poolSurcharge = (PoolSurcharge) obj;
        return Intrinsics.areEqual(unknownFields(), poolSurcharge.unknownFields()) && Intrinsics.areEqual(this.in_network_p2p_credit_card_fee_bps, poolSurcharge.in_network_p2p_credit_card_fee_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.in_network_p2p_credit_card_fee_bps;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(9);
        builder.cat_count = this.in_network_p2p_credit_card_fee_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.in_network_p2p_credit_card_fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("in_network_p2p_credit_card_fee_bps=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PoolSurcharge{", "}", 0, null, null, 56);
    }
}
