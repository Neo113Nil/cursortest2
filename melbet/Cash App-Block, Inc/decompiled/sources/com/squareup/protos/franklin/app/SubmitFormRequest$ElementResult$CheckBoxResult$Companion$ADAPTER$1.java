package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$CheckBoxResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.CheckBoxResult((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CheckBoxResult checkBoxResult = (SubmitFormRequest.ElementResult.CheckBoxResult) obj;
        reverseProtoWriter.getClass();
        checkBoxResult.getClass();
        reverseProtoWriter.writeBytes(checkBoxResult.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, checkBoxResult.is_checked);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.CheckBoxResult checkBoxResult = (SubmitFormRequest.ElementResult.CheckBoxResult) obj;
        checkBoxResult.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, checkBoxResult.is_checked) + checkBoxResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult.CheckBoxResult checkBoxResult = (SubmitFormRequest.ElementResult.CheckBoxResult) obj;
        checkBoxResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = checkBoxResult.is_checked;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.CheckBoxResult(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CheckBoxResult checkBoxResult = (SubmitFormRequest.ElementResult.CheckBoxResult) obj;
        checkBoxResult.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, checkBoxResult.is_checked);
        protoWriter.writeBytes(checkBoxResult.unknownFields());
    }
}
