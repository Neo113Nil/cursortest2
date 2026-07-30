package com.anythink.core.common.t;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.video.module.a.a.m;

/* loaded from: classes.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16599a = "TimeOutHandlerImpl";

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f16600b;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f16602d = com.anythink.core.common.v.b.b.a().a(12);

    /* renamed from: c, reason: collision with root package name */
    private final Handler f16601c = new Handler(Looper.getMainLooper());

    private d() {
    }

    public static a a() {
        if (f16600b == null) {
            synchronized (d.class) {
                try {
                    if (f16600b == null) {
                        f16600b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16600b;
    }

    @Override // com.anythink.core.common.t.a
    public final void b(b bVar) {
        Handler handler = this.f16601c;
        if (handler != null && bVar != null) {
            handler.removeCallbacks(bVar);
        }
        Handler handler2 = this.f16602d;
        if (handler2 == null || bVar == null) {
            return;
        }
        handler2.removeCallbacks(bVar);
    }

    private Handler a(boolean z8) {
        return z8 ? this.f16601c : this.f16602d;
    }

    @Override // com.anythink.core.common.t.a
    public final void a(b bVar) {
        a(bVar, m.ai, true);
    }

    @Override // com.anythink.core.common.t.a
    public final void a(b bVar, long j9, boolean z8) {
        Handler a9 = a(z8);
        if (a9 == null) {
            return;
        }
        a9.postDelayed(bVar, j9);
    }
}
