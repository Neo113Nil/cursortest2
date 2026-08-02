package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.app.MultiCurrencyPaymentReviewRequest;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class MultiCurrencyPaymentReviewRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MultiCurrencyPaymentReviewRequest> CREATOR;
    public final RequestContext request_context;
    public final Action selected_action;

    /* loaded from: classes8.dex */
    public enum Action implements WireEnum {
        EDIT_AMOUNT(1),
        EDIT_RECIPIENT_INFO(2),
        EDIT_DELIVERY_METHOD(3),
        ACCEPT(4),
        DRAWER_PRIMARY(5),
        DRAWER_SECONDARY(6),
        EDIT_SCHEDULE(7);

        public final int value;
        public static final TransactionType.Companion Companion = new TransactionType.Companion();
        public static final MultiCurrencyPaymentReviewRequest$Action$Companion$ADAPTER$1 ADAPTER = new MultiCurrencyPaymentReviewRequest$Action$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Action.class), Syntax.PROTO_2, null);

        Action(int i) {
            this.value = i;
        }

        public static final Action fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return EDIT_AMOUNT;
                case 2:
                    return EDIT_RECIPIENT_INFO;
                case 3:
                    return EDIT_DELIVERY_METHOD;
                case 4:
                    return ACCEPT;
                case 5:
                    return DRAWER_PRIMARY;
                case 6:
                    return DRAWER_SECONDARY;
                case 7:
                    return EDIT_SCHEDULE;
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
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MultiCurrencyPaymentReviewRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.MultiCurrencyPaymentReviewRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new MultiCurrencyPaymentReviewRequest((RequestContext) obj, (MultiCurrencyPaymentReviewRequest.Action) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = MultiCurrencyPaymentReviewRequest.Action.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                MultiCurrencyPaymentReviewRequest multiCurrencyPaymentReviewRequest = (MultiCurrencyPaymentReviewRequest) obj;
                reverseProtoWriter.getClass();
                multiCurrencyPaymentReviewRequest.getClass();
                reverseProtoWriter.writeBytes(multiCurrencyPaymentReviewRequest.unknownFields());
                MultiCurrencyPaymentReviewRequest.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, multiCurrencyPaymentReviewRequest.selected_action);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, multiCurrencyPaymentReviewRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                MultiCurrencyPaymentReviewRequest multiCurrencyPaymentReviewRequest = (MultiCurrencyPaymentReviewRequest) obj;
                multiCurrencyPaymentReviewRequest.getClass();
                return MultiCurrencyPaymentReviewRequest.Action.ADAPTER.encodedSizeWithTag(2, multiCurrencyPaymentReviewRequest.selected_action) + RequestContext.ADAPTER.encodedSizeWithTag(1, multiCurrencyPaymentReviewRequest.request_context) + multiCurrencyPaymentReviewRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                MultiCurrencyPaymentReviewRequest multiCurrencyPaymentReviewRequest = (MultiCurrencyPaymentReviewRequest) obj;
                multiCurrencyPaymentReviewRequest.getClass();
                RequestContext requestContext = multiCurrencyPaymentReviewRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                MultiCurrencyPaymentReviewRequest.Action action = multiCurrencyPaymentReviewRequest.selected_action;
                byteString.getClass();
                return new MultiCurrencyPaymentReviewRequest(requestContext2, action, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                MultiCurrencyPaymentReviewRequest multiCurrencyPaymentReviewRequest = (MultiCurrencyPaymentReviewRequest) obj;
                multiCurrencyPaymentReviewRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, multiCurrencyPaymentReviewRequest.request_context);
                MultiCurrencyPaymentReviewRequest.Action.ADAPTER.encodeWithTag(protoWriter, 2, multiCurrencyPaymentReviewRequest.selected_action);
                protoWriter.writeBytes(multiCurrencyPaymentReviewRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCurrencyPaymentReviewRequest(RequestContext requestContext, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.selected_action = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiCurrencyPaymentReviewRequest)) {
            return false;
        }
        MultiCurrencyPaymentReviewRequest multiCurrencyPaymentReviewRequest = (MultiCurrencyPaymentReviewRequest) obj;
        return Intrinsics.areEqual(unknownFields(), multiCurrencyPaymentReviewRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, multiCurrencyPaymentReviewRequest.request_context) && this.selected_action == multiCurrencyPaymentReviewRequest.selected_action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Action action = this.selected_action;
        int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(20);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.selected_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Action action = this.selected_action;
        if (action != null) {
            arrayList.add("selected_action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiCurrencyPaymentReviewRequest{", "}", 0, null, null, 56);
    }
}
