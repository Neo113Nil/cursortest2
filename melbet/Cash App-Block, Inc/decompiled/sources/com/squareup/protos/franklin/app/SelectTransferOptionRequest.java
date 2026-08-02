package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzdf;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.protos.franklin.app.SelectTransferOptionRequest;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class SelectTransferOptionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectTransferOptionRequest> CREATOR;
    public final zzdf action;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public final class BackAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BackAction> CREATOR;

        static {
            SelectTransferOptionRequest$BackAction$Companion$ADAPTER$1 selectTransferOptionRequest$BackAction$Companion$ADAPTER$1 = new SelectTransferOptionRequest$BackAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BackAction.class), "type.googleapis.com/squareup.franklin.app.SelectTransferOptionRequest.BackAction", Syntax.PROTO_2, null, "squareup/franklin/app/select_transfer_option.proto");
            ADAPTER = selectTransferOptionRequest$BackAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectTransferOptionRequest$BackAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackAction(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof BackAction) && Intrinsics.areEqual(unknownFields(), ((BackAction) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(28);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "BackAction{}";
        }
    }

    /* loaded from: classes8.dex */
    public final class SelectOptionAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectOptionAction> CREATOR;
        public final String selected_option_id;

        static {
            SelectTransferOptionRequest$SelectOptionAction$Companion$ADAPTER$1 selectTransferOptionRequest$SelectOptionAction$Companion$ADAPTER$1 = new SelectTransferOptionRequest$SelectOptionAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectOptionAction.class), "type.googleapis.com/squareup.franklin.app.SelectTransferOptionRequest.SelectOptionAction", Syntax.PROTO_2, null, "squareup/franklin/app/select_transfer_option.proto");
            ADAPTER = selectTransferOptionRequest$SelectOptionAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(selectTransferOptionRequest$SelectOptionAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectOptionAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.selected_option_id = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectOptionAction)) {
                return false;
            }
            SelectOptionAction selectOptionAction = (SelectOptionAction) obj;
            return Intrinsics.areEqual(unknownFields(), selectOptionAction.unknownFields()) && Intrinsics.areEqual(this.selected_option_id, selectOptionAction.selected_option_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.selected_option_id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OpaqueRoute.Builder builder = new OpaqueRoute.Builder(12);
            builder.client_route = this.selected_option_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.selected_option_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_option_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectOptionAction{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectTransferOptionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SelectTransferOptionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                zzdf zzdfVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SelectTransferOptionRequest((RequestContext) obj, zzdfVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        zzdfVar = new SelectTransferOptionRequest$Action$SelectOption((SelectTransferOptionRequest.SelectOptionAction) SelectTransferOptionRequest.SelectOptionAction.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        zzdfVar = new SelectTransferOptionRequest$Action$Back((SelectTransferOptionRequest.BackAction) SelectTransferOptionRequest.BackAction.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SelectTransferOptionRequest selectTransferOptionRequest = (SelectTransferOptionRequest) obj;
                reverseProtoWriter.getClass();
                selectTransferOptionRequest.getClass();
                reverseProtoWriter.writeBytes(selectTransferOptionRequest.unknownFields());
                zzdf zzdfVar = selectTransferOptionRequest.action;
                if (zzdfVar instanceof SelectTransferOptionRequest$Action$SelectOption) {
                    SelectTransferOptionRequest.SelectOptionAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SelectTransferOptionRequest$Action$SelectOption) zzdfVar).value);
                } else if (zzdfVar instanceof SelectTransferOptionRequest$Action$Back) {
                    SelectTransferOptionRequest.BackAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SelectTransferOptionRequest$Action$Back) zzdfVar).value);
                } else if (zzdfVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectTransferOptionRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SelectTransferOptionRequest selectTransferOptionRequest = (SelectTransferOptionRequest) obj;
                selectTransferOptionRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, selectTransferOptionRequest.request_context) + selectTransferOptionRequest.unknownFields().getSize$okio();
                zzdf zzdfVar = selectTransferOptionRequest.action;
                if (zzdfVar instanceof SelectTransferOptionRequest$Action$SelectOption) {
                    return SelectTransferOptionRequest.SelectOptionAction.ADAPTER.encodedSizeWithTag(2, ((SelectTransferOptionRequest$Action$SelectOption) zzdfVar).value) + encodedSizeWithTag;
                }
                if (zzdfVar instanceof SelectTransferOptionRequest$Action$Back) {
                    return SelectTransferOptionRequest.BackAction.ADAPTER.encodedSizeWithTag(3, ((SelectTransferOptionRequest$Action$Back) zzdfVar).value) + encodedSizeWithTag;
                }
                if (zzdfVar == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SelectTransferOptionRequest selectTransferOptionRequest = (SelectTransferOptionRequest) obj;
                selectTransferOptionRequest.getClass();
                RequestContext requestContext = selectTransferOptionRequest.request_context;
                return SelectTransferOptionRequest.copy$default(selectTransferOptionRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SelectTransferOptionRequest selectTransferOptionRequest = (SelectTransferOptionRequest) obj;
                selectTransferOptionRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, selectTransferOptionRequest.request_context);
                zzdf zzdfVar = selectTransferOptionRequest.action;
                if (zzdfVar instanceof SelectTransferOptionRequest$Action$SelectOption) {
                    SelectTransferOptionRequest.SelectOptionAction.ADAPTER.encodeWithTag(protoWriter, 2, ((SelectTransferOptionRequest$Action$SelectOption) zzdfVar).value);
                } else if (zzdfVar instanceof SelectTransferOptionRequest$Action$Back) {
                    SelectTransferOptionRequest.BackAction.ADAPTER.encodeWithTag(protoWriter, 3, ((SelectTransferOptionRequest$Action$Back) zzdfVar).value);
                } else if (zzdfVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(selectTransferOptionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectTransferOptionRequest(RequestContext requestContext, zzdf zzdfVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.action = zzdfVar;
    }

    public static SelectTransferOptionRequest copy$default(SelectTransferOptionRequest selectTransferOptionRequest, RequestContext requestContext, ByteString byteString, int i) {
        zzdf zzdfVar = selectTransferOptionRequest.action;
        if ((i & 4) != 0) {
            byteString = selectTransferOptionRequest.unknownFields();
        }
        selectTransferOptionRequest.getClass();
        byteString.getClass();
        return new SelectTransferOptionRequest(requestContext, zzdfVar, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectTransferOptionRequest)) {
            return false;
        }
        SelectTransferOptionRequest selectTransferOptionRequest = (SelectTransferOptionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), selectTransferOptionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, selectTransferOptionRequest.request_context) && Intrinsics.areEqual(this.action, selectTransferOptionRequest.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        zzdf zzdfVar = this.action;
        int hashCode3 = hashCode2 + (zzdfVar != null ? zzdfVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(3);
        builder.request_context = this.request_context;
        builder.result = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        zzdf zzdfVar = this.action;
        if (zzdfVar != null) {
            arrayList.add("action=" + zzdfVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectTransferOptionRequest{", "}", 0, null, null, 56);
    }
}
