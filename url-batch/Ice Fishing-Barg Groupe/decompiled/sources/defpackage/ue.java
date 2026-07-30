package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ue implements te, hu2 {
    public static final ue rtx2ld2ELZv4 = new ue();
    public static final ue OPXfSBeufaJ8 = new ue();

    @Override // defpackage.te
    public Rect RAsUl2FVSrh6(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.hu2
    public cu2 lS5Rgt96tfkO(ContextWrapper contextWrapper, jy jyVar) {
        jyVar.getClass();
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new cu2(bounds, f);
    }
}
