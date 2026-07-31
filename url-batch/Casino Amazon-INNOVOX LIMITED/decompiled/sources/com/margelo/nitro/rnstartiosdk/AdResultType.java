package com.margelo.nitro.rnstartiosdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdResultType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/AdResultType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ADDISPLAYED", "ADCLICKED", "ADHIDDEN", "ADNOTDISPLAYED", "ADREWARDED", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdResultType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdResultType[] $VALUES;
    private final int value;
    public static final AdResultType ADDISPLAYED = new AdResultType("ADDISPLAYED", 0, 0);
    public static final AdResultType ADCLICKED = new AdResultType("ADCLICKED", 1, 1);
    public static final AdResultType ADHIDDEN = new AdResultType("ADHIDDEN", 2, 2);
    public static final AdResultType ADNOTDISPLAYED = new AdResultType("ADNOTDISPLAYED", 3, 3);
    public static final AdResultType ADREWARDED = new AdResultType("ADREWARDED", 4, 4);

    private static final /* synthetic */ AdResultType[] $values() {
        return new AdResultType[]{ADDISPLAYED, ADCLICKED, ADHIDDEN, ADNOTDISPLAYED, ADREWARDED};
    }

    public static EnumEntries<AdResultType> getEntries() {
        return $ENTRIES;
    }

    private AdResultType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        AdResultType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static AdResultType valueOf(String str) {
        return (AdResultType) Enum.valueOf(AdResultType.class, str);
    }

    public static AdResultType[] values() {
        return (AdResultType[]) $VALUES.clone();
    }
}
