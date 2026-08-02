package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncInvestmentFilterGroup$Subfilter$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncInvestmentFilterGroup.Subfilter((String) obj, (SyncInvestmentFilterGroup.Subfilter.SubfilterType) obj2, (String) obj3, (Long) obj4, (String) obj5, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = SyncInvestmentFilterGroup.Subfilter.SubfilterType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    m.add(SyncInvestmentFilterGroup.SubfilterOption.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentFilterGroup.Subfilter subfilter = (SyncInvestmentFilterGroup.Subfilter) obj;
        reverseProtoWriter.getClass();
        subfilter.getClass();
        reverseProtoWriter.writeBytes(subfilter.unknownFields());
        SyncInvestmentFilterGroup.SubfilterOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, subfilter.options);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, subfilter.placeholder_text);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, subfilter.placeholder_index);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, subfilter.name);
        SyncInvestmentFilterGroup.Subfilter.SubfilterType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, subfilter.f1392type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, subfilter.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentFilterGroup.Subfilter subfilter = (SyncInvestmentFilterGroup.Subfilter) obj;
        subfilter.getClass();
        int size$okio = subfilter.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SyncInvestmentFilterGroup.SubfilterOption.ADAPTER.asRepeated().encodedSizeWithTag(6, subfilter.options) + protoAdapter.encodedSizeWithTag(5, subfilter.placeholder_text) + ProtoAdapter.INT64.encodedSizeWithTag(4, subfilter.placeholder_index) + protoAdapter.encodedSizeWithTag(3, subfilter.name) + SyncInvestmentFilterGroup.Subfilter.SubfilterType.ADAPTER.encodedSizeWithTag(2, subfilter.f1392type) + protoAdapter.encodedSizeWithTag(1, subfilter.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentFilterGroup.Subfilter subfilter = (SyncInvestmentFilterGroup.Subfilter) obj;
        subfilter.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(subfilter.options, SyncInvestmentFilterGroup.SubfilterOption.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = subfilter.token;
        SyncInvestmentFilterGroup.Subfilter.SubfilterType subfilterType = subfilter.f1392type;
        String str2 = subfilter.name;
        Long l = subfilter.placeholder_index;
        String str3 = subfilter.placeholder_text;
        byteString.getClass();
        return new SyncInvestmentFilterGroup.Subfilter(str, subfilterType, str2, l, str3, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentFilterGroup.Subfilter subfilter = (SyncInvestmentFilterGroup.Subfilter) obj;
        subfilter.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, subfilter.token);
        SyncInvestmentFilterGroup.Subfilter.SubfilterType.ADAPTER.encodeWithTag(protoWriter, 2, subfilter.f1392type);
        protoAdapter.encodeWithTag(protoWriter, 3, subfilter.name);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, subfilter.placeholder_index);
        protoAdapter.encodeWithTag(protoWriter, 5, subfilter.placeholder_text);
        SyncInvestmentFilterGroup.SubfilterOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, subfilter.options);
        protoWriter.writeBytes(subfilter.unknownFields());
    }
}
