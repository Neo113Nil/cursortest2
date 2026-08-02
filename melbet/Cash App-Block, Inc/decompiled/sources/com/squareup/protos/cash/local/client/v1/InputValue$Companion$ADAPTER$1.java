package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InputValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InputValue((String) obj, (InputValue.InputData) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(InputValue.InputData.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InputValue inputValue = (InputValue) obj;
        reverseProtoWriter.getClass();
        inputValue.getClass();
        reverseProtoWriter.writeBytes(inputValue.unknownFields());
        InputValue.InputData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, inputValue.value);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, inputValue.input_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InputValue inputValue = (InputValue) obj;
        inputValue.getClass();
        return InputValue.InputData.ADAPTER.encodedSizeWithTag(2, inputValue.value) + ProtoAdapter.STRING.encodedSizeWithTag(1, inputValue.input_id) + inputValue.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InputValue inputValue = (InputValue) obj;
        inputValue.getClass();
        InputValue.InputData inputData = inputValue.value;
        InputValue.InputData inputData2 = inputData != null ? (InputValue.InputData) InputValue.InputData.ADAPTER.redact(inputData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = inputValue.input_id;
        byteString.getClass();
        return new InputValue(str, inputData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InputValue inputValue = (InputValue) obj;
        inputValue.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, inputValue.input_id);
        InputValue.InputData.ADAPTER.encodeWithTag(protoWriter, 2, inputValue.value);
        protoWriter.writeBytes(inputValue.unknownFields());
    }
}
