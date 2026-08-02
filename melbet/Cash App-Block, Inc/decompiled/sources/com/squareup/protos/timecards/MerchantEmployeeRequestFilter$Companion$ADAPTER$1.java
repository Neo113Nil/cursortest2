package com.squareup.protos.timecards;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MerchantEmployeeRequestFilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MerchantEmployeeRequestFilter((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = (MerchantEmployeeRequestFilter) obj;
        reverseProtoWriter.getClass();
        merchantEmployeeRequestFilter.getClass();
        reverseProtoWriter.writeBytes(merchantEmployeeRequestFilter.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, merchantEmployeeRequestFilter.unit_token);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, merchantEmployeeRequestFilter.employee_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, merchantEmployeeRequestFilter.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = (MerchantEmployeeRequestFilter) obj;
        merchantEmployeeRequestFilter.getClass();
        int size$okio = merchantEmployeeRequestFilter.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, merchantEmployeeRequestFilter.unit_token) + protoAdapter.asRepeated().encodedSizeWithTag(2, merchantEmployeeRequestFilter.employee_token) + protoAdapter.encodedSizeWithTag(1, merchantEmployeeRequestFilter.merchant_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = (MerchantEmployeeRequestFilter) obj;
        merchantEmployeeRequestFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = merchantEmployeeRequestFilter.merchant_token;
        List list = merchantEmployeeRequestFilter.employee_token;
        List list2 = merchantEmployeeRequestFilter.unit_token;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new MerchantEmployeeRequestFilter(str, list, list2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = (MerchantEmployeeRequestFilter) obj;
        merchantEmployeeRequestFilter.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, merchantEmployeeRequestFilter.merchant_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, merchantEmployeeRequestFilter.employee_token);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, merchantEmployeeRequestFilter.unit_token);
        protoWriter.writeBytes(merchantEmployeeRequestFilter.unknownFields());
    }
}
