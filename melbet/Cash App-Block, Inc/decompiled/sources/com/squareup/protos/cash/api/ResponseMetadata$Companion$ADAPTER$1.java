package com.squareup.protos.cash.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ResponseMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResponseMetadata(m, responseMetadata$Result$UpsertResult, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Error.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    responseMetadata$Result$UpsertResult = new ResponseMetadata$Result$UpsertResult((ResponseMetadata.UpsertResult) ResponseMetadata.UpsertResult.ADAPTER.decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ResponseMetadata responseMetadata = (ResponseMetadata) obj;
        reverseProtoWriter.getClass();
        responseMetadata.getClass();
        reverseProtoWriter.writeBytes(responseMetadata.unknownFields());
        ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult = responseMetadata.result;
        if (responseMetadata$Result$UpsertResult != null) {
            ResponseMetadata.UpsertResult.ADAPTER.encodeWithTag(reverseProtoWriter, 2, responseMetadata$Result$UpsertResult.value);
        } else if (responseMetadata$Result$UpsertResult != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Error.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, responseMetadata.errors);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ResponseMetadata responseMetadata = (ResponseMetadata) obj;
        responseMetadata.getClass();
        int encodedSizeWithTag = Error.ADAPTER.asRepeated().encodedSizeWithTag(1, responseMetadata.errors) + responseMetadata.unknownFields().getSize$okio();
        ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult = responseMetadata.result;
        if (responseMetadata$Result$UpsertResult != null) {
            return ResponseMetadata.UpsertResult.ADAPTER.encodedSizeWithTag(2, responseMetadata$Result$UpsertResult.value) + encodedSizeWithTag;
        }
        if (responseMetadata$Result$UpsertResult == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResponseMetadata responseMetadata = (ResponseMetadata) obj;
        responseMetadata.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(responseMetadata.errors, Error.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult = responseMetadata.result;
        byteString.getClass();
        return new ResponseMetadata(m1169redactElements, responseMetadata$Result$UpsertResult, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResponseMetadata responseMetadata = (ResponseMetadata) obj;
        responseMetadata.getClass();
        Error.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, responseMetadata.errors);
        ResponseMetadata$Result$UpsertResult responseMetadata$Result$UpsertResult = responseMetadata.result;
        if (responseMetadata$Result$UpsertResult != null) {
            ResponseMetadata.UpsertResult.ADAPTER.encodeWithTag(protoWriter, 2, responseMetadata$Result$UpsertResult.value);
        } else if (responseMetadata$Result$UpsertResult != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(responseMetadata.unknownFields());
    }
}
