package com.ironsource;

/* renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1533p2 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f18578e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final a f18579a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18580b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18581c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18582d;

    /* renamed from: com.ironsource.p2$a */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C1533p2(a aVar, long j4, long j5, long j6) {
        this.f18579a = aVar;
        this.f18580b = j4;
        this.f18581c = j5;
        this.f18582d = j6;
    }

    public a a() {
        return this.f18579a;
    }

    public long b() {
        return this.f18582d;
    }

    public long c() {
        return this.f18581c;
    }

    public long d() {
        return this.f18580b;
    }

    public boolean e() {
        a aVar = this.f18579a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f18579a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
