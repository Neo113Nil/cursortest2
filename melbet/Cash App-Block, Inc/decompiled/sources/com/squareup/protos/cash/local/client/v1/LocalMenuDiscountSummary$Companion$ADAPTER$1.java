package com.squareup.protos.cash.local.client.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuDiscountSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuDiscountSummary((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuDiscountSummary localMenuDiscountSummary = (LocalMenuDiscountSummary) obj;
        reverseProtoWriter.getClass();
        localMenuDiscountSummary.getClass();
        reverseProtoWriter.writeBytes(localMenuDiscountSummary.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, localMenuDiscountSummary.details);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuDiscountSummary.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuDiscountSummary.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuDiscountSummary localMenuDiscountSummary = (LocalMenuDiscountSummary) obj;
        localMenuDiscountSummary.getClass();
        int size$okio = localMenuDiscountSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, localMenuDiscountSummary.details) + protoAdapter.encodedSizeWithTag(2, localMenuDiscountSummary.name) + protoAdapter.encodedSizeWithTag(1, localMenuDiscountSummary.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuDiscountSummary localMenuDiscountSummary = (LocalMenuDiscountSummary) obj;
        localMenuDiscountSummary.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuDiscountSummary.token;
        String str2 = localMenuDiscountSummary.name;
        List list = localMenuDiscountSummary.details;
        list.getClass();
        byteString.getClass();
        return new LocalMenuDiscountSummary(str, str2, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuDiscountSummary localMenuDiscountSummary = (LocalMenuDiscountSummary) obj;
        localMenuDiscountSummary.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuDiscountSummary.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuDiscountSummary.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, localMenuDiscountSummary.details);
        protoWriter.writeBytes(localMenuDiscountSummary.unknownFields());
    }
}
