package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/cashsuggest/api/OffersTabCollectionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/badging/api/Badge$Builder;", "Builder", "InStoreBoostMetadata", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OffersTabCollectionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersTabCollectionResponse> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final Long expire_at_ms;
    public final FormattedDetail formatted_subtitle;
    public final InStoreBoostMetadata in_store_boost_metadata;
    public final LocalizedString l_screen_title;
    public final String screen_subtitle;
    public final String screen_title;
    public final List sections;

    /* loaded from: classes7.dex */
    public final class InStoreBoostMetadata extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InStoreBoostMetadata> CREATOR;
        public final com.squareup.protos.cash.shop.rendering.api.TapAction card_tap_action;

        static {
            OffersTabCollectionResponse$InStoreBoostMetadata$Companion$ADAPTER$1 offersTabCollectionResponse$InStoreBoostMetadata$Companion$ADAPTER$1 = new OffersTabCollectionResponse$InStoreBoostMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InStoreBoostMetadata.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersTabCollectionResponse.InStoreBoostMetadata", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersTabCollection.proto");
            ADAPTER = offersTabCollectionResponse$InStoreBoostMetadata$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(offersTabCollectionResponse$InStoreBoostMetadata$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InStoreBoostMetadata(com.squareup.protos.cash.shop.rendering.api.TapAction tapAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.card_tap_action = tapAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InStoreBoostMetadata)) {
                return false;
            }
            InStoreBoostMetadata inStoreBoostMetadata = (InStoreBoostMetadata) obj;
            return Intrinsics.areEqual(unknownFields(), inStoreBoostMetadata.unknownFields()) && Intrinsics.areEqual(this.card_tap_action, inStoreBoostMetadata.card_tap_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.card_tap_action;
            int hashCode2 = hashCode + (tapAction != null ? tapAction.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Asset.Builder builder = new Asset.Builder(2);
            builder.asset_type = this.card_tap_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = this.card_tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("card_tap_action=", tapAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InStoreBoostMetadata{", "}", 0, null, null, 56);
        }
    }

    static {
        OffersTabCollectionResponse$Companion$ADAPTER$1 offersTabCollectionResponse$Companion$ADAPTER$1 = new OffersTabCollectionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OffersTabCollectionResponse.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OffersTabCollectionResponse", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersTabCollection.proto");
        ADAPTER = offersTabCollectionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offersTabCollectionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersTabCollectionResponse(LocalizedString localizedString, List list, Long l, AnalyticsEvent analyticsEvent, FormattedDetail formattedDetail, String str, String str2, InStoreBoostMetadata inStoreBoostMetadata, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.l_screen_title = localizedString;
        this.expire_at_ms = l;
        this.analytics_view_event = analyticsEvent;
        this.formatted_subtitle = formattedDetail;
        this.screen_title = str;
        this.screen_subtitle = str2;
        this.in_store_boost_metadata = inStoreBoostMetadata;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersTabCollectionResponse)) {
            return false;
        }
        OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), offersTabCollectionResponse.unknownFields()) && Intrinsics.areEqual(this.l_screen_title, offersTabCollectionResponse.l_screen_title) && Intrinsics.areEqual(this.sections, offersTabCollectionResponse.sections) && Intrinsics.areEqual(this.expire_at_ms, offersTabCollectionResponse.expire_at_ms) && Intrinsics.areEqual(this.analytics_view_event, offersTabCollectionResponse.analytics_view_event) && Intrinsics.areEqual(this.formatted_subtitle, offersTabCollectionResponse.formatted_subtitle) && Intrinsics.areEqual(this.screen_title, offersTabCollectionResponse.screen_title) && Intrinsics.areEqual(this.screen_subtitle, offersTabCollectionResponse.screen_subtitle) && Intrinsics.areEqual(this.in_store_boost_metadata, offersTabCollectionResponse.in_store_boost_metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.l_screen_title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.sections);
        Long l = this.expire_at_ms;
        int hashCode2 = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode3 = (hashCode2 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        FormattedDetail formattedDetail = this.formatted_subtitle;
        int hashCode4 = (hashCode3 + (formattedDetail != null ? formattedDetail.hashCode() : 0)) * 37;
        String str = this.screen_title;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.screen_subtitle;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        InStoreBoostMetadata inStoreBoostMetadata = this.in_store_boost_metadata;
        int hashCode7 = hashCode6 + (inStoreBoostMetadata != null ? inStoreBoostMetadata.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(15);
        builder.updated_at = this.l_screen_title;
        builder.count_groups = this.sections;
        builder.external_version = this.expire_at_ms;
        builder.created_at = this.analytics_view_event;
        builder.is_badged = this.formatted_subtitle;
        builder.external_token = this.screen_title;
        builder.customer_token = this.screen_subtitle;
        builder.item_type = this.in_store_boost_metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.l_screen_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_screen_title=", localizedString, arrayList);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        Long l = this.expire_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at_ms=", l, arrayList);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        FormattedDetail formattedDetail = this.formatted_subtitle;
        if (formattedDetail != null) {
            arrayList.add("formatted_subtitle=" + formattedDetail);
        }
        String str = this.screen_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "screen_title=", arrayList);
        }
        String str2 = this.screen_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "screen_subtitle=", arrayList);
        }
        InStoreBoostMetadata inStoreBoostMetadata = this.in_store_boost_metadata;
        if (inStoreBoostMetadata != null) {
            arrayList.add("in_store_boost_metadata=" + inStoreBoostMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersTabCollectionResponse{", "}", 0, null, null, 56);
    }
}
