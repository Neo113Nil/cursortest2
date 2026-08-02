package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.RequiredInput;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RequiredInput$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RequiredInput((String) obj, (RequiredInput.InputType) obj2, (RequiredInput.State) obj3, (InputSpecification) obj4, (LocalErrorResponse.Error) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = RequiredInput.InputType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                try {
                    obj3 = RequiredInput.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(InputSpecification.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalErrorResponse.Error.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RequiredInput requiredInput = (RequiredInput) obj;
        reverseProtoWriter.getClass();
        requiredInput.getClass();
        reverseProtoWriter.writeBytes(requiredInput.unknownFields());
        LocalErrorResponse.Error.ADAPTER.encodeWithTag(reverseProtoWriter, 5, requiredInput.validation_error);
        InputSpecification.ADAPTER.encodeWithTag(reverseProtoWriter, 4, requiredInput.specification);
        RequiredInput.State.ADAPTER.encodeWithTag(reverseProtoWriter, 3, requiredInput.state);
        RequiredInput.InputType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, requiredInput.input_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, requiredInput.input_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RequiredInput requiredInput = (RequiredInput) obj;
        requiredInput.getClass();
        return LocalErrorResponse.Error.ADAPTER.encodedSizeWithTag(5, requiredInput.validation_error) + InputSpecification.ADAPTER.encodedSizeWithTag(4, requiredInput.specification) + RequiredInput.State.ADAPTER.encodedSizeWithTag(3, requiredInput.state) + RequiredInput.InputType.ADAPTER.encodedSizeWithTag(2, requiredInput.input_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, requiredInput.input_id) + requiredInput.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RequiredInput requiredInput = (RequiredInput) obj;
        requiredInput.getClass();
        InputSpecification inputSpecification = requiredInput.specification;
        InputSpecification inputSpecification2 = inputSpecification != null ? (InputSpecification) InputSpecification.ADAPTER.redact(inputSpecification) : null;
        LocalErrorResponse.Error error = requiredInput.validation_error;
        LocalErrorResponse.Error error2 = error != null ? (LocalErrorResponse.Error) LocalErrorResponse.Error.ADAPTER.redact(error) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = requiredInput.input_id;
        RequiredInput.InputType inputType = requiredInput.input_type;
        RequiredInput.State state = requiredInput.state;
        byteString.getClass();
        return new RequiredInput(str, inputType, state, inputSpecification2, error2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RequiredInput requiredInput = (RequiredInput) obj;
        requiredInput.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, requiredInput.input_id);
        RequiredInput.InputType.ADAPTER.encodeWithTag(protoWriter, 2, requiredInput.input_type);
        RequiredInput.State.ADAPTER.encodeWithTag(protoWriter, 3, requiredInput.state);
        InputSpecification.ADAPTER.encodeWithTag(protoWriter, 4, requiredInput.specification);
        LocalErrorResponse.Error.ADAPTER.encodeWithTag(protoWriter, 5, requiredInput.validation_error);
        protoWriter.writeBytes(requiredInput.unknownFields());
    }
}
