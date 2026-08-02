package com.squareup.protos.franklin.api;

import android.os.Parcelable;
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

@Deprecated
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker$Builder;", "", "header_title", "Ljava/lang/String;", "action_data", "transaction_type", "transaction_id", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2AdyenEnvironment;", "environment", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2AdyenEnvironment;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThreeDomainSecureV2Blocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ThreeDomainSecureV2Blocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String action_data;

    @WireField(adapter = "com.squareup.protos.franklin.api.ThreeDomainSecureV2AdyenEnvironment#ADAPTER", schemaIndex = 4, tag = 5)
    public final ThreeDomainSecureV2AdyenEnvironment environment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String header_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String transaction_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String transaction_type;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker;", "<init>", "()V", "header_title", "", "action_data", "transaction_type", "transaction_id", "environment", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2AdyenEnvironment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String action_data;
        public ThreeDomainSecureV2AdyenEnvironment environment;
        public String header_title;
        public String transaction_id;
        public String transaction_type;

        public final Builder action_data(String action_data) {
            this.action_data = action_data;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreeDomainSecureV2Blocker build() {
            return new ThreeDomainSecureV2Blocker(this.header_title, this.action_data, this.transaction_type, this.transaction_id, this.environment, buildUnknownFields());
        }

        public final Builder environment(ThreeDomainSecureV2AdyenEnvironment environment) {
            this.environment = environment;
            return this;
        }

        public final Builder header_title(String header_title) {
            this.header_title = header_title;
            return this;
        }

        public final Builder transaction_id(String transaction_id) {
            this.transaction_id = transaction_id;
            return this;
        }

        public final Builder transaction_type(String transaction_type) {
            this.transaction_type = transaction_type;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ThreeDomainSecureV2Blocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ThreeDomainSecureV2Blocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ThreeDomainSecureV2Blocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ThreeDomainSecureV2Blocker((String) obj, (String) obj2, (String) obj3, (String) obj4, (ThreeDomainSecureV2AdyenEnvironment) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj5 = ThreeDomainSecureV2AdyenEnvironment.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ThreeDomainSecureV2Blocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.header_title);
                protoAdapter2.encodeWithTag(writer, 2, value.action_data);
                protoAdapter2.encodeWithTag(writer, 3, value.transaction_type);
                protoAdapter2.encodeWithTag(writer, 4, value.transaction_id);
                ThreeDomainSecureV2AdyenEnvironment.ADAPTER.encodeWithTag(writer, 5, value.environment);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ThreeDomainSecureV2Blocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ThreeDomainSecureV2AdyenEnvironment.ADAPTER.encodedSizeWithTag(5, value.environment) + protoAdapter2.encodedSizeWithTag(4, value.transaction_id) + protoAdapter2.encodedSizeWithTag(3, value.transaction_type) + protoAdapter2.encodedSizeWithTag(2, value.action_data) + protoAdapter2.encodedSizeWithTag(1, value.header_title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ThreeDomainSecureV2Blocker redact(ThreeDomainSecureV2Blocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.header_title;
                String str2 = value.action_data;
                String str3 = value.transaction_type;
                String str4 = value.transaction_id;
                ThreeDomainSecureV2AdyenEnvironment threeDomainSecureV2AdyenEnvironment = value.environment;
                value.getClass();
                byteString.getClass();
                return new ThreeDomainSecureV2Blocker(str, str2, str3, str4, threeDomainSecureV2AdyenEnvironment, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ThreeDomainSecureV2Blocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ThreeDomainSecureV2AdyenEnvironment.ADAPTER.encodeWithTag(writer, 5, value.environment);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.transaction_id);
                protoAdapter2.encodeWithTag(writer, 3, value.transaction_type);
                protoAdapter2.encodeWithTag(writer, 2, value.action_data);
                protoAdapter2.encodeWithTag(writer, 1, value.header_title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDomainSecureV2Blocker(String str, String str2, String str3, String str4, ThreeDomainSecureV2AdyenEnvironment threeDomainSecureV2AdyenEnvironment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header_title = str;
        this.action_data = str2;
        this.transaction_type = str3;
        this.transaction_id = str4;
        this.environment = threeDomainSecureV2AdyenEnvironment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThreeDomainSecureV2Blocker)) {
            return false;
        }
        ThreeDomainSecureV2Blocker threeDomainSecureV2Blocker = (ThreeDomainSecureV2Blocker) obj;
        return Intrinsics.areEqual(unknownFields(), threeDomainSecureV2Blocker.unknownFields()) && Intrinsics.areEqual(this.header_title, threeDomainSecureV2Blocker.header_title) && Intrinsics.areEqual(this.action_data, threeDomainSecureV2Blocker.action_data) && Intrinsics.areEqual(this.transaction_type, threeDomainSecureV2Blocker.transaction_type) && Intrinsics.areEqual(this.transaction_id, threeDomainSecureV2Blocker.transaction_id) && this.environment == threeDomainSecureV2Blocker.environment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.action_data;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.transaction_type;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.transaction_id;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        ThreeDomainSecureV2AdyenEnvironment threeDomainSecureV2AdyenEnvironment = this.environment;
        int hashCode6 = hashCode5 + (threeDomainSecureV2AdyenEnvironment != null ? threeDomainSecureV2AdyenEnvironment.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header_title = this.header_title;
        builder.action_data = this.action_data;
        builder.transaction_type = this.transaction_type;
        builder.transaction_id = this.transaction_id;
        builder.environment = this.environment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_title=", arrayList);
        }
        String str2 = this.action_data;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_data=", arrayList);
        }
        String str3 = this.transaction_type;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "transaction_type=", arrayList);
        }
        String str4 = this.transaction_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "transaction_id=", arrayList);
        }
        ThreeDomainSecureV2AdyenEnvironment threeDomainSecureV2AdyenEnvironment = this.environment;
        if (threeDomainSecureV2AdyenEnvironment != null) {
            arrayList.add("environment=" + threeDomainSecureV2AdyenEnvironment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ThreeDomainSecureV2Blocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2Blocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ThreeDomainSecureV2Blocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
