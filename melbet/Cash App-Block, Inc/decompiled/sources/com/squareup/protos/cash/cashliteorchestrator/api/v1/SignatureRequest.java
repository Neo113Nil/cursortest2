package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SignatureRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Builder;", "", "type", "Ljava/lang/String;", "Lokio/ByteString;", "challenge", "Lokio/ByteString;", "signing_envelope", "hash_algorithm", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage;", "preimage", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage;", "Companion", "Builder", "Preimage", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SignatureRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SignatureRequest> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 1, tag = 2)
    public final ByteString challenge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 6)
    public final String hash_algorithm;

    @WireSealedOneof(schemaIndex = 4)
    public final Preimage preimage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 2, tag = 3)
    public final ByteString signing_envelope;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String type;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest;", "<init>", "()V", "type", "", "challenge", "Lokio/ByteString;", "signing_envelope", "hash_algorithm", "preimage", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ByteString challenge;
        public String hash_algorithm;
        public Preimage preimage;
        public ByteString signing_envelope;
        public String type;

        @Override // com.squareup.wire.Message.Builder
        public SignatureRequest build() {
            return new SignatureRequest(this.type, this.challenge, this.signing_envelope, this.hash_algorithm, this.preimage, buildUnknownFields());
        }

        public final Builder challenge(ByteString challenge) {
            this.challenge = challenge;
            return this;
        }

        public final Builder hash_algorithm(String hash_algorithm) {
            this.hash_algorithm = hash_algorithm;
            return this;
        }

        public final Builder preimage(Preimage preimage) {
            this.preimage = preimage;
            return this;
        }

        public final Builder signing_envelope(ByteString signing_envelope) {
            this.signing_envelope = signing_envelope;
            return this;
        }

        public final Builder type(String type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SignatureRequest.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.SignatureRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SignatureRequest decode(ProtoReader reader) {
                SignatureRequest.Preimage useropPreimage;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                SignatureRequest.Preimage preimage = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SignatureRequest((String) obj, (ByteString) obj2, (ByteString) obj3, (String) obj4, preimage, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 2:
                            obj2 = ProtoAdapter.BYTES.decode(reader);
                            continue;
                        case 3:
                            obj3 = ProtoAdapter.BYTES.decode(reader);
                            continue;
                        case 4:
                            useropPreimage = new SignatureRequest.Preimage.UseropPreimage((UserOpPreimage) UserOpPreimage.ADAPTER.decode(reader));
                            break;
                        case 5:
                            useropPreimage = new SignatureRequest.Preimage.Eip7702Preimage((Eip7702AuthPreimage) Eip7702AuthPreimage.ADAPTER.decode(reader));
                            break;
                        case 6:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        default:
                            reader.readUnknownField(nextTag);
                            continue;
                    }
                    preimage = useropPreimage;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SignatureRequest value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.type);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BYTES;
                protoAdapter3.encodeWithTag(writer, 2, value.challenge);
                protoAdapter3.encodeWithTag(writer, 3, value.signing_envelope);
                protoAdapter2.encodeWithTag(writer, 6, value.hash_algorithm);
                SignatureRequest.Preimage preimage = value.preimage;
                if (preimage instanceof SignatureRequest.Preimage.UseropPreimage) {
                    UserOpPreimage.ADAPTER.encodeWithTag(writer, 4, ((SignatureRequest.Preimage.UseropPreimage) preimage).getValue());
                } else if (preimage instanceof SignatureRequest.Preimage.Eip7702Preimage) {
                    Eip7702AuthPreimage.ADAPTER.encodeWithTag(writer, 5, ((SignatureRequest.Preimage.Eip7702Preimage) preimage).getValue());
                } else if (preimage != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SignatureRequest value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.type) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BYTES;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(6, value.hash_algorithm) + protoAdapter3.encodedSizeWithTag(3, value.signing_envelope) + protoAdapter3.encodedSizeWithTag(2, value.challenge) + encodedSizeWithTag;
                SignatureRequest.Preimage preimage = value.preimage;
                if (preimage instanceof SignatureRequest.Preimage.UseropPreimage) {
                    return UserOpPreimage.ADAPTER.encodedSizeWithTag(4, ((SignatureRequest.Preimage.UseropPreimage) preimage).getValue()) + encodedSizeWithTag2;
                }
                if (preimage instanceof SignatureRequest.Preimage.Eip7702Preimage) {
                    return Eip7702AuthPreimage.ADAPTER.encodedSizeWithTag(5, ((SignatureRequest.Preimage.Eip7702Preimage) preimage).getValue()) + encodedSizeWithTag2;
                }
                if (preimage == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SignatureRequest redact(SignatureRequest value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.type;
                ByteString byteString2 = value.challenge;
                ByteString byteString3 = value.signing_envelope;
                String str2 = value.hash_algorithm;
                SignatureRequest.Preimage preimage = value.preimage;
                value.getClass();
                byteString.getClass();
                return new SignatureRequest(str, byteString2, byteString3, str2, preimage, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SignatureRequest value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SignatureRequest.Preimage preimage = value.preimage;
                if (preimage instanceof SignatureRequest.Preimage.UseropPreimage) {
                    UserOpPreimage.ADAPTER.encodeWithTag(writer, 4, ((SignatureRequest.Preimage.UseropPreimage) preimage).getValue());
                } else if (preimage instanceof SignatureRequest.Preimage.Eip7702Preimage) {
                    Eip7702AuthPreimage.ADAPTER.encodeWithTag(writer, 5, ((SignatureRequest.Preimage.Eip7702Preimage) preimage).getValue());
                } else if (preimage != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.hash_algorithm);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BYTES;
                protoAdapter3.encodeWithTag(writer, 3, value.signing_envelope);
                protoAdapter3.encodeWithTag(writer, 2, value.challenge);
                protoAdapter2.encodeWithTag(writer, 1, value.type);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureRequest(String str, ByteString byteString, ByteString byteString2, String str2, Preimage preimage, ByteString byteString3) {
        super(ADAPTER, byteString3);
        byteString3.getClass();
        this.type = str;
        this.challenge = byteString;
        this.signing_envelope = byteString2;
        this.hash_algorithm = str2;
        this.preimage = preimage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignatureRequest)) {
            return false;
        }
        SignatureRequest signatureRequest = (SignatureRequest) obj;
        return Intrinsics.areEqual(unknownFields(), signatureRequest.unknownFields()) && Intrinsics.areEqual(this.type, signatureRequest.type) && Intrinsics.areEqual(this.challenge, signatureRequest.challenge) && Intrinsics.areEqual(this.signing_envelope, signatureRequest.signing_envelope) && Intrinsics.areEqual(this.hash_algorithm, signatureRequest.hash_algorithm) && Intrinsics.areEqual(this.preimage, signatureRequest.preimage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.type;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.challenge;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.signing_envelope;
        int hashCode4 = (hashCode3 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        String str2 = this.hash_algorithm;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Preimage preimage = this.preimage;
        int hashCode6 = hashCode5 + (preimage != null ? preimage.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.challenge = this.challenge;
        builder.signing_envelope = this.signing_envelope;
        builder.hash_algorithm = this.hash_algorithm;
        builder.preimage = this.preimage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "type=", arrayList);
        }
        ByteString byteString = this.challenge;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("challenge=", byteString, arrayList);
        }
        ByteString byteString2 = this.signing_envelope;
        if (byteString2 != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("signing_envelope=", byteString2, arrayList);
        }
        String str2 = this.hash_algorithm;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "hash_algorithm=", arrayList);
        }
        Preimage preimage = this.preimage;
        if (preimage != null) {
            arrayList.add("preimage=" + preimage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SignatureRequest{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SignatureRequest build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage;", "", "<init>", "()V", "UseropPreimage", "Eip7702Preimage", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage$Eip7702Preimage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage$UseropPreimage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Preimage {

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.Eip7702AuthPreimage#ADAPTER", declaredName = "eip7702_preimage", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage$Eip7702Preimage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Eip7702AuthPreimage;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Eip7702AuthPreimage;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Eip7702AuthPreimage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Eip7702Preimage extends Preimage {
            private final Eip7702AuthPreimage value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Eip7702Preimage(Eip7702AuthPreimage eip7702AuthPreimage) {
                super(null);
                eip7702AuthPreimage.getClass();
                this.value = eip7702AuthPreimage;
            }

            public static /* synthetic */ Eip7702Preimage copy$default(Eip7702Preimage eip7702Preimage, Eip7702AuthPreimage eip7702AuthPreimage, int i, Object obj) {
                if ((i & 1) != 0) {
                    eip7702AuthPreimage = eip7702Preimage.value;
                }
                return eip7702Preimage.copy(eip7702AuthPreimage);
            }

            /* renamed from: component1, reason: from getter */
            public final Eip7702AuthPreimage getValue() {
                return this.value;
            }

            public final Eip7702Preimage copy(Eip7702AuthPreimage value) {
                value.getClass();
                return new Eip7702Preimage(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Eip7702Preimage) && Intrinsics.areEqual(this.value, ((Eip7702Preimage) other).value);
            }

            public final Eip7702AuthPreimage getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Eip7702Preimage(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.UserOpPreimage#ADAPTER", declaredName = "userop_preimage", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage$UseropPreimage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/SignatureRequest$Preimage;", "value", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage;", "<init>", "(Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage;)V", "getValue", "()Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UseropPreimage extends Preimage {
            private final UserOpPreimage value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UseropPreimage(UserOpPreimage userOpPreimage) {
                super(null);
                userOpPreimage.getClass();
                this.value = userOpPreimage;
            }

            public static /* synthetic */ UseropPreimage copy$default(UseropPreimage useropPreimage, UserOpPreimage userOpPreimage, int i, Object obj) {
                if ((i & 1) != 0) {
                    userOpPreimage = useropPreimage.value;
                }
                return useropPreimage.copy(userOpPreimage);
            }

            /* renamed from: component1, reason: from getter */
            public final UserOpPreimage getValue() {
                return this.value;
            }

            public final UseropPreimage copy(UserOpPreimage value) {
                value.getClass();
                return new UseropPreimage(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UseropPreimage) && Intrinsics.areEqual(this.value, ((UseropPreimage) other).value);
            }

            public final UserOpPreimage getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UseropPreimage(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Preimage(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Preimage() {
        }
    }
}
