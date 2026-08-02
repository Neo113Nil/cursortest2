package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.Card;
import squareup.cash.savings.action.CompactCard;

/* loaded from: classes10.dex */
public final class SavingsHome$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsHome((SavingsHome.SavingsOptionsSection) obj, (SavingsHome.ActivitySection) obj2, (SavingsHome.TransfersSection) obj3, (Card) obj4, (SavingsHome.Header) obj5, (SavingsHome.Footer) obj6, (CompactCard) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(SavingsHome.SavingsOptionsSection.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(SavingsHome.ActivitySection.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(SavingsHome.TransfersSection.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Card.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(SavingsHome.Header.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(SavingsHome.Footer.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(CompactCard.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome savingsHome = (SavingsHome) obj;
        reverseProtoWriter.getClass();
        savingsHome.getClass();
        reverseProtoWriter.writeBytes(savingsHome.unknownFields());
        CompactCard.ADAPTER.encodeWithTag(reverseProtoWriter, 7, savingsHome.compact_card_section);
        SavingsHome.Footer.ADAPTER.encodeWithTag(reverseProtoWriter, 6, savingsHome.footer);
        SavingsHome.Header.ADAPTER.encodeWithTag(reverseProtoWriter, 5, savingsHome.header);
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsHome.card_section);
        SavingsHome.TransfersSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, savingsHome.transfers_section);
        SavingsHome.ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, savingsHome.activity_section);
        SavingsHome.SavingsOptionsSection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsHome.options_section);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome savingsHome = (SavingsHome) obj;
        savingsHome.getClass();
        return CompactCard.ADAPTER.encodedSizeWithTag(7, savingsHome.compact_card_section) + SavingsHome.Footer.ADAPTER.encodedSizeWithTag(6, savingsHome.footer) + SavingsHome.Header.ADAPTER.encodedSizeWithTag(5, savingsHome.header) + Card.ADAPTER.encodedSizeWithTag(4, savingsHome.card_section) + SavingsHome.TransfersSection.ADAPTER.encodedSizeWithTag(3, savingsHome.transfers_section) + SavingsHome.ActivitySection.ADAPTER.encodedSizeWithTag(2, savingsHome.activity_section) + SavingsHome.SavingsOptionsSection.ADAPTER.encodedSizeWithTag(1, savingsHome.options_section) + savingsHome.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome savingsHome = (SavingsHome) obj;
        savingsHome.getClass();
        SavingsHome.SavingsOptionsSection savingsOptionsSection = savingsHome.options_section;
        SavingsHome.SavingsOptionsSection savingsOptionsSection2 = savingsOptionsSection != null ? (SavingsHome.SavingsOptionsSection) SavingsHome.SavingsOptionsSection.ADAPTER.redact(savingsOptionsSection) : null;
        SavingsHome.ActivitySection activitySection = savingsHome.activity_section;
        SavingsHome.ActivitySection activitySection2 = activitySection != null ? (SavingsHome.ActivitySection) SavingsHome.ActivitySection.ADAPTER.redact(activitySection) : null;
        SavingsHome.TransfersSection transfersSection = savingsHome.transfers_section;
        SavingsHome.TransfersSection transfersSection2 = transfersSection != null ? (SavingsHome.TransfersSection) SavingsHome.TransfersSection.ADAPTER.redact(transfersSection) : null;
        Card card = savingsHome.card_section;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        SavingsHome.Header header = savingsHome.header;
        SavingsHome.Header header2 = header != null ? (SavingsHome.Header) SavingsHome.Header.ADAPTER.redact(header) : null;
        SavingsHome.Footer footer = savingsHome.footer;
        SavingsHome.Footer footer2 = footer != null ? (SavingsHome.Footer) SavingsHome.Footer.ADAPTER.redact(footer) : null;
        CompactCard compactCard = savingsHome.compact_card_section;
        CompactCard compactCard2 = compactCard != null ? (CompactCard) CompactCard.ADAPTER.redact(compactCard) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsHome(savingsOptionsSection2, activitySection2, transfersSection2, card2, header2, footer2, compactCard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome savingsHome = (SavingsHome) obj;
        savingsHome.getClass();
        SavingsHome.SavingsOptionsSection.ADAPTER.encodeWithTag(protoWriter, 1, savingsHome.options_section);
        SavingsHome.ActivitySection.ADAPTER.encodeWithTag(protoWriter, 2, savingsHome.activity_section);
        SavingsHome.TransfersSection.ADAPTER.encodeWithTag(protoWriter, 3, savingsHome.transfers_section);
        Card.ADAPTER.encodeWithTag(protoWriter, 4, savingsHome.card_section);
        SavingsHome.Header.ADAPTER.encodeWithTag(protoWriter, 5, savingsHome.header);
        SavingsHome.Footer.ADAPTER.encodeWithTag(protoWriter, 6, savingsHome.footer);
        CompactCard.ADAPTER.encodeWithTag(protoWriter, 7, savingsHome.compact_card_section);
        protoWriter.writeBytes(savingsHome.unknownFields());
    }
}
