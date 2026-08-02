package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.ui.arcade.elements.ButtonCompact;

/* loaded from: classes10.dex */
public final class CompactCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CompactCard((CardImage) obj, (LocalizedString) obj2, (ButtonCompact) obj3, (String) obj4, (CdfEvent) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CardImage.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(ButtonCompact.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        reverseProtoWriter.getClass();
        compactCard.getClass();
        reverseProtoWriter.writeBytes(compactCard.unknownFields());
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, compactCard.cdfEvent);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, compactCard.button_client_route);
        ButtonCompact.ADAPTER.encodeWithTag(reverseProtoWriter, 3, compactCard.button);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, compactCard.body_text);
        CardImage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, compactCard.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        compactCard.getClass();
        return CdfEvent.ADAPTER.encodedSizeWithTag(5, compactCard.cdfEvent) + ProtoAdapter.STRING.encodedSizeWithTag(4, compactCard.button_client_route) + ButtonCompact.ADAPTER.encodedSizeWithTag(3, compactCard.button) + LocalizedString.ADAPTER.encodedSizeWithTag(2, compactCard.body_text) + CardImage.ADAPTER.encodedSizeWithTag(1, compactCard.image) + compactCard.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        compactCard.getClass();
        LocalizedString localizedString = compactCard.body_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ButtonCompact buttonCompact = compactCard.button;
        ButtonCompact buttonCompact2 = buttonCompact != null ? (ButtonCompact) ButtonCompact.ADAPTER.redact(buttonCompact) : null;
        CdfEvent cdfEvent = compactCard.cdfEvent;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        CardImage cardImage = compactCard.image;
        String str = compactCard.button_client_route;
        byteString.getClass();
        return new CompactCard(cardImage, localizedString2, buttonCompact2, str, cdfEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompactCard compactCard = (CompactCard) obj;
        compactCard.getClass();
        CardImage.ADAPTER.encodeWithTag(protoWriter, 1, compactCard.image);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, compactCard.body_text);
        ButtonCompact.ADAPTER.encodeWithTag(protoWriter, 3, compactCard.button);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, compactCard.button_client_route);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 5, compactCard.cdfEvent);
        protoWriter.writeBytes(compactCard.unknownFields());
    }
}
