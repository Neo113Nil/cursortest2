package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class pc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f379a;
    public final /* synthetic */ tc b;

    public pc(tc tcVar, String str) {
        this.b = tcVar;
        this.f379a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        String str = this.f379a;
        if (!tcVar.h) {
            tcVar.r = System.currentTimeMillis();
            tcVar.q.put(str, Float.valueOf(-1.0f));
            tcVar.d.postDelayed(tcVar.s, tcVar.i);
            tcVar.h = true;
        }
        tcVar.p = false;
        tcVar.a();
    }
}
