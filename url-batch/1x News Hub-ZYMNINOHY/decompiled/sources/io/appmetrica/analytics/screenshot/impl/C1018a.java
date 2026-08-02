package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C1018a;
import io.appmetrica.analytics.screenshot.impl.C1021d;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018a extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1021d f9025a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1018a(C1021d c1021d) {
        super(0);
        this.f9025a = c1021d;
    }

    public static final void a(C1021d c1021d) {
        ((C1040x) c1021d.f9031b).a("AndroidApiScreenshotCaptor");
    }

    @Override // l2.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C1021d c1021d = this.f9025a;
        return new Activity.ScreenCaptureCallback() { // from class: C1.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C1018a.a(C1021d.this);
            }
        };
    }
}
