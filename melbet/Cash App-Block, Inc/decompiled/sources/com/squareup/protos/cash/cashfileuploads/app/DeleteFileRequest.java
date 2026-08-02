package com.squareup.protos.cash.cashfileuploads.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class DeleteFileRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeleteFileRequest> CREATOR;
    public final String file_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DeleteFileRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashfileuploads.app.DeleteFileRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = "";
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new DeleteFileRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                DeleteFileRequest deleteFileRequest = (DeleteFileRequest) obj;
                reverseProtoWriter.getClass();
                deleteFileRequest.getClass();
                reverseProtoWriter.writeBytes(deleteFileRequest.unknownFields());
                String str = deleteFileRequest.file_token;
                if (Intrinsics.areEqual(str, "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DeleteFileRequest deleteFileRequest = (DeleteFileRequest) obj;
                deleteFileRequest.getClass();
                int size$okio = deleteFileRequest.unknownFields().getSize$okio();
                String str = deleteFileRequest.file_token;
                return !Intrinsics.areEqual(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) + size$okio : size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DeleteFileRequest deleteFileRequest = (DeleteFileRequest) obj;
                deleteFileRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = deleteFileRequest.file_token;
                str.getClass();
                byteString.getClass();
                return new DeleteFileRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DeleteFileRequest deleteFileRequest = (DeleteFileRequest) obj;
                deleteFileRequest.getClass();
                String str = deleteFileRequest.file_token;
                if (!Intrinsics.areEqual(str, "")) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
                }
                protoWriter.writeBytes(deleteFileRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteFileRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.file_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteFileRequest)) {
            return false;
        }
        DeleteFileRequest deleteFileRequest = (DeleteFileRequest) obj;
        return Intrinsics.areEqual(unknownFields(), deleteFileRequest.unknownFields()) && Intrinsics.areEqual(this.file_token, deleteFileRequest.file_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.file_token.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder();
        builder.banner_color = this.file_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.file_token, "file_token=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeleteFileRequest{", "}", 0, null, null, 56);
    }
}
