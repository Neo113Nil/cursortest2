package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000b\n\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$Builder;", "", "use_update_mode", "Ljava/lang/Boolean;", "", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$PlaidProduct;", "additional_plaid_products", "Ljava/util/List;", "Companion", "Builder", "PlaidProduct", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaidLinkingConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PlaidLinkingConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig$PlaidProduct#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<PlaidProduct> additional_plaid_products;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean use_update_mode;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig;", "<init>", "()V", "use_update_mode", "", "Ljava/lang/Boolean;", "additional_plaid_products", "", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$PlaidProduct;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<? extends PlaidProduct> additional_plaid_products = EmptyList.INSTANCE;
        public Boolean use_update_mode;

        public final Builder additional_plaid_products(List<? extends PlaidProduct> additional_plaid_products) {
            additional_plaid_products.getClass();
            TransactorKt.checkElementsNotNull(additional_plaid_products);
            this.additional_plaid_products = additional_plaid_products;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PlaidLinkingConfig build() {
            return new PlaidLinkingConfig(this.use_update_mode, this.additional_plaid_products, buildUnknownFields());
        }

        public final Builder use_update_mode(Boolean use_update_mode) {
            this.use_update_mode = use_update_mode;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlaidLinkingConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidLinkingConfig decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PlaidLinkingConfig((Boolean) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            PlaidLinkingConfig.PlaidProduct.ADAPTER.tryDecode(reader, m);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidLinkingConfig value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.use_update_mode);
                PlaidLinkingConfig.PlaidProduct.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.additional_plaid_products);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidLinkingConfig value) {
                value.getClass();
                return PlaidLinkingConfig.PlaidProduct.ADAPTER.asRepeated().encodedSizeWithTag(2, value.additional_plaid_products) + ProtoAdapter.BOOL.encodedSizeWithTag(1, value.use_update_mode) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidLinkingConfig redact(PlaidLinkingConfig value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.use_update_mode;
                List<PlaidLinkingConfig.PlaidProduct> list = value.additional_plaid_products;
                value.getClass();
                list.getClass();
                byteString.getClass();
                return new PlaidLinkingConfig(bool, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidLinkingConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PlaidLinkingConfig.PlaidProduct.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.additional_plaid_products);
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.use_update_mode);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidLinkingConfig(Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.use_update_mode = bool;
        this.additional_plaid_products = TransactorKt.immutableCopyOf("additional_plaid_products", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaidLinkingConfig)) {
            return false;
        }
        PlaidLinkingConfig plaidLinkingConfig = (PlaidLinkingConfig) obj;
        return Intrinsics.areEqual(unknownFields(), plaidLinkingConfig.unknownFields()) && Intrinsics.areEqual(this.use_update_mode, plaidLinkingConfig.use_update_mode) && Intrinsics.areEqual(this.additional_plaid_products, plaidLinkingConfig.additional_plaid_products);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.use_update_mode;
        int hashCode2 = this.additional_plaid_products.hashCode() + ((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.use_update_mode = this.use_update_mode;
        builder.additional_plaid_products = this.additional_plaid_products;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.use_update_mode;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_update_mode=", bool, arrayList);
        }
        if (!this.additional_plaid_products.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_plaid_products=", arrayList, this.additional_plaid_products);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidLinkingConfig{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$PlaidProduct;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNSUPPORTED", "ASSETS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PlaidProduct implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PlaidProduct[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final PlaidProduct ASSETS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PlaidProduct UNSUPPORTED;
        private final int value;

        private static final /* synthetic */ PlaidProduct[] $values() {
            return new PlaidProduct[]{UNSUPPORTED, ASSETS};
        }

        static {
            final PlaidProduct plaidProduct = new PlaidProduct("UNSUPPORTED", 0, 0);
            UNSUPPORTED = plaidProduct;
            ASSETS = new PlaidProduct("ASSETS", 1, 1);
            PlaidProduct[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PlaidProduct.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, plaidProduct) { // from class: com.squareup.protos.franklin.common.scenarios.PlaidLinkingConfig$PlaidProduct$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PlaidLinkingConfig.PlaidProduct fromValue(int value) {
                    return PlaidLinkingConfig.PlaidProduct.INSTANCE.fromValue(value);
                }
            };
        }

        private PlaidProduct(String str, int i, int i2) {
            this.value = i2;
        }

        public static final PlaidProduct fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PlaidProduct valueOf(String str) {
            return (PlaidProduct) Enum.valueOf(PlaidProduct.class, str);
        }

        public static PlaidProduct[] values() {
            return (PlaidProduct[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$PlaidProduct$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$PlaidProduct;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PlaidProduct fromValue(int value) {
                if (value == 0) {
                    return PlaidProduct.UNSUPPORTED;
                }
                if (value != 1) {
                    return null;
                }
                return PlaidProduct.ASSETS;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/PlaidLinkingConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PlaidLinkingConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
