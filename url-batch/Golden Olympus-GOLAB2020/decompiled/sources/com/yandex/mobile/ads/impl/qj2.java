package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class qj2 {

    /* renamed from: f, reason: collision with root package name */
    private int f30814f;

    /* renamed from: h, reason: collision with root package name */
    private int f30816h;

    /* renamed from: o, reason: collision with root package name */
    private float f30823o;

    /* renamed from: a, reason: collision with root package name */
    private String f30809a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f30810b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f30811c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f30812d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f30813e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30815g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30817i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f30818j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f30819k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f30820l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f30821m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f30822n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f30824p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30825q = false;

    public final int a() {
        if (this.f30817i) {
            return this.f30816h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final boolean b() {
        return this.f30825q;
    }

    public final int c() {
        if (this.f30815g) {
            return this.f30814f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final String d() {
        return this.f30813e;
    }

    public final float e() {
        return this.f30823o;
    }

    public final int f() {
        return this.f30822n;
    }

    public final int g() {
        return this.f30824p;
    }

    public final int h() {
        int i4 = this.f30820l;
        if (i4 == -1 && this.f30821m == -1) {
            return -1;
        }
        return (i4 == 1 ? 1 : 0) | (this.f30821m == 1 ? 2 : 0);
    }

    public final boolean i() {
        return this.f30817i;
    }

    public final boolean j() {
        return this.f30815g;
    }

    public final boolean k() {
        return this.f30818j == 1;
    }

    public final boolean l() {
        return this.f30819k == 1;
    }

    public final void m() {
        this.f30820l = 1;
    }

    public final void n() {
        this.f30821m = 1;
    }

    public final void o() {
        this.f30819k = 1;
    }

    public final void b(int i4) {
        this.f30814f = i4;
        this.f30815g = true;
    }

    public final void d(int i4) {
        this.f30824p = i4;
    }

    public final void d(String str) {
        this.f30812d = str;
    }

    public final int a(String str, String str2, Set<String> set, String str3) {
        int i4;
        if (this.f30809a.isEmpty() && this.f30810b.isEmpty() && this.f30811c.isEmpty() && this.f30812d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f30809a;
        if (str4.isEmpty()) {
            i4 = 0;
        } else {
            i4 = str4.equals(str) ? 1073741824 : -1;
        }
        String str5 = this.f30810b;
        if (!str5.isEmpty() && i4 != -1) {
            i4 = str5.equals(str2) ? i4 + 2 : -1;
        }
        String str6 = this.f30812d;
        if (!str6.isEmpty() && i4 != -1) {
            i4 = str6.equals(str3) ? i4 + 4 : -1;
        }
        if (i4 == -1 || !set.containsAll(this.f30811c)) {
            return 0;
        }
        return (this.f30811c.size() * 4) + i4;
    }

    public final void b(String str) {
        this.f30809a = str;
    }

    public final void c(int i4) {
        this.f30822n = i4;
    }

    public final void c(String str) {
        this.f30810b = str;
    }

    public final void a(int i4) {
        this.f30816h = i4;
        this.f30817i = true;
    }

    public final void a(boolean z4) {
        this.f30825q = z4;
    }

    public final void a(String str) {
        this.f30813e = C2207rf.b(str);
    }

    public final void a(float f4) {
        this.f30823o = f4;
    }

    public final void a(String[] strArr) {
        this.f30811c = new HashSet(Arrays.asList(strArr));
    }
}
