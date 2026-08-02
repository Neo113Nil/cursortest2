package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.P2pInstrumentSelectionRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pInstrumentSelectionRequest$NewLinkOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2pInstrumentSelectionRequest.NewLinkOption((P2pInstrumentSelectionRequest.NewLinkOption.LinkType) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = P2pInstrumentSelectionRequest.NewLinkOption.LinkType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        P2pInstrumentSelectionRequest.NewLinkOption newLinkOption = (P2pInstrumentSelectionRequest.NewLinkOption) obj;
        reverseProtoWriter.getClass();
        newLinkOption.getClass();
        reverseProtoWriter.writeBytes(newLinkOption.unknownFields());
        P2pInstrumentSelectionRequest.NewLinkOption.LinkType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, newLinkOption.link_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pInstrumentSelectionRequest.NewLinkOption newLinkOption = (P2pInstrumentSelectionRequest.NewLinkOption) obj;
        newLinkOption.getClass();
        return P2pInstrumentSelectionRequest.NewLinkOption.LinkType.ADAPTER.encodedSizeWithTag(1, newLinkOption.link_type) + newLinkOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pInstrumentSelectionRequest.NewLinkOption newLinkOption = (P2pInstrumentSelectionRequest.NewLinkOption) obj;
        newLinkOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        P2pInstrumentSelectionRequest.NewLinkOption.LinkType linkType = newLinkOption.link_type;
        byteString.getClass();
        return new P2pInstrumentSelectionRequest.NewLinkOption(linkType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pInstrumentSelectionRequest.NewLinkOption newLinkOption = (P2pInstrumentSelectionRequest.NewLinkOption) obj;
        newLinkOption.getClass();
        P2pInstrumentSelectionRequest.NewLinkOption.LinkType.ADAPTER.encodeWithTag(protoWriter, 1, newLinkOption.link_type);
        protoWriter.writeBytes(newLinkOption.unknownFields());
    }
}
