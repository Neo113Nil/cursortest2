package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.TreehouseConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TreehouseConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TreehouseConfig(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                m.add(TreehouseConfig.TreehouseApp.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TreehouseConfig treehouseConfig = (TreehouseConfig) obj;
        reverseProtoWriter.getClass();
        treehouseConfig.getClass();
        reverseProtoWriter.writeBytes(treehouseConfig.unknownFields());
        TreehouseConfig.TreehouseApp.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, treehouseConfig.apps);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TreehouseConfig treehouseConfig = (TreehouseConfig) obj;
        treehouseConfig.getClass();
        return TreehouseConfig.TreehouseApp.ADAPTER.asRepeated().encodedSizeWithTag(3, treehouseConfig.apps) + treehouseConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TreehouseConfig treehouseConfig = (TreehouseConfig) obj;
        treehouseConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(treehouseConfig.apps, TreehouseConfig.TreehouseApp.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TreehouseConfig(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TreehouseConfig treehouseConfig = (TreehouseConfig) obj;
        treehouseConfig.getClass();
        TreehouseConfig.TreehouseApp.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, treehouseConfig.apps);
        protoWriter.writeBytes(treehouseConfig.unknownFields());
    }
}
