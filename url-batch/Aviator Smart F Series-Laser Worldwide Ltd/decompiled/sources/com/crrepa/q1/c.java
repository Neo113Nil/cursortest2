package com.crrepa.q1;

import com.crrepa.l1.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    private static Class f13711d;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13712b = c();

    /* renamed from: c, reason: collision with root package name */
    private final Field f13713c = b();

    c() {
    }

    private static Field b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object c() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f13711d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.crrepa.q1.b
    public void a(AccessibleObject accessibleObject) {
        if (b(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e8) {
            throw new l("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e8);
        }
    }

    boolean b(AccessibleObject accessibleObject) {
        if (this.f13712b != null && this.f13713c != null) {
            try {
                f13711d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f13712b, accessibleObject, Long.valueOf(((Long) f13711d.getMethod("objectFieldOffset", Field.class).invoke(this.f13712b, this.f13713c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
