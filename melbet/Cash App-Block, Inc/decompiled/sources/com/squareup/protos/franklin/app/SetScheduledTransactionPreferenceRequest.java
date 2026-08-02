package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
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
public final class SetScheduledTransactionPreferenceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetScheduledTransactionPreferenceRequest> CREATOR;
    public final RequestContext request_context;
    public final ScheduledTransactionPreference scheduled_transaction_preference;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetScheduledTransactionPreferenceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetScheduledTransactionPreferenceRequest$Companion$ADAPTER$1
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
                        return new SetScheduledTransactionPreferenceRequest((RequestContext) obj, (ScheduledTransactionPreference) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(ScheduledTransactionPreference.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest = (SetScheduledTransactionPreferenceRequest) obj;
                reverseProtoWriter.getClass();
                setScheduledTransactionPreferenceRequest.getClass();
                reverseProtoWriter.writeBytes(setScheduledTransactionPreferenceRequest.unknownFields());
                ScheduledTransactionPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setScheduledTransactionPreferenceRequest.scheduled_transaction_preference);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setScheduledTransactionPreferenceRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest = (SetScheduledTransactionPreferenceRequest) obj;
                setScheduledTransactionPreferenceRequest.getClass();
                return ScheduledTransactionPreference.ADAPTER.encodedSizeWithTag(2, setScheduledTransactionPreferenceRequest.scheduled_transaction_preference) + RequestContext.ADAPTER.encodedSizeWithTag(1, setScheduledTransactionPreferenceRequest.request_context) + setScheduledTransactionPreferenceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest = (SetScheduledTransactionPreferenceRequest) obj;
                setScheduledTransactionPreferenceRequest.getClass();
                RequestContext requestContext = setScheduledTransactionPreferenceRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ScheduledTransactionPreference scheduledTransactionPreference = setScheduledTransactionPreferenceRequest.scheduled_transaction_preference;
                ScheduledTransactionPreference scheduledTransactionPreference2 = scheduledTransactionPreference != null ? (ScheduledTransactionPreference) ScheduledTransactionPreference.ADAPTER.redact(scheduledTransactionPreference) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new SetScheduledTransactionPreferenceRequest(requestContext2, scheduledTransactionPreference2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest = (SetScheduledTransactionPreferenceRequest) obj;
                setScheduledTransactionPreferenceRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setScheduledTransactionPreferenceRequest.request_context);
                ScheduledTransactionPreference.ADAPTER.encodeWithTag(protoWriter, 2, setScheduledTransactionPreferenceRequest.scheduled_transaction_preference);
                protoWriter.writeBytes(setScheduledTransactionPreferenceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetScheduledTransactionPreferenceRequest(RequestContext requestContext, ScheduledTransactionPreference scheduledTransactionPreference, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.scheduled_transaction_preference = scheduledTransactionPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetScheduledTransactionPreferenceRequest)) {
            return false;
        }
        SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest = (SetScheduledTransactionPreferenceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setScheduledTransactionPreferenceRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setScheduledTransactionPreferenceRequest.request_context) && Intrinsics.areEqual(this.scheduled_transaction_preference, setScheduledTransactionPreferenceRequest.scheduled_transaction_preference);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        ScheduledTransactionPreference scheduledTransactionPreference = this.scheduled_transaction_preference;
        int hashCode3 = hashCode2 + (scheduledTransactionPreference != null ? scheduledTransactionPreference.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(15);
        builder.request_context = this.request_context;
        builder.result = this.scheduled_transaction_preference;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        ScheduledTransactionPreference scheduledTransactionPreference = this.scheduled_transaction_preference;
        if (scheduledTransactionPreference != null) {
            arrayList.add("scheduled_transaction_preference=" + scheduledTransactionPreference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetScheduledTransactionPreferenceRequest{", "}", 0, null, null, 56);
    }
}
