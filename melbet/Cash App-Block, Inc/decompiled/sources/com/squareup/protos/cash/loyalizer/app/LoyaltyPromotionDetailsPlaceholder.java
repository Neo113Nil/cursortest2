package com.squareup.protos.cash.loyalizer.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.ui.Color;
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
public final class LoyaltyPromotionDetailsPlaceholder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyPromotionDetailsPlaceholder> CREATOR;
    public final List loyalty_promotion;
    public final LoyaltyPromotionData promotion;

    public final class LoyaltyPromotionData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LoyaltyPromotionData> CREATOR;
        public final String benefit;
        public final AnalyticsEvent dismiss_event;
        public final Color icon_color;
        public final String icon_url;
        public final List section;
        public final Action tap;
        public final AnalyticsEvent tap_event;
        public final String title;
        public final AnalyticsEvent view_event;

        public final class LocationData extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LocationData> CREATOR;
            public final List locations;

            static {
                LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$LocationData$Companion$ADAPTER$1 loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$LocationData$Companion$ADAPTER$1 = new LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$LocationData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocationData.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.LocationData", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
                ADAPTER = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$LocationData$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$LocationData$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocationData(List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.locations = TransactorKt.immutableCopyOf("locations", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LocationData)) {
                    return false;
                }
                LocationData locationData = (LocationData) obj;
                return Intrinsics.areEqual(unknownFields(), locationData.unknownFields()) && Intrinsics.areEqual(this.locations, locationData.locations);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.locations.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                MoneyTab.Builder builder = new MoneyTab.Builder(14, false);
                builder.applets = this.locations;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.locations;
                if (!list.isEmpty()) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("locations=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LocationData{", "}", 0, null, null, 56);
            }
        }

        public final class Section extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Section> CREATOR;
            public final zzjj content;
            public final String title;

            static {
                LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Companion$ADAPTER$1 loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Companion$ADAPTER$1 = new LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
                ADAPTER = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Section$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Section(String str, zzjj zzjjVar, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.content = zzjjVar;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Section)) {
                    return false;
                }
                Section section = (Section) obj;
                return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.content, section.content);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                zzjj zzjjVar = this.content;
                int hashCode3 = hashCode2 + (zzjjVar != null ? zzjjVar.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                InputValue.Builder builder = new InputValue.Builder(23);
                builder.input_id = this.title;
                builder.value = this.content;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                zzjj zzjjVar = this.content;
                if (zzjjVar != null) {
                    arrayList.add("content=" + zzjjVar);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
            }
        }

        static {
            LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Companion$ADAPTER$1 loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Companion$ADAPTER$1 = new LoyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyPromotionData.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
            ADAPTER = loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionDetailsPlaceholder$LoyaltyPromotionData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoyaltyPromotionData(String str, String str2, String str3, List list, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, Action action, AnalyticsEvent analyticsEvent3, Color color, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.benefit = str;
            this.icon_url = str2;
            this.title = str3;
            this.tap_event = analyticsEvent;
            this.dismiss_event = analyticsEvent2;
            this.tap = action;
            this.view_event = analyticsEvent3;
            this.icon_color = color;
            this.section = TransactorKt.immutableCopyOf("section", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoyaltyPromotionData)) {
                return false;
            }
            LoyaltyPromotionData loyaltyPromotionData = (LoyaltyPromotionData) obj;
            return Intrinsics.areEqual(unknownFields(), loyaltyPromotionData.unknownFields()) && Intrinsics.areEqual(this.benefit, loyaltyPromotionData.benefit) && Intrinsics.areEqual(this.icon_url, loyaltyPromotionData.icon_url) && Intrinsics.areEqual(this.title, loyaltyPromotionData.title) && Intrinsics.areEqual(this.section, loyaltyPromotionData.section) && Intrinsics.areEqual(this.tap_event, loyaltyPromotionData.tap_event) && Intrinsics.areEqual(this.dismiss_event, loyaltyPromotionData.dismiss_event) && Intrinsics.areEqual(this.tap, loyaltyPromotionData.tap) && Intrinsics.areEqual(this.view_event, loyaltyPromotionData.view_event) && Intrinsics.areEqual(this.icon_color, loyaltyPromotionData.icon_color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.benefit;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.icon_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.section);
            AnalyticsEvent analyticsEvent = this.tap_event;
            int hashCode4 = (m + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            AnalyticsEvent analyticsEvent2 = this.dismiss_event;
            int hashCode5 = (hashCode4 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0)) * 37;
            Action action = this.tap;
            int hashCode6 = (hashCode5 + (action != null ? action.hashCode() : 0)) * 37;
            AnalyticsEvent analyticsEvent3 = this.view_event;
            int hashCode7 = (hashCode6 + (analyticsEvent3 != null ? analyticsEvent3.hashCode() : 0)) * 37;
            Color color = this.icon_color;
            int hashCode8 = hashCode7 + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(27, false);
            builder.locale = this.benefit;
            builder.title = this.icon_url;
            builder.info_rows_header = this.title;
            builder.info_rows = this.section;
            builder.footer_text = this.tap_event;
            builder.loadable_subtitle = this.dismiss_event;
            builder.primary_footer_button_state = this.tap;
            builder.secondary_footer_button_state = this.view_event;
            builder.payment_plans_data = this.icon_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.benefit;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "benefit=", arrayList);
            }
            String str2 = this.icon_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_url=", arrayList);
            }
            String str3 = this.title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
            }
            List list = this.section;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("section=", arrayList, list);
            }
            AnalyticsEvent analyticsEvent = this.tap_event;
            if (analyticsEvent != null) {
                arrayList.add("tap_event=" + analyticsEvent);
            }
            AnalyticsEvent analyticsEvent2 = this.dismiss_event;
            if (analyticsEvent2 != null) {
                arrayList.add("dismiss_event=" + analyticsEvent2);
            }
            Action action = this.tap;
            if (action != null) {
                arrayList.add("tap=" + action);
            }
            AnalyticsEvent analyticsEvent3 = this.view_event;
            if (analyticsEvent3 != null) {
                arrayList.add("view_event=" + analyticsEvent3);
            }
            Color color = this.icon_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyPromotionData{", "}", 0, null, null, 56);
        }
    }

    static {
        LoyaltyPromotionDetailsPlaceholder$Companion$ADAPTER$1 loyaltyPromotionDetailsPlaceholder$Companion$ADAPTER$1 = new LoyaltyPromotionDetailsPlaceholder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyPromotionDetailsPlaceholder.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
        ADAPTER = loyaltyPromotionDetailsPlaceholder$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionDetailsPlaceholder$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyPromotionDetailsPlaceholder(List list, LoyaltyPromotionData loyaltyPromotionData, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.promotion = loyaltyPromotionData;
        this.loyalty_promotion = TransactorKt.immutableCopyOf("loyalty_promotion", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyPromotionDetailsPlaceholder)) {
            return false;
        }
        LoyaltyPromotionDetailsPlaceholder loyaltyPromotionDetailsPlaceholder = (LoyaltyPromotionDetailsPlaceholder) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyPromotionDetailsPlaceholder.unknownFields()) && Intrinsics.areEqual(this.loyalty_promotion, loyaltyPromotionDetailsPlaceholder.loyalty_promotion) && Intrinsics.areEqual(this.promotion, loyaltyPromotionDetailsPlaceholder.promotion);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.loyalty_promotion);
        LoyaltyPromotionData loyaltyPromotionData = this.promotion;
        int hashCode = m + (loyaltyPromotionData != null ? loyaltyPromotionData.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(22);
        builder.input_id = this.loyalty_promotion;
        builder.value = this.promotion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.loyalty_promotion;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("loyalty_promotion=", arrayList, list);
        }
        LoyaltyPromotionData loyaltyPromotionData = this.promotion;
        if (loyaltyPromotionData != null) {
            arrayList.add("promotion=" + loyaltyPromotionData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyPromotionDetailsPlaceholder{", "}", 0, null, null, 56);
    }
}
