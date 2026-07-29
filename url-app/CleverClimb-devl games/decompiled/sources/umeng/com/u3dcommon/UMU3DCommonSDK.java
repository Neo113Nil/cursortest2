package umeng.com.u3dcommon;

import android.content.Context;
import android.util.Log;
import com.umeng.commonsdk.UMConfigure;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class UMU3DCommonSDK {
    public static void init(Context context, String str, String str2, int i, String str3) {
        initCocos("Unity", "3.0");
        UMConfigure.init(context, str, str2, i, str3);
    }

    public static void initCocos(String str, String str2) {
        try {
            Log.e("xxxxxx", "v=" + str + "  t=" + str2);
            Method declaredMethod = Class.forName("com.umeng.commonsdk.UMConfigure").getDeclaredMethod("setWraperType", String.class, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    public static void setLog(boolean z) {
        Log.e("cocos2d-x", "success");
        UMConfigure.setLogEnabled(z);
    }
}
