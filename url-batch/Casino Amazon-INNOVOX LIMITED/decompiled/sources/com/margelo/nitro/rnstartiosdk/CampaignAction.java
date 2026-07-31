package com.margelo.nitro.rnstartiosdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CampaignAction.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/CampaignAction;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LAUNCH_APP", "OPEN_MARKET", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CampaignAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CampaignAction[] $VALUES;
    public static final CampaignAction LAUNCH_APP = new CampaignAction("LAUNCH_APP", 0, 0);
    public static final CampaignAction OPEN_MARKET = new CampaignAction("OPEN_MARKET", 1, 1);
    private final int value;

    private static final /* synthetic */ CampaignAction[] $values() {
        return new CampaignAction[]{LAUNCH_APP, OPEN_MARKET};
    }

    public static EnumEntries<CampaignAction> getEntries() {
        return $ENTRIES;
    }

    private CampaignAction(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CampaignAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static CampaignAction valueOf(String str) {
        return (CampaignAction) Enum.valueOf(CampaignAction.class, str);
    }

    public static CampaignAction[] values() {
        return (CampaignAction[]) $VALUES.clone();
    }
}
