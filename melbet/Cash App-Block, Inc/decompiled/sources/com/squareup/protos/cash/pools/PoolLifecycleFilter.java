package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PoolLifecycleFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PoolLifecycleFilter> CREATOR;
    public final List included_categories;

    static {
        PoolLifecycleFilter$Companion$ADAPTER$1 poolLifecycleFilter$Companion$ADAPTER$1 = new PoolLifecycleFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PoolLifecycleFilter.class), "type.googleapis.com/squareup.cash.pools.v1beta.PoolLifecycleFilter", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = poolLifecycleFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(poolLifecycleFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoolLifecycleFilter(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.included_categories = TransactorKt.immutableCopyOf("included_categories", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoolLifecycleFilter)) {
            return false;
        }
        PoolLifecycleFilter poolLifecycleFilter = (PoolLifecycleFilter) obj;
        return Intrinsics.areEqual(unknownFields(), poolLifecycleFilter.unknownFields()) && Intrinsics.areEqual(this.included_categories, poolLifecycleFilter.included_categories);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.included_categories.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(8, false);
        builder.pools = this.included_categories;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.included_categories;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("included_categories=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PoolLifecycleFilter{", "}", 0, null, null, 56);
    }
}
