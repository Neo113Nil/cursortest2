package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CLOClusterSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CLOClusterSection((ClusterInfoItem) obj, m, (ClusterSize) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ClusterInfoItem.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(ClusterItem.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ClusterSize.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CLOClusterSection cLOClusterSection = (CLOClusterSection) obj;
        reverseProtoWriter.getClass();
        cLOClusterSection.getClass();
        reverseProtoWriter.writeBytes(cLOClusterSection.unknownFields());
        ClusterSize.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cLOClusterSection.cluster_size);
        ClusterItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cLOClusterSection.cluster_items);
        ClusterInfoItem.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cLOClusterSection.info_item);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CLOClusterSection cLOClusterSection = (CLOClusterSection) obj;
        cLOClusterSection.getClass();
        return ClusterSize.ADAPTER.encodedSizeWithTag(3, cLOClusterSection.cluster_size) + ClusterItem.ADAPTER.asRepeated().encodedSizeWithTag(2, cLOClusterSection.cluster_items) + ClusterInfoItem.ADAPTER.encodedSizeWithTag(1, cLOClusterSection.info_item) + cLOClusterSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CLOClusterSection cLOClusterSection = (CLOClusterSection) obj;
        cLOClusterSection.getClass();
        ClusterInfoItem clusterInfoItem = cLOClusterSection.info_item;
        ClusterInfoItem clusterInfoItem2 = clusterInfoItem != null ? (ClusterInfoItem) ClusterInfoItem.ADAPTER.redact(clusterInfoItem) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cLOClusterSection.cluster_items, ClusterItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ClusterSize clusterSize = cLOClusterSection.cluster_size;
        byteString.getClass();
        return new CLOClusterSection(clusterInfoItem2, m1169redactElements, clusterSize, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CLOClusterSection cLOClusterSection = (CLOClusterSection) obj;
        cLOClusterSection.getClass();
        ClusterInfoItem.ADAPTER.encodeWithTag(protoWriter, 1, cLOClusterSection.info_item);
        ClusterItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cLOClusterSection.cluster_items);
        ClusterSize.ADAPTER.encodeWithTag(protoWriter, 3, cLOClusterSection.cluster_size);
        protoWriter.writeBytes(cLOClusterSection.unknownFields());
    }
}
