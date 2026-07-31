package org.koin.core.option;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KoinOption.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lorg/koin/core/option/KoinOption;", "", "<init>", "(Ljava/lang/String;I)V", "VIEWMODEL_SCOPE_FACTORY", "koin-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KoinOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KoinOption[] $VALUES;
    public static final KoinOption VIEWMODEL_SCOPE_FACTORY = new KoinOption("VIEWMODEL_SCOPE_FACTORY", 0);

    private static final /* synthetic */ KoinOption[] $values() {
        return new KoinOption[]{VIEWMODEL_SCOPE_FACTORY};
    }

    public static EnumEntries<KoinOption> getEntries() {
        return $ENTRIES;
    }

    public static KoinOption valueOf(String str) {
        return (KoinOption) Enum.valueOf(KoinOption.class, str);
    }

    public static KoinOption[] values() {
        return (KoinOption[]) $VALUES.clone();
    }

    private KoinOption(String str, int i) {
    }

    static {
        KoinOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
