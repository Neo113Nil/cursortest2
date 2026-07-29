package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.f<?>> f6613a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.internal.a.b f6614b = com.google.gson.internal.a.b.a();

    public c(Map<Type, com.google.gson.f<?>> map) {
        this.f6613a = map;
    }

    public <T> g<T> a(com.google.gson.b.a<T> aVar) {
        final Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        final com.google.gson.f<?> fVar = this.f6613a.get(type);
        if (fVar != null) {
            return new g<T>() { // from class: com.google.gson.internal.c.1
                @Override // com.google.gson.internal.g
                public T a() {
                    return (T) fVar.a(type);
                }
            };
        }
        final com.google.gson.f<?> fVar2 = this.f6613a.get(rawType);
        if (fVar2 != null) {
            return new g<T>() { // from class: com.google.gson.internal.c.7
                @Override // com.google.gson.internal.g
                public T a() {
                    return (T) fVar2.a(type);
                }
            };
        }
        g<T> a2 = a(rawType);
        if (a2 != null) {
            return a2;
        }
        g<T> a3 = a(type, rawType);
        return a3 != null ? a3 : b(type, rawType);
    }

    private <T> g<T> a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f6614b.a(declaredConstructor);
            }
            return new g<T>() { // from class: com.google.gson.internal.c.8
                @Override // com.google.gson.internal.g
                public T a() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> g<T> a(final Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new g<T>() { // from class: com.google.gson.internal.c.9
                    @Override // com.google.gson.internal.g
                    public T a() {
                        return (T) new TreeSet();
                    }
                };
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new g<T>() { // from class: com.google.gson.internal.c.10
                    @Override // com.google.gson.internal.g
                    public T a() {
                        if (type instanceof ParameterizedType) {
                            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                            if (type2 instanceof Class) {
                                return (T) EnumSet.noneOf((Class) type2);
                            }
                            throw new com.google.gson.k("Invalid EnumSet type: " + type.toString());
                        }
                        throw new com.google.gson.k("Invalid EnumSet type: " + type.toString());
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new g<T>() { // from class: com.google.gson.internal.c.11
                    @Override // com.google.gson.internal.g
                    public T a() {
                        return (T) new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new g<T>() { // from class: com.google.gson.internal.c.12
                    @Override // com.google.gson.internal.g
                    public T a() {
                        return (T) new ArrayDeque();
                    }
                };
            }
            return new g<T>() { // from class: com.google.gson.internal.c.13
                @Override // com.google.gson.internal.g
                public T a() {
                    return (T) new ArrayList();
                }
            };
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new g<T>() { // from class: com.google.gson.internal.c.14
                @Override // com.google.gson.internal.g
                public T a() {
                    return (T) new ConcurrentSkipListMap();
                }
            };
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new g<T>() { // from class: com.google.gson.internal.c.2
                @Override // com.google.gson.internal.g
                public T a() {
                    return (T) new ConcurrentHashMap();
                }
            };
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new g<T>() { // from class: com.google.gson.internal.c.3
                @Override // com.google.gson.internal.g
                public T a() {
                    return (T) new TreeMap();
                }
            };
        }
        if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(com.google.gson.b.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
            return new g<T>() { // from class: com.google.gson.internal.c.4
                @Override // com.google.gson.internal.g
                public T a() {
                    return (T) new LinkedHashMap();
                }
            };
        }
        return new g<T>() { // from class: com.google.gson.internal.c.5
            @Override // com.google.gson.internal.g
            public T a() {
                return (T) new f();
            }
        };
    }

    private <T> g<T> b(final Type type, final Class<? super T> cls) {
        return new g<T>() { // from class: com.google.gson.internal.c.6

            /* renamed from: d, reason: collision with root package name */
            private final k f6631d = k.a();

            @Override // com.google.gson.internal.g
            public T a() {
                try {
                    return (T) this.f6631d.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }

    public String toString() {
        return this.f6613a.toString();
    }
}
