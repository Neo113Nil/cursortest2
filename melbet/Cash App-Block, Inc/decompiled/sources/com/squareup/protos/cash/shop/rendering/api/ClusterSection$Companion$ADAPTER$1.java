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
public final class ClusterSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClusterSection((ClusterInfoItem) obj, m, (ClusterSize) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ClusterSection clusterSection = (ClusterSection) obj;
        reverseProtoWriter.getClass();
        clusterSection.getClass();
        reverseProtoWriter.writeBytes(clusterSection.unknownFields());
        ClusterSize.ADAPTER.encodeWithTag(reverseProtoWriter, 3, clusterSection.cluster_size);
        ClusterItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, clusterSection.cluster_items);
        ClusterInfoItem.ADAPTER.encodeWithTag(reverseProtoWriter, 1, clusterSection.info_item);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClusterSection clusterSection = (ClusterSection) obj;
        clusterSection.getClass();
        return ClusterSize.ADAPTER.encodedSizeWithTag(3, clusterSection.cluster_size) + ClusterItem.ADAPTER.asRepeated().encodedSizeWithTag(2, clusterSection.cluster_items) + ClusterInfoItem.ADAPTER.encodedSizeWithTag(1, clusterSection.info_item) + clusterSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClusterSection clusterSection = (ClusterSection) obj;
        clusterSection.getClass();
        ClusterInfoItem clusterInfoItem = clusterSection.info_item;
        ClusterInfoItem clusterInfoItem2 = clusterInfoItem != null ? (ClusterInfoItem) ClusterInfoItem.ADAPTER.redact(clusterInfoItem) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(clusterSection.cluster_items, ClusterItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ClusterSize clusterSize = clusterSection.cluster_size;
        byteString.getClass();
        return new ClusterSection(clusterInfoItem2, m1169redactElements, clusterSize, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClusterSection clusterSection = (ClusterSection) obj;
        clusterSection.getClass();
        ClusterInfoItem.ADAPTER.encodeWithTag(protoWriter, 1, clusterSection.info_item);
        ClusterItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, clusterSection.cluster_items);
        ClusterSize.ADAPTER.encodeWithTag(protoWriter, 3, clusterSection.cluster_size);
        protoWriter.writeBytes(clusterSection.unknownFields());
    }
}
