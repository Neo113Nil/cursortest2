package com.ironsource.b.h;

/* compiled from: SessionDepthManager.java */
/* loaded from: classes2.dex */
public class i {
    private static i e;

    /* renamed from: a, reason: collision with root package name */
    private int f6947a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f6948b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f6949c = 1;

    /* renamed from: d, reason: collision with root package name */
    private int f6950d = 0;

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (e == null) {
                e = new i();
            }
            iVar = e;
        }
        return iVar;
    }

    public synchronized void a(int i) {
        switch (i) {
            case 0:
                this.f6949c++;
                break;
            case 1:
                this.f6947a++;
                break;
            case 2:
                this.f6948b++;
                break;
            case 3:
                this.f6950d++;
                break;
        }
    }

    public synchronized int b(int i) {
        switch (i) {
            case 0:
                return this.f6949c;
            case 1:
                return this.f6947a;
            case 2:
                return this.f6948b;
            case 3:
                return this.f6950d;
            default:
                return -1;
        }
    }
}
