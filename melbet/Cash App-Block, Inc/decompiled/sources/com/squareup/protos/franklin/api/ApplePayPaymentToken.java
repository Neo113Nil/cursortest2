package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.location.GlobalAddress;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/ApplePayPaymentToken;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ApplePayPaymentToken$Builder;", "", "data", "Ljava/lang/String;", "getData$annotations", "()V", "Lcom/squareup/protos/franklin/api/ApplePayPaymentTokenHeader;", "header", "Lcom/squareup/protos/franklin/api/ApplePayPaymentTokenHeader;", "signature", "version", "fideliusToken", "displayName", "firstName", "lastName", "Lcom/squareup/protos/common/location/GlobalAddress;", "billingAddress", "Lcom/squareup/protos/common/location/GlobalAddress;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApplePayPaymentToken extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ApplePayPaymentToken> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.location.GlobalAddress#ADAPTER", redacted = true, schemaIndex = 8, tag = 9)
    public final GlobalAddress billingAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String displayName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String fideliusToken;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 7)
    public final String firstName;

    @WireField(adapter = "com.squareup.protos.franklin.api.ApplePayPaymentTokenHeader#ADAPTER", schemaIndex = 1, tag = 2)
    public final ApplePayPaymentTokenHeader header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 7, tag = 8)
    public final String lastName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String signature;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String version;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ApplePayPaymentToken$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ApplePayPaymentToken;", "<init>", "()V", "data", "", "header", "Lcom/squareup/protos/franklin/api/ApplePayPaymentTokenHeader;", "signature", "version", "fideliusToken", "displayName", "firstName", "lastName", "billingAddress", "Lcom/squareup/protos/common/location/GlobalAddress;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public GlobalAddress billingAddress;
        public String data;
        public String displayName;
        public String fideliusToken;
        public String firstName;
        public ApplePayPaymentTokenHeader header;
        public String lastName;
        public String signature;
        public String version;

        public final Builder billingAddress(GlobalAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ApplePayPaymentToken build() {
            return new ApplePayPaymentToken(this.data, this.header, this.signature, this.version, this.fideliusToken, this.displayName, this.firstName, this.lastName, this.billingAddress, buildUnknownFields());
        }

        @Deprecated
        public final Builder data(String data) {
            this.data = data;
            return this;
        }

        public final Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public final Builder fideliusToken(String fideliusToken) {
            this.fideliusToken = fideliusToken;
            return this;
        }

        public final Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public final Builder header(ApplePayPaymentTokenHeader header) {
            this.header = header;
            return this;
        }

        public final Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public final Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public final Builder version(String version) {
            this.version = version;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ApplePayPaymentToken.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ApplePayPaymentToken$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ApplePayPaymentToken decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ApplePayPaymentToken((String) obj, (ApplePayPaymentTokenHeader) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (GlobalAddress) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(ApplePayPaymentTokenHeader.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            obj9 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, reader, obj9);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ApplePayPaymentToken value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.data);
                ApplePayPaymentTokenHeader.ADAPTER.encodeWithTag(writer, 2, value.header);
                protoAdapter2.encodeWithTag(writer, 3, value.signature);
                protoAdapter2.encodeWithTag(writer, 4, value.version);
                protoAdapter2.encodeWithTag(writer, 5, value.fideliusToken);
                protoAdapter2.encodeWithTag(writer, 6, value.displayName);
                protoAdapter2.encodeWithTag(writer, 7, value.firstName);
                protoAdapter2.encodeWithTag(writer, 8, value.lastName);
                GlobalAddress.ADAPTER.encodeWithTag(writer, 9, value.billingAddress);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ApplePayPaymentToken value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return GlobalAddress.ADAPTER.encodedSizeWithTag(9, value.billingAddress) + protoAdapter2.encodedSizeWithTag(8, value.lastName) + protoAdapter2.encodedSizeWithTag(7, value.firstName) + protoAdapter2.encodedSizeWithTag(6, value.displayName) + protoAdapter2.encodedSizeWithTag(5, value.fideliusToken) + protoAdapter2.encodedSizeWithTag(4, value.version) + protoAdapter2.encodedSizeWithTag(3, value.signature) + ApplePayPaymentTokenHeader.ADAPTER.encodedSizeWithTag(2, value.header) + protoAdapter2.encodedSizeWithTag(1, value.data) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ApplePayPaymentToken redact(ApplePayPaymentToken value) {
                value.getClass();
                ApplePayPaymentTokenHeader applePayPaymentTokenHeader = value.header;
                ApplePayPaymentTokenHeader applePayPaymentTokenHeader2 = applePayPaymentTokenHeader != null ? (ApplePayPaymentTokenHeader) ApplePayPaymentTokenHeader.ADAPTER.redact(applePayPaymentTokenHeader) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.version;
                String str2 = value.fideliusToken;
                String str3 = value.displayName;
                byteString.getClass();
                return new ApplePayPaymentToken(null, applePayPaymentTokenHeader2, null, str, str2, str3, null, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ApplePayPaymentToken value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                GlobalAddress.ADAPTER.encodeWithTag(writer, 9, value.billingAddress);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.lastName);
                protoAdapter2.encodeWithTag(writer, 7, value.firstName);
                protoAdapter2.encodeWithTag(writer, 6, value.displayName);
                protoAdapter2.encodeWithTag(writer, 5, value.fideliusToken);
                protoAdapter2.encodeWithTag(writer, 4, value.version);
                protoAdapter2.encodeWithTag(writer, 3, value.signature);
                ApplePayPaymentTokenHeader.ADAPTER.encodeWithTag(writer, 2, value.header);
                protoAdapter2.encodeWithTag(writer, 1, value.data);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplePayPaymentToken(String str, ApplePayPaymentTokenHeader applePayPaymentTokenHeader, String str2, String str3, String str4, String str5, String str6, String str7, GlobalAddress globalAddress, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.data = str;
        this.header = applePayPaymentTokenHeader;
        this.signature = str2;
        this.version = str3;
        this.fideliusToken = str4;
        this.displayName = str5;
        this.firstName = str6;
        this.lastName = str7;
        this.billingAddress = globalAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplePayPaymentToken)) {
            return false;
        }
        ApplePayPaymentToken applePayPaymentToken = (ApplePayPaymentToken) obj;
        return Intrinsics.areEqual(unknownFields(), applePayPaymentToken.unknownFields()) && Intrinsics.areEqual(this.data, applePayPaymentToken.data) && Intrinsics.areEqual(this.header, applePayPaymentToken.header) && Intrinsics.areEqual(this.signature, applePayPaymentToken.signature) && Intrinsics.areEqual(this.version, applePayPaymentToken.version) && Intrinsics.areEqual(this.fideliusToken, applePayPaymentToken.fideliusToken) && Intrinsics.areEqual(this.displayName, applePayPaymentToken.displayName) && Intrinsics.areEqual(this.firstName, applePayPaymentToken.firstName) && Intrinsics.areEqual(this.lastName, applePayPaymentToken.lastName) && Intrinsics.areEqual(this.billingAddress, applePayPaymentToken.billingAddress);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.data;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ApplePayPaymentTokenHeader applePayPaymentTokenHeader = this.header;
        int hashCode3 = (hashCode2 + (applePayPaymentTokenHeader != null ? applePayPaymentTokenHeader.hashCode() : 0)) * 37;
        String str2 = this.signature;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.version;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.fideliusToken;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.displayName;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.firstName;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.lastName;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.billingAddress;
        int hashCode10 = hashCode9 + (globalAddress != null ? globalAddress.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.data = this.data;
        builder.header = this.header;
        builder.signature = this.signature;
        builder.version = this.version;
        builder.fideliusToken = this.fideliusToken;
        builder.displayName = this.displayName;
        builder.firstName = this.firstName;
        builder.lastName = this.lastName;
        builder.billingAddress = this.billingAddress;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.data != null) {
            arrayList.add("data=██");
        }
        ApplePayPaymentTokenHeader applePayPaymentTokenHeader = this.header;
        if (applePayPaymentTokenHeader != null) {
            arrayList.add("header=" + applePayPaymentTokenHeader);
        }
        if (this.signature != null) {
            arrayList.add("signature=██");
        }
        String str = this.version;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "version=", arrayList);
        }
        String str2 = this.fideliusToken;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "fideliusToken=", arrayList);
        }
        String str3 = this.displayName;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "displayName=", arrayList);
        }
        if (this.firstName != null) {
            arrayList.add("firstName=██");
        }
        if (this.lastName != null) {
            arrayList.add("lastName=██");
        }
        if (this.billingAddress != null) {
            arrayList.add("billingAddress=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ApplePayPaymentToken{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ApplePayPaymentToken$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ApplePayPaymentToken$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ApplePayPaymentToken;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ApplePayPaymentToken;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ApplePayPaymentToken build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
