package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* loaded from: classes.dex */
public final class ud0 implements c3.e {

    /* renamed from: a, reason: collision with root package name */
    private final Date f12744a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12745b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f12746c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12747d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f12748e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12749f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12750g;

    /* renamed from: h, reason: collision with root package name */
    private final String f12751h;

    public ud0(Date date, int i7, Set<String> set, Location location, boolean z6, int i8, boolean z7, int i9, String str) {
        this.f12744a = date;
        this.f12745b = i7;
        this.f12746c = set;
        this.f12748e = location;
        this.f12747d = z6;
        this.f12749f = i8;
        this.f12750g = z7;
        this.f12751h = str;
    }

    @Override // c3.e
    @Deprecated
    public final boolean b() {
        return this.f12750g;
    }

    @Override // c3.e
    @Deprecated
    public final Date c() {
        return this.f12744a;
    }

    @Override // c3.e
    public final boolean d() {
        return this.f12747d;
    }

    @Override // c3.e
    public final Set<String> e() {
        return this.f12746c;
    }

    @Override // c3.e
    public final int h() {
        return this.f12749f;
    }

    @Override // c3.e
    public final Location j() {
        return this.f12748e;
    }

    @Override // c3.e
    @Deprecated
    public final int k() {
        return this.f12745b;
    }
}
