package com.squareup.protos.cash.security.mri.api.v1;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData$Builder;", "", "key_alias", "Ljava/lang/String;", "Lokio/ByteString;", "signature", "Lokio/ByteString;", "", "certificate_chain", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AttestedKeySigningData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AttestedKeySigningData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 1)
    public final List<ByteString> certificate_chain;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 3)
    public final String key_alias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 2, tag = 2)
    public final ByteString signature;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData;", "<init>", "()V", "key_alias", "", "certificate_chain", "", "Lokio/ByteString;", "signature", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public List<? extends ByteString> certificate_chain = EmptyList.INSTANCE;
        public String key_alias;
        public ByteString signature;

        @Override // com.squareup.wire.Message.Builder
        public AttestedKeySigningData build() {
            return new AttestedKeySigningData(this.key_alias, this.certificate_chain, this.signature, buildUnknownFields());
        }

        public final Builder certificate_chain(List<? extends ByteString> certificate_chain) {
            certificate_chain.getClass();
            TransactorKt.checkElementsNotNull(certificate_chain);
            this.certificate_chain = certificate_chain;
            return this;
        }

        public final Builder key_alias(String key_alias) {
            this.key_alias = key_alias;
            return this;
        }

        public final Builder signature(ByteString signature) {
            this.signature = signature;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AttestedKeySigningData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.security.mri.api.v1.AttestedKeySigningData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AttestedKeySigningData decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AttestedKeySigningData((String) obj, m, (ByteString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.BYTES.decode(reader));
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BYTES.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AttestedKeySigningData value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.key_alias);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.certificate_chain);
                protoAdapter2.encodeWithTag(writer, 2, value.signature);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AttestedKeySigningData value) {
                value.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, value.key_alias) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                return protoAdapter2.encodedSizeWithTag(2, value.signature) + protoAdapter2.asRepeated().encodedSizeWithTag(1, value.certificate_chain) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AttestedKeySigningData redact(AttestedKeySigningData value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.key_alias;
                List<ByteString> list = value.certificate_chain;
                ByteString byteString2 = value.signature;
                value.getClass();
                list.getClass();
                byteString.getClass();
                return new AttestedKeySigningData(str, list, byteString2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AttestedKeySigningData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BYTES;
                protoAdapter2.encodeWithTag(writer, 2, value.signature);
                protoAdapter2.asRepeated().encodeWithTag(writer, 1, value.certificate_chain);
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.key_alias);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttestedKeySigningData(String str, List list, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        list.getClass();
        byteString2.getClass();
        this.key_alias = str;
        this.signature = byteString;
        this.certificate_chain = TransactorKt.immutableCopyOf("certificate_chain", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AttestedKeySigningData)) {
            return false;
        }
        AttestedKeySigningData attestedKeySigningData = (AttestedKeySigningData) obj;
        return Intrinsics.areEqual(unknownFields(), attestedKeySigningData.unknownFields()) && Intrinsics.areEqual(this.key_alias, attestedKeySigningData.key_alias) && Intrinsics.areEqual(this.certificate_chain, attestedKeySigningData.certificate_chain) && Intrinsics.areEqual(this.signature, attestedKeySigningData.signature);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.key_alias;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.certificate_chain);
        ByteString byteString = this.signature;
        int hashCode2 = m + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.key_alias = this.key_alias;
        builder.certificate_chain = this.certificate_chain;
        builder.signature = this.signature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.key_alias;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "key_alias=", arrayList);
        }
        if (!this.certificate_chain.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("certificate_chain=", arrayList, this.certificate_chain);
        }
        ByteString byteString = this.signature;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("signature=", byteString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AttestedKeySigningData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData$Builder;", "", "body", "Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/security/mri/api/v1/AttestedKeySigningData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AttestedKeySigningData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
