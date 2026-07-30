package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import n2.C4805a;
import n2.C4808d;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.eu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3171eu {

    /* renamed from: a, reason: collision with root package name */
    public q2.d1 f30530a;

    /* renamed from: b, reason: collision with root package name */
    public q2.g1 f30531b;

    /* renamed from: c, reason: collision with root package name */
    public String f30532c;

    /* renamed from: d, reason: collision with root package name */
    public q2.a1 f30533d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30534e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f30535f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f30536g;

    /* renamed from: h, reason: collision with root package name */
    public C3261gb f30537h;
    public q2.j1 i;

    /* renamed from: j, reason: collision with root package name */
    public C4805a f30538j;

    /* renamed from: k, reason: collision with root package name */
    public C4808d f30539k;

    /* renamed from: l, reason: collision with root package name */
    public q2.V f30540l;

    /* renamed from: m, reason: collision with root package name */
    public int f30541m = 1;

    /* renamed from: n, reason: collision with root package name */
    public C2464Ac f30542n;

    /* renamed from: o, reason: collision with root package name */
    public final J6.i f30543o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30544p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30545q;

    /* renamed from: r, reason: collision with root package name */
    public Fr f30546r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30547s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f30548t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f30549u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30550v;

    /* renamed from: w, reason: collision with root package name */
    public JSONArray f30551w;

    /* renamed from: x, reason: collision with root package name */
    public q2.Y f30552x;

    public C3171eu() {
        J6.i iVar = new J6.i(5);
        iVar.f1421u = 2;
        this.f30543o = iVar;
        this.f30544p = false;
        this.f30545q = false;
        this.f30547s = false;
        this.f30549u = new AtomicLong();
        this.f30550v = false;
    }

    public final C3226fu a() {
        O2.w.i(this.f30532c, "ad unit must not be null");
        O2.w.i(this.f30531b, "ad size must not be null");
        O2.w.i(this.f30530a, "ad request must not be null");
        return new C3226fu(this);
    }
}
