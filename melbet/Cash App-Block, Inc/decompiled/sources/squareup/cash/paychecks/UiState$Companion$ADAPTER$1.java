package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.UiState;

/* loaded from: classes10.dex */
public final class UiState$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList;
        ?? decode;
        Object obj4;
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Boolean bool = null;
        UiState.AppletState appletState = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Long l = null;
        Boolean bool4 = null;
        String str2 = null;
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation2 = null;
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = null;
        ArrayList arrayList2 = m;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiState(str, bool, arrayList2, currentMonthPaychecksAggregation2, appletState, bool2, bool3, calendarMonthPaychecksAggregation, l, (LocalizedString) obj12, (LocalizedString) obj13, (LocalizedString) obj14, (LocalizedString) obj5, (LocalizedString) obj6, (LocalizedString) obj8, (LocalizedString) obj9, (TreehouseAppletBrief) obj10, (KybEligibilityWarning) obj11, (LocalizedString) obj16, (BenefitsStatusSection) obj17, (LocalizedString) obj15, bool4, str2, (BenefitsDetails) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    obj5 = obj5;
                    break;
                case 2:
                    obj4 = obj5;
                    obj2 = obj15;
                    arrayList = arrayList2;
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    obj5 = obj4;
                    decode = str;
                    break;
                case 3:
                case 4:
                case 21:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj5;
                    obj2 = obj15;
                    obj3 = obj16;
                    arrayList = arrayList2;
                    currentMonthPaychecksAggregation = currentMonthPaychecksAggregation2;
                    decode = str;
                    currentMonthPaychecksAggregation2 = currentMonthPaychecksAggregation;
                    obj5 = obj;
                    obj16 = obj3;
                    break;
                case 5:
                    obj = obj5;
                    obj2 = obj15;
                    obj3 = obj16;
                    currentMonthPaychecksAggregation = currentMonthPaychecksAggregation2;
                    arrayList = arrayList2;
                    arrayList.add(Paycheck.ADAPTER.decode(protoReader));
                    decode = str;
                    currentMonthPaychecksAggregation2 = currentMonthPaychecksAggregation;
                    obj5 = obj;
                    obj16 = obj3;
                    break;
                case 6:
                    obj4 = obj5;
                    obj2 = obj15;
                    currentMonthPaychecksAggregation2 = TransactorKt.decodeMessageOrMerge(UiState.CurrentMonthPaychecksAggregation.ADAPTER, protoReader, currentMonthPaychecksAggregation2);
                    arrayList = arrayList2;
                    obj5 = obj4;
                    decode = str;
                    break;
                case 7:
                    try {
                        appletState = UiState.AppletState.ADAPTER.decode(protoReader);
                        obj2 = obj15;
                        arrayList = arrayList2;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj5;
                        obj2 = obj15;
                        obj3 = obj16;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 9:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 10:
                    calendarMonthPaychecksAggregation = TransactorKt.decodeMessageOrMerge(CalendarMonthPaychecksAggregation.ADAPTER, protoReader, calendarMonthPaychecksAggregation);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 11:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 12:
                    obj12 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj12);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 13:
                    obj13 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj13);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 14:
                    obj14 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj14);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 15:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 16:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 17:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj8);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 18:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 19:
                    obj10 = TransactorKt.decodeMessageOrMerge(TreehouseAppletBrief.ADAPTER, protoReader, obj10);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 20:
                    obj11 = TransactorKt.decodeMessageOrMerge(KybEligibilityWarning.ADAPTER, protoReader, obj11);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 22:
                    obj16 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj16);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 23:
                    obj17 = TransactorKt.decodeMessageOrMerge(BenefitsStatusSection.ADAPTER, protoReader, obj17);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 24:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj15);
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 25:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 26:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
                case 27:
                    obj7 = TransactorKt.decodeMessageOrMerge(BenefitsDetails.ADAPTER, protoReader, obj7);
                    obj2 = obj15;
                    arrayList = arrayList2;
                    decode = str;
                    break;
            }
            str = decode;
            arrayList2 = arrayList;
            obj15 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiState uiState = (UiState) obj;
        reverseProtoWriter.getClass();
        uiState.getClass();
        reverseProtoWriter.writeBytes(uiState.unknownFields());
        BenefitsDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 27, uiState.benefits_details);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, uiState.paychecks_applet_client_route);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 25, uiState.shouldDisplayBenefitsBooklet);
        ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 24, uiState.applet_banking_benefits_setup_cta_text);
        BenefitsStatusSection.ADAPTER.encodeWithTag(reverseProtoWriter, 23, uiState.benefits_status_section);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 22, uiState.activity_subtitle);
        KybEligibilityWarning.ADAPTER.encodeWithTag(reverseProtoWriter, 20, uiState.kyb_eligibility_warning);
        TreehouseAppletBrief.ADAPTER.encodeWithTag(reverseProtoWriter, 19, uiState.applet_brief);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 18, uiState.applet_accessibility_hint);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 17, uiState.post_rollover_applet_accessibility_value);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 16, uiState.pre_rollover_applet_accessibility_value);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 15, uiState.applet_accessibility_label);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 14, uiState.applet_title_text);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 13, uiState.post_rollover_applet_text);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 12, uiState.pre_rollover_applet_text);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 11, uiState.applet_text_rollover_date);
        CalendarMonthPaychecksAggregation.ADAPTER.encodeWithTag(reverseProtoWriter, 10, uiState.displayed_monthly_aggregation);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, uiState.customer_is_denylisted);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, uiState.customer_dda_is_locked);
        UiState.AppletState.ADAPTER.encodeWithTag(reverseProtoWriter, 7, uiState.applet_state);
        UiState.CurrentMonthPaychecksAggregation.ADAPTER.encodeWithTag(reverseProtoWriter, 6, uiState.current_month_paychecks_aggregation);
        Paycheck.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, uiState.upcoming_paychecks);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, uiState.customer_acknowledged_risk_alert);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiState.paychecks_on_money_tab_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiState uiState = (UiState) obj;
        uiState.getClass();
        int size$okio = uiState.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, uiState.paychecks_on_money_tab_client_route) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = ProtoAdapter.INT64.encodedSizeWithTag(11, uiState.applet_text_rollover_date) + CalendarMonthPaychecksAggregation.ADAPTER.encodedSizeWithTag(10, uiState.displayed_monthly_aggregation) + protoAdapter2.encodedSizeWithTag(9, uiState.customer_is_denylisted) + protoAdapter2.encodedSizeWithTag(8, uiState.customer_dda_is_locked) + UiState.AppletState.ADAPTER.encodedSizeWithTag(7, uiState.applet_state) + UiState.CurrentMonthPaychecksAggregation.ADAPTER.encodedSizeWithTag(6, uiState.current_month_paychecks_aggregation) + Paycheck.ADAPTER.asRepeated().encodedSizeWithTag(5, uiState.upcoming_paychecks) + protoAdapter2.encodedSizeWithTag(2, uiState.customer_acknowledged_risk_alert) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
        return BenefitsDetails.ADAPTER.encodedSizeWithTag(27, uiState.benefits_details) + protoAdapter.encodedSizeWithTag(26, uiState.paychecks_applet_client_route) + protoAdapter2.encodedSizeWithTag(25, uiState.shouldDisplayBenefitsBooklet) + protoAdapter3.encodedSizeWithTag(24, uiState.applet_banking_benefits_setup_cta_text) + BenefitsStatusSection.ADAPTER.encodedSizeWithTag(23, uiState.benefits_status_section) + protoAdapter3.encodedSizeWithTag(22, uiState.activity_subtitle) + KybEligibilityWarning.ADAPTER.encodedSizeWithTag(20, uiState.kyb_eligibility_warning) + TreehouseAppletBrief.ADAPTER.encodedSizeWithTag(19, uiState.applet_brief) + protoAdapter3.encodedSizeWithTag(18, uiState.applet_accessibility_hint) + protoAdapter3.encodedSizeWithTag(17, uiState.post_rollover_applet_accessibility_value) + protoAdapter3.encodedSizeWithTag(16, uiState.pre_rollover_applet_accessibility_value) + protoAdapter3.encodedSizeWithTag(15, uiState.applet_accessibility_label) + protoAdapter3.encodedSizeWithTag(14, uiState.applet_title_text) + protoAdapter3.encodedSizeWithTag(13, uiState.post_rollover_applet_text) + protoAdapter3.encodedSizeWithTag(12, uiState.pre_rollover_applet_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiState uiState = (UiState) obj;
        uiState.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(uiState.upcoming_paychecks, Paycheck.ADAPTER);
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = uiState.current_month_paychecks_aggregation;
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation2 = currentMonthPaychecksAggregation != null ? (UiState.CurrentMonthPaychecksAggregation) UiState.CurrentMonthPaychecksAggregation.ADAPTER.redact(currentMonthPaychecksAggregation) : null;
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = uiState.displayed_monthly_aggregation;
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation2 = calendarMonthPaychecksAggregation != null ? (CalendarMonthPaychecksAggregation) CalendarMonthPaychecksAggregation.ADAPTER.redact(calendarMonthPaychecksAggregation) : null;
        LocalizedString localizedString = uiState.pre_rollover_applet_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = uiState.post_rollover_applet_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = uiState.applet_title_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = uiState.applet_accessibility_label;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LocalizedString localizedString9 = uiState.pre_rollover_applet_accessibility_value;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        LocalizedString localizedString11 = uiState.post_rollover_applet_accessibility_value;
        LocalizedString localizedString12 = localizedString11 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString11) : null;
        LocalizedString localizedString13 = uiState.applet_accessibility_hint;
        LocalizedString localizedString14 = localizedString13 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString13) : null;
        TreehouseAppletBrief treehouseAppletBrief = uiState.applet_brief;
        TreehouseAppletBrief treehouseAppletBrief2 = treehouseAppletBrief != null ? (TreehouseAppletBrief) TreehouseAppletBrief.ADAPTER.redact(treehouseAppletBrief) : null;
        KybEligibilityWarning kybEligibilityWarning = uiState.kyb_eligibility_warning;
        KybEligibilityWarning kybEligibilityWarning2 = kybEligibilityWarning != null ? (KybEligibilityWarning) KybEligibilityWarning.ADAPTER.redact(kybEligibilityWarning) : null;
        LocalizedString localizedString15 = uiState.activity_subtitle;
        LocalizedString localizedString16 = localizedString15 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString15) : null;
        BenefitsStatusSection benefitsStatusSection = uiState.benefits_status_section;
        BenefitsStatusSection benefitsStatusSection2 = benefitsStatusSection != null ? (BenefitsStatusSection) BenefitsStatusSection.ADAPTER.redact(benefitsStatusSection) : null;
        LocalizedString localizedString17 = uiState.applet_banking_benefits_setup_cta_text;
        LocalizedString localizedString18 = localizedString17 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString17) : null;
        BenefitsDetails benefitsDetails = uiState.benefits_details;
        BenefitsDetails benefitsDetails2 = benefitsDetails != null ? (BenefitsDetails) BenefitsDetails.ADAPTER.redact(benefitsDetails) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = uiState.paychecks_on_money_tab_client_route;
        Boolean bool = uiState.customer_acknowledged_risk_alert;
        UiState.AppletState appletState = uiState.applet_state;
        Boolean bool2 = uiState.customer_dda_is_locked;
        Boolean bool3 = uiState.customer_is_denylisted;
        Long l = uiState.applet_text_rollover_date;
        Boolean bool4 = uiState.shouldDisplayBenefitsBooklet;
        String str2 = uiState.paychecks_applet_client_route;
        byteString.getClass();
        return new UiState(str, bool, m1169redactElements, currentMonthPaychecksAggregation2, appletState, bool2, bool3, calendarMonthPaychecksAggregation2, l, localizedString2, localizedString4, localizedString6, localizedString8, localizedString10, localizedString12, localizedString14, treehouseAppletBrief2, kybEligibilityWarning2, localizedString16, benefitsStatusSection2, localizedString18, bool4, str2, benefitsDetails2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiState uiState = (UiState) obj;
        uiState.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiState.paychecks_on_money_tab_client_route);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 2, uiState.customer_acknowledged_risk_alert);
        Paycheck.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, uiState.upcoming_paychecks);
        UiState.CurrentMonthPaychecksAggregation.ADAPTER.encodeWithTag(protoWriter, 6, uiState.current_month_paychecks_aggregation);
        UiState.AppletState.ADAPTER.encodeWithTag(protoWriter, 7, uiState.applet_state);
        protoAdapter2.encodeWithTag(protoWriter, 8, uiState.customer_dda_is_locked);
        protoAdapter2.encodeWithTag(protoWriter, 9, uiState.customer_is_denylisted);
        CalendarMonthPaychecksAggregation.ADAPTER.encodeWithTag(protoWriter, 10, uiState.displayed_monthly_aggregation);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, uiState.applet_text_rollover_date);
        ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 12, uiState.pre_rollover_applet_text);
        protoAdapter3.encodeWithTag(protoWriter, 13, uiState.post_rollover_applet_text);
        protoAdapter3.encodeWithTag(protoWriter, 14, uiState.applet_title_text);
        protoAdapter3.encodeWithTag(protoWriter, 15, uiState.applet_accessibility_label);
        protoAdapter3.encodeWithTag(protoWriter, 16, uiState.pre_rollover_applet_accessibility_value);
        protoAdapter3.encodeWithTag(protoWriter, 17, uiState.post_rollover_applet_accessibility_value);
        protoAdapter3.encodeWithTag(protoWriter, 18, uiState.applet_accessibility_hint);
        TreehouseAppletBrief.ADAPTER.encodeWithTag(protoWriter, 19, uiState.applet_brief);
        KybEligibilityWarning.ADAPTER.encodeWithTag(protoWriter, 20, uiState.kyb_eligibility_warning);
        protoAdapter3.encodeWithTag(protoWriter, 22, uiState.activity_subtitle);
        BenefitsStatusSection.ADAPTER.encodeWithTag(protoWriter, 23, uiState.benefits_status_section);
        protoAdapter3.encodeWithTag(protoWriter, 24, uiState.applet_banking_benefits_setup_cta_text);
        protoAdapter2.encodeWithTag(protoWriter, 25, uiState.shouldDisplayBenefitsBooklet);
        protoAdapter.encodeWithTag(protoWriter, 26, uiState.paychecks_applet_client_route);
        BenefitsDetails.ADAPTER.encodeWithTag(protoWriter, 27, uiState.benefits_details);
        protoWriter.writeBytes(uiState.unknownFields());
    }
}
