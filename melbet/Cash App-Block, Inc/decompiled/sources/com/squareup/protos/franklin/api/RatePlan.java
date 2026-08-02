package com.squareup.protos.franklin.api;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/RatePlan;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDECIDED", "UNDECIDED_DEFERRED", "UNDECIDED_GRANDFATHERED", "PERSONAL", "BUSINESS", "BUSINESS_0", "BUSINESS_1_5", "BUSINESS_1_9", "BUSINESS_2_75", "BUSINESS_NONPROFIT", "BUSINESS_MERCHANT", "BUSINESS_2_60", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RatePlan implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RatePlan[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final RatePlan UNDECIDED = new RatePlan("UNDECIDED", 0, 1);
    public static final RatePlan UNDECIDED_DEFERRED = new RatePlan("UNDECIDED_DEFERRED", 1, 9);
    public static final RatePlan UNDECIDED_GRANDFATHERED = new RatePlan("UNDECIDED_GRANDFATHERED", 2, 4);
    public static final RatePlan PERSONAL = new RatePlan("PERSONAL", 3, 2);

    @Deprecated
    public static final RatePlan BUSINESS = new RatePlan("BUSINESS", 4, 3);
    public static final RatePlan BUSINESS_0 = new RatePlan("BUSINESS_0", 5, 10);
    public static final RatePlan BUSINESS_1_5 = new RatePlan("BUSINESS_1_5", 6, 6);
    public static final RatePlan BUSINESS_1_9 = new RatePlan("BUSINESS_1_9", 7, 7);
    public static final RatePlan BUSINESS_2_75 = new RatePlan("BUSINESS_2_75", 8, 8);
    public static final RatePlan BUSINESS_NONPROFIT = new RatePlan("BUSINESS_NONPROFIT", 9, 5);
    public static final RatePlan BUSINESS_MERCHANT = new RatePlan("BUSINESS_MERCHANT", 10, 11);
    public static final RatePlan BUSINESS_2_60 = new RatePlan("BUSINESS_2_60", 11, 12);

    private static final /* synthetic */ RatePlan[] $values() {
        return new RatePlan[]{UNDECIDED, UNDECIDED_DEFERRED, UNDECIDED_GRANDFATHERED, PERSONAL, BUSINESS, BUSINESS_0, BUSINESS_1_5, BUSINESS_1_9, BUSINESS_2_75, BUSINESS_NONPROFIT, BUSINESS_MERCHANT, BUSINESS_2_60};
    }

    static {
        RatePlan[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RatePlan.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.RatePlan$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public RatePlan fromValue(int value) {
                return RatePlan.INSTANCE.fromValue(value);
            }
        };
    }

    private RatePlan(String str, int i, int i2) {
        this.value = i2;
    }

    public static final RatePlan fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RatePlan valueOf(String str) {
        return (RatePlan) Enum.valueOf(RatePlan.class, str);
    }

    public static RatePlan[] values() {
        return (RatePlan[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/RatePlan$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/RatePlan;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RatePlan fromValue(int value) {
            switch (value) {
                case 1:
                    return RatePlan.UNDECIDED;
                case 2:
                    return RatePlan.PERSONAL;
                case 3:
                    return RatePlan.BUSINESS;
                case 4:
                    return RatePlan.UNDECIDED_GRANDFATHERED;
                case 5:
                    return RatePlan.BUSINESS_NONPROFIT;
                case 6:
                    return RatePlan.BUSINESS_1_5;
                case 7:
                    return RatePlan.BUSINESS_1_9;
                case 8:
                    return RatePlan.BUSINESS_2_75;
                case 9:
                    return RatePlan.UNDECIDED_DEFERRED;
                case 10:
                    return RatePlan.BUSINESS_0;
                case 11:
                    return RatePlan.BUSINESS_MERCHANT;
                case 12:
                    return RatePlan.BUSINESS_2_60;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
