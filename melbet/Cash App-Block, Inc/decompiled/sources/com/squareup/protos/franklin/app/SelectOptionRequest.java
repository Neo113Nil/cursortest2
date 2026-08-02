package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetFullNameRequest;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SelectOptionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectOptionRequest> CREATOR;
    public final String action;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String transfer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectOptionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SelectOptionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SelectOptionRequest((RequestContext) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SelectOptionRequest selectOptionRequest = (SelectOptionRequest) obj;
                reverseProtoWriter.getClass();
                selectOptionRequest.getClass();
                reverseProtoWriter.writeBytes(selectOptionRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, selectOptionRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, selectOptionRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, selectOptionRequest.action);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, selectOptionRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SelectOptionRequest selectOptionRequest = (SelectOptionRequest) obj;
                selectOptionRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(4, selectOptionRequest.request_context) + selectOptionRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(3, selectOptionRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(2, selectOptionRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(1, selectOptionRequest.action) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SelectOptionRequest selectOptionRequest = (SelectOptionRequest) obj;
                selectOptionRequest.getClass();
                RequestContext requestContext = selectOptionRequest.request_context;
                return SelectOptionRequest.copy$default(selectOptionRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, EmptyList.INSTANCE, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SelectOptionRequest selectOptionRequest = (SelectOptionRequest) obj;
                selectOptionRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, selectOptionRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, selectOptionRequest.action);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, selectOptionRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 3, selectOptionRequest.transfer_token);
                protoWriter.writeBytes(selectOptionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectOptionRequest(RequestContext requestContext, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.action = str;
        this.transfer_token = str2;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    public static SelectOptionRequest copy$default(SelectOptionRequest selectOptionRequest, RequestContext requestContext, EmptyList emptyList, ByteString byteString, int i) {
        String str = selectOptionRequest.action;
        EmptyList emptyList2 = emptyList;
        if ((i & 4) != 0) {
            emptyList2 = selectOptionRequest.payment_tokens;
        }
        EmptyList emptyList3 = emptyList2;
        String str2 = (i & 8) != 0 ? selectOptionRequest.transfer_token : null;
        if ((i & 16) != 0) {
            byteString = selectOptionRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        selectOptionRequest.getClass();
        emptyList3.getClass();
        byteString2.getClass();
        return new SelectOptionRequest(requestContext, str, str2, emptyList3, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectOptionRequest)) {
            return false;
        }
        SelectOptionRequest selectOptionRequest = (SelectOptionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectOptionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectOptionRequest.request_context) && Intrinsics.areEqual(this.action, selectOptionRequest.action) && Intrinsics.areEqual(this.payment_tokens, selectOptionRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, selectOptionRequest.transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.action;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str2 = this.transfer_token;
        int hashCode3 = m + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetFullNameRequest.Builder builder = new SetFullNameRequest.Builder(4);
        builder.request_context = this.request_context;
        builder.full_name = this.action;
        builder.payment_tokens = this.payment_tokens;
        builder.transfer_token = this.transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.action;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action=", arrayList);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectOptionRequest{", "}", 0, null, null, 56);
    }
}
