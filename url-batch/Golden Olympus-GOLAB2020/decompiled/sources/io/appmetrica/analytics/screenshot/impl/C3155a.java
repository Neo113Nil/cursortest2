package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C3155a;
import io.appmetrica.analytics.screenshot.impl.C3158d;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3155a extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3158d f40735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3155a(C3158d c3158d) {
        super(0);
        this.f40735a = c3158d;
    }

    public static final void a(C3158d c3158d) {
        ((C3175v) c3158d.f40742b).a("AndroidApiScreenshotCaptor");
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C3158d c3158d = this.f40735a;
        return new Activity.ScreenCaptureCallback() { // from class: U1.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C3155a.a(C3158d.this);
            }
        };
    }
}
