package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class TooltipMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TooltipMessage> CREATOR;
    public final ArrowPosition arrow_position;
    public final Placement placement;
    public final AppMessageAction tooltip;

    /* loaded from: classes.dex */
    public enum ArrowPosition implements WireEnum {
        TOP_LEFT(1),
        TOP_CENTER(2),
        TOP_RIGHT(3),
        BOTTOM_RIGHT(4),
        BOTTOM_CENTER(5),
        BOTTOM_LEFT(6);

        public final int value;
        public static final ByteString.Companion Companion = new ByteString.Companion();
        public static final TooltipMessage$ArrowPosition$Companion$ADAPTER$1 ADAPTER = new TooltipMessage$ArrowPosition$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ArrowPosition.class), Syntax.PROTO_2, null);

        ArrowPosition(int i) {
            this.value = i;
        }

        public static final ArrowPosition fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return TOP_LEFT;
                case 2:
                    return TOP_CENTER;
                case 3:
                    return TOP_RIGHT;
                case 4:
                    return BOTTOM_RIGHT;
                case 5:
                    return BOTTOM_CENTER;
                case 6:
                    return BOTTOM_LEFT;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TooltipMessage$Companion$ADAPTER$1 tooltipMessage$Companion$ADAPTER$1 = new TooltipMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TooltipMessage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.TooltipMessage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = tooltipMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tooltipMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipMessage(Placement placement, AppMessageAction appMessageAction, ArrowPosition arrowPosition, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placement = placement;
        this.tooltip = appMessageAction;
        this.arrow_position = arrowPosition;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TooltipMessage)) {
            return false;
        }
        TooltipMessage tooltipMessage = (TooltipMessage) obj;
        return Intrinsics.areEqual(unknownFields(), tooltipMessage.unknownFields()) && this.placement == tooltipMessage.placement && Intrinsics.areEqual(this.tooltip, tooltipMessage.tooltip) && this.arrow_position == tooltipMessage.arrow_position;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        AppMessageAction appMessageAction = this.tooltip;
        int hashCode3 = (hashCode2 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        ArrowPosition arrowPosition = this.arrow_position;
        int hashCode4 = hashCode3 + (arrowPosition != null ? arrowPosition.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(15, false);
        builder.advertisement_data = this.placement;
        builder.transmission_level = this.tooltip;
        builder.frequency = this.arrow_position;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        AppMessageAction appMessageAction = this.tooltip;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tooltip=", appMessageAction, arrayList);
        }
        ArrowPosition arrowPosition = this.arrow_position;
        if (arrowPosition != null) {
            arrayList.add("arrow_position=" + arrowPosition);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TooltipMessage{", "}", 0, null, null, 56);
    }
}
