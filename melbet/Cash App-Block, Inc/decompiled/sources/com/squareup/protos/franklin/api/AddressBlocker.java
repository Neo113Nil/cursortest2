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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/AddressBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AddressBlocker$Builder;", "", "requires_postal_code", "Ljava/lang/Boolean;", "requires_street_address", "requires_city", "requires_state", "autofill", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddressBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddressBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean autofill;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean requires_city;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean requires_postal_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean requires_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean requires_street_address;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/AddressBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AddressBlocker;", "<init>", "()V", "requires_postal_code", "", "Ljava/lang/Boolean;", "requires_street_address", "requires_city", "requires_state", "autofill", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/AddressBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Boolean autofill;
        public Boolean requires_city;
        public Boolean requires_postal_code;
        public Boolean requires_state;
        public Boolean requires_street_address;

        public final Builder autofill(Boolean autofill) {
            this.autofill = autofill;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddressBlocker build() {
            return new AddressBlocker(this.requires_postal_code, this.requires_street_address, this.requires_city, this.requires_state, this.autofill, buildUnknownFields());
        }

        public final Builder requires_city(Boolean requires_city) {
            this.requires_city = requires_city;
            return this;
        }

        public final Builder requires_postal_code(Boolean requires_postal_code) {
            this.requires_postal_code = requires_postal_code;
            return this;
        }

        public final Builder requires_state(Boolean requires_state) {
            this.requires_state = requires_state;
            return this;
        }

        public final Builder requires_street_address(Boolean requires_street_address) {
            this.requires_street_address = requires_street_address;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddressBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AddressBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AddressBlocker decode(ProtoReader reader) {
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
                        return new AddressBlocker((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AddressBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.requires_postal_code);
                protoAdapter2.encodeWithTag(writer, 2, value.requires_street_address);
                protoAdapter2.encodeWithTag(writer, 3, value.requires_city);
                protoAdapter2.encodeWithTag(writer, 4, value.requires_state);
                protoAdapter2.encodeWithTag(writer, 5, value.autofill);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AddressBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(5, value.autofill) + protoAdapter2.encodedSizeWithTag(4, value.requires_state) + protoAdapter2.encodedSizeWithTag(3, value.requires_city) + protoAdapter2.encodedSizeWithTag(2, value.requires_street_address) + protoAdapter2.encodedSizeWithTag(1, value.requires_postal_code) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AddressBlocker redact(AddressBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.requires_postal_code;
                Boolean bool2 = value.requires_street_address;
                Boolean bool3 = value.requires_city;
                Boolean bool4 = value.requires_state;
                Boolean bool5 = value.autofill;
                value.getClass();
                byteString.getClass();
                return new AddressBlocker(bool, bool2, bool3, bool4, bool5, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AddressBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 5, value.autofill);
                protoAdapter2.encodeWithTag(writer, 4, value.requires_state);
                protoAdapter2.encodeWithTag(writer, 3, value.requires_city);
                protoAdapter2.encodeWithTag(writer, 2, value.requires_street_address);
                protoAdapter2.encodeWithTag(writer, 1, value.requires_postal_code);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressBlocker(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.requires_postal_code = bool;
        this.requires_street_address = bool2;
        this.requires_city = bool3;
        this.requires_state = bool4;
        this.autofill = bool5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddressBlocker)) {
            return false;
        }
        AddressBlocker addressBlocker = (AddressBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), addressBlocker.unknownFields()) && Intrinsics.areEqual(this.requires_postal_code, addressBlocker.requires_postal_code) && Intrinsics.areEqual(this.requires_street_address, addressBlocker.requires_street_address) && Intrinsics.areEqual(this.requires_city, addressBlocker.requires_city) && Intrinsics.areEqual(this.requires_state, addressBlocker.requires_state) && Intrinsics.areEqual(this.autofill, addressBlocker.autofill);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.requires_postal_code;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.requires_street_address;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.requires_city;
        int hashCode4 = (hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.requires_state;
        int hashCode5 = (hashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.autofill;
        int hashCode6 = hashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.requires_postal_code = this.requires_postal_code;
        builder.requires_street_address = this.requires_street_address;
        builder.requires_city = this.requires_city;
        builder.requires_state = this.requires_state;
        builder.autofill = this.autofill;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.requires_postal_code;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_postal_code=", bool, arrayList);
        }
        Boolean bool2 = this.requires_street_address;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_street_address=", bool2, arrayList);
        }
        Boolean bool3 = this.requires_city;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_city=", bool3, arrayList);
        }
        Boolean bool4 = this.requires_state;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_state=", bool4, arrayList);
        }
        Boolean bool5 = this.autofill;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("autofill=", bool5, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddressBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AddressBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AddressBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AddressBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AddressBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AddressBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
