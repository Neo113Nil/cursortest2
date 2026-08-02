package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class ni implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent[] f4211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4213c;

    public ni(Intent[] intentArr, Context context, String str) {
        this.f4211a = intentArr;
        this.f4212b = context;
        this.f4213c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4211a[0] = si.a(this.f4212b, this.f4213c);
        synchronized (this.f4211a) {
            this.f4211a.notifyAll();
        }
    }
}
