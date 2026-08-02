package com.squareup.protos.cash.plasma.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExistingCustomSelectionOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExistingCustomSelectionOption((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExistingCustomSelectionOption existingCustomSelectionOption = (ExistingCustomSelectionOption) obj;
        reverseProtoWriter.getClass();
        existingCustomSelectionOption.getClass();
        reverseProtoWriter.writeBytes(existingCustomSelectionOption.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, existingCustomSelectionOption.encoded_custom_submission);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExistingCustomSelectionOption existingCustomSelectionOption = (ExistingCustomSelectionOption) obj;
        existingCustomSelectionOption.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(1, existingCustomSelectionOption.encoded_custom_submission) + existingCustomSelectionOption.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExistingCustomSelectionOption existingCustomSelectionOption = (ExistingCustomSelectionOption) obj;
        existingCustomSelectionOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = existingCustomSelectionOption.encoded_custom_submission;
        byteString.getClass();
        return new ExistingCustomSelectionOption(byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExistingCustomSelectionOption existingCustomSelectionOption = (ExistingCustomSelectionOption) obj;
        existingCustomSelectionOption.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, existingCustomSelectionOption.encoded_custom_submission);
        protoWriter.writeBytes(existingCustomSelectionOption.unknownFields());
    }
}
