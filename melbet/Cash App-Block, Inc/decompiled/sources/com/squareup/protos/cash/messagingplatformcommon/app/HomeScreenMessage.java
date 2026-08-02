package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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

/* loaded from: classes7.dex */
public final class HomeScreenMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HomeScreenMessage> CREATOR;
    public final String asset_url;
    public final String headline;
    public final String message_text;
    public final AppMessageAction primary_navigation_action;
    public final AppMessageAction secondary_navigation_action;

    static {
        HomeScreenMessage$Companion$ADAPTER$1 homeScreenMessage$Companion$ADAPTER$1 = new HomeScreenMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HomeScreenMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.HomeScreenMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = homeScreenMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(homeScreenMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenMessage(String str, String str2, String str3, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.headline = str;
        this.message_text = str2;
        this.asset_url = str3;
        this.primary_navigation_action = appMessageAction;
        this.secondary_navigation_action = appMessageAction2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeScreenMessage)) {
            return false;
        }
        HomeScreenMessage homeScreenMessage = (HomeScreenMessage) obj;
        return Intrinsics.areEqual(unknownFields(), homeScreenMessage.unknownFields()) && Intrinsics.areEqual(this.headline, homeScreenMessage.headline) && Intrinsics.areEqual(this.message_text, homeScreenMessage.message_text) && Intrinsics.areEqual(this.asset_url, homeScreenMessage.asset_url) && Intrinsics.areEqual(this.primary_navigation_action, homeScreenMessage.primary_navigation_action) && Intrinsics.areEqual(this.secondary_navigation_action, homeScreenMessage.secondary_navigation_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.headline;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.asset_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_navigation_action;
        int hashCode5 = (hashCode4 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        int hashCode6 = hashCode5 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(20);
        builder.icon = this.headline;
        builder.title = this.message_text;
        builder.subtitle = this.asset_url;
        builder.action = this.primary_navigation_action;
        builder.icon_background_color = this.secondary_navigation_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.headline;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "headline=", arrayList);
        }
        String str2 = this.message_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_text=", arrayList);
        }
        String str3 = this.asset_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "asset_url=", arrayList);
        }
        AppMessageAction appMessageAction = this.primary_navigation_action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_navigation_action=", appMessageAction, arrayList);
        }
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        if (appMessageAction2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_navigation_action=", appMessageAction2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HomeScreenMessage{", "}", 0, null, null, 56);
    }
}
