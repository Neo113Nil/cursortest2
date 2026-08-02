package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.franklin.app.GetProfileRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/supportal/app/OpenChatResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "com/google/android/gms/internal/mlkit_vision_common/zzlm", "Allowed", "Denied", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OpenChatResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenChatResponse> CREATOR;
    public final zzlm result;

    public final class Allowed extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Allowed> CREATOR;

        static {
            OpenChatResponse$Allowed$Companion$ADAPTER$1 openChatResponse$Allowed$Companion$ADAPTER$1 = new OpenChatResponse$Allowed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Allowed.class), "type.googleapis.com/squareup.cash.supportal.app.OpenChatResponse.Allowed", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = openChatResponse$Allowed$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(openChatResponse$Allowed$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Allowed(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Allowed) && Intrinsics.areEqual(unknownFields(), ((Allowed) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(8);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Allowed{}";
        }
    }

    public final class Denied extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Denied> CREATOR;

        static {
            OpenChatResponse$Denied$Companion$ADAPTER$1 openChatResponse$Denied$Companion$ADAPTER$1 = new OpenChatResponse$Denied$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Denied.class), "type.googleapis.com/squareup.cash.supportal.app.OpenChatResponse.Denied", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = openChatResponse$Denied$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(openChatResponse$Denied$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Denied(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Denied) && Intrinsics.areEqual(unknownFields(), ((Denied) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(9);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Denied{}";
        }
    }

    static {
        OpenChatResponse$Companion$ADAPTER$1 openChatResponse$Companion$ADAPTER$1 = new OpenChatResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenChatResponse.class), "type.googleapis.com/squareup.cash.supportal.app.OpenChatResponse", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = openChatResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(openChatResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenChatResponse(zzlm zzlmVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.result = zzlmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenChatResponse)) {
            return false;
        }
        OpenChatResponse openChatResponse = (OpenChatResponse) obj;
        return Intrinsics.areEqual(unknownFields(), openChatResponse.unknownFields()) && Intrinsics.areEqual(this.result, openChatResponse.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzlm zzlmVar = this.result;
        int hashCode2 = hashCode + (zzlmVar != null ? zzlmVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(28);
        builder.pool_lifecycle_filter = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzlm zzlmVar = this.result;
        if (zzlmVar != null) {
            arrayList.add("result=" + zzlmVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenChatResponse{", "}", 0, null, null, 56);
    }
}
