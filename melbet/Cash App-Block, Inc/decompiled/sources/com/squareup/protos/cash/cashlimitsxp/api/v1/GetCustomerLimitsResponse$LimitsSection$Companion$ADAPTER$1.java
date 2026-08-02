package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$LimitsSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerLimitsResponse.LimitsSection((String) obj, m, (String) obj2, (GetCustomerLimitsResponse.LimitsSection.SectionType) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj3 = GetCustomerLimitsResponse.LimitsSection.SectionType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection limitsSection = (GetCustomerLimitsResponse.LimitsSection) obj;
        reverseProtoWriter.getClass();
        limitsSection.getClass();
        reverseProtoWriter.writeBytes(limitsSection.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, limitsSection.subtitle_text);
        GetCustomerLimitsResponse.LimitsSection.SectionType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, limitsSection.section_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, limitsSection.description_text);
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, limitsSection.limits_categories);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, limitsSection.header_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse.LimitsSection limitsSection = (GetCustomerLimitsResponse.LimitsSection) obj;
        limitsSection.getClass();
        int size$okio = limitsSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, limitsSection.subtitle_text) + GetCustomerLimitsResponse.LimitsSection.SectionType.ADAPTER.encodedSizeWithTag(4, limitsSection.section_type) + protoAdapter.encodedSizeWithTag(3, limitsSection.description_text) + GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ADAPTER.asRepeated().encodedSizeWithTag(2, limitsSection.limits_categories) + protoAdapter.encodedSizeWithTag(1, limitsSection.header_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.LimitsSection limitsSection = (GetCustomerLimitsResponse.LimitsSection) obj;
        limitsSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(limitsSection.limits_categories, GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = limitsSection.header_text;
        String str2 = limitsSection.description_text;
        GetCustomerLimitsResponse.LimitsSection.SectionType sectionType = limitsSection.section_type;
        String str3 = limitsSection.subtitle_text;
        byteString.getClass();
        return new GetCustomerLimitsResponse.LimitsSection(str, m1169redactElements, str2, sectionType, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection limitsSection = (GetCustomerLimitsResponse.LimitsSection) obj;
        limitsSection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, limitsSection.header_text);
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, limitsSection.limits_categories);
        protoAdapter.encodeWithTag(protoWriter, 3, limitsSection.description_text);
        GetCustomerLimitsResponse.LimitsSection.SectionType.ADAPTER.encodeWithTag(protoWriter, 4, limitsSection.section_type);
        protoAdapter.encodeWithTag(protoWriter, 6, limitsSection.subtitle_text);
        protoWriter.writeBytes(limitsSection.unknownFields());
    }
}
