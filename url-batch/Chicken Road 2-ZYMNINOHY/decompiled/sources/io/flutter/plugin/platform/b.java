package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlatformViewsAccessibilityDelegate f13564c;

    public /* synthetic */ b(PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate, int i4, int i5) {
        this.f13562a = i5;
        this.f13564c = platformViewsAccessibilityDelegate;
        this.f13563b = i4;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f13562a) {
            case 0:
                ((PlatformViewsController) this.f13564c).lambda$initializePlatformViewIfNeeded$2(this.f13563b, view, z);
                break;
            default:
                ((PlatformViewsController2) this.f13564c).lambda$initializePlatformViewIfNeeded$0(this.f13563b, view, z);
                break;
        }
    }
}
