package com.startapp.sdk.internal;

import android.os.Handler;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ah implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f3569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh f3570b;

    public ah(Handler handler, eh ehVar) {
        this.f3569a = handler;
        this.f3570b = ehVar;
    }

    public static void a(eh ehVar) {
        if (gh.v == 1) {
            gh.v = 2;
        }
        ehVar.getClass();
        WeakHashMap weakHashMap = si.f4438a;
        ehVar.f3759d = true;
        boolean z = ehVar.f3760e;
        if (z && z && !ehVar.f3757b) {
            ehVar.f3757b = true;
            g0.a(ehVar.f3756a);
        }
    }

    public final void b() {
        this.f3569a.post(new B0.n(11, this.f3570b));
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        b();
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        b();
    }
}
