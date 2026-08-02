package com.squareup.protos.cash.semaphore.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.semaphore.api.VendedFlagNode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VendedFlagNode$VendedValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VendedFlagNode.VendedValue((String) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                try {
                    FlagReadAction.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VendedFlagNode.VendedValue vendedValue = (VendedFlagNode.VendedValue) obj;
        reverseProtoWriter.getClass();
        vendedValue.getClass();
        reverseProtoWriter.writeBytes(vendedValue.unknownFields());
        FlagReadAction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, vendedValue.read_actions);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, vendedValue.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, vendedValue.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, vendedValue.flag_label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VendedFlagNode.VendedValue vendedValue = (VendedFlagNode.VendedValue) obj;
        vendedValue.getClass();
        int size$okio = vendedValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return FlagReadAction.ADAPTER.asRepeated().encodedSizeWithTag(4, vendedValue.read_actions) + protoAdapter.encodedSizeWithTag(3, vendedValue.label) + protoAdapter.encodedSizeWithTag(2, vendedValue.value) + protoAdapter.encodedSizeWithTag(1, vendedValue.flag_label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VendedFlagNode.VendedValue vendedValue = (VendedFlagNode.VendedValue) obj;
        vendedValue.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = vendedValue.flag_label;
        String str2 = vendedValue.value;
        String str3 = vendedValue.label;
        List list = vendedValue.read_actions;
        list.getClass();
        byteString.getClass();
        return new VendedFlagNode.VendedValue(str, str2, str3, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VendedFlagNode.VendedValue vendedValue = (VendedFlagNode.VendedValue) obj;
        vendedValue.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, vendedValue.flag_label);
        protoAdapter.encodeWithTag(protoWriter, 2, vendedValue.value);
        protoAdapter.encodeWithTag(protoWriter, 3, vendedValue.label);
        FlagReadAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, vendedValue.read_actions);
        protoWriter.writeBytes(vendedValue.unknownFields());
    }
}
