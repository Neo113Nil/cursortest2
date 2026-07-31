package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent[] f457a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public uh(Intent[] intentArr, Context context, String str) {
        this.f457a = intentArr;
        this.b = context;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f457a[0] = zh.a(this.b, this.c);
        synchronized (this.f457a) {
            this.f457a.notifyAll();
        }
    }
}
