package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.redwood.yoga.internal.YGNode;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.PageHeader;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
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
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes7.dex */
public final class RetroOrderSelectionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RetroOrderSelectionResponse> CREATOR;
    public final AnalyticsEvent analytic_view_event;
    public final LocalizedString bottom_text;
    public final Long expire_at_ms;
    public final YGNode.Companion screen_content;
    public final PageHeader screen_header;
    public final TappableIcon screen_tappable_info;

    public final class EligibleRetroOrdersSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EligibleRetroOrdersSection> CREATOR;
        public final List activity_rows;
        public final List order_rows;

        static {
            RetroOrderSelectionResponse$EligibleRetroOrdersSection$Companion$ADAPTER$1 retroOrderSelectionResponse$EligibleRetroOrdersSection$Companion$ADAPTER$1 = new RetroOrderSelectionResponse$EligibleRetroOrdersSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibleRetroOrdersSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.RetroOrderSelectionResponse.EligibleRetroOrdersSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/RetroOrderSelection.proto");
            ADAPTER = retroOrderSelectionResponse$EligibleRetroOrdersSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(retroOrderSelectionResponse$EligibleRetroOrdersSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibleRetroOrdersSection(List list, List list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.activity_rows = TransactorKt.immutableCopyOf("activity_rows", list);
            this.order_rows = TransactorKt.immutableCopyOf("order_rows", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EligibleRetroOrdersSection)) {
                return false;
            }
            EligibleRetroOrdersSection eligibleRetroOrdersSection = (EligibleRetroOrdersSection) obj;
            return Intrinsics.areEqual(unknownFields(), eligibleRetroOrdersSection.unknownFields()) && Intrinsics.areEqual(this.activity_rows, eligibleRetroOrdersSection.activity_rows) && Intrinsics.areEqual(this.order_rows, eligibleRetroOrdersSection.order_rows);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.order_rows.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.activity_rows);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(8, false);
            builder.card_holder_benefits = this.activity_rows;
            builder.green_status_benefits = this.order_rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.activity_rows;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("activity_rows=", arrayList, list);
            }
            List list2 = this.order_rows;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("order_rows=", arrayList, list2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EligibleRetroOrdersSection{", "}", 0, null, null, 56);
        }
    }

    public final class TextLineItemSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextLineItemSection> CREATOR;
        public final DisplayStyle display_style;
        public final List line_items;

        public enum DisplayStyle implements WireEnum {
            ORDERED(0),
            UNORDERED(1);

            public static final RetroOrderSelectionResponse$TextLineItemSection$DisplayStyle$Companion$ADAPTER$1 ADAPTER;
            public static final RadioType.Companion Companion;
            public final int value;

            static {
                DisplayStyle displayStyle = ORDERED;
                Companion = new RadioType.Companion();
                ADAPTER = new RetroOrderSelectionResponse$TextLineItemSection$DisplayStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayStyle.class), Syntax.PROTO_2, displayStyle);
            }

            DisplayStyle(int i) {
                this.value = i;
            }

            public static final DisplayStyle fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return ORDERED;
                }
                if (i != 1) {
                    return null;
                }
                return UNORDERED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            RetroOrderSelectionResponse$TextLineItemSection$Companion$ADAPTER$1 retroOrderSelectionResponse$TextLineItemSection$Companion$ADAPTER$1 = new RetroOrderSelectionResponse$TextLineItemSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextLineItemSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.RetroOrderSelectionResponse.TextLineItemSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/RetroOrderSelection.proto");
            ADAPTER = retroOrderSelectionResponse$TextLineItemSection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(retroOrderSelectionResponse$TextLineItemSection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextLineItemSection(List list, DisplayStyle displayStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.display_style = displayStyle;
            this.line_items = TransactorKt.immutableCopyOf("line_items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextLineItemSection)) {
                return false;
            }
            TextLineItemSection textLineItemSection = (TextLineItemSection) obj;
            return Intrinsics.areEqual(unknownFields(), textLineItemSection.unknownFields()) && Intrinsics.areEqual(this.line_items, textLineItemSection.line_items) && this.display_style == textLineItemSection.display_style;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.line_items);
            DisplayStyle displayStyle = this.display_style;
            int hashCode = m + (displayStyle != null ? displayStyle.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(25);
            builder.image_url = this.line_items;
            builder.asset = this.display_style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.line_items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("line_items=", arrayList, list);
            }
            DisplayStyle displayStyle = this.display_style;
            if (displayStyle != null) {
                arrayList.add("display_style=" + displayStyle);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextLineItemSection{", "}", 0, null, null, 56);
        }
    }

    static {
        RetroOrderSelectionResponse$Companion$ADAPTER$1 retroOrderSelectionResponse$Companion$ADAPTER$1 = new RetroOrderSelectionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetroOrderSelectionResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.RetroOrderSelectionResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/RetroOrderSelection.proto");
        ADAPTER = retroOrderSelectionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(retroOrderSelectionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetroOrderSelectionResponse(PageHeader pageHeader, YGNode.Companion companion, LocalizedString localizedString, Long l, AnalyticsEvent analyticsEvent, TappableIcon tappableIcon, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.screen_header = pageHeader;
        this.screen_content = companion;
        this.bottom_text = localizedString;
        this.expire_at_ms = l;
        this.analytic_view_event = analyticsEvent;
        this.screen_tappable_info = tappableIcon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetroOrderSelectionResponse)) {
            return false;
        }
        RetroOrderSelectionResponse retroOrderSelectionResponse = (RetroOrderSelectionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), retroOrderSelectionResponse.unknownFields()) && Intrinsics.areEqual(this.screen_header, retroOrderSelectionResponse.screen_header) && Intrinsics.areEqual(this.screen_content, retroOrderSelectionResponse.screen_content) && Intrinsics.areEqual(this.bottom_text, retroOrderSelectionResponse.bottom_text) && Intrinsics.areEqual(this.expire_at_ms, retroOrderSelectionResponse.expire_at_ms) && Intrinsics.areEqual(this.analytic_view_event, retroOrderSelectionResponse.analytic_view_event) && Intrinsics.areEqual(this.screen_tappable_info, retroOrderSelectionResponse.screen_tappable_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PageHeader pageHeader = this.screen_header;
        int hashCode2 = (hashCode + (pageHeader != null ? pageHeader.hashCode() : 0)) * 37;
        YGNode.Companion companion = this.screen_content;
        int hashCode3 = (hashCode2 + (companion != null ? companion.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.bottom_text;
        int hashCode4 = (hashCode3 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Long l = this.expire_at_ms;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode6 = (hashCode5 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        TappableIcon tappableIcon = this.screen_tappable_info;
        int hashCode7 = hashCode6 + (tappableIcon != null ? tappableIcon.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(28, false);
        builder.category = this.screen_header;
        builder.code = this.screen_content;
        builder.description = this.bottom_text;
        builder.field = this.expire_at_ms;
        builder.retryable = this.analytic_view_event;
        builder.metadata = this.screen_tappable_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PageHeader pageHeader = this.screen_header;
        if (pageHeader != null) {
            arrayList.add("screen_header=" + pageHeader);
        }
        YGNode.Companion companion = this.screen_content;
        if (companion != null) {
            arrayList.add("screen_content=" + companion);
        }
        LocalizedString localizedString = this.bottom_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("bottom_text=", localizedString, arrayList);
        }
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        TappableIcon tappableIcon = this.screen_tappable_info;
        if (tappableIcon != null) {
            arrayList.add("screen_tappable_info=" + tappableIcon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetroOrderSelectionResponse{", "}", 0, null, null, 56);
    }
}
