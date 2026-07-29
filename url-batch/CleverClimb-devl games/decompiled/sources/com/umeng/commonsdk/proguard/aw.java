package com.umeng.commonsdk.proguard;

/* compiled from: TTransportException.java */
/* loaded from: classes2.dex */
public class aw extends o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9043a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9044b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9045c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9046d = 3;
    public static final int e = 4;
    private static final long g = 1;
    protected int f;

    public aw() {
        this.f = 0;
    }

    public aw(int i) {
        this.f = 0;
        this.f = i;
    }

    public aw(int i, String str) {
        super(str);
        this.f = 0;
        this.f = i;
    }

    public aw(String str) {
        super(str);
        this.f = 0;
    }

    public aw(int i, Throwable th) {
        super(th);
        this.f = 0;
        this.f = i;
    }

    public aw(Throwable th) {
        super(th);
        this.f = 0;
    }

    public aw(String str, Throwable th) {
        super(str, th);
        this.f = 0;
    }

    public aw(int i, String str, Throwable th) {
        super(str, th);
        this.f = 0;
        this.f = i;
    }

    public int a() {
        return this.f;
    }
}
