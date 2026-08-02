package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;
import xyz.block.protos.genie.Action;

/* loaded from: classes10.dex */
public final class DistributionSummaryUi extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DistributionSummaryUi> CREATOR;
    public final List destination_ui_configs;
    public final LocalizedString done_button_title;
    public final HelpSheetUi help_sheet_ui;
    public final AlertUi investing_risk_alert_ui;
    public final AlertUi overallocation_alert_ui;
    public final LocalizedString title;

    public final class DestinationUiConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DestinationUiConfiguration> CREATOR;
        public final AllocationDestination destination;
        public final UiConfiguration ui_config;

        public final class UiConfiguration extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<UiConfiguration> CREATOR;
            public final LocalizedString nux_button_text;
            public final Boolean shows_investing_risk_alert;

            static {
                DistributionSummaryUi$DestinationUiConfiguration$UiConfiguration$Companion$ADAPTER$1 distributionSummaryUi$DestinationUiConfiguration$UiConfiguration$Companion$ADAPTER$1 = new DistributionSummaryUi$DestinationUiConfiguration$UiConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiConfiguration.class), "type.googleapis.com/squareup.cash.paychecks.DistributionSummaryUi.DestinationUiConfiguration.UiConfiguration", Syntax.PROTO_2, null, "squareup/cash/paychecks/DistributionSummaryUi.proto");
                ADAPTER = distributionSummaryUi$DestinationUiConfiguration$UiConfiguration$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(distributionSummaryUi$DestinationUiConfiguration$UiConfiguration$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UiConfiguration(Boolean bool, LocalizedString localizedString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.shows_investing_risk_alert = bool;
                this.nux_button_text = localizedString;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof UiConfiguration)) {
                    return false;
                }
                UiConfiguration uiConfiguration = (UiConfiguration) obj;
                return Intrinsics.areEqual(unknownFields(), uiConfiguration.unknownFields()) && Intrinsics.areEqual(this.shows_investing_risk_alert, uiConfiguration.shows_investing_risk_alert) && Intrinsics.areEqual(this.nux_button_text, uiConfiguration.nux_button_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.shows_investing_risk_alert;
                int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                LocalizedString localizedString = this.nux_button_text;
                int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsConfig.Builder builder = new BillsConfig.Builder(16);
                builder.bills_applet_default_action = this.shows_investing_risk_alert;
                builder.half_applet_content = this.nux_button_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.shows_investing_risk_alert;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("shows_investing_risk_alert=", bool, arrayList);
                }
                LocalizedString localizedString = this.nux_button_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("nux_button_text=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "UiConfiguration{", "}", 0, null, null, 56);
            }
        }

        static {
            DistributionSummaryUi$DestinationUiConfiguration$Companion$ADAPTER$1 distributionSummaryUi$DestinationUiConfiguration$Companion$ADAPTER$1 = new DistributionSummaryUi$DestinationUiConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DestinationUiConfiguration.class), "type.googleapis.com/squareup.cash.paychecks.DistributionSummaryUi.DestinationUiConfiguration", Syntax.PROTO_2, null, "squareup/cash/paychecks/DistributionSummaryUi.proto");
            ADAPTER = distributionSummaryUi$DestinationUiConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(distributionSummaryUi$DestinationUiConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DestinationUiConfiguration(AllocationDestination allocationDestination, UiConfiguration uiConfiguration, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.destination = allocationDestination;
            this.ui_config = uiConfiguration;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DestinationUiConfiguration)) {
                return false;
            }
            DestinationUiConfiguration destinationUiConfiguration = (DestinationUiConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), destinationUiConfiguration.unknownFields()) && Intrinsics.areEqual(this.destination, destinationUiConfiguration.destination) && Intrinsics.areEqual(this.ui_config, destinationUiConfiguration.ui_config);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AllocationDestination allocationDestination = this.destination;
            int hashCode2 = (hashCode + (allocationDestination != null ? allocationDestination.hashCode() : 0)) * 37;
            UiConfiguration uiConfiguration = this.ui_config;
            int hashCode3 = hashCode2 + (uiConfiguration != null ? uiConfiguration.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(15);
            builder.bills_applet_default_action = this.destination;
            builder.half_applet_content = this.ui_config;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AllocationDestination allocationDestination = this.destination;
            if (allocationDestination != null) {
                arrayList.add("destination=" + allocationDestination);
            }
            UiConfiguration uiConfiguration = this.ui_config;
            if (uiConfiguration != null) {
                arrayList.add("ui_config=" + uiConfiguration);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DestinationUiConfiguration{", "}", 0, null, null, 56);
        }
    }

    public final class HelpSheetUi extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HelpSheetUi> CREATOR;
        public final String additional_help_button_client_route;
        public final LocalizedString additional_help_button_text;
        public final LocalizedString centered_title;
        public final LocalizedString dismiss_button_text;
        public final List numbered_item_subtexts;
        public final List numbered_item_texts;

        static {
            DistributionSummaryUi$HelpSheetUi$Companion$ADAPTER$1 distributionSummaryUi$HelpSheetUi$Companion$ADAPTER$1 = new DistributionSummaryUi$HelpSheetUi$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HelpSheetUi.class), "type.googleapis.com/squareup.cash.paychecks.DistributionSummaryUi.HelpSheetUi", Syntax.PROTO_2, null, "squareup/cash/paychecks/DistributionSummaryUi.proto");
            ADAPTER = distributionSummaryUi$HelpSheetUi$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(distributionSummaryUi$HelpSheetUi$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpSheetUi(String str, LocalizedString localizedString, List list, LocalizedString localizedString2, LocalizedString localizedString3, List list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.additional_help_button_client_route = str;
            this.centered_title = localizedString;
            this.additional_help_button_text = localizedString2;
            this.dismiss_button_text = localizedString3;
            this.numbered_item_texts = TransactorKt.immutableCopyOf("numbered_item_texts", list);
            this.numbered_item_subtexts = TransactorKt.immutableCopyOf("numbered_item_subtexts", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HelpSheetUi)) {
                return false;
            }
            HelpSheetUi helpSheetUi = (HelpSheetUi) obj;
            return Intrinsics.areEqual(unknownFields(), helpSheetUi.unknownFields()) && Intrinsics.areEqual(this.additional_help_button_client_route, helpSheetUi.additional_help_button_client_route) && Intrinsics.areEqual(this.centered_title, helpSheetUi.centered_title) && Intrinsics.areEqual(this.numbered_item_texts, helpSheetUi.numbered_item_texts) && Intrinsics.areEqual(this.additional_help_button_text, helpSheetUi.additional_help_button_text) && Intrinsics.areEqual(this.dismiss_button_text, helpSheetUi.dismiss_button_text) && Intrinsics.areEqual(this.numbered_item_subtexts, helpSheetUi.numbered_item_subtexts);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.additional_help_button_client_route;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.centered_title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.numbered_item_texts);
            LocalizedString localizedString2 = this.additional_help_button_text;
            int hashCode3 = (m + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.dismiss_button_text;
            int hashCode4 = this.numbered_item_subtexts.hashCode() + ((hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(6);
            builder.navigate = this.additional_help_button_client_route;
            builder.set_view_state_value = this.centered_title;
            builder.open_url = this.numbered_item_texts;
            builder.compound_action = this.additional_help_button_text;
            builder.submit = this.dismiss_button_text;
            builder.collection_mutation = this.numbered_item_subtexts;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.additional_help_button_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "additional_help_button_client_route=", arrayList);
            }
            LocalizedString localizedString = this.centered_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("centered_title=", localizedString, arrayList);
            }
            List list = this.numbered_item_texts;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("numbered_item_texts=", arrayList, list);
            }
            LocalizedString localizedString2 = this.additional_help_button_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("additional_help_button_text=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.dismiss_button_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("dismiss_button_text=", localizedString3, arrayList);
            }
            List list2 = this.numbered_item_subtexts;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("numbered_item_subtexts=", arrayList, list2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HelpSheetUi{", "}", 0, null, null, 56);
        }
    }

    static {
        DistributionSummaryUi$Companion$ADAPTER$1 distributionSummaryUi$Companion$ADAPTER$1 = new DistributionSummaryUi$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DistributionSummaryUi.class), "type.googleapis.com/squareup.cash.paychecks.DistributionSummaryUi", Syntax.PROTO_2, null, "squareup/cash/paychecks/DistributionSummaryUi.proto");
        ADAPTER = distributionSummaryUi$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(distributionSummaryUi$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistributionSummaryUi(List list, HelpSheetUi helpSheetUi, AlertUi alertUi, LocalizedString localizedString, LocalizedString localizedString2, AlertUi alertUi2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.help_sheet_ui = helpSheetUi;
        this.investing_risk_alert_ui = alertUi;
        this.title = localizedString;
        this.done_button_title = localizedString2;
        this.overallocation_alert_ui = alertUi2;
        this.destination_ui_configs = TransactorKt.immutableCopyOf("destination_ui_configs", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DistributionSummaryUi)) {
            return false;
        }
        DistributionSummaryUi distributionSummaryUi = (DistributionSummaryUi) obj;
        return Intrinsics.areEqual(unknownFields(), distributionSummaryUi.unknownFields()) && Intrinsics.areEqual(this.destination_ui_configs, distributionSummaryUi.destination_ui_configs) && Intrinsics.areEqual(this.help_sheet_ui, distributionSummaryUi.help_sheet_ui) && Intrinsics.areEqual(this.investing_risk_alert_ui, distributionSummaryUi.investing_risk_alert_ui) && Intrinsics.areEqual(this.title, distributionSummaryUi.title) && Intrinsics.areEqual(this.done_button_title, distributionSummaryUi.done_button_title) && Intrinsics.areEqual(this.overallocation_alert_ui, distributionSummaryUi.overallocation_alert_ui);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.destination_ui_configs);
        HelpSheetUi helpSheetUi = this.help_sheet_ui;
        int hashCode = (m + (helpSheetUi != null ? helpSheetUi.hashCode() : 0)) * 37;
        AlertUi alertUi = this.investing_risk_alert_ui;
        int hashCode2 = (hashCode + (alertUi != null ? alertUi.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.done_button_title;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        AlertUi alertUi2 = this.overallocation_alert_ui;
        int hashCode5 = hashCode4 + (alertUi2 != null ? alertUi2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(5);
        builder.navigate = this.destination_ui_configs;
        builder.set_view_state_value = this.help_sheet_ui;
        builder.open_url = this.investing_risk_alert_ui;
        builder.compound_action = this.title;
        builder.submit = this.done_button_title;
        builder.collection_mutation = this.overallocation_alert_ui;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.destination_ui_configs;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("destination_ui_configs=", arrayList, list);
        }
        HelpSheetUi helpSheetUi = this.help_sheet_ui;
        if (helpSheetUi != null) {
            arrayList.add("help_sheet_ui=" + helpSheetUi);
        }
        AlertUi alertUi = this.investing_risk_alert_ui;
        if (alertUi != null) {
            arrayList.add("investing_risk_alert_ui=" + alertUi);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.done_button_title;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("done_button_title=", localizedString2, arrayList);
        }
        AlertUi alertUi2 = this.overallocation_alert_ui;
        if (alertUi2 != null) {
            arrayList.add("overallocation_alert_ui=" + alertUi2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DistributionSummaryUi{", "}", 0, null, null, 56);
    }
}
