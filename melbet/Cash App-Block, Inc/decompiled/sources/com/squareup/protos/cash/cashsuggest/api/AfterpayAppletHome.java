package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.local.views.internal.menus.LocalMenuCardKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.composer.app.Card;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.employeejobs.Job;
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

/* loaded from: classes7.dex */
public final class AfterpayAppletHome extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletHome> CREATOR;
    public final AfterpayAppletActivityHistoryResponse activity_history_preload;
    public final AfterpayAppletActivityResponse activity_preload;
    public final AnalyticsEvent analytic_view_event;
    public final Experiments experiments;
    public final Footer footer;
    public final TappableIcon header_tappable_info;
    public final OnDisplayMessage on_display_message;
    public final AfterpayAppletPurchaseHistoryResponse purchase_history_preload;
    public final RetroOrderSelectionResponse retro_selection_preload;
    public final List sections;
    public final LocalizedString title;

    public final class OnDisplayMessage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OnDisplayMessage> CREATOR;
        public final String message_id;
        public final LocalMenuCardKt treatment;

        static {
            AfterpayAppletHome$OnDisplayMessage$Companion$ADAPTER$1 afterpayAppletHome$OnDisplayMessage$Companion$ADAPTER$1 = new AfterpayAppletHome$OnDisplayMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnDisplayMessage.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletHome.OnDisplayMessage", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
            ADAPTER = afterpayAppletHome$OnDisplayMessage$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletHome$OnDisplayMessage$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDisplayMessage(String str, LocalMenuCardKt localMenuCardKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.message_id = str;
            this.treatment = localMenuCardKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OnDisplayMessage)) {
                return false;
            }
            OnDisplayMessage onDisplayMessage = (OnDisplayMessage) obj;
            return Intrinsics.areEqual(unknownFields(), onDisplayMessage.unknownFields()) && Intrinsics.areEqual(this.message_id, onDisplayMessage.message_id) && Intrinsics.areEqual(this.treatment, onDisplayMessage.treatment);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.message_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalMenuCardKt localMenuCardKt = this.treatment;
            int hashCode3 = hashCode2 + (localMenuCardKt != null ? localMenuCardKt.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(12);
            builder.image_url = this.message_id;
            builder.asset = this.treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.message_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_id=", arrayList);
            }
            LocalMenuCardKt localMenuCardKt = this.treatment;
            if (localMenuCardKt != null) {
                arrayList.add("treatment=" + localMenuCardKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OnDisplayMessage{", "}", 0, null, null, 56);
        }
    }

    static {
        AfterpayAppletHome$Companion$ADAPTER$1 afterpayAppletHome$Companion$ADAPTER$1 = new AfterpayAppletHome$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletHome.class), "type.googleapis.com/squareup.cash.cashsuggest.api.AfterpayAppletHome", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/afterpay/AfterpayAppletHome.proto");
        ADAPTER = afterpayAppletHome$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppletHome$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletHome(LocalizedString localizedString, TappableIcon tappableIcon, List list, Footer footer, AnalyticsEvent analyticsEvent, RetroOrderSelectionResponse retroOrderSelectionResponse, AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse, OnDisplayMessage onDisplayMessage, Experiments experiments, AfterpayAppletActivityResponse afterpayAppletActivityResponse, AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.header_tappable_info = tappableIcon;
        this.footer = footer;
        this.analytic_view_event = analyticsEvent;
        this.retro_selection_preload = retroOrderSelectionResponse;
        this.purchase_history_preload = afterpayAppletPurchaseHistoryResponse;
        this.on_display_message = onDisplayMessage;
        this.experiments = experiments;
        this.activity_preload = afterpayAppletActivityResponse;
        this.activity_history_preload = afterpayAppletActivityHistoryResponse;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public static AfterpayAppletHome copy$default(AfterpayAppletHome afterpayAppletHome, List list) {
        LocalizedString localizedString = afterpayAppletHome.title;
        TappableIcon tappableIcon = afterpayAppletHome.header_tappable_info;
        Footer footer = afterpayAppletHome.footer;
        AnalyticsEvent analyticsEvent = afterpayAppletHome.analytic_view_event;
        RetroOrderSelectionResponse retroOrderSelectionResponse = afterpayAppletHome.retro_selection_preload;
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = afterpayAppletHome.purchase_history_preload;
        OnDisplayMessage onDisplayMessage = afterpayAppletHome.on_display_message;
        Experiments experiments = afterpayAppletHome.experiments;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = afterpayAppletHome.activity_preload;
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = afterpayAppletHome.activity_history_preload;
        ByteString unknownFields = afterpayAppletHome.unknownFields();
        afterpayAppletHome.getClass();
        list.getClass();
        unknownFields.getClass();
        return new AfterpayAppletHome(localizedString, tappableIcon, list, footer, analyticsEvent, retroOrderSelectionResponse, afterpayAppletPurchaseHistoryResponse, onDisplayMessage, experiments, afterpayAppletActivityResponse, afterpayAppletActivityHistoryResponse, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletHome)) {
            return false;
        }
        AfterpayAppletHome afterpayAppletHome = (AfterpayAppletHome) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletHome.unknownFields()) && Intrinsics.areEqual(this.title, afterpayAppletHome.title) && Intrinsics.areEqual(this.header_tappable_info, afterpayAppletHome.header_tappable_info) && Intrinsics.areEqual(this.sections, afterpayAppletHome.sections) && Intrinsics.areEqual(this.footer, afterpayAppletHome.footer) && Intrinsics.areEqual(this.analytic_view_event, afterpayAppletHome.analytic_view_event) && Intrinsics.areEqual(this.retro_selection_preload, afterpayAppletHome.retro_selection_preload) && Intrinsics.areEqual(this.purchase_history_preload, afterpayAppletHome.purchase_history_preload) && Intrinsics.areEqual(this.on_display_message, afterpayAppletHome.on_display_message) && Intrinsics.areEqual(this.experiments, afterpayAppletHome.experiments) && Intrinsics.areEqual(this.activity_preload, afterpayAppletHome.activity_preload) && Intrinsics.areEqual(this.activity_history_preload, afterpayAppletHome.activity_history_preload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        TappableIcon tappableIcon = this.header_tappable_info;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (tappableIcon != null ? tappableIcon.hashCode() : 0)) * 37, 37, this.sections);
        Footer footer = this.footer;
        int hashCode3 = (m + (footer != null ? footer.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        int hashCode4 = (hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        RetroOrderSelectionResponse retroOrderSelectionResponse = this.retro_selection_preload;
        int hashCode5 = (hashCode4 + (retroOrderSelectionResponse != null ? retroOrderSelectionResponse.hashCode() : 0)) * 37;
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = this.purchase_history_preload;
        int hashCode6 = (hashCode5 + (afterpayAppletPurchaseHistoryResponse != null ? afterpayAppletPurchaseHistoryResponse.hashCode() : 0)) * 37;
        OnDisplayMessage onDisplayMessage = this.on_display_message;
        int hashCode7 = (hashCode6 + (onDisplayMessage != null ? onDisplayMessage.hashCode() : 0)) * 37;
        Experiments experiments = this.experiments;
        int hashCode8 = (hashCode7 + (experiments != null ? experiments.hashCode() : 0)) * 37;
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = this.activity_preload;
        int hashCode9 = (hashCode8 + (afterpayAppletActivityResponse != null ? afterpayAppletActivityResponse.hashCode() : 0)) * 37;
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = this.activity_history_preload;
        int hashCode10 = hashCode9 + (afterpayAppletActivityHistoryResponse != null ? afterpayAppletActivityHistoryResponse.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(6);
        builder.token = this.title;
        builder.merchant_token = this.header_tappable_info;
        builder.title = this.sections;
        builder.default_wage = this.footer;
        builder.created_at_timestamp_ms = this.analytic_view_event;
        builder.updated_at_timestamp_ms = this.retro_selection_preload;
        builder.deleted_at_timestamp_ms = this.purchase_history_preload;
        builder.team_member_count = this.on_display_message;
        builder.version = this.experiments;
        builder.tip_eligible = this.activity_preload;
        builder.default_color_scheme = this.activity_history_preload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        TappableIcon tappableIcon = this.header_tappable_info;
        if (tappableIcon != null) {
            arrayList.add("header_tappable_info=" + tappableIcon);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        Footer footer = this.footer;
        if (footer != null) {
            arrayList.add("footer=" + footer);
        }
        AnalyticsEvent analyticsEvent = this.analytic_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytic_view_event=", analyticsEvent, arrayList);
        }
        RetroOrderSelectionResponse retroOrderSelectionResponse = this.retro_selection_preload;
        if (retroOrderSelectionResponse != null) {
            arrayList.add("retro_selection_preload=" + retroOrderSelectionResponse);
        }
        AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse = this.purchase_history_preload;
        if (afterpayAppletPurchaseHistoryResponse != null) {
            arrayList.add("purchase_history_preload=" + afterpayAppletPurchaseHistoryResponse);
        }
        OnDisplayMessage onDisplayMessage = this.on_display_message;
        if (onDisplayMessage != null) {
            arrayList.add("on_display_message=" + onDisplayMessage);
        }
        Experiments experiments = this.experiments;
        if (experiments != null) {
            arrayList.add("experiments=" + experiments);
        }
        AfterpayAppletActivityResponse afterpayAppletActivityResponse = this.activity_preload;
        if (afterpayAppletActivityResponse != null) {
            arrayList.add("activity_preload=" + afterpayAppletActivityResponse);
        }
        AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse = this.activity_history_preload;
        if (afterpayAppletActivityHistoryResponse != null) {
            arrayList.add("activity_history_preload=" + afterpayAppletActivityHistoryResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletHome{", "}", 0, null, null, 56);
    }

    public AfterpayAppletHome(LocalizedString localizedString, TappableIcon tappableIcon, List list, Footer footer, AnalyticsEvent analyticsEvent, AfterpayAppletPurchaseHistoryResponse afterpayAppletPurchaseHistoryResponse, AfterpayAppletActivityResponse afterpayAppletActivityResponse, AfterpayAppletActivityHistoryResponse afterpayAppletActivityHistoryResponse) {
        this(localizedString, tappableIcon, list, footer, analyticsEvent, null, afterpayAppletPurchaseHistoryResponse, null, null, afterpayAppletActivityResponse, afterpayAppletActivityHistoryResponse, ByteString.EMPTY);
    }
}
