package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClusterInfoItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClusterInfoItem> CREATOR;
    public final AnalyticsEvent analytics_view_event;
    public final Color background_color;
    public final Button button;
    public final ClusterColorTheme color_theme;
    public final FormattedDetail formatted_details;
    public final LocalizedString l_title;
    public final TapAction tap_action;
    public final StyledText title;

    public enum ClusterColorTheme implements WireEnum {
        UNSPECIFIED(0),
        GREEN(1),
        PURPLE(2),
        ORANGE(3),
        BLUE(4);

        public static final ClusterInfoItem$ClusterColorTheme$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            ClusterColorTheme clusterColorTheme = UNSPECIFIED;
            Companion = new ActionType.Companion();
            ADAPTER = new ClusterInfoItem$ClusterColorTheme$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ClusterColorTheme.class), Syntax.PROTO_2, clusterColorTheme);
        }

        ClusterColorTheme(int i) {
            this.value = i;
        }

        public static final ClusterColorTheme fromValue(int i) {
            Companion.getClass();
            return ActionType.Companion.m3933fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ClusterInfoItem$Companion$ADAPTER$1 clusterInfoItem$Companion$ADAPTER$1 = new ClusterInfoItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClusterInfoItem.class), "type.googleapis.com/squareup.cash.shop.rendering.api.ClusterInfoItem", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/ClusterSection.proto");
        ADAPTER = clusterInfoItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clusterInfoItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClusterInfoItem(LocalizedString localizedString, TapAction tapAction, Button button, ClusterColorTheme clusterColorTheme, AnalyticsEvent analyticsEvent, FormattedDetail formattedDetail, StyledText styledText, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.l_title = localizedString;
        this.tap_action = tapAction;
        this.button = button;
        this.color_theme = clusterColorTheme;
        this.analytics_view_event = analyticsEvent;
        this.formatted_details = formattedDetail;
        this.title = styledText;
        this.background_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClusterInfoItem)) {
            return false;
        }
        ClusterInfoItem clusterInfoItem = (ClusterInfoItem) obj;
        return Intrinsics.areEqual(unknownFields(), clusterInfoItem.unknownFields()) && Intrinsics.areEqual(this.l_title, clusterInfoItem.l_title) && Intrinsics.areEqual(this.tap_action, clusterInfoItem.tap_action) && Intrinsics.areEqual(this.button, clusterInfoItem.button) && this.color_theme == clusterInfoItem.color_theme && Intrinsics.areEqual(this.analytics_view_event, clusterInfoItem.analytics_view_event) && Intrinsics.areEqual(this.formatted_details, clusterInfoItem.formatted_details) && Intrinsics.areEqual(this.title, clusterInfoItem.title) && Intrinsics.areEqual(this.background_color, clusterInfoItem.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.l_title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        TapAction tapAction = this.tap_action;
        int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
        ClusterColorTheme clusterColorTheme = this.color_theme;
        int hashCode5 = (hashCode4 + (clusterColorTheme != null ? clusterColorTheme.hashCode() : 0)) * 37;
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        int hashCode6 = (hashCode5 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
        FormattedDetail formattedDetail = this.formatted_details;
        int hashCode7 = (hashCode6 + (formattedDetail != null ? formattedDetail.hashCode() : 0)) * 37;
        StyledText styledText = this.title;
        int hashCode8 = (hashCode7 + (styledText != null ? styledText.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode9 = hashCode8 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(14, false);
        builder.category = this.l_title;
        builder.token = this.tap_action;
        builder.title = this.button;
        builder.client_route = this.color_theme;
        builder.url = this.analytics_view_event;
        builder.owner_token = this.formatted_details;
        builder.version_data = this.title;
        builder.localizable_title = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.l_title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
        }
        TapAction tapAction = this.tap_action;
        if (tapAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
        }
        Button button = this.button;
        if (button != null) {
            SizeMode$EnumUnboxingLocalUtility.m("button=", button, arrayList);
        }
        ClusterColorTheme clusterColorTheme = this.color_theme;
        if (clusterColorTheme != null) {
            arrayList.add("color_theme=" + clusterColorTheme);
        }
        AnalyticsEvent analyticsEvent = this.analytics_view_event;
        if (analyticsEvent != null) {
            SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
        }
        FormattedDetail formattedDetail = this.formatted_details;
        if (formattedDetail != null) {
            arrayList.add("formatted_details=" + formattedDetail);
        }
        StyledText styledText = this.title;
        if (styledText != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClusterInfoItem{", "}", 0, null, null, 56);
    }
}
