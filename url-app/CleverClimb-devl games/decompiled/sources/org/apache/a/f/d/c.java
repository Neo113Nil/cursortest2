package org.apache.a.f.d;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: BasicClientCookie.java */
/* loaded from: classes2.dex */
public class c implements Serializable, Cloneable, org.apache.a.d.a, org.apache.a.d.l {

    /* renamed from: a, reason: collision with root package name */
    private final String f9860a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f9861b;

    /* renamed from: c, reason: collision with root package name */
    private String f9862c;

    /* renamed from: d, reason: collision with root package name */
    private String f9863d;
    private String e;
    private Date f;
    private String g;
    private boolean h;
    private int i;

    @Override // org.apache.a.d.b
    public int[] e() {
        return null;
    }

    public c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f9860a = str;
        this.f9861b = new HashMap();
        this.f9862c = str2;
    }

    @Override // org.apache.a.d.b
    public String a() {
        return this.f9860a;
    }

    @Override // org.apache.a.d.b
    public String b() {
        return this.f9862c;
    }

    @Override // org.apache.a.d.l
    public void c(String str) {
        this.f9863d = str;
    }

    @Override // org.apache.a.d.l
    public void b(Date date) {
        this.f = date;
    }

    @Override // org.apache.a.d.b
    public String c() {
        return this.e;
    }

    @Override // org.apache.a.d.l
    public void d(String str) {
        if (str != null) {
            this.e = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.e = null;
        }
    }

    @Override // org.apache.a.d.b
    public String d() {
        return this.g;
    }

    @Override // org.apache.a.d.l
    public void e(String str) {
        this.g = str;
    }

    @Override // org.apache.a.d.b
    public boolean f() {
        return this.h;
    }

    @Override // org.apache.a.d.l
    public void a(boolean z) {
        this.h = z;
    }

    @Override // org.apache.a.d.b
    public int g() {
        return this.i;
    }

    @Override // org.apache.a.d.l
    public void a(int i) {
        this.i = i;
    }

    @Override // org.apache.a.d.b
    public boolean a(Date date) {
        if (date != null) {
            return this.f != null && this.f.getTime() <= date.getTime();
        }
        throw new IllegalArgumentException("Date may not be null");
    }

    public void a(String str, String str2) {
        this.f9861b.put(str, str2);
    }

    @Override // org.apache.a.d.a
    public String a(String str) {
        return this.f9861b.get(str);
    }

    @Override // org.apache.a.d.a
    public boolean b(String str) {
        return this.f9861b.get(str) != null;
    }

    public Object clone() throws CloneNotSupportedException {
        c cVar = (c) super.clone();
        cVar.f9861b = new HashMap(this.f9861b);
        return cVar;
    }

    public String toString() {
        return "[version: " + Integer.toString(this.i) + "][name: " + this.f9860a + "][value: " + this.f9862c + "][domain: " + this.e + "][path: " + this.g + "][expiry: " + this.f + "]";
    }
}
