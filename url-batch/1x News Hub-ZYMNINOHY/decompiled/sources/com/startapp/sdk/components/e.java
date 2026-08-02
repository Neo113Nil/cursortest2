package com.startapp.sdk.components;

import com.startapp.sdk.adsbase.remoteconfig.EventTracerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.u3;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3490a;

    public /* synthetic */ e(int i3) {
        this.f3490a = i3;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        EventTracerMetadata t3;
        switch (this.f3490a) {
            case 0:
                return a.c();
            case 1:
                return a.a();
            case 2:
                return a.b();
            case 3:
                t3 = MetaData.E().t();
                return t3;
            case 4:
                return si.c();
            default:
                return u3.c();
        }
    }
}
