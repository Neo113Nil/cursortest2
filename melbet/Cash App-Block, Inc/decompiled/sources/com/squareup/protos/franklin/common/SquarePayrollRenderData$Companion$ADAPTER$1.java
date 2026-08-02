package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SquarePayrollRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SquarePayrollRenderData((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SquarePayrollRenderData squarePayrollRenderData = (SquarePayrollRenderData) obj;
        reverseProtoWriter.getClass();
        squarePayrollRenderData.getClass();
        reverseProtoWriter.writeBytes(squarePayrollRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, squarePayrollRenderData.paystub_link);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, squarePayrollRenderData.paystub_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, squarePayrollRenderData.employer_display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SquarePayrollRenderData squarePayrollRenderData = (SquarePayrollRenderData) obj;
        squarePayrollRenderData.getClass();
        int size$okio = squarePayrollRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, squarePayrollRenderData.paystub_link) + protoAdapter.encodedSizeWithTag(2, squarePayrollRenderData.paystub_url) + protoAdapter.encodedSizeWithTag(1, squarePayrollRenderData.employer_display_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SquarePayrollRenderData squarePayrollRenderData = (SquarePayrollRenderData) obj;
        squarePayrollRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = squarePayrollRenderData.paystub_url;
        String str2 = squarePayrollRenderData.paystub_link;
        byteString.getClass();
        return new SquarePayrollRenderData(null, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SquarePayrollRenderData squarePayrollRenderData = (SquarePayrollRenderData) obj;
        squarePayrollRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, squarePayrollRenderData.employer_display_name);
        protoAdapter.encodeWithTag(protoWriter, 2, squarePayrollRenderData.paystub_url);
        protoAdapter.encodeWithTag(protoWriter, 3, squarePayrollRenderData.paystub_link);
        protoWriter.writeBytes(squarePayrollRenderData.unknownFields());
    }
}
