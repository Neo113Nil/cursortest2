package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class t extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final C1043a f9317a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9318b;

    public t(Context context, C1043a c1043a, View view) {
        super(context);
        this.f9317a = c1043a;
        this.f9318b = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.i iVar = this.f9317a.f9244a;
        if (iVar == null) {
            return false;
        }
        return iVar.a(this.f9318b, view, accessibilityEvent);
    }
}
