package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
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
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;
import squareup.cash.bills.BillsConfig;
import squareup.cash.earnings.AddPaycheckTool;
import squareup.cash.paychecks.Deduction;
import xyz.block.protos.genie.Action;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Collection;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaychecksHomeUi> CREATOR;
    public final String banking_benefits_booklet_client_route;
    public final Header header;
    public final TermsOfService paychecks_terms;
    public final List sections;
    public final TermsOfService terms_of_service;

    public final class ActiveDistributionSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActiveDistributionSection> CREATOR;
        public final String edit_button_client_route;
        public final LocalizedString edit_button_text;
        public final LocalizedString title_text;

        static {
            PaychecksHomeUi$ActiveDistributionSection$Companion$ADAPTER$1 paychecksHomeUi$ActiveDistributionSection$Companion$ADAPTER$1 = new PaychecksHomeUi$ActiveDistributionSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActiveDistributionSection.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.ActiveDistributionSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$ActiveDistributionSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$ActiveDistributionSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActiveDistributionSection(LocalizedString localizedString, LocalizedString localizedString2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.edit_button_client_route = str;
            this.title_text = localizedString;
            this.edit_button_text = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActiveDistributionSection)) {
                return false;
            }
            ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
            return Intrinsics.areEqual(unknownFields(), activeDistributionSection.unknownFields()) && Intrinsics.areEqual(this.edit_button_client_route, activeDistributionSection.edit_button_client_route) && Intrinsics.areEqual(this.title_text, activeDistributionSection.title_text) && Intrinsics.areEqual(this.edit_button_text, activeDistributionSection.edit_button_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.edit_button_client_route;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title_text;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.edit_button_text;
            int hashCode4 = hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AddPaycheckTool.Builder builder = new AddPaycheckTool.Builder(4);
            builder.client_route = this.edit_button_client_route;
            builder.title = this.title_text;
            builder.subtitle = this.edit_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.edit_button_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "edit_button_client_route=", arrayList);
            }
            LocalizedString localizedString = this.title_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.edit_button_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("edit_button_text=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActiveDistributionSection{", "}", 0, null, null, 56);
        }
    }

    public final class ActivitySection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivitySection> CREATOR;
        public final LocalizedString load_failure_subtitle;
        public final LocalizedString no_activity_subtitle;
        public final LocalizedString stale_activity_title;
        public final LocalizedString title;
        public final LocalizedString view_all_button_title;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public LocalizedString load_failure_subtitle;
            public LocalizedString no_activity_subtitle;
            public LocalizedString stale_activity_title;
            public LocalizedString title;
            public LocalizedString view_all_button_title;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new ActivitySection(this.title, this.no_activity_subtitle, this.load_failure_subtitle, this.view_all_button_title, this.stale_activity_title, buildUnknownFields());
                    default:
                        return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet(this.title, this.no_activity_subtitle, this.load_failure_subtitle, this.view_all_button_title, this.stale_activity_title, buildUnknownFields());
                }
            }
        }

        static {
            PaychecksHomeUi$ActivitySection$Companion$ADAPTER$1 paychecksHomeUi$ActivitySection$Companion$ADAPTER$1 = new PaychecksHomeUi$ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$ActivitySection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$ActivitySection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivitySection(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.no_activity_subtitle = localizedString2;
            this.load_failure_subtitle = localizedString3;
            this.view_all_button_title = localizedString4;
            this.stale_activity_title = localizedString5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivitySection)) {
                return false;
            }
            ActivitySection activitySection = (ActivitySection) obj;
            return Intrinsics.areEqual(unknownFields(), activitySection.unknownFields()) && Intrinsics.areEqual(this.title, activitySection.title) && Intrinsics.areEqual(this.no_activity_subtitle, activitySection.no_activity_subtitle) && Intrinsics.areEqual(this.load_failure_subtitle, activitySection.load_failure_subtitle) && Intrinsics.areEqual(this.view_all_button_title, activitySection.view_all_button_title) && Intrinsics.areEqual(this.stale_activity_title, activitySection.stale_activity_title);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.no_activity_subtitle;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.load_failure_subtitle;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            LocalizedString localizedString4 = this.view_all_button_title;
            int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
            LocalizedString localizedString5 = this.stale_activity_title;
            int hashCode6 = hashCode5 + (localizedString5 != null ? localizedString5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.title = this.title;
            builder.no_activity_subtitle = this.no_activity_subtitle;
            builder.load_failure_subtitle = this.load_failure_subtitle;
            builder.view_all_button_title = this.view_all_button_title;
            builder.stale_activity_title = this.stale_activity_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.no_activity_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("no_activity_subtitle=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.load_failure_subtitle;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("load_failure_subtitle=", localizedString3, arrayList);
            }
            LocalizedString localizedString4 = this.view_all_button_title;
            if (localizedString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("view_all_button_title=", localizedString4, arrayList);
            }
            LocalizedString localizedString5 = this.stale_activity_title;
            if (localizedString5 != null) {
                Matcher$$ExternalSyntheticOutline0.m("stale_activity_title=", localizedString5, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySection{", "}", 0, null, null, 56);
        }
    }

    public final class AddOrUpdateDirectDepositSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AddOrUpdateDirectDepositSection> CREATOR;
        public final String button_client_route;
        public final LocalizedString button_text;
        public final String denylisted_customer_client_route;
        public final PendingDirectDepositInfo pending_direct_deposit_info;

        public final class HalfSheet extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<HalfSheet> CREATOR;
            public final LocalizedString body;
            public final LocalizedString button_text;
            public final Icon icon;
            public final LocalizedString title;

            static {
                PaychecksHomeUi$AddOrUpdateDirectDepositSection$HalfSheet$Companion$ADAPTER$1 paychecksHomeUi$AddOrUpdateDirectDepositSection$HalfSheet$Companion$ADAPTER$1 = new PaychecksHomeUi$AddOrUpdateDirectDepositSection$HalfSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HalfSheet.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
                ADAPTER = paychecksHomeUi$AddOrUpdateDirectDepositSection$HalfSheet$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$AddOrUpdateDirectDepositSection$HalfSheet$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HalfSheet(Icon icon, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.icon = icon;
                this.body = localizedString2;
                this.button_text = localizedString3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof HalfSheet)) {
                    return false;
                }
                HalfSheet halfSheet = (HalfSheet) obj;
                return Intrinsics.areEqual(unknownFields(), halfSheet.unknownFields()) && Intrinsics.areEqual(this.title, halfSheet.title) && Intrinsics.areEqual(this.icon, halfSheet.icon) && Intrinsics.areEqual(this.body, halfSheet.body) && Intrinsics.areEqual(this.button_text, halfSheet.button_text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.body;
                int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.button_text;
                int hashCode5 = hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Deduction.Builder builder = new Deduction.Builder(17);
                builder.description = this.title;
                builder.amount = this.icon;
                builder.note = this.body;
                builder.tint_color = this.button_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                LocalizedString localizedString2 = this.body;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.button_text;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "HalfSheet{", "}", 0, null, null, 56);
            }
        }

        public final class PendingDirectDepositInfo extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PendingDirectDepositInfo> CREATOR;
            public final LocalizedString button_text;
            public final HalfSheet half_sheet;
            public final LocalizedString secondary_button_text;

            static {
                PaychecksHomeUi$AddOrUpdateDirectDepositSection$PendingDirectDepositInfo$Companion$ADAPTER$1 paychecksHomeUi$AddOrUpdateDirectDepositSection$PendingDirectDepositInfo$Companion$ADAPTER$1 = new PaychecksHomeUi$AddOrUpdateDirectDepositSection$PendingDirectDepositInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PendingDirectDepositInfo.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
                ADAPTER = paychecksHomeUi$AddOrUpdateDirectDepositSection$PendingDirectDepositInfo$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$AddOrUpdateDirectDepositSection$PendingDirectDepositInfo$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PendingDirectDepositInfo(LocalizedString localizedString, LocalizedString localizedString2, HalfSheet halfSheet, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.secondary_button_text = localizedString;
                this.button_text = localizedString2;
                this.half_sheet = halfSheet;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PendingDirectDepositInfo)) {
                    return false;
                }
                PendingDirectDepositInfo pendingDirectDepositInfo = (PendingDirectDepositInfo) obj;
                return Intrinsics.areEqual(unknownFields(), pendingDirectDepositInfo.unknownFields()) && Intrinsics.areEqual(this.secondary_button_text, pendingDirectDepositInfo.secondary_button_text) && Intrinsics.areEqual(this.button_text, pendingDirectDepositInfo.button_text) && Intrinsics.areEqual(this.half_sheet, pendingDirectDepositInfo.half_sheet);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.secondary_button_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.button_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                HalfSheet halfSheet = this.half_sheet;
                int hashCode4 = hashCode3 + (halfSheet != null ? halfSheet.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsApplet.Builder builder = new BillsApplet.Builder(21);
                builder.action = this.secondary_button_text;
                builder.full_applet = this.button_text;
                builder.half_applet = this.half_sheet;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.secondary_button_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("secondary_button_text=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.button_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString2, arrayList);
                }
                HalfSheet halfSheet = this.half_sheet;
                if (halfSheet != null) {
                    arrayList.add("half_sheet=" + halfSheet);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PendingDirectDepositInfo{", "}", 0, null, null, 56);
            }
        }

        static {
            PaychecksHomeUi$AddOrUpdateDirectDepositSection$Companion$ADAPTER$1 paychecksHomeUi$AddOrUpdateDirectDepositSection$Companion$ADAPTER$1 = new PaychecksHomeUi$AddOrUpdateDirectDepositSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddOrUpdateDirectDepositSection.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.AddOrUpdateDirectDepositSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$AddOrUpdateDirectDepositSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$AddOrUpdateDirectDepositSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddOrUpdateDirectDepositSection(String str, LocalizedString localizedString, String str2, PendingDirectDepositInfo pendingDirectDepositInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.button_client_route = str;
            this.button_text = localizedString;
            this.denylisted_customer_client_route = str2;
            this.pending_direct_deposit_info = pendingDirectDepositInfo;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddOrUpdateDirectDepositSection)) {
                return false;
            }
            AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = (AddOrUpdateDirectDepositSection) obj;
            return Intrinsics.areEqual(unknownFields(), addOrUpdateDirectDepositSection.unknownFields()) && Intrinsics.areEqual(this.button_client_route, addOrUpdateDirectDepositSection.button_client_route) && Intrinsics.areEqual(this.button_text, addOrUpdateDirectDepositSection.button_text) && Intrinsics.areEqual(this.denylisted_customer_client_route, addOrUpdateDirectDepositSection.denylisted_customer_client_route) && Intrinsics.areEqual(this.pending_direct_deposit_info, addOrUpdateDirectDepositSection.pending_direct_deposit_info);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.button_client_route;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.button_text;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            String str2 = this.denylisted_customer_client_route;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            PendingDirectDepositInfo pendingDirectDepositInfo = this.pending_direct_deposit_info;
            int hashCode5 = hashCode4 + (pendingDirectDepositInfo != null ? pendingDirectDepositInfo.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Deduction.Builder builder = new Deduction.Builder(16);
            builder.amount = this.button_client_route;
            builder.description = this.button_text;
            builder.note = this.denylisted_customer_client_route;
            builder.tint_color = this.pending_direct_deposit_info;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.button_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_client_route=", arrayList);
            }
            LocalizedString localizedString = this.button_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString, arrayList);
            }
            String str2 = this.denylisted_customer_client_route;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "denylisted_customer_client_route=", arrayList);
            }
            PendingDirectDepositInfo pendingDirectDepositInfo = this.pending_direct_deposit_info;
            if (pendingDirectDepositInfo != null) {
                arrayList.add("pending_direct_deposit_info=" + pendingDirectDepositInfo);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AddOrUpdateDirectDepositSection{", "}", 0, null, null, 56);
        }
    }

    public final class DistributionNUXSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DistributionNUXSection> CREATOR;
        public final String call_to_action_client_route;
        public final LocalizedString call_to_action_text;
        public final String edit_multi_allocation_client_route;
        public final Image header_image;
        public final LocalizedString subtitle;
        public final LocalizedString title;

        static {
            PaychecksHomeUi$DistributionNUXSection$Companion$ADAPTER$1 paychecksHomeUi$DistributionNUXSection$Companion$ADAPTER$1 = new PaychecksHomeUi$DistributionNUXSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DistributionNUXSection.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.DistributionNUXSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$DistributionNUXSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$DistributionNUXSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DistributionNUXSection(Image image, String str, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.header_image = image;
            this.call_to_action_client_route = str;
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.call_to_action_text = localizedString3;
            this.edit_multi_allocation_client_route = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DistributionNUXSection)) {
                return false;
            }
            DistributionNUXSection distributionNUXSection = (DistributionNUXSection) obj;
            return Intrinsics.areEqual(unknownFields(), distributionNUXSection.unknownFields()) && Intrinsics.areEqual(this.header_image, distributionNUXSection.header_image) && Intrinsics.areEqual(this.call_to_action_client_route, distributionNUXSection.call_to_action_client_route) && Intrinsics.areEqual(this.title, distributionNUXSection.title) && Intrinsics.areEqual(this.subtitle, distributionNUXSection.subtitle) && Intrinsics.areEqual(this.call_to_action_text, distributionNUXSection.call_to_action_text) && Intrinsics.areEqual(this.edit_multi_allocation_client_route, distributionNUXSection.edit_multi_allocation_client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.header_image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            String str = this.call_to_action_client_route;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.call_to_action_text;
            int hashCode6 = (hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            String str2 = this.edit_multi_allocation_client_route;
            int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(8);
            builder.navigate = this.header_image;
            builder.set_view_state_value = this.call_to_action_client_route;
            builder.open_url = this.title;
            builder.compound_action = this.subtitle;
            builder.submit = this.call_to_action_text;
            builder.collection_mutation = this.edit_multi_allocation_client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.header_image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("header_image=", image, arrayList);
            }
            String str = this.call_to_action_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "call_to_action_client_route=", arrayList);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.call_to_action_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("call_to_action_text=", localizedString3, arrayList);
            }
            String str2 = this.edit_multi_allocation_client_route;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "edit_multi_allocation_client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DistributionNUXSection{", "}", 0, null, null, 56);
        }
    }

    public final class Header extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Header> CREATOR;
        public final NullStateUpsell null_state_upsell;
        public final ViewBenefitsButton view_benefits_button;

        public final class NullStateUpsell extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<NullStateUpsell> CREATOR;
            public final List detail_rows;

            public final class DetailRow extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<DetailRow> CREATOR;
                public final PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute Action;
                public final LocalizedString button_text;
                public final Boolean step_completed;
                public final LocalizedString subtitle;
                public final LocalizedString title;

                static {
                    PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Companion$ADAPTER$1 paychecksHomeUi$Header$NullStateUpsell$DetailRow$Companion$ADAPTER$1 = new PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailRow.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.Header.NullStateUpsell.DetailRow", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
                    ADAPTER = paychecksHomeUi$Header$NullStateUpsell$DetailRow$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$Header$NullStateUpsell$DetailRow$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DetailRow(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, Boolean bool, PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.title = localizedString;
                    this.subtitle = localizedString2;
                    this.button_text = localizedString3;
                    this.step_completed = bool;
                    this.Action = paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof DetailRow)) {
                        return false;
                    }
                    DetailRow detailRow = (DetailRow) obj;
                    return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.subtitle, detailRow.subtitle) && Intrinsics.areEqual(this.button_text, detailRow.button_text) && Intrinsics.areEqual(this.step_completed, detailRow.step_completed) && Intrinsics.areEqual(this.Action, detailRow.Action);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalizedString localizedString = this.title;
                    int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                    LocalizedString localizedString2 = this.subtitle;
                    int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                    LocalizedString localizedString3 = this.button_text;
                    int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                    Boolean bool = this.step_completed;
                    int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                    PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = this.Action;
                    int hashCode6 = hashCode5 + (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null ? paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute.value.hashCode() : 0);
                    this.hashCode = hashCode6;
                    return hashCode6;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Binding.Builder builder = new Binding.Builder(18);
                    builder.key_path = this.title;
                    builder.get_transform = this.subtitle;
                    builder.set_transform = this.button_text;
                    builder.validation = this.step_completed;
                    builder.on_invalid = this.Action;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalizedString localizedString = this.title;
                    if (localizedString != null) {
                        Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                    }
                    LocalizedString localizedString2 = this.subtitle;
                    if (localizedString2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
                    }
                    LocalizedString localizedString3 = this.button_text;
                    if (localizedString3 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString3, arrayList);
                    }
                    Boolean bool = this.step_completed;
                    if (bool != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("step_completed=", bool, arrayList);
                    }
                    PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = this.Action;
                    if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null) {
                        arrayList.add("Action=" + paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
                }
            }

            static {
                PaychecksHomeUi$Header$NullStateUpsell$Companion$ADAPTER$1 paychecksHomeUi$Header$NullStateUpsell$Companion$ADAPTER$1 = new PaychecksHomeUi$Header$NullStateUpsell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NullStateUpsell.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.Header.NullStateUpsell", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
                ADAPTER = paychecksHomeUi$Header$NullStateUpsell$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$Header$NullStateUpsell$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NullStateUpsell(List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NullStateUpsell)) {
                    return false;
                }
                NullStateUpsell nullStateUpsell = (NullStateUpsell) obj;
                return Intrinsics.areEqual(unknownFields(), nullStateUpsell.unknownFields()) && Intrinsics.areEqual(this.detail_rows, nullStateUpsell.detail_rows);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.detail_rows.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Collection.Builder builder = new Collection.Builder(23, false);
                builder.items = this.detail_rows;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.detail_rows;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "NullStateUpsell{", "}", 0, null, null, 56);
            }
        }

        public final class ViewBenefitsButton extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ViewBenefitsButton> CREATOR;
            public final PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute Action;
            public final LocalizedString button_text;

            static {
                PaychecksHomeUi$Header$ViewBenefitsButton$Companion$ADAPTER$1 paychecksHomeUi$Header$ViewBenefitsButton$Companion$ADAPTER$1 = new PaychecksHomeUi$Header$ViewBenefitsButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewBenefitsButton.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.Header.ViewBenefitsButton", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
                ADAPTER = paychecksHomeUi$Header$ViewBenefitsButton$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$Header$ViewBenefitsButton$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewBenefitsButton(LocalizedString localizedString, PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.button_text = localizedString;
                this.Action = paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ViewBenefitsButton)) {
                    return false;
                }
                ViewBenefitsButton viewBenefitsButton = (ViewBenefitsButton) obj;
                return Intrinsics.areEqual(unknownFields(), viewBenefitsButton.unknownFields()) && Intrinsics.areEqual(this.button_text, viewBenefitsButton.button_text) && Intrinsics.areEqual(this.Action, viewBenefitsButton.Action);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.button_text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = this.Action;
                int hashCode3 = hashCode2 + (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute != null ? paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute.value.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BillsConfig.Builder builder = new BillsConfig.Builder(20);
                builder.bills_applet_default_action = this.button_text;
                builder.half_applet_content = this.Action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.button_text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("button_text=", localizedString, arrayList);
                }
                PaychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute = this.Action;
                if (paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute != null) {
                    arrayList.add("Action=" + paychecksHomeUi$Header$ViewBenefitsButton$Action_$ClientRoute);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ViewBenefitsButton{", "}", 0, null, null, 56);
            }
        }

        static {
            PaychecksHomeUi$Header$Companion$ADAPTER$1 paychecksHomeUi$Header$Companion$ADAPTER$1 = new PaychecksHomeUi$Header$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Header.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.Header", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$Header$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$Header$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(NullStateUpsell nullStateUpsell, ViewBenefitsButton viewBenefitsButton, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.null_state_upsell = nullStateUpsell;
            this.view_benefits_button = viewBenefitsButton;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.null_state_upsell, header.null_state_upsell) && Intrinsics.areEqual(this.view_benefits_button, header.view_benefits_button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            NullStateUpsell nullStateUpsell = this.null_state_upsell;
            int hashCode2 = (hashCode + (nullStateUpsell != null ? nullStateUpsell.hashCode() : 0)) * 37;
            ViewBenefitsButton viewBenefitsButton = this.view_benefits_button;
            int hashCode3 = hashCode2 + (viewBenefitsButton != null ? viewBenefitsButton.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(19);
            builder.bills_applet_default_action = this.null_state_upsell;
            builder.half_applet_content = this.view_benefits_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            NullStateUpsell nullStateUpsell = this.null_state_upsell;
            if (nullStateUpsell != null) {
                arrayList.add("null_state_upsell=" + nullStateUpsell);
            }
            ViewBenefitsButton viewBenefitsButton = this.view_benefits_button;
            if (viewBenefitsButton != null) {
                arrayList.add("view_benefits_button=" + viewBenefitsButton);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56);
        }
    }

    public final class KYBEligibilityWarningSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<KYBEligibilityWarningSection> CREATOR;

        static {
            PaychecksHomeUi$KYBEligibilityWarningSection$Companion$ADAPTER$1 paychecksHomeUi$KYBEligibilityWarningSection$Companion$ADAPTER$1 = new PaychecksHomeUi$KYBEligibilityWarningSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(KYBEligibilityWarningSection.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.KYBEligibilityWarningSection", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$KYBEligibilityWarningSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$KYBEligibilityWarningSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KYBEligibilityWarningSection(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof KYBEligibilityWarningSection) && Intrinsics.areEqual(unknownFields(), ((KYBEligibilityWarningSection) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(17);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "KYBEligibilityWarningSection{}";
        }
    }

    public final class Section extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Section> CREATOR;
        public final LoadableStateKt section;
        public final SectionVisibilityPredicate visibility_predicate;
        public final List visibility_predicates;

        static {
            PaychecksHomeUi$Section$Companion$ADAPTER$1 paychecksHomeUi$Section$Companion$ADAPTER$1 = new PaychecksHomeUi$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.Section", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$Section$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$Section$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Section(SectionVisibilityPredicate sectionVisibilityPredicate, LoadableStateKt loadableStateKt, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.visibility_predicate = sectionVisibilityPredicate;
            this.section = loadableStateKt;
            this.visibility_predicates = TransactorKt.immutableCopyOf("visibility_predicates", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && this.visibility_predicate == section.visibility_predicate && Intrinsics.areEqual(this.section, section.section) && Intrinsics.areEqual(this.visibility_predicates, section.visibility_predicates);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            SectionVisibilityPredicate sectionVisibilityPredicate = this.visibility_predicate;
            int hashCode2 = (hashCode + (sectionVisibilityPredicate != null ? sectionVisibilityPredicate.hashCode() : 0)) * 37;
            LoadableStateKt loadableStateKt = this.section;
            int hashCode3 = this.visibility_predicates.hashCode() + ((hashCode2 + (loadableStateKt != null ? loadableStateKt.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(22);
            builder.action = this.visibility_predicate;
            builder.full_applet = this.section;
            builder.half_applet = this.visibility_predicates;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            SectionVisibilityPredicate sectionVisibilityPredicate = this.visibility_predicate;
            if (sectionVisibilityPredicate != null) {
                arrayList.add("visibility_predicate=" + sectionVisibilityPredicate);
            }
            LoadableStateKt loadableStateKt = this.section;
            if (loadableStateKt != null) {
                arrayList.add("section=" + loadableStateKt);
            }
            List list = this.visibility_predicates;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("visibility_predicates=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
        }
    }

    public enum SectionVisibilityPredicate implements WireEnum {
        DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM(0),
        ALWAYS_VISIBLE(1),
        CURRENT_DISTRIBUTION_SET(2),
        NO_CURRENT_DISTRIBUTION_SET(3),
        CUSTOMER_DDA_IS_NOT_LOCKED(4),
        CUSTOMER_IS_NOT_DENYLISTED(5),
        CUSTOMER_HAS_KYB_ELIGIBILITY_WARNING(6);

        public static final PaychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 ADAPTER;
        public static final POPMatchingFactory Companion;
        public final int value;

        static {
            SectionVisibilityPredicate sectionVisibilityPredicate = DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM;
            Companion = new POPMatchingFactory(27);
            ADAPTER = new PaychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SectionVisibilityPredicate.class), Syntax.PROTO_2, sectionVisibilityPredicate);
        }

        SectionVisibilityPredicate(int i) {
            this.value = i;
        }

        public static final SectionVisibilityPredicate fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM;
                case 1:
                    return ALWAYS_VISIBLE;
                case 2:
                    return CURRENT_DISTRIBUTION_SET;
                case 3:
                    return NO_CURRENT_DISTRIBUTION_SET;
                case 4:
                    return CUSTOMER_DDA_IS_NOT_LOCKED;
                case 5:
                    return CUSTOMER_IS_NOT_DENYLISTED;
                case 6:
                    return CUSTOMER_HAS_KYB_ELIGIBILITY_WARNING;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class TermsOfService extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TermsOfService> CREATOR;
        public final List text;

        static {
            PaychecksHomeUi$TermsOfService$Companion$ADAPTER$1 paychecksHomeUi$TermsOfService$Companion$ADAPTER$1 = new PaychecksHomeUi$TermsOfService$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TermsOfService.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi.TermsOfService", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
            ADAPTER = paychecksHomeUi$TermsOfService$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$TermsOfService$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TermsOfService(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.text = TransactorKt.immutableCopyOf("text", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TermsOfService)) {
                return false;
            }
            TermsOfService termsOfService = (TermsOfService) obj;
            return Intrinsics.areEqual(unknownFields(), termsOfService.unknownFields()) && Intrinsics.areEqual(this.text, termsOfService.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.text.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Collection.Builder builder = new Collection.Builder(24, false);
            builder.items = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.text;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("text=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TermsOfService{", "}", 0, null, null, 56);
        }
    }

    static {
        PaychecksHomeUi$Companion$ADAPTER$1 paychecksHomeUi$Companion$ADAPTER$1 = new PaychecksHomeUi$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaychecksHomeUi.class), "type.googleapis.com/squareup.cash.paychecks.PaychecksHomeUi", Syntax.PROTO_2, null, "squareup/cash/paychecks/PaychecksHomeUi.proto");
        ADAPTER = paychecksHomeUi$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksHomeUi$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaychecksHomeUi(List list, Header header, TermsOfService termsOfService, String str, TermsOfService termsOfService2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header = header;
        this.terms_of_service = termsOfService;
        this.banking_benefits_booklet_client_route = str;
        this.paychecks_terms = termsOfService2;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaychecksHomeUi)) {
            return false;
        }
        PaychecksHomeUi paychecksHomeUi = (PaychecksHomeUi) obj;
        return Intrinsics.areEqual(unknownFields(), paychecksHomeUi.unknownFields()) && Intrinsics.areEqual(this.sections, paychecksHomeUi.sections) && Intrinsics.areEqual(this.header, paychecksHomeUi.header) && Intrinsics.areEqual(this.terms_of_service, paychecksHomeUi.terms_of_service) && Intrinsics.areEqual(this.banking_benefits_booklet_client_route, paychecksHomeUi.banking_benefits_booklet_client_route) && Intrinsics.areEqual(this.paychecks_terms, paychecksHomeUi.paychecks_terms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sections);
        Header header = this.header;
        int hashCode = (m + (header != null ? header.hashCode() : 0)) * 37;
        TermsOfService termsOfService = this.terms_of_service;
        int hashCode2 = (hashCode + (termsOfService != null ? termsOfService.hashCode() : 0)) * 37;
        String str = this.banking_benefits_booklet_client_route;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TermsOfService termsOfService2 = this.paychecks_terms;
        int hashCode4 = hashCode3 + (termsOfService2 != null ? termsOfService2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(17);
        builder.key_path = this.sections;
        builder.get_transform = this.header;
        builder.set_transform = this.terms_of_service;
        builder.validation = this.banking_benefits_booklet_client_route;
        builder.on_invalid = this.paychecks_terms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        Header header = this.header;
        if (header != null) {
            arrayList.add("header=" + header);
        }
        TermsOfService termsOfService = this.terms_of_service;
        if (termsOfService != null) {
            arrayList.add("terms_of_service=" + termsOfService);
        }
        String str = this.banking_benefits_booklet_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "banking_benefits_booklet_client_route=", arrayList);
        }
        TermsOfService termsOfService2 = this.paychecks_terms;
        if (termsOfService2 != null) {
            arrayList.add("paychecks_terms=" + termsOfService2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaychecksHomeUi{", "}", 0, null, null, 56);
    }
}
