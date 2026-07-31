package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.fn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2634fn {

    /* renamed from: a, reason: collision with root package name */
    public final C3000u0 f39005a;

    /* renamed from: b, reason: collision with root package name */
    public final Do f39006b;

    /* renamed from: c, reason: collision with root package name */
    public final C2818n f39007c;

    /* renamed from: d, reason: collision with root package name */
    public final Xk f39008d;

    /* renamed from: e, reason: collision with root package name */
    public final C2483a6 f39009e;

    /* renamed from: f, reason: collision with root package name */
    public final C3088xa f39010f;

    public C2634fn(C3000u0 c3000u0, Do r22, C2818n c2818n, Xk xk, C2483a6 c2483a6, C3088xa c3088xa) {
        this.f39005a = c3000u0;
        this.f39006b = r22;
        this.f39007c = c2818n;
        this.f39008d = xk;
        this.f39009e = c2483a6;
        this.f39010f = c3088xa;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.jp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C2634fn.b((Activity) obj);
            }
        });
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C2634fn(C3000u0 c3000u0, Do r10) {
        this(c3000u0, r10, C3082x4.l().a(), C3082x4.l().o(), C3082x4.l().h(), C3082x4.l().k());
    }
}
