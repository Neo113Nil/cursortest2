package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjv;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.ExpenseSlice;
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
public final class PopupMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PopupMessage> CREATOR;
    public final String message_subtitle;
    public final String message_title;
    public final Placement placement;
    public final AppMessageAction primary_navigation_action;
    public final AppMessageAction secondary_navigation_action;
    public final zzjv visualAsset;

    /* loaded from: classes.dex */
    public enum Placement implements WireEnum {
        BALANCE_TAB(1),
        CARD_TAB(2),
        PAYMENT_PAD_TAB(3),
        INVESTING_TAB(4),
        ACTIVITY_TAB(5),
        BITCOIN_TAB(6),
        OFFERS_TAB(7),
        DISCOVER_TAB(8),
        LOCAL_TAB(9);

        public final int value;
        public static final AsyncTimeout.Companion Companion = new AsyncTimeout.Companion();
        public static final PopupMessage$Placement$Companion$ADAPTER$1 ADAPTER = new PopupMessage$Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);

        Placement(int i) {
            this.value = i;
        }

        public static final Placement fromValue(int i) {
            Companion.getClass();
            return AsyncTimeout.Companion.m4327fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PopupMessage$Companion$ADAPTER$1 popupMessage$Companion$ADAPTER$1 = new PopupMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PopupMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.PopupMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = popupMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(popupMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMessage(Placement placement, zzjv zzjvVar, String str, String str2, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placement = placement;
        this.visualAsset = zzjvVar;
        this.message_title = str;
        this.message_subtitle = str2;
        this.primary_navigation_action = appMessageAction;
        this.secondary_navigation_action = appMessageAction2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PopupMessage)) {
            return false;
        }
        PopupMessage popupMessage = (PopupMessage) obj;
        return Intrinsics.areEqual(unknownFields(), popupMessage.unknownFields()) && this.placement == popupMessage.placement && Intrinsics.areEqual(this.visualAsset, popupMessage.visualAsset) && Intrinsics.areEqual(this.message_title, popupMessage.message_title) && Intrinsics.areEqual(this.message_subtitle, popupMessage.message_subtitle) && Intrinsics.areEqual(this.primary_navigation_action, popupMessage.primary_navigation_action) && Intrinsics.areEqual(this.secondary_navigation_action, popupMessage.secondary_navigation_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        zzjv zzjvVar = this.visualAsset;
        int hashCode3 = (hashCode2 + (zzjvVar != null ? zzjvVar.hashCode() : 0)) * 37;
        String str = this.message_title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_subtitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_navigation_action;
        int hashCode6 = (hashCode5 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        int hashCode7 = hashCode6 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(19);
        builder.requester = this.placement;
        builder.responder = this.visualAsset;
        builder.slice_token = this.message_title;
        builder.amount = this.message_subtitle;
        builder.status = this.primary_navigation_action;
        builder.action = this.secondary_navigation_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        zzjv zzjvVar = this.visualAsset;
        if (zzjvVar != null) {
            arrayList.add("visualAsset=" + zzjvVar);
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
        AppMessageAction appMessageAction2 = this.secondary_navigation_action;
        if (appMessageAction2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_navigation_action=", appMessageAction2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PopupMessage{", "}", 0, null, null, 56);
    }
}
