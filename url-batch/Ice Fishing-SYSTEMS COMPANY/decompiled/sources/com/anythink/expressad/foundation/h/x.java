package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19892a = "H+tU+FeXHM==";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19893b = "cv";

    /* renamed from: c, reason: collision with root package name */
    private static final String f19894c = "anythink_share_date";

    private static void a() {
        SharedPreferences.Editor edit = com.anythink.expressad.foundation.b.a.c().e().getApplicationContext().getSharedPreferences(f19893b, 0).edit();
        edit.clear();
        edit.commit();
    }

    public static Object b(Context context, String str, Object obj) {
        if (context != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
            SharedPreferences sharedPreferences = context.getSharedPreferences(f19894c, 0);
            if ("String".equals(simpleName)) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if ("Integer".equals(simpleName)) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if ("Boolean".equals(simpleName)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if ("Float".equals(simpleName)) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if ("Long".equals(simpleName)) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
        }
        return obj;
    }

    private static void c(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f19893b, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    private static Object d(Context context, String str, Object obj) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
        SharedPreferences sharedPreferences = context.getSharedPreferences(f19893b, 0);
        return "String".equals(simpleName) ? sharedPreferences.getString(str, (String) obj) : "Integer".equals(simpleName) ? Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue())) : "Boolean".equals(simpleName) ? Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue())) : "Float".equals(simpleName) ? Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue())) : "Long".equals(simpleName) ? Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue())) : obj;
    }

    private static void a(String str) {
        SharedPreferences.Editor edit = com.anythink.expressad.foundation.b.a.c().e().getApplicationContext().getSharedPreferences(f19893b, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    public static void a(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f19894c, 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }

    private static void a(Context context, String str) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f19894c, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    private static void a(Context context, String... strArr) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(f19894c, 0).edit();
        for (String str : strArr) {
            edit.remove(str);
        }
        edit.apply();
    }
}
