package com.google.gson.internal;

import com.google.gson.t;
import com.google.gson.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Excluder implements u, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final Excluder f6519a = new Excluder();
    private boolean e;

    /* renamed from: b, reason: collision with root package name */
    private double f6520b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    private int f6521c = 136;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6522d = true;
    private List<com.google.gson.a> f = Collections.emptyList();
    private List<com.google.gson.a> g = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.gson.u
    public <T> t<T> a(final com.google.gson.e eVar, final com.google.gson.b.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        boolean a2 = a(rawType);
        final boolean z = a2 || b(rawType, true);
        final boolean z2 = a2 || b(rawType, false);
        if (z || z2) {
            return new t<T>() { // from class: com.google.gson.internal.Excluder.1
                private t<T> f;

                @Override // com.google.gson.t
                public T b(com.google.gson.c.a aVar2) throws IOException {
                    if (z2) {
                        aVar2.n();
                        return null;
                    }
                    return b().b(aVar2);
                }

                @Override // com.google.gson.t
                public void a(com.google.gson.c.c cVar, T t) throws IOException {
                    if (z) {
                        cVar.f();
                    } else {
                        b().a(cVar, t);
                    }
                }

                private t<T> b() {
                    t<T> tVar = this.f;
                    if (tVar != null) {
                        return tVar;
                    }
                    t<T> a3 = eVar.a(Excluder.this, aVar);
                    this.f = a3;
                    return a3;
                }
            };
        }
        return null;
    }

    public boolean a(Field field, boolean z) {
        com.google.gson.a.a aVar;
        if ((this.f6521c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f6520b != -1.0d && !a((com.google.gson.a.d) field.getAnnotation(com.google.gson.a.d.class), (com.google.gson.a.e) field.getAnnotation(com.google.gson.a.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.e && ((aVar = (com.google.gson.a.a) field.getAnnotation(com.google.gson.a.a.class)) == null || (!z ? aVar.b() : aVar.a()))) {
            return true;
        }
        if ((!this.f6522d && c(field.getType())) || b(field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z ? this.f : this.g;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(Class<?> cls) {
        if (this.f6520b == -1.0d || a((com.google.gson.a.d) cls.getAnnotation(com.google.gson.a.d.class), (com.google.gson.a.e) cls.getAnnotation(com.google.gson.a.e.class))) {
            return (!this.f6522d && c(cls)) || b(cls);
        }
        return true;
    }

    public boolean a(Class<?> cls, boolean z) {
        return a(cls) || b(cls, z);
    }

    private boolean b(Class<?> cls, boolean z) {
        Iterator<com.google.gson.a> it = (z ? this.f : this.g).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    private boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean a(com.google.gson.a.d dVar, com.google.gson.a.e eVar) {
        return a(dVar) && a(eVar);
    }

    private boolean a(com.google.gson.a.d dVar) {
        return dVar == null || dVar.a() <= this.f6520b;
    }

    private boolean a(com.google.gson.a.e eVar) {
        return eVar == null || eVar.a() > this.f6520b;
    }
}
