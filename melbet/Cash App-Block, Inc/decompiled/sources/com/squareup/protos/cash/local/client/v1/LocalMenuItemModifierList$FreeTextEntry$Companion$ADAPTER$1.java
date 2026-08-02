package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemModifierList$FreeTextEntry$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemModifierList.FreeTextEntry((Boolean) obj2, (Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemModifierList.FreeTextEntry freeTextEntry = (LocalMenuItemModifierList.FreeTextEntry) obj;
        reverseProtoWriter.getClass();
        freeTextEntry.getClass();
        reverseProtoWriter.writeBytes(freeTextEntry.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, freeTextEntry.require_non_empty_string);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, freeTextEntry.max_length);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuItemModifierList.FreeTextEntry freeTextEntry = (LocalMenuItemModifierList.FreeTextEntry) obj;
        freeTextEntry.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, freeTextEntry.require_non_empty_string) + ProtoAdapter.INT32.encodedSizeWithTag(1, freeTextEntry.max_length) + freeTextEntry.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemModifierList.FreeTextEntry freeTextEntry = (LocalMenuItemModifierList.FreeTextEntry) obj;
        freeTextEntry.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = freeTextEntry.max_length;
        Boolean bool = freeTextEntry.require_non_empty_string;
        byteString.getClass();
        return new LocalMenuItemModifierList.FreeTextEntry(bool, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemModifierList.FreeTextEntry freeTextEntry = (LocalMenuItemModifierList.FreeTextEntry) obj;
        freeTextEntry.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, freeTextEntry.max_length);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, freeTextEntry.require_non_empty_string);
        protoWriter.writeBytes(freeTextEntry.unknownFields());
    }
}
