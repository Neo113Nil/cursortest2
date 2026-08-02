package com.squareup.protos.franklin.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/ui/InvestmentOrderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STANDARD_ORDER", "AUTO_INVEST", "CUSTOM_ORDER", "ROUNDUP_ORDER", "INVEST_YOUR_PAYCHECK_ORDER", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvestmentOrderType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentOrderType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final InvestmentOrderType STANDARD_ORDER = new InvestmentOrderType("STANDARD_ORDER", 0, 1);
    public static final InvestmentOrderType AUTO_INVEST = new InvestmentOrderType("AUTO_INVEST", 1, 2);
    public static final InvestmentOrderType CUSTOM_ORDER = new InvestmentOrderType("CUSTOM_ORDER", 2, 3);
    public static final InvestmentOrderType ROUNDUP_ORDER = new InvestmentOrderType("ROUNDUP_ORDER", 3, 4);
    public static final InvestmentOrderType INVEST_YOUR_PAYCHECK_ORDER = new InvestmentOrderType("INVEST_YOUR_PAYCHECK_ORDER", 4, 5);

    private static final /* synthetic */ InvestmentOrderType[] $values() {
        return new InvestmentOrderType[]{STANDARD_ORDER, AUTO_INVEST, CUSTOM_ORDER, ROUNDUP_ORDER, INVEST_YOUR_PAYCHECK_ORDER};
    }

    static {
        InvestmentOrderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InvestmentOrderType.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.InvestmentOrderType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public InvestmentOrderType fromValue(int value) {
                return InvestmentOrderType.INSTANCE.fromValue(value);
            }
        };
    }

    private InvestmentOrderType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final InvestmentOrderType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static InvestmentOrderType valueOf(String str) {
        return (InvestmentOrderType) Enum.valueOf(InvestmentOrderType.class, str);
    }

    public static InvestmentOrderType[] values() {
        return (InvestmentOrderType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/InvestmentOrderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/InvestmentOrderType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InvestmentOrderType fromValue(int value) {
            if (value == 1) {
                return InvestmentOrderType.STANDARD_ORDER;
            }
            if (value == 2) {
                return InvestmentOrderType.AUTO_INVEST;
            }
            if (value == 3) {
                return InvestmentOrderType.CUSTOM_ORDER;
            }
            if (value == 4) {
                return InvestmentOrderType.ROUNDUP_ORDER;
            }
            if (value != 5) {
                return null;
            }
            return InvestmentOrderType.INVEST_YOUR_PAYCHECK_ORDER;
        }

        private Companion() {
        }
    }
}
