package com.squareup.protos.cash.semaphore.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VendedFlags$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VendedFlags((VendedFlagNode) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(VendedFlagNode.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VendedFlags vendedFlags = (VendedFlags) obj;
        reverseProtoWriter.getClass();
        vendedFlags.getClass();
        reverseProtoWriter.writeBytes(vendedFlags.unknownFields());
        VendedFlagNode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, vendedFlags.root);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VendedFlags vendedFlags = (VendedFlags) obj;
        vendedFlags.getClass();
        return VendedFlagNode.ADAPTER.encodedSizeWithTag(1, vendedFlags.root) + vendedFlags.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VendedFlags vendedFlags = (VendedFlags) obj;
        vendedFlags.getClass();
        VendedFlagNode vendedFlagNode = vendedFlags.root;
        VendedFlagNode vendedFlagNode2 = vendedFlagNode != null ? (VendedFlagNode) VendedFlagNode.ADAPTER.redact(vendedFlagNode) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VendedFlags(vendedFlagNode2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VendedFlags vendedFlags = (VendedFlags) obj;
        vendedFlags.getClass();
        VendedFlagNode.ADAPTER.encodeWithTag(protoWriter, 1, vendedFlags.root);
        protoWriter.writeBytes(vendedFlags.unknownFields());
    }
}
