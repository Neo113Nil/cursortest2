package com.onesignal.common.consistency.enums;

import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IamFetchRywTokenKey.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/onesignal/common/consistency/enums/IamFetchRywTokenKey;", "", "Lcom/onesignal/common/consistency/models/IConsistencyKeyEnum;", "(Ljava/lang/String;I)V", "USER", "SUBSCRIPTION", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IamFetchRywTokenKey implements IConsistencyKeyEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IamFetchRywTokenKey[] $VALUES;
    public static final IamFetchRywTokenKey USER = new IamFetchRywTokenKey("USER", 0);
    public static final IamFetchRywTokenKey SUBSCRIPTION = new IamFetchRywTokenKey("SUBSCRIPTION", 1);

    private static final /* synthetic */ IamFetchRywTokenKey[] $values() {
        return new IamFetchRywTokenKey[]{USER, SUBSCRIPTION};
    }

    public static EnumEntries<IamFetchRywTokenKey> getEntries() {
        return $ENTRIES;
    }

    public static IamFetchRywTokenKey valueOf(String str) {
        return (IamFetchRywTokenKey) Enum.valueOf(IamFetchRywTokenKey.class, str);
    }

    public static IamFetchRywTokenKey[] values() {
        return (IamFetchRywTokenKey[]) $VALUES.clone();
    }

    private IamFetchRywTokenKey(String str, int i) {
    }

    static {
        IamFetchRywTokenKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
