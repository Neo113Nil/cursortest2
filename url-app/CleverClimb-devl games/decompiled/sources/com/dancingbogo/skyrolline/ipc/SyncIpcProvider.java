package com.dancingbogo.skyrolline.ipc;

import android.content.ContentValues;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class SyncIpcProvider {
    public static void setDmcSdkEnabled(boolean z) {
    }

    private SyncIpcProvider() {
    }

    public static class a extends com.dancingbogo.skyrolline.ipc.a {
        @Override // com.dancingbogo.skyrolline.ipc.b
        public String a(ContentValues contentValues) {
            String asString = contentValues.getAsString("method_name");
            if (TextUtils.isEmpty(asString)) {
                return null;
            }
            try {
                Method method = SyncIpcProvider.class.getMethod(asString, b(contentValues));
                method.setAccessible(true);
                Object invoke = method.invoke(null, c(contentValues));
                if (invoke != null) {
                    return invoke.toString();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return null;
        }

        private Class<?>[] b(ContentValues contentValues) {
            Integer asInteger = contentValues.getAsInteger("arg_count");
            if (asInteger == null || asInteger.intValue() < 1) {
                return null;
            }
            Class<?>[] clsArr = new Class[asInteger.intValue()];
            for (int i = 0; i < asInteger.intValue(); i++) {
                String asString = contentValues.getAsString("arg_type" + i);
                if (!TextUtils.isEmpty(asString)) {
                    try {
                        Class<?> a2 = a(asString);
                        if (a2 == null) {
                            a2 = Class.forName(asString);
                        }
                        clsArr[i] = a2;
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
            return clsArr;
        }

        private Class<?> a(String str) {
            if (TextUtils.equals(str, Boolean.TYPE.getName())) {
                return Boolean.TYPE;
            }
            if (TextUtils.equals(str, Integer.TYPE.getName())) {
                return Integer.TYPE;
            }
            if (TextUtils.equals(str, Long.TYPE.getName())) {
                return Long.TYPE;
            }
            return null;
        }

        private Object[] c(ContentValues contentValues) {
            Integer asInteger = contentValues.getAsInteger("arg_count");
            if (asInteger == null || asInteger.intValue() < 1) {
                return null;
            }
            Object[] objArr = new Object[asInteger.intValue()];
            for (int i = 0; i < asInteger.intValue(); i++) {
                objArr[i] = contentValues.get(com.cmplay.base.util.ipc.a.PARAMS_TAG + i);
            }
            return objArr;
        }
    }
}
