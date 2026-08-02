package com.squareup.protos.cash.local.client.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItem$ItemOptionsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItem.ItemOptionsConfig((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItem.ItemOptionsConfig itemOptionsConfig = (LocalMenuItem.ItemOptionsConfig) obj;
        reverseProtoWriter.getClass();
        itemOptionsConfig.getClass();
        reverseProtoWriter.writeBytes(itemOptionsConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, itemOptionsConfig.value_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, itemOptionsConfig.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItem.ItemOptionsConfig itemOptionsConfig = (LocalMenuItem.ItemOptionsConfig) obj;
        itemOptionsConfig.getClass();
        int size$okio = itemOptionsConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, itemOptionsConfig.value_tokens) + protoAdapter.encodedSizeWithTag(1, itemOptionsConfig.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItem.ItemOptionsConfig itemOptionsConfig = (LocalMenuItem.ItemOptionsConfig) obj;
        itemOptionsConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = itemOptionsConfig.name;
        List list = itemOptionsConfig.value_tokens;
        list.getClass();
        byteString.getClass();
        return new LocalMenuItem.ItemOptionsConfig(str, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItem.ItemOptionsConfig itemOptionsConfig = (LocalMenuItem.ItemOptionsConfig) obj;
        itemOptionsConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, itemOptionsConfig.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, itemOptionsConfig.value_tokens);
        protoWriter.writeBytes(itemOptionsConfig.unknownFields());
    }
}
