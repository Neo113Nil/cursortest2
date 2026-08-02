package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class FindCustomersRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FindCustomersRequest> CREATOR;
    public final String search_text;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FindCustomersRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.FindCustomersRequest$Companion$ADAPTER$1
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
                        return new FindCustomersRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                FindCustomersRequest findCustomersRequest = (FindCustomersRequest) obj;
                reverseProtoWriter.getClass();
                findCustomersRequest.getClass();
                reverseProtoWriter.writeBytes(findCustomersRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, findCustomersRequest.search_text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                FindCustomersRequest findCustomersRequest = (FindCustomersRequest) obj;
                findCustomersRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, findCustomersRequest.search_text) + findCustomersRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((FindCustomersRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new FindCustomersRequest(null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                FindCustomersRequest findCustomersRequest = (FindCustomersRequest) obj;
                findCustomersRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, findCustomersRequest.search_text);
                protoWriter.writeBytes(findCustomersRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindCustomersRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_text = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FindCustomersRequest)) {
            return false;
        }
        FindCustomersRequest findCustomersRequest = (FindCustomersRequest) obj;
        return Intrinsics.areEqual(unknownFields(), findCustomersRequest.unknownFields()) && Intrinsics.areEqual(this.search_text, findCustomersRequest.search_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.search_text;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(9);
        builder.client_route = this.search_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.search_text != null) {
            arrayList.add("search_text=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FindCustomersRequest{", "}", 0, null, null, 56);
    }
}
