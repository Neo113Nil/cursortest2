package kotlin.reflect.jvm.internal.impl.km;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ReturnValueStatus {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ ReturnValueStatus[] $VALUES;
    public static final ReturnValueStatus EXPLICITLY_IGNORABLE;
    public static final ReturnValueStatus MUST_USE;
    public static final ReturnValueStatus UNSPECIFIED;

    static {
        ReturnValueStatus returnValueStatus = new ReturnValueStatus("UNSPECIFIED", 0);
        UNSPECIFIED = returnValueStatus;
        ReturnValueStatus returnValueStatus2 = new ReturnValueStatus("MUST_USE", 1);
        MUST_USE = returnValueStatus2;
        ReturnValueStatus returnValueStatus3 = new ReturnValueStatus("EXPLICITLY_IGNORABLE", 2);
        EXPLICITLY_IGNORABLE = returnValueStatus3;
        ReturnValueStatus[] returnValueStatusArr = {returnValueStatus, returnValueStatus2, returnValueStatus3};
        $VALUES = returnValueStatusArr;
        $ENTRIES = new EnumEntriesList(returnValueStatusArr);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ReturnValueStatus valueOf(String str) {
        return (ReturnValueStatus) Enum.valueOf(ReturnValueStatus.class, str);
    }

    public static ReturnValueStatus[] values() {
        return (ReturnValueStatus[]) $VALUES.clone();
    }
}
