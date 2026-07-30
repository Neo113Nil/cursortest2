package cn.hutool.core.util;

/* loaded from: classes.dex */
public class c0 {
    public static final boolean IS_ANDROID;
    public static final boolean IS_AT_LEAST_JDK17;
    public static final boolean IS_JDK8;
    public static final int JVM_VERSION;

    static {
        int _getJvmVersion = _getJvmVersion();
        JVM_VERSION = _getJvmVersion;
        IS_JDK8 = 8 == _getJvmVersion;
        IS_AT_LEAST_JDK17 = _getJvmVersion >= 17;
        IS_ANDROID = _getJvmName().equals("Dalvik");
    }

    private static String _getJvmName() {
        return System.getProperty("java.vm.name");
    }

    private static int _getJvmVersion() {
        try {
            String property = System.getProperty("java.specification.version");
            if (!cn.hutool.core.text.l.isNotBlank(property)) {
                return -1;
            }
            if (property.startsWith("1.")) {
                property = property.substring(2);
            }
            if (property.indexOf(46) == -1) {
                return Integer.parseInt(property);
            }
            return -1;
        } catch (Throwable unused) {
            return 8;
        }
    }
}
