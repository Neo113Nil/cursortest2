package com.startapp.sdk.internal;

import android.app.Activity;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class te implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f442a;
    public final /* synthetic */ xe b;

    public te(xe xeVar, Activity activity) {
        this.b = xeVar;
        this.f442a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.b(this.f442a);
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
