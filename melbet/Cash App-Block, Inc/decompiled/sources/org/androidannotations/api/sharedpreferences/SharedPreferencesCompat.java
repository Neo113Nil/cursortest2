package org.androidannotations.api.sharedpreferences;

import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class SharedPreferencesCompat {
    public static final Method APPLY_METHOD;

    static {
        Method method = null;
        try {
            method = SharedPreferences.Editor.class.getMethod("apply", null);
        } catch (NoSuchMethodException unused) {
        }
        APPLY_METHOD = method;
        try {
            SharedPreferences.class.getMethod("getStringSet", String.class, Set.class);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            SharedPreferences.Editor.class.getMethod("putStringSet", String.class, Set.class);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public static void apply(SharedPreferences.Editor editor) {
        try {
            Method method = APPLY_METHOD;
            if (method == null) {
                throw new NoSuchMethodException();
            }
            try {
                method.invoke(editor, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                throw new NoSuchMethodException(method.getName());
            }
        } catch (NoSuchMethodException unused2) {
            editor.commit();
        }
    }
}
