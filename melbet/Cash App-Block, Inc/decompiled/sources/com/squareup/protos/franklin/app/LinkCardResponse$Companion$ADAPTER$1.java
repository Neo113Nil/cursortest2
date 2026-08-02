package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.app.LinkCardResponse;
import com.squareup.protos.franklin.common.FieldName;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LinkCardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LinkCardResponse((ResponseContext) obj, (LinkCardResponse.Status) obj2, (FieldName) obj3, (String) obj4, (String) obj5, (Instrument) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = LinkCardResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj3 = FieldName.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 7) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 9) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 11) {
                obj6 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj6);
            } else if (nextTag == 14) {
                obj7 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 15) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LinkCardResponse linkCardResponse = (LinkCardResponse) obj;
        reverseProtoWriter.getClass();
        linkCardResponse.getClass();
        reverseProtoWriter.writeBytes(linkCardResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, linkCardResponse.verification_instrument_token);
        Instrument.ADAPTER.encodeWithTag(reverseProtoWriter, 11, linkCardResponse.instrument);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, linkCardResponse.unencrypted_pan_ocr_result);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, linkCardResponse.passcode_token);
        FieldName.ADAPTER.encodeWithTag(reverseProtoWriter, 2, linkCardResponse.failure_field);
        LinkCardResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, linkCardResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 15, linkCardResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LinkCardResponse linkCardResponse = (LinkCardResponse) obj;
        linkCardResponse.getClass();
        int encodedSizeWithTag = FieldName.ADAPTER.encodedSizeWithTag(2, linkCardResponse.failure_field) + LinkCardResponse.Status.ADAPTER.encodedSizeWithTag(1, linkCardResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(15, linkCardResponse.response_context) + linkCardResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(14, linkCardResponse.verification_instrument_token) + Instrument.ADAPTER.encodedSizeWithTag(11, linkCardResponse.instrument) + protoAdapter.encodedSizeWithTag(9, linkCardResponse.unencrypted_pan_ocr_result) + protoAdapter.encodedSizeWithTag(7, linkCardResponse.passcode_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LinkCardResponse linkCardResponse = (LinkCardResponse) obj;
        linkCardResponse.getClass();
        ResponseContext responseContext = linkCardResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        Instrument instrument = linkCardResponse.instrument;
        Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
        ByteString byteString = ByteString.EMPTY;
        LinkCardResponse.Status status = linkCardResponse.status;
        FieldName fieldName = linkCardResponse.failure_field;
        String str = linkCardResponse.verification_instrument_token;
        byteString.getClass();
        return new LinkCardResponse(responseContext2, status, fieldName, null, null, instrument2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LinkCardResponse linkCardResponse = (LinkCardResponse) obj;
        linkCardResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 15, linkCardResponse.response_context);
        LinkCardResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, linkCardResponse.status);
        FieldName.ADAPTER.encodeWithTag(protoWriter, 2, linkCardResponse.failure_field);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 7, linkCardResponse.passcode_token);
        protoAdapter.encodeWithTag(protoWriter, 9, linkCardResponse.unencrypted_pan_ocr_result);
        Instrument.ADAPTER.encodeWithTag(protoWriter, 11, linkCardResponse.instrument);
        protoAdapter.encodeWithTag(protoWriter, 14, linkCardResponse.verification_instrument_token);
        protoWriter.writeBytes(linkCardResponse.unknownFields());
    }
}
