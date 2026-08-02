package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.ui.Color;
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
public final class FullScreenMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FullScreenMessage> CREATOR;
    public final Placement placement;
    public final AppMessageAction primary_action;
    public final Color primary_button_accent_color;
    public final AppMessageAction secondary_action;
    public final Color secondary_button_accent_color;
    public final FullScreenMessage$VisualAsset$Video visualAsset;

    /* loaded from: classes.dex */
    public enum Placement implements WireEnum {
        BALANCE_TAB(1),
        PAYMENT_PAD_TAB(2);

        public final int value;
        public static final ByteString.Companion Companion = new ByteString.Companion();
        public static final FullScreenMessage$Placement$Companion$ADAPTER$1 ADAPTER = new FullScreenMessage$Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);

        Placement(int i) {
            this.value = i;
        }

        public static final Placement fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BALANCE_TAB;
            }
            if (i != 2) {
                return null;
            }
            return PAYMENT_PAD_TAB;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FullScreenMessage$Companion$ADAPTER$1 fullScreenMessage$Companion$ADAPTER$1 = new FullScreenMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FullScreenMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.FullScreenMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = fullScreenMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fullScreenMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenMessage(FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video, AppMessageAction appMessageAction, AppMessageAction appMessageAction2, Color color, Color color2, Placement placement, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.visualAsset = fullScreenMessage$VisualAsset$Video;
        this.primary_action = appMessageAction;
        this.secondary_action = appMessageAction2;
        this.primary_button_accent_color = color;
        this.secondary_button_accent_color = color2;
        this.placement = placement;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullScreenMessage)) {
            return false;
        }
        FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
        return Intrinsics.areEqual(unknownFields(), fullScreenMessage.unknownFields()) && Intrinsics.areEqual(this.visualAsset, fullScreenMessage.visualAsset) && Intrinsics.areEqual(this.primary_action, fullScreenMessage.primary_action) && Intrinsics.areEqual(this.secondary_action, fullScreenMessage.secondary_action) && Intrinsics.areEqual(this.primary_button_accent_color, fullScreenMessage.primary_button_accent_color) && Intrinsics.areEqual(this.secondary_button_accent_color, fullScreenMessage.secondary_button_accent_color) && this.placement == fullScreenMessage.placement;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = this.visualAsset;
        int hashCode2 = (hashCode + (fullScreenMessage$VisualAsset$Video != null ? fullScreenMessage$VisualAsset$Video.value.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.primary_action;
        int hashCode3 = (hashCode2 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction2 = this.secondary_action;
        int hashCode4 = (hashCode3 + (appMessageAction2 != null ? appMessageAction2.hashCode() : 0)) * 37;
        Color color = this.primary_button_accent_color;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.secondary_button_accent_color;
        int hashCode6 = (hashCode5 + (color2 != null ? color2.hashCode() : 0)) * 37;
        Placement placement = this.placement;
        int hashCode7 = hashCode6 + (placement != null ? placement.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(18);
        builder.requester = this.visualAsset;
        builder.responder = this.primary_action;
        builder.amount = this.secondary_action;
        builder.status = this.primary_button_accent_color;
        builder.slice_token = this.secondary_button_accent_color;
        builder.action = this.placement;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FullScreenMessage$VisualAsset$Video fullScreenMessage$VisualAsset$Video = this.visualAsset;
        if (fullScreenMessage$VisualAsset$Video != null) {
            arrayList.add("visualAsset=" + fullScreenMessage$VisualAsset$Video);
        }
        AppMessageAction appMessageAction = this.primary_action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("primary_action=", appMessageAction, arrayList);
        }
        AppMessageAction appMessageAction2 = this.secondary_action;
        if (appMessageAction2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("secondary_action=", appMessageAction2, arrayList);
        }
        Color color = this.primary_button_accent_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_button_accent_color=", color, arrayList);
        }
        Color color2 = this.secondary_button_accent_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_button_accent_color=", color2, arrayList);
        }
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FullScreenMessage{", "}", 0, null, null, 56);
    }
}
