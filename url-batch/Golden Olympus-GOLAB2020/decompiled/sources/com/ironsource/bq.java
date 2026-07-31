package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class bq {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f15641a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f15642b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<String> f15643c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f15644d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f15643c;
    }

    public ArrayList<String> b() {
        return this.f15642b;
    }

    public ArrayList<String> c() {
        return this.f15644d;
    }

    public ArrayList<String> d() {
        return this.f15641a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15643c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15642b.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15644d.add(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15641a.add(str);
    }
}
