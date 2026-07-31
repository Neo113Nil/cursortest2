package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class tb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ub f439a;

    public tb(ub ubVar) {
        this.f439a = ubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f439a.c();
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
