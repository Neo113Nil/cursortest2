package com.squareup.protos.franklin.investing;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.investing.UpdateInvestmentHoldingRequest;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateInvestmentHoldingRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateInvestmentHoldingRequest> CREATOR;
    public final Action action;
    public final String investment_entity_token;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public enum Action implements WireEnum {
        FOLLOW(1),
        UNFOLLOW(2);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final UpdateInvestmentHoldingRequest$Action$Companion$ADAPTER$1 ADAPTER = new UpdateInvestmentHoldingRequest$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return FOLLOW;
            }
            if (i != 2) {
                return null;
            }
            return UNFOLLOW;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateInvestmentHoldingRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.investing.UpdateInvestmentHoldingRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateInvestmentHoldingRequest((RequestContext) obj, (String) obj2, (UpdateInvestmentHoldingRequest.Action) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = UpdateInvestmentHoldingRequest.Action.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest = (UpdateInvestmentHoldingRequest) obj;
                reverseProtoWriter.getClass();
                updateInvestmentHoldingRequest.getClass();
                reverseProtoWriter.writeBytes(updateInvestmentHoldingRequest.unknownFields());
                UpdateInvestmentHoldingRequest.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, updateInvestmentHoldingRequest.action);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, updateInvestmentHoldingRequest.investment_entity_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateInvestmentHoldingRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest = (UpdateInvestmentHoldingRequest) obj;
                updateInvestmentHoldingRequest.getClass();
                return UpdateInvestmentHoldingRequest.Action.ADAPTER.encodedSizeWithTag(3, updateInvestmentHoldingRequest.action) + ProtoAdapter.STRING.encodedSizeWithTag(2, updateInvestmentHoldingRequest.investment_entity_token) + RequestContext.ADAPTER.encodedSizeWithTag(1, updateInvestmentHoldingRequest.request_context) + updateInvestmentHoldingRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest = (UpdateInvestmentHoldingRequest) obj;
                updateInvestmentHoldingRequest.getClass();
                RequestContext requestContext = updateInvestmentHoldingRequest.request_context;
                return UpdateInvestmentHoldingRequest.copy$default(updateInvestmentHoldingRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest = (UpdateInvestmentHoldingRequest) obj;
                updateInvestmentHoldingRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, updateInvestmentHoldingRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateInvestmentHoldingRequest.investment_entity_token);
                UpdateInvestmentHoldingRequest.Action.ADAPTER.encodeWithTag(protoWriter, 3, updateInvestmentHoldingRequest.action);
                protoWriter.writeBytes(updateInvestmentHoldingRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInvestmentHoldingRequest(RequestContext requestContext, String str, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.investment_entity_token = str;
        this.action = action;
    }

    public static UpdateInvestmentHoldingRequest copy$default(UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = updateInvestmentHoldingRequest.investment_entity_token;
        Action action = updateInvestmentHoldingRequest.action;
        if ((i & 8) != 0) {
            byteString = updateInvestmentHoldingRequest.unknownFields();
        }
        updateInvestmentHoldingRequest.getClass();
        byteString.getClass();
        return new UpdateInvestmentHoldingRequest(requestContext, str, action, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateInvestmentHoldingRequest)) {
            return false;
        }
        UpdateInvestmentHoldingRequest updateInvestmentHoldingRequest = (UpdateInvestmentHoldingRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateInvestmentHoldingRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, updateInvestmentHoldingRequest.request_context) && Intrinsics.areEqual(this.investment_entity_token, updateInvestmentHoldingRequest.investment_entity_token) && this.action == updateInvestmentHoldingRequest.action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.investment_entity_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode4 = hashCode3 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(3);
        builder.localizable_label = this.request_context;
        builder.label = this.investment_entity_token;
        builder.client_scenario = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateInvestmentHoldingRequest{", "}", 0, null, null, 56);
    }
}
