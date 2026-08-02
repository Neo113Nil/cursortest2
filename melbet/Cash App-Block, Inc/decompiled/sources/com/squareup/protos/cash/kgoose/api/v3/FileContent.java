package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/FileContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/FileContent$Builder;", "", "data", "Ljava/lang/String;", "mime_type", "", "requires_presigned_url", "Ljava/lang/Boolean;", "s3_uri", "filename", "", "size_bytes", "Ljava/lang/Long;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FileContent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String filename;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String mime_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean requires_presigned_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String s3_uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 5, tag = 6)
    public final Long size_bytes;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/FileContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/FileContent;", "<init>", "()V", "data", "", "mime_type", "requires_presigned_url", "", "Ljava/lang/Boolean;", "s3_uri", "filename", "size_bytes", "", "Ljava/lang/Long;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/FileContent$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/FileContent$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String data;
        public String filename;
        public String mime_type;
        public Boolean requires_presigned_url;
        public String s3_uri;
        public Long size_bytes;

        @Override // com.squareup.wire.Message.Builder
        public FileContent build() {
            return new FileContent(this.data, this.mime_type, this.requires_presigned_url, this.s3_uri, this.filename, this.size_bytes, buildUnknownFields());
        }

        public final Builder data(String data) {
            this.data = data;
            return this;
        }

        public final Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        public final Builder mime_type(String mime_type) {
            this.mime_type = mime_type;
            return this;
        }

        public final Builder requires_presigned_url(Boolean requires_presigned_url) {
            this.requires_presigned_url = requires_presigned_url;
            return this;
        }

        public final Builder s3_uri(String s3_uri) {
            this.s3_uri = s3_uri;
            return this;
        }

        public final Builder size_bytes(Long size_bytes) {
            this.size_bytes = size_bytes;
            return this;
        }
    }

    static {
        FileContent$Companion$ADAPTER$1 fileContent$Companion$ADAPTER$1 = new FileContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FileContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.FileContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = fileContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(fileContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileContent(String str, String str2, Boolean bool, String str3, String str4, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.data = str;
        this.mime_type = str2;
        this.requires_presigned_url = bool;
        this.s3_uri = str3;
        this.filename = str4;
        this.size_bytes = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileContent)) {
            return false;
        }
        FileContent fileContent = (FileContent) obj;
        return Intrinsics.areEqual(unknownFields(), fileContent.unknownFields()) && Intrinsics.areEqual(this.data, fileContent.data) && Intrinsics.areEqual(this.mime_type, fileContent.mime_type) && Intrinsics.areEqual(this.requires_presigned_url, fileContent.requires_presigned_url) && Intrinsics.areEqual(this.s3_uri, fileContent.s3_uri) && Intrinsics.areEqual(this.filename, fileContent.filename) && Intrinsics.areEqual(this.size_bytes, fileContent.size_bytes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.data;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.mime_type;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.requires_presigned_url;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.s3_uri;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.filename;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.size_bytes;
        int hashCode7 = hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.data = this.data;
        builder.mime_type = this.mime_type;
        builder.requires_presigned_url = this.requires_presigned_url;
        builder.s3_uri = this.s3_uri;
        builder.filename = this.filename;
        builder.size_bytes = this.size_bytes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.data != null) {
            arrayList.add("data=██");
        }
        String str = this.mime_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "mime_type=", arrayList);
        }
        Boolean bool = this.requires_presigned_url;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_presigned_url=", bool, arrayList);
        }
        String str2 = this.s3_uri;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "s3_uri=", arrayList);
        }
        String str3 = this.filename;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "filename=", arrayList);
        }
        Long l = this.size_bytes;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("size_bytes=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FileContent{", "}", 0, null, null, 56);
    }
}
