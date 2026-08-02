package squareup.cash.savings.bespoke_elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.ui.arcade.elements.InlineMessage;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class Card extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Card> CREATOR;
    public final CardImage image;
    public final InlineMessage inline_message;
    public final CdfEvent primary_button_cdf_event;
    public final String primary_button_client_route;
    public final CdfEvent secondary_button_cdf_event;
    public final String secondary_button_client_route;

    static {
        Card$Companion$ADAPTER$1 card$Companion$ADAPTER$1 = new Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.Card", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/Card.proto");
        ADAPTER = card$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(card$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card(InlineMessage inlineMessage, CardImage cardImage, String str, CdfEvent cdfEvent, String str2, CdfEvent cdfEvent2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.inline_message = inlineMessage;
        this.image = cardImage;
        this.primary_button_client_route = str;
        this.primary_button_cdf_event = cdfEvent;
        this.secondary_button_client_route = str2;
        this.secondary_button_cdf_event = cdfEvent2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.inline_message, card.inline_message) && this.image == card.image && Intrinsics.areEqual(this.primary_button_client_route, card.primary_button_client_route) && Intrinsics.areEqual(this.primary_button_cdf_event, card.primary_button_cdf_event) && Intrinsics.areEqual(this.secondary_button_client_route, card.secondary_button_client_route) && Intrinsics.areEqual(this.secondary_button_cdf_event, card.secondary_button_cdf_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InlineMessage inlineMessage = this.inline_message;
        int hashCode2 = (hashCode + (inlineMessage != null ? inlineMessage.hashCode() : 0)) * 37;
        CardImage cardImage = this.image;
        int hashCode3 = (hashCode2 + (cardImage != null ? cardImage.hashCode() : 0)) * 37;
        String str = this.primary_button_client_route;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.primary_button_cdf_event;
        int hashCode5 = (hashCode4 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
        String str2 = this.secondary_button_client_route;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CdfEvent cdfEvent2 = this.secondary_button_cdf_event;
        int hashCode7 = hashCode6 + (cdfEvent2 != null ? cdfEvent2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(14);
        builder.navigate = this.inline_message;
        builder.set_view_state_value = this.image;
        builder.open_url = this.primary_button_client_route;
        builder.compound_action = this.primary_button_cdf_event;
        builder.submit = this.secondary_button_client_route;
        builder.collection_mutation = this.secondary_button_cdf_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InlineMessage inlineMessage = this.inline_message;
        if (inlineMessage != null) {
            arrayList.add("inline_message=" + inlineMessage);
        }
        CardImage cardImage = this.image;
        if (cardImage != null) {
            arrayList.add("image=" + cardImage);
        }
        String str = this.primary_button_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_button_client_route=", arrayList);
        }
        CdfEvent cdfEvent = this.primary_button_cdf_event;
        if (cdfEvent != null) {
            arrayList.add("primary_button_cdf_event=" + cdfEvent);
        }
        String str2 = this.secondary_button_client_route;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_button_client_route=", arrayList);
        }
        CdfEvent cdfEvent2 = this.secondary_button_cdf_event;
        if (cdfEvent2 != null) {
            arrayList.add("secondary_button_cdf_event=" + cdfEvent2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
    }
}
