package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class K implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25862n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Handler f25863u;

    public /* synthetic */ K(Handler handler, int i) {
        this.f25862n = i;
        this.f25863u = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f25862n) {
            case 0:
                this.f25863u.post(runnable);
                break;
            case 1:
                this.f25863u.post(runnable);
                break;
            default:
                this.f25863u.post(runnable);
                break;
        }
    }

    public K(Vx vx, Handler handler) {
        this.f25862n = 1;
        this.f25863u = handler;
        Objects.requireNonNull(vx);
    }
}
