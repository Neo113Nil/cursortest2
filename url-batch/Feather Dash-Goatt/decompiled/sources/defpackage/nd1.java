package defpackage;

import android.content.Context;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nd1 {
    public static final hy0 c = new hy0("mode");
    public static final hy0 d = new hy0("saved_web_view_url");
    public static final hy0 e = new hy0("saved_web_view_expires_at_seconds");
    public static final hy0 f = new hy0("notification_prompt_skipped_at");
    public static final hy0 g = new hy0("notification_permission_requested_at");
    public final ro a;
    public final c51 b;

    public nd1(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        nq0 a = od1.b.a(applicationContext, od1.a[0]);
        this.a = a;
        this.b = new c51(a.o(), 5, this);
    }

    public final Object a(ed1 ed1Var) {
        Object p = gb0.p(this.a, new yo(2, null, 3), ed1Var);
        return p == tn.d ? p : Unit.a;
    }
}
