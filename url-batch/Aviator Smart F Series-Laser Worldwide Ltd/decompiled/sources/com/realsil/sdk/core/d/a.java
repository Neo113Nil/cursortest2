package com.realsil.sdk.core.d;

/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f15647a;

    public a(b bVar) {
        this.f15647a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15647a.f15648a.stopScan();
    }
}
