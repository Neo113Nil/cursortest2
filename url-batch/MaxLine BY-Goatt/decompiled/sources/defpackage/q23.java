package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q23 extends e82 {
    public static Class d;
    public final Object b;
    public final Field c;

    public q23() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused2) {
        }
        this.c = field;
    }

    @Override // defpackage.e82
    public final void a(AccessibleObject accessibleObject) {
        Field field;
        Object obj = this.b;
        if (obj != null && (field = this.c) != null) {
            try {
                Long l = (Long) d.getMethod("objectFieldOffset", Field.class).invoke(obj, field);
                l.getClass();
                d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(obj, accessibleObject, l, Boolean.TRUE);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new u61("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }
}
