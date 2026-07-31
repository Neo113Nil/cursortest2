package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class wq {

    /* renamed from: a, reason: collision with root package name */
    private lq f13913a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13914b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13915c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f13916d = new Object();

    wq(Context context) {
        this.f13915c = context;
    }

    static /* bridge */ /* synthetic */ void e(wq wqVar) {
        synchronized (wqVar.f13916d) {
            lq lqVar = wqVar.f13913a;
            if (lqVar == null) {
                return;
            }
            lqVar.d();
            wqVar.f13913a = null;
            Binder.flushPendingCommands();
        }
    }

    final Future<yq> c(mq mqVar) {
        qq qqVar = new qq(this);
        uq uqVar = new uq(this, mqVar, qqVar);
        vq vqVar = new vq(this, qqVar);
        synchronized (this.f13916d) {
            lq lqVar = new lq(this.f13915c, y2.t.u().b(), uqVar, vqVar);
            this.f13913a = lqVar;
            lqVar.q();
        }
        return qqVar;
    }
}
