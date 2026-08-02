package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.person.Alias;
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
public final class UploadFileRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UploadFileRequest> CREATOR;
    public final FileCategory category;
    public final ByteString file_bytes;
    public final String file_data;
    public final String mime_type;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String transfer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UploadFileRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.UploadFileRequest$Companion$ADAPTER$1
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
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UploadFileRequest((RequestContext) obj, (String) obj2, (ByteString) obj3, (String) obj4, (FileCategory) obj5, m, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj3 = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 3:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                obj5 = FileCategory.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UploadFileRequest uploadFileRequest = (UploadFileRequest) obj;
                reverseProtoWriter.getClass();
                uploadFileRequest.getClass();
                reverseProtoWriter.writeBytes(uploadFileRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, uploadFileRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, uploadFileRequest.payment_tokens);
                FileCategory.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uploadFileRequest.category);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, uploadFileRequest.mime_type);
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, uploadFileRequest.file_bytes);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, uploadFileRequest.file_data);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, uploadFileRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UploadFileRequest uploadFileRequest = (UploadFileRequest) obj;
                uploadFileRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(7, uploadFileRequest.request_context) + uploadFileRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, uploadFileRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(5, uploadFileRequest.payment_tokens) + FileCategory.ADAPTER.encodedSizeWithTag(4, uploadFileRequest.category) + protoAdapter2.encodedSizeWithTag(3, uploadFileRequest.mime_type) + ProtoAdapter.BYTES.encodedSizeWithTag(2, uploadFileRequest.file_bytes) + protoAdapter2.encodedSizeWithTag(1, uploadFileRequest.file_data) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UploadFileRequest uploadFileRequest = (UploadFileRequest) obj;
                uploadFileRequest.getClass();
                RequestContext requestContext = uploadFileRequest.request_context;
                return UploadFileRequest.copy$default(uploadFileRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, EmptyList.INSTANCE, ByteString.EMPTY, 24);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UploadFileRequest uploadFileRequest = (UploadFileRequest) obj;
                uploadFileRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 7, uploadFileRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, uploadFileRequest.file_data);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, uploadFileRequest.file_bytes);
                protoAdapter2.encodeWithTag(protoWriter, 3, uploadFileRequest.mime_type);
                FileCategory.ADAPTER.encodeWithTag(protoWriter, 4, uploadFileRequest.category);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, uploadFileRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 6, uploadFileRequest.transfer_token);
                protoWriter.writeBytes(uploadFileRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileRequest(RequestContext requestContext, String str, ByteString byteString, String str2, FileCategory fileCategory, List list, String str3, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.request_context = requestContext;
        this.file_data = str;
        this.file_bytes = byteString;
        this.mime_type = str2;
        this.category = fileCategory;
        this.transfer_token = str3;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    public static UploadFileRequest copy$default(UploadFileRequest uploadFileRequest, RequestContext requestContext, EmptyList emptyList, ByteString byteString, int i) {
        String str = (i & 2) != 0 ? uploadFileRequest.file_data : null;
        ByteString byteString2 = (i & 4) != 0 ? uploadFileRequest.file_bytes : null;
        String str2 = uploadFileRequest.mime_type;
        FileCategory fileCategory = uploadFileRequest.category;
        EmptyList emptyList2 = emptyList;
        if ((i & 32) != 0) {
            emptyList2 = uploadFileRequest.payment_tokens;
        }
        EmptyList emptyList3 = emptyList2;
        String str3 = (i & 64) != 0 ? uploadFileRequest.transfer_token : null;
        if ((i & 128) != 0) {
            byteString = uploadFileRequest.unknownFields();
        }
        ByteString byteString3 = byteString;
        uploadFileRequest.getClass();
        emptyList3.getClass();
        byteString3.getClass();
        return new UploadFileRequest(requestContext, str, byteString2, str2, fileCategory, emptyList3, str3, byteString3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadFileRequest)) {
            return false;
        }
        UploadFileRequest uploadFileRequest = (UploadFileRequest) obj;
        return Intrinsics.areEqual(unknownFields(), uploadFileRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, uploadFileRequest.request_context) && Intrinsics.areEqual(this.file_data, uploadFileRequest.file_data) && Intrinsics.areEqual(this.file_bytes, uploadFileRequest.file_bytes) && Intrinsics.areEqual(this.mime_type, uploadFileRequest.mime_type) && this.category == uploadFileRequest.category && Intrinsics.areEqual(this.payment_tokens, uploadFileRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, uploadFileRequest.transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.file_data;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.file_bytes;
        int hashCode4 = (hashCode3 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str2 = this.mime_type;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        FileCategory fileCategory = this.category;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (fileCategory != null ? fileCategory.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str3 = this.transfer_token;
        int hashCode6 = m + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(4);
        builder.f1407type = this.request_context;
        builder.scope = this.file_data;
        builder.first_verified_at_ms = this.file_bytes;
        builder.value = this.mime_type;
        builder.last_verified_at_ms = this.category;
        builder.created_at = this.payment_tokens;
        builder.updated_at = this.transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.file_data != null) {
            arrayList.add("file_data=██");
        }
        if (this.file_bytes != null) {
            arrayList.add("file_bytes=██");
        }
        String str = this.mime_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "mime_type=", arrayList);
        }
        FileCategory fileCategory = this.category;
        if (fileCategory != null) {
            arrayList.add("category=" + fileCategory);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UploadFileRequest{", "}", 0, null, null, 56);
    }
}
