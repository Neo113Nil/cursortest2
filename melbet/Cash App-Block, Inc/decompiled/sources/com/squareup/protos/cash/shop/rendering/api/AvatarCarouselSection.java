package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.franklin.ui.UiAvatar;
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

/* loaded from: classes8.dex */
public final class AvatarCarouselSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvatarCarouselSection> CREATOR;
    public final List avatar_items;

    static {
        AvatarCarouselSection$Companion$ADAPTER$1 avatarCarouselSection$Companion$ADAPTER$1 = new AvatarCarouselSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarCarouselSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.AvatarCarouselSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/AvatarCarouselSection.proto");
        ADAPTER = avatarCarouselSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarCarouselSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCarouselSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.avatar_items = TransactorKt.immutableCopyOf("avatar_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarCarouselSection)) {
            return false;
        }
        AvatarCarouselSection avatarCarouselSection = (AvatarCarouselSection) obj;
        return Intrinsics.areEqual(unknownFields(), avatarCarouselSection.unknownFields()) && Intrinsics.areEqual(this.avatar_items, avatarCarouselSection.avatar_items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.avatar_items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(21, false);
        builder.pools = this.avatar_items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.avatar_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("avatar_items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarCarouselSection{", "}", 0, null, null, 56);
    }

    public AvatarCarouselSection(List list) {
        this(list, ByteString.EMPTY);
    }

    public final class AvatarItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AvatarItem> CREATOR;
        public final LocalizedString accessibility_text;
        public final AnalyticsEvent analytics_view_event;
        public final UiAvatar avatar;
        public final EngagedItemToken engaged_token;
        public final AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata feature_metadata;
        public final TapAction tap_action;
        public final LocalizedString title;

        static {
            AvatarCarouselSection$AvatarItem$Companion$ADAPTER$1 avatarCarouselSection$AvatarItem$Companion$ADAPTER$1 = new AvatarCarouselSection$AvatarItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.AvatarCarouselSection.AvatarItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/AvatarCarouselSection.proto");
            ADAPTER = avatarCarouselSection$AvatarItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarCarouselSection$AvatarItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarItem(AnalyticsEvent analyticsEvent, TapAction tapAction, UiAvatar uiAvatar, LocalizedString localizedString, EngagedItemToken engagedItemToken, AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.analytics_view_event = analyticsEvent;
            this.tap_action = tapAction;
            this.avatar = uiAvatar;
            this.title = localizedString;
            this.engaged_token = engagedItemToken;
            this.feature_metadata = avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata;
            this.accessibility_text = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarItem)) {
                return false;
            }
            AvatarItem avatarItem = (AvatarItem) obj;
            return Intrinsics.areEqual(unknownFields(), avatarItem.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, avatarItem.analytics_view_event) && Intrinsics.areEqual(this.tap_action, avatarItem.tap_action) && Intrinsics.areEqual(this.avatar, avatarItem.avatar) && Intrinsics.areEqual(this.title, avatarItem.title) && Intrinsics.areEqual(this.engaged_token, avatarItem.engaged_token) && Intrinsics.areEqual(this.feature_metadata, avatarItem.feature_metadata) && Intrinsics.areEqual(this.accessibility_text, avatarItem.accessibility_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode4 = (hashCode3 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.title;
            int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            EngagedItemToken engagedItemToken = this.engaged_token;
            int hashCode6 = (hashCode5 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0)) * 37;
            AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = this.feature_metadata;
            int hashCode7 = (hashCode6 + (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null ? avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata.value.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.accessibility_text;
            int hashCode8 = hashCode7 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolParticipant.Builder builder = new PoolParticipant.Builder(18);
            builder.customer_identifier = this.analytics_view_event;
            builder.full_name = this.tap_action;
            builder.profile_photo_url = this.avatar;
            builder.cashtag = this.title;
            builder.added_at = this.engaged_token;
            builder.participant_type = this.feature_metadata;
            builder.aggregated_contribution_amount = this.accessibility_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            if (analyticsEvent != null) {
                SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
            }
            TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            EngagedItemToken engagedItemToken = this.engaged_token;
            if (engagedItemToken != null) {
                arrayList.add("engaged_token=" + engagedItemToken);
            }
            AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = this.feature_metadata;
            if (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null) {
                arrayList.add("feature_metadata=" + avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata);
            }
            LocalizedString localizedString2 = this.accessibility_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessibility_text=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarItem{", "}", 0, null, null, 56);
        }

        public /* synthetic */ AvatarItem(TapAction tapAction, UiAvatar uiAvatar, LocalizedString localizedString, EngagedItemToken engagedItemToken) {
            this(null, tapAction, uiAvatar, localizedString, engagedItemToken, null, null, ByteString.EMPTY);
        }
    }
}
