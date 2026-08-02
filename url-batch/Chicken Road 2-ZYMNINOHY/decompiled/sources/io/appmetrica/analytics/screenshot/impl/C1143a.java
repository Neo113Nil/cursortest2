package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C1143a;
import io.appmetrica.analytics.screenshot.impl.C1146d;
import o3.InterfaceC1328a;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143a extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1146d f13454a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143a(C1146d c1146d) {
        super(0);
        this.f13454a = c1146d;
    }

    public static final void a(C1146d c1146d) {
        ((C1165x) c1146d.f13460b).a("AndroidApiScreenshotCaptor");
    }

    @Override // o3.InterfaceC1328a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C1146d c1146d = this.f13454a;
        return new Activity.ScreenCaptureCallback() { // from class: X2.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C1143a.a(C1146d.this);
            }
        };
    }
}
