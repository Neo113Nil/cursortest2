package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.bankbook.Institution;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SubmitBlockerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitBlockerRequest> CREATOR;
    public final AppRequestContext app_request_context;
    public final String group_id;
    public final List requests;

    /* loaded from: classes8.dex */
    public final class AppRequestContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppRequestContext> CREATOR;
        public final List all_known_ranges;

        static {
            SubmitBlockerRequest$AppRequestContext$Companion$ADAPTER$1 submitBlockerRequest$AppRequestContext$Companion$ADAPTER$1 = new SubmitBlockerRequest$AppRequestContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppRequestContext.class), "type.googleapis.com/squareup.franklin.app.SubmitBlockerRequest.AppRequestContext", Syntax.PROTO_2, null, "squareup/franklin/app/blocker.proto");
            ADAPTER = submitBlockerRequest$AppRequestContext$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBlockerRequest$AppRequestContext$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppRequestContext(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.all_known_ranges = TransactorKt.immutableCopyOf("all_known_ranges", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppRequestContext)) {
                return false;
            }
            AppRequestContext appRequestContext = (AppRequestContext) obj;
            return Intrinsics.areEqual(unknownFields(), appRequestContext.unknownFields()) && Intrinsics.areEqual(this.all_known_ranges, appRequestContext.all_known_ranges);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.all_known_ranges.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Headers.Builder builder = new Headers.Builder(18, false);
            builder.header = this.all_known_ranges;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.all_known_ranges;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("all_known_ranges=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppRequestContext{", "}", 0, null, null, 56);
        }
    }

    public final class Request extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Request> CREATOR;
        public final String blocker_descriptor_id;
        public final zzdh request;

        /* loaded from: classes6.dex */
        public final class Builder extends Message.Builder {
            public String blocker_descriptor_id;
            public zzdh request;

            @Override // com.squareup.wire.Message.Builder
            public final Request build() {
                return new Request(this.blocker_descriptor_id, this.request, buildUnknownFields());
            }
        }

        static {
            SubmitBlockerRequest$Request$Companion$ADAPTER$1 submitBlockerRequest$Request$Companion$ADAPTER$1 = new SubmitBlockerRequest$Request$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Request.class), "type.googleapis.com/squareup.franklin.app.SubmitBlockerRequest.Request", Syntax.PROTO_2, null, "squareup/franklin/app/blocker.proto");
            ADAPTER = submitBlockerRequest$Request$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitBlockerRequest$Request$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(String str, zzdh zzdhVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.blocker_descriptor_id = str;
            this.request = zzdhVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.areEqual(unknownFields(), request.unknownFields()) && Intrinsics.areEqual(this.blocker_descriptor_id, request.blocker_descriptor_id) && Intrinsics.areEqual(this.request, request.request);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.blocker_descriptor_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            zzdh zzdhVar = this.request;
            int hashCode3 = hashCode2 + (zzdhVar != null ? zzdhVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.blocker_descriptor_id = this.blocker_descriptor_id;
            builder.request = this.request;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.blocker_descriptor_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "blocker_descriptor_id=", arrayList);
            }
            zzdh zzdhVar = this.request;
            if (zzdhVar != null) {
                arrayList.add("request=" + zzdhVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Request{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitBlockerRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SubmitBlockerRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitBlockerRequest((String) obj, (SubmitBlockerRequest.AppRequestContext) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(SubmitBlockerRequest.AppRequestContext.ADAPTER, protoReader, obj2);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(SubmitBlockerRequest.Request.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitBlockerRequest submitBlockerRequest = (SubmitBlockerRequest) obj;
                reverseProtoWriter.getClass();
                submitBlockerRequest.getClass();
                reverseProtoWriter.writeBytes(submitBlockerRequest.unknownFields());
                SubmitBlockerRequest.Request.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, submitBlockerRequest.requests);
                SubmitBlockerRequest.AppRequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, submitBlockerRequest.app_request_context);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, submitBlockerRequest.group_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitBlockerRequest submitBlockerRequest = (SubmitBlockerRequest) obj;
                submitBlockerRequest.getClass();
                return SubmitBlockerRequest.Request.ADAPTER.asRepeated().encodedSizeWithTag(3, submitBlockerRequest.requests) + SubmitBlockerRequest.AppRequestContext.ADAPTER.encodedSizeWithTag(2, submitBlockerRequest.app_request_context) + ProtoAdapter.STRING.encodedSizeWithTag(1, submitBlockerRequest.group_id) + submitBlockerRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitBlockerRequest submitBlockerRequest = (SubmitBlockerRequest) obj;
                submitBlockerRequest.getClass();
                SubmitBlockerRequest.AppRequestContext appRequestContext = submitBlockerRequest.app_request_context;
                return SubmitBlockerRequest.copy$default(submitBlockerRequest, appRequestContext != null ? (SubmitBlockerRequest.AppRequestContext) SubmitBlockerRequest.AppRequestContext.ADAPTER.redact(appRequestContext) : null, TransactorKt.m1169redactElements(submitBlockerRequest.requests, SubmitBlockerRequest.Request.ADAPTER), ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitBlockerRequest submitBlockerRequest = (SubmitBlockerRequest) obj;
                submitBlockerRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, submitBlockerRequest.group_id);
                SubmitBlockerRequest.AppRequestContext.ADAPTER.encodeWithTag(protoWriter, 2, submitBlockerRequest.app_request_context);
                SubmitBlockerRequest.Request.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, submitBlockerRequest.requests);
                protoWriter.writeBytes(submitBlockerRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitBlockerRequest(String str, AppRequestContext appRequestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.group_id = str;
        this.app_request_context = appRequestContext;
        this.requests = TransactorKt.immutableCopyOf("requests", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static SubmitBlockerRequest copy$default(SubmitBlockerRequest submitBlockerRequest, AppRequestContext appRequestContext, ArrayList arrayList, ByteString byteString, int i) {
        String str = submitBlockerRequest.group_id;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = submitBlockerRequest.requests;
        }
        if ((i & 8) != 0) {
            byteString = submitBlockerRequest.unknownFields();
        }
        submitBlockerRequest.getClass();
        arrayList2.getClass();
        byteString.getClass();
        return new SubmitBlockerRequest(str, appRequestContext, arrayList2, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitBlockerRequest)) {
            return false;
        }
        SubmitBlockerRequest submitBlockerRequest = (SubmitBlockerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitBlockerRequest.unknownFields()) && Intrinsics.areEqual(this.group_id, submitBlockerRequest.group_id) && Intrinsics.areEqual(this.app_request_context, submitBlockerRequest.app_request_context) && Intrinsics.areEqual(this.requests, submitBlockerRequest.requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.group_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        AppRequestContext appRequestContext = this.app_request_context;
        int hashCode3 = this.requests.hashCode() + ((hashCode2 + (appRequestContext != null ? appRequestContext.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(5);
        builder.institution_token = this.group_id;
        builder.display_info = this.app_request_context;
        builder.help_menu_items = this.requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.group_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "group_id=", arrayList);
        }
        AppRequestContext appRequestContext = this.app_request_context;
        if (appRequestContext != null) {
            arrayList.add("app_request_context=" + appRequestContext);
        }
        List list = this.requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("requests=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitBlockerRequest{", "}", 0, null, null, 56);
    }

    public SubmitBlockerRequest(String str, List list, int i) {
        this((i & 1) != 0 ? null : str, null, list, ByteString.EMPTY);
    }
}
