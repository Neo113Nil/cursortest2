package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
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

/* loaded from: classes8.dex */
public final class BitcoinStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinStatus> CREATOR;
    public final Long entered_at;
    public final BitcoinState state;

    static {
        BitcoinStatus$Companion$ADAPTER$1 bitcoinStatus$Companion$ADAPTER$1 = new BitcoinStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinStatus.class), "type.googleapis.com/squareup.franklin.BitcoinStatus", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = bitcoinStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinStatus(Long l, BitcoinState bitcoinState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entered_at = l;
        this.state = bitcoinState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinStatus)) {
            return false;
        }
        BitcoinStatus bitcoinStatus = (BitcoinStatus) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinStatus.unknownFields()) && Intrinsics.areEqual(this.entered_at, bitcoinStatus.entered_at) && this.state == bitcoinStatus.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.entered_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        BitcoinState bitcoinState = this.state;
        int hashCode3 = hashCode2 + (bitcoinState != null ? bitcoinState.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(3);
        builder.f1372android = this.entered_at;
        builder.ios = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.entered_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("entered_at=", l, arrayList);
        }
        BitcoinState bitcoinState = this.state;
        if (bitcoinState != null) {
            arrayList.add("state=" + bitcoinState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinStatus{", "}", 0, null, null, 56);
    }
}
