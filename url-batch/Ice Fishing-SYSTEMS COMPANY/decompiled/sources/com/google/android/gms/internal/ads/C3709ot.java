package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ot, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3709ot {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f33229b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f33230a;

    public C3709ot(Handler handler) {
        this.f33230a = handler;
    }

    public static /* synthetic */ void f(C3333ht c3333ht) {
        ArrayList arrayList = f33229b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(c3333ht);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3333ht g() {
        C3333ht c3333ht;
        ArrayList arrayList = f33229b;
        synchronized (arrayList) {
            try {
                c3333ht = arrayList.isEmpty() ? new C3333ht() : (C3333ht) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3333ht;
    }

    public final boolean a() {
        return this.f33230a.hasMessages(37);
    }

    public final C3333ht b(int i, Object obj) {
        C3333ht g9 = g();
        g9.f31278a = this.f33230a.obtainMessage(i, obj);
        return g9;
    }

    public final boolean c(int i) {
        return this.f33230a.sendEmptyMessage(i);
    }

    public final void d(int i) {
        this.f33230a.removeMessages(i);
    }

    public final boolean e(Runnable runnable) {
        return this.f33230a.post(runnable);
    }
}
