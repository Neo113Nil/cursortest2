package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentFilterGroup$SubfilterOption$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncInvestmentFilterGroup.SubfilterOption((String) obj, (String) obj2, (SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncInvestmentFilterGroup.SubfilterOption subfilterOption = (SyncInvestmentFilterGroup.SubfilterOption) obj;
        reverseProtoWriter.getClass();
        subfilterOption.getClass();
        reverseProtoWriter.writeBytes(subfilterOption.unknownFields());
        SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.ADAPTER.encodeWithTag(reverseProtoWriter, 3, subfilterOption.glyph);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, subfilterOption.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, subfilterOption.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncInvestmentFilterGroup.SubfilterOption subfilterOption = (SyncInvestmentFilterGroup.SubfilterOption) obj;
        subfilterOption.getClass();
        int size$okio = subfilterOption.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.ADAPTER.encodedSizeWithTag(3, subfilterOption.glyph) + protoAdapter.encodedSizeWithTag(2, subfilterOption.name) + protoAdapter.encodedSizeWithTag(1, subfilterOption.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncInvestmentFilterGroup.SubfilterOption subfilterOption = (SyncInvestmentFilterGroup.SubfilterOption) obj;
        subfilterOption.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = subfilterOption.token;
        String str2 = subfilterOption.name;
        SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph optionGlyph = subfilterOption.glyph;
        byteString.getClass();
        return new SyncInvestmentFilterGroup.SubfilterOption(str, str2, optionGlyph, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncInvestmentFilterGroup.SubfilterOption subfilterOption = (SyncInvestmentFilterGroup.SubfilterOption) obj;
        subfilterOption.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, subfilterOption.token);
        protoAdapter.encodeWithTag(protoWriter, 2, subfilterOption.name);
        SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph.ADAPTER.encodeWithTag(protoWriter, 3, subfilterOption.glyph);
        protoWriter.writeBytes(subfilterOption.unknownFields());
    }
}
