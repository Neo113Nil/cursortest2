package com.google.gson.internal.a;

import com.google.gson.k;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes2.dex */
final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static Class f6528a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6529b = b();

    /* renamed from: c, reason: collision with root package name */
    private final Field f6530c = c();

    c() {
    }

    @Override // com.google.gson.internal.a.b
    public void a(AccessibleObject accessibleObject) {
        if (b(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }

    boolean b(AccessibleObject accessibleObject) {
        if (this.f6529b != null && this.f6530c != null) {
            try {
                f6528a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f6529b, accessibleObject, Long.valueOf(((Long) f6528a.getMethod("objectFieldOffset", Field.class).invoke(this.f6529b, this.f6530c)).longValue()), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Object b() {
        try {
            f6528a = Class.forName("sun.misc.Unsafe");
            Field declaredField = f6528a.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
