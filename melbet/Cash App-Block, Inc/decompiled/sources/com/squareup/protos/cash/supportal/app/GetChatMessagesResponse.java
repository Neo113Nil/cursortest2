package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/GetChatMessagesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/taply/app/v1/Allowed$Builder;", "Builder", "Conversation", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetChatMessagesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetChatMessagesResponse> CREATOR;
    public final Conversation active_conversation;
    public final List messages;
    public final Boolean more_after;
    public final Boolean more_before;

    public final class Conversation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Conversation> CREATOR;
        public final BotStatus bot_status;

        public enum BotStatus implements WireEnum {
            UNKNOWN(0),
            READY(1),
            ACTIVE(2),
            HANDED_OVER(3);

            public static final GetChatMessagesResponse$Conversation$BotStatus$Companion$ADAPTER$1 ADAPTER;
            public static final PoolVisibility.Companion Companion;
            public final int value;

            static {
                BotStatus botStatus = UNKNOWN;
                Companion = new PoolVisibility.Companion();
                ADAPTER = new GetChatMessagesResponse$Conversation$BotStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BotStatus.class), Syntax.PROTO_2, botStatus);
            }

            BotStatus(int i) {
                this.value = i;
            }

            public static final BotStatus fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return READY;
                }
                if (i == 2) {
                    return ACTIVE;
                }
                if (i != 3) {
                    return null;
                }
                return HANDED_OVER;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            GetChatMessagesResponse$Conversation$Companion$ADAPTER$1 getChatMessagesResponse$Conversation$Companion$ADAPTER$1 = new GetChatMessagesResponse$Conversation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Conversation.class), "type.googleapis.com/squareup.cash.supportal.app.GetChatMessagesResponse.Conversation", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = getChatMessagesResponse$Conversation$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getChatMessagesResponse$Conversation$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conversation(BotStatus botStatus, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.bot_status = botStatus;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Conversation)) {
                return false;
            }
            Conversation conversation = (Conversation) obj;
            return Intrinsics.areEqual(unknownFields(), conversation.unknownFields()) && this.bot_status == conversation.bot_status;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            BotStatus botStatus = this.bot_status;
            int hashCode2 = hashCode + (botStatus != null ? botStatus.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(27);
            builder.pool_lifecycle_filter = this.bot_status;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BotStatus botStatus = this.bot_status;
            if (botStatus != null) {
                arrayList.add("bot_status=" + botStatus);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Conversation{", "}", 0, null, null, 56);
        }
    }

    static {
        GetChatMessagesResponse$Companion$ADAPTER$1 getChatMessagesResponse$Companion$ADAPTER$1 = new GetChatMessagesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetChatMessagesResponse.class), "type.googleapis.com/squareup.cash.supportal.app.GetChatMessagesResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = getChatMessagesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getChatMessagesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatMessagesResponse(List list, Boolean bool, Boolean bool2, Conversation conversation, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.more_before = bool;
        this.more_after = bool2;
        this.active_conversation = conversation;
        this.messages = TransactorKt.immutableCopyOf("messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetChatMessagesResponse)) {
            return false;
        }
        GetChatMessagesResponse getChatMessagesResponse = (GetChatMessagesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getChatMessagesResponse.unknownFields()) && Intrinsics.areEqual(this.messages, getChatMessagesResponse.messages) && Intrinsics.areEqual(this.more_before, getChatMessagesResponse.more_before) && Intrinsics.areEqual(this.more_after, getChatMessagesResponse.more_after) && Intrinsics.areEqual(this.active_conversation, getChatMessagesResponse.active_conversation);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.messages);
        Boolean bool = this.more_before;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.more_after;
        int hashCode2 = (hashCode + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Conversation conversation = this.active_conversation;
        int hashCode3 = hashCode2 + (conversation != null ? conversation.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(23);
        builder.card_encryption_data = this.messages;
        builder.customer_token_hash_email = this.more_before;
        builder.device_metadata = this.more_after;
        builder.success_screen = this.active_conversation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.messages;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("messages=", arrayList, list);
        }
        Boolean bool = this.more_before;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("more_before=", bool, arrayList);
        }
        Boolean bool2 = this.more_after;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("more_after=", bool2, arrayList);
        }
        Conversation conversation = this.active_conversation;
        if (conversation != null) {
            arrayList.add("active_conversation=" + conversation);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetChatMessagesResponse{", "}", 0, null, null, 56);
    }
}
