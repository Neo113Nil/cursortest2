package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C1169a;
import io.appmetrica.analytics.screenshot.impl.C1172d;
import t4.InterfaceC1430a;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1169a extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1172d f10005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169a(C1172d c1172d) {
        super(0);
        this.f10005a = c1172d;
    }

    public static final void a(C1172d c1172d) {
        ((C1191x) c1172d.f10011b).a("AndroidApiScreenshotCaptor");
    }

    @Override // t4.InterfaceC1430a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C1172d c1172d = this.f10005a;
        return new Activity.ScreenCaptureCallback() { // from class: u2.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C1169a.a(C1172d.this);
            }
        };
    }
}
