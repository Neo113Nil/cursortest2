package com.squareup.protos.cash.treelot.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TreehouseApp$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TreehouseApp((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TreehouseApp treehouseApp = (TreehouseApp) obj;
        reverseProtoWriter.getClass();
        treehouseApp.getClass();
        reverseProtoWriter.writeBytes(treehouseApp.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, treehouseApp.minimal_commit_timestamp);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, treehouseApp.manifest_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, treehouseApp.app_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TreehouseApp treehouseApp = (TreehouseApp) obj;
        treehouseApp.getClass();
        int size$okio = treehouseApp.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, treehouseApp.minimal_commit_timestamp) + protoAdapter.encodedSizeWithTag(2, treehouseApp.manifest_url) + protoAdapter.encodedSizeWithTag(1, treehouseApp.app_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TreehouseApp treehouseApp = (TreehouseApp) obj;
        treehouseApp.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = treehouseApp.app_name;
        String str2 = treehouseApp.manifest_url;
        String str3 = treehouseApp.minimal_commit_timestamp;
        byteString.getClass();
        return new TreehouseApp(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TreehouseApp treehouseApp = (TreehouseApp) obj;
        treehouseApp.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, treehouseApp.app_name);
        protoAdapter.encodeWithTag(protoWriter, 2, treehouseApp.manifest_url);
        protoAdapter.encodeWithTag(protoWriter, 3, treehouseApp.minimal_commit_timestamp);
        protoWriter.writeBytes(treehouseApp.unknownFields());
    }
}
