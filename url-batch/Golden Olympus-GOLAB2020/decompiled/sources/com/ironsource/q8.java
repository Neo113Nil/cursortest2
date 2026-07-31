package com.ironsource;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class q8 {

    /* renamed from: a, reason: collision with root package name */
    private a f18811a = a.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f18812b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f18813c;

    enum a {
        NOT_READY,
        READY
    }

    public q8(String str) {
        this.f18813c = str;
    }

    public synchronized void a() {
        try {
            Object[] array = this.f18812b.toArray();
            for (int i4 = 0; i4 < array.length; i4++) {
                ((Runnable) array[i4]).run();
                array[i4] = null;
            }
            this.f18812b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.f18811a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f18811a = a.READY;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f18811a != a.READY) {
            this.f18812b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
