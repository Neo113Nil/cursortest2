package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.PageHeader;

/* loaded from: classes10.dex */
public final class GoalHeader$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GoalHeader((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (ClientRouteTemplate) obj4, (HeroNumericsHeader.BodyText) obj5, (SavingsAction) obj6, (Card) obj7, (CdfEvent) obj8, (PageHeader) obj9, (BetweenSection) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 3:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 4:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 5:
                    obj4 = TransactorKt.decodeMessageOrMerge(ClientRouteTemplate.ADAPTER, protoReader, obj4);
                    break;
                case 6:
                    obj5 = TransactorKt.decodeMessageOrMerge(HeroNumericsHeader.BodyText.ADAPTER, protoReader, obj5);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(SavingsAction.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    obj7 = TransactorKt.decodeMessageOrMerge(Card.ADAPTER, protoReader, obj7);
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(CdfEvent.ADAPTER, protoReader, obj8);
                    break;
                case 10:
                    obj9 = TransactorKt.decodeMessageOrMerge(PageHeader.ADAPTER, protoReader, obj9);
                    break;
                case 11:
                    obj10 = TransactorKt.decodeMessageOrMerge(BetweenSection.ADAPTER, protoReader, obj10);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GoalHeader goalHeader = (GoalHeader) obj;
        reverseProtoWriter.getClass();
        goalHeader.getClass();
        reverseProtoWriter.writeBytes(goalHeader.unknownFields());
        BetweenSection.ADAPTER.encodeWithTag(reverseProtoWriter, 11, goalHeader.page_header_bottom_spacing);
        PageHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 10, goalHeader.page_header);
        CdfEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 9, goalHeader.goal_balance_present_card_cdf_event);
        Card.ADAPTER.encodeWithTag(reverseProtoWriter, 8, goalHeader.goal_balance_present_card);
        SavingsAction.ADAPTER.encodeWithTag(reverseProtoWriter, 7, goalHeader.goal_balance_action);
        HeroNumericsHeader.BodyText.ADAPTER.encodeWithTag(reverseProtoWriter, 6, goalHeader.goal_folder_balance_subtitle);
        ClientRouteTemplate.ADAPTER.encodeWithTag(reverseProtoWriter, 5, goalHeader.remove_goal_client_route_template);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, goalHeader.goal_met_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, goalHeader.remove_goal_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, goalHeader.remaining_goal_amount_subtitle);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GoalHeader goalHeader = (GoalHeader) obj;
        goalHeader.getClass();
        int size$okio = goalHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return BetweenSection.ADAPTER.encodedSizeWithTag(11, goalHeader.page_header_bottom_spacing) + PageHeader.ADAPTER.encodedSizeWithTag(10, goalHeader.page_header) + CdfEvent.ADAPTER.encodedSizeWithTag(9, goalHeader.goal_balance_present_card_cdf_event) + Card.ADAPTER.encodedSizeWithTag(8, goalHeader.goal_balance_present_card) + SavingsAction.ADAPTER.encodedSizeWithTag(7, goalHeader.goal_balance_action) + HeroNumericsHeader.BodyText.ADAPTER.encodedSizeWithTag(6, goalHeader.goal_folder_balance_subtitle) + ClientRouteTemplate.ADAPTER.encodedSizeWithTag(5, goalHeader.remove_goal_client_route_template) + protoAdapter.encodedSizeWithTag(4, goalHeader.goal_met_text) + protoAdapter.encodedSizeWithTag(3, goalHeader.remove_goal_button_text) + protoAdapter.encodedSizeWithTag(2, goalHeader.remaining_goal_amount_subtitle) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GoalHeader goalHeader = (GoalHeader) obj;
        goalHeader.getClass();
        LocalizedString localizedString = goalHeader.remaining_goal_amount_subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = goalHeader.remove_goal_button_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = goalHeader.goal_met_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ClientRouteTemplate clientRouteTemplate = goalHeader.remove_goal_client_route_template;
        ClientRouteTemplate clientRouteTemplate2 = clientRouteTemplate != null ? (ClientRouteTemplate) ClientRouteTemplate.ADAPTER.redact(clientRouteTemplate) : null;
        HeroNumericsHeader.BodyText bodyText = goalHeader.goal_folder_balance_subtitle;
        HeroNumericsHeader.BodyText bodyText2 = bodyText != null ? (HeroNumericsHeader.BodyText) HeroNumericsHeader.BodyText.ADAPTER.redact(bodyText) : null;
        SavingsAction savingsAction = goalHeader.goal_balance_action;
        SavingsAction savingsAction2 = savingsAction != null ? (SavingsAction) SavingsAction.ADAPTER.redact(savingsAction) : null;
        Card card = goalHeader.goal_balance_present_card;
        Card card2 = card != null ? (Card) Card.ADAPTER.redact(card) : null;
        CdfEvent cdfEvent = goalHeader.goal_balance_present_card_cdf_event;
        CdfEvent cdfEvent2 = cdfEvent != null ? (CdfEvent) CdfEvent.ADAPTER.redact(cdfEvent) : null;
        PageHeader pageHeader = goalHeader.page_header;
        PageHeader pageHeader2 = pageHeader != null ? (PageHeader) PageHeader.ADAPTER.redact(pageHeader) : null;
        BetweenSection betweenSection = goalHeader.page_header_bottom_spacing;
        BetweenSection betweenSection2 = betweenSection != null ? (BetweenSection) BetweenSection.ADAPTER.redact(betweenSection) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GoalHeader(localizedString2, localizedString4, localizedString6, clientRouteTemplate2, bodyText2, savingsAction2, card2, cdfEvent2, pageHeader2, betweenSection2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GoalHeader goalHeader = (GoalHeader) obj;
        goalHeader.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, goalHeader.remaining_goal_amount_subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, goalHeader.remove_goal_button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, goalHeader.goal_met_text);
        ClientRouteTemplate.ADAPTER.encodeWithTag(protoWriter, 5, goalHeader.remove_goal_client_route_template);
        HeroNumericsHeader.BodyText.ADAPTER.encodeWithTag(protoWriter, 6, goalHeader.goal_folder_balance_subtitle);
        SavingsAction.ADAPTER.encodeWithTag(protoWriter, 7, goalHeader.goal_balance_action);
        Card.ADAPTER.encodeWithTag(protoWriter, 8, goalHeader.goal_balance_present_card);
        CdfEvent.ADAPTER.encodeWithTag(protoWriter, 9, goalHeader.goal_balance_present_card_cdf_event);
        PageHeader.ADAPTER.encodeWithTag(protoWriter, 10, goalHeader.page_header);
        BetweenSection.ADAPTER.encodeWithTag(protoWriter, 11, goalHeader.page_header_bottom_spacing);
        protoWriter.writeBytes(goalHeader.unknownFields());
    }
}
