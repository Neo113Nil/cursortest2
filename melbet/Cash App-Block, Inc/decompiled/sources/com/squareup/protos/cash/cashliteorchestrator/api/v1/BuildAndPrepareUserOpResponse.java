package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse$Builder;", "Lokio/ByteString;", "prepared_calls", "Lokio/ByteString;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "source_chain", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "dest_chain", "", "operation_token", "Ljava/lang/String;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData;", "intent_display_data", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData;", "", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest;", "signature_requests", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuildAndPrepareUserOpResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BuildAndPrepareUserOpResponse> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain#ADAPTER", schemaIndex = 3, tag = 4)
    public final Chain dest_chain;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.PreparedIntentDisplayData#ADAPTER", schemaIndex = 5, tag = 6)
    public final PreparedIntentDisplayData intent_display_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String operation_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 0, tag = 1)
    public final ByteString prepared_calls;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.SignatureRequest#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<SignatureRequest> signature_requests;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain#ADAPTER", schemaIndex = 2, tag = 3)
    public final Chain source_chain;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse;", "<init>", "()V", "prepared_calls", "Lokio/ByteString;", "signature_requests", "", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest;", "source_chain", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "dest_chain", "operation_token", "", "intent_display_data", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/PreparedIntentDisplayData;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Chain dest_chain;
        public PreparedIntentDisplayData intent_display_data;
        public String operation_token;
        public ByteString prepared_calls;
        public List<SignatureRequest> signature_requests = EmptyList.INSTANCE;
        public Chain source_chain;

        @Override // com.squareup.wire.Message.Builder
        public BuildAndPrepareUserOpResponse build() {
            return new BuildAndPrepareUserOpResponse(this.prepared_calls, this.signature_requests, this.source_chain, this.dest_chain, this.operation_token, this.intent_display_data, buildUnknownFields());
        }

        public final Builder dest_chain(Chain dest_chain) {
            this.dest_chain = dest_chain;
            return this;
        }

        public final Builder intent_display_data(PreparedIntentDisplayData intent_display_data) {
            this.intent_display_data = intent_display_data;
            return this;
        }

        public final Builder operation_token(String operation_token) {
            this.operation_token = operation_token;
            return this;
        }

        public final Builder prepared_calls(ByteString prepared_calls) {
            this.prepared_calls = prepared_calls;
            return this;
        }

        public final Builder signature_requests(List<SignatureRequest> signature_requests) {
            signature_requests.getClass();
            TransactorKt.checkElementsNotNull(signature_requests);
            this.signature_requests = signature_requests;
            return this;
        }

        public final Builder source_chain(Chain source_chain) {
            this.source_chain = source_chain;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BuildAndPrepareUserOpResponse.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BuildAndPrepareUserOpResponse decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BuildAndPrepareUserOpResponse((ByteString) obj, m, (Chain) obj2, (Chain) obj3, (String) obj4, (PreparedIntentDisplayData) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.BYTES.decode(reader);
                            break;
                        case 2:
                            m.add(SignatureRequest.ADAPTER.decode(reader));
                            break;
                        case 3:
                            try {
                                obj2 = Chain.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 4:
                            try {
                                obj3 = Chain.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(PreparedIntentDisplayData.ADAPTER, reader, obj5);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BuildAndPrepareUserOpResponse value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.prepared_calls);
                SignatureRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.signature_requests);
                ProtoAdapter protoAdapter2 = Chain.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, value.source_chain);
                protoAdapter2.encodeWithTag(writer, 4, value.dest_chain);
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.operation_token);
                PreparedIntentDisplayData.ADAPTER.encodeWithTag(writer, 6, value.intent_display_data);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BuildAndPrepareUserOpResponse value) {
                value.getClass();
                int encodedSizeWithTag = SignatureRequest.ADAPTER.asRepeated().encodedSizeWithTag(2, value.signature_requests) + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.prepared_calls) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Chain.ADAPTER;
                return PreparedIntentDisplayData.ADAPTER.encodedSizeWithTag(6, value.intent_display_data) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.operation_token) + protoAdapter2.encodedSizeWithTag(4, value.dest_chain) + protoAdapter2.encodedSizeWithTag(3, value.source_chain) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BuildAndPrepareUserOpResponse redact(BuildAndPrepareUserOpResponse value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.signature_requests, SignatureRequest.ADAPTER);
                PreparedIntentDisplayData preparedIntentDisplayData = value.intent_display_data;
                PreparedIntentDisplayData preparedIntentDisplayData2 = preparedIntentDisplayData != null ? (PreparedIntentDisplayData) PreparedIntentDisplayData.ADAPTER.redact(preparedIntentDisplayData) : null;
                ByteString byteString = ByteString.EMPTY;
                ByteString byteString2 = value.prepared_calls;
                Chain chain = value.source_chain;
                Chain chain2 = value.dest_chain;
                String str = value.operation_token;
                byteString.getClass();
                return new BuildAndPrepareUserOpResponse(byteString2, m1169redactElements, chain, chain2, str, preparedIntentDisplayData2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BuildAndPrepareUserOpResponse value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PreparedIntentDisplayData.ADAPTER.encodeWithTag(writer, 6, value.intent_display_data);
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.operation_token);
                ProtoAdapter protoAdapter2 = Chain.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, value.dest_chain);
                protoAdapter2.encodeWithTag(writer, 3, value.source_chain);
                SignatureRequest.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.signature_requests);
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.prepared_calls);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildAndPrepareUserOpResponse(ByteString byteString, List list, Chain chain, Chain chain2, String str, PreparedIntentDisplayData preparedIntentDisplayData, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.prepared_calls = byteString;
        this.source_chain = chain;
        this.dest_chain = chain2;
        this.operation_token = str;
        this.intent_display_data = preparedIntentDisplayData;
        this.signature_requests = TransactorKt.immutableCopyOf("signature_requests", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuildAndPrepareUserOpResponse)) {
            return false;
        }
        BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse = (BuildAndPrepareUserOpResponse) obj;
        return Intrinsics.areEqual(unknownFields(), buildAndPrepareUserOpResponse.unknownFields()) && Intrinsics.areEqual(this.prepared_calls, buildAndPrepareUserOpResponse.prepared_calls) && Intrinsics.areEqual(this.signature_requests, buildAndPrepareUserOpResponse.signature_requests) && this.source_chain == buildAndPrepareUserOpResponse.source_chain && this.dest_chain == buildAndPrepareUserOpResponse.dest_chain && Intrinsics.areEqual(this.operation_token, buildAndPrepareUserOpResponse.operation_token) && Intrinsics.areEqual(this.intent_display_data, buildAndPrepareUserOpResponse.intent_display_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.prepared_calls;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37, 37, this.signature_requests);
        Chain chain = this.source_chain;
        int hashCode2 = (m + (chain != null ? chain.hashCode() : 0)) * 37;
        Chain chain2 = this.dest_chain;
        int hashCode3 = (hashCode2 + (chain2 != null ? chain2.hashCode() : 0)) * 37;
        String str = this.operation_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        PreparedIntentDisplayData preparedIntentDisplayData = this.intent_display_data;
        int hashCode5 = hashCode4 + (preparedIntentDisplayData != null ? preparedIntentDisplayData.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.prepared_calls = this.prepared_calls;
        builder.signature_requests = this.signature_requests;
        builder.source_chain = this.source_chain;
        builder.dest_chain = this.dest_chain;
        builder.operation_token = this.operation_token;
        builder.intent_display_data = this.intent_display_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.prepared_calls;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("prepared_calls=", byteString, arrayList);
        }
        if (!this.signature_requests.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("signature_requests=", arrayList, this.signature_requests);
        }
        Chain chain = this.source_chain;
        if (chain != null) {
            arrayList.add("source_chain=" + chain);
        }
        Chain chain2 = this.dest_chain;
        if (chain2 != null) {
            arrayList.add("dest_chain=" + chain2);
        }
        String str = this.operation_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "operation_token=", arrayList);
        }
        PreparedIntentDisplayData preparedIntentDisplayData = this.intent_display_data;
        if (preparedIntentDisplayData != null) {
            arrayList.add("intent_display_data=" + preparedIntentDisplayData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BuildAndPrepareUserOpResponse{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BuildAndPrepareUserOpResponse build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
