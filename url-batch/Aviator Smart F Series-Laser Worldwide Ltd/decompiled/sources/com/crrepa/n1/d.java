package com.crrepa.n1;

import cn.hutool.core.convert.impl.s;
import com.crrepa.l1.n;
import com.crrepa.l1.p;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements p, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    private static final double f13414g = -1.0d;

    /* renamed from: h, reason: collision with root package name */
    public static final d f13415h = new d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f13419d;

    /* renamed from: a, reason: collision with root package name */
    private double f13416a = f13414g;

    /* renamed from: b, reason: collision with root package name */
    private int f13417b = GattError.GATT_PENDING;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13418c = true;

    /* renamed from: e, reason: collision with root package name */
    private List<com.crrepa.l1.a> f13420e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private List<com.crrepa.l1.a> f13421f = Collections.emptyList();

    class a extends n {

        /* renamed from: a, reason: collision with root package name */
        private n f13422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13423b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13424c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.crrepa.l1.e f13425d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.crrepa.s1.a f13426e;

        a(boolean z7, boolean z8, com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
            this.f13423b = z7;
            this.f13424c = z8;
            this.f13425d = eVar;
            this.f13426e = aVar;
        }

        private n b() {
            n nVar = this.f13422a;
            if (nVar != null) {
                return nVar;
            }
            n a8 = this.f13425d.a(d.this, this.f13426e);
            this.f13422a = a8;
            return a8;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // com.crrepa.l1.n
        public T a(com.crrepa.t1.a aVar) {
            if (!this.f13423b) {
                return b().a(aVar);
            }
            aVar.z();
            return null;
        }

        @Override // com.crrepa.l1.n
        public void a(com.crrepa.t1.b bVar, T t7) {
            if (this.f13424c) {
                bVar.k();
            } else {
                b().a(bVar, t7);
            }
        }
    }

    private boolean d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    @Override // com.crrepa.l1.p
    public <T> n a(com.crrepa.l1.e eVar, com.crrepa.s1.a aVar) {
        Class<Object> a8 = aVar.a();
        boolean a9 = a((Class<?>) a8);
        boolean z7 = a9 || b(a8, true);
        boolean z8 = a9 || b(a8, false);
        if (z7 || z8) {
            return new a(z8, z7, eVar, aVar);
        }
        return null;
    }

    public d b() {
        d clone = clone();
        clone.f13418c = false;
        return clone;
    }

    public d c() {
        d clone = clone();
        clone.f13419d = true;
        return clone;
    }

    private boolean b(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || d(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean c(Class<?> cls) {
        return cls.isMemberClass() && !d(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    private boolean b(Class<?> cls, boolean z7) {
        Iterator<com.crrepa.l1.a> it = (z7 ? this.f13420e : this.f13421f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        s.a(it.next());
        throw null;
    }

    public d a(double d8) {
        d clone = clone();
        clone.f13416a = d8;
        return clone;
    }

    public d a(com.crrepa.l1.a aVar, boolean z7, boolean z8) {
        d clone = clone();
        if (z7) {
            ArrayList arrayList = new ArrayList(this.f13420e);
            clone.f13420e = arrayList;
            arrayList.add(aVar);
        }
        if (z8) {
            ArrayList arrayList2 = new ArrayList(this.f13421f);
            clone.f13421f = arrayList2;
            arrayList2.add(aVar);
        }
        return clone;
    }

    public d a(int... iArr) {
        d clone = clone();
        clone.f13417b = 0;
        for (int i8 : iArr) {
            clone.f13417b = i8 | clone.f13417b;
        }
        return clone;
    }

    private boolean a(i4.d dVar) {
        return dVar == null || dVar.value() <= this.f13416a;
    }

    private boolean a(i4.d dVar, i4.e eVar) {
        return a(dVar) && a(eVar);
    }

    private boolean a(i4.e eVar) {
        return eVar == null || eVar.value() > this.f13416a;
    }

    private boolean a(Class<?> cls) {
        if (this.f13416a == f13414g || a((i4.d) cls.getAnnotation(i4.d.class), (i4.e) cls.getAnnotation(i4.e.class))) {
            return (!this.f13418c && c(cls)) || b(cls);
        }
        return true;
    }

    public boolean a(Class<?> cls, boolean z7) {
        return a(cls) || b(cls, z7);
    }

    public boolean a(Field field, boolean z7) {
        i4.a aVar;
        if ((this.f13417b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f13416a != f13414g && !a((i4.d) field.getAnnotation(i4.d.class), (i4.e) field.getAnnotation(i4.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f13419d && ((aVar = (i4.a) field.getAnnotation(i4.a.class)) == null || (!z7 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f13418c && c(field.getType())) || b(field.getType())) {
            return true;
        }
        List<com.crrepa.l1.a> list = z7 ? this.f13420e : this.f13421f;
        if (list.isEmpty()) {
            return false;
        }
        new com.crrepa.l1.b(field);
        Iterator<com.crrepa.l1.a> it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        s.a(it.next());
        throw null;
    }
}
