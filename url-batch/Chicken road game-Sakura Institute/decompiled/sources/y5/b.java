package y5;

import android.content.Context;
import b3.z;
import e5.h;
import java.util.Set;
import java.util.concurrent.Executor;
import m4.o;
import z4.i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements d, e {

    /* renamed from: a, reason: collision with root package name */
    public final h f9897a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9898b;

    /* renamed from: c, reason: collision with root package name */
    public final z5.b f9899c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9900d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f9901e;

    public b(Context context, String str, Set set, z5.b bVar, Executor executor) {
        this.f9897a = new h(context, 1, str);
        this.f9900d = set;
        this.f9901e = executor;
        this.f9899c = bVar;
        this.f9898b = context;
    }

    public final void a() {
        if (this.f9900d.size() <= 0) {
            new i().d(null);
            return;
        }
        if (!x2.h.a(this.f9898b)) {
            new i().d(null);
            return;
        }
        a aVar = new a(this);
        Executor executor = this.f9901e;
        o.e(executor, "Executor must not be null");
        executor.execute(new z(new i(), 13, aVar));
    }
}
