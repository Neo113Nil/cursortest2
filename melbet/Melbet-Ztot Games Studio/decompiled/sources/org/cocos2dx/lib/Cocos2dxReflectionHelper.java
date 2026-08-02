package org.cocos2dx.lib;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class Cocos2dxReflectionHelper {
    public static <T> T getConstantValue(Class<?> cls, String str) {
        try {
            return (T) cls.getDeclaredField(str).get(null);
        } catch (IllegalAccessException e) {
            Log.e("error", str + " is not accessible", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.e("error", "Arguments error when getting " + str, e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Log.e("error", "Cannot find " + str + " in " + cls.getName(), e3);
            return null;
        } catch (Exception e4) {
            Log.e("error", "Cannot get constant " + str, e4);
            return null;
        }
    }

    public static <T> T invokeInstanceMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?> cls = obj.getClass();
        try {
            return (T) cls.getMethod(str, clsArr).invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            Log.e("error", str + " is not accessible", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.e("error", "Arguments are incorrect when invoking " + str, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("error", "Cannot find " + str + " in " + cls.getName(), e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("error", "An exception was thrown by the invoked method when invoking " + str, e4);
            return null;
        }
    }
}
