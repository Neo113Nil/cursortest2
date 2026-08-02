package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$DateInputResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.DateInputResult((Integer) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.DateInputResult dateInputResult = (SubmitFormRequest.ElementResult.DateInputResult) obj;
        reverseProtoWriter.getClass();
        dateInputResult.getClass();
        reverseProtoWriter.writeBytes(dateInputResult.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dateInputResult.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dateInputResult.month);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dateInputResult.day);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.DateInputResult dateInputResult = (SubmitFormRequest.ElementResult.DateInputResult) obj;
        dateInputResult.getClass();
        int size$okio = dateInputResult.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        return protoAdapter.encodedSizeWithTag(3, dateInputResult.year) + protoAdapter.encodedSizeWithTag(2, dateInputResult.month) + protoAdapter.encodedSizeWithTag(1, dateInputResult.day) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitFormRequest.ElementResult.DateInputResult) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.DateInputResult((Integer) null, (Integer) null, (Integer) null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.DateInputResult dateInputResult = (SubmitFormRequest.ElementResult.DateInputResult) obj;
        dateInputResult.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(protoWriter, 1, dateInputResult.day);
        protoAdapter.encodeWithTag(protoWriter, 2, dateInputResult.month);
        protoAdapter.encodeWithTag(protoWriter, 3, dateInputResult.year);
        protoWriter.writeBytes(dateInputResult.unknownFields());
    }
}
