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
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;
import squareup.cash.paychecks.BenefitsStatusSection;
import squareup.cash.paychecks.Deduction;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class BenefitsDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BenefitsDetails> CREATOR;
    public final InsightsSection insights_section;
    public final MoneyTabSection money_tab_section;
    public final PaychecksSection paychecks_section;
    public final State state;

    public final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;
        public final BenefitsDetails$Button$Action_$ClientRoute Action;
        public final LocalizedString text;
        public final Color tint_color;

        static {
            BenefitsDetails$Button$Companion$ADAPTER$1 benefitsDetails$Button$Companion$ADAPTER$1 = new BenefitsDetails$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsDetails.Button", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitsDetails.proto");
            ADAPTER = benefitsDetails$Button$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsDetails$Button$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(LocalizedString localizedString, BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute, Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = localizedString;
            this.Action = benefitsDetails$Button$Action_$ClientRoute;
            this.tint_color = color;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.Action, button.Action) && Intrinsics.areEqual(this.tint_color, button.tint_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.text;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute = this.Action;
            int hashCode3 = (hashCode2 + (benefitsDetails$Button$Action_$ClientRoute != null ? benefitsDetails$Button$Action_$ClientRoute.value.hashCode() : 0)) * 37;
            Color color = this.tint_color;
            int hashCode4 = hashCode3 + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(18);
            builder.action = this.text;
            builder.full_applet = this.Action;
            builder.half_applet = this.tint_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            BenefitsDetails$Button$Action_$ClientRoute benefitsDetails$Button$Action_$ClientRoute = this.Action;
            if (benefitsDetails$Button$Action_$ClientRoute != null) {
                arrayList.add("Action=" + benefitsDetails$Button$Action_$ClientRoute);
            }
            Color color = this.tint_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
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

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public String placeholder_string;
            public LocalizedString text;
            public Color tint_color;
            public List values;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new ColoredText(this.text, this.placeholder_string, this.values, this.tint_color, buildUnknownFields());
                    default:
                        return new BenefitsStatusSection.ColoredText(this.text, this.placeholder_string, this.values, this.tint_color, buildUnknownFields());
                }
            }
        }

        static {
            BenefitsDetails$ColoredText$Companion$ADAPTER$1 benefitsDetails$ColoredText$Companion$ADAPTER$1 = new BenefitsDetails$ColoredText$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColoredText.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsDetails.ColoredText", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitsDetails.proto");
            ADAPTER = benefitsDetails$ColoredText$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsDetails$ColoredText$Companion$ADAPTER$1);
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
            Builder builder = new Builder(0);
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

    public final class InsightsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InsightsSection> CREATOR;
        public final Button button;
        public final List disclosures;
        public final LocalizedString spend_progress_text;
        public final LocalizedString subtitle;
        public final ColoredText title;

        static {
            BenefitsDetails$InsightsSection$Companion$ADAPTER$1 benefitsDetails$InsightsSection$Companion$ADAPTER$1 = new BenefitsDetails$InsightsSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InsightsSection.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsDetails.InsightsSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitsDetails.proto");
            ADAPTER = benefitsDetails$InsightsSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsDetails$InsightsSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsightsSection(ColoredText coloredText, LocalizedString localizedString, Button button, List list, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = coloredText;
            this.subtitle = localizedString;
            this.button = button;
            this.spend_progress_text = localizedString2;
            this.disclosures = TransactorKt.immutableCopyOf("disclosures", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InsightsSection)) {
                return false;
            }
            InsightsSection insightsSection = (InsightsSection) obj;
            return Intrinsics.areEqual(unknownFields(), insightsSection.unknownFields()) && Intrinsics.areEqual(this.title, insightsSection.title) && Intrinsics.areEqual(this.subtitle, insightsSection.subtitle) && Intrinsics.areEqual(this.button, insightsSection.button) && Intrinsics.areEqual(this.disclosures, insightsSection.disclosures) && Intrinsics.areEqual(this.spend_progress_text, insightsSection.spend_progress_text);
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
            Button button = this.button;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (button != null ? button.hashCode() : 0)) * 37, 37, this.disclosures);
            LocalizedString localizedString2 = this.spend_progress_text;
            int hashCode4 = m + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Binding.Builder builder = new Binding.Builder(15);
            builder.key_path = this.title;
            builder.get_transform = this.subtitle;
            builder.set_transform = this.button;
            builder.validation = this.disclosures;
            builder.on_invalid = this.spend_progress_text;
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
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            List list = this.disclosures;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("disclosures=", arrayList, list);
            }
            LocalizedString localizedString2 = this.spend_progress_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("spend_progress_text=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InsightsSection{", "}", 0, null, null, 56);
        }
    }

    public final class MoneyTabSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MoneyTabSection> CREATOR;
        public final String client_route;
        public final State state;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        static {
            BenefitsDetails$MoneyTabSection$Companion$ADAPTER$1 benefitsDetails$MoneyTabSection$Companion$ADAPTER$1 = new BenefitsDetails$MoneyTabSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyTabSection.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsDetails.MoneyTabSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitsDetails.proto");
            ADAPTER = benefitsDetails$MoneyTabSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsDetails$MoneyTabSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoneyTabSection(State state, LocalizedString localizedString, LocalizedString localizedString2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.state = state;
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.client_route = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MoneyTabSection)) {
                return false;
            }
            MoneyTabSection moneyTabSection = (MoneyTabSection) obj;
            return Intrinsics.areEqual(unknownFields(), moneyTabSection.unknownFields()) && this.state == moneyTabSection.state && Intrinsics.areEqual(this.title, moneyTabSection.title) && Intrinsics.areEqual(this.subtitle, moneyTabSection.subtitle) && Intrinsics.areEqual(this.client_route, moneyTabSection.client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            State state = this.state;
            int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            String str = this.client_route;
            int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(15);
            builder.amount = this.state;
            builder.description = this.title;
            builder.note = this.subtitle;
            builder.tint_color = this.client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            State state = this.state;
            if (state != null) {
                arrayList.add("state=" + state);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            String str = this.client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyTabSection{", "}", 0, null, null, 56);
        }
    }

    public final class PaychecksSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaychecksSection> CREATOR;
        public final Button button;
        public final LocalizedString subtitle;
        public final ColoredText title;

        static {
            BenefitsDetails$PaychecksSection$Companion$ADAPTER$1 benefitsDetails$PaychecksSection$Companion$ADAPTER$1 = new BenefitsDetails$PaychecksSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaychecksSection.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsDetails.PaychecksSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitsDetails.proto");
            ADAPTER = benefitsDetails$PaychecksSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsDetails$PaychecksSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaychecksSection(ColoredText coloredText, LocalizedString localizedString, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = coloredText;
            this.subtitle = localizedString;
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PaychecksSection)) {
                return false;
            }
            PaychecksSection paychecksSection = (PaychecksSection) obj;
            return Intrinsics.areEqual(unknownFields(), paychecksSection.unknownFields()) && Intrinsics.areEqual(this.title, paychecksSection.title) && Intrinsics.areEqual(this.subtitle, paychecksSection.subtitle) && Intrinsics.areEqual(this.button, paychecksSection.button);
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
            Button button = this.button;
            int hashCode4 = hashCode3 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(19);
            builder.action = this.title;
            builder.full_applet = this.subtitle;
            builder.half_applet = this.button;
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
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaychecksSection{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes9.dex */
    public enum State implements WireEnum {
        UNSPECIFIED(0),
        NULL_STATE(1),
        PENDING_STATE(2),
        ACTIVE_STATE(3),
        INACTIVE_STATE(4);

        public static final BenefitsDetails$State$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResolverDef Companion;
        public final int value;

        static {
            State state = UNSPECIFIED;
            Companion = new LinkResolverDef(26);
            ADAPTER = new BenefitsDetails$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return LinkResolverDef.m4119fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BenefitsDetails$Companion$ADAPTER$1 benefitsDetails$Companion$ADAPTER$1 = new BenefitsDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitsDetails.class), "type.googleapis.com/squareup.cash.paychecks.BenefitsDetails", Syntax.PROTO_2, null, "squareup/cash/paychecks/BenefitsDetails.proto");
        ADAPTER = benefitsDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsDetails(MoneyTabSection moneyTabSection, InsightsSection insightsSection, PaychecksSection paychecksSection, State state, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.money_tab_section = moneyTabSection;
        this.insights_section = insightsSection;
        this.paychecks_section = paychecksSection;
        this.state = state;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BenefitsDetails)) {
            return false;
        }
        BenefitsDetails benefitsDetails = (BenefitsDetails) obj;
        return Intrinsics.areEqual(unknownFields(), benefitsDetails.unknownFields()) && Intrinsics.areEqual(this.money_tab_section, benefitsDetails.money_tab_section) && Intrinsics.areEqual(this.insights_section, benefitsDetails.insights_section) && Intrinsics.areEqual(this.paychecks_section, benefitsDetails.paychecks_section) && this.state == benefitsDetails.state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MoneyTabSection moneyTabSection = this.money_tab_section;
        int hashCode2 = (hashCode + (moneyTabSection != null ? moneyTabSection.hashCode() : 0)) * 37;
        InsightsSection insightsSection = this.insights_section;
        int hashCode3 = (hashCode2 + (insightsSection != null ? insightsSection.hashCode() : 0)) * 37;
        PaychecksSection paychecksSection = this.paychecks_section;
        int hashCode4 = (hashCode3 + (paychecksSection != null ? paychecksSection.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode5 = hashCode4 + (state != null ? state.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(14);
        builder.amount = this.money_tab_section;
        builder.description = this.insights_section;
        builder.note = this.paychecks_section;
        builder.tint_color = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MoneyTabSection moneyTabSection = this.money_tab_section;
        if (moneyTabSection != null) {
            arrayList.add("money_tab_section=" + moneyTabSection);
        }
        InsightsSection insightsSection = this.insights_section;
        if (insightsSection != null) {
            arrayList.add("insights_section=" + insightsSection);
        }
        PaychecksSection paychecksSection = this.paychecks_section;
        if (paychecksSection != null) {
            arrayList.add("paychecks_section=" + paychecksSection);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitsDetails{", "}", 0, null, null, 56);
    }
}
