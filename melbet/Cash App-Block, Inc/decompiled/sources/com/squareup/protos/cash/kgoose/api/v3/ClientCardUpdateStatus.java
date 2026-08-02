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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "CLIENT_CARD_UPDATE_STATUS_UNSPECIFIED", "CLIENT_CARD_UPDATE_STATUS_SUCCESS", "CLIENT_CARD_UPDATE_STATUS_FAILED", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientCardUpdateStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClientCardUpdateStatus[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ClientCardUpdateStatus CLIENT_CARD_UPDATE_STATUS_FAILED;
    public static final ClientCardUpdateStatus CLIENT_CARD_UPDATE_STATUS_SUCCESS;
    public static final ClientCardUpdateStatus CLIENT_CARD_UPDATE_STATUS_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ClientCardUpdateStatus clientCardUpdateStatus = new ClientCardUpdateStatus("CLIENT_CARD_UPDATE_STATUS_UNSPECIFIED", 0, 0);
        CLIENT_CARD_UPDATE_STATUS_UNSPECIFIED = clientCardUpdateStatus;
        ClientCardUpdateStatus clientCardUpdateStatus2 = new ClientCardUpdateStatus("CLIENT_CARD_UPDATE_STATUS_SUCCESS", 1, 1);
        CLIENT_CARD_UPDATE_STATUS_SUCCESS = clientCardUpdateStatus2;
        ClientCardUpdateStatus clientCardUpdateStatus3 = new ClientCardUpdateStatus("CLIENT_CARD_UPDATE_STATUS_FAILED", 2, 2);
        CLIENT_CARD_UPDATE_STATUS_FAILED = clientCardUpdateStatus3;
        ClientCardUpdateStatus[] clientCardUpdateStatusArr = {clientCardUpdateStatus, clientCardUpdateStatus2, clientCardUpdateStatus3};
        $VALUES = clientCardUpdateStatusArr;
        $ENTRIES = new EnumEntriesList(clientCardUpdateStatusArr);
        INSTANCE = new Companion();
        ADAPTER = new ClientCardUpdateStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ClientCardUpdateStatus.class), Syntax.PROTO_2, clientCardUpdateStatus);
    }

    public ClientCardUpdateStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ClientCardUpdateStatus fromValue(int i) {
        INSTANCE.getClass();
        if (i == 0) {
            return CLIENT_CARD_UPDATE_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return CLIENT_CARD_UPDATE_STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return CLIENT_CARD_UPDATE_STATUS_FAILED;
    }

    public static ClientCardUpdateStatus valueOf(String str) {
        return (ClientCardUpdateStatus) Enum.valueOf(ClientCardUpdateStatus.class, str);
    }

    public static ClientCardUpdateStatus[] values() {
        return (ClientCardUpdateStatus[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
