package com.startapp.sdk.internal;

import android.os.Handler;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class kg implements qb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f308a;
    public final /* synthetic */ og b;

    public kg(Handler handler, og ogVar) {
        this.f308a = handler;
        this.b = ogVar;
    }

    public static void a(og ogVar) {
        if (qg.v == 1) {
            qg.v = 2;
        }
        ogVar.getClass();
        WeakHashMap weakHashMap = zh.f528a;
        ogVar.d = true;
        boolean z = ogVar.e;
        if (z && z) {
            boolean z2 = ogVar.c;
            if (ogVar.b) {
                return;
            }
            ogVar.b = true;
            e0.a(ogVar.f368a);
        }
    }

    public final void b() {
        Handler handler = this.f308a;
        final og ogVar = this.b;
        handler.post(new Runnable() { // from class: com.startapp.sdk.internal.kg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kg.a(og.this);
            }
        });
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        b();
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a() {
        b();
    }
}
