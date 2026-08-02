package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInlineMessageResponse$LimitsHubInlineMessageButton$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetInlineMessageResponse.LimitsHubInlineMessageButton((String) obj, (GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton = (GetInlineMessageResponse.LimitsHubInlineMessageButton) obj;
        reverseProtoWriter.getClass();
        limitsHubInlineMessageButton.getClass();
        reverseProtoWriter.writeBytes(limitsHubInlineMessageButton.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, limitsHubInlineMessageButton.url_to_open);
        GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, limitsHubInlineMessageButton.button_action);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, limitsHubInlineMessageButton.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton = (GetInlineMessageResponse.LimitsHubInlineMessageButton) obj;
        limitsHubInlineMessageButton.getClass();
        int size$okio = limitsHubInlineMessageButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, limitsHubInlineMessageButton.url_to_open) + GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.ADAPTER.encodedSizeWithTag(2, limitsHubInlineMessageButton.button_action) + protoAdapter.encodedSizeWithTag(1, limitsHubInlineMessageButton.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton = (GetInlineMessageResponse.LimitsHubInlineMessageButton) obj;
        limitsHubInlineMessageButton.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = limitsHubInlineMessageButton.text;
        GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction buttonAction = limitsHubInlineMessageButton.button_action;
        String str2 = limitsHubInlineMessageButton.url_to_open;
        byteString.getClass();
        return new GetInlineMessageResponse.LimitsHubInlineMessageButton(str, buttonAction, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton = (GetInlineMessageResponse.LimitsHubInlineMessageButton) obj;
        limitsHubInlineMessageButton.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, limitsHubInlineMessageButton.text);
        GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.ADAPTER.encodeWithTag(protoWriter, 2, limitsHubInlineMessageButton.button_action);
        protoAdapter.encodeWithTag(protoWriter, 3, limitsHubInlineMessageButton.url_to_open);
        protoWriter.writeBytes(limitsHubInlineMessageButton.unknownFields());
    }
}
