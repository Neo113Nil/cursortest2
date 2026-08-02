package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker$Builder;", "", "requires_amount", "Ljava/lang/Boolean;", "requires_frequency", "Lcom/squareup/protos/common/Money;", "minimum_amount", "Lcom/squareup/protos/common/Money;", "maximum_amount", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "type", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "", "investment_entity_token", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScheduledTransactionBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledTransactionBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String investment_entity_token;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 3, tag = 4)
    public final Money maximum_amount;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
    public final Money minimum_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean requires_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean requires_frequency;

    @WireField(adapter = "com.squareup.protos.repeatedly.common.ScheduledTransactionPreference$Type#ADAPTER", schemaIndex = 4, tag = 5)
    public final ScheduledTransactionPreference.Type type;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker;", "<init>", "()V", "requires_amount", "", "Ljava/lang/Boolean;", "requires_frequency", "minimum_amount", "Lcom/squareup/protos/common/Money;", "maximum_amount", "type", "Lcom/squareup/protos/repeatedly/common/ScheduledTransactionPreference$Type;", "investment_entity_token", "", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String investment_entity_token;
        public Money maximum_amount;
        public Money minimum_amount;
        public Boolean requires_amount;
        public Boolean requires_frequency;
        public ScheduledTransactionPreference.Type type;

        @Override // com.squareup.wire.Message.Builder
        public ScheduledTransactionBlocker build() {
            return new ScheduledTransactionBlocker(this.requires_amount, this.requires_frequency, this.minimum_amount, this.maximum_amount, this.type, this.investment_entity_token, buildUnknownFields());
        }

        public final Builder investment_entity_token(String investment_entity_token) {
            this.investment_entity_token = investment_entity_token;
            return this;
        }

        public final Builder maximum_amount(Money maximum_amount) {
            this.maximum_amount = maximum_amount;
            return this;
        }

        public final Builder minimum_amount(Money minimum_amount) {
            this.minimum_amount = minimum_amount;
            return this;
        }

        public final Builder requires_amount(Boolean requires_amount) {
            this.requires_amount = requires_amount;
            return this;
        }

        public final Builder requires_frequency(Boolean requires_frequency) {
            this.requires_frequency = requires_frequency;
            return this;
        }

        public final Builder type(ScheduledTransactionPreference.Type type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ScheduledTransactionBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ScheduledTransactionBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ScheduledTransactionBlocker decode(ProtoReader reader) {
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
                        return new ScheduledTransactionBlocker((Boolean) obj, (Boolean) obj2, (Money) obj3, (Money) obj4, (ScheduledTransactionPreference.Type) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            try {
                                obj5 = ScheduledTransactionPreference.Type.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ScheduledTransactionBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.requires_amount);
                protoAdapter2.encodeWithTag(writer, 2, value.requires_frequency);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.minimum_amount);
                protoAdapter3.encodeWithTag(writer, 4, value.maximum_amount);
                ScheduledTransactionPreference.Type.ADAPTER.encodeWithTag(writer, 5, value.type);
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.investment_entity_token);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ScheduledTransactionBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.requires_frequency) + protoAdapter2.encodedSizeWithTag(1, value.requires_amount) + size$okio;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                return ProtoAdapter.STRING.encodedSizeWithTag(6, value.investment_entity_token) + ScheduledTransactionPreference.Type.ADAPTER.encodedSizeWithTag(5, value.type) + protoAdapter3.encodedSizeWithTag(4, value.maximum_amount) + protoAdapter3.encodedSizeWithTag(3, value.minimum_amount) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScheduledTransactionBlocker redact(ScheduledTransactionBlocker value) {
                value.getClass();
                Money money = value.minimum_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.maximum_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.requires_amount;
                Boolean bool2 = value.requires_frequency;
                ScheduledTransactionPreference.Type type2 = value.type;
                String str = value.investment_entity_token;
                byteString.getClass();
                return new ScheduledTransactionBlocker(bool, bool2, money2, money4, type2, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ScheduledTransactionBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.investment_entity_token);
                ScheduledTransactionPreference.Type.ADAPTER.encodeWithTag(writer, 5, value.type);
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, value.maximum_amount);
                protoAdapter2.encodeWithTag(writer, 3, value.minimum_amount);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 2, value.requires_frequency);
                protoAdapter3.encodeWithTag(writer, 1, value.requires_amount);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledTransactionBlocker(Boolean bool, Boolean bool2, Money money, Money money2, ScheduledTransactionPreference.Type type2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.requires_amount = bool;
        this.requires_frequency = bool2;
        this.minimum_amount = money;
        this.maximum_amount = money2;
        this.type = type2;
        this.investment_entity_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledTransactionBlocker)) {
            return false;
        }
        ScheduledTransactionBlocker scheduledTransactionBlocker = (ScheduledTransactionBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledTransactionBlocker.unknownFields()) && Intrinsics.areEqual(this.requires_amount, scheduledTransactionBlocker.requires_amount) && Intrinsics.areEqual(this.requires_frequency, scheduledTransactionBlocker.requires_frequency) && Intrinsics.areEqual(this.minimum_amount, scheduledTransactionBlocker.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, scheduledTransactionBlocker.maximum_amount) && this.type == scheduledTransactionBlocker.type && Intrinsics.areEqual(this.investment_entity_token, scheduledTransactionBlocker.investment_entity_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.requires_amount;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.requires_frequency;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Money money = this.minimum_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.maximum_amount;
        int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        ScheduledTransactionPreference.Type type2 = this.type;
        int hashCode6 = (hashCode5 + (type2 != null ? type2.hashCode() : 0)) * 37;
        String str = this.investment_entity_token;
        int hashCode7 = hashCode6 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.requires_amount = this.requires_amount;
        builder.requires_frequency = this.requires_frequency;
        builder.minimum_amount = this.minimum_amount;
        builder.maximum_amount = this.maximum_amount;
        builder.type = this.type;
        builder.investment_entity_token = this.investment_entity_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.requires_amount;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_amount=", bool, arrayList);
        }
        Boolean bool2 = this.requires_frequency;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_frequency=", bool2, arrayList);
        }
        Money money = this.minimum_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money, arrayList);
        }
        Money money2 = this.maximum_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money2, arrayList);
        }
        ScheduledTransactionPreference.Type type2 = this.type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledTransactionBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ScheduledTransactionBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ScheduledTransactionBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
