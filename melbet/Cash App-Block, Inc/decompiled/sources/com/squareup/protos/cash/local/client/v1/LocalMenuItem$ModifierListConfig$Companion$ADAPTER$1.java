package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItem$ModifierListConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalMenuItem.ModifierListConfig((String) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItem.ModifierListConfig modifierListConfig = (LocalMenuItem.ModifierListConfig) obj;
        reverseProtoWriter.getClass();
        modifierListConfig.getClass();
        reverseProtoWriter.writeBytes(modifierListConfig.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, modifierListConfig.allow_quantities);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, modifierListConfig.max_selections);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, modifierListConfig.min_selections);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, modifierListConfig.modifier_list_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItem.ModifierListConfig modifierListConfig = (LocalMenuItem.ModifierListConfig) obj;
        modifierListConfig.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, modifierListConfig.modifier_list_token) + modifierListConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, modifierListConfig.allow_quantities) + protoAdapter.encodedSizeWithTag(3, modifierListConfig.max_selections) + protoAdapter.encodedSizeWithTag(2, modifierListConfig.min_selections) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItem.ModifierListConfig modifierListConfig = (LocalMenuItem.ModifierListConfig) obj;
        modifierListConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = modifierListConfig.modifier_list_token;
        Integer num = modifierListConfig.min_selections;
        Integer num2 = modifierListConfig.max_selections;
        Boolean bool = modifierListConfig.allow_quantities;
        byteString.getClass();
        return new LocalMenuItem.ModifierListConfig(str, num, num2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItem.ModifierListConfig modifierListConfig = (LocalMenuItem.ModifierListConfig) obj;
        modifierListConfig.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, modifierListConfig.modifier_list_token);
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 2, modifierListConfig.min_selections);
        protoAdapter.encodeWithTag(protoWriter, 3, modifierListConfig.max_selections);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, modifierListConfig.allow_quantities);
        protoWriter.writeBytes(modifierListConfig.unknownFields());
    }
}
