package squareup.cash.savings.bespoke_elements;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.PageHeader;

/* loaded from: classes10.dex */
public final class GoalHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GoalHeader> CREATOR;
    public final SavingsAction goal_balance_action;
    public final Card goal_balance_present_card;
    public final CdfEvent goal_balance_present_card_cdf_event;
    public final HeroNumericsHeader.BodyText goal_folder_balance_subtitle;
    public final LocalizedString goal_met_text;
    public final PageHeader page_header;
    public final BetweenSection page_header_bottom_spacing;
    public final LocalizedString remaining_goal_amount_subtitle;
    public final LocalizedString remove_goal_button_text;
    public final ClientRouteTemplate remove_goal_client_route_template;

    public final class Builder extends Message.Builder {
        public SavingsAction goal_balance_action;
        public Card goal_balance_present_card;
        public CdfEvent goal_balance_present_card_cdf_event;
        public HeroNumericsHeader.BodyText goal_folder_balance_subtitle;
        public LocalizedString goal_met_text;
        public PageHeader page_header;
        public BetweenSection page_header_bottom_spacing;
        public LocalizedString remaining_goal_amount_subtitle;
        public LocalizedString remove_goal_button_text;
        public ClientRouteTemplate remove_goal_client_route_template;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new GoalHeader(this.remaining_goal_amount_subtitle, this.remove_goal_button_text, this.goal_met_text, this.remove_goal_client_route_template, this.goal_folder_balance_subtitle, this.goal_balance_action, this.goal_balance_present_card, this.goal_balance_present_card_cdf_event, this.page_header, this.page_header_bottom_spacing, buildUnknownFields());
        }
    }

    static {
        GoalHeader$Companion$ADAPTER$1 goalHeader$Companion$ADAPTER$1 = new GoalHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GoalHeader.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.GoalHeader", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/GoalHeader.proto");
        ADAPTER = goalHeader$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(goalHeader$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalHeader(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ClientRouteTemplate clientRouteTemplate, HeroNumericsHeader.BodyText bodyText, SavingsAction savingsAction, Card card, CdfEvent cdfEvent, PageHeader pageHeader, BetweenSection betweenSection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.remaining_goal_amount_subtitle = localizedString;
        this.remove_goal_button_text = localizedString2;
        this.goal_met_text = localizedString3;
        this.remove_goal_client_route_template = clientRouteTemplate;
        this.goal_folder_balance_subtitle = bodyText;
        this.goal_balance_action = savingsAction;
        this.goal_balance_present_card = card;
        this.goal_balance_present_card_cdf_event = cdfEvent;
        this.page_header = pageHeader;
        this.page_header_bottom_spacing = betweenSection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoalHeader)) {
            return false;
        }
        GoalHeader goalHeader = (GoalHeader) obj;
        return Intrinsics.areEqual(unknownFields(), goalHeader.unknownFields()) && Intrinsics.areEqual(this.remaining_goal_amount_subtitle, goalHeader.remaining_goal_amount_subtitle) && Intrinsics.areEqual(this.remove_goal_button_text, goalHeader.remove_goal_button_text) && Intrinsics.areEqual(this.goal_met_text, goalHeader.goal_met_text) && Intrinsics.areEqual(this.remove_goal_client_route_template, goalHeader.remove_goal_client_route_template) && Intrinsics.areEqual(this.goal_folder_balance_subtitle, goalHeader.goal_folder_balance_subtitle) && Intrinsics.areEqual(this.goal_balance_action, goalHeader.goal_balance_action) && Intrinsics.areEqual(this.goal_balance_present_card, goalHeader.goal_balance_present_card) && Intrinsics.areEqual(this.goal_balance_present_card_cdf_event, goalHeader.goal_balance_present_card_cdf_event) && Intrinsics.areEqual(this.page_header, goalHeader.page_header) && Intrinsics.areEqual(this.page_header_bottom_spacing, goalHeader.page_header_bottom_spacing);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.remaining_goal_amount_subtitle;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.remove_goal_button_text;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.goal_met_text;
        int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        ClientRouteTemplate clientRouteTemplate = this.remove_goal_client_route_template;
        int hashCode5 = (hashCode4 + (clientRouteTemplate != null ? clientRouteTemplate.hashCode() : 0)) * 37;
        HeroNumericsHeader.BodyText bodyText = this.goal_folder_balance_subtitle;
        int hashCode6 = (hashCode5 + (bodyText != null ? bodyText.hashCode() : 0)) * 37;
        SavingsAction savingsAction = this.goal_balance_action;
        int hashCode7 = (hashCode6 + (savingsAction != null ? savingsAction.hashCode() : 0)) * 37;
        Card card = this.goal_balance_present_card;
        int hashCode8 = (hashCode7 + (card != null ? card.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.goal_balance_present_card_cdf_event;
        int hashCode9 = (hashCode8 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
        PageHeader pageHeader = this.page_header;
        int hashCode10 = (hashCode9 + (pageHeader != null ? pageHeader.hashCode() : 0)) * 37;
        BetweenSection betweenSection = this.page_header_bottom_spacing;
        int hashCode11 = hashCode10 + (betweenSection != null ? betweenSection.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.remaining_goal_amount_subtitle = this.remaining_goal_amount_subtitle;
        builder.remove_goal_button_text = this.remove_goal_button_text;
        builder.goal_met_text = this.goal_met_text;
        builder.remove_goal_client_route_template = this.remove_goal_client_route_template;
        builder.goal_folder_balance_subtitle = this.goal_folder_balance_subtitle;
        builder.goal_balance_action = this.goal_balance_action;
        builder.goal_balance_present_card = this.goal_balance_present_card;
        builder.goal_balance_present_card_cdf_event = this.goal_balance_present_card_cdf_event;
        builder.page_header = this.page_header;
        builder.page_header_bottom_spacing = this.page_header_bottom_spacing;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.remaining_goal_amount_subtitle;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("remaining_goal_amount_subtitle=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.remove_goal_button_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("remove_goal_button_text=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.goal_met_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("goal_met_text=", localizedString3, arrayList);
        }
        ClientRouteTemplate clientRouteTemplate = this.remove_goal_client_route_template;
        if (clientRouteTemplate != null) {
            arrayList.add("remove_goal_client_route_template=" + clientRouteTemplate);
        }
        HeroNumericsHeader.BodyText bodyText = this.goal_folder_balance_subtitle;
        if (bodyText != null) {
            arrayList.add("goal_folder_balance_subtitle=" + bodyText);
        }
        SavingsAction savingsAction = this.goal_balance_action;
        if (savingsAction != null) {
            arrayList.add("goal_balance_action=" + savingsAction);
        }
        Card card = this.goal_balance_present_card;
        if (card != null) {
            arrayList.add("goal_balance_present_card=" + card);
        }
        CdfEvent cdfEvent = this.goal_balance_present_card_cdf_event;
        if (cdfEvent != null) {
            arrayList.add("goal_balance_present_card_cdf_event=" + cdfEvent);
        }
        PageHeader pageHeader = this.page_header;
        if (pageHeader != null) {
            arrayList.add("page_header=" + pageHeader);
        }
        BetweenSection betweenSection = this.page_header_bottom_spacing;
        if (betweenSection != null) {
            arrayList.add("page_header_bottom_spacing=" + betweenSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoalHeader{", "}", 0, null, null, 56);
    }
}
