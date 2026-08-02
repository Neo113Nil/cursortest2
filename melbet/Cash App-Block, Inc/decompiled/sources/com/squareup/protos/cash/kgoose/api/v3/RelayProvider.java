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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RelayProvider;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "RELAY_PROVIDER_UNSPECIFIED", "RELAY_PROVIDER_SMS", "RELAY_PROVIDER_TELEGRAM", "RELAY_PROVIDER_WHATSAPP", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RelayProvider implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RelayProvider[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RelayProvider RELAY_PROVIDER_SMS;
    public static final RelayProvider RELAY_PROVIDER_TELEGRAM;
    public static final RelayProvider RELAY_PROVIDER_UNSPECIFIED;
    public static final RelayProvider RELAY_PROVIDER_WHATSAPP;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RelayProvider$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayProvider;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        RelayProvider relayProvider = new RelayProvider("RELAY_PROVIDER_UNSPECIFIED", 0, 0);
        RELAY_PROVIDER_UNSPECIFIED = relayProvider;
        RelayProvider relayProvider2 = new RelayProvider("RELAY_PROVIDER_SMS", 1, 1);
        RELAY_PROVIDER_SMS = relayProvider2;
        RelayProvider relayProvider3 = new RelayProvider("RELAY_PROVIDER_TELEGRAM", 2, 2);
        RELAY_PROVIDER_TELEGRAM = relayProvider3;
        RelayProvider relayProvider4 = new RelayProvider("RELAY_PROVIDER_WHATSAPP", 3, 3);
        RELAY_PROVIDER_WHATSAPP = relayProvider4;
        RelayProvider[] relayProviderArr = {relayProvider, relayProvider2, relayProvider3, relayProvider4};
        $VALUES = relayProviderArr;
        $ENTRIES = new EnumEntriesList(relayProviderArr);
        INSTANCE = new Companion();
        ADAPTER = new RelayProvider$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RelayProvider.class), Syntax.PROTO_2, relayProvider);
    }

    public RelayProvider(String str, int i, int i2) {
        this.value = i2;
    }

    public static final RelayProvider fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return RELAY_PROVIDER_UNSPECIFIED;
        }
        if (i == 1) {
            return RELAY_PROVIDER_SMS;
        }
        if (i == 2) {
            return RELAY_PROVIDER_TELEGRAM;
        }
        if (i != 3) {
            return null;
        }
        return RELAY_PROVIDER_WHATSAPP;
    }

    public static RelayProvider valueOf(String str) {
        return (RelayProvider) Enum.valueOf(RelayProvider.class, str);
    }

    public static RelayProvider[] values() {
        return (RelayProvider[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
