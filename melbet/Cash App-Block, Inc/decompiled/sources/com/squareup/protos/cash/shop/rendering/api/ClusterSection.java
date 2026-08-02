package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
public final class ClusterSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClusterSection> CREATOR;
    public final List cluster_items;
    public final ClusterSize cluster_size;
    public final ClusterInfoItem info_item;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List cluster_items;
        public ClusterSize cluster_size;
        public ClusterInfoItem info_item;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ClusterSection(this.info_item, this.cluster_items, this.cluster_size, buildUnknownFields());
                default:
                    return new CLOClusterSection(this.info_item, this.cluster_items, this.cluster_size, buildUnknownFields());
            }
        }
    }

    static {
        ClusterSection$Companion$ADAPTER$1 clusterSection$Companion$ADAPTER$1 = new ClusterSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClusterSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.ClusterSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/ClusterSection.proto");
        ADAPTER = clusterSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clusterSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusterSection(ClusterInfoItem clusterInfoItem, List list, ClusterSize clusterSize, ByteString byteString) {
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
        if (!(obj instanceof ClusterSection)) {
            return false;
        }
        ClusterSection clusterSection = (ClusterSection) obj;
        return Intrinsics.areEqual(unknownFields(), clusterSection.unknownFields()) && Intrinsics.areEqual(this.info_item, clusterSection.info_item) && Intrinsics.areEqual(this.cluster_items, clusterSection.cluster_items) && this.cluster_size == clusterSection.cluster_size;
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
        Builder builder = new Builder(0);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClusterSection{", "}", 0, null, null, 56);
    }
}
