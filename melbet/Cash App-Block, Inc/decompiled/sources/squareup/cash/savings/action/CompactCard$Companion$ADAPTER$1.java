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
public final class CompactCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CompactCard((Card.Image) obj, (LocalizedString) obj2, (Button) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Card.Image.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        reverseProtoWriter.getClass();
        compactCard.getClass();
        reverseProtoWriter.writeBytes(compactCard.unknownFields());
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, compactCard.button);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, compactCard.title);
        Card.Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, compactCard.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        compactCard.getClass();
        return Button.ADAPTER.encodedSizeWithTag(3, compactCard.button) + LocalizedString.ADAPTER.encodedSizeWithTag(2, compactCard.title) + Card.Image.ADAPTER.encodedSizeWithTag(1, compactCard.image) + compactCard.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        compactCard.getClass();
        LocalizedString localizedString = compactCard.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Button button = compactCard.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        Card.Image image = compactCard.image;
        byteString.getClass();
        return new CompactCard(image, localizedString2, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        compactCard.getClass();
        Card.Image.ADAPTER.encodeWithTag(protoWriter, 1, compactCard.image);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, compactCard.title);
        Button.ADAPTER.encodeWithTag(protoWriter, 3, compactCard.button);
        protoWriter.writeBytes(compactCard.unknownFields());
    }
}
