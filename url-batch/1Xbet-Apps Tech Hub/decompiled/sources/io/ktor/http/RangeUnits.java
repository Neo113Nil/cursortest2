package io.ktor.http;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/ktor/http/RangeUnits;", "", "unitToken", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getUnitToken", "()Ljava/lang/String;", "Bytes", "None", "ktor-http"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RangeUnits {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RangeUnits[] $VALUES;
    public static final RangeUnits Bytes = new RangeUnits("Bytes", 0, "bytes");
    public static final RangeUnits None = new RangeUnits("None", 1, "none");
    private final String unitToken;

    private static final /* synthetic */ RangeUnits[] $values() {
        return new RangeUnits[]{Bytes, None};
    }

    public static EnumEntries<RangeUnits> getEntries() {
        return $ENTRIES;
    }

    public static RangeUnits valueOf(String str) {
        return (RangeUnits) Enum.valueOf(RangeUnits.class, str);
    }

    public static RangeUnits[] values() {
        return (RangeUnits[]) $VALUES.clone();
    }

    private RangeUnits(String str, int i, String str2) {
        this.unitToken = str2;
    }

    public final String getUnitToken() {
        return this.unitToken;
    }

    static {
        RangeUnits[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
