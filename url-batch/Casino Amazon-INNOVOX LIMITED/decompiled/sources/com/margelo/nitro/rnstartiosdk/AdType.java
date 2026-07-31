package com.margelo.nitro.rnstartiosdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/AdType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AUTOMATIC", "FULLPAGE", "OFFERWALL", "REWARDED_VIDEO", "VIDEO", "OVERLAY", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdType[] $VALUES;
    private final int value;
    public static final AdType AUTOMATIC = new AdType("AUTOMATIC", 0, 0);
    public static final AdType FULLPAGE = new AdType("FULLPAGE", 1, 1);
    public static final AdType OFFERWALL = new AdType("OFFERWALL", 2, 2);
    public static final AdType REWARDED_VIDEO = new AdType("REWARDED_VIDEO", 3, 3);
    public static final AdType VIDEO = new AdType("VIDEO", 4, 4);
    public static final AdType OVERLAY = new AdType("OVERLAY", 5, 5);

    private static final /* synthetic */ AdType[] $values() {
        return new AdType[]{AUTOMATIC, FULLPAGE, OFFERWALL, REWARDED_VIDEO, VIDEO, OVERLAY};
    }

    public static EnumEntries<AdType> getEntries() {
        return $ENTRIES;
    }

    private AdType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        AdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) $VALUES.clone();
    }
}
