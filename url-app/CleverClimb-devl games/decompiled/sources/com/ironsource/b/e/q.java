package com.ironsource.b.e;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RewardedVideoConfigurations.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<k> f6829a;

    /* renamed from: b, reason: collision with root package name */
    private b f6830b;

    /* renamed from: c, reason: collision with root package name */
    private int f6831c;

    /* renamed from: d, reason: collision with root package name */
    private int f6832d;
    private String e;
    private String f;
    private k g;

    public q() {
        this.f6829a = new ArrayList<>();
        this.f6830b = new b();
    }

    public q(int i, int i2, b bVar) {
        this.f6829a = new ArrayList<>();
        this.f6831c = i;
        this.f6832d = i2;
        this.f6830b = bVar;
    }

    public int a() {
        return this.f6832d;
    }

    public void a(k kVar) {
        if (kVar != null) {
            this.f6829a.add(kVar);
            if (kVar.a() == 0) {
                this.g = kVar;
            }
        }
    }

    public k a(String str) {
        Iterator<k> it = this.f6829a.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (next.b().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public k b() {
        return this.g;
    }

    public int c() {
        return this.f6831c;
    }

    public b d() {
        return this.f6830b;
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
