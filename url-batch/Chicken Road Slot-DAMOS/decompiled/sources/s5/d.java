package s5;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements b, g {

    /* renamed from: b, reason: collision with root package name */
    public static final d f8454b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final d f8455c = new d();

    @Override // s5.b
    public Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // s5.g
    public r5.a c(ContextWrapper contextWrapper, e eVar) {
        eVar.getClass();
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f3 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new r5.a(bounds, f3);
    }
}
