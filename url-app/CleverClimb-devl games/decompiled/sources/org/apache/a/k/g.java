package org.apache.a.k;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/* compiled from: VersionInfo.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f9994a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9995b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9996c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9997d;
    private final String e;

    protected g(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        this.f9994a = str;
        this.f9995b = str2 == null ? "UNAVAILABLE" : str2;
        this.f9996c = str3 == null ? "UNAVAILABLE" : str3;
        this.f9997d = str4 == null ? "UNAVAILABLE" : str4;
        this.e = str5 == null ? "UNAVAILABLE" : str5;
    }

    public final String a() {
        return this.f9996c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.f9994a.length() + 20 + this.f9995b.length() + this.f9996c.length() + this.f9997d.length() + this.e.length());
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.f9994a);
        stringBuffer.append(':');
        stringBuffer.append(this.f9995b);
        if (!"UNAVAILABLE".equals(this.f9996c)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f9996c);
        }
        if (!"UNAVAILABLE".equals(this.f9997d)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f9997d);
        }
        stringBuffer.append(')');
        if (!"UNAVAILABLE".equals(this.e)) {
            stringBuffer.append('@');
            stringBuffer.append(this.e);
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g a(String str, ClassLoader classLoader) {
        Properties properties;
        InputStream resourceAsStream;
        if (str == null) {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.replace('.', '/'));
            stringBuffer.append("/");
            stringBuffer.append("version.properties");
            resourceAsStream = classLoader.getResourceAsStream(stringBuffer.toString());
        } catch (IOException unused) {
        }
        if (resourceAsStream != null) {
            try {
                properties = new Properties();
                properties.load(resourceAsStream);
                if (properties == null) {
                    return a(str, properties, classLoader);
                }
                return null;
            } finally {
                resourceAsStream.close();
            }
        }
        properties = null;
        if (properties == null) {
        }
    }

    protected static final g a(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str == null) {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        if (map != null) {
            String str5 = (String) map.get("info.module");
            if (str5 != null && str5.length() < 1) {
                str5 = null;
            }
            String str6 = (String) map.get("info.release");
            if (str6 != null && (str6.length() < 1 || str6.equals("${pom.version}"))) {
                str6 = null;
            }
            String str7 = (String) map.get("info.timestamp");
            str4 = (str7 == null || (str7.length() >= 1 && !str7.equals("${mvn.timestamp}"))) ? str7 : null;
            str2 = str5;
            str3 = str6;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        return new g(str, str2, str3, str4, classLoader != null ? classLoader.toString() : null);
    }
}
