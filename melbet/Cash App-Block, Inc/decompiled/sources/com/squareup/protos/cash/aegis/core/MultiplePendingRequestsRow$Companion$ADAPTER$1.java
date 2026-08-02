package com.squareup.protos.cash.aegis.core;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MultiplePendingRequestsRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MultiplePendingRequestsRow((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MultiplePendingRequestsRow multiplePendingRequestsRow = (MultiplePendingRequestsRow) obj;
        reverseProtoWriter.getClass();
        multiplePendingRequestsRow.getClass();
        reverseProtoWriter.writeBytes(multiplePendingRequestsRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, multiplePendingRequestsRow.pending_requests_url);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, multiplePendingRequestsRow.subtitle_customer_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, multiplePendingRequestsRow.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MultiplePendingRequestsRow multiplePendingRequestsRow = (MultiplePendingRequestsRow) obj;
        multiplePendingRequestsRow.getClass();
        int size$okio = multiplePendingRequestsRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, multiplePendingRequestsRow.pending_requests_url) + protoAdapter.asRepeated().encodedSizeWithTag(5, multiplePendingRequestsRow.subtitle_customer_tokens) + protoAdapter.encodedSizeWithTag(2, multiplePendingRequestsRow.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MultiplePendingRequestsRow multiplePendingRequestsRow = (MultiplePendingRequestsRow) obj;
        multiplePendingRequestsRow.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = multiplePendingRequestsRow.subtitle_customer_tokens;
        list.getClass();
        byteString.getClass();
        return new MultiplePendingRequestsRow(null, null, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MultiplePendingRequestsRow multiplePendingRequestsRow = (MultiplePendingRequestsRow) obj;
        multiplePendingRequestsRow.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, multiplePendingRequestsRow.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, multiplePendingRequestsRow.subtitle_customer_tokens);
        protoAdapter.encodeWithTag(protoWriter, 4, multiplePendingRequestsRow.pending_requests_url);
        protoWriter.writeBytes(multiplePendingRequestsRow.unknownFields());
    }
}
