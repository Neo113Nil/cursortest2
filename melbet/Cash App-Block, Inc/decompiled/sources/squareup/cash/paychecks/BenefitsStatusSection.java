package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;
import squareup.cash.paychecks.BenefitsDetails;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class BenefitsStatusSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BenefitsStatusSection> CREATOR;
    public final Button finish_benefits_setup_button;
    public final State state;
    public final LocalizedString subtitle;
    public final ColoredText title;
    public final Button view_benefits_button;

    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final BenefitsStatusSection$Button$Action_$ClientRoute Action;
        public final LocalizedString text;

        static {
            BenefitsStatusSection$Button$Companion$ADAPTER$1 benefitsStatusSection$Button$Companion$ADAPTER$1 = new BenefitsStatusSection$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsStatusSection.Button", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitStatusSection.proto");
            ADAPTER = benefitsStatusSection$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsStatusSection$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(LocalizedString localizedString, BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
            this.Action = benefitsStatusSection$Button$Action_$ClientRoute;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.Action, button.Action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = this.Action;
            int hashCode3 = hashCode2 + (benefitsStatusSection$Button$Action_$ClientRoute != null ? benefitsStatusSection$Button$Action_$ClientRoute.value.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(14);
            builder.bills_applet_default_action = this.text;
            builder.half_applet_content = this.Action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = this.Action;
            if (benefitsStatusSection$Button$Action_$ClientRoute != null) {
                arrayList.add("Action=" + benefitsStatusSection$Button$Action_$ClientRoute);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    public final class ColoredText extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ColoredText> CREATOR;
        public final String placeholder_string;
        public final LocalizedString text;
        public final Color tint_color;
        public final List values;

        static {
            BenefitsStatusSection$ColoredText$Companion$ADAPTER$1 benefitsStatusSection$ColoredText$Companion$ADAPTER$1 = new BenefitsStatusSection$ColoredText$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColoredText.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsStatusSection.ColoredText", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitStatusSection.proto");
            ADAPTER = benefitsStatusSection$ColoredText$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsStatusSection$ColoredText$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColoredText(LocalizedString localizedString, String str, List list, Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.text = localizedString;
            this.placeholder_string = str;
            this.tint_color = color;
            this.values = TransactorKt.immutableCopyOf("values", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ColoredText)) {
                return false;
            }
            ColoredText coloredText = (ColoredText) obj;
            return Intrinsics.areEqual(unknownFields(), coloredText.unknownFields()) && Intrinsics.areEqual(this.text, coloredText.text) && Intrinsics.areEqual(this.placeholder_string, coloredText.placeholder_string) && Intrinsics.areEqual(this.values, coloredText.values) && Intrinsics.areEqual(this.tint_color, coloredText.tint_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            String str = this.placeholder_string;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.values);
            Color color = this.tint_color;
            int hashCode3 = m + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BenefitsDetails.ColoredText.Builder builder = new BenefitsDetails.ColoredText.Builder(1);
            builder.text = this.text;
            builder.placeholder_string = this.placeholder_string;
            builder.values = this.values;
            builder.tint_color = this.tint_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            String str = this.placeholder_string;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "placeholder_string=", arrayList);
            }
            List list = this.values;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("values=", arrayList, list);
            }
            Color color = this.tint_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ColoredText{", "}", 0, null, null, 56);
        }
    }

    public enum State implements WireEnum {
        UNSPECIFIED(0),
        NULL_STATE(1),
        PENDING_STATE(2),
        ACTIVE_STATE(3),
        INACTIVE_STATE(4);

        public static final BenefitsStatusSection$State$Companion$ADAPTER$1 ADAPTER;
        public static final y0 Companion;
        public final int value;

        static {
            State state = UNSPECIFIED;
            Companion = new y0();
            ADAPTER = new BenefitsStatusSection$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return y0.m4313fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BenefitsStatusSection$Companion$ADAPTER$1 benefitsStatusSection$Companion$ADAPTER$1 = new BenefitsStatusSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitsStatusSection.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsStatusSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitStatusSection.proto");
        ADAPTER = benefitsStatusSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsStatusSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsStatusSection(ColoredText coloredText, LocalizedString localizedString, State state, Button button, Button button2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = coloredText;
        this.subtitle = localizedString;
        this.state = state;
        this.view_benefits_button = button;
        this.finish_benefits_setup_button = button2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BenefitsStatusSection)) {
            return false;
        }
        BenefitsStatusSection benefitsStatusSection = (BenefitsStatusSection) obj;
        return Intrinsics.areEqual(unknownFields(), benefitsStatusSection.unknownFields()) && Intrinsics.areEqual(this.title, benefitsStatusSection.title) && Intrinsics.areEqual(this.subtitle, benefitsStatusSection.subtitle) && this.state == benefitsStatusSection.state && Intrinsics.areEqual(this.view_benefits_button, benefitsStatusSection.view_benefits_button) && Intrinsics.areEqual(this.finish_benefits_setup_button, benefitsStatusSection.finish_benefits_setup_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ColoredText coloredText = this.title;
        int hashCode2 = (hashCode + (coloredText != null ? coloredText.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.subtitle;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode4 = (hashCode3 + (state != null ? state.hashCode() : 0)) * 37;
        Button button = this.view_benefits_button;
        int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.finish_benefits_setup_button;
        int hashCode6 = hashCode5 + (button2 != null ? button2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(16);
        builder.key_path = this.title;
        builder.get_transform = this.subtitle;
        builder.set_transform = this.state;
        builder.validation = this.view_benefits_button;
        builder.on_invalid = this.finish_benefits_setup_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ColoredText coloredText = this.title;
        if (coloredText != null) {
            arrayList.add("title=" + coloredText);
        }
        LocalizedString localizedString = this.subtitle;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString, arrayList);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        Button button = this.view_benefits_button;
        if (button != null) {
            arrayList.add("view_benefits_button=" + button);
        }
        Button button2 = this.finish_benefits_setup_button;
        if (button2 != null) {
            arrayList.add("finish_benefits_setup_button=" + button2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitsStatusSection{", "}", 0, null, null, 56);
    }
}
