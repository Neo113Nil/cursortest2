package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.InviteContactsRequest;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SelectAllowlistCustomersRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectAllowlistCustomersRequest> CREATOR;
    public final List allowlisted_customer_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectAllowlistCustomersRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.aegis.api.SelectAllowlistCustomersRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SelectAllowlistCustomersRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SelectAllowlistCustomersRequest selectAllowlistCustomersRequest = (SelectAllowlistCustomersRequest) obj;
                reverseProtoWriter.getClass();
                selectAllowlistCustomersRequest.getClass();
                reverseProtoWriter.writeBytes(selectAllowlistCustomersRequest.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, selectAllowlistCustomersRequest.allowlisted_customer_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectAllowlistCustomersRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SelectAllowlistCustomersRequest selectAllowlistCustomersRequest = (SelectAllowlistCustomersRequest) obj;
                selectAllowlistCustomersRequest.getClass();
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, selectAllowlistCustomersRequest.allowlisted_customer_token) + RequestContext.ADAPTER.encodedSizeWithTag(1, selectAllowlistCustomersRequest.request_context) + selectAllowlistCustomersRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SelectAllowlistCustomersRequest selectAllowlistCustomersRequest = (SelectAllowlistCustomersRequest) obj;
                selectAllowlistCustomersRequest.getClass();
                RequestContext requestContext = selectAllowlistCustomersRequest.request_context;
                return SelectAllowlistCustomersRequest.copy$default(selectAllowlistCustomersRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SelectAllowlistCustomersRequest selectAllowlistCustomersRequest = (SelectAllowlistCustomersRequest) obj;
                selectAllowlistCustomersRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, selectAllowlistCustomersRequest.request_context);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, selectAllowlistCustomersRequest.allowlisted_customer_token);
                protoWriter.writeBytes(selectAllowlistCustomersRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAllowlistCustomersRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.allowlisted_customer_token = TransactorKt.immutableCopyOf("allowlisted_customer_token", list);
    }

    public static SelectAllowlistCustomersRequest copy$default(SelectAllowlistCustomersRequest selectAllowlistCustomersRequest, RequestContext requestContext, ByteString byteString, int i) {
        List list = selectAllowlistCustomersRequest.allowlisted_customer_token;
        if ((i & 4) != 0) {
            byteString = selectAllowlistCustomersRequest.unknownFields();
        }
        selectAllowlistCustomersRequest.getClass();
        list.getClass();
        byteString.getClass();
        return new SelectAllowlistCustomersRequest(requestContext, list, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectAllowlistCustomersRequest)) {
            return false;
        }
        SelectAllowlistCustomersRequest selectAllowlistCustomersRequest = (SelectAllowlistCustomersRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectAllowlistCustomersRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectAllowlistCustomersRequest.request_context) && Intrinsics.areEqual(this.allowlisted_customer_token, selectAllowlistCustomersRequest.allowlisted_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = this.allowlisted_customer_token.hashCode() + ((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(3);
        builder.request_context = this.request_context;
        builder.email_addresses = this.allowlisted_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        List list = this.allowlisted_customer_token;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allowlisted_customer_token=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectAllowlistCustomersRequest{", "}", 0, null, null, 56);
    }
}
