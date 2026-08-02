package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\r\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/common/Reaction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/Reaction$Builder;", "Lcom/squareup/protos/franklin/common/Reaction$Type;", "type", "Lcom/squareup/protos/franklin/common/Reaction$Type;", "", "data", "Ljava/lang/String;", "", "created_at", "Ljava/lang/Long;", "customer_token", "Companion", "Builder", "Type", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Reaction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Reaction> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String customer_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String data;

    @WireField(adapter = "com.squareup.protos.franklin.common.Reaction$Type#ADAPTER", schemaIndex = 0, tag = 1)
    public final Type type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/common/Reaction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/Reaction;", "<init>", "()V", "type", "Lcom/squareup/protos/franklin/common/Reaction$Type;", "data", "", "created_at", "", "Ljava/lang/Long;", "customer_token", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/common/Reaction$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Long created_at;
        public String customer_token;
        public String data;
        public Type type;

        @Override // com.squareup.wire.Message.Builder
        public Reaction build() {
            return new Reaction(this.type, this.data, this.created_at, this.customer_token, buildUnknownFields());
        }

        public final Builder created_at(Long created_at) {
            this.created_at = created_at;
            return this;
        }

        public final Builder customer_token(String customer_token) {
            this.customer_token = customer_token;
            return this;
        }

        public final Builder data(String data) {
            this.data = data;
            return this;
        }

        public final Builder type(Type type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Reaction.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.Reaction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Reaction decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Reaction((Reaction.Type) obj, (String) obj2, (Long) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = Reaction.Type.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Reaction value) {
                writer.getClass();
                value.getClass();
                Reaction.Type.ADAPTER.encodeWithTag(writer, 1, value.type);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.data);
                ProtoAdapter.INT64.encodeWithTag(writer, 3, value.created_at);
                protoAdapter2.encodeWithTag(writer, 4, value.customer_token);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Reaction value) {
                value.getClass();
                int encodedSizeWithTag = Reaction.Type.ADAPTER.encodedSizeWithTag(1, value.type) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, value.customer_token) + ProtoAdapter.INT64.encodedSizeWithTag(3, value.created_at) + protoAdapter2.encodedSizeWithTag(2, value.data) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Reaction redact(Reaction value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Reaction.Type type2 = value.type;
                String str = value.data;
                Long l = value.created_at;
                String str2 = value.customer_token;
                value.getClass();
                byteString.getClass();
                return new Reaction(type2, str, l, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Reaction value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, value.customer_token);
                ProtoAdapter.INT64.encodeWithTag(writer, 3, value.created_at);
                protoAdapter2.encodeWithTag(writer, 2, value.data);
                Reaction.Type.ADAPTER.encodeWithTag(writer, 1, value.type);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Reaction(Type type2, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.type = type2;
        this.data = str;
        this.created_at = l;
        this.customer_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        return Intrinsics.areEqual(unknownFields(), reaction.unknownFields()) && this.type == reaction.type && Intrinsics.areEqual(this.data, reaction.data) && Intrinsics.areEqual(this.created_at, reaction.created_at) && Intrinsics.areEqual(this.customer_token, reaction.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.data;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.data = this.data;
        builder.created_at = this.created_at;
        builder.customer_token = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str = this.data;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "data=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Reaction{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/common/Reaction$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EMOJI", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type EMOJI = new Type("EMOJI", 0, 1);
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{EMOJI};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.Reaction$Type$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public Reaction.Type fromValue(int value) {
                    return Reaction.Type.INSTANCE.fromValue(value);
                }
            };
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/Reaction$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/Reaction$Type;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromValue(int value) {
                if (value == 1) {
                    return Type.EMOJI;
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/Reaction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/Reaction$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/Reaction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/Reaction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Reaction build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Reaction(Type type2, String str, int i) {
        this((i & 1) != 0 ? null : type2, str, null, null, ByteString.EMPTY);
    }
}
