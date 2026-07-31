package com.ironsource;

/* renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1526o2 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f18455e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final a f18456a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18457b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18458c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18459d;

    /* renamed from: com.ironsource.o2$a */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        MANUAL_WITH_LOAD_ON_SHOW,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C1526o2(a aVar, long j4, long j5, long j6) {
        this.f18456a = aVar;
        this.f18457b = j4;
        this.f18458c = j5;
        this.f18459d = j6;
    }

    public a a() {
        return this.f18456a;
    }

    public long b() {
        return this.f18459d;
    }

    public long c() {
        return this.f18458c;
    }

    public long d() {
        return this.f18457b;
    }

    public boolean e() {
        a aVar = this.f18456a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f18456a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD || aVar == a.MANUAL_WITH_LOAD_ON_SHOW;
    }
}
