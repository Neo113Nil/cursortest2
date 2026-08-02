package com.startapp.sdk.components;

import com.startapp.sdk.adsbase.remoteconfig.EventTracerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.u3;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6588a;

    public /* synthetic */ e(int i4) {
        this.f6588a = i4;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        EventTracerMetadata t4;
        switch (this.f6588a) {
            case 0:
                return a.c();
            case 1:
                return a.a();
            case 2:
                return a.b();
            case 3:
                t4 = MetaData.E().t();
                return t4;
            case 4:
                return si.c();
            default:
                return u3.c();
        }
    }
}
