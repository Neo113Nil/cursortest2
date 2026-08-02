package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SsnTooltipConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SsnTooltipConfig((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SsnTooltipConfig ssnTooltipConfig = (SsnTooltipConfig) obj;
        reverseProtoWriter.getClass();
        ssnTooltipConfig.getClass();
        reverseProtoWriter.writeBytes(ssnTooltipConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, ssnTooltipConfig.subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, ssnTooltipConfig.main_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SsnTooltipConfig ssnTooltipConfig = (SsnTooltipConfig) obj;
        ssnTooltipConfig.getClass();
        int size$okio = ssnTooltipConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, ssnTooltipConfig.subtext) + protoAdapter.encodedSizeWithTag(1, ssnTooltipConfig.main_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SsnTooltipConfig ssnTooltipConfig = (SsnTooltipConfig) obj;
        ssnTooltipConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = ssnTooltipConfig.main_text;
        String str2 = ssnTooltipConfig.subtext;
        byteString.getClass();
        return new SsnTooltipConfig(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SsnTooltipConfig ssnTooltipConfig = (SsnTooltipConfig) obj;
        ssnTooltipConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, ssnTooltipConfig.main_text);
        protoAdapter.encodeWithTag(protoWriter, 2, ssnTooltipConfig.subtext);
        protoWriter.writeBytes(ssnTooltipConfig.unknownFields());
    }
}
