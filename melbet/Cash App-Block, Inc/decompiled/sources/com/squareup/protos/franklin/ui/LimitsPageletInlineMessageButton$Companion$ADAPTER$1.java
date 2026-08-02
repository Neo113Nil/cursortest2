package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessageButton;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LimitsPageletInlineMessageButton$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LimitsPageletInlineMessageButton((String) obj, (LocalizableString) obj2, (LimitsPageletInlineMessageButton.ButtonAction) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj3 = LimitsPageletInlineMessageButton.ButtonAction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = (LimitsPageletInlineMessageButton) obj;
        reverseProtoWriter.getClass();
        limitsPageletInlineMessageButton.getClass();
        reverseProtoWriter.writeBytes(limitsPageletInlineMessageButton.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, limitsPageletInlineMessageButton.url_to_open);
        LimitsPageletInlineMessageButton.ButtonAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, limitsPageletInlineMessageButton.button_action);
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, limitsPageletInlineMessageButton.localizable_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, limitsPageletInlineMessageButton.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = (LimitsPageletInlineMessageButton) obj;
        limitsPageletInlineMessageButton.getClass();
        int size$okio = limitsPageletInlineMessageButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, limitsPageletInlineMessageButton.url_to_open) + LimitsPageletInlineMessageButton.ButtonAction.ADAPTER.encodedSizeWithTag(2, limitsPageletInlineMessageButton.button_action) + LocalizableString.ADAPTER.encodedSizeWithTag(4, limitsPageletInlineMessageButton.localizable_text) + protoAdapter.encodedSizeWithTag(1, limitsPageletInlineMessageButton.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = (LimitsPageletInlineMessageButton) obj;
        limitsPageletInlineMessageButton.getClass();
        LocalizableString localizableString = limitsPageletInlineMessageButton.localizable_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = limitsPageletInlineMessageButton.text;
        LimitsPageletInlineMessageButton.ButtonAction buttonAction = limitsPageletInlineMessageButton.button_action;
        String str2 = limitsPageletInlineMessageButton.url_to_open;
        byteString.getClass();
        return new LimitsPageletInlineMessageButton(str, localizableString2, buttonAction, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LimitsPageletInlineMessageButton limitsPageletInlineMessageButton = (LimitsPageletInlineMessageButton) obj;
        limitsPageletInlineMessageButton.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, limitsPageletInlineMessageButton.text);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 4, limitsPageletInlineMessageButton.localizable_text);
        LimitsPageletInlineMessageButton.ButtonAction.ADAPTER.encodeWithTag(protoWriter, 2, limitsPageletInlineMessageButton.button_action);
        protoAdapter.encodeWithTag(protoWriter, 3, limitsPageletInlineMessageButton.url_to_open);
        protoWriter.writeBytes(limitsPageletInlineMessageButton.unknownFields());
    }
}
