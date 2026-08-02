package com.squareup.protos.cash.orderly.app.afterpaystatements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class ListStatementsAppApiRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListStatementsAppApiRequest> CREATOR;
    public final String customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListStatementsAppApiRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.orderly.app.afterpaystatements.ListStatementsAppApiRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ListStatementsAppApiRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ListStatementsAppApiRequest listStatementsAppApiRequest = (ListStatementsAppApiRequest) obj;
                reverseProtoWriter.getClass();
                listStatementsAppApiRequest.getClass();
                reverseProtoWriter.writeBytes(listStatementsAppApiRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, listStatementsAppApiRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ListStatementsAppApiRequest listStatementsAppApiRequest = (ListStatementsAppApiRequest) obj;
                listStatementsAppApiRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, listStatementsAppApiRequest.customer_token) + listStatementsAppApiRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ListStatementsAppApiRequest listStatementsAppApiRequest = (ListStatementsAppApiRequest) obj;
                listStatementsAppApiRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = listStatementsAppApiRequest.customer_token;
                byteString.getClass();
                return new ListStatementsAppApiRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ListStatementsAppApiRequest listStatementsAppApiRequest = (ListStatementsAppApiRequest) obj;
                listStatementsAppApiRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, listStatementsAppApiRequest.customer_token);
                protoWriter.writeBytes(listStatementsAppApiRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListStatementsAppApiRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListStatementsAppApiRequest)) {
            return false;
        }
        ListStatementsAppApiRequest listStatementsAppApiRequest = (ListStatementsAppApiRequest) obj;
        return Intrinsics.areEqual(unknownFields(), listStatementsAppApiRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, listStatementsAppApiRequest.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(21);
        builder.token = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListStatementsAppApiRequest{", "}", 0, null, null, 56);
    }
}
