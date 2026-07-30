package com.baidu.mshield.x6.f.m;

import android.annotation.TargetApi;
import com.baidu.mshield.x6.f.f;

@TargetApi(9)
/* loaded from: classes2.dex */
public abstract class a implements d<a> {

    /* renamed from: a, reason: collision with root package name */
    public int f8573a;

    public a() {
        this(5);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        try {
            return aVar.f8573a - this.f8573a;
        } catch (Throwable th) {
            f.b(th);
            return 0;
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public void run() {
        b();
    }

    public a(int i8) {
        this.f8573a = i8;
    }
}
