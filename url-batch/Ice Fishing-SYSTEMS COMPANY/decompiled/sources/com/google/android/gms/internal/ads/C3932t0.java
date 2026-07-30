package com.google.android.gms.internal.ads;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3932t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f34332a;

    /* renamed from: b, reason: collision with root package name */
    public final VN f34333b;

    public C3932t0(Handler handler, VN vn, int i) {
        switch (i) {
            case 1:
                this.f34332a = handler;
                this.f34333b = vn;
                break;
            default:
                if (vn != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f34332a = handler;
                this.f34333b = vn;
                break;
        }
    }

    public void a(C3100dd c3100dd) {
        Handler handler = this.f34332a;
        if (handler != null) {
            handler.post(new MD(1, this, c3100dd));
        }
    }
}
