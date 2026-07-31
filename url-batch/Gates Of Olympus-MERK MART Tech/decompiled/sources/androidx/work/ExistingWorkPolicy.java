package androidx.work;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExistingWorkPolicy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/work/ExistingWorkPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "REPLACE", "KEEP", "APPEND", "APPEND_OR_REPLACE", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExistingWorkPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExistingWorkPolicy[] $VALUES;
    public static final ExistingWorkPolicy REPLACE = new ExistingWorkPolicy("REPLACE", 0);
    public static final ExistingWorkPolicy KEEP = new ExistingWorkPolicy("KEEP", 1);
    public static final ExistingWorkPolicy APPEND = new ExistingWorkPolicy("APPEND", 2);
    public static final ExistingWorkPolicy APPEND_OR_REPLACE = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);

    private static final /* synthetic */ ExistingWorkPolicy[] $values() {
        return new ExistingWorkPolicy[]{REPLACE, KEEP, APPEND, APPEND_OR_REPLACE};
    }

    public static EnumEntries<ExistingWorkPolicy> getEntries() {
        return $ENTRIES;
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) $VALUES.clone();
    }

    private ExistingWorkPolicy(String str, int i) {
    }

    static {
        ExistingWorkPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
