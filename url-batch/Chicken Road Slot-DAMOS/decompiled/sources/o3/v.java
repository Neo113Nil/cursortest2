package o3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public k1 f7448a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f7450c;

    public v(View view, i iVar) {
        this.f7449b = view;
        this.f7450c = iVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k1 c10 = k1.c(windowInsets, view);
        int i3 = Build.VERSION.SDK_INT;
        i iVar = this.f7450c;
        if (i3 < 30) {
            w.a(windowInsets, this.f7449b);
            if (c10.equals(this.f7448a)) {
                return iVar.b(view, c10).b();
            }
        }
        this.f7448a = c10;
        k1 b10 = iVar.b(view, c10);
        if (i3 >= 30) {
            return b10.b();
        }
        Field field = c0.f7378a;
        view.requestApplyInsets();
        return b10.b();
    }
}
