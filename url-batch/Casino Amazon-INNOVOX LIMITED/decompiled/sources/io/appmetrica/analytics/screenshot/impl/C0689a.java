package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0689a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0692d f1721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0689a(C0692d c0692d) {
        super(0);
        this.f1721a = c0692d;
    }

    public static final void a(C0692d c0692d) {
        ((C0711x) c0692d.b).a("AndroidApiScreenshotCaptor");
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C0692d c0692d = this.f1721a;
        return new Activity.ScreenCaptureCallback() { // from class: io.appmetrica.analytics.screenshot.impl.a$$ExternalSyntheticLambda0
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C0689a.a(C0692d.this);
            }
        };
    }
}
