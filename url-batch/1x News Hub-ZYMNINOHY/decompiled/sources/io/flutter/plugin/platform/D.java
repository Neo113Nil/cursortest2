package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.View;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: i, reason: collision with root package name */
    public static final z f9234i = new z();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f9235a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f9236b;

    /* renamed from: c, reason: collision with root package name */
    public final C1043a f9237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9238d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9239e;
    public final i f;

    /* renamed from: g, reason: collision with root package name */
    public final m f9240g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f9241h;

    public D(Activity activity, C1043a c1043a, VirtualDisplay virtualDisplay, g gVar, i iVar, m mVar, int i3) {
        this.f9236b = activity;
        this.f9237c = c1043a;
        this.f = iVar;
        this.f9240g = mVar;
        this.f9239e = i3;
        this.f9241h = virtualDisplay;
        this.f9238d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f9241h.getDisplay(), gVar, c1043a, i3, mVar);
        this.f9235a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f9235a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
