package com.squareup.protos.cash.loyalizer.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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
public final class LoyaltyPromotionSheetPlaceholder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyPromotionSheetPlaceholder> CREATOR;
    public final LoyaltyPromotionAvailability available_time;
    public final Color background_color;
    public final AnalyticsEvent dismiss_event;
    public final LocationData locations;

    public final class LocationData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocationData> CREATOR;
        public final List locations;
        public final String title;

        static {
            LoyaltyPromotionSheetPlaceholder$LocationData$Companion$ADAPTER$1 loyaltyPromotionSheetPlaceholder$LocationData$Companion$ADAPTER$1 = new LoyaltyPromotionSheetPlaceholder$LocationData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocationData.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder.LocationData", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
            ADAPTER = loyaltyPromotionSheetPlaceholder$LocationData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionSheetPlaceholder$LocationData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationData(String str, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
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
            return Intrinsics.areEqual(unknownFields(), locationData.unknownFields()) && Intrinsics.areEqual(this.title, locationData.title) && Intrinsics.areEqual(this.locations, locationData.locations);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = this.locations.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ToggleScreen.Builder builder = new ToggleScreen.Builder(26, false);
            builder.toggle_title = this.title;
            builder.sections = this.locations;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            List list = this.locations;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("locations=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocationData{", "}", 0, null, null, 56);
        }
    }

    static {
        LoyaltyPromotionSheetPlaceholder$Companion$ADAPTER$1 loyaltyPromotionSheetPlaceholder$Companion$ADAPTER$1 = new LoyaltyPromotionSheetPlaceholder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyPromotionSheetPlaceholder.class), "type.googleapis.com/squareup.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder", Syntax.PROTO_2, null, "squareup/cash/loyalizer/app/LoyaltyPromotionPlaceholderData.proto");
        ADAPTER = loyaltyPromotionSheetPlaceholder$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyPromotionSheetPlaceholder$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyPromotionSheetPlaceholder(LoyaltyPromotionAvailability loyaltyPromotionAvailability, LocationData locationData, AnalyticsEvent analyticsEvent, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.available_time = loyaltyPromotionAvailability;
        this.locations = locationData;
        this.dismiss_event = analyticsEvent;
        this.background_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyPromotionSheetPlaceholder)) {
            return false;
        }
        LoyaltyPromotionSheetPlaceholder loyaltyPromotionSheetPlaceholder = (LoyaltyPromotionSheetPlaceholder) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyPromotionSheetPlaceholder.unknownFields()) && Intrinsics.areEqual(this.available_time, loyaltyPromotionSheetPlaceholder.available_time) && Intrinsics.areEqual(this.locations, loyaltyPromotionSheetPlaceholder.locations) && Intrinsics.areEqual(this.dismiss_event, loyaltyPromotionSheetPlaceholder.dismiss_event) && Intrinsics.areEqual(this.background_color, loyaltyPromotionSheetPlaceholder.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = this.available_time;
        int hashCode2 = (hashCode + (loyaltyPromotionAvailability != null ? loyaltyPromotionAvailability.hashCode() : 0)) * 37;
        LocationData locationData = this.locations;
        int hashCode3 = (hashCode2 + (locationData != null ? locationData.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.dismiss_event;
        int hashCode4 = (hashCode3 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode5 = hashCode4 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(16, false);
        builder.id = this.available_time;
        builder.last_4 = this.locations;
        builder.gift_card_id = this.dismiss_event;
        builder.gift_card_amount = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LoyaltyPromotionAvailability loyaltyPromotionAvailability = this.available_time;
        if (loyaltyPromotionAvailability != null) {
            arrayList.add("available_time=" + loyaltyPromotionAvailability);
        }
        LocationData locationData = this.locations;
        if (locationData != null) {
            arrayList.add("locations=" + locationData);
        }
        AnalyticsEvent analyticsEvent = this.dismiss_event;
        if (analyticsEvent != null) {
            arrayList.add("dismiss_event=" + analyticsEvent);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyPromotionSheetPlaceholder{", "}", 0, null, null, 56);
    }
}
