package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/TemplateCardServerToolCall$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TemplateCardServerToolCall;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TemplateCardServerToolCall$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TemplateCardServerToolCall((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TemplateCardServerToolCall templateCardServerToolCall = (TemplateCardServerToolCall) obj;
        reverseProtoWriter.getClass();
        templateCardServerToolCall.getClass();
        reverseProtoWriter.writeBytes(templateCardServerToolCall.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, templateCardServerToolCall.arguments_template);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, templateCardServerToolCall.tool_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, templateCardServerToolCall.extension_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TemplateCardServerToolCall templateCardServerToolCall = (TemplateCardServerToolCall) obj;
        templateCardServerToolCall.getClass();
        int size$okio = templateCardServerToolCall.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, templateCardServerToolCall.arguments_template) + protoAdapter.encodedSizeWithTag(3, templateCardServerToolCall.tool_name) + protoAdapter.encodedSizeWithTag(1, templateCardServerToolCall.extension_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TemplateCardServerToolCall templateCardServerToolCall = (TemplateCardServerToolCall) obj;
        templateCardServerToolCall.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = templateCardServerToolCall.extension_name;
        String str2 = templateCardServerToolCall.tool_name;
        String str3 = templateCardServerToolCall.arguments_template;
        byteString.getClass();
        return new TemplateCardServerToolCall(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TemplateCardServerToolCall templateCardServerToolCall = (TemplateCardServerToolCall) obj;
        templateCardServerToolCall.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, templateCardServerToolCall.extension_name);
        protoAdapter.encodeWithTag(protoWriter, 3, templateCardServerToolCall.tool_name);
        protoAdapter.encodeWithTag(protoWriter, 2, templateCardServerToolCall.arguments_template);
        protoWriter.writeBytes(templateCardServerToolCall.unknownFields());
    }
}
