package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.ClusterSection;
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

/* loaded from: classes8.dex */
public final class CLOClusterSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CLOClusterSection> CREATOR;
    public final List cluster_items;
    public final ClusterSize cluster_size;
    public final ClusterInfoItem info_item;

    static {
        CLOClusterSection$Companion$ADAPTER$1 cLOClusterSection$Companion$ADAPTER$1 = new CLOClusterSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CLOClusterSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.CLOClusterSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/ClusterSection.proto");
        ADAPTER = cLOClusterSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cLOClusterSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLOClusterSection(ClusterInfoItem clusterInfoItem, List list, ClusterSize clusterSize, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.info_item = clusterInfoItem;
        this.cluster_size = clusterSize;
        this.cluster_items = TransactorKt.immutableCopyOf("cluster_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CLOClusterSection)) {
            return false;
        }
        CLOClusterSection cLOClusterSection = (CLOClusterSection) obj;
        return Intrinsics.areEqual(unknownFields(), cLOClusterSection.unknownFields()) && Intrinsics.areEqual(this.info_item, cLOClusterSection.info_item) && Intrinsics.areEqual(this.cluster_items, cLOClusterSection.cluster_items) && this.cluster_size == cLOClusterSection.cluster_size;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ClusterInfoItem clusterInfoItem = this.info_item;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (clusterInfoItem != null ? clusterInfoItem.hashCode() : 0)) * 37, 37, this.cluster_items);
        ClusterSize clusterSize = this.cluster_size;
        int hashCode2 = m + (clusterSize != null ? clusterSize.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClusterSection.Builder builder = new ClusterSection.Builder(1);
        builder.info_item = this.info_item;
        builder.cluster_items = this.cluster_items;
        builder.cluster_size = this.cluster_size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ClusterInfoItem clusterInfoItem = this.info_item;
        if (clusterInfoItem != null) {
            arrayList.add("info_item=" + clusterInfoItem);
        }
        List list = this.cluster_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cluster_items=", arrayList, list);
        }
        ClusterSize clusterSize = this.cluster_size;
        if (clusterSize != null) {
            arrayList.add("cluster_size=" + clusterSize);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CLOClusterSection{", "}", 0, null, null, 56);
    }
}
