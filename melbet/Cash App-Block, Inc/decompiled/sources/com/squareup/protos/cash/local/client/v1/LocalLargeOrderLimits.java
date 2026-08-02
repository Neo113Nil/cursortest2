package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalLargeOrderLimits;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\u000f\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$Builder;", "", "max_quantity", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "max_subtotal_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$LimitMode;", "limit_mode", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$LimitMode;", "", "message", "Ljava/lang/String;", "Companion", "Builder", "LimitMode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalLargeOrderLimits extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalLargeOrderLimits> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalLargeOrderLimits$LimitMode#ADAPTER", schemaIndex = 2, tag = 3)
    public final LimitMode limit_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    public final Integer max_quantity;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalMoney max_subtotal_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String message;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits;", "<init>", "()V", "max_quantity", "", "Ljava/lang/Integer;", "max_subtotal_amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "limit_mode", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$LimitMode;", "message", "", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LimitMode limit_mode;
        public Integer max_quantity;
        public LocalMoney max_subtotal_amount;
        public String message;

        @Override // com.squareup.wire.Message.Builder
        public LocalLargeOrderLimits build() {
            return new LocalLargeOrderLimits(this.max_quantity, this.max_subtotal_amount, this.limit_mode, this.message, buildUnknownFields());
        }

        public final Builder limit_mode(LimitMode limit_mode) {
            this.limit_mode = limit_mode;
            return this;
        }

        public final Builder max_quantity(Integer max_quantity) {
            this.max_quantity = max_quantity;
            return this;
        }

        public final Builder max_subtotal_amount(LocalMoney max_subtotal_amount) {
            this.max_subtotal_amount = max_subtotal_amount;
            return this;
        }

        public final Builder message(String message) {
            this.message = message;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalLargeOrderLimits.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalLargeOrderLimits$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalLargeOrderLimits decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LocalLargeOrderLimits((Integer) obj, (LocalMoney) obj2, (LocalLargeOrderLimits.LimitMode) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT32.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        try {
                            obj3 = LocalLargeOrderLimits.LimitMode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalLargeOrderLimits value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.INT32.encodeWithTag(writer, 1, value.max_quantity);
                LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.max_subtotal_amount);
                LocalLargeOrderLimits.LimitMode.ADAPTER.encodeWithTag(writer, 3, value.limit_mode);
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.message);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalLargeOrderLimits value) {
                value.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(4, value.message) + LocalLargeOrderLimits.LimitMode.ADAPTER.encodedSizeWithTag(3, value.limit_mode) + LocalMoney.ADAPTER.encodedSizeWithTag(2, value.max_subtotal_amount) + ProtoAdapter.INT32.encodedSizeWithTag(1, value.max_quantity) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalLargeOrderLimits redact(LocalLargeOrderLimits value) {
                value.getClass();
                LocalMoney localMoney = value.max_subtotal_amount;
                LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                ByteString byteString = ByteString.EMPTY;
                Integer num = value.max_quantity;
                LocalLargeOrderLimits.LimitMode limitMode = value.limit_mode;
                String str = value.message;
                byteString.getClass();
                return new LocalLargeOrderLimits(num, localMoney2, limitMode, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalLargeOrderLimits value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.message);
                LocalLargeOrderLimits.LimitMode.ADAPTER.encodeWithTag(writer, 3, value.limit_mode);
                LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.max_subtotal_amount);
                ProtoAdapter.INT32.encodeWithTag(writer, 1, value.max_quantity);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLargeOrderLimits(Integer num, LocalMoney localMoney, LimitMode limitMode, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.max_quantity = num;
        this.max_subtotal_amount = localMoney;
        this.limit_mode = limitMode;
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalLargeOrderLimits)) {
            return false;
        }
        LocalLargeOrderLimits localLargeOrderLimits = (LocalLargeOrderLimits) obj;
        return Intrinsics.areEqual(unknownFields(), localLargeOrderLimits.unknownFields()) && Intrinsics.areEqual(this.max_quantity, localLargeOrderLimits.max_quantity) && Intrinsics.areEqual(this.max_subtotal_amount, localLargeOrderLimits.max_subtotal_amount) && this.limit_mode == localLargeOrderLimits.limit_mode && Intrinsics.areEqual(this.message, localLargeOrderLimits.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.max_quantity;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        LocalMoney localMoney = this.max_subtotal_amount;
        int hashCode3 = (hashCode2 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        LimitMode limitMode = this.limit_mode;
        int hashCode4 = (hashCode3 + (limitMode != null ? limitMode.hashCode() : 0)) * 37;
        String str = this.message;
        int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.max_quantity = this.max_quantity;
        builder.max_subtotal_amount = this.max_subtotal_amount;
        builder.limit_mode = this.limit_mode;
        builder.message = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.max_quantity;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_quantity=", num, arrayList);
        }
        LocalMoney localMoney = this.max_subtotal_amount;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("max_subtotal_amount=", localMoney, arrayList);
        }
        LimitMode limitMode = this.limit_mode;
        if (limitMode != null) {
            arrayList.add("limit_mode=" + limitMode);
        }
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalLargeOrderLimits{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$LimitMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LIMIT_MODE_UNSPECIFIED", "LIMIT_MODE_QUANTITY", "LIMIT_MODE_SUBTOTAL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LimitMode implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LimitMode[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final LimitMode LIMIT_MODE_QUANTITY;
        public static final LimitMode LIMIT_MODE_SUBTOTAL;
        public static final LimitMode LIMIT_MODE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ LimitMode[] $values() {
            return new LimitMode[]{LIMIT_MODE_UNSPECIFIED, LIMIT_MODE_QUANTITY, LIMIT_MODE_SUBTOTAL};
        }

        static {
            final LimitMode limitMode = new LimitMode("LIMIT_MODE_UNSPECIFIED", 0, 0);
            LIMIT_MODE_UNSPECIFIED = limitMode;
            LIMIT_MODE_QUANTITY = new LimitMode("LIMIT_MODE_QUANTITY", 1, 1);
            LIMIT_MODE_SUBTOTAL = new LimitMode("LIMIT_MODE_SUBTOTAL", 2, 2);
            LimitMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LimitMode.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, limitMode) { // from class: com.squareup.protos.cash.local.client.v1.LocalLargeOrderLimits$LimitMode$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public LocalLargeOrderLimits.LimitMode fromValue(int value) {
                    return LocalLargeOrderLimits.LimitMode.INSTANCE.fromValue(value);
                }
            };
        }

        private LimitMode(String str, int i, int i2) {
            this.value = i2;
        }

        public static final LimitMode fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static LimitMode valueOf(String str) {
            return (LimitMode) Enum.valueOf(LimitMode.class, str);
        }

        public static LimitMode[] values() {
            return (LimitMode[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$LimitMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$LimitMode;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final LimitMode fromValue(int value) {
                if (value == 0) {
                    return LimitMode.LIMIT_MODE_UNSPECIFIED;
                }
                if (value == 1) {
                    return LimitMode.LIMIT_MODE_QUANTITY;
                }
                if (value != 2) {
                    return null;
                }
                return LimitMode.LIMIT_MODE_SUBTOTAL;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalLargeOrderLimits;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalLargeOrderLimits build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
