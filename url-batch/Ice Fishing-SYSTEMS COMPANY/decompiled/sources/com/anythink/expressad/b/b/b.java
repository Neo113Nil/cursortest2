package com.anythink.expressad.b.b;

import com.anythink.expressad.foundation.d.d;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f18328a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f18329b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f18330c;

    /* renamed from: d, reason: collision with root package name */
    private int f18331d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f18332e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f18333f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private d f18334g;

    /* renamed from: h, reason: collision with root package name */
    private String f18335h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18336j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18337k;

    /* renamed from: l, reason: collision with root package name */
    private int f18338l;

    public b(String str, String str2) {
        this.f18330c = str;
        b(str2);
    }

    private String i() {
        return this.f18330c;
    }

    private HashSet<String> j() {
        return this.f18332e;
    }

    public final boolean a() {
        return this.f18336j;
    }

    public final boolean b() {
        return this.f18337k;
    }

    public final int c() {
        return this.f18338l;
    }

    public final int d() {
        return this.i;
    }

    public final String e() {
        return this.f18335h;
    }

    public final d f() {
        return this.f18334g;
    }

    public final int g() {
        return this.f18331d;
    }

    public final long h() {
        return this.f18333f;
    }

    public final void a(boolean z8) {
        this.f18336j = z8;
    }

    public final void b(boolean z8) {
        this.f18337k = z8;
    }

    public final void a(int i) {
        this.f18338l = i;
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void a(String str) {
        this.f18335h = str;
    }

    public final void b(String str) {
        this.f18331d++;
        this.f18332e.add(str);
    }

    public final void a(d dVar) {
        this.f18334g = dVar;
    }
}
