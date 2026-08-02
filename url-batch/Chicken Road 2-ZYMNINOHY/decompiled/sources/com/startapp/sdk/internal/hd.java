package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class hd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f7061b;

    public hd(ld ldVar, String str) {
        this.f7061b = ldVar;
        this.f7060a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f7061b;
        String str = this.f7060a;
        if (!ldVar.f7224h) {
            ldVar.f7232r = System.currentTimeMillis();
            ldVar.f7231q.put(str, Float.valueOf(-1.0f));
            ldVar.f7220d.postDelayed(ldVar.f7233s, ldVar.f7225i);
            ldVar.f7224h = true;
        }
        ldVar.f7230p = false;
        ldVar.a();
    }
}
