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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/GooglePayPaymentToken;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/GooglePayPaymentToken$Builder;", "", "token", "Ljava/lang/String;", "getToken$annotations", "()V", "merchantId", "fideliusToken", "cardDetails", "firstName", "lastName", "Lcom/squareup/protos/common/location/GlobalAddress;", "billingAddress", "Lcom/squareup/protos/common/location/GlobalAddress;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GooglePayPaymentToken extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GooglePayPaymentToken> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.location.GlobalAddress#ADAPTER", redacted = true, schemaIndex = 6, tag = 7)
    public final GlobalAddress billingAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String cardDetails;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String fideliusToken;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
    public final String firstName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 6)
    public final String lastName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String merchantId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String token;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/GooglePayPaymentToken$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/GooglePayPaymentToken;", "<init>", "()V", "token", "", "merchantId", "fideliusToken", "cardDetails", "firstName", "lastName", "billingAddress", "Lcom/squareup/protos/common/location/GlobalAddress;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public GlobalAddress billingAddress;
        public String cardDetails;
        public String fideliusToken;
        public String firstName;
        public String lastName;
        public String merchantId;
        public String token;

        public final Builder billingAddress(GlobalAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public GooglePayPaymentToken build() {
            return new GooglePayPaymentToken(this.token, this.merchantId, this.fideliusToken, this.cardDetails, this.firstName, this.lastName, this.billingAddress, buildUnknownFields());
        }

        public final Builder cardDetails(String cardDetails) {
            this.cardDetails = cardDetails;
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

        public final Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public final Builder merchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        @Deprecated
        public final Builder token(String token) {
            this.token = token;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GooglePayPaymentToken.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GooglePayPaymentToken$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public GooglePayPaymentToken decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new GooglePayPaymentToken((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (GlobalAddress) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
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
                            obj7 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, reader, obj7);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GooglePayPaymentToken value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.token);
                protoAdapter2.encodeWithTag(writer, 2, value.merchantId);
                protoAdapter2.encodeWithTag(writer, 3, value.fideliusToken);
                protoAdapter2.encodeWithTag(writer, 4, value.cardDetails);
                protoAdapter2.encodeWithTag(writer, 5, value.firstName);
                protoAdapter2.encodeWithTag(writer, 6, value.lastName);
                GlobalAddress.ADAPTER.encodeWithTag(writer, 7, value.billingAddress);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GooglePayPaymentToken value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return GlobalAddress.ADAPTER.encodedSizeWithTag(7, value.billingAddress) + protoAdapter2.encodedSizeWithTag(6, value.lastName) + protoAdapter2.encodedSizeWithTag(5, value.firstName) + protoAdapter2.encodedSizeWithTag(4, value.cardDetails) + protoAdapter2.encodedSizeWithTag(3, value.fideliusToken) + protoAdapter2.encodedSizeWithTag(2, value.merchantId) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GooglePayPaymentToken redact(GooglePayPaymentToken value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.merchantId;
                String str2 = value.fideliusToken;
                String str3 = value.cardDetails;
                value.getClass();
                byteString.getClass();
                return new GooglePayPaymentToken(null, str, str2, str3, null, null, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GooglePayPaymentToken value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                GlobalAddress.ADAPTER.encodeWithTag(writer, 7, value.billingAddress);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.lastName);
                protoAdapter2.encodeWithTag(writer, 5, value.firstName);
                protoAdapter2.encodeWithTag(writer, 4, value.cardDetails);
                protoAdapter2.encodeWithTag(writer, 3, value.fideliusToken);
                protoAdapter2.encodeWithTag(writer, 2, value.merchantId);
                protoAdapter2.encodeWithTag(writer, 1, value.token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentToken(String str, String str2, String str3, String str4, String str5, String str6, GlobalAddress globalAddress, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.merchantId = str2;
        this.fideliusToken = str3;
        this.cardDetails = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.billingAddress = globalAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GooglePayPaymentToken)) {
            return false;
        }
        GooglePayPaymentToken googlePayPaymentToken = (GooglePayPaymentToken) obj;
        return Intrinsics.areEqual(unknownFields(), googlePayPaymentToken.unknownFields()) && Intrinsics.areEqual(this.token, googlePayPaymentToken.token) && Intrinsics.areEqual(this.merchantId, googlePayPaymentToken.merchantId) && Intrinsics.areEqual(this.fideliusToken, googlePayPaymentToken.fideliusToken) && Intrinsics.areEqual(this.cardDetails, googlePayPaymentToken.cardDetails) && Intrinsics.areEqual(this.firstName, googlePayPaymentToken.firstName) && Intrinsics.areEqual(this.lastName, googlePayPaymentToken.lastName) && Intrinsics.areEqual(this.billingAddress, googlePayPaymentToken.billingAddress);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.merchantId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.fideliusToken;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cardDetails;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.firstName;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.lastName;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.billingAddress;
        int hashCode8 = hashCode7 + (globalAddress != null ? globalAddress.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.merchantId = this.merchantId;
        builder.fideliusToken = this.fideliusToken;
        builder.cardDetails = this.cardDetails;
        builder.firstName = this.firstName;
        builder.lastName = this.lastName;
        builder.billingAddress = this.billingAddress;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.token != null) {
            arrayList.add("token=██");
        }
        String str = this.merchantId;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchantId=", arrayList);
        }
        String str2 = this.fideliusToken;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "fideliusToken=", arrayList);
        }
        String str3 = this.cardDetails;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cardDetails=", arrayList);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GooglePayPaymentToken{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/GooglePayPaymentToken$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/GooglePayPaymentToken$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/GooglePayPaymentToken;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/GooglePayPaymentToken;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ GooglePayPaymentToken build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
