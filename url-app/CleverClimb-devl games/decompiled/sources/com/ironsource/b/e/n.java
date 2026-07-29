package com.ironsource.b.e;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: ProviderOrder.java */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private String f6820b;

    /* renamed from: c, reason: collision with root package name */
    private String f6821c;
    private String f;
    private String g;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f6819a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<String> f6822d = new ArrayList<>();
    private ArrayList<String> e = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f6819a;
    }

    public ArrayList<String> b() {
        return this.f6822d;
    }

    public ArrayList<String> c() {
        return this.e;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6819a.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6822d.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.add(str);
    }

    public String d() {
        return this.f6820b;
    }

    public void d(String str) {
        this.f6820b = str;
    }

    public String e() {
        return this.f6821c;
    }

    public void e(String str) {
        this.f6821c = str;
    }

    public void f(String str) {
        this.f = str;
    }

    public void g(String str) {
        this.g = str;
    }
}
