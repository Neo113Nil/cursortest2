package com.squareup.protos.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/common/Money;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/Money$Builder;", "", "amount", "Ljava/lang/Long;", "Lcom/squareup/protos/common/CurrencyCode;", "currency_code", "Lcom/squareup/protos/common/CurrencyCode;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Money extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Money> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CurrencyCode DEFAULT_CURRENCY_CODE = CurrencyCode.USD;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 2)
    public final Long amount;

    @WireField(adapter = "com.squareup.protos.common.CurrencyCode#ADAPTER", schemaIndex = 1, tag = 3)
    public final CurrencyCode currency_code;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/common/Money$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/common/Money;", "<init>", "()V", "amount", "", "Ljava/lang/Long;", "currency_code", "Lcom/squareup/protos/common/CurrencyCode;", "(Ljava/lang/Long;)Lcom/squareup/protos/common/Money$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Long amount;
        public CurrencyCode currency_code;

        public final Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Money build() {
            return new Money(this.amount, this.currency_code, buildUnknownFields());
        }

        public final Builder currency_code(CurrencyCode currency_code) {
            this.currency_code = currency_code;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Money.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.common.Money$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Money decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Money((Long) obj, (CurrencyCode) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 2) {
                        obj = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = CurrencyCode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Money value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.INT64.encodeWithTag(writer, 2, value.amount);
                CurrencyCode.ADAPTER.encodeWithTag(writer, 3, value.currency_code);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Money value) {
                value.getClass();
                return CurrencyCode.ADAPTER.encodedSizeWithTag(3, value.currency_code) + ProtoAdapter.INT64.encodedSizeWithTag(2, value.amount) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Money redact(Money value) {
                value.getClass();
                return Money.copy$default(value, null, null, ByteString.EMPTY, 3);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Money value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                CurrencyCode.ADAPTER.encodeWithTag(writer, 3, value.currency_code);
                ProtoAdapter.INT64.encodeWithTag(writer, 2, value.amount);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ Money(Long l, CurrencyCode currencyCode, int i) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : currencyCode, ByteString.EMPTY);
    }

    public static Money copy$default(Money money, Long l, CurrencyCode currencyCode, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            l = money.amount;
        }
        if ((i & 2) != 0) {
            currencyCode = money.currency_code;
        }
        if ((i & 4) != 0) {
            byteString = money.unknownFields();
        }
        money.getClass();
        byteString.getClass();
        return new Money(l, currencyCode, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return Intrinsics.areEqual(unknownFields(), money.unknownFields()) && Intrinsics.areEqual(this.amount, money.amount) && this.currency_code == money.currency_code;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.amount;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        CurrencyCode currencyCode = this.currency_code;
        int hashCode3 = hashCode2 + (currencyCode != null ? currencyCode.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.amount = this.amount;
        builder.currency_code = this.currency_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
        }
        CurrencyCode currencyCode = this.currency_code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency_code=", currencyCode, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Money{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/common/Money$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/common/Money$Builder;", "", "body", "Lcom/squareup/protos/common/Money;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/common/Money;", "Lcom/squareup/protos/common/CurrencyCode;", "DEFAULT_CURRENCY_CODE", "Lcom/squareup/protos/common/CurrencyCode;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Money build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Money(Long l, CurrencyCode currencyCode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = l;
        this.currency_code = currencyCode;
    }
}
