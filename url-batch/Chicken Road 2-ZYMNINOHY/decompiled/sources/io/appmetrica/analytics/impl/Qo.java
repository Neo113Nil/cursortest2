package io.appmetrica.analytics.impl;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class Qo implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10859b;

    public /* synthetic */ Qo(int i4, Object obj) {
        this.f10858a = i4;
        this.f10859b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10858a) {
            case 0:
                return U.e((U) this.f10859b);
            case 1:
                return ((C1092y0) this.f10859b).p();
            default:
                return new t1.f((JsReplyProxyBoundaryInterface) this.f10859b);
        }
    }
}
