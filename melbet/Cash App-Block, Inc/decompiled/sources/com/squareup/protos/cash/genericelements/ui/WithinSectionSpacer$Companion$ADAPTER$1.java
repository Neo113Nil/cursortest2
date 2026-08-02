package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.WithinSectionSpacer;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WithinSectionSpacer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WithinSectionSpacer((WithinSectionSpacer.Size) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = WithinSectionSpacer.Size.ADAPTER.decode(protoReader);
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
        WithinSectionSpacer withinSectionSpacer = (WithinSectionSpacer) obj;
        reverseProtoWriter.getClass();
        withinSectionSpacer.getClass();
        reverseProtoWriter.writeBytes(withinSectionSpacer.unknownFields());
        WithinSectionSpacer.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 1, withinSectionSpacer.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WithinSectionSpacer withinSectionSpacer = (WithinSectionSpacer) obj;
        withinSectionSpacer.getClass();
        return WithinSectionSpacer.Size.ADAPTER.encodedSizeWithTag(1, withinSectionSpacer.size) + withinSectionSpacer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        WithinSectionSpacer withinSectionSpacer = (WithinSectionSpacer) obj;
        withinSectionSpacer.getClass();
        ByteString byteString = ByteString.EMPTY;
        WithinSectionSpacer.Size size = withinSectionSpacer.size;
        byteString.getClass();
        return new WithinSectionSpacer(size, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WithinSectionSpacer withinSectionSpacer = (WithinSectionSpacer) obj;
        withinSectionSpacer.getClass();
        WithinSectionSpacer.Size.ADAPTER.encodeWithTag(protoWriter, 1, withinSectionSpacer.size);
        protoWriter.writeBytes(withinSectionSpacer.unknownFields());
    }
}
