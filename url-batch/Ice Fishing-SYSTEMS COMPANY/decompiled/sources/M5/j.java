package M5;

import M7.q;
import y4.EnumC5252a;
import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
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

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final j fromDeviceType(EnumC5252a type) {
            kotlin.jvm.internal.h.e(type, "type");
            int i = i.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return j.ANDROID_PUSH;
            }
            if (i == 2) {
                return j.FIREOS_PUSH;
            }
            if (i == 3) {
                return j.HUAWEI_PUSH;
            }
            throw new B0.c();
        }

        public final j fromString(String type) {
            kotlin.jvm.internal.h.e(type, "type");
            for (j jVar : j.values()) {
                if (q.C(jVar.getValue(), type)) {
                    return jVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ j[] $values() {
        return new j[]{IOS_PUSH, ANDROID_PUSH, FIREOS_PUSH, CHROME_EXTENSION, CHROME_PUSH, WINDOWS_PUSH, SAFARI_PUSH, SAFARI_PUSH_LEGACY, FIREFOX_PUSH, MACOS_PUSH, EMAIL, HUAWEI_PUSH, SMS};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = W2.e.d($values);
        Companion = new a(null);
    }

    private j(String str, int i, String str2) {
        this.value = str2;
    }

    public static InterfaceC5255a getEntries() {
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
}
