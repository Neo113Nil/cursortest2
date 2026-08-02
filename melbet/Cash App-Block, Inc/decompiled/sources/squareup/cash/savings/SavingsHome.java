package squareup.cash.savings;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.protos.cash.aegis.sync_values.Text;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SettingsGroup;
import com.squareup.protos.person.Alias;
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
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bills.BillsConfig;
import squareup.cash.paychecks.Deduction;
import squareup.cash.savings.action.Button;
import squareup.cash.savings.action.Card;
import squareup.cash.savings.action.CompactCard;
import squareup.cash.savings.action.Icon;
import squareup.cash.savings.action.SavingsAction;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class SavingsHome extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsHome> CREATOR;
    public final ActivitySection activity_section;
    public final Card card_section;
    public final CompactCard compact_card_section;
    public final Footer footer;
    public final Header header;
    public final SavingsOptionsSection options_section;
    public final TransfersSection transfers_section;

    /* loaded from: classes8.dex */
    public final class ActivitySection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivitySection> CREATOR;
        public final String accessibility_text;
        public final LocalizableString localizable_accessibility_text;

        static {
            SavingsHome$ActivitySection$Companion$ADAPTER$1 savingsHome$ActivitySection$Companion$ADAPTER$1 = new SavingsHome$ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
            ADAPTER = savingsHome$ActivitySection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$ActivitySection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivitySection(String str, LocalizableString localizableString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.accessibility_text = str;
            this.localizable_accessibility_text = localizableString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivitySection)) {
                return false;
            }
            ActivitySection activitySection = (ActivitySection) obj;
            return Intrinsics.areEqual(unknownFields(), activitySection.unknownFields()) && Intrinsics.areEqual(this.accessibility_text, activitySection.accessibility_text) && Intrinsics.areEqual(this.localizable_accessibility_text, activitySection.localizable_accessibility_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.accessibility_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_accessibility_text;
            int hashCode3 = hashCode2 + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(6);
            builder.text = this.accessibility_text;
            builder.localizable_text = this.localizable_accessibility_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.accessibility_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "accessibility_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_accessibility_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_accessibility_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySection{", "}", 0, null, null, 56);
        }
    }

    public final class Footer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Footer> CREATOR;
        public final Icon icon;
        public final LocalizedString text;

        static {
            SavingsHome$Footer$Companion$ADAPTER$1 savingsHome$Footer$Companion$ADAPTER$1 = new SavingsHome$Footer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Footer.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.Footer", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
            ADAPTER = savingsHome$Footer$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$Footer$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Footer(Icon icon, LocalizedString localizedString, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.text = localizedString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.areEqual(unknownFields(), footer.unknownFields()) && this.icon == footer.icon && Intrinsics.areEqual(this.text, footer.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.text;
            int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(24);
            builder.bills_applet_default_action = this.icon;
            builder.half_applet_content = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Footer{", "}", 0, null, null, 56);
        }
    }

    public final class Header extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Header> CREATOR;
        public final Button alert_button;
        public final Button interest_button;

        static {
            SavingsHome$Header$Companion$ADAPTER$1 savingsHome$Header$Companion$ADAPTER$1 = new SavingsHome$Header$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Header.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.Header", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
            ADAPTER = savingsHome$Header$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$Header$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(Button button, Button button2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.interest_button = button;
            this.alert_button = button2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.interest_button, header.interest_button) && Intrinsics.areEqual(this.alert_button, header.alert_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Button button = this.interest_button;
            int hashCode2 = (hashCode + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.alert_button;
            int hashCode3 = hashCode2 + (button2 != null ? button2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(25);
            builder.bills_applet_default_action = this.interest_button;
            builder.half_applet_content = this.alert_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Button button = this.interest_button;
            if (button != null) {
                arrayList.add("interest_button=" + button);
            }
            Button button2 = this.alert_button;
            if (button2 != null) {
                arrayList.add("alert_button=" + button2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class SavingsOptionsSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SavingsOptionsSection> CREATOR;
        public final String accessibility_text;
        public final LocalizableString localizable_accessibility_text;
        public final List rows;

        public final class SavingsOptionRow extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SavingsOptionRow> CREATOR;
            public final String accessibility_text;
            public final SavingsAction action;
            public final CdfEvent cdfEvent;
            public final RowImage image;
            public final LocalizableString localizable_accessibility_text;
            public final LocalizableString localizable_subtitle;
            public final LocalizableString localizable_title;
            public final String row_id;
            public final String subtitle;
            public final String title;

            /* loaded from: classes10.dex */
            public enum RowImage implements WireEnum {
                AUTOMATION(1),
                FLAG(2),
                DART(3),
                ROUND_UP(4);

                public final int value;
                public static final Plane Companion = new Plane(28);
                public static final SavingsHome$SavingsOptionsSection$SavingsOptionRow$RowImage$Companion$ADAPTER$1 ADAPTER = new SavingsHome$SavingsOptionsSection$SavingsOptionRow$RowImage$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RowImage.class), Syntax.PROTO_2, null);

                RowImage(int i) {
                    this.value = i;
                }

                public static final RowImage fromValue(int i) {
                    Companion.getClass();
                    if (i == 1) {
                        return AUTOMATION;
                    }
                    if (i == 2) {
                        return FLAG;
                    }
                    if (i == 3) {
                        return DART;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return ROUND_UP;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                SavingsHome$SavingsOptionsSection$SavingsOptionRow$Companion$ADAPTER$1 savingsHome$SavingsOptionsSection$SavingsOptionRow$Companion$ADAPTER$1 = new SavingsHome$SavingsOptionsSection$SavingsOptionRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsOptionRow.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.SavingsOptionsSection.SavingsOptionRow", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
                ADAPTER = savingsHome$SavingsOptionsSection$SavingsOptionRow$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$SavingsOptionsSection$SavingsOptionRow$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SavingsOptionRow(RowImage rowImage, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, SavingsAction savingsAction, String str3, LocalizableString localizableString3, CdfEvent cdfEvent, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.image = rowImage;
                this.title = str;
                this.localizable_title = localizableString;
                this.subtitle = str2;
                this.localizable_subtitle = localizableString2;
                this.action = savingsAction;
                this.accessibility_text = str3;
                this.localizable_accessibility_text = localizableString3;
                this.cdfEvent = cdfEvent;
                this.row_id = str4;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SavingsOptionRow)) {
                    return false;
                }
                SavingsOptionRow savingsOptionRow = (SavingsOptionRow) obj;
                return Intrinsics.areEqual(unknownFields(), savingsOptionRow.unknownFields()) && this.image == savingsOptionRow.image && Intrinsics.areEqual(this.title, savingsOptionRow.title) && Intrinsics.areEqual(this.localizable_title, savingsOptionRow.localizable_title) && Intrinsics.areEqual(this.subtitle, savingsOptionRow.subtitle) && Intrinsics.areEqual(this.localizable_subtitle, savingsOptionRow.localizable_subtitle) && Intrinsics.areEqual(this.action, savingsOptionRow.action) && Intrinsics.areEqual(this.accessibility_text, savingsOptionRow.accessibility_text) && Intrinsics.areEqual(this.localizable_accessibility_text, savingsOptionRow.localizable_accessibility_text) && Intrinsics.areEqual(this.cdfEvent, savingsOptionRow.cdfEvent) && Intrinsics.areEqual(this.row_id, savingsOptionRow.row_id);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                RowImage rowImage = this.image;
                int hashCode2 = (hashCode + (rowImage != null ? rowImage.hashCode() : 0)) * 37;
                String str = this.title;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                LocalizableString localizableString = this.localizable_title;
                int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
                String str2 = this.subtitle;
                int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
                LocalizableString localizableString2 = this.localizable_subtitle;
                int hashCode6 = (hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
                SavingsAction savingsAction = this.action;
                int hashCode7 = (hashCode6 + (savingsAction != null ? savingsAction.hashCode() : 0)) * 37;
                String str3 = this.accessibility_text;
                int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
                LocalizableString localizableString3 = this.localizable_accessibility_text;
                int hashCode9 = (hashCode8 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
                CdfEvent cdfEvent = this.cdfEvent;
                int hashCode10 = (hashCode9 + (cdfEvent != null ? cdfEvent.hashCode() : 0)) * 37;
                String str4 = this.row_id;
                int hashCode11 = hashCode10 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode11;
                return hashCode11;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CashInRequest.Builder builder = new CashInRequest.Builder(24);
                builder.request_context = this.image;
                builder.external_id = this.title;
                builder.source = this.localizable_title;
                builder.passcode_token = this.subtitle;
                builder.target = this.localizable_subtitle;
                builder.amount = this.action;
                builder.external_client_transfer_token = this.accessibility_text;
                builder.call_context = this.localizable_accessibility_text;
                builder.forwarded_call_context = this.cdfEvent;
                builder.client_verified_digital_wallet = this.row_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                RowImage rowImage = this.image;
                if (rowImage != null) {
                    arrayList.add("image=" + rowImage);
                }
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                LocalizableString localizableString = this.localizable_title;
                if (localizableString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
                }
                String str2 = this.subtitle;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
                }
                LocalizableString localizableString2 = this.localizable_subtitle;
                if (localizableString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_subtitle=", localizableString2, arrayList);
                }
                SavingsAction savingsAction = this.action;
                if (savingsAction != null) {
                    arrayList.add("action=" + savingsAction);
                }
                String str3 = this.accessibility_text;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accessibility_text=", arrayList);
                }
                LocalizableString localizableString3 = this.localizable_accessibility_text;
                if (localizableString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("localizable_accessibility_text=", localizableString3, arrayList);
                }
                CdfEvent cdfEvent = this.cdfEvent;
                if (cdfEvent != null) {
                    arrayList.add("cdfEvent=" + cdfEvent);
                }
                String str4 = this.row_id;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "row_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsOptionRow{", "}", 0, null, null, 56);
            }
        }

        static {
            SavingsHome$SavingsOptionsSection$Companion$ADAPTER$1 savingsHome$SavingsOptionsSection$Companion$ADAPTER$1 = new SavingsHome$SavingsOptionsSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsOptionsSection.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.SavingsOptionsSection", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
            ADAPTER = savingsHome$SavingsOptionsSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$SavingsOptionsSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsOptionsSection(LocalizableString localizableString, String str, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.accessibility_text = str;
            this.localizable_accessibility_text = localizableString;
            this.rows = TransactorKt.immutableCopyOf("rows", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SavingsOptionsSection)) {
                return false;
            }
            SavingsOptionsSection savingsOptionsSection = (SavingsOptionsSection) obj;
            return Intrinsics.areEqual(unknownFields(), savingsOptionsSection.unknownFields()) && Intrinsics.areEqual(this.rows, savingsOptionsSection.rows) && Intrinsics.areEqual(this.accessibility_text, savingsOptionsSection.accessibility_text) && Intrinsics.areEqual(this.localizable_accessibility_text, savingsOptionsSection.localizable_accessibility_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.rows);
            String str = this.accessibility_text;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_accessibility_text;
            int hashCode2 = hashCode + (localizableString != null ? localizableString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SettingsGroup.Builder builder = new SettingsGroup.Builder(2);
            builder.settings_categories = this.rows;
            builder.title = this.accessibility_text;
            builder.localizable_title = this.localizable_accessibility_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
            }
            String str = this.accessibility_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "accessibility_text=", arrayList);
            }
            LocalizableString localizableString = this.localizable_accessibility_text;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_accessibility_text=", localizableString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsOptionsSection{", "}", 0, null, null, 56);
        }
    }

    public final class TransfersSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransfersSection> CREATOR;
        public final AddCashConfig add_cash_config;
        public final SplitButtons buttons;
        public final AlternativeButtonBehavior primary_split_button_zero_balance_behavior;
        public final AlternativeButtonBehavior secondary_split_button_zero_balance_behavior;
        public final TransferOutConfig transfer_out_config;

        public final class AddCashConfig extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<AddCashConfig> CREATOR;
            public final Money initially_selected_amount;
            public final Money maximum_amount;
            public final Money minimum_amount;
            public final List quick_amounts;

            static {
                SavingsHome$TransfersSection$AddCashConfig$Companion$ADAPTER$1 savingsHome$TransfersSection$AddCashConfig$Companion$ADAPTER$1 = new SavingsHome$TransfersSection$AddCashConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddCashConfig.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.TransfersSection.AddCashConfig", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
                ADAPTER = savingsHome$TransfersSection$AddCashConfig$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$TransfersSection$AddCashConfig$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddCashConfig(List list, Money money, Money money2, Money money3, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.initially_selected_amount = money;
                this.minimum_amount = money2;
                this.maximum_amount = money3;
                this.quick_amounts = TransactorKt.immutableCopyOf("quick_amounts", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AddCashConfig)) {
                    return false;
                }
                AddCashConfig addCashConfig = (AddCashConfig) obj;
                return Intrinsics.areEqual(unknownFields(), addCashConfig.unknownFields()) && Intrinsics.areEqual(this.quick_amounts, addCashConfig.quick_amounts) && Intrinsics.areEqual(this.initially_selected_amount, addCashConfig.initially_selected_amount) && Intrinsics.areEqual(this.minimum_amount, addCashConfig.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, addCashConfig.maximum_amount);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.quick_amounts);
                Money money = this.initially_selected_amount;
                int hashCode = (m + (money != null ? money.hashCode() : 0)) * 37;
                Money money2 = this.minimum_amount;
                int hashCode2 = (hashCode + (money2 != null ? money2.hashCode() : 0)) * 37;
                Money money3 = this.maximum_amount;
                int hashCode3 = hashCode2 + (money3 != null ? money3.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Deduction.Builder builder = new Deduction.Builder(20);
                builder.description = this.quick_amounts;
                builder.amount = this.initially_selected_amount;
                builder.note = this.minimum_amount;
                builder.tint_color = this.maximum_amount;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.quick_amounts;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("quick_amounts=", arrayList, list);
                }
                Money money = this.initially_selected_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("initially_selected_amount=", money, arrayList);
                }
                Money money2 = this.minimum_amount;
                if (money2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money2, arrayList);
                }
                Money money3 = this.maximum_amount;
                if (money3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AddCashConfig{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class AlternativeButtonBehavior implements WireEnum {
            public static final /* synthetic */ AlternativeButtonBehavior[] $VALUES;
            public static final SavingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 ADAPTER;
            public static final LinkResolverDef Companion;
            public static final AlternativeButtonBehavior SHAKE_BALANCE;

            static {
                AlternativeButtonBehavior alternativeButtonBehavior = new AlternativeButtonBehavior("SHAKE_BALANCE", 0);
                SHAKE_BALANCE = alternativeButtonBehavior;
                $VALUES = new AlternativeButtonBehavior[]{alternativeButtonBehavior};
                Companion = new LinkResolverDef(28);
                ADAPTER = new SavingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AlternativeButtonBehavior.class), Syntax.PROTO_2, null);
            }

            public static final AlternativeButtonBehavior fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return SHAKE_BALANCE;
                }
                return null;
            }

            public static AlternativeButtonBehavior valueOf(String str) {
                return (AlternativeButtonBehavior) Enum.valueOf(AlternativeButtonBehavior.class, str);
            }

            public static AlternativeButtonBehavior[] values() {
                return (AlternativeButtonBehavior[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return 1;
            }
        }

        public final class TransferOutConfig extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TransferOutConfig> CREATOR;
            public final Money minimum_amount;

            static {
                SavingsHome$TransfersSection$TransferOutConfig$Companion$ADAPTER$1 savingsHome$TransfersSection$TransferOutConfig$Companion$ADAPTER$1 = new SavingsHome$TransfersSection$TransferOutConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransferOutConfig.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.TransfersSection.TransferOutConfig", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
                ADAPTER = savingsHome$TransfersSection$TransferOutConfig$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$TransfersSection$TransferOutConfig$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TransferOutConfig(Money money, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.minimum_amount = money;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TransferOutConfig)) {
                    return false;
                }
                TransferOutConfig transferOutConfig = (TransferOutConfig) obj;
                return Intrinsics.areEqual(unknownFields(), transferOutConfig.unknownFields()) && Intrinsics.areEqual(this.minimum_amount, transferOutConfig.minimum_amount);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.minimum_amount;
                int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Entity.Payment.Builder builder = new Entity.Payment.Builder(12);
                builder.amount = this.minimum_amount;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.minimum_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TransferOutConfig{", "}", 0, null, null, 56);
            }
        }

        static {
            SavingsHome$TransfersSection$Companion$ADAPTER$1 savingsHome$TransfersSection$Companion$ADAPTER$1 = new SavingsHome$TransfersSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransfersSection.class), "type.googleapis.com/squareup.cash.savings.SavingsHome.TransfersSection", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
            ADAPTER = savingsHome$TransfersSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$TransfersSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransfersSection(SplitButtons splitButtons, AddCashConfig addCashConfig, AlternativeButtonBehavior alternativeButtonBehavior, AlternativeButtonBehavior alternativeButtonBehavior2, TransferOutConfig transferOutConfig, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.buttons = splitButtons;
            this.add_cash_config = addCashConfig;
            this.primary_split_button_zero_balance_behavior = alternativeButtonBehavior;
            this.secondary_split_button_zero_balance_behavior = alternativeButtonBehavior2;
            this.transfer_out_config = transferOutConfig;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransfersSection)) {
                return false;
            }
            TransfersSection transfersSection = (TransfersSection) obj;
            return Intrinsics.areEqual(unknownFields(), transfersSection.unknownFields()) && Intrinsics.areEqual(this.buttons, transfersSection.buttons) && Intrinsics.areEqual(this.add_cash_config, transfersSection.add_cash_config) && this.primary_split_button_zero_balance_behavior == transfersSection.primary_split_button_zero_balance_behavior && this.secondary_split_button_zero_balance_behavior == transfersSection.secondary_split_button_zero_balance_behavior && Intrinsics.areEqual(this.transfer_out_config, transfersSection.transfer_out_config);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            SplitButtons splitButtons = this.buttons;
            int hashCode2 = (hashCode + (splitButtons != null ? splitButtons.hashCode() : 0)) * 37;
            AddCashConfig addCashConfig = this.add_cash_config;
            int hashCode3 = (hashCode2 + (addCashConfig != null ? addCashConfig.hashCode() : 0)) * 37;
            AlternativeButtonBehavior alternativeButtonBehavior = this.primary_split_button_zero_balance_behavior;
            int hashCode4 = (hashCode3 + (alternativeButtonBehavior != null ? alternativeButtonBehavior.hashCode() : 0)) * 37;
            AlternativeButtonBehavior alternativeButtonBehavior2 = this.secondary_split_button_zero_balance_behavior;
            int hashCode5 = (hashCode4 + (alternativeButtonBehavior2 != null ? alternativeButtonBehavior2.hashCode() : 0)) * 37;
            TransferOutConfig transferOutConfig = this.transfer_out_config;
            int hashCode6 = hashCode5 + (transferOutConfig != null ? transferOutConfig.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Binding.Builder builder = new Binding.Builder(23);
            builder.key_path = this.buttons;
            builder.get_transform = this.add_cash_config;
            builder.set_transform = this.primary_split_button_zero_balance_behavior;
            builder.validation = this.secondary_split_button_zero_balance_behavior;
            builder.on_invalid = this.transfer_out_config;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            SplitButtons splitButtons = this.buttons;
            if (splitButtons != null) {
                arrayList.add("buttons=" + splitButtons);
            }
            AddCashConfig addCashConfig = this.add_cash_config;
            if (addCashConfig != null) {
                arrayList.add("add_cash_config=" + addCashConfig);
            }
            AlternativeButtonBehavior alternativeButtonBehavior = this.primary_split_button_zero_balance_behavior;
            if (alternativeButtonBehavior != null) {
                arrayList.add("primary_split_button_zero_balance_behavior=" + alternativeButtonBehavior);
            }
            AlternativeButtonBehavior alternativeButtonBehavior2 = this.secondary_split_button_zero_balance_behavior;
            if (alternativeButtonBehavior2 != null) {
                arrayList.add("secondary_split_button_zero_balance_behavior=" + alternativeButtonBehavior2);
            }
            TransferOutConfig transferOutConfig = this.transfer_out_config;
            if (transferOutConfig != null) {
                arrayList.add("transfer_out_config=" + transferOutConfig);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransfersSection{", "}", 0, null, null, 56);
        }
    }

    static {
        SavingsHome$Companion$ADAPTER$1 savingsHome$Companion$ADAPTER$1 = new SavingsHome$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsHome.class), "type.googleapis.com/squareup.cash.savings.SavingsHome", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsHome.proto");
        ADAPTER = savingsHome$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsHome$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsHome(SavingsOptionsSection savingsOptionsSection, ActivitySection activitySection, TransfersSection transfersSection, Card card, Header header, Footer footer, CompactCard compactCard, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.options_section = savingsOptionsSection;
        this.activity_section = activitySection;
        this.transfers_section = transfersSection;
        this.card_section = card;
        this.header = header;
        this.footer = footer;
        this.compact_card_section = compactCard;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsHome)) {
            return false;
        }
        SavingsHome savingsHome = (SavingsHome) obj;
        return Intrinsics.areEqual(unknownFields(), savingsHome.unknownFields()) && Intrinsics.areEqual(this.options_section, savingsHome.options_section) && Intrinsics.areEqual(this.activity_section, savingsHome.activity_section) && Intrinsics.areEqual(this.transfers_section, savingsHome.transfers_section) && Intrinsics.areEqual(this.card_section, savingsHome.card_section) && Intrinsics.areEqual(this.header, savingsHome.header) && Intrinsics.areEqual(this.footer, savingsHome.footer) && Intrinsics.areEqual(this.compact_card_section, savingsHome.compact_card_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SavingsOptionsSection savingsOptionsSection = this.options_section;
        int hashCode2 = (hashCode + (savingsOptionsSection != null ? savingsOptionsSection.hashCode() : 0)) * 37;
        ActivitySection activitySection = this.activity_section;
        int hashCode3 = (hashCode2 + (activitySection != null ? activitySection.hashCode() : 0)) * 37;
        TransfersSection transfersSection = this.transfers_section;
        int hashCode4 = (hashCode3 + (transfersSection != null ? transfersSection.hashCode() : 0)) * 37;
        Card card = this.card_section;
        int hashCode5 = (hashCode4 + (card != null ? card.hashCode() : 0)) * 37;
        Header header = this.header;
        int hashCode6 = (hashCode5 + (header != null ? header.hashCode() : 0)) * 37;
        Footer footer = this.footer;
        int hashCode7 = (hashCode6 + (footer != null ? footer.hashCode() : 0)) * 37;
        CompactCard compactCard = this.compact_card_section;
        int hashCode8 = hashCode7 + (compactCard != null ? compactCard.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(28, false);
        builder.f1407type = this.options_section;
        builder.scope = this.activity_section;
        builder.value = this.transfers_section;
        builder.first_verified_at_ms = this.card_section;
        builder.last_verified_at_ms = this.header;
        builder.created_at = this.footer;
        builder.updated_at = this.compact_card_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SavingsOptionsSection savingsOptionsSection = this.options_section;
        if (savingsOptionsSection != null) {
            arrayList.add("options_section=" + savingsOptionsSection);
        }
        ActivitySection activitySection = this.activity_section;
        if (activitySection != null) {
            arrayList.add("activity_section=" + activitySection);
        }
        TransfersSection transfersSection = this.transfers_section;
        if (transfersSection != null) {
            arrayList.add("transfers_section=" + transfersSection);
        }
        Card card = this.card_section;
        if (card != null) {
            arrayList.add("card_section=" + card);
        }
        Header header = this.header;
        if (header != null) {
            arrayList.add("header=" + header);
        }
        Footer footer = this.footer;
        if (footer != null) {
            arrayList.add("footer=" + footer);
        }
        CompactCard compactCard = this.compact_card_section;
        if (compactCard != null) {
            arrayList.add("compact_card_section=" + compactCard);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsHome{", "}", 0, null, null, 56);
    }
}
