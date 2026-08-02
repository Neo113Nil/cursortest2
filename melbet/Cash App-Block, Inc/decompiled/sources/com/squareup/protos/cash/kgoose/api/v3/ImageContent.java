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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent$Builder;", "", "data", "Ljava/lang/String;", "mime_type", "", "requires_presigned_url", "Ljava/lang/Boolean;", "s3_uri", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageContent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String mime_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean requires_presigned_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String s3_uri;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent;", "<init>", "()V", "data", "", "mime_type", "requires_presigned_url", "", "Ljava/lang/Boolean;", "s3_uri", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ImageContent$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String data;
        public String mime_type;
        public Boolean requires_presigned_url;
        public String s3_uri;

        @Override // com.squareup.wire.Message.Builder
        public ImageContent build() {
            return new ImageContent(this.requires_presigned_url, this.data, this.mime_type, this.s3_uri, buildUnknownFields());
        }

        public final Builder data(String data) {
            this.data = data;
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
    }

    static {
        ImageContent$Companion$ADAPTER$1 imageContent$Companion$ADAPTER$1 = new ImageContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ImageContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = imageContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageContent(Boolean bool, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.data = str;
        this.mime_type = str2;
        this.requires_presigned_url = bool;
        this.s3_uri = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageContent)) {
            return false;
        }
        ImageContent imageContent = (ImageContent) obj;
        return Intrinsics.areEqual(unknownFields(), imageContent.unknownFields()) && Intrinsics.areEqual(this.data, imageContent.data) && Intrinsics.areEqual(this.mime_type, imageContent.mime_type) && Intrinsics.areEqual(this.requires_presigned_url, imageContent.requires_presigned_url) && Intrinsics.areEqual(this.s3_uri, imageContent.s3_uri);
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
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.data = this.data;
        builder.mime_type = this.mime_type;
        builder.requires_presigned_url = this.requires_presigned_url;
        builder.s3_uri = this.s3_uri;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageContent{", "}", 0, null, null, 56);
    }
}
