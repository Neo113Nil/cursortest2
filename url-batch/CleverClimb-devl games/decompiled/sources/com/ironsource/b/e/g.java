package com.ironsource.b.e;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: InterstitialConfigurations.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<h> f6792a;

    /* renamed from: b, reason: collision with root package name */
    private b f6793b;

    /* renamed from: c, reason: collision with root package name */
    private int f6794c;

    /* renamed from: d, reason: collision with root package name */
    private int f6795d;
    private String e;
    private String f;
    private h g;

    public g() {
        this.f6792a = new ArrayList<>();
        this.f6793b = new b();
    }

    public g(int i, int i2, b bVar) {
        this.f6792a = new ArrayList<>();
        this.f6794c = i;
        this.f6795d = i2;
        this.f6793b = bVar;
    }

    public void a(h hVar) {
        if (hVar != null) {
            this.f6792a.add(hVar);
            if (hVar.a() == 0) {
                this.g = hVar;
            }
        }
    }

    public h a(String str) {
        Iterator<h> it = this.f6792a.iterator();
        while (it.hasNext()) {
            h next = it.next();
            if (next.b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public h a() {
        return this.g;
    }

    public int b() {
        return this.f6794c;
    }

    public int c() {
        return this.f6795d;
    }

    public b d() {
        return this.f6793b;
    }

    public String e() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public String f() {
        return this.f;
    }

    public void c(String str) {
        this.f = str;
    }
}
