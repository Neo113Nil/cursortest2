package com.facebook.ads.internal.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private d f5138c;

    /* renamed from: d, reason: collision with root package name */
    private String f5139d;

    /* renamed from: b, reason: collision with root package name */
    private int f5137b = 0;

    /* renamed from: a, reason: collision with root package name */
    private List<a> f5136a = new ArrayList();

    public c(d dVar, String str) {
        this.f5138c = dVar;
        this.f5139d = str;
    }

    public d a() {
        return this.f5138c;
    }

    public void a(a aVar) {
        this.f5136a.add(aVar);
    }

    public String b() {
        return this.f5139d;
    }

    public int c() {
        return this.f5136a.size();
    }

    public a d() {
        if (this.f5137b >= this.f5136a.size()) {
            return null;
        }
        this.f5137b++;
        return this.f5136a.get(this.f5137b - 1);
    }
}
