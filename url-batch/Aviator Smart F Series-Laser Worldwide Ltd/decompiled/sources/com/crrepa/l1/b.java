package com.crrepa.l1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Field f13195a;

    public b(Field field) {
        com.crrepa.n1.a.a(field);
        this.f13195a = field;
    }

    Object a(Object obj) {
        return this.f13195a.get(obj);
    }

    public Class<?> b() {
        return this.f13195a.getType();
    }

    public Type c() {
        return this.f13195a.getGenericType();
    }

    public Class<?> d() {
        return this.f13195a.getDeclaringClass();
    }

    public String e() {
        return this.f13195a.getName();
    }

    boolean f() {
        return this.f13195a.isSynthetic();
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.f13195a.getAnnotation(cls);
    }

    public Collection<Annotation> a() {
        return Arrays.asList(this.f13195a.getAnnotations());
    }

    public boolean a(int i8) {
        return (i8 & this.f13195a.getModifiers()) != 0;
    }
}
