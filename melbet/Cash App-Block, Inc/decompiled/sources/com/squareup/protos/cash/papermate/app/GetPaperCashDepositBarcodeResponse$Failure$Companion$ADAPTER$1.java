package com.squareup.protos.cash.papermate.app;

import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetPaperCashDepositBarcodeResponse$Failure$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetPaperCashDepositBarcodeResponse.Failure((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse.Failure failure = (GetPaperCashDepositBarcodeResponse.Failure) obj;
        reverseProtoWriter.getClass();
        failure.getClass();
        reverseProtoWriter.writeBytes(failure.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, failure.close_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, failure.detail_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, failure.title_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPaperCashDepositBarcodeResponse.Failure failure = (GetPaperCashDepositBarcodeResponse.Failure) obj;
        failure.getClass();
        int size$okio = failure.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, failure.close_button_text) + protoAdapter.encodedSizeWithTag(2, failure.detail_text) + protoAdapter.encodedSizeWithTag(1, failure.title_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaperCashDepositBarcodeResponse.Failure failure = (GetPaperCashDepositBarcodeResponse.Failure) obj;
        failure.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = failure.title_text;
        String str2 = failure.detail_text;
        String str3 = failure.close_button_text;
        byteString.getClass();
        return new GetPaperCashDepositBarcodeResponse.Failure(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse.Failure failure = (GetPaperCashDepositBarcodeResponse.Failure) obj;
        failure.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, failure.title_text);
        protoAdapter.encodeWithTag(protoWriter, 2, failure.detail_text);
        protoAdapter.encodeWithTag(protoWriter, 3, failure.close_button_text);
        protoWriter.writeBytes(failure.unknownFields());
    }
}
