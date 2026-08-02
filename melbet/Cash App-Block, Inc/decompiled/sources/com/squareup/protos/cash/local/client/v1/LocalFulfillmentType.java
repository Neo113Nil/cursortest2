package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOCAL_FULFILLMENT_TYPE_UNSPECIFIED", "LOCAL_FULFILLMENT_TYPE_PICKUP", "LOCAL_FULFILLMENT_TYPE_DINE_IN", "LOCAL_FULFILLMENT_TYPE_DELIVERY", "LOCAL_FULFILLMENT_TYPE_IN_STORE", "LOCAL_FULFILLMENT_TYPE_SHIPPING", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalFulfillmentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LocalFulfillmentType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LocalFulfillmentType LOCAL_FULFILLMENT_TYPE_DELIVERY;

    @Deprecated
    public static final LocalFulfillmentType LOCAL_FULFILLMENT_TYPE_DINE_IN;
    public static final LocalFulfillmentType LOCAL_FULFILLMENT_TYPE_IN_STORE;
    public static final LocalFulfillmentType LOCAL_FULFILLMENT_TYPE_PICKUP;
    public static final LocalFulfillmentType LOCAL_FULFILLMENT_TYPE_SHIPPING;
    public static final LocalFulfillmentType LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ LocalFulfillmentType[] $values() {
        return new LocalFulfillmentType[]{LOCAL_FULFILLMENT_TYPE_UNSPECIFIED, LOCAL_FULFILLMENT_TYPE_PICKUP, LOCAL_FULFILLMENT_TYPE_DINE_IN, LOCAL_FULFILLMENT_TYPE_DELIVERY, LOCAL_FULFILLMENT_TYPE_IN_STORE, LOCAL_FULFILLMENT_TYPE_SHIPPING};
    }

    static {
        final LocalFulfillmentType localFulfillmentType = new LocalFulfillmentType("LOCAL_FULFILLMENT_TYPE_UNSPECIFIED", 0, 0);
        LOCAL_FULFILLMENT_TYPE_UNSPECIFIED = localFulfillmentType;
        LOCAL_FULFILLMENT_TYPE_PICKUP = new LocalFulfillmentType("LOCAL_FULFILLMENT_TYPE_PICKUP", 1, 1);
        LOCAL_FULFILLMENT_TYPE_DINE_IN = new LocalFulfillmentType("LOCAL_FULFILLMENT_TYPE_DINE_IN", 2, 2);
        LOCAL_FULFILLMENT_TYPE_DELIVERY = new LocalFulfillmentType("LOCAL_FULFILLMENT_TYPE_DELIVERY", 3, 3);
        LOCAL_FULFILLMENT_TYPE_IN_STORE = new LocalFulfillmentType("LOCAL_FULFILLMENT_TYPE_IN_STORE", 4, 4);
        LOCAL_FULFILLMENT_TYPE_SHIPPING = new LocalFulfillmentType("LOCAL_FULFILLMENT_TYPE_SHIPPING", 5, 5);
        LocalFulfillmentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalFulfillmentType.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, localFulfillmentType) { // from class: com.squareup.protos.cash.local.client.v1.LocalFulfillmentType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public LocalFulfillmentType fromValue(int value) {
                return LocalFulfillmentType.INSTANCE.fromValue(value);
            }
        };
    }

    private LocalFulfillmentType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final LocalFulfillmentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LocalFulfillmentType valueOf(String str) {
        return (LocalFulfillmentType) Enum.valueOf(LocalFulfillmentType.class, str);
    }

    public static LocalFulfillmentType[] values() {
        return (LocalFulfillmentType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocalFulfillmentType fromValue(int value) {
            if (value == 0) {
                return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP;
            }
            if (value == 2) {
                return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN;
            }
            if (value == 3) {
                return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY;
            }
            if (value == 4) {
                return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE;
            }
            if (value != 5) {
                return null;
            }
            return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING;
        }

        private Companion() {
        }
    }
}
