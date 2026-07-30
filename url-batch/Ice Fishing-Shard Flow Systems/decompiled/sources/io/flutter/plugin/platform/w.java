package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class w extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final C0555a f5773d;

    /* renamed from: e, reason: collision with root package name */
    public final View f5774e;

    public w(Context context, C0555a c0555a, View view) {
        super(context);
        this.f5773d = c0555a;
        this.f5774e = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.g gVar = this.f5773d.f5690a;
        if (gVar == null) {
            return false;
        }
        return gVar.a(this.f5774e, view, accessibilityEvent);
    }
}
