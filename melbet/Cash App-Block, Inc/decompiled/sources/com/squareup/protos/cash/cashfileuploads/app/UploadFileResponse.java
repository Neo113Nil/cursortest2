package com.squareup.protos.cash.cashfileuploads.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Banner;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashfileuploads/app/UploadFileResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashface/api/Banner$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UploadFileResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UploadFileResponse> CREATOR;
    public final String file_token;

    static {
        UploadFileResponse$Companion$ADAPTER$1 uploadFileResponse$Companion$ADAPTER$1 = new UploadFileResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UploadFileResponse.class), "type.googleapis.com/squareup.cash.cashfileuploads.app.UploadFileResponse", Syntax.PROTO_3, null, "squareup/cash/cashfileuploads/app.proto");
        ADAPTER = uploadFileResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uploadFileResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.file_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadFileResponse)) {
            return false;
        }
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        return Intrinsics.areEqual(unknownFields(), uploadFileResponse.unknownFields()) && Intrinsics.areEqual(this.file_token, uploadFileResponse.file_token);
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
        Banner.Builder builder = new Banner.Builder(10);
        builder.banner_color = this.file_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.file_token, "file_token=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UploadFileResponse{", "}", 0, null, null, 56);
    }
}
