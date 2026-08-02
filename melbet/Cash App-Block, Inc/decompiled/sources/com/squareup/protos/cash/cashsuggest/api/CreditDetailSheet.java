package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.ui.Icon;
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
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditDetailSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreditDetailSheet> CREATOR;
    public final AnalyticsEvent analytic_dismiss_event;
    public final AnalyticsEvent analytic_view_event;
    public final Button cta_button;
    public final List detail_rows;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    public final class DetailRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailRow> CREATOR;
        public final Icon accessory_icon;
        public final DisplayStyle display_style;
        public final CreditLineType line_type;
        public final Boolean show_footer_divider;
        public final LocalizedString subtitle;
        public final com.squareup.protos.cash.shop.rendering.api.TapAction tap_action;
        public final LocalizedString title;

        public enum DisplayStyle implements WireEnum {
            UNSPECIFIED(0),
            DISPLAY_CREDIT(1),
            HIDE_CREDIT(2);

            public static final CreditDetailSheet$DetailRow$DisplayStyle$Companion$ADAPTER$1 ADAPTER;
            public static final Action.Type.Companion Companion;
            public final int value;

            static {
                DisplayStyle displayStyle = UNSPECIFIED;
                Companion = new Action.Type.Companion();
                ADAPTER = new CreditDetailSheet$DetailRow$DisplayStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayStyle.class), Syntax.PROTO_2, displayStyle);
            }

            DisplayStyle(int i) {
                this.value = i;
            }

            public static final DisplayStyle fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return DISPLAY_CREDIT;
                }
                if (i != 2) {
                    return null;
                }
                return HIDE_CREDIT;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CreditDetailSheet$DetailRow$Companion$ADAPTER$1 creditDetailSheet$DetailRow$Companion$ADAPTER$1 = new CreditDetailSheet$DetailRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailRow.class), "type.googleapis.com/squareup.cash.cashsuggest.api.CreditDetailSheet.DetailRow", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
            ADAPTER = creditDetailSheet$DetailRow$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(creditDetailSheet$DetailRow$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailRow(CreditLineType creditLineType, DisplayStyle displayStyle, LocalizedString localizedString, LocalizedString localizedString2, Icon icon, com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.line_type = creditLineType;
            this.display_style = displayStyle;
            this.title = localizedString;
            this.subtitle = localizedString2;
            this.accessory_icon = icon;
            this.tap_action = tapAction;
            this.show_footer_divider = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) obj;
            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && this.line_type == detailRow.line_type && this.display_style == detailRow.display_style && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.subtitle, detailRow.subtitle) && Intrinsics.areEqual(this.accessory_icon, detailRow.accessory_icon) && Intrinsics.areEqual(this.tap_action, detailRow.tap_action) && Intrinsics.areEqual(this.show_footer_divider, detailRow.show_footer_divider);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CreditLineType creditLineType = this.line_type;
            int hashCode2 = (hashCode + (creditLineType != null ? creditLineType.hashCode() : 0)) * 37;
            DisplayStyle displayStyle = this.display_style;
            int hashCode3 = (hashCode2 + (displayStyle != null ? displayStyle.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode5 = (hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            Icon icon = this.accessory_icon;
            int hashCode6 = (hashCode5 + (icon != null ? icon.hashCode() : 0)) * 37;
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            int hashCode7 = (hashCode6 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            Boolean bool = this.show_footer_divider;
            int hashCode8 = hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ContactAlias.Builder builder = new ContactAlias.Builder(11, false);
            builder.customer_token = this.line_type;
            builder.alias_value = this.display_style;
            builder.hashed_alias_token = this.title;
            builder.alias_type = this.subtitle;
            builder.updated_at = this.accessory_icon;
            builder.linked_at = this.tap_action;
            builder.version = this.show_footer_divider;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CreditLineType creditLineType = this.line_type;
            if (creditLineType != null) {
                arrayList.add("line_type=" + creditLineType);
            }
            DisplayStyle displayStyle = this.display_style;
            if (displayStyle != null) {
                arrayList.add("display_style=" + displayStyle);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            Icon icon = this.accessory_icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessory_icon=", icon, arrayList);
            }
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            Boolean bool = this.show_footer_divider;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("show_footer_divider=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
        }
    }

    static {
        CreditDetailSheet$Companion$ADAPTER$1 creditDetailSheet$Companion$ADAPTER$1 = new CreditDetailSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreditDetailSheet.class), "type.googleapis.com/squareup.cash.cashsuggest.api.CreditDetailSheet", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = creditDetailSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(creditDetailSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDetailSheet(LocalizedString localizedString, LocalizedString localizedString2, List list, Button button, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.cta_button = button;
        this.analytic_view_event = analyticsEvent;
        this.analytic_dismiss_event = analyticsEvent2;
        this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditDetailSheet)) {
            return false;
        }
        CreditDetailSheet creditDetailSheet = (CreditDetailSheet) obj;
        return Intrinsics.areEqual(unknownFields(), creditDetailSheet.unknownFields()) && Intrinsics.areEqual(this.title, creditDetailSheet.title) && Intrinsics.areEqual(this.subtitle, creditDetailSheet.subtitle) && Intrinsics.areEqual(this.detail_rows, creditDetailSheet.detail_rows) && Intrinsics.areEqual(this.cta_button, creditDetailSheet.cta_button) && Intrinsics.areEqual(this.analytic_view_event, creditDetailSheet.analytic_view_event) && Intrinsics.areEqual(this.analytic_dismiss_event, creditDetailSheet.analytic_dismiss_event);
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
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.detail_rows);
        Button button = this.cta_button;
        int hashCode3 = (m + (button != null ? button.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode4 = (hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        int hashCode5 = hashCode4 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(25, false);
        builder.category = this.title;
        builder.code = this.subtitle;
        builder.description = this.detail_rows;
        builder.field = this.cta_button;
        builder.retryable = this.analytic_view_event;
        builder.metadata = this.analytic_dismiss_event;
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
        List list = this.detail_rows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, list);
        }
        Button button = this.cta_button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cta_button=", button, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        AnalyticsEvent analyticsEvent2 = this.analytic_dismiss_event;
        if (analyticsEvent2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_dismiss_event=", analyticsEvent2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreditDetailSheet{", "}", 0, null, null, 56);
    }
}
