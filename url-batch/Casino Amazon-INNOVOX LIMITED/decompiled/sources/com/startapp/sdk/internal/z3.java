package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class z3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f518a;
    public final /* synthetic */ com.startapp.sdk.components.a b;

    public z3(com.startapp.sdk.components.a aVar, Context context) {
        this.b = aVar;
        this.f518a = context;
    }

    public static /* synthetic */ ComponentInfoEventConfig b() {
        AnalyticsConfig g = MetaData.A().g();
        if (g != null) {
            return g.f();
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.c7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mb call() {
        Context context = this.f518a;
        com.startapp.sdk.components.a aVar = this.b;
        return new mb(context, aVar.E, aVar.G, new c7() { // from class: com.startapp.sdk.internal.z3$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.c7
            public final Object call() {
                return z3.b();
            }
        });
    }
}
