package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.view.View;
import io.flutter.plugin.platform.InterfaceC0561g;
import java.util.HashMap;

/* loaded from: classes.dex */
public interface PlatformWebView extends InterfaceC0561g {
    @Override // io.flutter.plugin.platform.InterfaceC0561g
    /* synthetic */ void dispose();

    @Override // io.flutter.plugin.platform.InterfaceC0561g
    /* synthetic */ View getView();

    void makeInitialLoad(HashMap<String, Object> hashMap);

    @Override // io.flutter.plugin.platform.InterfaceC0561g
    /* bridge */ /* synthetic */ default void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.InterfaceC0561g
    /* bridge */ /* synthetic */ default void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.InterfaceC0561g
    /* bridge */ /* synthetic */ default void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.InterfaceC0561g
    /* bridge */ /* synthetic */ default void onInputConnectionUnlocked() {
    }
}
