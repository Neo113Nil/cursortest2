package com.squareup.protos.cash.cashidv.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SsnScreenRenderConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SsnScreenRenderConfig((String) obj, (String) obj2, (String) obj4, (String) obj5, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SsnScreenRenderConfig ssnScreenRenderConfig = (SsnScreenRenderConfig) obj;
        reverseProtoWriter.getClass();
        ssnScreenRenderConfig.getClass();
        reverseProtoWriter.writeBytes(ssnScreenRenderConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, ssnScreenRenderConfig.full_9_subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, ssnScreenRenderConfig.full_9_main_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, ssnScreenRenderConfig.last_4_show_ssa_consent);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, ssnScreenRenderConfig.last_4_subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, ssnScreenRenderConfig.last_4_main_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SsnScreenRenderConfig ssnScreenRenderConfig = (SsnScreenRenderConfig) obj;
        ssnScreenRenderConfig.getClass();
        int size$okio = ssnScreenRenderConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, ssnScreenRenderConfig.full_9_subtext) + protoAdapter.encodedSizeWithTag(4, ssnScreenRenderConfig.full_9_main_text) + ProtoAdapter.BOOL.encodedSizeWithTag(3, ssnScreenRenderConfig.last_4_show_ssa_consent) + protoAdapter.encodedSizeWithTag(2, ssnScreenRenderConfig.last_4_subtext) + protoAdapter.encodedSizeWithTag(1, ssnScreenRenderConfig.last_4_main_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SsnScreenRenderConfig ssnScreenRenderConfig = (SsnScreenRenderConfig) obj;
        ssnScreenRenderConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = ssnScreenRenderConfig.last_4_main_text;
        String str2 = ssnScreenRenderConfig.last_4_subtext;
        Boolean bool = ssnScreenRenderConfig.last_4_show_ssa_consent;
        String str3 = ssnScreenRenderConfig.full_9_main_text;
        String str4 = ssnScreenRenderConfig.full_9_subtext;
        byteString.getClass();
        return new SsnScreenRenderConfig(str, str2, str3, str4, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SsnScreenRenderConfig ssnScreenRenderConfig = (SsnScreenRenderConfig) obj;
        ssnScreenRenderConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, ssnScreenRenderConfig.last_4_main_text);
        protoAdapter.encodeWithTag(protoWriter, 2, ssnScreenRenderConfig.last_4_subtext);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, ssnScreenRenderConfig.last_4_show_ssa_consent);
        protoAdapter.encodeWithTag(protoWriter, 4, ssnScreenRenderConfig.full_9_main_text);
        protoAdapter.encodeWithTag(protoWriter, 5, ssnScreenRenderConfig.full_9_subtext);
        protoWriter.writeBytes(ssnScreenRenderConfig.unknownFields());
    }
}
