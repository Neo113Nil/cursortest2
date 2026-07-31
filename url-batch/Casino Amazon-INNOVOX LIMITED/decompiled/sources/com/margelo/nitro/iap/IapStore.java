package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IapStore.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/margelo/nitro/iap/IapStore;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "APPLE", "GOOGLE", "HORIZON", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IapStore {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IapStore[] $VALUES;
    private final int value;
    public static final IapStore UNKNOWN = new IapStore("UNKNOWN", 0, 0);
    public static final IapStore APPLE = new IapStore("APPLE", 1, 1);
    public static final IapStore GOOGLE = new IapStore("GOOGLE", 2, 2);
    public static final IapStore HORIZON = new IapStore("HORIZON", 3, 3);

    private static final /* synthetic */ IapStore[] $values() {
        return new IapStore[]{UNKNOWN, APPLE, GOOGLE, HORIZON};
    }

    public static EnumEntries<IapStore> getEntries() {
        return $ENTRIES;
    }

    private IapStore(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        IapStore[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public static IapStore valueOf(String str) {
        return (IapStore) Enum.valueOf(IapStore.class, str);
    }

    public static IapStore[] values() {
        return (IapStore[]) $VALUES.clone();
    }
}
