package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class ni implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent[] f7344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7346c;

    public ni(Intent[] intentArr, Context context, String str) {
        this.f7344a = intentArr;
        this.f7345b = context;
        this.f7346c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7344a[0] = si.a(this.f7345b, this.f7346c);
        synchronized (this.f7344a) {
            this.f7344a.notifyAll();
        }
    }
}
