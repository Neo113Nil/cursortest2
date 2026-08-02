package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Section;
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
public final class EarningsTrackerDataRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsTrackerDataRequest> CREATOR;
    public final Integer month;
    public final RequestContext request_context;
    public final Integer year;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EarningsTrackerDataRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataRequest$Companion$ADAPTER$1
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
                        return new EarningsTrackerDataRequest((Integer) obj, (Integer) obj2, (RequestContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                EarningsTrackerDataRequest earningsTrackerDataRequest = (EarningsTrackerDataRequest) obj;
                reverseProtoWriter.getClass();
                earningsTrackerDataRequest.getClass();
                reverseProtoWriter.writeBytes(earningsTrackerDataRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, earningsTrackerDataRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, earningsTrackerDataRequest.year);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, earningsTrackerDataRequest.month);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                EarningsTrackerDataRequest earningsTrackerDataRequest = (EarningsTrackerDataRequest) obj;
                earningsTrackerDataRequest.getClass();
                int size$okio = earningsTrackerDataRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                return RequestContext.ADAPTER.encodedSizeWithTag(3, earningsTrackerDataRequest.request_context) + protoAdapter2.encodedSizeWithTag(2, earningsTrackerDataRequest.year) + protoAdapter2.encodedSizeWithTag(1, earningsTrackerDataRequest.month) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                EarningsTrackerDataRequest earningsTrackerDataRequest = (EarningsTrackerDataRequest) obj;
                earningsTrackerDataRequest.getClass();
                RequestContext requestContext = earningsTrackerDataRequest.request_context;
                return EarningsTrackerDataRequest.copy$default(earningsTrackerDataRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 3);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                EarningsTrackerDataRequest earningsTrackerDataRequest = (EarningsTrackerDataRequest) obj;
                earningsTrackerDataRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(protoWriter, 1, earningsTrackerDataRequest.month);
                protoAdapter2.encodeWithTag(protoWriter, 2, earningsTrackerDataRequest.year);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, earningsTrackerDataRequest.request_context);
                protoWriter.writeBytes(earningsTrackerDataRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ EarningsTrackerDataRequest(Integer num, Integer num2, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, null, ByteString.EMPTY);
    }

    public static EarningsTrackerDataRequest copy$default(EarningsTrackerDataRequest earningsTrackerDataRequest, RequestContext requestContext, ByteString byteString, int i) {
        Integer num = earningsTrackerDataRequest.month;
        Integer num2 = earningsTrackerDataRequest.year;
        if ((i & 8) != 0) {
            byteString = earningsTrackerDataRequest.unknownFields();
        }
        earningsTrackerDataRequest.getClass();
        byteString.getClass();
        return new EarningsTrackerDataRequest(num, num2, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerDataRequest)) {
            return false;
        }
        EarningsTrackerDataRequest earningsTrackerDataRequest = (EarningsTrackerDataRequest) obj;
        return Intrinsics.areEqual(unknownFields(), earningsTrackerDataRequest.unknownFields()) && Intrinsics.areEqual(this.month, earningsTrackerDataRequest.month) && Intrinsics.areEqual(this.year, earningsTrackerDataRequest.year) && Intrinsics.areEqual(this.request_context, earningsTrackerDataRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.month;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.year;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode4 = hashCode3 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(25);
        builder.header_text = this.month;
        builder.header_button = this.year;
        builder.groups = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.month;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("month=", num, arrayList);
        }
        Integer num2 = this.year;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("year=", num2, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsTrackerDataRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsTrackerDataRequest(Integer num, Integer num2, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.month = num;
        this.year = num2;
        this.request_context = requestContext;
    }
}
