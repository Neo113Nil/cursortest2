package com.squareup.protos.cash.cashlimitsxp.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInlineMessageResponse$LimitsHubInlineMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInlineMessageResponse.LimitsHubInlineMessage((GetInlineMessageResponse.LimitsHubInlineMessage.Icon) obj3, (String) obj4, (String) obj5, (GetInlineMessageResponse.LimitsHubInlineMessageButton) obj6, (Long) obj7, (GetInlineMessageResponse.LimitsHubInlineMessageButton) obj8, (GetInlineMessageResponse.LimitsHubInlineMessage.Illustration) obj9, (String) obj10, (String) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj3 = GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj8 = TransactorKt.decodeMessageOrMerge(GetInlineMessageResponse.LimitsHubInlineMessageButton.ADAPTER, protoReader, obj8);
                    continue;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(GetInlineMessageResponse.LimitsHubInlineMessageButton.ADAPTER, protoReader, obj6);
                    continue;
                case 6:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    continue;
                case 7:
                    obj9 = TransactorKt.decodeMessageOrMerge(GetInlineMessageResponse.LimitsHubInlineMessage.Illustration.ADAPTER, protoReader, obj9);
                    continue;
                case 8:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
            }
            obj4 = obj2;
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage = (GetInlineMessageResponse.LimitsHubInlineMessage) obj;
        reverseProtoWriter.getClass();
        limitsHubInlineMessage.getClass();
        reverseProtoWriter.writeBytes(limitsHubInlineMessage.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, limitsHubInlineMessage.description_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, limitsHubInlineMessage.title_text);
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration.ADAPTER.encodeWithTag(reverseProtoWriter, 7, limitsHubInlineMessage.illustration);
        ProtoAdapter protoAdapter2 = GetInlineMessageResponse.LimitsHubInlineMessageButton.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, limitsHubInlineMessage.primary_button);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, limitsHubInlineMessage.version);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, limitsHubInlineMessage.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, limitsHubInlineMessage.subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, limitsHubInlineMessage.main_text);
        GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, limitsHubInlineMessage.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage = (GetInlineMessageResponse.LimitsHubInlineMessage) obj;
        limitsHubInlineMessage.getClass();
        int encodedSizeWithTag = GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ADAPTER.encodedSizeWithTag(1, limitsHubInlineMessage.icon) + limitsHubInlineMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, limitsHubInlineMessage.subtext) + protoAdapter.encodedSizeWithTag(2, limitsHubInlineMessage.main_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = GetInlineMessageResponse.LimitsHubInlineMessageButton.ADAPTER;
        return protoAdapter.encodedSizeWithTag(9, limitsHubInlineMessage.description_text) + protoAdapter.encodedSizeWithTag(8, limitsHubInlineMessage.title_text) + GetInlineMessageResponse.LimitsHubInlineMessage.Illustration.ADAPTER.encodedSizeWithTag(7, limitsHubInlineMessage.illustration) + protoAdapter2.encodedSizeWithTag(4, limitsHubInlineMessage.primary_button) + ProtoAdapter.INT64.encodedSizeWithTag(6, limitsHubInlineMessage.version) + protoAdapter2.encodedSizeWithTag(5, limitsHubInlineMessage.secondary_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage = (GetInlineMessageResponse.LimitsHubInlineMessage) obj;
        limitsHubInlineMessage.getClass();
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton = limitsHubInlineMessage.secondary_button;
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton2 = limitsHubInlineMessageButton != null ? (GetInlineMessageResponse.LimitsHubInlineMessageButton) GetInlineMessageResponse.LimitsHubInlineMessageButton.ADAPTER.redact(limitsHubInlineMessageButton) : null;
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton3 = limitsHubInlineMessage.primary_button;
        GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton4 = limitsHubInlineMessageButton3 != null ? (GetInlineMessageResponse.LimitsHubInlineMessageButton) GetInlineMessageResponse.LimitsHubInlineMessageButton.ADAPTER.redact(limitsHubInlineMessageButton3) : null;
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration illustration = limitsHubInlineMessage.illustration;
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration illustration2 = illustration != null ? (GetInlineMessageResponse.LimitsHubInlineMessage.Illustration) GetInlineMessageResponse.LimitsHubInlineMessage.Illustration.ADAPTER.redact(illustration) : null;
        ByteString byteString = ByteString.EMPTY;
        GetInlineMessageResponse.LimitsHubInlineMessage.Icon icon = limitsHubInlineMessage.icon;
        String str = limitsHubInlineMessage.main_text;
        String str2 = limitsHubInlineMessage.subtext;
        Long l = limitsHubInlineMessage.version;
        String str3 = limitsHubInlineMessage.title_text;
        String str4 = limitsHubInlineMessage.description_text;
        byteString.getClass();
        return new GetInlineMessageResponse.LimitsHubInlineMessage(icon, str, str2, limitsHubInlineMessageButton2, l, limitsHubInlineMessageButton4, illustration2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage = (GetInlineMessageResponse.LimitsHubInlineMessage) obj;
        limitsHubInlineMessage.getClass();
        GetInlineMessageResponse.LimitsHubInlineMessage.Icon.ADAPTER.encodeWithTag(protoWriter, 1, limitsHubInlineMessage.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, limitsHubInlineMessage.main_text);
        protoAdapter.encodeWithTag(protoWriter, 3, limitsHubInlineMessage.subtext);
        ProtoAdapter protoAdapter2 = GetInlineMessageResponse.LimitsHubInlineMessageButton.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, limitsHubInlineMessage.secondary_button);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, limitsHubInlineMessage.version);
        protoAdapter2.encodeWithTag(protoWriter, 4, limitsHubInlineMessage.primary_button);
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration.ADAPTER.encodeWithTag(protoWriter, 7, limitsHubInlineMessage.illustration);
        protoAdapter.encodeWithTag(protoWriter, 8, limitsHubInlineMessage.title_text);
        protoAdapter.encodeWithTag(protoWriter, 9, limitsHubInlineMessage.description_text);
        protoWriter.writeBytes(limitsHubInlineMessage.unknownFields());
    }
}
