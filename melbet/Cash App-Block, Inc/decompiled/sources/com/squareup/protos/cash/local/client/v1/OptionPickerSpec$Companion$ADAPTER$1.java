package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OptionPickerSpec$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OptionPickerSpec(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OptionPickerSpec optionPickerSpec = (OptionPickerSpec) obj;
        reverseProtoWriter.getClass();
        optionPickerSpec.getClass();
        reverseProtoWriter.writeBytes(optionPickerSpec.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OptionPickerSpec optionPickerSpec = (OptionPickerSpec) obj;
        optionPickerSpec.getClass();
        return optionPickerSpec.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((OptionPickerSpec) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OptionPickerSpec(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OptionPickerSpec optionPickerSpec = (OptionPickerSpec) obj;
        optionPickerSpec.getClass();
        protoWriter.writeBytes(optionPickerSpec.unknownFields());
    }
}
