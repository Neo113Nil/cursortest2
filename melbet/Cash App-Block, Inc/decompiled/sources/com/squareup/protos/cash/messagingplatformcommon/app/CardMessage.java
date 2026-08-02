package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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
import okio.AsyncTimeout;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardMessage> CREATOR;
    public final String message_subtitle;
    public final String message_title;
    public final Placement placement;
    public final AppMessageAction primary_navigation_action;
    public final ActionEvent.Os.Companion visualAsset;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Placement implements WireEnum {
        public static final /* synthetic */ Placement[] $VALUES;
        public static final Placement ACTIVITY_TAB;
        public static final CardMessage$Placement$Companion$ADAPTER$1 ADAPTER;
        public static final AsyncTimeout.Companion Companion;

        static {
            Placement placement = new Placement("ACTIVITY_TAB", 0);
            ACTIVITY_TAB = placement;
            $VALUES = new Placement[]{placement};
            Companion = new AsyncTimeout.Companion();
            ADAPTER = new CardMessage$Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);
        }

        public static final Placement fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ACTIVITY_TAB;
            }
            return null;
        }

        public static Placement valueOf(String str) {
            return (Placement) Enum.valueOf(Placement.class, str);
        }

        public static Placement[] values() {
            return (Placement[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    static {
        CardMessage$Companion$ADAPTER$1 cardMessage$Companion$ADAPTER$1 = new CardMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.CardMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = cardMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardMessage(Placement placement, ActionEvent.Os.Companion companion, String str, String str2, AppMessageAction appMessageAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placement = placement;
        this.visualAsset = companion;
        this.message_title = str;
        this.message_subtitle = str2;
        this.primary_navigation_action = appMessageAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardMessage)) {
            return false;
        }
        CardMessage cardMessage = (CardMessage) obj;
        return Intrinsics.areEqual(unknownFields(), cardMessage.unknownFields()) && this.placement == cardMessage.placement && Intrinsics.areEqual(this.visualAsset, cardMessage.visualAsset) && Intrinsics.areEqual(this.message_title, cardMessage.message_title) && Intrinsics.areEqual(this.message_subtitle, cardMessage.message_subtitle) && Intrinsics.areEqual(this.primary_navigation_action, cardMessage.primary_navigation_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        ActionEvent.Os.Companion companion = this.visualAsset;
        int hashCode3 = (hashCode2 + (companion != null ? companion.hashCode() : 0)) * 37;
        String str = this.message_title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_subtitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_navigation_action;
        int hashCode6 = hashCode5 + (appMessageAction != null ? appMessageAction.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(19);
        builder.icon = this.placement;
        builder.title = this.visualAsset;
        builder.subtitle = this.message_title;
        builder.action = this.message_subtitle;
        builder.icon_background_color = this.primary_navigation_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        ActionEvent.Os.Companion companion = this.visualAsset;
        if (companion != null) {
            arrayList.add("visualAsset=" + companion);
        }
        String str = this.message_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_title=", arrayList);
        }
        String str2 = this.message_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_subtitle=", arrayList);
        }
        AppMessageAction appMessageAction = this.primary_navigation_action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_navigation_action=", appMessageAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CardMessage{", "}", 0, null, null, 56);
    }
}
