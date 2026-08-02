package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.TreehouseConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TreehouseConfig$TreehouseApp$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TreehouseConfig.TreehouseApp((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TreehouseConfig.TreehouseApp treehouseApp = (TreehouseConfig.TreehouseApp) obj;
        reverseProtoWriter.getClass();
        treehouseApp.getClass();
        reverseProtoWriter.writeBytes(treehouseApp.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, treehouseApp.minimal_commit_timestamp);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, treehouseApp.manifestURL);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, treehouseApp.path);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, treehouseApp.app_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TreehouseConfig.TreehouseApp treehouseApp = (TreehouseConfig.TreehouseApp) obj;
        treehouseApp.getClass();
        int size$okio = treehouseApp.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, treehouseApp.minimal_commit_timestamp) + protoAdapter.encodedSizeWithTag(3, treehouseApp.manifestURL) + protoAdapter.encodedSizeWithTag(2, treehouseApp.path) + protoAdapter.encodedSizeWithTag(1, treehouseApp.app_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TreehouseConfig.TreehouseApp treehouseApp = (TreehouseConfig.TreehouseApp) obj;
        treehouseApp.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = treehouseApp.app_name;
        String str2 = treehouseApp.path;
        String str3 = treehouseApp.manifestURL;
        String str4 = treehouseApp.minimal_commit_timestamp;
        byteString.getClass();
        return new TreehouseConfig.TreehouseApp(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TreehouseConfig.TreehouseApp treehouseApp = (TreehouseConfig.TreehouseApp) obj;
        treehouseApp.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, treehouseApp.app_name);
        protoAdapter.encodeWithTag(protoWriter, 2, treehouseApp.path);
        protoAdapter.encodeWithTag(protoWriter, 3, treehouseApp.manifestURL);
        protoAdapter.encodeWithTag(protoWriter, 4, treehouseApp.minimal_commit_timestamp);
        protoWriter.writeBytes(treehouseApp.unknownFields());
    }
}
