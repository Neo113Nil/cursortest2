package com.facebook.ads.internal.q.a;

import android.app.Activity;
import com.tapjoy.TJAdUnitConstants;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    public static Activity a() {
        try {
            return b();
        } catch (Exception unused) {
            return null;
        }
    }

    private static Activity b() {
        Class<?> cls = Class.forName("android.app.ActivityThread");
        Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(invoke);
        if (map == null) {
            return null;
        }
        for (Object obj : map.values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(TJAdUnitConstants.String.VIDEO_PAUSED);
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }
}
