package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LimitsPageletInlineMessage$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LimitsPageletInlineMessage((LimitsPageletInlineMessage.Icon) obj, (String) obj2, (LocalizableString) obj3, (String) obj4, (LocalizableString) obj5, (LimitsPageletInlineMessageButton) obj6, (LimitsPageletInlineMessageButton) obj7, (Long) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = LimitsPageletInlineMessage.Icon.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(LimitsPageletInlineMessageButton.ADAPTER, protoReader, obj6);
                    break;
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(LimitsPageletInlineMessageButton.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 7:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
                    break;
                case 8:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LimitsPageletInlineMessage limitsPageletInlineMessage = (LimitsPageletInlineMessage) obj;
        reverseProtoWriter.getClass();
        limitsPageletInlineMessage.getClass();
        reverseProtoWriter.writeBytes(limitsPageletInlineMessage.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 6, limitsPageletInlineMessage.version);
        ProtoAdapter protoAdapter = LimitsPageletInlineMessageButton.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, limitsPageletInlineMessage.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, limitsPageletInlineMessage.primary_button);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, limitsPageletInlineMessage.localizable_subtext);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, limitsPageletInlineMessage.subtext);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, limitsPageletInlineMessage.localizable_main_text);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, limitsPageletInlineMessage.main_text);
        LimitsPageletInlineMessage.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, limitsPageletInlineMessage.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LimitsPageletInlineMessage limitsPageletInlineMessage = (LimitsPageletInlineMessage) obj;
        limitsPageletInlineMessage.getClass();
        int encodedSizeWithTag = LimitsPageletInlineMessage.Icon.ADAPTER.encodedSizeWithTag(1, limitsPageletInlineMessage.icon) + limitsPageletInlineMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, limitsPageletInlineMessage.main_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(8, limitsPageletInlineMessage.localizable_subtext) + protoAdapter.encodedSizeWithTag(3, limitsPageletInlineMessage.subtext) + protoAdapter2.encodedSizeWithTag(7, limitsPageletInlineMessage.localizable_main_text) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = LimitsPageletInlineMessageButton.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(6, limitsPageletInlineMessage.version) + protoAdapter3.encodedSizeWithTag(5, limitsPageletInlineMessage.secondary_button) + protoAdapter3.encodedSizeWithTag(4, limitsPageletInlineMessage.primary_button) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LimitsPageletInlineMessage limitsPageletInlineMessage = (LimitsPageletInlineMessage) obj;
        limitsPageletInlineMessage.getClass();
        LocalizableString localizableString = limitsPageletInlineMessage.localizable_main_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = limitsPageletInlineMessage.localizable_subtext;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = limitsPageletInlineMessage.primary_button;
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton2 = limitsPageletInlineMessageButton != null ? (LimitsPageletInlineMessageButton) LimitsPageletInlineMessageButton.ADAPTER.redact(limitsPageletInlineMessageButton) : null;
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton3 = limitsPageletInlineMessage.secondary_button;
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton4 = limitsPageletInlineMessageButton3 != null ? (LimitsPageletInlineMessageButton) LimitsPageletInlineMessageButton.ADAPTER.redact(limitsPageletInlineMessageButton3) : null;
        ByteString byteString = ByteString.EMPTY;
        LimitsPageletInlineMessage.Icon icon = limitsPageletInlineMessage.icon;
        Long l = limitsPageletInlineMessage.version;
        byteString.getClass();
        return new LimitsPageletInlineMessage(icon, null, localizableString2, null, localizableString4, limitsPageletInlineMessageButton2, limitsPageletInlineMessageButton4, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LimitsPageletInlineMessage limitsPageletInlineMessage = (LimitsPageletInlineMessage) obj;
        limitsPageletInlineMessage.getClass();
        LimitsPageletInlineMessage.Icon.ADAPTER.encodeWithTag(protoWriter, 1, limitsPageletInlineMessage.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, limitsPageletInlineMessage.main_text);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, limitsPageletInlineMessage.localizable_main_text);
        protoAdapter.encodeWithTag(protoWriter, 3, limitsPageletInlineMessage.subtext);
        protoAdapter2.encodeWithTag(protoWriter, 8, limitsPageletInlineMessage.localizable_subtext);
        ProtoAdapter protoAdapter3 = LimitsPageletInlineMessageButton.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 4, limitsPageletInlineMessage.primary_button);
        protoAdapter3.encodeWithTag(protoWriter, 5, limitsPageletInlineMessage.secondary_button);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, limitsPageletInlineMessage.version);
        protoWriter.writeBytes(limitsPageletInlineMessage.unknownFields());
    }
}
