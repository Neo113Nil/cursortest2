package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.ui.arcade.elements.InlineMessage;

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
                return new Card((InlineMessage) obj, (CardImage) obj2, (String) obj3, (CdfEvent) obj4, (String) obj5, (CdfEvent) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(InlineMessage.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    try {
                        obj2 = CardImage.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Card card = (Card) obj;
        reverseProtoWriter.getClass();
        card.getClass();
        reverseProtoWriter.writeBytes(card.unknownFields());
        ProtoAdapter protoAdapter = CdfEvent.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, card.secondary_button_cdf_event);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, card.secondary_button_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, card.primary_button_cdf_event);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, card.primary_button_client_route);
        CardImage.ADAPTER.encodeWithTag(reverseProtoWriter, 2, card.image);
        InlineMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, card.inline_message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        int encodedSizeWithTag = CardImage.ADAPTER.encodedSizeWithTag(2, card.image) + InlineMessage.ADAPTER.encodedSizeWithTag(1, card.inline_message) + card.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, card.primary_button_client_route) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(6, card.secondary_button_cdf_event) + protoAdapter.encodedSizeWithTag(5, card.secondary_button_client_route) + protoAdapter2.encodedSizeWithTag(4, card.primary_button_cdf_event) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Card card = (Card) obj;
        card.getClass();
        InlineMessage inlineMessage = card.inline_message;
        InlineMessage inlineMessage2 = inlineMessage != null ? (InlineMessage) InlineMessage.ADAPTER.redact(inlineMessage) : null;
        CdfEvent cdfEvent = card.primary_button_cdf_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        CdfEvent cdfEvent3 = card.secondary_button_cdf_event;
        CdfEvent cdfEvent4 = cdfEvent3 != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent3) : null;
        ByteString byteString = ByteString.EMPTY;
        CardImage cardImage = card.image;
        String str = card.primary_button_client_route;
        String str2 = card.secondary_button_client_route;
        byteString.getClass();
        return new Card(inlineMessage2, cardImage, str, cdfEvent2, str2, cdfEvent4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Card card = (Card) obj;
        card.getClass();
        InlineMessage.ADAPTER.encodeWithTag(protoWriter, 1, card.inline_message);
        CardImage.ADAPTER.encodeWithTag(protoWriter, 2, card.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, card.primary_button_client_route);
        ProtoAdapter protoAdapter2 = CdfEvent.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, card.primary_button_cdf_event);
        protoAdapter.encodeWithTag(protoWriter, 5, card.secondary_button_client_route);
        protoAdapter2.encodeWithTag(protoWriter, 6, card.secondary_button_cdf_event);
        protoWriter.writeBytes(card.unknownFields());
    }
}
