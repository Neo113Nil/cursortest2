package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzjq;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.papermate.enums.FeeType;
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
public final class DetailsPageView extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageView> CREATOR;
    public final List details_page_components;
    public final Text eyebrow;
    public final String header_bar_title;
    public final Text headline;
    public final NavigationIcon navigation_icon;
    public final AppMessageAction primary_button;
    public final AppMessageAction primary_button_footer;
    public final zzjq primary_content;
    public final AppMessageAction secondary_button;
    public final AppMessageAction secondary_button_footer;
    public final ShareSheet share_sheet;
    public final Text subheadline;
    public final TextPlacement text_placement;
    public final String token;
    public final String treehouse_path;

    public enum TextPlacement implements WireEnum {
        TEXT_PLACEMENT_UNSPECIFIED(0),
        TEXT_PLACEMENT_TOP_LEFT(1),
        TEXT_PLACEMENT_MIDDLE_LEFT(2),
        TEXT_PLACEMENT_BOTTOM_LEFT(3),
        TEXT_PLACEMENT_TOP_CENTER(4);

        public static final DetailsPageView$TextPlacement$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            TextPlacement textPlacement = TEXT_PLACEMENT_UNSPECIFIED;
            Companion = new FeeType.Companion();
            ADAPTER = new DetailsPageView$TextPlacement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextPlacement.class), Syntax.PROTO_2, textPlacement);
        }

        TextPlacement(int i) {
            this.value = i;
        }

        public static final TextPlacement fromValue(int i) {
            Companion.getClass();
            return FeeType.Companion.m3911fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DetailsPageView$Companion$ADAPTER$1 detailsPageView$Companion$ADAPTER$1 = new DetailsPageView$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageView.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.DetailsPageView", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = detailsPageView$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageView$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageView(String str, Text text, Text text2, Text text3, TextPlacement textPlacement, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, ShareSheet shareSheet, String str2, String str3, NavigationIcon navigationIcon, AppMessageAction appMessageAction3, AppMessageAction appMessageAction4, List list, zzjq zzjqVar, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.treehouse_path = str;
        this.eyebrow = text;
        this.headline = text2;
        this.subheadline = text3;
        this.text_placement = textPlacement;
        this.primary_button = appMessageAction;
        this.secondary_button = appMessageAction2;
        this.share_sheet = shareSheet;
        this.header_bar_title = str2;
        this.token = str3;
        this.navigation_icon = navigationIcon;
        this.primary_button_footer = appMessageAction3;
        this.secondary_button_footer = appMessageAction4;
        this.primary_content = zzjqVar;
        this.details_page_components = TransactorKt.immutableCopyOf("details_page_components", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageView)) {
            return false;
        }
        DetailsPageView detailsPageView = (DetailsPageView) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageView.unknownFields()) && Intrinsics.areEqual(this.treehouse_path, detailsPageView.treehouse_path) && Intrinsics.areEqual(this.eyebrow, detailsPageView.eyebrow) && Intrinsics.areEqual(this.headline, detailsPageView.headline) && Intrinsics.areEqual(this.subheadline, detailsPageView.subheadline) && this.text_placement == detailsPageView.text_placement && Intrinsics.areEqual(this.primary_button, detailsPageView.primary_button) && Intrinsics.areEqual(this.secondary_button, detailsPageView.secondary_button) && Intrinsics.areEqual(this.share_sheet, detailsPageView.share_sheet) && Intrinsics.areEqual(this.header_bar_title, detailsPageView.header_bar_title) && Intrinsics.areEqual(this.token, detailsPageView.token) && Intrinsics.areEqual(this.navigation_icon, detailsPageView.navigation_icon) && Intrinsics.areEqual(this.primary_button_footer, detailsPageView.primary_button_footer) && Intrinsics.areEqual(this.secondary_button_footer, detailsPageView.secondary_button_footer) && Intrinsics.areEqual(this.details_page_components, detailsPageView.details_page_components) && Intrinsics.areEqual(this.primary_content, detailsPageView.primary_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.treehouse_path;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Text text = this.eyebrow;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.headline;
        int hashCode4 = (hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Text text3 = this.subheadline;
        int hashCode5 = (hashCode4 + (text3 != null ? text3.hashCode() : 0)) * 37;
        TextPlacement textPlacement = this.text_placement;
        int hashCode6 = (hashCode5 + (textPlacement != null ? textPlacement.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_button;
        int hashCode7 = (hashCode6 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction2 = this.secondary_button;
        int hashCode8 = (hashCode7 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0)) * 37;
        ShareSheet shareSheet = this.share_sheet;
        int hashCode9 = (hashCode8 + (shareSheet != null ? shareSheet.hashCode() : 0)) * 37;
        String str2 = this.header_bar_title;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.token;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        NavigationIcon navigationIcon = this.navigation_icon;
        int hashCode12 = (hashCode11 + (navigationIcon != null ? navigationIcon.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction3 = this.primary_button_footer;
        int hashCode13 = (hashCode12 + (appMessageAction3 != null ? appMessageAction3.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction4 = this.secondary_button_footer;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode13 + (appMessageAction4 != null ? appMessageAction4.hashCode() : 0)) * 37, 37, this.details_page_components);
        zzjq zzjqVar = this.primary_content;
        int hashCode14 = m + (zzjqVar != null ? zzjqVar.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(5);
        builder.user_agent = this.treehouse_path;
        builder.time_format = this.eyebrow;
        builder.ip_address = this.headline;
        builder.device_name = this.subheadline;
        builder.accept_language = this.text_placement;
        builder.device_installation_id = this.primary_button;
        builder.drm_id = this.secondary_button;
        builder.device_vendor_id = this.share_sheet;
        builder.device_uuid = this.header_bar_title;
        builder.date_format = this.token;
        builder.device_id = this.navigation_icon;
        builder.threatmetrix_smart_id = this.primary_button_footer;
        builder.timestamp = this.secondary_button_footer;
        builder.navigation_paradigm = this.details_page_components;
        builder.client_scenario = this.primary_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.treehouse_path;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "treehouse_path=", arrayList);
        }
        Text text = this.eyebrow;
        if (text != null) {
            arrayList.add("eyebrow=" + text);
        }
        Text text2 = this.headline;
        if (text2 != null) {
            arrayList.add("headline=" + text2);
        }
        Text text3 = this.subheadline;
        if (text3 != null) {
            arrayList.add("subheadline=" + text3);
        }
        TextPlacement textPlacement = this.text_placement;
        if (textPlacement != null) {
            arrayList.add("text_placement=" + textPlacement);
        }
        AppMessageAction appMessageAction = this.primary_button;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_button=", appMessageAction, arrayList);
        }
        AppMessageAction appMessageAction2 = this.secondary_button;
        if (appMessageAction2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_button=", appMessageAction2, arrayList);
        }
        ShareSheet shareSheet = this.share_sheet;
        if (shareSheet != null) {
            arrayList.add("share_sheet=" + shareSheet);
        }
        String str2 = this.header_bar_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header_bar_title=", arrayList);
        }
        String str3 = this.token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "token=", arrayList);
        }
        NavigationIcon navigationIcon = this.navigation_icon;
        if (navigationIcon != null) {
            arrayList.add("navigation_icon=" + navigationIcon);
        }
        AppMessageAction appMessageAction3 = this.primary_button_footer;
        if (appMessageAction3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_button_footer=", appMessageAction3, arrayList);
        }
        AppMessageAction appMessageAction4 = this.secondary_button_footer;
        if (appMessageAction4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_button_footer=", appMessageAction4, arrayList);
        }
        List list = this.details_page_components;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("details_page_components=", arrayList, list);
        }
        zzjq zzjqVar = this.primary_content;
        if (zzjqVar != null) {
            arrayList.add("primary_content=" + zzjqVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageView{", "}", 0, null, null, 56);
    }
}
