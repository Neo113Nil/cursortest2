package com.onesignal.common.consistency.enums;

import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IamFetchRywTokenKey implements IConsistencyKeyEnum {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ IamFetchRywTokenKey[] $VALUES;
    public static final IamFetchRywTokenKey USER = new IamFetchRywTokenKey("USER", 0);
    public static final IamFetchRywTokenKey SUBSCRIPTION = new IamFetchRywTokenKey("SUBSCRIPTION", 1);

    private static final /* synthetic */ IamFetchRywTokenKey[] $values() {
        return new IamFetchRywTokenKey[]{USER, SUBSCRIPTION};
    }

    static {
        IamFetchRywTokenKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
    }

    private IamFetchRywTokenKey(String str, int i2) {
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static IamFetchRywTokenKey valueOf(String str) {
        return (IamFetchRywTokenKey) Enum.valueOf(IamFetchRywTokenKey.class, str);
    }

    public static IamFetchRywTokenKey[] values() {
        return (IamFetchRywTokenKey[]) $VALUES.clone();
    }
}
