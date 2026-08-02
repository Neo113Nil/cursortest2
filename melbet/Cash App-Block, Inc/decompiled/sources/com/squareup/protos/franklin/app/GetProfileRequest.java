package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.cash.spendinginsights.appapi.BillsSubscriptionsHomeUiConfig;
import com.squareup.protos.cash.supportal.app.CancelOutboundPhoneRequest;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.supportal.app.EndChatRequest;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.protos.cash.supportal.app.OpenChatResponse;
import com.squareup.protos.cash.supportal.app.SendChatMessagesResponse;
import com.squareup.protos.cash.supportal.app.SendUserTypingRequest;
import com.squareup.protos.cash.supportal.app.SendUserTypingResponse;
import com.squareup.protos.cash.supportal.app.SupportChatStatusRequest;
import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusRequest;
import com.squareup.protos.cash.treelot.app.TreehouseConfigRequest;
import com.squareup.protos.cash.unicorn.dismiss_badge.DismissBadgeResponse;
import com.squareup.protos.client.timecards.UpdateTimecardNotesResponse;
import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetProfileRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetProfileRequest> CREATOR;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetProfileRequest(buildUnknownFields());
                case 1:
                    return new BillsSubscriptionsHomeUiConfig(buildUnknownFields());
                case 2:
                    return new CancelOutboundPhoneRequest(buildUnknownFields());
                case 3:
                    return new ChatMessage.Bot(buildUnknownFields());
                case 4:
                    return new ChatMessage.ChatSystem(buildUnknownFields());
                case 5:
                    return new ChatMessage.Customer(buildUnknownFields());
                case 6:
                    return new EndChatRequest(buildUnknownFields());
                case 7:
                    return new GetChatMessagesRequest.RecentHistory(buildUnknownFields());
                case 8:
                    return new OpenChatResponse.Allowed(buildUnknownFields());
                case 9:
                    return new OpenChatResponse.Denied(buildUnknownFields());
                case 10:
                    return new SendChatMessagesResponse(buildUnknownFields());
                case 11:
                    return new SendUserTypingRequest(buildUnknownFields());
                case 12:
                    return new SendUserTypingResponse(buildUnknownFields());
                case 13:
                    return new SupportChatStatusRequest(buildUnknownFields());
                case 14:
                    return new SupportChatStatusResponse.Denied(buildUnknownFields());
                case 15:
                    return new SupportPhoneStatusRequest(buildUnknownFields());
                case 16:
                    return new TreehouseConfigRequest(buildUnknownFields());
                case 17:
                    return new DismissBadgeResponse(buildUnknownFields());
                case 18:
                    return new UpdateTimecardNotesResponse(buildUnknownFields());
                case 19:
                    return new CheckVersionRequest(buildUnknownFields());
                case 20:
                    return new CloseAccountResponse(buildUnknownFields());
                case 21:
                    return new GetAppConfigRequest(buildUnknownFields());
                case 22:
                    return new GetBoostConfigRequest(buildUnknownFields());
                case 23:
                    return new GetFeatureFlagsRequest(buildUnknownFields());
                case 24:
                    return new GetRewardStatusRequest(buildUnknownFields());
                case 25:
                    return new GetRewardsRequest(buildUnknownFields());
                case 26:
                    return new GetWebLoginConfigRequest(buildUnknownFields());
                case 27:
                    return new RegisterAppMessageActionResponse(buildUnknownFields());
                case 28:
                    return new SelectTransferOptionRequest.BackAction(buildUnknownFields());
                default:
                    return new TriggerBalanceCheckResponse(buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetProfileRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.GetProfileRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetProfileRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    protoReader.readUnknownField(nextTag);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetProfileRequest getProfileRequest = (GetProfileRequest) obj;
                reverseProtoWriter.getClass();
                getProfileRequest.getClass();
                reverseProtoWriter.writeBytes(getProfileRequest.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetProfileRequest getProfileRequest = (GetProfileRequest) obj;
                getProfileRequest.getClass();
                return getProfileRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((GetProfileRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetProfileRequest(byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetProfileRequest getProfileRequest = (GetProfileRequest) obj;
                getProfileRequest.getClass();
                protoWriter.writeBytes(getProfileRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetProfileRequest) && Intrinsics.areEqual(unknownFields(), ((GetProfileRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "GetProfileRequest{}";
    }
}
