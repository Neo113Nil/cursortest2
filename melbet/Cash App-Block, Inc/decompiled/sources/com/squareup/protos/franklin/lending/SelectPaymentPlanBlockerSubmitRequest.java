package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzec;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import com.squareup.protos.lending.OpaqueRoute;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SelectPaymentPlanBlockerSubmitRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectPaymentPlanBlockerSubmitRequest> CREATOR;
    public final zzec action;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public final class ConfirmOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConfirmOption> CREATOR;
        public final String token;

        static {
            SelectPaymentPlanBlockerSubmitRequest$ConfirmOption$Companion$ADAPTER$1 selectPaymentPlanBlockerSubmitRequest$ConfirmOption$Companion$ADAPTER$1 = new SelectPaymentPlanBlockerSubmitRequest$ConfirmOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConfirmOption.class), "type.googleapis.com/squareup.franklin.lending.SelectPaymentPlanBlockerSubmitRequest.ConfirmOption", Syntax.PROTO_2, null, "squareup/franklin/lending_api.proto");
            ADAPTER = selectPaymentPlanBlockerSubmitRequest$ConfirmOption$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectPaymentPlanBlockerSubmitRequest$ConfirmOption$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmOption(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfirmOption)) {
                return false;
            }
            ConfirmOption confirmOption = (ConfirmOption) obj;
            return Intrinsics.areEqual(unknownFields(), confirmOption.unknownFields()) && Intrinsics.areEqual(this.token, confirmOption.token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(21);
            builder.client_route = this.token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmOption{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class UpdateOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UpdateOption> CREATOR;
        public final String token;

        static {
            SelectPaymentPlanBlockerSubmitRequest$UpdateOption$Companion$ADAPTER$1 selectPaymentPlanBlockerSubmitRequest$UpdateOption$Companion$ADAPTER$1 = new SelectPaymentPlanBlockerSubmitRequest$UpdateOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateOption.class), "type.googleapis.com/squareup.franklin.lending.SelectPaymentPlanBlockerSubmitRequest.UpdateOption", Syntax.PROTO_2, null, "squareup/franklin/lending_api.proto");
            ADAPTER = selectPaymentPlanBlockerSubmitRequest$UpdateOption$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectPaymentPlanBlockerSubmitRequest$UpdateOption$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateOption(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateOption)) {
                return false;
            }
            UpdateOption updateOption = (UpdateOption) obj;
            return Intrinsics.areEqual(unknownFields(), updateOption.unknownFields()) && Intrinsics.areEqual(this.token, updateOption.token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(22);
            builder.client_route = this.token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateOption{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectPaymentPlanBlockerSubmitRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                zzec zzecVar = null;
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SelectPaymentPlanBlockerSubmitRequest(zzecVar, (RequestContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        zzecVar = new SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption((SelectPaymentPlanBlockerSubmitRequest.UpdateOption) SelectPaymentPlanBlockerSubmitRequest.UpdateOption.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        zzecVar = new SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption((SelectPaymentPlanBlockerSubmitRequest.ConfirmOption) SelectPaymentPlanBlockerSubmitRequest.ConfirmOption.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SelectPaymentPlanBlockerSubmitRequest selectPaymentPlanBlockerSubmitRequest = (SelectPaymentPlanBlockerSubmitRequest) obj;
                reverseProtoWriter.getClass();
                selectPaymentPlanBlockerSubmitRequest.getClass();
                reverseProtoWriter.writeBytes(selectPaymentPlanBlockerSubmitRequest.unknownFields());
                zzec zzecVar = selectPaymentPlanBlockerSubmitRequest.action;
                if (zzecVar instanceof SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) {
                    SelectPaymentPlanBlockerSubmitRequest.UpdateOption.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) zzecVar).value);
                } else if (zzecVar instanceof SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption) {
                    SelectPaymentPlanBlockerSubmitRequest.ConfirmOption.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption) zzecVar).value);
                } else if (zzecVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, selectPaymentPlanBlockerSubmitRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                SelectPaymentPlanBlockerSubmitRequest selectPaymentPlanBlockerSubmitRequest = (SelectPaymentPlanBlockerSubmitRequest) obj;
                selectPaymentPlanBlockerSubmitRequest.getClass();
                int size$okio = selectPaymentPlanBlockerSubmitRequest.unknownFields().getSize$okio();
                zzec zzecVar = selectPaymentPlanBlockerSubmitRequest.action;
                if (zzecVar instanceof SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) {
                    encodedSizeWithTag = SelectPaymentPlanBlockerSubmitRequest.UpdateOption.ADAPTER.encodedSizeWithTag(1, ((SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) zzecVar).value);
                } else {
                    if (!(zzecVar instanceof SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption)) {
                        if (zzecVar != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return RequestContext.ADAPTER.encodedSizeWithTag(3, selectPaymentPlanBlockerSubmitRequest.request_context) + size$okio;
                    }
                    encodedSizeWithTag = SelectPaymentPlanBlockerSubmitRequest.ConfirmOption.ADAPTER.encodedSizeWithTag(2, ((SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption) zzecVar).value);
                }
                size$okio += encodedSizeWithTag;
                return RequestContext.ADAPTER.encodedSizeWithTag(3, selectPaymentPlanBlockerSubmitRequest.request_context) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SelectPaymentPlanBlockerSubmitRequest selectPaymentPlanBlockerSubmitRequest = (SelectPaymentPlanBlockerSubmitRequest) obj;
                selectPaymentPlanBlockerSubmitRequest.getClass();
                RequestContext requestContext = selectPaymentPlanBlockerSubmitRequest.request_context;
                return SelectPaymentPlanBlockerSubmitRequest.copy$default(selectPaymentPlanBlockerSubmitRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SelectPaymentPlanBlockerSubmitRequest selectPaymentPlanBlockerSubmitRequest = (SelectPaymentPlanBlockerSubmitRequest) obj;
                selectPaymentPlanBlockerSubmitRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, selectPaymentPlanBlockerSubmitRequest.request_context);
                zzec zzecVar = selectPaymentPlanBlockerSubmitRequest.action;
                if (zzecVar instanceof SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) {
                    SelectPaymentPlanBlockerSubmitRequest.UpdateOption.ADAPTER.encodeWithTag(protoWriter, 1, ((SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption) zzecVar).value);
                } else if (zzecVar instanceof SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption) {
                    SelectPaymentPlanBlockerSubmitRequest.ConfirmOption.ADAPTER.encodeWithTag(protoWriter, 2, ((SelectPaymentPlanBlockerSubmitRequest$Action$ConfirmOption) zzecVar).value);
                } else if (zzecVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(selectPaymentPlanBlockerSubmitRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentPlanBlockerSubmitRequest(zzec zzecVar, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = zzecVar;
        this.request_context = requestContext;
    }

    public static SelectPaymentPlanBlockerSubmitRequest copy$default(SelectPaymentPlanBlockerSubmitRequest selectPaymentPlanBlockerSubmitRequest, RequestContext requestContext, ByteString byteString, int i) {
        zzec zzecVar = selectPaymentPlanBlockerSubmitRequest.action;
        if ((i & 4) != 0) {
            byteString = selectPaymentPlanBlockerSubmitRequest.unknownFields();
        }
        selectPaymentPlanBlockerSubmitRequest.getClass();
        byteString.getClass();
        return new SelectPaymentPlanBlockerSubmitRequest(zzecVar, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectPaymentPlanBlockerSubmitRequest)) {
            return false;
        }
        SelectPaymentPlanBlockerSubmitRequest selectPaymentPlanBlockerSubmitRequest = (SelectPaymentPlanBlockerSubmitRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectPaymentPlanBlockerSubmitRequest.unknownFields()) && Intrinsics.areEqual(this.action, selectPaymentPlanBlockerSubmitRequest.action) && Intrinsics.areEqual(this.request_context, selectPaymentPlanBlockerSubmitRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzec zzecVar = this.action;
        int hashCode2 = (hashCode + (zzecVar != null ? zzecVar.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(29);
        builder.f1372android = this.action;
        builder.ios = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzec zzecVar = this.action;
        if (zzecVar != null) {
            arrayList.add("action=" + zzecVar);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectPaymentPlanBlockerSubmitRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SelectPaymentPlanBlockerSubmitRequest(zzec zzecVar, RequestContext requestContext) {
        this(zzecVar, requestContext, ByteString.EMPTY);
    }
}
