package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: com.ironsource.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1456e4 {

    /* renamed from: c, reason: collision with root package name */
    private String f15969c;

    /* renamed from: d, reason: collision with root package name */
    private String f15970d;

    /* renamed from: f, reason: collision with root package name */
    private int f15972f;

    /* renamed from: b, reason: collision with root package name */
    private HashSet<String> f15968b = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private boolean f15967a = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15971e = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15973g = true;

    public int a() {
        return this.f15972f;
    }

    public HashSet<String> b() {
        return this.f15968b;
    }

    public String c() {
        return this.f15970d;
    }

    public String d() {
        return this.f15969c;
    }

    public boolean e() {
        return this.f15971e;
    }

    public boolean f() {
        return this.f15967a;
    }

    public boolean g() {
        return this.f15973g;
    }

    public void a(int i4) {
        this.f15972f = i4;
    }

    public void b(String str) {
        this.f15970d = str;
    }

    public void c(String str) {
        this.f15969c = str;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15968b.add(str);
    }

    public void b(boolean z4) {
        this.f15973g = z4;
    }

    public void c(boolean z4) {
        this.f15971e = z4;
    }

    public void a(boolean z4) {
        this.f15967a = z4;
    }
}
