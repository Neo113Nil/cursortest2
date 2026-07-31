package n3;

import F5.q;
import H5.r;
import a.AbstractC0219a;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0552j {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ EnumC0552j[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final EnumC0552j IOS_PUSH = new EnumC0552j("IOS_PUSH", 0, "iOSPush");
    public static final EnumC0552j ANDROID_PUSH = new EnumC0552j("ANDROID_PUSH", 1, "AndroidPush");
    public static final EnumC0552j FIREOS_PUSH = new EnumC0552j("FIREOS_PUSH", 2, "FireOSPush");
    public static final EnumC0552j CHROME_EXTENSION = new EnumC0552j("CHROME_EXTENSION", 3, "ChromeExtensionPush");
    public static final EnumC0552j CHROME_PUSH = new EnumC0552j("CHROME_PUSH", 4, "ChromePush");
    public static final EnumC0552j WINDOWS_PUSH = new EnumC0552j("WINDOWS_PUSH", 5, "WindowsPush");
    public static final EnumC0552j SAFARI_PUSH = new EnumC0552j("SAFARI_PUSH", 6, "SafariPush");
    public static final EnumC0552j SAFARI_PUSH_LEGACY = new EnumC0552j("SAFARI_PUSH_LEGACY", 7, "SafariLegacyPush");
    public static final EnumC0552j FIREFOX_PUSH = new EnumC0552j("FIREFOX_PUSH", 8, "FirefoxPush");
    public static final EnumC0552j MACOS_PUSH = new EnumC0552j("MACOS_PUSH", 9, "macOSPush");
    public static final EnumC0552j EMAIL = new EnumC0552j("EMAIL", 10, "Email");
    public static final EnumC0552j HUAWEI_PUSH = new EnumC0552j("HUAWEI_PUSH", 11, "HuaweiPush");
    public static final EnumC0552j SMS = new EnumC0552j("SMS", 12, "SMS");

    /* renamed from: n3.j$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final EnumC0552j fromDeviceType(Y1.a type) {
            kotlin.jvm.internal.i.e(type, "type");
            int i7 = AbstractC0551i.$EnumSwitchMapping$0[type.ordinal()];
            if (i7 == 1) {
                return EnumC0552j.ANDROID_PUSH;
            }
            if (i7 == 2) {
                return EnumC0552j.FIREOS_PUSH;
            }
            if (i7 == 3) {
                return EnumC0552j.HUAWEI_PUSH;
            }
            throw new r();
        }

        public final EnumC0552j fromString(String type) {
            kotlin.jvm.internal.i.e(type, "type");
            for (EnumC0552j enumC0552j : EnumC0552j.values()) {
                if (q.C(enumC0552j.getValue(), type)) {
                    return enumC0552j;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ EnumC0552j[] $values() {
        return new EnumC0552j[]{IOS_PUSH, ANDROID_PUSH, FIREOS_PUSH, CHROME_EXTENSION, CHROME_PUSH, WINDOWS_PUSH, SAFARI_PUSH, SAFARI_PUSH_LEGACY, FIREFOX_PUSH, MACOS_PUSH, EMAIL, HUAWEI_PUSH, SMS};
    }

    static {
        EnumC0552j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
        Companion = new a(null);
    }

    private EnumC0552j(String str, int i7, String str2) {
        this.value = str2;
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0552j valueOf(String str) {
        return (EnumC0552j) Enum.valueOf(EnumC0552j.class, str);
    }

    public static EnumC0552j[] values() {
        return (EnumC0552j[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
