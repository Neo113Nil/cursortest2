package com.startapp.flutter.sdk;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import io.flutter.plugin.platform.g;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class StartAppView implements g {
    private View view;

    public static int dpToPx(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int getInt(Map<String, Object> map, String str, int i3) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
        }
        return i3;
    }

    public void createView(Context context, int i3, Map<String, Object> map) {
        this.view = onCreateView(context, i3, map);
    }

    @Override // io.flutter.plugin.platform.g
    public void dispose() {
    }

    @Override // io.flutter.plugin.platform.g
    public View getView() {
        return this.view;
    }

    public abstract View onCreateView(Context context, int i3, Map<String, Object> map);

    @Override // io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }
}
