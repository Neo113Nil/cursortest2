package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.franklin.ui.UiAvatar;
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

/* loaded from: classes8.dex */
public final class AvatarItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvatarItem> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final UiAvatar avatar;
    public final EngagedItemToken engaged_token;
    public final TapAction tap_action;

    static {
        AvatarItem$Companion$ADAPTER$1 avatarItem$Companion$ADAPTER$1 = new AvatarItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvatarItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.AvatarItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/AvatarItem.proto");
        ADAPTER = avatarItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatarItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarItem(AnalyticsEvent analyticsEvent, TapAction tapAction, UiAvatar uiAvatar, EngagedItemToken engagedItemToken, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.analytics_view_event = analyticsEvent;
        this.tap_action = tapAction;
        this.avatar = uiAvatar;
        this.engaged_token = engagedItemToken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarItem)) {
            return false;
        }
        AvatarItem avatarItem = (AvatarItem) obj;
        return Intrinsics.areEqual(unknownFields(), avatarItem.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, avatarItem.analytics_view_event) && Intrinsics.areEqual(this.tap_action, avatarItem.tap_action) && Intrinsics.areEqual(this.avatar, avatarItem.avatar) && Intrinsics.areEqual(this.engaged_token, avatarItem.engaged_token);
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
        EngagedItemToken engagedItemToken = this.engaged_token;
        int hashCode5 = hashCode4 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(15);
        builder.card_encryption_data = this.analytics_view_event;
        builder.customer_token_hash_email = this.tap_action;
        builder.device_metadata = this.avatar;
        builder.success_screen = this.engaged_token;
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
        EngagedItemToken engagedItemToken = this.engaged_token;
        if (engagedItemToken != null) {
            arrayList.add("engaged_token=" + engagedItemToken);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvatarItem{", "}", 0, null, null, 56);
    }
}
