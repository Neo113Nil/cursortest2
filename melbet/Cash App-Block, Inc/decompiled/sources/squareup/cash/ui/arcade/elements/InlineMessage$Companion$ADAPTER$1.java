package squareup.cash.ui.arcade.elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class InlineMessage$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InlineMessage((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InlineMessage inlineMessage = (InlineMessage) obj;
        reverseProtoWriter.getClass();
        inlineMessage.getClass();
        reverseProtoWriter.writeBytes(inlineMessage.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, inlineMessage.secondary_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inlineMessage.primary_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, inlineMessage.body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, inlineMessage.title_text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inlineMessage.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InlineMessage inlineMessage = (InlineMessage) obj;
        inlineMessage.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, inlineMessage.image) + inlineMessage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, inlineMessage.secondary_button_text) + protoAdapter.encodedSizeWithTag(4, inlineMessage.primary_button_text) + protoAdapter.encodedSizeWithTag(3, inlineMessage.body_text) + protoAdapter.encodedSizeWithTag(2, inlineMessage.title_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InlineMessage inlineMessage = (InlineMessage) obj;
        inlineMessage.getClass();
        Image image = inlineMessage.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = inlineMessage.title_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = inlineMessage.body_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = inlineMessage.primary_button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = inlineMessage.secondary_button_text;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InlineMessage(image2, localizedString2, localizedString4, localizedString6, localizedString8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InlineMessage inlineMessage = (InlineMessage) obj;
        inlineMessage.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, inlineMessage.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, inlineMessage.title_text);
        protoAdapter.encodeWithTag(protoWriter, 3, inlineMessage.body_text);
        protoAdapter.encodeWithTag(protoWriter, 4, inlineMessage.primary_button_text);
        protoAdapter.encodeWithTag(protoWriter, 5, inlineMessage.secondary_button_text);
        protoWriter.writeBytes(inlineMessage.unknownFields());
    }
}
