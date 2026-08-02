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
public final class LocalMenuDiscountDetail$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuDiscountDetail((String) obj, (String) obj2, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuDiscountDetail localMenuDiscountDetail = (LocalMenuDiscountDetail) obj;
        reverseProtoWriter.getClass();
        localMenuDiscountDetail.getClass();
        reverseProtoWriter.writeBytes(localMenuDiscountDetail.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, localMenuDiscountDetail.eligibility_detail_lines);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, localMenuDiscountDetail.eligible_object_names);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuDiscountDetail.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuDiscountDetail.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalMenuDiscountDetail localMenuDiscountDetail = (LocalMenuDiscountDetail) obj;
        localMenuDiscountDetail.getClass();
        int size$okio = localMenuDiscountDetail.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(4, localMenuDiscountDetail.eligibility_detail_lines) + protoAdapter.asRepeated().encodedSizeWithTag(3, localMenuDiscountDetail.eligible_object_names) + protoAdapter.encodedSizeWithTag(2, localMenuDiscountDetail.name) + protoAdapter.encodedSizeWithTag(1, localMenuDiscountDetail.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuDiscountDetail localMenuDiscountDetail = (LocalMenuDiscountDetail) obj;
        localMenuDiscountDetail.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuDiscountDetail.token;
        String str2 = localMenuDiscountDetail.name;
        List list = localMenuDiscountDetail.eligible_object_names;
        List list2 = localMenuDiscountDetail.eligibility_detail_lines;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new LocalMenuDiscountDetail(str, str2, list, list2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuDiscountDetail localMenuDiscountDetail = (LocalMenuDiscountDetail) obj;
        localMenuDiscountDetail.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuDiscountDetail.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuDiscountDetail.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, localMenuDiscountDetail.eligible_object_names);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, localMenuDiscountDetail.eligibility_detail_lines);
        protoWriter.writeBytes(localMenuDiscountDetail.unknownFields());
    }
}
