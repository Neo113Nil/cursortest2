package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;

/* loaded from: classes10.dex */
public final class NoGoalHeader$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new NoGoalHeader((HeroNumericsHeader) obj, (SavingsAction) obj2, (Card) obj3, (CdfEvent) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(HeroNumericsHeader.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(SavingsAction.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Card.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NoGoalHeader noGoalHeader = (NoGoalHeader) obj;
        reverseProtoWriter.getClass();
        noGoalHeader.getClass();
        reverseProtoWriter.writeBytes(noGoalHeader.unknownFields());
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, noGoalHeader.body_tap_present_card_cdf_event);
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 3, noGoalHeader.body_tap_present_card);
        SavingsAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, noGoalHeader.body_tap_action);
        HeroNumericsHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, noGoalHeader.hero_numerics_header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NoGoalHeader noGoalHeader = (NoGoalHeader) obj;
        noGoalHeader.getClass();
        return CdfEvent.ADAPTER.encodedSizeWithTag(4, noGoalHeader.body_tap_present_card_cdf_event) + Card.ADAPTER.encodedSizeWithTag(3, noGoalHeader.body_tap_present_card) + SavingsAction.ADAPTER.encodedSizeWithTag(2, noGoalHeader.body_tap_action) + HeroNumericsHeader.ADAPTER.encodedSizeWithTag(1, noGoalHeader.hero_numerics_header) + noGoalHeader.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NoGoalHeader noGoalHeader = (NoGoalHeader) obj;
        noGoalHeader.getClass();
        HeroNumericsHeader heroNumericsHeader = noGoalHeader.hero_numerics_header;
        HeroNumericsHeader heroNumericsHeader2 = heroNumericsHeader != null ? (HeroNumericsHeader) HeroNumericsHeader.ADAPTER.redact(heroNumericsHeader) : null;
        SavingsAction savingsAction = noGoalHeader.body_tap_action;
        SavingsAction savingsAction2 = savingsAction != null ? (SavingsAction) SavingsAction.ADAPTER.redact(savingsAction) : null;
        Card card = noGoalHeader.body_tap_present_card;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        CdfEvent cdfEvent = noGoalHeader.body_tap_present_card_cdf_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new NoGoalHeader(heroNumericsHeader2, savingsAction2, card2, cdfEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NoGoalHeader noGoalHeader = (NoGoalHeader) obj;
        noGoalHeader.getClass();
        HeroNumericsHeader.ADAPTER.encodeWithTag(protoWriter, 1, noGoalHeader.hero_numerics_header);
        SavingsAction.ADAPTER.encodeWithTag(protoWriter, 2, noGoalHeader.body_tap_action);
        Card.ADAPTER.encodeWithTag(protoWriter, 3, noGoalHeader.body_tap_present_card);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 4, noGoalHeader.body_tap_present_card_cdf_event);
        protoWriter.writeBytes(noGoalHeader.unknownFields());
    }
}
