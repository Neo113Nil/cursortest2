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
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class Button extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Button> CREATOR;
    public final Icon accessory;
    public final Placement accessory_placement;
    public final SavingsAction action;
    public final LocalizedString markdown_formatted_title;
    public final Style style;
    public final LocalizedString title;

    public enum Style implements WireEnum {
        PRIMARY(1),
        SECONDARY(2),
        TERTIARY(3);

        public final int value;
        public static final y0 Companion = new y0();
        public static final Button$Style$Companion$ADAPTER$1 ADAPTER = new Button$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, null);

        Style(int i) {
            this.value = i;
        }

        public static final Style fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PRIMARY;
            }
            if (i == 2) {
                return SECONDARY;
            }
            if (i != 3) {
                return null;
            }
            return TERTIARY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Button$Companion$ADAPTER$1 button$Companion$ADAPTER$1 = new Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.savings.action.Button", Syntax.PROTO_2, null, "squareup/cash/savings/action/SavingsAction.proto");
        ADAPTER = button$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(button$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Button(LocalizedString localizedString, Icon icon, SavingsAction savingsAction, Placement placement, Style style, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.accessory = icon;
        this.action = savingsAction;
        this.accessory_placement = placement;
        this.style = style;
        this.markdown_formatted_title = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.title, button.title) && this.accessory == button.accessory && Intrinsics.areEqual(this.action, button.action) && this.accessory_placement == button.accessory_placement && this.style == button.style && Intrinsics.areEqual(this.markdown_formatted_title, button.markdown_formatted_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Icon icon = this.accessory;
        int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        SavingsAction savingsAction = this.action;
        int hashCode4 = (hashCode3 + (savingsAction != null ? savingsAction.hashCode() : 0)) * 37;
        Placement placement = this.accessory_placement;
        int hashCode5 = (hashCode4 + (placement != null ? placement.hashCode() : 0)) * 37;
        Style style = this.style;
        int hashCode6 = (hashCode5 + (style != null ? style.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.markdown_formatted_title;
        int hashCode7 = hashCode6 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(12);
        builder.navigate = this.title;
        builder.set_view_state_value = this.accessory;
        builder.open_url = this.action;
        builder.compound_action = this.accessory_placement;
        builder.submit = this.style;
        builder.collection_mutation = this.markdown_formatted_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        Icon icon = this.accessory;
        if (icon != null) {
            arrayList.add("accessory=" + icon);
        }
        SavingsAction savingsAction = this.action;
        if (savingsAction != null) {
            arrayList.add("action=" + savingsAction);
        }
        Placement placement = this.accessory_placement;
        if (placement != null) {
            arrayList.add("accessory_placement=" + placement);
        }
        Style style = this.style;
        if (style != null) {
            arrayList.add("style=" + style);
        }
        LocalizedString localizedString2 = this.markdown_formatted_title;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("markdown_formatted_title=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
    }
}
