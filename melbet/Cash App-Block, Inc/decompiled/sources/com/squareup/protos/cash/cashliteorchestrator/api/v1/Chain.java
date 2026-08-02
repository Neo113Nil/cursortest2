package com.squareup.protos.cash.cashliteorchestrator.api.v1;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHAIN_UNSPECIFIED", "CHAIN_BASE", "CHAIN_ARBITRUM", "CHAIN_HYPEREVM", "CHAIN_POLYGON", "CHAIN_OPTIMISM", "CHAIN_ETHEREUM", "CHAIN_SOLANA", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Chain implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Chain[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final Chain CHAIN_ARBITRUM;
    public static final Chain CHAIN_BASE;
    public static final Chain CHAIN_ETHEREUM;
    public static final Chain CHAIN_HYPEREVM;
    public static final Chain CHAIN_OPTIMISM;
    public static final Chain CHAIN_POLYGON;
    public static final Chain CHAIN_SOLANA;
    public static final Chain CHAIN_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ Chain[] $values() {
        return new Chain[]{CHAIN_UNSPECIFIED, CHAIN_BASE, CHAIN_ARBITRUM, CHAIN_HYPEREVM, CHAIN_POLYGON, CHAIN_OPTIMISM, CHAIN_ETHEREUM, CHAIN_SOLANA};
    }

    static {
        final Chain chain = new Chain("CHAIN_UNSPECIFIED", 0, 0);
        CHAIN_UNSPECIFIED = chain;
        CHAIN_BASE = new Chain("CHAIN_BASE", 1, 1);
        CHAIN_ARBITRUM = new Chain("CHAIN_ARBITRUM", 2, 2);
        CHAIN_HYPEREVM = new Chain("CHAIN_HYPEREVM", 3, 3);
        CHAIN_POLYGON = new Chain("CHAIN_POLYGON", 4, 4);
        CHAIN_OPTIMISM = new Chain("CHAIN_OPTIMISM", 5, 5);
        CHAIN_ETHEREUM = new Chain("CHAIN_ETHEREUM", 6, 6);
        CHAIN_SOLANA = new Chain("CHAIN_SOLANA", 7, 7);
        Chain[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Chain.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, chain) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public Chain fromValue(int value) {
                return Chain.INSTANCE.fromValue(value);
            }
        };
    }

    private Chain(String str, int i, int i2) {
        this.value = i2;
    }

    public static final Chain fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Chain valueOf(String str) {
        return (Chain) Enum.valueOf(Chain.class, str);
    }

    public static Chain[] values() {
        return (Chain[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Chain;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Chain fromValue(int value) {
            switch (value) {
                case 0:
                    return Chain.CHAIN_UNSPECIFIED;
                case 1:
                    return Chain.CHAIN_BASE;
                case 2:
                    return Chain.CHAIN_ARBITRUM;
                case 3:
                    return Chain.CHAIN_HYPEREVM;
                case 4:
                    return Chain.CHAIN_POLYGON;
                case 5:
                    return Chain.CHAIN_OPTIMISM;
                case 6:
                    return Chain.CHAIN_ETHEREUM;
                case 7:
                    return Chain.CHAIN_SOLANA;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
