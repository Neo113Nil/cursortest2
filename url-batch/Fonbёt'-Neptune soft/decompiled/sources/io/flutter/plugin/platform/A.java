package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: i, reason: collision with root package name */
    public static final x f2611i = new x();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f2613b;

    /* renamed from: c, reason: collision with root package name */
    public final C0223a f2614c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2615d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2616e;

    /* renamed from: f, reason: collision with root package name */
    public final h f2617f;

    /* renamed from: g, reason: collision with root package name */
    public final l f2618g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f2619h;

    public A(Activity activity, C0223a c0223a, VirtualDisplay virtualDisplay, g gVar, h hVar, l lVar, int i2) {
        this.f2613b = activity;
        this.f2614c = c0223a;
        this.f2617f = hVar;
        this.f2618g = lVar;
        this.f2616e = i2;
        this.f2619h = virtualDisplay;
        this.f2615d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f2619h.getDisplay(), gVar, c0223a, i2, lVar);
        this.f2612a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f2612a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
