package squareup.cash.savings.action;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.action.Card;

/* loaded from: classes10.dex */
public final class Card$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Card((Card.Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Card.TextAlignment) obj4, (Button) obj5, (Button) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Card.Image.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 7) {
                try {
                    obj4 = Card.TextAlignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 8) {
                obj5 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj5);
            } else if (nextTag != 9) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj6 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj6);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Card card = (Card) obj;
        reverseProtoWriter.getClass();
        card.getClass();
        reverseProtoWriter.writeBytes(card.unknownFields());
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, card.second_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, card.first_button);
        Card.TextAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 7, card.text_alignment);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, card.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, card.title);
        Card.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, card.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        int encodedSizeWithTag = Card.Image.ADAPTER.encodedSizeWithTag(1, card.image) + card.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = Card.TextAlignment.ADAPTER.encodedSizeWithTag(7, card.text_alignment) + protoAdapter.encodedSizeWithTag(3, card.subtitle) + protoAdapter.encodedSizeWithTag(2, card.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(9, card.second_button) + protoAdapter2.encodedSizeWithTag(8, card.first_button) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        LocalizedString localizedString = card.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = card.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Button button = card.first_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = card.second_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        Card.Image image = card.image;
        Card.TextAlignment textAlignment = card.text_alignment;
        byteString.getClass();
        return new Card(image, localizedString2, localizedString4, textAlignment, button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Card card = (Card) obj;
        card.getClass();
        Card.Image.ADAPTER.encodeWithTag(protoWriter, 1, card.image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, card.title);
        protoAdapter.encodeWithTag(protoWriter, 3, card.subtitle);
        Card.TextAlignment.ADAPTER.encodeWithTag(protoWriter, 7, card.text_alignment);
        ProtoAdapter protoAdapter2 = Button.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 8, card.first_button);
        protoAdapter2.encodeWithTag(protoWriter, 9, card.second_button);
        protoWriter.writeBytes(card.unknownFields());
    }
}
