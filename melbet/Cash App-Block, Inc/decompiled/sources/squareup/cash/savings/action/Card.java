package squareup.cash.savings.action;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class Card extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Card> CREATOR;
    public final Button first_button;
    public final Image image;
    public final Button second_button;
    public final LocalizedString subtitle;
    public final TextAlignment text_alignment;
    public final LocalizedString title;

    public enum Image implements WireEnum {
        SAVINGS_YIELD(1),
        CASH_CARD(2),
        PIGGY_BANK(3),
        RAKE(4),
        KEYS(5),
        PROPOGATION(6),
        PERCENTAGE(7);

        public final int value;
        public static final KClasses$$Lambda$1 Companion = new KClasses$$Lambda$1(28);
        public static final Card$Image$Companion$ADAPTER$1 ADAPTER = new Card$Image$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Image.class), Syntax.PROTO_2, null);

        Image(int i) {
            this.value = i;
        }

        public static final Image fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return SAVINGS_YIELD;
                case 2:
                    return CASH_CARD;
                case 3:
                    return PIGGY_BANK;
                case 4:
                    return RAKE;
                case 5:
                    return KEYS;
                case 6:
                    return PROPOGATION;
                case 7:
                    return PERCENTAGE;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum TextAlignment implements WireEnum {
        LEFT(1),
        CENTER(2);

        public final int value;
        public static final POPMatchingFactory Companion = new POPMatchingFactory(29);
        public static final Card$TextAlignment$Companion$ADAPTER$1 ADAPTER = new Card$TextAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextAlignment.class), Syntax.PROTO_2, null);

        TextAlignment(int i) {
            this.value = i;
        }

        public static final TextAlignment fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return LEFT;
            }
            if (i != 2) {
                return null;
            }
            return CENTER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Card$Companion$ADAPTER$1 card$Companion$ADAPTER$1 = new Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.cash.savings.action.Card", Syntax.PROTO_2, null, "squareup/cash/savings/action/SavingsAction.proto");
        ADAPTER = card$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(card$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card(Image image, LocalizedString localizedString, LocalizedString localizedString2, TextAlignment textAlignment, Button button, Button button2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.text_alignment = textAlignment;
        this.first_button = button;
        this.second_button = button2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && this.image == card.image && Intrinsics.areEqual(this.title, card.title) && Intrinsics.areEqual(this.subtitle, card.subtitle) && this.text_alignment == card.text_alignment && Intrinsics.areEqual(this.first_button, card.first_button) && Intrinsics.areEqual(this.second_button, card.second_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        TextAlignment textAlignment = this.text_alignment;
        int hashCode5 = (hashCode4 + (textAlignment != null ? textAlignment.hashCode() : 0)) * 37;
        Button button = this.first_button;
        int hashCode6 = (hashCode5 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.second_button;
        int hashCode7 = hashCode6 + (button2 != null ? button2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(13);
        builder.navigate = this.image;
        builder.set_view_state_value = this.title;
        builder.open_url = this.subtitle;
        builder.compound_action = this.text_alignment;
        builder.submit = this.first_button;
        builder.collection_mutation = this.second_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        TextAlignment textAlignment = this.text_alignment;
        if (textAlignment != null) {
            arrayList.add("text_alignment=" + textAlignment);
        }
        Button button = this.first_button;
        if (button != null) {
            arrayList.add("first_button=" + button);
        }
        Button button2 = this.second_button;
        if (button2 != null) {
            arrayList.add("second_button=" + button2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
    }
}
