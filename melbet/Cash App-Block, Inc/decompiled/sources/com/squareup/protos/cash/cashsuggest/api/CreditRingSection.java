package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.ui.Icon;
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

/* loaded from: classes7.dex */
public final class CreditRingSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditRingSection> CREATOR;
    public final AnalyticsEvent analytic_tap_event;
    public final Icon arcade_icon;
    public final CreditDetailSheet credit_detail;
    public final Boolean is_disabled;
    public final LocalizedString text;

    static {
        CreditRingSection$Companion$ADAPTER$1 creditRingSection$Companion$ADAPTER$1 = new CreditRingSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditRingSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.CreditRingSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = creditRingSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(creditRingSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditRingSection(LocalizedString localizedString, Icon icon, CreditDetailSheet creditDetailSheet, Boolean bool, AnalyticsEvent analyticsEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = localizedString;
        this.arcade_icon = icon;
        this.credit_detail = creditDetailSheet;
        this.is_disabled = bool;
        this.analytic_tap_event = analyticsEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditRingSection)) {
            return false;
        }
        CreditRingSection creditRingSection = (CreditRingSection) obj;
        return Intrinsics.areEqual(unknownFields(), creditRingSection.unknownFields()) && Intrinsics.areEqual(this.text, creditRingSection.text) && Intrinsics.areEqual(this.arcade_icon, creditRingSection.arcade_icon) && Intrinsics.areEqual(this.credit_detail, creditRingSection.credit_detail) && Intrinsics.areEqual(this.is_disabled, creditRingSection.is_disabled) && Intrinsics.areEqual(this.analytic_tap_event, creditRingSection.analytic_tap_event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.text;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Icon icon = this.arcade_icon;
        int hashCode3 = (hashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        CreditDetailSheet creditDetailSheet = this.credit_detail;
        int hashCode4 = (hashCode3 + (creditDetailSheet != null ? creditDetailSheet.hashCode() : 0)) * 37;
        Boolean bool = this.is_disabled;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_tap_event;
        int hashCode6 = hashCode5 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(21, false);
        builder.customer_token = this.text;
        builder.account_token = this.arcade_icon;
        builder.display_name = this.credit_detail;
        builder.is_sponsored_account = this.is_disabled;
        builder.account_type = this.analytic_tap_event;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
        }
        Icon icon = this.arcade_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon, arrayList);
        }
        CreditDetailSheet creditDetailSheet = this.credit_detail;
        if (creditDetailSheet != null) {
            arrayList.add("credit_detail=" + creditDetailSheet);
        }
        Boolean bool = this.is_disabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_disabled=", bool, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytic_tap_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_tap_event=", analyticsEvent, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditRingSection{", "}", 0, null, null, 56);
    }
}
