package com.squareup.protos.cash.security.mri.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext$Builder;", "", "serialization_version", "Ljava/lang/Integer;", "Lokio/ByteString;", "mri_context", "Lokio/ByteString;", "Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData;", "signing_data", "Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData;", "Lcom/squareup/protos/cash/security/mri/api/v1/AppAttestSigningData;", "ios_signing_data", "Lcom/squareup/protos/cash/security/mri/api/v1/AppAttestSigningData;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SignedSerializedMRIContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SignedSerializedMRIContext> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.security.mri.api.v1.AppAttestSigningData#ADAPTER", schemaIndex = 3, tag = 4)
    public final AppAttestSigningData ios_signing_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 1, tag = 2)
    public final ByteString mri_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    public final Integer serialization_version;

    @WireField(adapter = "com.squareup.protos.cash.security.mri.api.v1.AttestedKeySigningData#ADAPTER", schemaIndex = 2, tag = 3)
    public final AttestedKeySigningData signing_data;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext;", "<init>", "()V", "serialization_version", "", "Ljava/lang/Integer;", "mri_context", "Lokio/ByteString;", "signing_data", "Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData;", "ios_signing_data", "Lcom/squareup/protos/cash/security/mri/api/v1/AppAttestSigningData;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public AppAttestSigningData ios_signing_data;
        public ByteString mri_context;
        public Integer serialization_version;
        public AttestedKeySigningData signing_data;

        @Override // com.squareup.wire.Message.Builder
        public SignedSerializedMRIContext build() {
            return new SignedSerializedMRIContext(this.serialization_version, this.mri_context, this.signing_data, this.ios_signing_data, buildUnknownFields());
        }

        public final Builder ios_signing_data(AppAttestSigningData ios_signing_data) {
            this.ios_signing_data = ios_signing_data;
            return this;
        }

        public final Builder mri_context(ByteString mri_context) {
            this.mri_context = mri_context;
            return this;
        }

        public final Builder serialization_version(Integer serialization_version) {
            this.serialization_version = serialization_version;
            return this;
        }

        public final Builder signing_data(AttestedKeySigningData signing_data) {
            this.signing_data = signing_data;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SignedSerializedMRIContext.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SignedSerializedMRIContext decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SignedSerializedMRIContext((Integer) obj, (ByteString) obj2, (AttestedKeySigningData) obj3, (AppAttestSigningData) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT32.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BYTES.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(AttestedKeySigningData.ADAPTER, reader, obj3);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(AppAttestSigningData.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SignedSerializedMRIContext value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.INT32.encodeWithTag(writer, 1, value.serialization_version);
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.mri_context);
                AttestedKeySigningData.ADAPTER.encodeWithTag(writer, 3, value.signing_data);
                AppAttestSigningData.ADAPTER.encodeWithTag(writer, 4, value.ios_signing_data);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SignedSerializedMRIContext value) {
                value.getClass();
                return AppAttestSigningData.ADAPTER.encodedSizeWithTag(4, value.ios_signing_data) + AttestedKeySigningData.ADAPTER.encodedSizeWithTag(3, value.signing_data) + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.mri_context) + ProtoAdapter.INT32.encodedSizeWithTag(1, value.serialization_version) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SignedSerializedMRIContext redact(SignedSerializedMRIContext value) {
                value.getClass();
                AttestedKeySigningData attestedKeySigningData = value.signing_data;
                AttestedKeySigningData attestedKeySigningData2 = attestedKeySigningData != null ? (AttestedKeySigningData) AttestedKeySigningData.ADAPTER.redact(attestedKeySigningData) : null;
                AppAttestSigningData appAttestSigningData = value.ios_signing_data;
                AppAttestSigningData appAttestSigningData2 = appAttestSigningData != null ? (AppAttestSigningData) AppAttestSigningData.ADAPTER.redact(appAttestSigningData) : null;
                ByteString byteString = ByteString.EMPTY;
                Integer num = value.serialization_version;
                ByteString byteString2 = value.mri_context;
                byteString.getClass();
                return new SignedSerializedMRIContext(num, byteString2, attestedKeySigningData2, appAttestSigningData2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SignedSerializedMRIContext value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AppAttestSigningData.ADAPTER.encodeWithTag(writer, 4, value.ios_signing_data);
                AttestedKeySigningData.ADAPTER.encodeWithTag(writer, 3, value.signing_data);
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.mri_context);
                ProtoAdapter.INT32.encodeWithTag(writer, 1, value.serialization_version);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignedSerializedMRIContext(Integer num, ByteString byteString, AttestedKeySigningData attestedKeySigningData, AppAttestSigningData appAttestSigningData, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.serialization_version = num;
        this.mri_context = byteString;
        this.signing_data = attestedKeySigningData;
        this.ios_signing_data = appAttestSigningData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignedSerializedMRIContext)) {
            return false;
        }
        SignedSerializedMRIContext signedSerializedMRIContext = (SignedSerializedMRIContext) obj;
        return Intrinsics.areEqual(unknownFields(), signedSerializedMRIContext.unknownFields()) && Intrinsics.areEqual(this.serialization_version, signedSerializedMRIContext.serialization_version) && Intrinsics.areEqual(this.mri_context, signedSerializedMRIContext.mri_context) && Intrinsics.areEqual(this.signing_data, signedSerializedMRIContext.signing_data) && Intrinsics.areEqual(this.ios_signing_data, signedSerializedMRIContext.ios_signing_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.serialization_version;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ByteString byteString = this.mri_context;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        AttestedKeySigningData attestedKeySigningData = this.signing_data;
        int hashCode4 = (hashCode3 + (attestedKeySigningData != null ? attestedKeySigningData.hashCode() : 0)) * 37;
        AppAttestSigningData appAttestSigningData = this.ios_signing_data;
        int hashCode5 = hashCode4 + (appAttestSigningData != null ? appAttestSigningData.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.serialization_version = this.serialization_version;
        builder.mri_context = this.mri_context;
        builder.signing_data = this.signing_data;
        builder.ios_signing_data = this.ios_signing_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.serialization_version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("serialization_version=", num, arrayList);
        }
        ByteString byteString = this.mri_context;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("mri_context=", byteString, arrayList);
        }
        AttestedKeySigningData attestedKeySigningData = this.signing_data;
        if (attestedKeySigningData != null) {
            arrayList.add("signing_data=" + attestedKeySigningData);
        }
        AppAttestSigningData appAttestSigningData = this.ios_signing_data;
        if (appAttestSigningData != null) {
            arrayList.add("ios_signing_data=" + appAttestSigningData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignedSerializedMRIContext{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext$Builder;", "", "body", "Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/security/mri/api/v1/SignedSerializedMRIContext;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SignedSerializedMRIContext build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SignedSerializedMRIContext(Integer num, ByteString byteString, AttestedKeySigningData attestedKeySigningData) {
        this(num, byteString, attestedKeySigningData, null, ByteString.EMPTY);
    }
}
