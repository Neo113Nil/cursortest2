package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cp1 extends bp1 {
    @Override // defpackage.fb0
    public final void RfyTYNmI9Srp(View view, Rect rect) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        rect.set(bounds);
    }
}
