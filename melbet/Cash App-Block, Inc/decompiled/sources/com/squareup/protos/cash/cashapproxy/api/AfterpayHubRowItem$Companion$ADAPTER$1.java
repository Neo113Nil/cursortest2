package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import app.cash.local.primitives.LocalErrorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayHubRowItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        LocalErrorKt afterpayHubRowItem$DetailContent$Text;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        LocalErrorKt localErrorKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayHubRowItem((Avatar) obj, (Text) obj2, (Text) obj3, (String) obj4, (String) obj5, localErrorKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
                    continue;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    continue;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 6:
                    afterpayHubRowItem$DetailContent$Text = new AfterpayHubRowItem$DetailContent$Text((Text) Text.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    afterpayHubRowItem$DetailContent$Text = new AfterpayHubRowItem$DetailContent$ActionButton((Button) Button.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    afterpayHubRowItem$DetailContent$Text = new AfterpayHubRowItem$DetailContent$InfoIcon((TextWithInfo) TextWithInfo.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            localErrorKt = afterpayHubRowItem$DetailContent$Text;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayHubRowItem afterpayHubRowItem = (AfterpayHubRowItem) obj;
        reverseProtoWriter.getClass();
        afterpayHubRowItem.getClass();
        reverseProtoWriter.writeBytes(afterpayHubRowItem.unknownFields());
        LocalErrorKt localErrorKt = afterpayHubRowItem.detail_content;
        if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$Text) {
            Text.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((AfterpayHubRowItem$DetailContent$Text) localErrorKt).value);
        } else if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$ActionButton) {
            Button.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((AfterpayHubRowItem$DetailContent$ActionButton) localErrorKt).value);
        } else if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$InfoIcon) {
            TextWithInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((AfterpayHubRowItem$DetailContent$InfoIcon) localErrorKt).value);
        } else if (localErrorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, afterpayHubRowItem.id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, afterpayHubRowItem.row_action_url);
        ProtoAdapter protoAdapter2 = Text.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, afterpayHubRowItem.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, afterpayHubRowItem.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, afterpayHubRowItem.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayHubRowItem afterpayHubRowItem = (AfterpayHubRowItem) obj;
        afterpayHubRowItem.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(1, afterpayHubRowItem.avatar) + afterpayHubRowItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, afterpayHubRowItem.subtitle) + protoAdapter.encodedSizeWithTag(2, afterpayHubRowItem.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(5, afterpayHubRowItem.id) + protoAdapter2.encodedSizeWithTag(4, afterpayHubRowItem.row_action_url) + encodedSizeWithTag2;
        LocalErrorKt localErrorKt = afterpayHubRowItem.detail_content;
        if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$Text) {
            return protoAdapter.encodedSizeWithTag(6, ((AfterpayHubRowItem$DetailContent$Text) localErrorKt).value) + encodedSizeWithTag3;
        }
        if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$ActionButton) {
            return Button.ADAPTER.encodedSizeWithTag(7, ((AfterpayHubRowItem$DetailContent$ActionButton) localErrorKt).value) + encodedSizeWithTag3;
        }
        if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$InfoIcon) {
            return TextWithInfo.ADAPTER.encodedSizeWithTag(8, ((AfterpayHubRowItem$DetailContent$InfoIcon) localErrorKt).value) + encodedSizeWithTag3;
        }
        if (localErrorKt == null) {
            return encodedSizeWithTag3;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayHubRowItem afterpayHubRowItem = (AfterpayHubRowItem) obj;
        afterpayHubRowItem.getClass();
        Avatar avatar = afterpayHubRowItem.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Text text = afterpayHubRowItem.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = afterpayHubRowItem.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = afterpayHubRowItem.id;
        LocalErrorKt localErrorKt = afterpayHubRowItem.detail_content;
        byteString.getClass();
        return new AfterpayHubRowItem(avatar2, text2, text4, null, str, localErrorKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayHubRowItem afterpayHubRowItem = (AfterpayHubRowItem) obj;
        afterpayHubRowItem.getClass();
        Avatar.ADAPTER.encodeWithTag(protoWriter, 1, afterpayHubRowItem.avatar);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, afterpayHubRowItem.title);
        protoAdapter.encodeWithTag(protoWriter, 3, afterpayHubRowItem.subtitle);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 4, afterpayHubRowItem.row_action_url);
        protoAdapter2.encodeWithTag(protoWriter, 5, afterpayHubRowItem.id);
        LocalErrorKt localErrorKt = afterpayHubRowItem.detail_content;
        if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$Text) {
            protoAdapter.encodeWithTag(protoWriter, 6, ((AfterpayHubRowItem$DetailContent$Text) localErrorKt).value);
        } else if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$ActionButton) {
            Button.ADAPTER.encodeWithTag(protoWriter, 7, ((AfterpayHubRowItem$DetailContent$ActionButton) localErrorKt).value);
        } else if (localErrorKt instanceof AfterpayHubRowItem$DetailContent$InfoIcon) {
            TextWithInfo.ADAPTER.encodeWithTag(protoWriter, 8, ((AfterpayHubRowItem$DetailContent$InfoIcon) localErrorKt).value);
        } else if (localErrorKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(afterpayHubRowItem.unknownFields());
    }
}
