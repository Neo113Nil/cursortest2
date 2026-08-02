package com.squareup.protos.cash.investcrypto.event;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcrypto.resources.OrderStateReason;
import com.squareup.protos.franklin.api.Region;
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
public final class CryptoOrderEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptoOrderEvent> CREATOR;
    public final Long created_at;
    public final Long last_state_updated_at;
    public final LedgerProcessor ledger_processor;
    public final Order order;
    public final OrderStateReason reason;
    public final Region region;
    public final Long updated_at;
    public final Long version;

    static {
        CryptoOrderEvent$Companion$ADAPTER$1 cryptoOrderEvent$Companion$ADAPTER$1 = new CryptoOrderEvent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoOrderEvent.class), "type.googleapis.com/squareup.cash.investcrypto.event.CryptoOrderEvent", Syntax.PROTO_2, null, "squareup/cash/investcrypto/event/event.proto");
        ADAPTER = cryptoOrderEvent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoOrderEvent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderEvent(Order order, Long l, Long l2, Long l3, OrderStateReason orderStateReason, LedgerProcessor ledgerProcessor, Region region, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.order = order;
        this.version = l;
        this.created_at = l2;
        this.updated_at = l3;
        this.reason = orderStateReason;
        this.ledger_processor = ledgerProcessor;
        this.region = region;
        this.last_state_updated_at = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptoOrderEvent)) {
            return false;
        }
        CryptoOrderEvent cryptoOrderEvent = (CryptoOrderEvent) obj;
        return Intrinsics.areEqual(unknownFields(), cryptoOrderEvent.unknownFields()) && Intrinsics.areEqual(this.order, cryptoOrderEvent.order) && Intrinsics.areEqual(this.version, cryptoOrderEvent.version) && Intrinsics.areEqual(this.created_at, cryptoOrderEvent.created_at) && Intrinsics.areEqual(this.updated_at, cryptoOrderEvent.updated_at) && this.reason == cryptoOrderEvent.reason && this.ledger_processor == cryptoOrderEvent.ledger_processor && this.region == cryptoOrderEvent.region && Intrinsics.areEqual(this.last_state_updated_at, cryptoOrderEvent.last_state_updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Order order = this.order;
        int hashCode2 = (hashCode + (order != null ? order.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.created_at;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.updated_at;
        int hashCode5 = (hashCode4 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        OrderStateReason orderStateReason = this.reason;
        int hashCode6 = (hashCode5 + (orderStateReason != null ? orderStateReason.hashCode() : 0)) * 37;
        LedgerProcessor ledgerProcessor = this.ledger_processor;
        int hashCode7 = (hashCode6 + (ledgerProcessor != null ? ledgerProcessor.hashCode() : 0)) * 37;
        Region region = this.region;
        int hashCode8 = (hashCode7 + (region != null ? region.hashCode() : 0)) * 37;
        Long l4 = this.last_state_updated_at;
        int hashCode9 = hashCode8 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(28, false);
        builder.external_token = this.order;
        builder.external_version = this.version;
        builder.updated_at = this.created_at;
        builder.created_at = this.updated_at;
        builder.customer_token = this.reason;
        builder.is_badged = this.ledger_processor;
        builder.item_type = this.region;
        builder.count_groups = this.last_state_updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Order order = this.order;
        if (order != null) {
            arrayList.add("order=" + order);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Long l2 = this.created_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l2, arrayList);
        }
        Long l3 = this.updated_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l3, arrayList);
        }
        OrderStateReason orderStateReason = this.reason;
        if (orderStateReason != null) {
            arrayList.add("reason=" + orderStateReason);
        }
        LedgerProcessor ledgerProcessor = this.ledger_processor;
        if (ledgerProcessor != null) {
            arrayList.add("ledger_processor=" + ledgerProcessor);
        }
        Region region = this.region;
        if (region != null) {
            arrayList.add("region=" + region);
        }
        Long l4 = this.last_state_updated_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_state_updated_at=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderEvent{", "}", 0, null, null, 56);
    }
}
