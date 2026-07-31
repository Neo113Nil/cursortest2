package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0236hn {

    /* renamed from: a, reason: collision with root package name */
    public final C0665z0 f1295a;
    public final Io b;
    public final C0390o c;
    public final Xk d;
    public final F5 e;
    public final C0120da f;

    public C0236hn(C0665z0 c0665z0, Io io2, C0390o c0390o, Xk xk, F5 f5, C0120da c0120da) {
        this.f1295a = c0665z0;
        this.b = io2;
        this.c = c0390o;
        this.d = xk;
        this.e = f5;
        this.f = c0120da;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.hn$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C0236hn.b((Activity) obj);
            }
        });
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C0236hn(C0665z0 c0665z0, Io io2) {
        this(c0665z0, io2, C0088c4.l().a(), C0088c4.l().o(), C0088c4.l().h(), C0088c4.l().k());
    }
}
