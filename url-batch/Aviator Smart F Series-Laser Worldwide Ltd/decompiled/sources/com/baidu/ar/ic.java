package com.baidu.ar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes.dex */
public class ic implements f8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2478a;

    /* renamed from: b, reason: collision with root package name */
    public volatile f8 f2479b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f2480c;

    /* renamed from: d, reason: collision with root package name */
    public Method f2481d;

    /* renamed from: e, reason: collision with root package name */
    public w3 f2482e;

    /* renamed from: f, reason: collision with root package name */
    public Queue<kc> f2483f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2484g;

    public ic(String str, Queue<kc> queue, boolean z7) {
        this.f2478a = str;
        this.f2483f = queue;
        this.f2484g = z7;
    }

    public void a(f8 f8Var) {
        this.f2479b = f8Var;
    }

    public f8 b() {
        return this.f2479b != null ? this.f2479b : this.f2484g ? e9.f2152b : c();
    }

    public final f8 c() {
        if (this.f2482e == null) {
            this.f2482e = new w3(this, this.f2483f);
        }
        return this.f2482e;
    }

    public boolean d() {
        Boolean bool = this.f2480c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f2481d = this.f2479b.getClass().getMethod("log", h8.class);
            this.f2480c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f2480c = Boolean.FALSE;
        }
        return this.f2480c.booleanValue();
    }

    public boolean e() {
        return this.f2479b instanceof e9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ic.class == obj.getClass() && this.f2478a.equals(((ic) obj).f2478a);
    }

    public boolean f() {
        return this.f2479b == null;
    }

    @Override // com.baidu.ar.f8
    public String getName() {
        return this.f2478a;
    }

    public int hashCode() {
        return this.f2478a.hashCode();
    }

    public void a(h8 h8Var) {
        if (d()) {
            try {
                this.f2481d.invoke(this.f2479b, h8Var);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    @Override // com.baidu.ar.f8
    public void b(String str) {
        b().b(str);
    }

    @Override // com.baidu.ar.f8
    public void a(String str) {
        b().a(str);
    }

    @Override // com.baidu.ar.f8
    public void b(String str, Throwable th) {
        b().b(str, th);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Object obj) {
        b().a(str, obj);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Object obj, Object obj2) {
        b().a(str, obj, obj2);
    }

    @Override // com.baidu.ar.f8
    public void a(String str, Throwable th) {
        b().a(str, th);
    }

    @Override // com.baidu.ar.f8
    public boolean a() {
        return b().a();
    }
}
