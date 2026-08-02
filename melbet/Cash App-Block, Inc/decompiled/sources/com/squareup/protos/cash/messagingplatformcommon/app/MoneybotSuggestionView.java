package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.client.ClientKickoffParams;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.franklin.ui.UiAvatar;
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

/* loaded from: classes7.dex */
public final class MoneybotSuggestionView extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MoneybotSuggestionView> CREATOR;
    public final UiAvatar avatar;
    public final Category category;
    public final ClientKickoffParams chat_params;
    public final String tip;
    public final String title;

    public enum Category implements WireEnum {
        CATEGORY_UNDEFINED(0),
        CATEGORY_INVESTING(1),
        CATEGORY_BITCOIN(2),
        CATEGORY_P2P(3),
        CATEGORY_SAVINGS(4),
        CATEGORY_ACTIVITIES(5),
        CATEGORY_MOVING_MONEY(6),
        CATEGORY_GENERAL(7),
        CATEGORY_SPENDING(8),
        CATEGORY_OTHERS(9);

        public static final MoneybotSuggestionView$Category$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            Category category = CATEGORY_UNDEFINED;
            Companion = new RetailerType.Companion();
            ADAPTER = new MoneybotSuggestionView$Category$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Category.class), Syntax.PROTO_2, category);
        }

        Category(int i) {
            this.value = i;
        }

        public static final Category fromValue(int i) {
            Companion.getClass();
            return RetailerType.Companion.m3905fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        MoneybotSuggestionView$Companion$ADAPTER$1 moneybotSuggestionView$Companion$ADAPTER$1 = new MoneybotSuggestionView$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneybotSuggestionView.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.MoneybotSuggestionView", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = moneybotSuggestionView$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(moneybotSuggestionView$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotSuggestionView(UiAvatar uiAvatar, String str, ClientKickoffParams clientKickoffParams, String str2, Category category, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = uiAvatar;
        this.title = str;
        this.chat_params = clientKickoffParams;
        this.tip = str2;
        this.category = category;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneybotSuggestionView)) {
            return false;
        }
        MoneybotSuggestionView moneybotSuggestionView = (MoneybotSuggestionView) obj;
        return Intrinsics.areEqual(unknownFields(), moneybotSuggestionView.unknownFields()) && Intrinsics.areEqual(this.avatar, moneybotSuggestionView.avatar) && Intrinsics.areEqual(this.title, moneybotSuggestionView.title) && Intrinsics.areEqual(this.chat_params, moneybotSuggestionView.chat_params) && Intrinsics.areEqual(this.tip, moneybotSuggestionView.tip) && this.category == moneybotSuggestionView.category;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ClientKickoffParams clientKickoffParams = this.chat_params;
        int hashCode4 = (hashCode3 + (clientKickoffParams != null ? clientKickoffParams.hashCode() : 0)) * 37;
        String str2 = this.tip;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Category category = this.category;
        int hashCode6 = hashCode5 + (category != null ? category.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(22);
        builder.icon = this.avatar;
        builder.title = this.title;
        builder.subtitle = this.chat_params;
        builder.action = this.tip;
        builder.icon_background_color = this.category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        ClientKickoffParams clientKickoffParams = this.chat_params;
        if (clientKickoffParams != null) {
            arrayList.add("chat_params=" + clientKickoffParams);
        }
        String str2 = this.tip;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "tip=", arrayList);
        }
        Category category = this.category;
        if (category != null) {
            arrayList.add("category=" + category);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneybotSuggestionView{", "}", 0, null, null, 56);
    }
}
