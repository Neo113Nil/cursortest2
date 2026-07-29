package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: TUnion.java */
/* loaded from: classes2.dex */
public abstract class s<T extends s<?, ?>, F extends p> implements i<T, F> {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends ap>, aq> f9079c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    protected Object f9080a;

    /* renamed from: b, reason: collision with root package name */
    protected F f9081b;

    protected abstract F a(short s);

    protected abstract Object a(ah ahVar, ac acVar) throws o;

    protected abstract Object a(ah ahVar, short s) throws o;

    protected abstract void a(ah ahVar) throws o;

    protected abstract void b(ah ahVar) throws o;

    protected abstract void b(F f, Object obj) throws ClassCastException;

    protected abstract ac c(F f);

    protected abstract am d();

    protected s() {
        this.f9081b = null;
        this.f9080a = null;
    }

    static {
        f9079c.put(ar.class, new b());
        f9079c.put(as.class, new d());
    }

    protected s(F f, Object obj) {
        a((s<T, F>) f, obj);
    }

    protected s(s<T, F> sVar) {
        if (!sVar.getClass().equals(getClass())) {
            throw new ClassCastException();
        }
        this.f9081b = sVar.f9081b;
        this.f9080a = a(sVar.f9080a);
    }

    private static Object a(Object obj) {
        if (obj instanceof i) {
            return ((i) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return j.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    private static Map a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(a(entry.getKey()), a(entry.getValue()));
        }
        return hashMap;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public F a() {
        return this.f9081b;
    }

    public Object b() {
        return this.f9080a;
    }

    public Object a(F f) {
        if (f != this.f9081b) {
            throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.f9081b);
        }
        return b();
    }

    public Object a(int i) {
        return a((s<T, F>) a((short) i));
    }

    public boolean c() {
        return this.f9081b != null;
    }

    public boolean b(F f) {
        return this.f9081b == f;
    }

    public boolean b(int i) {
        return b((s<T, F>) a((short) i));
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void read(ah ahVar) throws o {
        f9079c.get(ahVar.D()).b().b(ahVar, this);
    }

    public void a(F f, Object obj) {
        b(f, obj);
        this.f9081b = f;
        this.f9080a = obj;
    }

    public void a(int i, Object obj) {
        a((s<T, F>) a((short) i), obj);
    }

    @Override // com.umeng.commonsdk.proguard.i
    public void write(ah ahVar) throws o {
        f9079c.get(ahVar.D()).b().a(ahVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (a() != null) {
            Object b2 = b();
            sb.append(c(a()).f9011a);
            sb.append(":");
            if (b2 instanceof ByteBuffer) {
                j.a((ByteBuffer) b2, sb);
            } else {
                sb.append(b2.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // com.umeng.commonsdk.proguard.i
    public final void clear() {
        this.f9081b = null;
        this.f9080a = null;
    }

    /* compiled from: TUnion.java */
    private static class b implements aq {
        private b() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: TUnion.java */
    private static class a extends ar<s> {
        private a() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, s sVar) throws o {
            sVar.f9081b = null;
            sVar.f9080a = null;
            ahVar.j();
            ac l = ahVar.l();
            sVar.f9080a = sVar.a(ahVar, l);
            if (sVar.f9080a != null) {
                sVar.f9081b = (F) sVar.a(l.f9013c);
            }
            ahVar.m();
            ahVar.l();
            ahVar.k();
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, s sVar) throws o {
            if (sVar.a() == null || sVar.b() == null) {
                throw new ai("Cannot write a TUnion with no set value!");
            }
            ahVar.a(sVar.d());
            ahVar.a(sVar.c(sVar.f9081b));
            sVar.a(ahVar);
            ahVar.c();
            ahVar.d();
            ahVar.b();
        }
    }

    /* compiled from: TUnion.java */
    private static class d implements aq {
        private d() {
        }

        @Override // com.umeng.commonsdk.proguard.aq
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: TUnion.java */
    private static class c extends as<s> {
        private c() {
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(ah ahVar, s sVar) throws o {
            sVar.f9081b = null;
            sVar.f9080a = null;
            short v = ahVar.v();
            sVar.f9080a = sVar.a(ahVar, v);
            if (sVar.f9080a != null) {
                sVar.f9081b = (F) sVar.a(v);
            }
        }

        @Override // com.umeng.commonsdk.proguard.ap
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ah ahVar, s sVar) throws o {
            if (sVar.a() == null || sVar.b() == null) {
                throw new ai("Cannot write a TUnion with no set value!");
            }
            ahVar.a(sVar.f9081b.a());
            sVar.b(ahVar);
        }
    }
}
