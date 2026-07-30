package defpackage;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ky implements jy, hu2 {
    public static final ky rtx2ld2ELZv4 = new ky();
    public static final ky OPXfSBeufaJ8 = new ky();

    @Override // defpackage.jy
    public float e9gEMXR7LXtO(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.hu2
    public cu2 lS5Rgt96tfkO(ContextWrapper contextWrapper, jy jyVar) {
        jyVar.getClass();
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new cu2(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
