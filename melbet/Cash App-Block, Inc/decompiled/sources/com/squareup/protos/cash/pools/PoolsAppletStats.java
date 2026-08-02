package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.p2pencore.v1.Date;
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
public final class PoolsAppletStats extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PoolsAppletStats> CREATOR;
    public final Integer involved_active_pools;
    public final Integer involved_closed_pools;
    public final Integer total_involved_pools;

    static {
        PoolsAppletStats$Companion$ADAPTER$1 poolsAppletStats$Companion$ADAPTER$1 = new PoolsAppletStats$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoolsAppletStats.class), "type.googleapis.com/squareup.cash.pools.v1beta.PoolsAppletStats", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = poolsAppletStats$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(poolsAppletStats$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolsAppletStats(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.total_involved_pools = num;
        this.involved_active_pools = num2;
        this.involved_closed_pools = num3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoolsAppletStats)) {
            return false;
        }
        PoolsAppletStats poolsAppletStats = (PoolsAppletStats) obj;
        return Intrinsics.areEqual(unknownFields(), poolsAppletStats.unknownFields()) && Intrinsics.areEqual(this.total_involved_pools, poolsAppletStats.total_involved_pools) && Intrinsics.areEqual(this.involved_active_pools, poolsAppletStats.involved_active_pools) && Intrinsics.areEqual(this.involved_closed_pools, poolsAppletStats.involved_closed_pools);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.total_involved_pools;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.involved_active_pools;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.involved_closed_pools;
        int hashCode4 = hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Date.Builder builder = new Date.Builder(2);
        builder.year = this.total_involved_pools;
        builder.month = this.involved_active_pools;
        builder.day = this.involved_closed_pools;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.total_involved_pools;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("total_involved_pools=", num, arrayList);
        }
        Integer num2 = this.involved_active_pools;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("involved_active_pools=", num2, arrayList);
        }
        Integer num3 = this.involved_closed_pools;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("involved_closed_pools=", num3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PoolsAppletStats{", "}", 0, null, null, 56);
    }
}
