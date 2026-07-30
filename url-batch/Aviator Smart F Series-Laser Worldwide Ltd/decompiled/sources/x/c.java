package x;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f17280a;

    /* renamed from: b, reason: collision with root package name */
    public static String f17281b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x003d -> B:29:0x004a). Please report as a decompilation issue!!! */
    static {
        FileInputStream fileInputStream;
        ?? properties = new Properties();
        Properties properties2 = properties;
        if (Build.VERSION.SDK_INT < 26) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    try {
                        fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        properties2 = properties;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                properties2 = properties;
            } catch (Exception e10) {
                e = e10;
                fileInputStream2 = fileInputStream;
                Log.d("PhoneInfoUtil", e.getMessage());
                fileInputStream2.close();
                properties2 = properties;
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                f17280a = a(properties2, declaredMethod, "ro.miui.ui.version.name");
                properties = a(properties2, declaredMethod, "ro.build.display.id");
                f17281b = properties;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                try {
                    fileInputStream2.close();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                throw th;
            }
        }
        try {
            Method declaredMethod2 = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            f17280a = a(properties2, declaredMethod2, "ro.miui.ui.version.name");
            properties = a(properties2, declaredMethod2, "ro.build.display.id");
            f17281b = properties;
        } catch (Exception e12) {
            Log.d("PhoneInfoUtil", e12.getMessage());
        }
    }

    public static String a(Context context) {
        try {
            String str = Build.SERIAL;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            String str4 = Build.BRAND;
            String str5 = Build.DEVICE;
            Log.d("locke", "serialNum:" + str);
            Log.d("locke", "manufacturer:" + str2);
            Log.d("locke", "model:" + str3);
            Log.d("locke", "brand:" + str4);
            Log.d("locke", "device:" + str5);
            String string = Settings.System.getString(context.getContentResolver(), "android_id");
            Log.d("locke", "androidId:" + string);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            stringBuffer.append(str3);
            stringBuffer.append(str4);
            stringBuffer.append(str5);
            if (TextUtils.isEmpty(str) || str == null || "unknown".equals(str.toLowerCase())) {
                stringBuffer.append(string);
            } else {
                stringBuffer.append(str);
            }
            String stringBuffer2 = stringBuffer.toString();
            Log.d("locke", "id:" + stringBuffer2);
            return stringBuffer2;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String a(Properties properties, Method method, String str) {
        String property = properties.getProperty(str);
        if (property == null) {
            try {
                property = (String) method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        return property != null ? property.toLowerCase() : property;
    }
}
