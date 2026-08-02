package com.squareup.protos.cash.p2pencoreedge.plasma;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetRecurringPaymentPreferencesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetRecurringPaymentPreferencesRequest> CREATOR;
    public final RecurringPaymentBlocker.Button.Action action;
    public final Money amount;
    public final RequestContext request_context;
    public final RecurringPaymentBlocker.Schedule schedule;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public RecurringPaymentBlocker.Button.Action action;
        public Money amount;
        public RequestContext request_context;
        public RecurringPaymentBlocker.Schedule schedule;

        @Override // com.squareup.wire.Message.Builder
        public final SetRecurringPaymentPreferencesRequest build() {
            return new SetRecurringPaymentPreferencesRequest(this.request_context, this.action, this.schedule, this.amount, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetRecurringPaymentPreferencesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.p2pencoreedge.plasma.SetRecurringPaymentPreferencesRequest$Companion$ADAPTER$1
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
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetRecurringPaymentPreferencesRequest((RequestContext) obj, (RecurringPaymentBlocker.Button.Action) obj2, (RecurringPaymentBlocker.Schedule) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = RecurringPaymentBlocker.Button.Action.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(RecurringPaymentBlocker.Schedule.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetRecurringPaymentPreferencesRequest setRecurringPaymentPreferencesRequest = (SetRecurringPaymentPreferencesRequest) obj;
                reverseProtoWriter.getClass();
                setRecurringPaymentPreferencesRequest.getClass();
                reverseProtoWriter.writeBytes(setRecurringPaymentPreferencesRequest.unknownFields());
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, setRecurringPaymentPreferencesRequest.amount);
                RecurringPaymentBlocker.Schedule.ADAPTER.encodeWithTag(reverseProtoWriter, 3, setRecurringPaymentPreferencesRequest.schedule);
                RecurringPaymentBlocker.Button.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setRecurringPaymentPreferencesRequest.action);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setRecurringPaymentPreferencesRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetRecurringPaymentPreferencesRequest setRecurringPaymentPreferencesRequest = (SetRecurringPaymentPreferencesRequest) obj;
                setRecurringPaymentPreferencesRequest.getClass();
                return Money.ADAPTER.encodedSizeWithTag(4, setRecurringPaymentPreferencesRequest.amount) + RecurringPaymentBlocker.Schedule.ADAPTER.encodedSizeWithTag(3, setRecurringPaymentPreferencesRequest.schedule) + RecurringPaymentBlocker.Button.Action.ADAPTER.encodedSizeWithTag(2, setRecurringPaymentPreferencesRequest.action) + RequestContext.ADAPTER.encodedSizeWithTag(1, setRecurringPaymentPreferencesRequest.request_context) + setRecurringPaymentPreferencesRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetRecurringPaymentPreferencesRequest setRecurringPaymentPreferencesRequest = (SetRecurringPaymentPreferencesRequest) obj;
                setRecurringPaymentPreferencesRequest.getClass();
                RequestContext requestContext = setRecurringPaymentPreferencesRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                RecurringPaymentBlocker.Schedule schedule = setRecurringPaymentPreferencesRequest.schedule;
                RecurringPaymentBlocker.Schedule schedule2 = schedule != null ? (RecurringPaymentBlocker.Schedule) RecurringPaymentBlocker.Schedule.ADAPTER.redact(schedule) : null;
                Money money = setRecurringPaymentPreferencesRequest.amount;
                return SetRecurringPaymentPreferencesRequest.copy$default(setRecurringPaymentPreferencesRequest, requestContext2, schedule2, money != null ? (Money) Money.ADAPTER.redact(money) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetRecurringPaymentPreferencesRequest setRecurringPaymentPreferencesRequest = (SetRecurringPaymentPreferencesRequest) obj;
                setRecurringPaymentPreferencesRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setRecurringPaymentPreferencesRequest.request_context);
                RecurringPaymentBlocker.Button.Action.ADAPTER.encodeWithTag(protoWriter, 2, setRecurringPaymentPreferencesRequest.action);
                RecurringPaymentBlocker.Schedule.ADAPTER.encodeWithTag(protoWriter, 3, setRecurringPaymentPreferencesRequest.schedule);
                Money.ADAPTER.encodeWithTag(protoWriter, 4, setRecurringPaymentPreferencesRequest.amount);
                protoWriter.writeBytes(setRecurringPaymentPreferencesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRecurringPaymentPreferencesRequest(RequestContext requestContext, RecurringPaymentBlocker.Button.Action action, RecurringPaymentBlocker.Schedule schedule, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.action = action;
        this.schedule = schedule;
        this.amount = money;
    }

    public static SetRecurringPaymentPreferencesRequest copy$default(SetRecurringPaymentPreferencesRequest setRecurringPaymentPreferencesRequest, RequestContext requestContext, RecurringPaymentBlocker.Schedule schedule, Money money, ByteString byteString, int i) {
        RecurringPaymentBlocker.Schedule schedule2 = schedule;
        RecurringPaymentBlocker.Button.Action action = setRecurringPaymentPreferencesRequest.action;
        if ((i & 4) != 0) {
            schedule2 = setRecurringPaymentPreferencesRequest.schedule;
        }
        if ((i & 8) != 0) {
            money = setRecurringPaymentPreferencesRequest.amount;
        }
        if ((i & 16) != 0) {
            byteString = setRecurringPaymentPreferencesRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        setRecurringPaymentPreferencesRequest.getClass();
        byteString2.getClass();
        return new SetRecurringPaymentPreferencesRequest(requestContext, action, schedule2, money, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetRecurringPaymentPreferencesRequest)) {
            return false;
        }
        SetRecurringPaymentPreferencesRequest setRecurringPaymentPreferencesRequest = (SetRecurringPaymentPreferencesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setRecurringPaymentPreferencesRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setRecurringPaymentPreferencesRequest.request_context) && this.action == setRecurringPaymentPreferencesRequest.action && Intrinsics.areEqual(this.schedule, setRecurringPaymentPreferencesRequest.schedule) && Intrinsics.areEqual(this.amount, setRecurringPaymentPreferencesRequest.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        RecurringPaymentBlocker.Button.Action action = this.action;
        int hashCode3 = (hashCode2 + (action != null ? action.hashCode() : 0)) * 37;
        RecurringPaymentBlocker.Schedule schedule = this.schedule;
        int hashCode4 = (hashCode3 + (schedule != null ? schedule.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.request_context = this.request_context;
        builder.action = this.action;
        builder.schedule = this.schedule;
        builder.amount = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        RecurringPaymentBlocker.Button.Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        RecurringPaymentBlocker.Schedule schedule = this.schedule;
        if (schedule != null) {
            arrayList.add("schedule=" + schedule);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetRecurringPaymentPreferencesRequest{", "}", 0, null, null, 56);
    }
}
