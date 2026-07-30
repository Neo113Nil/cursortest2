package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.Bl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2490Bl extends AbstractC2982bM implements InterfaceC3725p8 {

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap f24066v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f24067w;

    /* renamed from: x, reason: collision with root package name */
    public final Ut f24068x;

    public C2490Bl(Context context, Set set, Ut ut) {
        super(set);
        this.f24066v = new WeakHashMap(1);
        this.f24067w = context;
        this.f24068x = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final synchronized void A(C3671o8 c3671o8) {
        u1(new Vx(20, c3671o8));
    }

    public final synchronized void v1(View view) {
        try {
            WeakHashMap weakHashMap = this.f24066v;
            ViewOnAttachStateChangeListenerC3779q8 viewOnAttachStateChangeListenerC3779q8 = (ViewOnAttachStateChangeListenerC3779q8) weakHashMap.get(view);
            if (viewOnAttachStateChangeListenerC3779q8 == null) {
                ViewOnAttachStateChangeListenerC3779q8 viewOnAttachStateChangeListenerC3779q82 = new ViewOnAttachStateChangeListenerC3779q8(this.f24067w, view);
                viewOnAttachStateChangeListenerC3779q82.f33652E.add(this);
                viewOnAttachStateChangeListenerC3779q82.d(3);
                weakHashMap.put(view, viewOnAttachStateChangeListenerC3779q82);
                viewOnAttachStateChangeListenerC3779q8 = viewOnAttachStateChangeListenerC3779q82;
            }
            if (this.f24068x.f28137X) {
                C3151ea c3151ea = AbstractC3368ia.f31580W1;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    long longValue = ((Long) rVar.f40119c.a(AbstractC3368ia.f31571V1)).longValue();
                    N1.l lVar = viewOnAttachStateChangeListenerC3779q8.f33649B;
                    synchronized (lVar.f1970v) {
                        lVar.f1968n = longValue;
                    }
                    return;
                }
            }
            N1.l lVar2 = viewOnAttachStateChangeListenerC3779q8.f33649B;
            long j9 = ViewOnAttachStateChangeListenerC3779q8.f33647H;
            synchronized (lVar2.f1970v) {
                lVar2.f1968n = j9;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
