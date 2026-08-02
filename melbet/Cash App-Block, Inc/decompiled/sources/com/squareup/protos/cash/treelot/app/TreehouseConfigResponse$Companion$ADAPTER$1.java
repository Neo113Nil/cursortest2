package com.squareup.protos.cash.treelot.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TreehouseConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TreehouseConfigResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TreehouseApp.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TreehouseConfigResponse treehouseConfigResponse = (TreehouseConfigResponse) obj;
        reverseProtoWriter.getClass();
        treehouseConfigResponse.getClass();
        reverseProtoWriter.writeBytes(treehouseConfigResponse.unknownFields());
        TreehouseApp.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, treehouseConfigResponse.apps);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TreehouseConfigResponse treehouseConfigResponse = (TreehouseConfigResponse) obj;
        treehouseConfigResponse.getClass();
        return TreehouseApp.ADAPTER.asRepeated().encodedSizeWithTag(1, treehouseConfigResponse.apps) + treehouseConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TreehouseConfigResponse treehouseConfigResponse = (TreehouseConfigResponse) obj;
        treehouseConfigResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(treehouseConfigResponse.apps, TreehouseApp.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TreehouseConfigResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TreehouseConfigResponse treehouseConfigResponse = (TreehouseConfigResponse) obj;
        treehouseConfigResponse.getClass();
        TreehouseApp.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, treehouseConfigResponse.apps);
        protoWriter.writeBytes(treehouseConfigResponse.unknownFields());
    }
}
