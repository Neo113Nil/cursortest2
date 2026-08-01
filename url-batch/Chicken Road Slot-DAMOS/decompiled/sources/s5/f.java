package s5;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f8456b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final f f8457c = new f();

    @Override // s5.e
    public float b(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // s5.g
    public r5.a c(ContextWrapper contextWrapper, e eVar) {
        eVar.getClass();
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new r5.a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
