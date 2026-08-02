package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.savings.action.Card;

/* loaded from: classes10.dex */
public final class SavingsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsConfig((Animation) obj, (Card) obj2, (SavingsConfig.SavingsAppletUi) obj3, (SavingsConfig.DirectDepositSavingsBenefit) obj4, (SavingsConfig.Yield) obj5, (squareup.cash.savings.bespoke_elements.Card) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(Animation.ADAPTER, protoReader, obj);
                    break;
                case 3:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 4:
                    obj2 = TransactorKt.decodeMessageOrMerge(Card.ADAPTER, protoReader, obj2);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(SavingsConfig.SavingsAppletUi.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(SavingsConfig.DirectDepositSavingsBenefit.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(SavingsConfig.Yield.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(squareup.cash.savings.bespoke_elements.Card.ADAPTER, protoReader, obj6);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        reverseProtoWriter.getClass();
        savingsConfig.getClass();
        reverseProtoWriter.writeBytes(savingsConfig.unknownFields());
        squareup.cash.savings.bespoke_elements.Card.ADAPTER.encodeWithTag(reverseProtoWriter, 8, savingsConfig.get_cash_card_to_start_earning_card_element);
        SavingsConfig.Yield.ADAPTER.encodeWithTag(reverseProtoWriter, 7, savingsConfig.yield);
        SavingsConfig.DirectDepositSavingsBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 6, savingsConfig.direct_deposit_savings_benefit);
        SavingsConfig.SavingsAppletUi.ADAPTER.encodeWithTag(reverseProtoWriter, 5, savingsConfig.applet);
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 4, savingsConfig.get_cash_card_to_start_earning_card);
        Animation.ADAPTER.encodeWithTag(reverseProtoWriter, 2, savingsConfig.goal_celebration_animation);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        savingsConfig.getClass();
        return squareup.cash.savings.bespoke_elements.Card.ADAPTER.encodedSizeWithTag(8, savingsConfig.get_cash_card_to_start_earning_card_element) + SavingsConfig.Yield.ADAPTER.encodedSizeWithTag(7, savingsConfig.yield) + SavingsConfig.DirectDepositSavingsBenefit.ADAPTER.encodedSizeWithTag(6, savingsConfig.direct_deposit_savings_benefit) + SavingsConfig.SavingsAppletUi.ADAPTER.encodedSizeWithTag(5, savingsConfig.applet) + Card.ADAPTER.encodedSizeWithTag(4, savingsConfig.get_cash_card_to_start_earning_card) + Animation.ADAPTER.encodedSizeWithTag(2, savingsConfig.goal_celebration_animation) + savingsConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        savingsConfig.getClass();
        Animation animation = savingsConfig.goal_celebration_animation;
        Animation animation2 = animation != null ? (Animation) Animation.ADAPTER.redact(animation) : null;
        Card card = savingsConfig.get_cash_card_to_start_earning_card;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        SavingsConfig.SavingsAppletUi savingsAppletUi = savingsConfig.applet;
        SavingsConfig.SavingsAppletUi savingsAppletUi2 = savingsAppletUi != null ? (SavingsConfig.SavingsAppletUi) SavingsConfig.SavingsAppletUi.ADAPTER.redact(savingsAppletUi) : null;
        SavingsConfig.DirectDepositSavingsBenefit directDepositSavingsBenefit = savingsConfig.direct_deposit_savings_benefit;
        SavingsConfig.DirectDepositSavingsBenefit directDepositSavingsBenefit2 = directDepositSavingsBenefit != null ? (SavingsConfig.DirectDepositSavingsBenefit) SavingsConfig.DirectDepositSavingsBenefit.ADAPTER.redact(directDepositSavingsBenefit) : null;
        SavingsConfig.Yield yield = savingsConfig.yield;
        SavingsConfig.Yield yield2 = yield != null ? (SavingsConfig.Yield) SavingsConfig.Yield.ADAPTER.redact(yield) : null;
        squareup.cash.savings.bespoke_elements.Card card3 = savingsConfig.get_cash_card_to_start_earning_card_element;
        squareup.cash.savings.bespoke_elements.Card card4 = card3 != null ? (squareup.cash.savings.bespoke_elements.Card) squareup.cash.savings.bespoke_elements.Card.ADAPTER.redact(card3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsConfig(animation2, card2, savingsAppletUi2, directDepositSavingsBenefit2, yield2, card4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        savingsConfig.getClass();
        Animation.ADAPTER.encodeWithTag(protoWriter, 2, savingsConfig.goal_celebration_animation);
        Card.ADAPTER.encodeWithTag(protoWriter, 4, savingsConfig.get_cash_card_to_start_earning_card);
        SavingsConfig.SavingsAppletUi.ADAPTER.encodeWithTag(protoWriter, 5, savingsConfig.applet);
        SavingsConfig.DirectDepositSavingsBenefit.ADAPTER.encodeWithTag(protoWriter, 6, savingsConfig.direct_deposit_savings_benefit);
        SavingsConfig.Yield.ADAPTER.encodeWithTag(protoWriter, 7, savingsConfig.yield);
        squareup.cash.savings.bespoke_elements.Card.ADAPTER.encodeWithTag(protoWriter, 8, savingsConfig.get_cash_card_to_start_earning_card_element);
        protoWriter.writeBytes(savingsConfig.unknownFields());
    }
}
