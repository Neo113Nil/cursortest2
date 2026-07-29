package com.ironsource.sdk.data;

import android.content.Context;

/* compiled from: SSASession.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f7175a = "sessionStartTime";

    /* renamed from: b, reason: collision with root package name */
    public final String f7176b = "sessionEndTime";

    /* renamed from: c, reason: collision with root package name */
    public final String f7177c = "sessionType";

    /* renamed from: d, reason: collision with root package name */
    public final String f7178d = "connectivity";
    private long e;
    private long f;
    private a g;
    private String h;

    /* compiled from: SSASession.java */
    public enum a {
        launched,
        backFromBG
    }

    public h(Context context, a aVar) {
        a(com.ironsource.sdk.g.f.a().longValue());
        a(aVar);
        a(com.ironsource.environment.b.a(context));
    }

    public void a() {
        b(com.ironsource.sdk.g.f.a().longValue());
    }

    public long b() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public long c() {
        return this.f;
    }

    public void b(long j) {
        this.f = j;
    }

    public a d() {
        return this.g;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public String e() {
        return this.h;
    }

    public void a(String str) {
        this.h = str;
    }
}
