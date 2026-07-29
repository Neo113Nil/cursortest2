package com.cmplay.b;

import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.R;

/* compiled from: ShareContent.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private String f3925a;

    /* renamed from: b, reason: collision with root package name */
    private String f3926b;

    /* renamed from: c, reason: collision with root package name */
    private String f3927c;
    private int e;
    private int f;
    private String g;
    private String i;
    private int h = 1;

    /* renamed from: d, reason: collision with root package name */
    private String f3928d = GameApp.f4485a.getResources().getString(R.string.app_name);

    public void a(int i, int i2) {
        b(i);
        c(i2);
        e(a(i2));
        a(e.a(i, i2));
    }

    public static String a(int i) {
        if (1 == i || 2 == i || 3 == i) {
            if (1 == e.f3924d) {
                return com.dancingbogo.skyrolline.b.d.b("key_screenshot_url", "");
            }
            if (e.f3924d != 0) {
                int i2 = e.f3924d;
            }
        }
        return null;
    }

    public String a() {
        return this.f3925a;
    }

    public void a(String str) {
        this.f3925a = str;
    }

    public String b() {
        return this.f3926b;
    }

    public void b(String str) {
        this.f3926b = str;
        e.e = str;
    }

    public String c() {
        return this.f3927c;
    }

    public void c(String str) {
        this.f3927c = str;
    }

    public String d() {
        return this.f3928d;
    }

    public void d(String str) {
        this.f3928d = str;
    }

    public String e() {
        return this.g;
    }

    public void e(String str) {
        this.g = str;
    }

    public int f() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int g() {
        return this.f;
    }

    public void c(int i) {
        this.f = i;
        e.f3923c = i;
    }

    public int h() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public String i() {
        return this.i;
    }
}
