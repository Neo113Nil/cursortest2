package com.stripe.android.model;

import kotlin.enums.EnumEntriesList;
import net.idrnd.face.iad.capture.internal.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class CvcCheck {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ CvcCheck[] $VALUES;
    public static final y0 Companion;
    public static final CvcCheck Unknown;
    public final String code;

    static {
        CvcCheck cvcCheck = new CvcCheck("Pass", 0, "PASS");
        CvcCheck cvcCheck2 = new CvcCheck("Fail", 1, "FAIL");
        CvcCheck cvcCheck3 = new CvcCheck("Unavailable", 2, "UNAVAILABLE");
        CvcCheck cvcCheck4 = new CvcCheck("Unchecked", 3, "UNCHECKED");
        CvcCheck cvcCheck5 = new CvcCheck("StateInvalid", 4, "STATE_INVALID");
        CvcCheck cvcCheck6 = new CvcCheck("Unknown", 5, "UNKNOWN");
        Unknown = cvcCheck6;
        CvcCheck[] cvcCheckArr = {cvcCheck, cvcCheck2, cvcCheck3, cvcCheck4, cvcCheck5, cvcCheck6};
        $VALUES = cvcCheckArr;
        $ENTRIES = new EnumEntriesList(cvcCheckArr);
        Companion = new y0();
    }

    public CvcCheck(String str, int i, String str2) {
        this.code = str2;
    }

    public static CvcCheck valueOf(String str) {
        return (CvcCheck) Enum.valueOf(CvcCheck.class, str);
    }

    public static CvcCheck[] values() {
        return (CvcCheck[]) $VALUES.clone();
    }
}
