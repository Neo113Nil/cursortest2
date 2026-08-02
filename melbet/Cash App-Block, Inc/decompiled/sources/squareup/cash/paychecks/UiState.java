package squareup.cash.paychecks;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.cashstorefronts.api.BusinessMetadata;
import com.squareup.protos.cash.cashstorefronts.api.BusinessProfile;
import com.squareup.protos.cash.cashstorefronts.api.Status;
import com.squareup.protos.cash.cashstorefronts.api.TargetApp;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;

/* loaded from: classes10.dex */
public final class UiState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiState> CREATOR;
    public final LocalizedString activity_subtitle;
    public final LocalizedString applet_accessibility_hint;
    public final LocalizedString applet_accessibility_label;
    public final LocalizedString applet_banking_benefits_setup_cta_text;
    public final TreehouseAppletBrief applet_brief;
    public final AppletState applet_state;
    public final Long applet_text_rollover_date;
    public final LocalizedString applet_title_text;
    public final BenefitsDetails benefits_details;
    public final BenefitsStatusSection benefits_status_section;
    public final CurrentMonthPaychecksAggregation current_month_paychecks_aggregation;
    public final Boolean customer_acknowledged_risk_alert;
    public final Boolean customer_dda_is_locked;
    public final Boolean customer_is_denylisted;
    public final CalendarMonthPaychecksAggregation displayed_monthly_aggregation;
    public final KybEligibilityWarning kyb_eligibility_warning;
    public final String paychecks_applet_client_route;
    public final String paychecks_on_money_tab_client_route;
    public final LocalizedString post_rollover_applet_accessibility_value;
    public final LocalizedString post_rollover_applet_text;
    public final LocalizedString pre_rollover_applet_accessibility_value;
    public final LocalizedString pre_rollover_applet_text;
    public final Boolean shouldDisplayBenefitsBooklet;
    public final List upcoming_paychecks;

    public enum AppletState implements WireEnum {
        DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM(0),
        NULL_STATE(1),
        ACTIVE_STATE(2),
        HIDDEN(3);

        public static final UiState$AppletState$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResolverDef Companion;
        public final int value;

        static {
            AppletState appletState = DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM;
            Companion = new LinkResolverDef(27);
            ADAPTER = new UiState$AppletState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AppletState.class), Syntax.PROTO_2, appletState);
        }

        AppletState(int i) {
            this.value = i;
        }

        public static final AppletState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE_CLIENT_COULD_NOT_PARSE_ENUM;
            }
            if (i == 1) {
                return NULL_STATE;
            }
            if (i == 2) {
                return ACTIVE_STATE;
            }
            if (i != 3) {
                return null;
            }
            return HIDDEN;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable activity_subtitle;
        public Serializable applet_accessibility_hint;
        public Serializable applet_accessibility_label;
        public Serializable applet_banking_benefits_setup_cta_text;
        public Serializable applet_brief;
        public Object applet_state;
        public Long applet_text_rollover_date;
        public Serializable applet_title_text;
        public Object benefits_details;
        public Serializable benefits_status_section;
        public Object current_month_paychecks_aggregation;
        public Object customer_acknowledged_risk_alert;
        public Serializable customer_dda_is_locked;
        public Object customer_is_denylisted;
        public Serializable displayed_monthly_aggregation;
        public Serializable kyb_eligibility_warning;
        public String paychecks_applet_client_route;
        public String paychecks_on_money_tab_client_route;
        public Serializable post_rollover_applet_accessibility_value;
        public Serializable post_rollover_applet_text;
        public Serializable pre_rollover_applet_accessibility_value;
        public AndroidMessage pre_rollover_applet_text;
        public Object shouldDisplayBenefitsBooklet;
        public List upcoming_paychecks;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new UiState(this.paychecks_on_money_tab_client_route, (Boolean) this.customer_acknowledged_risk_alert, this.upcoming_paychecks, (CurrentMonthPaychecksAggregation) this.current_month_paychecks_aggregation, (AppletState) this.applet_state, (Boolean) this.customer_dda_is_locked, (Boolean) this.customer_is_denylisted, (CalendarMonthPaychecksAggregation) this.displayed_monthly_aggregation, this.applet_text_rollover_date, (LocalizedString) this.pre_rollover_applet_text, (LocalizedString) this.post_rollover_applet_text, (LocalizedString) this.applet_title_text, (LocalizedString) this.applet_accessibility_label, (LocalizedString) this.pre_rollover_applet_accessibility_value, (LocalizedString) this.post_rollover_applet_accessibility_value, (LocalizedString) this.applet_accessibility_hint, (TreehouseAppletBrief) this.applet_brief, (KybEligibilityWarning) this.kyb_eligibility_warning, (LocalizedString) this.activity_subtitle, (BenefitsStatusSection) this.benefits_status_section, (LocalizedString) this.applet_banking_benefits_setup_cta_text, (Boolean) this.shouldDisplayBenefitsBooklet, this.paychecks_applet_client_route, (BenefitsDetails) this.benefits_details, buildUnknownFields());
                default:
                    String str = this.paychecks_on_money_tab_client_route;
                    if (str != null) {
                        return new BusinessProfile(str, this.paychecks_applet_client_route, (Status) this.customer_acknowledged_risk_alert, (Image) this.customer_dda_is_locked, this.upcoming_paychecks, (String) this.customer_is_denylisted, (List) this.shouldDisplayBenefitsBooklet, (List) this.current_month_paychecks_aggregation, (List) this.applet_state, (String) this.displayed_monthly_aggregation, (BusinessMetadata) this.pre_rollover_applet_text, (TargetApp) this.post_rollover_applet_text, (String) this.applet_title_text, (String) this.applet_accessibility_label, this.applet_text_rollover_date, (Long) this.pre_rollover_applet_accessibility_value, (String) this.post_rollover_applet_accessibility_value, (String) this.applet_accessibility_hint, (String) this.activity_subtitle, (String) this.applet_banking_benefits_setup_cta_text, (String) this.applet_brief, (String) this.kyb_eligibility_warning, (String) this.benefits_status_section, (List) this.benefits_details, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str, "token");
                    throw null;
            }
        }
    }

    public final class CurrentMonthPaychecksAggregation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CurrentMonthPaychecksAggregation> CREATOR;
        public final CalendarMonthPaychecksAggregation calendar_month_aggregation;

        static {
            UiState$CurrentMonthPaychecksAggregation$Companion$ADAPTER$1 uiState$CurrentMonthPaychecksAggregation$Companion$ADAPTER$1 = new UiState$CurrentMonthPaychecksAggregation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CurrentMonthPaychecksAggregation.class), "type.googleapis.com/squareup.cash.paychecks.UiState.CurrentMonthPaychecksAggregation", Syntax.PROTO_2, null, "squareup/cash/paychecks/UiState.proto");
            ADAPTER = uiState$CurrentMonthPaychecksAggregation$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(uiState$CurrentMonthPaychecksAggregation$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrentMonthPaychecksAggregation(CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.calendar_month_aggregation = calendarMonthPaychecksAggregation;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CurrentMonthPaychecksAggregation)) {
                return false;
            }
            CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = (CurrentMonthPaychecksAggregation) obj;
            return Intrinsics.areEqual(unknownFields(), currentMonthPaychecksAggregation.unknownFields()) && Intrinsics.areEqual(this.calendar_month_aggregation, currentMonthPaychecksAggregation.calendar_month_aggregation);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = this.calendar_month_aggregation;
            int hashCode2 = hashCode + (calendarMonthPaychecksAggregation != null ? calendarMonthPaychecksAggregation.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(21);
            builder.tool = this.calendar_month_aggregation;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = this.calendar_month_aggregation;
            if (calendarMonthPaychecksAggregation != null) {
                arrayList.add("calendar_month_aggregation=" + calendarMonthPaychecksAggregation);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CurrentMonthPaychecksAggregation{", "}", 0, null, null, 56);
        }
    }

    static {
        UiState$Companion$ADAPTER$1 uiState$Companion$ADAPTER$1 = new UiState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiState.class), "type.googleapis.com/squareup.cash.paychecks.UiState", Syntax.PROTO_2, null, "squareup/cash/paychecks/UiState.proto");
        ADAPTER = uiState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiState(String str, Boolean bool, List list, CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation, AppletState appletState, Boolean bool2, Boolean bool3, CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation, Long l, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, LocalizedString localizedString6, LocalizedString localizedString7, TreehouseAppletBrief treehouseAppletBrief, KybEligibilityWarning kybEligibilityWarning, LocalizedString localizedString8, BenefitsStatusSection benefitsStatusSection, LocalizedString localizedString9, Boolean bool4, String str2, BenefitsDetails benefitsDetails, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.paychecks_on_money_tab_client_route = str;
        this.customer_acknowledged_risk_alert = bool;
        this.current_month_paychecks_aggregation = currentMonthPaychecksAggregation;
        this.applet_state = appletState;
        this.customer_dda_is_locked = bool2;
        this.customer_is_denylisted = bool3;
        this.displayed_monthly_aggregation = calendarMonthPaychecksAggregation;
        this.applet_text_rollover_date = l;
        this.pre_rollover_applet_text = localizedString;
        this.post_rollover_applet_text = localizedString2;
        this.applet_title_text = localizedString3;
        this.applet_accessibility_label = localizedString4;
        this.pre_rollover_applet_accessibility_value = localizedString5;
        this.post_rollover_applet_accessibility_value = localizedString6;
        this.applet_accessibility_hint = localizedString7;
        this.applet_brief = treehouseAppletBrief;
        this.kyb_eligibility_warning = kybEligibilityWarning;
        this.activity_subtitle = localizedString8;
        this.benefits_status_section = benefitsStatusSection;
        this.applet_banking_benefits_setup_cta_text = localizedString9;
        this.shouldDisplayBenefitsBooklet = bool4;
        this.paychecks_applet_client_route = str2;
        this.benefits_details = benefitsDetails;
        this.upcoming_paychecks = TransactorKt.immutableCopyOf("upcoming_paychecks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiState)) {
            return false;
        }
        UiState uiState = (UiState) obj;
        return Intrinsics.areEqual(unknownFields(), uiState.unknownFields()) && Intrinsics.areEqual(this.paychecks_on_money_tab_client_route, uiState.paychecks_on_money_tab_client_route) && Intrinsics.areEqual(this.customer_acknowledged_risk_alert, uiState.customer_acknowledged_risk_alert) && Intrinsics.areEqual(this.upcoming_paychecks, uiState.upcoming_paychecks) && Intrinsics.areEqual(this.current_month_paychecks_aggregation, uiState.current_month_paychecks_aggregation) && this.applet_state == uiState.applet_state && Intrinsics.areEqual(this.customer_dda_is_locked, uiState.customer_dda_is_locked) && Intrinsics.areEqual(this.customer_is_denylisted, uiState.customer_is_denylisted) && Intrinsics.areEqual(this.displayed_monthly_aggregation, uiState.displayed_monthly_aggregation) && Intrinsics.areEqual(this.applet_text_rollover_date, uiState.applet_text_rollover_date) && Intrinsics.areEqual(this.pre_rollover_applet_text, uiState.pre_rollover_applet_text) && Intrinsics.areEqual(this.post_rollover_applet_text, uiState.post_rollover_applet_text) && Intrinsics.areEqual(this.applet_title_text, uiState.applet_title_text) && Intrinsics.areEqual(this.applet_accessibility_label, uiState.applet_accessibility_label) && Intrinsics.areEqual(this.pre_rollover_applet_accessibility_value, uiState.pre_rollover_applet_accessibility_value) && Intrinsics.areEqual(this.post_rollover_applet_accessibility_value, uiState.post_rollover_applet_accessibility_value) && Intrinsics.areEqual(this.applet_accessibility_hint, uiState.applet_accessibility_hint) && Intrinsics.areEqual(this.applet_brief, uiState.applet_brief) && Intrinsics.areEqual(this.kyb_eligibility_warning, uiState.kyb_eligibility_warning) && Intrinsics.areEqual(this.activity_subtitle, uiState.activity_subtitle) && Intrinsics.areEqual(this.benefits_status_section, uiState.benefits_status_section) && Intrinsics.areEqual(this.applet_banking_benefits_setup_cta_text, uiState.applet_banking_benefits_setup_cta_text) && Intrinsics.areEqual(this.shouldDisplayBenefitsBooklet, uiState.shouldDisplayBenefitsBooklet) && Intrinsics.areEqual(this.paychecks_applet_client_route, uiState.paychecks_applet_client_route) && Intrinsics.areEqual(this.benefits_details, uiState.benefits_details);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.paychecks_on_money_tab_client_route;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.customer_acknowledged_risk_alert;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.upcoming_paychecks);
        CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = this.current_month_paychecks_aggregation;
        int hashCode3 = (m + (currentMonthPaychecksAggregation != null ? currentMonthPaychecksAggregation.hashCode() : 0)) * 37;
        AppletState appletState = this.applet_state;
        int hashCode4 = (hashCode3 + (appletState != null ? appletState.hashCode() : 0)) * 37;
        Boolean bool2 = this.customer_dda_is_locked;
        int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.customer_is_denylisted;
        int hashCode6 = (hashCode5 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = this.displayed_monthly_aggregation;
        int hashCode7 = (hashCode6 + (calendarMonthPaychecksAggregation != null ? calendarMonthPaychecksAggregation.hashCode() : 0)) * 37;
        Long l = this.applet_text_rollover_date;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        LocalizedString localizedString = this.pre_rollover_applet_text;
        int hashCode9 = (hashCode8 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.post_rollover_applet_text;
        int hashCode10 = (hashCode9 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.applet_title_text;
        int hashCode11 = (hashCode10 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.applet_accessibility_label;
        int hashCode12 = (hashCode11 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
        LocalizedString localizedString5 = this.pre_rollover_applet_accessibility_value;
        int hashCode13 = (hashCode12 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37;
        LocalizedString localizedString6 = this.post_rollover_applet_accessibility_value;
        int hashCode14 = (hashCode13 + (localizedString6 != null ? localizedString6.hashCode() : 0)) * 37;
        LocalizedString localizedString7 = this.applet_accessibility_hint;
        int hashCode15 = (hashCode14 + (localizedString7 != null ? localizedString7.hashCode() : 0)) * 37;
        TreehouseAppletBrief treehouseAppletBrief = this.applet_brief;
        int hashCode16 = (hashCode15 + (treehouseAppletBrief != null ? treehouseAppletBrief.hashCode() : 0)) * 37;
        KybEligibilityWarning kybEligibilityWarning = this.kyb_eligibility_warning;
        int hashCode17 = (hashCode16 + (kybEligibilityWarning != null ? kybEligibilityWarning.hashCode() : 0)) * 37;
        LocalizedString localizedString8 = this.activity_subtitle;
        int hashCode18 = (hashCode17 + (localizedString8 != null ? localizedString8.hashCode() : 0)) * 37;
        BenefitsStatusSection benefitsStatusSection = this.benefits_status_section;
        int hashCode19 = (hashCode18 + (benefitsStatusSection != null ? benefitsStatusSection.hashCode() : 0)) * 37;
        LocalizedString localizedString9 = this.applet_banking_benefits_setup_cta_text;
        int hashCode20 = (hashCode19 + (localizedString9 != null ? localizedString9.hashCode() : 0)) * 37;
        Boolean bool4 = this.shouldDisplayBenefitsBooklet;
        int hashCode21 = (hashCode20 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str2 = this.paychecks_applet_client_route;
        int hashCode22 = (hashCode21 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BenefitsDetails benefitsDetails = this.benefits_details;
        int hashCode23 = hashCode22 + (benefitsDetails != null ? benefitsDetails.hashCode() : 0);
        this.hashCode = hashCode23;
        return hashCode23;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.paychecks_on_money_tab_client_route = this.paychecks_on_money_tab_client_route;
        builder.customer_acknowledged_risk_alert = this.customer_acknowledged_risk_alert;
        builder.upcoming_paychecks = this.upcoming_paychecks;
        builder.current_month_paychecks_aggregation = this.current_month_paychecks_aggregation;
        builder.applet_state = this.applet_state;
        builder.customer_dda_is_locked = this.customer_dda_is_locked;
        builder.customer_is_denylisted = this.customer_is_denylisted;
        builder.displayed_monthly_aggregation = this.displayed_monthly_aggregation;
        builder.applet_text_rollover_date = this.applet_text_rollover_date;
        builder.pre_rollover_applet_text = this.pre_rollover_applet_text;
        builder.post_rollover_applet_text = this.post_rollover_applet_text;
        builder.applet_title_text = this.applet_title_text;
        builder.applet_accessibility_label = this.applet_accessibility_label;
        builder.pre_rollover_applet_accessibility_value = this.pre_rollover_applet_accessibility_value;
        builder.post_rollover_applet_accessibility_value = this.post_rollover_applet_accessibility_value;
        builder.applet_accessibility_hint = this.applet_accessibility_hint;
        builder.applet_brief = this.applet_brief;
        builder.kyb_eligibility_warning = this.kyb_eligibility_warning;
        builder.activity_subtitle = this.activity_subtitle;
        builder.benefits_status_section = this.benefits_status_section;
        builder.applet_banking_benefits_setup_cta_text = this.applet_banking_benefits_setup_cta_text;
        builder.shouldDisplayBenefitsBooklet = this.shouldDisplayBenefitsBooklet;
        builder.paychecks_applet_client_route = this.paychecks_applet_client_route;
        builder.benefits_details = this.benefits_details;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.paychecks_on_money_tab_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "paychecks_on_money_tab_client_route=", arrayList);
        }
        Boolean bool = this.customer_acknowledged_risk_alert;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_acknowledged_risk_alert=", bool, arrayList);
        }
        List list = this.upcoming_paychecks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("upcoming_paychecks=", arrayList, list);
        }
        CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = this.current_month_paychecks_aggregation;
        if (currentMonthPaychecksAggregation != null) {
            arrayList.add("current_month_paychecks_aggregation=" + currentMonthPaychecksAggregation);
        }
        AppletState appletState = this.applet_state;
        if (appletState != null) {
            arrayList.add("applet_state=" + appletState);
        }
        Boolean bool2 = this.customer_dda_is_locked;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_dda_is_locked=", bool2, arrayList);
        }
        Boolean bool3 = this.customer_is_denylisted;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_is_denylisted=", bool3, arrayList);
        }
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = this.displayed_monthly_aggregation;
        if (calendarMonthPaychecksAggregation != null) {
            arrayList.add("displayed_monthly_aggregation=" + calendarMonthPaychecksAggregation);
        }
        Long l = this.applet_text_rollover_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("applet_text_rollover_date=", l, arrayList);
        }
        LocalizedString localizedString = this.pre_rollover_applet_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("pre_rollover_applet_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.post_rollover_applet_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("post_rollover_applet_text=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.applet_title_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("applet_title_text=", localizedString3, arrayList);
        }
        LocalizedString localizedString4 = this.applet_accessibility_label;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("applet_accessibility_label=", localizedString4, arrayList);
        }
        LocalizedString localizedString5 = this.pre_rollover_applet_accessibility_value;
        if (localizedString5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("pre_rollover_applet_accessibility_value=", localizedString5, arrayList);
        }
        LocalizedString localizedString6 = this.post_rollover_applet_accessibility_value;
        if (localizedString6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("post_rollover_applet_accessibility_value=", localizedString6, arrayList);
        }
        LocalizedString localizedString7 = this.applet_accessibility_hint;
        if (localizedString7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("applet_accessibility_hint=", localizedString7, arrayList);
        }
        TreehouseAppletBrief treehouseAppletBrief = this.applet_brief;
        if (treehouseAppletBrief != null) {
            arrayList.add("applet_brief=" + treehouseAppletBrief);
        }
        KybEligibilityWarning kybEligibilityWarning = this.kyb_eligibility_warning;
        if (kybEligibilityWarning != null) {
            arrayList.add("kyb_eligibility_warning=" + kybEligibilityWarning);
        }
        LocalizedString localizedString8 = this.activity_subtitle;
        if (localizedString8 != null) {
            Matcher$$ExternalSyntheticOutline0.m("activity_subtitle=", localizedString8, arrayList);
        }
        BenefitsStatusSection benefitsStatusSection = this.benefits_status_section;
        if (benefitsStatusSection != null) {
            arrayList.add("benefits_status_section=" + benefitsStatusSection);
        }
        LocalizedString localizedString9 = this.applet_banking_benefits_setup_cta_text;
        if (localizedString9 != null) {
            Matcher$$ExternalSyntheticOutline0.m("applet_banking_benefits_setup_cta_text=", localizedString9, arrayList);
        }
        Boolean bool4 = this.shouldDisplayBenefitsBooklet;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("shouldDisplayBenefitsBooklet=", bool4, arrayList);
        }
        String str2 = this.paychecks_applet_client_route;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "paychecks_applet_client_route=", arrayList);
        }
        BenefitsDetails benefitsDetails = this.benefits_details;
        if (benefitsDetails != null) {
            arrayList.add("benefits_details=" + benefitsDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiState{", "}", 0, null, null, 56);
    }
}
