package expo.modules.blur.enums;

import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BlurMethod.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/blur/enums/BlurMethod;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "DIMEZIS_BLUR_VIEW", "expo-blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlurMethod implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlurMethod[] $VALUES;
    private final String value;
    public static final BlurMethod NONE = new BlurMethod("NONE", 0, "none");
    public static final BlurMethod DIMEZIS_BLUR_VIEW = new BlurMethod("DIMEZIS_BLUR_VIEW", 1, "dimezisBlurView");

    private static final /* synthetic */ BlurMethod[] $values() {
        return new BlurMethod[]{NONE, DIMEZIS_BLUR_VIEW};
    }

    public static EnumEntries<BlurMethod> getEntries() {
        return $ENTRIES;
    }

    private BlurMethod(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        BlurMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BlurMethod valueOf(String str) {
        return (BlurMethod) Enum.valueOf(BlurMethod.class, str);
    }

    public static BlurMethod[] values() {
        return (BlurMethod[]) $VALUES.clone();
    }
}
