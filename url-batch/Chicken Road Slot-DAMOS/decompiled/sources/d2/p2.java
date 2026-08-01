package d2;

import android.view.View;
import com.appsflyer.R;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.h0 f3507a;

    static {
        long[] jArr = s.p0.f8356a;
        f3507a = new s.h0();
    }

    public static final n0.o a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof n0.o) {
            return (n0.o) tag;
        }
        return null;
    }
}
