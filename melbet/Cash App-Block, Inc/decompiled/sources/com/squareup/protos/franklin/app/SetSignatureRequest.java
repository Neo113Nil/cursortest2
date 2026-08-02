package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
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
public final class SetSignatureRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetSignatureRequest> CREATOR;
    public final ByteString image_bytes;
    public final String mime_type;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetSignatureRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetSignatureRequest$Companion$ADAPTER$1
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
                        return new SetSignatureRequest((RequestContext) obj, (ByteString) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetSignatureRequest setSignatureRequest = (SetSignatureRequest) obj;
                reverseProtoWriter.getClass();
                setSignatureRequest.getClass();
                reverseProtoWriter.writeBytes(setSignatureRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, setSignatureRequest.mime_type);
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, setSignatureRequest.image_bytes);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setSignatureRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetSignatureRequest setSignatureRequest = (SetSignatureRequest) obj;
                setSignatureRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(3, setSignatureRequest.mime_type) + ProtoAdapter.BYTES.encodedSizeWithTag(2, setSignatureRequest.image_bytes) + RequestContext.ADAPTER.encodedSizeWithTag(1, setSignatureRequest.request_context) + setSignatureRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetSignatureRequest setSignatureRequest = (SetSignatureRequest) obj;
                setSignatureRequest.getClass();
                RequestContext requestContext = setSignatureRequest.request_context;
                return SetSignatureRequest.copy$default(setSignatureRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 4);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetSignatureRequest setSignatureRequest = (SetSignatureRequest) obj;
                setSignatureRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setSignatureRequest.request_context);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, setSignatureRequest.image_bytes);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setSignatureRequest.mime_type);
                protoWriter.writeBytes(setSignatureRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetSignatureRequest(RequestContext requestContext, ByteString byteString, String str, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.request_context = requestContext;
        this.image_bytes = byteString;
        this.mime_type = str;
    }

    public static SetSignatureRequest copy$default(SetSignatureRequest setSignatureRequest, RequestContext requestContext, ByteString byteString, int i) {
        ByteString byteString2 = (i & 2) != 0 ? setSignatureRequest.image_bytes : null;
        String str = setSignatureRequest.mime_type;
        if ((i & 8) != 0) {
            byteString = setSignatureRequest.unknownFields();
        }
        setSignatureRequest.getClass();
        byteString.getClass();
        return new SetSignatureRequest(requestContext, byteString2, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetSignatureRequest)) {
            return false;
        }
        SetSignatureRequest setSignatureRequest = (SetSignatureRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setSignatureRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setSignatureRequest.request_context) && Intrinsics.areEqual(this.image_bytes, setSignatureRequest.image_bytes) && Intrinsics.areEqual(this.mime_type, setSignatureRequest.mime_type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        ByteString byteString = this.image_bytes;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.mime_type;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(4, false);
        builder.display_info = this.request_context;
        builder.help_menu_items = this.image_bytes;
        builder.institution_token = this.mime_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.image_bytes != null) {
            arrayList.add("image_bytes=██");
        }
        String str = this.mime_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "mime_type=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetSignatureRequest{", "}", 0, null, null, 56);
    }
}
