package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
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
public final class SetProfilePhotoRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetProfilePhotoRequest> CREATOR;
    public final ByteString image_bytes;
    public final String image_data;
    public final String mime_type;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetProfilePhotoRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetProfilePhotoRequest$Companion$ADAPTER$1
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
                        return new SetProfilePhotoRequest((String) obj, (ByteString) obj2, (String) obj3, (RequestContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = ProtoAdapter.BYTES.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 5) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 6) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetProfilePhotoRequest setProfilePhotoRequest = (SetProfilePhotoRequest) obj;
                reverseProtoWriter.getClass();
                setProfilePhotoRequest.getClass();
                reverseProtoWriter.writeBytes(setProfilePhotoRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, setProfilePhotoRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, setProfilePhotoRequest.mime_type);
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, setProfilePhotoRequest.image_bytes);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, setProfilePhotoRequest.image_data);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetProfilePhotoRequest setProfilePhotoRequest = (SetProfilePhotoRequest) obj;
                setProfilePhotoRequest.getClass();
                int size$okio = setProfilePhotoRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(6, setProfilePhotoRequest.request_context) + protoAdapter2.encodedSizeWithTag(4, setProfilePhotoRequest.mime_type) + ProtoAdapter.BYTES.encodedSizeWithTag(3, setProfilePhotoRequest.image_bytes) + protoAdapter2.encodedSizeWithTag(5, setProfilePhotoRequest.image_data) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetProfilePhotoRequest setProfilePhotoRequest = (SetProfilePhotoRequest) obj;
                setProfilePhotoRequest.getClass();
                RequestContext requestContext = setProfilePhotoRequest.request_context;
                return SetProfilePhotoRequest.copy$default(setProfilePhotoRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 5);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetProfilePhotoRequest setProfilePhotoRequest = (SetProfilePhotoRequest) obj;
                setProfilePhotoRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 5, setProfilePhotoRequest.image_data);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, setProfilePhotoRequest.image_bytes);
                protoAdapter2.encodeWithTag(protoWriter, 4, setProfilePhotoRequest.mime_type);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 6, setProfilePhotoRequest.request_context);
                protoWriter.writeBytes(setProfilePhotoRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetProfilePhotoRequest(String str, ByteString byteString, String str2, RequestContext requestContext, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.image_data = str;
        this.image_bytes = byteString;
        this.mime_type = str2;
        this.request_context = requestContext;
    }

    public static SetProfilePhotoRequest copy$default(SetProfilePhotoRequest setProfilePhotoRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = setProfilePhotoRequest.image_data;
        ByteString byteString2 = (i & 2) != 0 ? setProfilePhotoRequest.image_bytes : null;
        String str2 = setProfilePhotoRequest.mime_type;
        if ((i & 16) != 0) {
            byteString = setProfilePhotoRequest.unknownFields();
        }
        ByteString byteString3 = byteString;
        setProfilePhotoRequest.getClass();
        byteString3.getClass();
        return new SetProfilePhotoRequest(str, byteString2, str2, requestContext, byteString3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetProfilePhotoRequest)) {
            return false;
        }
        SetProfilePhotoRequest setProfilePhotoRequest = (SetProfilePhotoRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setProfilePhotoRequest.unknownFields()) && Intrinsics.areEqual(this.image_data, setProfilePhotoRequest.image_data) && Intrinsics.areEqual(this.image_bytes, setProfilePhotoRequest.image_bytes) && Intrinsics.areEqual(this.mime_type, setProfilePhotoRequest.mime_type) && Intrinsics.areEqual(this.request_context, setProfilePhotoRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.image_data;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.image_bytes;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str2 = this.mime_type;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = hashCode4 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(16);
        builder.button_color = this.image_data;
        builder.text_color = this.image_bytes;
        builder.text = this.mime_type;
        builder.action = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.image_data;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "image_data=", arrayList);
        }
        if (this.image_bytes != null) {
            arrayList.add("image_bytes=██");
        }
        String str2 = this.mime_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "mime_type=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetProfilePhotoRequest{", "}", 0, null, null, 56);
    }
}
