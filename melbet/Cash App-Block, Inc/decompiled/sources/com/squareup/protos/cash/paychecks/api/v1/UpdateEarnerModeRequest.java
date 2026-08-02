package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.time.Duration;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateEarnerModeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateEarnerModeRequest> CREATOR;
    public final Duration duration;

    /* renamed from: operation, reason: collision with root package name */
    public final EarnerModeOperation f1324operation;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateEarnerModeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.UpdateEarnerModeRequest$Companion$ADAPTER$1
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
                        return new UpdateEarnerModeRequest((EarnerModeOperation) obj, (Duration) obj2, (RequestContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = EarnerModeOperation.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.DURATION, protoReader, obj2);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateEarnerModeRequest updateEarnerModeRequest = (UpdateEarnerModeRequest) obj;
                reverseProtoWriter.getClass();
                updateEarnerModeRequest.getClass();
                reverseProtoWriter.writeBytes(updateEarnerModeRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, updateEarnerModeRequest.request_context);
                ProtoAdapter.DURATION.encodeWithTag(reverseProtoWriter, 2, updateEarnerModeRequest.duration);
                EarnerModeOperation.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateEarnerModeRequest.f1324operation);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateEarnerModeRequest updateEarnerModeRequest = (UpdateEarnerModeRequest) obj;
                updateEarnerModeRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(3, updateEarnerModeRequest.request_context) + ProtoAdapter.DURATION.encodedSizeWithTag(2, updateEarnerModeRequest.duration) + EarnerModeOperation.ADAPTER.encodedSizeWithTag(1, updateEarnerModeRequest.f1324operation) + updateEarnerModeRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateEarnerModeRequest updateEarnerModeRequest = (UpdateEarnerModeRequest) obj;
                updateEarnerModeRequest.getClass();
                Duration duration = updateEarnerModeRequest.duration;
                Duration duration2 = duration != null ? (Duration) ProtoAdapter.DURATION.redact(duration) : null;
                RequestContext requestContext = updateEarnerModeRequest.request_context;
                return UpdateEarnerModeRequest.copy$default(updateEarnerModeRequest, duration2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateEarnerModeRequest updateEarnerModeRequest = (UpdateEarnerModeRequest) obj;
                updateEarnerModeRequest.getClass();
                EarnerModeOperation.ADAPTER.encodeWithTag(protoWriter, 1, updateEarnerModeRequest.f1324operation);
                ProtoAdapter.DURATION.encodeWithTag(protoWriter, 2, updateEarnerModeRequest.duration);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, updateEarnerModeRequest.request_context);
                protoWriter.writeBytes(updateEarnerModeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateEarnerModeRequest(EarnerModeOperation earnerModeOperation, Duration duration, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1324operation = earnerModeOperation;
        this.duration = duration;
        this.request_context = requestContext;
    }

    public static UpdateEarnerModeRequest copy$default(UpdateEarnerModeRequest updateEarnerModeRequest, Duration duration, RequestContext requestContext, ByteString byteString, int i) {
        EarnerModeOperation earnerModeOperation = updateEarnerModeRequest.f1324operation;
        if ((i & 2) != 0) {
            duration = updateEarnerModeRequest.duration;
        }
        if ((i & 8) != 0) {
            byteString = updateEarnerModeRequest.unknownFields();
        }
        updateEarnerModeRequest.getClass();
        byteString.getClass();
        return new UpdateEarnerModeRequest(earnerModeOperation, duration, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateEarnerModeRequest)) {
            return false;
        }
        UpdateEarnerModeRequest updateEarnerModeRequest = (UpdateEarnerModeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateEarnerModeRequest.unknownFields()) && this.f1324operation == updateEarnerModeRequest.f1324operation && Intrinsics.areEqual(this.duration, updateEarnerModeRequest.duration) && Intrinsics.areEqual(this.request_context, updateEarnerModeRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarnerModeOperation earnerModeOperation = this.f1324operation;
        int hashCode2 = (hashCode + (earnerModeOperation != null ? earnerModeOperation.hashCode() : 0)) * 37;
        Duration duration = this.duration;
        int hashCode3 = (hashCode2 + (duration != null ? duration.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = hashCode3 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(23, false);
        builder.advertisement_data = this.f1324operation;
        builder.transmission_level = this.duration;
        builder.frequency = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarnerModeOperation earnerModeOperation = this.f1324operation;
        if (earnerModeOperation != null) {
            arrayList.add("operation=" + earnerModeOperation);
        }
        Duration duration = this.duration;
        if (duration != null) {
            arrayList.add("duration=" + duration);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateEarnerModeRequest{", "}", 0, null, null, 56);
    }
}
