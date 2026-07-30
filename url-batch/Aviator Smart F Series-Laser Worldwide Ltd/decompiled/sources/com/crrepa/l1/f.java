package com.crrepa.l1;

import com.crrepa.o1.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.n1.d f13234a;

    /* renamed from: b, reason: collision with root package name */
    private v f13235b;

    /* renamed from: c, reason: collision with root package name */
    private d f13236c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, Object> f13237d;

    /* renamed from: e, reason: collision with root package name */
    private final List<p> f13238e;

    /* renamed from: f, reason: collision with root package name */
    private final List<p> f13239f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13240g;

    /* renamed from: h, reason: collision with root package name */
    private String f13241h;

    /* renamed from: i, reason: collision with root package name */
    private int f13242i;

    /* renamed from: j, reason: collision with root package name */
    private int f13243j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13244k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13245l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f13246m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13247n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13248o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13249p;

    /* renamed from: q, reason: collision with root package name */
    private m f13250q;

    /* renamed from: r, reason: collision with root package name */
    private m f13251r;

    public f() {
        this.f13234a = com.crrepa.n1.d.f13415h;
        this.f13235b = v.f13260a;
        this.f13236c = c.f13196a;
        this.f13237d = new HashMap();
        this.f13238e = new ArrayList();
        this.f13239f = new ArrayList();
        this.f13240g = false;
        this.f13242i = 2;
        this.f13243j = 2;
        this.f13244k = false;
        this.f13245l = false;
        this.f13246m = true;
        this.f13247n = false;
        this.f13248o = false;
        this.f13249p = false;
        this.f13250q = w.f13263a;
        this.f13251r = w.f13264b;
    }

    public e a() {
        List<p> arrayList = new ArrayList<>(this.f13238e.size() + this.f13239f.size() + 3);
        arrayList.addAll(this.f13238e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f13239f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f13241h, this.f13242i, this.f13243j, arrayList);
        return new e(this.f13234a, this.f13236c, this.f13237d, this.f13240g, this.f13244k, this.f13248o, this.f13246m, this.f13247n, this.f13249p, this.f13245l, this.f13235b, this.f13241h, this.f13242i, this.f13243j, this.f13238e, this.f13239f, arrayList, this.f13250q, this.f13251r);
    }

    public f b() {
        this.f13246m = false;
        return this;
    }

    public f c() {
        this.f13234a = this.f13234a.b();
        return this;
    }

    public f d() {
        this.f13244k = true;
        return this;
    }

    public f e() {
        this.f13234a = this.f13234a.c();
        return this;
    }

    public f f() {
        this.f13248o = true;
        return this;
    }

    public f g() {
        this.f13240g = true;
        return this;
    }

    public f h() {
        this.f13245l = true;
        return this;
    }

    public f i() {
        this.f13249p = true;
        return this;
    }

    public f j() {
        this.f13247n = true;
        return this;
    }

    f(e eVar) {
        this.f13234a = com.crrepa.n1.d.f13415h;
        this.f13235b = v.f13260a;
        this.f13236c = c.f13196a;
        HashMap hashMap = new HashMap();
        this.f13237d = hashMap;
        ArrayList arrayList = new ArrayList();
        this.f13238e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13239f = arrayList2;
        this.f13240g = false;
        this.f13242i = 2;
        this.f13243j = 2;
        this.f13244k = false;
        this.f13245l = false;
        this.f13246m = true;
        this.f13247n = false;
        this.f13248o = false;
        this.f13249p = false;
        this.f13250q = w.f13263a;
        this.f13251r = w.f13264b;
        this.f13234a = eVar.f13211f;
        this.f13236c = eVar.f13212g;
        hashMap.putAll(eVar.f13213h);
        this.f13240g = eVar.f13214i;
        this.f13244k = eVar.f13215j;
        this.f13248o = eVar.f13216k;
        this.f13246m = eVar.f13217l;
        this.f13247n = eVar.f13218m;
        this.f13249p = eVar.f13219n;
        this.f13245l = eVar.f13220o;
        this.f13235b = eVar.f13224s;
        this.f13241h = eVar.f13221p;
        this.f13242i = eVar.f13222q;
        this.f13243j = eVar.f13223r;
        arrayList.addAll(eVar.f13225t);
        arrayList2.addAll(eVar.f13226u);
        this.f13250q = eVar.f13227v;
        this.f13251r = eVar.f13228w;
    }

    public f a(double d8) {
        this.f13234a = this.f13234a.a(d8);
        return this;
    }

    public f b(a aVar) {
        this.f13234a = this.f13234a.a(aVar, true, false);
        return this;
    }

    public f a(int i8) {
        this.f13242i = i8;
        this.f13241h = null;
        return this;
    }

    public f b(m mVar) {
        this.f13250q = mVar;
        return this;
    }

    public f a(int i8, int i9) {
        this.f13242i = i8;
        this.f13243j = i9;
        this.f13241h = null;
        return this;
    }

    public f a(a aVar) {
        this.f13234a = this.f13234a.a(aVar, false, true);
        return this;
    }

    public f a(c cVar) {
        this.f13236c = cVar;
        return this;
    }

    public f a(d dVar) {
        this.f13236c = dVar;
        return this;
    }

    public f a(v vVar) {
        this.f13235b = vVar;
        return this;
    }

    public f a(m mVar) {
        this.f13251r = mVar;
        return this;
    }

    public f a(p pVar) {
        this.f13238e.add(pVar);
        return this;
    }

    public f a(Class<?> cls, Object obj) {
        com.crrepa.n1.a.a(obj instanceof n);
        if (obj instanceof n) {
            this.f13238e.add(com.crrepa.o1.m.b(cls, (n) obj));
        }
        return this;
    }

    public f a(String str) {
        this.f13241h = str;
        return this;
    }

    public f a(Type type, Object obj) {
        com.crrepa.n1.a.a(obj instanceof n);
        if (obj instanceof n) {
            this.f13238e.add(com.crrepa.o1.m.a(com.crrepa.s1.a.a(type), (n) obj));
        }
        return this;
    }

    public f a(int... iArr) {
        this.f13234a = this.f13234a.a(iArr);
        return this;
    }

    public f a(a... aVarArr) {
        for (a aVar : aVarArr) {
            this.f13234a = this.f13234a.a(null, true, true);
        }
        return this;
    }

    private void a(String str, int i8, int i9, List<p> list) {
        p pVar;
        p pVar2;
        boolean z7 = com.crrepa.r1.d.f13755a;
        p pVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            pVar = d.b.f13484b.a(str);
            if (z7) {
                pVar3 = com.crrepa.r1.d.f13757c.a(str);
                pVar2 = com.crrepa.r1.d.f13756b.a(str);
            }
            pVar2 = null;
        } else {
            if (i8 == 2 || i9 == 2) {
                return;
            }
            p a8 = d.b.f13484b.a(i8, i9);
            if (z7) {
                pVar3 = com.crrepa.r1.d.f13757c.a(i8, i9);
                p a9 = com.crrepa.r1.d.f13756b.a(i8, i9);
                pVar = a8;
                pVar2 = a9;
            } else {
                pVar = a8;
                pVar2 = null;
            }
        }
        list.add(pVar);
        if (z7) {
            list.add(pVar3);
            list.add(pVar2);
        }
    }
}
