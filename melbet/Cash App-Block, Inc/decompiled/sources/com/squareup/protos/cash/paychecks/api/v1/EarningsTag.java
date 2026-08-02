package com.squareup.protos.cash.paychecks.api.v1;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/EarningsTag;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EARNINGS_TAG_UNSPECIFIED", "EARNINGS_TAG_EARNINGS", "EARNINGS_TAG_PERSONAL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EarningsTag implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EarningsTag[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EarningsTag EARNINGS_TAG_EARNINGS;
    public static final EarningsTag EARNINGS_TAG_PERSONAL;
    public static final EarningsTag EARNINGS_TAG_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EarningsTag[] $values() {
        return new EarningsTag[]{EARNINGS_TAG_UNSPECIFIED, EARNINGS_TAG_EARNINGS, EARNINGS_TAG_PERSONAL};
    }

    static {
        final EarningsTag earningsTag = new EarningsTag("EARNINGS_TAG_UNSPECIFIED", 0, 0);
        EARNINGS_TAG_UNSPECIFIED = earningsTag;
        EARNINGS_TAG_EARNINGS = new EarningsTag("EARNINGS_TAG_EARNINGS", 1, 1);
        EARNINGS_TAG_PERSONAL = new EarningsTag("EARNINGS_TAG_PERSONAL", 2, 2);
        EarningsTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EarningsTag.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, earningsTag) { // from class: com.squareup.protos.cash.paychecks.api.v1.EarningsTag$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public EarningsTag fromValue(int value) {
                return EarningsTag.INSTANCE.fromValue(value);
            }
        };
    }

    private EarningsTag(String str, int i, int i2) {
        this.value = i2;
    }

    public static final EarningsTag fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EarningsTag valueOf(String str) {
        return (EarningsTag) Enum.valueOf(EarningsTag.class, str);
    }

    public static EarningsTag[] values() {
        return (EarningsTag[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/EarningsTag$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsTag;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EarningsTag fromValue(int value) {
            if (value == 0) {
                return EarningsTag.EARNINGS_TAG_UNSPECIFIED;
            }
            if (value == 1) {
                return EarningsTag.EARNINGS_TAG_EARNINGS;
            }
            if (value != 2) {
                return null;
            }
            return EarningsTag.EARNINGS_TAG_PERSONAL;
        }

        private Companion() {
        }
    }
}
