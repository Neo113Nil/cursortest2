package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpRequest;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpResponse;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker$Builder;", "", "relying_party_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest;", "request", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse;", "response", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse;", "", "Lokio/ByteString;", "allow_credential_ids", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PasskeySignatureBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasskeySignatureBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<ByteString> allow_credential_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String relying_party_id;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpRequest#ADAPTER", schemaIndex = 2, tag = 3)
    public final BuildAndPrepareUserOpRequest request;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpResponse#ADAPTER", schemaIndex = 3, tag = 4)
    public final BuildAndPrepareUserOpResponse response;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker;", "<init>", "()V", "relying_party_id", "", "allow_credential_ids", "", "Lokio/ByteString;", "request", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpRequest;", "response", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildAndPrepareUserOpResponse;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public List<? extends ByteString> allow_credential_ids = EmptyList.INSTANCE;
        public String relying_party_id;
        public BuildAndPrepareUserOpRequest request;
        public BuildAndPrepareUserOpResponse response;

        public final Builder allow_credential_ids(List<? extends ByteString> allow_credential_ids) {
            allow_credential_ids.getClass();
            TransactorKt.checkElementsNotNull(allow_credential_ids);
            this.allow_credential_ids = allow_credential_ids;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PasskeySignatureBlocker build() {
            return new PasskeySignatureBlocker(this.relying_party_id, this.allow_credential_ids, this.request, this.response, buildUnknownFields());
        }

        public final Builder relying_party_id(String relying_party_id) {
            this.relying_party_id = relying_party_id;
            return this;
        }

        public final Builder request(BuildAndPrepareUserOpRequest request) {
            this.request = request;
            return this;
        }

        public final Builder response(BuildAndPrepareUserOpResponse response) {
            this.response = response;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PasskeySignatureBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PasskeySignatureBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PasskeySignatureBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PasskeySignatureBlocker((String) obj, m, (BuildAndPrepareUserOpRequest) obj2, (BuildAndPrepareUserOpResponse) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        m.add(ProtoAdapter.BYTES.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(BuildAndPrepareUserOpRequest.ADAPTER, reader, obj2);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(BuildAndPrepareUserOpResponse.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PasskeySignatureBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.relying_party_id);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(writer, 2, value.allow_credential_ids);
                BuildAndPrepareUserOpRequest.ADAPTER.encodeWithTag(writer, 3, value.request);
                BuildAndPrepareUserOpResponse.ADAPTER.encodeWithTag(writer, 4, value.response);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PasskeySignatureBlocker value) {
                value.getClass();
                return BuildAndPrepareUserOpResponse.ADAPTER.encodedSizeWithTag(4, value.response) + BuildAndPrepareUserOpRequest.ADAPTER.encodedSizeWithTag(3, value.request) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, value.allow_credential_ids) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.relying_party_id) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PasskeySignatureBlocker redact(PasskeySignatureBlocker value) {
                value.getClass();
                BuildAndPrepareUserOpRequest buildAndPrepareUserOpRequest = value.request;
                BuildAndPrepareUserOpRequest buildAndPrepareUserOpRequest2 = buildAndPrepareUserOpRequest != null ? (BuildAndPrepareUserOpRequest) BuildAndPrepareUserOpRequest.ADAPTER.redact(buildAndPrepareUserOpRequest) : null;
                BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse = value.response;
                BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse2 = buildAndPrepareUserOpResponse != null ? (BuildAndPrepareUserOpResponse) BuildAndPrepareUserOpResponse.ADAPTER.redact(buildAndPrepareUserOpResponse) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.relying_party_id;
                List<ByteString> list = value.allow_credential_ids;
                list.getClass();
                byteString.getClass();
                return new PasskeySignatureBlocker(str, list, buildAndPrepareUserOpRequest2, buildAndPrepareUserOpResponse2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PasskeySignatureBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BuildAndPrepareUserOpResponse.ADAPTER.encodeWithTag(writer, 4, value.response);
                BuildAndPrepareUserOpRequest.ADAPTER.encodeWithTag(writer, 3, value.request);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(writer, 2, value.allow_credential_ids);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.relying_party_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySignatureBlocker(String str, List list, BuildAndPrepareUserOpRequest buildAndPrepareUserOpRequest, BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.relying_party_id = str;
        this.request = buildAndPrepareUserOpRequest;
        this.response = buildAndPrepareUserOpResponse;
        this.allow_credential_ids = TransactorKt.immutableCopyOf("allow_credential_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasskeySignatureBlocker)) {
            return false;
        }
        PasskeySignatureBlocker passkeySignatureBlocker = (PasskeySignatureBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), passkeySignatureBlocker.unknownFields()) && Intrinsics.areEqual(this.relying_party_id, passkeySignatureBlocker.relying_party_id) && Intrinsics.areEqual(this.allow_credential_ids, passkeySignatureBlocker.allow_credential_ids) && Intrinsics.areEqual(this.request, passkeySignatureBlocker.request) && Intrinsics.areEqual(this.response, passkeySignatureBlocker.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.relying_party_id;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.allow_credential_ids);
        BuildAndPrepareUserOpRequest buildAndPrepareUserOpRequest = this.request;
        int hashCode2 = (m + (buildAndPrepareUserOpRequest != null ? buildAndPrepareUserOpRequest.hashCode() : 0)) * 37;
        BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse = this.response;
        int hashCode3 = hashCode2 + (buildAndPrepareUserOpResponse != null ? buildAndPrepareUserOpResponse.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.relying_party_id = this.relying_party_id;
        builder.allow_credential_ids = this.allow_credential_ids;
        builder.request = this.request;
        builder.response = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.relying_party_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "relying_party_id=", arrayList);
        }
        if (!this.allow_credential_ids.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("allow_credential_ids=", arrayList, this.allow_credential_ids);
        }
        BuildAndPrepareUserOpRequest buildAndPrepareUserOpRequest = this.request;
        if (buildAndPrepareUserOpRequest != null) {
            arrayList.add("request=" + buildAndPrepareUserOpRequest);
        }
        BuildAndPrepareUserOpResponse buildAndPrepareUserOpResponse = this.response;
        if (buildAndPrepareUserOpResponse != null) {
            arrayList.add("response=" + buildAndPrepareUserOpResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasskeySignatureBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PasskeySignatureBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PasskeySignatureBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
