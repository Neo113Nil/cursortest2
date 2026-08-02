package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TRANSFER_OPTION_KIND_INVALID", "TRANSFER_OPTION_KIND_DEBIT_CARD", "TRANSFER_OPTION_KIND_CASH_BALANCE", "TRANSFER_OPTION_KIND_SAVINGS_GOAL", "TRANSFER_OPTION_KIND_GENERAL_SAVINGS", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransferOptionKind implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferOptionKind[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferOptionKind TRANSFER_OPTION_KIND_CASH_BALANCE;
    public static final TransferOptionKind TRANSFER_OPTION_KIND_DEBIT_CARD;
    public static final TransferOptionKind TRANSFER_OPTION_KIND_GENERAL_SAVINGS;
    public static final TransferOptionKind TRANSFER_OPTION_KIND_INVALID;
    public static final TransferOptionKind TRANSFER_OPTION_KIND_SAVINGS_GOAL;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TransferOptionKind;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static TransferOptionKind fromValue(int i) {
            if (i == 0) {
                return TransferOptionKind.TRANSFER_OPTION_KIND_INVALID;
            }
            if (i == 1) {
                return TransferOptionKind.TRANSFER_OPTION_KIND_DEBIT_CARD;
            }
            if (i == 2) {
                return TransferOptionKind.TRANSFER_OPTION_KIND_CASH_BALANCE;
            }
            if (i == 3) {
                return TransferOptionKind.TRANSFER_OPTION_KIND_SAVINGS_GOAL;
            }
            if (i != 4) {
                return null;
            }
            return TransferOptionKind.TRANSFER_OPTION_KIND_GENERAL_SAVINGS;
        }
    }

    static {
        TransferOptionKind transferOptionKind = new TransferOptionKind("TRANSFER_OPTION_KIND_INVALID", 0, 0);
        TRANSFER_OPTION_KIND_INVALID = transferOptionKind;
        TransferOptionKind transferOptionKind2 = new TransferOptionKind("TRANSFER_OPTION_KIND_DEBIT_CARD", 1, 1);
        TRANSFER_OPTION_KIND_DEBIT_CARD = transferOptionKind2;
        TransferOptionKind transferOptionKind3 = new TransferOptionKind("TRANSFER_OPTION_KIND_CASH_BALANCE", 2, 2);
        TRANSFER_OPTION_KIND_CASH_BALANCE = transferOptionKind3;
        TransferOptionKind transferOptionKind4 = new TransferOptionKind("TRANSFER_OPTION_KIND_SAVINGS_GOAL", 3, 3);
        TRANSFER_OPTION_KIND_SAVINGS_GOAL = transferOptionKind4;
        TransferOptionKind transferOptionKind5 = new TransferOptionKind("TRANSFER_OPTION_KIND_GENERAL_SAVINGS", 4, 4);
        TRANSFER_OPTION_KIND_GENERAL_SAVINGS = transferOptionKind5;
        TransferOptionKind[] transferOptionKindArr = {transferOptionKind, transferOptionKind2, transferOptionKind3, transferOptionKind4, transferOptionKind5};
        $VALUES = transferOptionKindArr;
        $ENTRIES = new EnumEntriesList(transferOptionKindArr);
        INSTANCE = new Companion();
        ADAPTER = new TransferOptionKind$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransferOptionKind.class), Syntax.PROTO_2, transferOptionKind);
    }

    public TransferOptionKind(String str, int i, int i2) {
        this.value = i2;
    }

    public static final TransferOptionKind fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static TransferOptionKind valueOf(String str) {
        return (TransferOptionKind) Enum.valueOf(TransferOptionKind.class, str);
    }

    public static TransferOptionKind[] values() {
        return (TransferOptionKind[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
