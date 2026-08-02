package com.startapp.sdk.internal;

import android.os.Handler;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ah implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f6673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh f6674b;

    public ah(Handler handler, eh ehVar) {
        this.f6673a = handler;
        this.f6674b = ehVar;
    }

    public static void a(eh ehVar) {
        if (gh.v == 1) {
            gh.v = 2;
        }
        ehVar.getClass();
        WeakHashMap weakHashMap = si.f7575a;
        ehVar.f6874d = true;
        boolean z = ehVar.f6875e;
        if (z && z && !ehVar.f6872b) {
            ehVar.f6872b = true;
            g0.a(ehVar.f6871a);
        }
    }

    public final void b() {
        this.f6673a.post(new R1.n(18, this.f6674b));
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
