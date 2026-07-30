package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fb0 {
    public static final /* synthetic */ dc0[] d;
    public final String a;
    public final ThreadLocal b;
    public final ro c;

    static {
        b01 b01Var = new b01(jf.d, fb0.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        a21.a.getClass();
        d = new dc0[]{b01Var};
    }

    public fb0(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        this.c = xa0.s(str, new nq0(7, new eb0(this, 0)), new eb0(this, 1), 8).a(context, d[0]);
    }

    public final void a(Function1 function1) {
    }
}
