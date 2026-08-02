package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.BetweenSectionSpacer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BetweenSectionSpacer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BetweenSectionSpacer((BetweenSectionSpacer.Size) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BetweenSectionSpacer.Size.ADAPTER.decode(protoReader);
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
        BetweenSectionSpacer betweenSectionSpacer = (BetweenSectionSpacer) obj;
        reverseProtoWriter.getClass();
        betweenSectionSpacer.getClass();
        reverseProtoWriter.writeBytes(betweenSectionSpacer.unknownFields());
        BetweenSectionSpacer.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 1, betweenSectionSpacer.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BetweenSectionSpacer betweenSectionSpacer = (BetweenSectionSpacer) obj;
        betweenSectionSpacer.getClass();
        return BetweenSectionSpacer.Size.ADAPTER.encodedSizeWithTag(1, betweenSectionSpacer.size) + betweenSectionSpacer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BetweenSectionSpacer betweenSectionSpacer = (BetweenSectionSpacer) obj;
        betweenSectionSpacer.getClass();
        ByteString byteString = ByteString.EMPTY;
        BetweenSectionSpacer.Size size = betweenSectionSpacer.size;
        byteString.getClass();
        return new BetweenSectionSpacer(size, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BetweenSectionSpacer betweenSectionSpacer = (BetweenSectionSpacer) obj;
        betweenSectionSpacer.getClass();
        BetweenSectionSpacer.Size.ADAPTER.encodeWithTag(protoWriter, 1, betweenSectionSpacer.size);
        protoWriter.writeBytes(betweenSectionSpacer.unknownFields());
    }
}
