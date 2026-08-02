package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class q extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public final C0223a f2678e;

    /* renamed from: f, reason: collision with root package name */
    public final View f2679f;

    public q(Context context, C0223a c0223a, View view) {
        super(context);
        this.f2678e = c0223a;
        this.f2679f = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.k kVar = this.f2678e.f2622a;
        if (kVar == null) {
            return false;
        }
        return kVar.a(this.f2679f, view, accessibilityEvent);
    }
}
