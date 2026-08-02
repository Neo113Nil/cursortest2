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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u0012\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker$Builder;", "", "requires_birthdate", "Ljava/lang/Boolean;", "requires_ssn", "getRequires_ssn$annotations", "()V", "requires_full_ssn", "requires_last_four_ssn", "requires_full_name", "requires_address", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IdentityVerificationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IdentityVerificationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean requires_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean requires_birthdate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean requires_full_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean requires_full_ssn;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean requires_last_four_ssn;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean requires_ssn;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\rJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker;", "<init>", "()V", "requires_birthdate", "", "Ljava/lang/Boolean;", "requires_ssn", "requires_full_ssn", "requires_last_four_ssn", "requires_full_name", "requires_address", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Boolean requires_address;
        public Boolean requires_birthdate;
        public Boolean requires_full_name;
        public Boolean requires_full_ssn;
        public Boolean requires_last_four_ssn;
        public Boolean requires_ssn;

        @Override // com.squareup.wire.Message.Builder
        public IdentityVerificationBlocker build() {
            return new IdentityVerificationBlocker(this.requires_birthdate, this.requires_ssn, this.requires_full_ssn, this.requires_last_four_ssn, this.requires_full_name, this.requires_address, buildUnknownFields());
        }

        public final Builder requires_address(Boolean requires_address) {
            this.requires_address = requires_address;
            return this;
        }

        public final Builder requires_birthdate(Boolean requires_birthdate) {
            this.requires_birthdate = requires_birthdate;
            return this;
        }

        public final Builder requires_full_name(Boolean requires_full_name) {
            this.requires_full_name = requires_full_name;
            return this;
        }

        public final Builder requires_full_ssn(Boolean requires_full_ssn) {
            this.requires_full_ssn = requires_full_ssn;
            return this;
        }

        public final Builder requires_last_four_ssn(Boolean requires_last_four_ssn) {
            this.requires_last_four_ssn = requires_last_four_ssn;
            return this;
        }

        @Deprecated
        public final Builder requires_ssn(Boolean requires_ssn) {
            this.requires_ssn = requires_ssn;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IdentityVerificationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.IdentityVerificationBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public IdentityVerificationBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new IdentityVerificationBlocker((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IdentityVerificationBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.requires_birthdate);
                protoAdapter2.encodeWithTag(writer, 2, value.requires_ssn);
                protoAdapter2.encodeWithTag(writer, 3, value.requires_full_ssn);
                protoAdapter2.encodeWithTag(writer, 4, value.requires_last_four_ssn);
                protoAdapter2.encodeWithTag(writer, 5, value.requires_full_name);
                protoAdapter2.encodeWithTag(writer, 6, value.requires_address);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IdentityVerificationBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(6, value.requires_address) + protoAdapter2.encodedSizeWithTag(5, value.requires_full_name) + protoAdapter2.encodedSizeWithTag(4, value.requires_last_four_ssn) + protoAdapter2.encodedSizeWithTag(3, value.requires_full_ssn) + protoAdapter2.encodedSizeWithTag(2, value.requires_ssn) + protoAdapter2.encodedSizeWithTag(1, value.requires_birthdate) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IdentityVerificationBlocker redact(IdentityVerificationBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.requires_birthdate;
                Boolean bool2 = value.requires_ssn;
                Boolean bool3 = value.requires_full_ssn;
                Boolean bool4 = value.requires_last_four_ssn;
                Boolean bool5 = value.requires_full_name;
                Boolean bool6 = value.requires_address;
                value.getClass();
                byteString.getClass();
                return new IdentityVerificationBlocker(bool, bool2, bool3, bool4, bool5, bool6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IdentityVerificationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 6, value.requires_address);
                protoAdapter2.encodeWithTag(writer, 5, value.requires_full_name);
                protoAdapter2.encodeWithTag(writer, 4, value.requires_last_four_ssn);
                protoAdapter2.encodeWithTag(writer, 3, value.requires_full_ssn);
                protoAdapter2.encodeWithTag(writer, 2, value.requires_ssn);
                protoAdapter2.encodeWithTag(writer, 1, value.requires_birthdate);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityVerificationBlocker(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.requires_birthdate = bool;
        this.requires_ssn = bool2;
        this.requires_full_ssn = bool3;
        this.requires_last_four_ssn = bool4;
        this.requires_full_name = bool5;
        this.requires_address = bool6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdentityVerificationBlocker)) {
            return false;
        }
        IdentityVerificationBlocker identityVerificationBlocker = (IdentityVerificationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), identityVerificationBlocker.unknownFields()) && Intrinsics.areEqual(this.requires_birthdate, identityVerificationBlocker.requires_birthdate) && Intrinsics.areEqual(this.requires_ssn, identityVerificationBlocker.requires_ssn) && Intrinsics.areEqual(this.requires_full_ssn, identityVerificationBlocker.requires_full_ssn) && Intrinsics.areEqual(this.requires_last_four_ssn, identityVerificationBlocker.requires_last_four_ssn) && Intrinsics.areEqual(this.requires_full_name, identityVerificationBlocker.requires_full_name) && Intrinsics.areEqual(this.requires_address, identityVerificationBlocker.requires_address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.requires_birthdate;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.requires_ssn;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.requires_full_ssn;
        int hashCode4 = (hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.requires_last_four_ssn;
        int hashCode5 = (hashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.requires_full_name;
        int hashCode6 = (hashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.requires_address;
        int hashCode7 = hashCode6 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.requires_birthdate = this.requires_birthdate;
        builder.requires_ssn = this.requires_ssn;
        builder.requires_full_ssn = this.requires_full_ssn;
        builder.requires_last_four_ssn = this.requires_last_four_ssn;
        builder.requires_full_name = this.requires_full_name;
        builder.requires_address = this.requires_address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.requires_birthdate;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_birthdate=", bool, arrayList);
        }
        Boolean bool2 = this.requires_ssn;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_ssn=", bool2, arrayList);
        }
        Boolean bool3 = this.requires_full_ssn;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_full_ssn=", bool3, arrayList);
        }
        Boolean bool4 = this.requires_last_four_ssn;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_last_four_ssn=", bool4, arrayList);
        }
        Boolean bool5 = this.requires_full_name;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_full_name=", bool5, arrayList);
        }
        Boolean bool6 = this.requires_address;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_address=", bool6, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdentityVerificationBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/IdentityVerificationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ IdentityVerificationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
