package io.flutter.plugin.platform;

import android.view.View;

/* renamed from: io.flutter.plugin.platform.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0561g {
    void dispose();

    View getView();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onInputConnectionLocked();

    void onInputConnectionUnlocked();
}
