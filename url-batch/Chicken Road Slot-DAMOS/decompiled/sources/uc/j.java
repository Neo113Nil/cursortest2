package uc;

import a2.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final j IOS_PUSH = new j("IOS_PUSH", 0, "iOSPush");
    public static final j ANDROID_PUSH = new j("ANDROID_PUSH", 1, "AndroidPush");
    public static final j FIREOS_PUSH = new j("FIREOS_PUSH", 2, "FireOSPush");
    public static final j CHROME_EXTENSION = new j("CHROME_EXTENSION", 3, "ChromeExtensionPush");
    public static final j CHROME_PUSH = new j("CHROME_PUSH", 4, "ChromePush");
    public static final j WINDOWS_PUSH = new j("WINDOWS_PUSH", 5, "WindowsPush");
    public static final j SAFARI_PUSH = new j("SAFARI_PUSH", 6, "SafariPush");
    public static final j SAFARI_PUSH_LEGACY = new j("SAFARI_PUSH_LEGACY", 7, "SafariLegacyPush");
    public static final j FIREFOX_PUSH = new j("FIREFOX_PUSH", 8, "FirefoxPush");
    public static final j MACOS_PUSH = new j("MACOS_PUSH", 9, "macOSPush");
    public static final j EMAIL = new j("EMAIL", 10, "Email");
    public static final j HUAWEI_PUSH = new j("HUAWEI_PUSH", 11, "HuaweiPush");
    public static final j SMS = new j("SMS", 12, "SMS");

    private static final /* synthetic */ j[] $values() {
        return new j[]{IOS_PUSH, ANDROID_PUSH, FIREOS_PUSH, CHROME_EXTENSION, CHROME_PUSH, WINDOWS_PUSH, SAFARI_PUSH, SAFARI_PUSH_LEGACY, FIREFOX_PUSH, MACOS_PUSH, EMAIL, HUAWEI_PUSH, SMS};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
        Companion = new a(null);
    }

    private j(String str, int i3, String str2) {
        this.value = str2;
    }

    public static od.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j fromDeviceType(ja.a aVar) {
            aVar.getClass();
            int i3 = i.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i3 == 1) {
                return j.ANDROID_PUSH;
            }
            if (i3 == 2) {
                return j.FIREOS_PUSH;
            }
            if (i3 == 3) {
                return j.HUAWEI_PUSH;
            }
            r.p();
            return null;
        }

        public final j fromString(String str) {
            str.getClass();
            for (j jVar : j.values()) {
                if (o.f(jVar.getValue(), str, true)) {
                    return jVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
