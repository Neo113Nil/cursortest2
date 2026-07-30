package com.baidu.platform.comapi.walknavi.g.i.e;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private String f10025b;

    /* renamed from: c, reason: collision with root package name */
    private String f10026c;

    /* renamed from: d, reason: collision with root package name */
    private String f10027d;

    /* renamed from: e, reason: collision with root package name */
    private String[] f10028e;

    /* renamed from: f, reason: collision with root package name */
    private String f10029f;

    /* renamed from: g, reason: collision with root package name */
    private String f10030g;

    /* renamed from: h, reason: collision with root package name */
    private int f10031h;

    /* renamed from: i, reason: collision with root package name */
    private String f10032i;

    /* renamed from: l, reason: collision with root package name */
    private String f10035l;

    /* renamed from: m, reason: collision with root package name */
    private String f10036m;

    /* renamed from: a, reason: collision with root package name */
    private int f10024a = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10033j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10034k = true;

    public String a() {
        return this.f10036m;
    }

    public int b() {
        return this.f10024a;
    }

    public String c() {
        return this.f10025b;
    }

    public String d() {
        return this.f10026c;
    }

    public String e() {
        return this.f10027d;
    }

    public int f() {
        return this.f10031h;
    }

    public void g(String str) {
        this.f10030g = str;
    }

    public void h(String str) {
        this.f10032i = str;
    }

    public String toString() {
        return "ARResource [ err_code = " + this.f10024a + ", err_msg = " + this.f10025b + ", , version_code = " + this.f10030g + ", ar_resource = " + this.f10027d + " ]";
    }

    public void a(int i8) {
        this.f10024a = i8;
    }

    public void b(int i8) {
        this.f10031h = i8;
    }

    public void c(String str) {
        this.f10025b = str;
    }

    public void d(String str) {
        this.f10026c = str;
    }

    public void e(String str) {
        this.f10029f = str;
    }

    public void f(String str) {
        this.f10027d = str;
    }

    public boolean g() {
        return this.f10034k;
    }

    public boolean h() {
        return this.f10033j;
    }

    public void a(String str) {
        this.f10035l = str;
    }

    public void b(String str) {
        this.f10036m = str;
    }

    public void a(boolean z7) {
        this.f10034k = z7;
    }

    public void b(boolean z7) {
        this.f10033j = z7;
    }

    public void a(String[] strArr) {
        this.f10028e = strArr;
    }
}
