package com.squareup.protos.cash.pools;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/pools/GetPoolsAppletResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardModule$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPoolsAppletResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPoolsAppletResponse> CREATOR;
    public final List highlighted_pools;
    public final PoolsAppletStats stats;

    static {
        GetPoolsAppletResponse$Companion$ADAPTER$1 getPoolsAppletResponse$Companion$ADAPTER$1 = new GetPoolsAppletResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPoolsAppletResponse.class), "type.googleapis.com/squareup.cash.pools.v1beta.GetPoolsAppletResponse", Syntax.PROTO_2, null, "squareup/cash/pools/v1beta/pools.proto");
        ADAPTER = getPoolsAppletResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPoolsAppletResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPoolsAppletResponse(List list, PoolsAppletStats poolsAppletStats, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.stats = poolsAppletStats;
        this.highlighted_pools = TransactorKt.immutableCopyOf("highlighted_pools", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPoolsAppletResponse)) {
            return false;
        }
        GetPoolsAppletResponse getPoolsAppletResponse = (GetPoolsAppletResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPoolsAppletResponse.unknownFields()) && Intrinsics.areEqual(this.highlighted_pools, getPoolsAppletResponse.highlighted_pools) && Intrinsics.areEqual(this.stats, getPoolsAppletResponse.stats);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.highlighted_pools);
        PoolsAppletStats poolsAppletStats = this.stats;
        int hashCode = m + (poolsAppletStats != null ? poolsAppletStats.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(20);
        builder.f1329type = this.highlighted_pools;
        builder.use_case = this.stats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.highlighted_pools;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("highlighted_pools=", arrayList, list);
        }
        PoolsAppletStats poolsAppletStats = this.stats;
        if (poolsAppletStats != null) {
            arrayList.add("stats=" + poolsAppletStats);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPoolsAppletResponse{", "}", 0, null, null, 56);
    }
}
