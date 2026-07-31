package dev.hyo.openiap;

import com.google.firebase.ktx.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Ldev/hyo/openiap/DeveloperBillingLaunchModeAndroid;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "Unspecified", "LaunchInExternalBrowserOrApp", "CallerWillLaunchLink", "toJson", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeveloperBillingLaunchModeAndroid {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeveloperBillingLaunchModeAndroid[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String rawValue;
    public static final DeveloperBillingLaunchModeAndroid Unspecified = new DeveloperBillingLaunchModeAndroid("Unspecified", 0, BuildConfig.VERSION_NAME);
    public static final DeveloperBillingLaunchModeAndroid LaunchInExternalBrowserOrApp = new DeveloperBillingLaunchModeAndroid("LaunchInExternalBrowserOrApp", 1, "launch-in-external-browser-or-app");
    public static final DeveloperBillingLaunchModeAndroid CallerWillLaunchLink = new DeveloperBillingLaunchModeAndroid("CallerWillLaunchLink", 2, "caller-will-launch-link");

    private static final /* synthetic */ DeveloperBillingLaunchModeAndroid[] $values() {
        return new DeveloperBillingLaunchModeAndroid[]{Unspecified, LaunchInExternalBrowserOrApp, CallerWillLaunchLink};
    }

    public static EnumEntries<DeveloperBillingLaunchModeAndroid> getEntries() {
        return $ENTRIES;
    }

    public static DeveloperBillingLaunchModeAndroid valueOf(String str) {
        return (DeveloperBillingLaunchModeAndroid) Enum.valueOf(DeveloperBillingLaunchModeAndroid.class, str);
    }

    public static DeveloperBillingLaunchModeAndroid[] values() {
        return (DeveloperBillingLaunchModeAndroid[]) $VALUES.clone();
    }

    private DeveloperBillingLaunchModeAndroid(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        DeveloperBillingLaunchModeAndroid[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Ldev/hyo/openiap/DeveloperBillingLaunchModeAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/DeveloperBillingLaunchModeAndroid;", "value", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final DeveloperBillingLaunchModeAndroid fromJson(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1626174665:
                    if (value.equals(BuildConfig.VERSION_NAME)) {
                        return DeveloperBillingLaunchModeAndroid.Unspecified;
                    }
                    break;
                case -1443034407:
                    if (value.equals("LaunchInExternalBrowserOrApp")) {
                        return DeveloperBillingLaunchModeAndroid.LaunchInExternalBrowserOrApp;
                    }
                    break;
                case -1052017590:
                    if (value.equals("CallerWillLaunchLink")) {
                        return DeveloperBillingLaunchModeAndroid.CallerWillLaunchLink;
                    }
                    break;
                case 41693975:
                    if (value.equals("Unspecified")) {
                        return DeveloperBillingLaunchModeAndroid.Unspecified;
                    }
                    break;
                case 228880752:
                    if (value.equals("launch-in-external-browser-or-app")) {
                        return DeveloperBillingLaunchModeAndroid.LaunchInExternalBrowserOrApp;
                    }
                    break;
                case 1981211227:
                    if (value.equals("caller-will-launch-link")) {
                        return DeveloperBillingLaunchModeAndroid.CallerWillLaunchLink;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown DeveloperBillingLaunchModeAndroid value: " + value);
        }
    }

    public final String toJson() {
        return this.rawValue;
    }
}
