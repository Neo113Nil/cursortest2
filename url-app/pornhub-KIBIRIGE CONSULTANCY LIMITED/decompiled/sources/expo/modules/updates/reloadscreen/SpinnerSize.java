package expo.modules.updates.reloadscreen;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReloadScreenConfiguration.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/updates/reloadscreen/SpinnerSize;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SMALL", "MEDIUM", "LARGE", "getSize", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpinnerSize implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SpinnerSize[] $VALUES;
    private final String value;
    public static final SpinnerSize SMALL = new SpinnerSize("SMALL", 0, "small");
    public static final SpinnerSize MEDIUM = new SpinnerSize("MEDIUM", 1, "medium");
    public static final SpinnerSize LARGE = new SpinnerSize("LARGE", 2, "large");

    /* compiled from: ReloadScreenConfiguration.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpinnerSize.values().length];
            try {
                iArr[SpinnerSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpinnerSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpinnerSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ SpinnerSize[] $values() {
        return new SpinnerSize[]{SMALL, MEDIUM, LARGE};
    }

    public static EnumEntries<SpinnerSize> getEntries() {
        return $ENTRIES;
    }

    private SpinnerSize(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SpinnerSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final int getSize() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 24;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3) {
            return 72;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static SpinnerSize valueOf(String str) {
        return (SpinnerSize) Enum.valueOf(SpinnerSize.class, str);
    }

    public static SpinnerSize[] values() {
        return (SpinnerSize[]) $VALUES.clone();
    }
}
