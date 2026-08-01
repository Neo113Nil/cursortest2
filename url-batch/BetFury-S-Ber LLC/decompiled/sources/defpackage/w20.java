package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class w20 {
    public final String a;
    public final uv b;
    public final Context c;
    public final ah d;
    public final AtomicBoolean e;
    public int f;
    public tu g;
    public final sd0 h;
    public final u20 i;
    public final t20 j;
    public final v20 k;

    public w20(Context context, String str, uv uvVar) {
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = uvVar;
        this.c = context.getApplicationContext();
        this.d = uvVar.a.getCoroutineScope();
        this.e = new AtomicBoolean(true);
        u9 u9Var = u9.SUSPEND;
        this.h = new sd0();
        this.i = new u20(this, uvVar.b);
        this.j = new t20(this);
        this.k = new v20(this);
    }
}
