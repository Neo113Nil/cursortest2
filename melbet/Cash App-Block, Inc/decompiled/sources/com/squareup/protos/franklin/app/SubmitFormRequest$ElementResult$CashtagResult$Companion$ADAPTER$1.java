package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$CashtagResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.CashtagResult((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CashtagResult cashtagResult = (SubmitFormRequest.ElementResult.CashtagResult) obj;
        reverseProtoWriter.getClass();
        cashtagResult.getClass();
        reverseProtoWriter.writeBytes(cashtagResult.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, cashtagResult.cashtag);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.CashtagResult cashtagResult = (SubmitFormRequest.ElementResult.CashtagResult) obj;
        cashtagResult.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, cashtagResult.cashtag) + cashtagResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitFormRequest.ElementResult.CashtagResult) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.CashtagResult(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CashtagResult cashtagResult = (SubmitFormRequest.ElementResult.CashtagResult) obj;
        cashtagResult.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, cashtagResult.cashtag);
        protoWriter.writeBytes(cashtagResult.unknownFields());
    }
}
