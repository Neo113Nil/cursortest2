package com.startapp.flutter.sdk;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import io.flutter.plugin.platform.PlatformView;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class StartAppView implements PlatformView {
    private View view;

    public static int dpToPx(Context context, float f4) {
        return (int) TypedValue.applyDimension(1, f4, context.getResources().getDisplayMetrics());
    }

    public static int getInt(Map<String, Object> map, String str, int i4) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
        }
        return i4;
    }

    public void createView(Context context, int i4, Map<String, Object> map) {
        this.view = onCreateView(context, i4, map);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.view;
    }

    public abstract View onCreateView(Context context, int i4, Map<String, Object> map);
}
