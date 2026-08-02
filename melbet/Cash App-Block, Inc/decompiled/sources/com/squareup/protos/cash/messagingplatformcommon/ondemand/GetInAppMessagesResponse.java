package com.squareup.protos.cash.messagingplatformcommon.ondemand;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/messagingplatformcommon/ondemand/GetInAppMessagesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/content/MoneyTab$Builder;", "Builder", "PlacementToMessages", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetInAppMessagesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInAppMessagesResponse> CREATOR;
    public final List placements_to_messages;

    public final class PlacementToMessages extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PlacementToMessages> CREATOR;
        public final List messages;
        public final Placement placement;

        static {
            GetInAppMessagesResponse$PlacementToMessages$Companion$ADAPTER$1 getInAppMessagesResponse$PlacementToMessages$Companion$ADAPTER$1 = new GetInAppMessagesResponse$PlacementToMessages$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PlacementToMessages.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.ondemand.GetInAppMessagesResponse.PlacementToMessages", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/ondemand/InAppMessageServiceProto.proto");
            ADAPTER = getInAppMessagesResponse$PlacementToMessages$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getInAppMessagesResponse$PlacementToMessages$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlacementToMessages(Placement placement, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.placement = placement;
            this.messages = TransactorKt.immutableCopyOf("messages", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlacementToMessages)) {
                return false;
            }
            PlacementToMessages placementToMessages = (PlacementToMessages) obj;
            return Intrinsics.areEqual(unknownFields(), placementToMessages.unknownFields()) && this.placement == placementToMessages.placement && Intrinsics.areEqual(this.messages, placementToMessages.messages);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Placement placement = this.placement;
            int hashCode2 = this.messages.hashCode() + ((hashCode + (placement != null ? placement.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            InputValue.Builder builder = new InputValue.Builder(25);
            builder.input_id = this.placement;
            builder.value = this.messages;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Placement placement = this.placement;
            if (placement != null) {
                arrayList.add("placement=" + placement);
            }
            List list = this.messages;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("messages=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PlacementToMessages{", "}", 0, null, null, 56);
        }
    }

    static {
        GetInAppMessagesResponse$Companion$ADAPTER$1 getInAppMessagesResponse$Companion$ADAPTER$1 = new GetInAppMessagesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInAppMessagesResponse.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.ondemand.GetInAppMessagesResponse", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/ondemand/InAppMessageServiceProto.proto");
        ADAPTER = getInAppMessagesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInAppMessagesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInAppMessagesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.placements_to_messages = TransactorKt.immutableCopyOf("placements_to_messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInAppMessagesResponse)) {
            return false;
        }
        GetInAppMessagesResponse getInAppMessagesResponse = (GetInAppMessagesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInAppMessagesResponse.unknownFields()) && Intrinsics.areEqual(this.placements_to_messages, getInAppMessagesResponse.placements_to_messages);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.placements_to_messages.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(21, false);
        builder.applets = this.placements_to_messages;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.placements_to_messages;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("placements_to_messages=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInAppMessagesResponse{", "}", 0, null, null, 56);
    }
}
