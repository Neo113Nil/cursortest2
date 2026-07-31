package o4;

import android.app.Activity;
import android.content.Context;
import b6.d1;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5684a;

    /* renamed from: b, reason: collision with root package name */
    public final r4.g f5685b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.p f5686c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f5687d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5688e;

    /* renamed from: f, reason: collision with root package name */
    public final b.u f5689f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5690g;

    public t(Context context) {
        Object obj;
        q6.i.e(context, "context");
        this.f5684a = context;
        this.f5685b = new r4.g(this, new d1(this, 4));
        this.f5686c = new d4.p(context, 1);
        Iterator it = x6.g.b0(context, new j0.l(8)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f5687d = (Activity) obj;
        this.f5689f = new b.u(3, this);
        this.f5690g = true;
        z zVar = this.f5685b.f6601s;
        zVar.a(new s(zVar));
        this.f5685b.f6601s.a(new b(this.f5684a));
        a.a.r(new d1(this, 5));
    }

    public static void a(t tVar, String str) {
        tVar.getClass();
        q6.i.e(str, "route");
        tVar.f5685b.k(str, null);
    }
}
