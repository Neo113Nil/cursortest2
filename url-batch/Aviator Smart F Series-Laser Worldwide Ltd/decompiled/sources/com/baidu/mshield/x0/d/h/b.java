package com.baidu.mshield.x0.d.h;

import android.annotation.TargetApi;

@TargetApi(9)
/* loaded from: classes2.dex */
public abstract class b implements a<b> {

    /* renamed from: a, reason: collision with root package name */
    public int f8442a;

    public b() {
        this(5);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        try {
            return bVar.f8442a - this.f8442a;
        } catch (Throwable th) {
            com.baidu.mshield.x0.d.d.a(th);
            return 0;
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public void run() {
        b();
    }

    public b(int i8) {
        this.f8442a = i8;
    }
}
