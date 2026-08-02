package com.squareup.protos.cash.semaphore.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.semaphore.api.VendedFlagNode;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VendedFlagNode$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VendedFlagNode((String) obj, (VendedFlagNode.VendedValue) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(VendedFlagNode.VendedValue.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(VendedFlagNode.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VendedFlagNode vendedFlagNode = (VendedFlagNode) obj;
        reverseProtoWriter.getClass();
        vendedFlagNode.getClass();
        reverseProtoWriter.writeBytes(vendedFlagNode.unknownFields());
        VendedFlagNode.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, vendedFlagNode.next);
        VendedFlagNode.VendedValue.ADAPTER.encodeWithTag(reverseProtoWriter, 2, vendedFlagNode.vended_value);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, vendedFlagNode.flag_name_prefix);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VendedFlagNode vendedFlagNode = (VendedFlagNode) obj;
        vendedFlagNode.getClass();
        return VendedFlagNode.ADAPTER.asRepeated().encodedSizeWithTag(3, vendedFlagNode.next) + VendedFlagNode.VendedValue.ADAPTER.encodedSizeWithTag(2, vendedFlagNode.vended_value) + ProtoAdapter.STRING.encodedSizeWithTag(1, vendedFlagNode.flag_name_prefix) + vendedFlagNode.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VendedFlagNode vendedFlagNode = (VendedFlagNode) obj;
        vendedFlagNode.getClass();
        VendedFlagNode.VendedValue vendedValue = vendedFlagNode.vended_value;
        VendedFlagNode.VendedValue vendedValue2 = vendedValue != null ? (VendedFlagNode.VendedValue) VendedFlagNode.VendedValue.ADAPTER.redact(vendedValue) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(vendedFlagNode.next, VendedFlagNode.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = vendedFlagNode.flag_name_prefix;
        byteString.getClass();
        return new VendedFlagNode(str, vendedValue2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VendedFlagNode vendedFlagNode = (VendedFlagNode) obj;
        vendedFlagNode.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vendedFlagNode.flag_name_prefix);
        VendedFlagNode.VendedValue.ADAPTER.encodeWithTag(protoWriter, 2, vendedFlagNode.vended_value);
        VendedFlagNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, vendedFlagNode.next);
        protoWriter.writeBytes(vendedFlagNode.unknownFields());
    }
}
