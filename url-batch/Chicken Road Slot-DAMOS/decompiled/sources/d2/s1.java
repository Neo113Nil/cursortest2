package d2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s1 implements d1.n {

    /* renamed from: d, reason: collision with root package name */
    public final Context f3531d;

    /* renamed from: e, reason: collision with root package name */
    public le.d f3532e;

    /* renamed from: i, reason: collision with root package name */
    public final n0.f1 f3533i = new n0.f1(1.0f);

    /* renamed from: r, reason: collision with root package name */
    public ge.r1 f3534r;

    public s1(Context context) {
        this.f3531d = context;
    }

    @Override // d1.n
    public final float C() {
        ld.a aVar;
        je.j0 j0Var;
        if (this.f3534r == null) {
            Context context = this.f3531d;
            s.h0 h0Var = p2.f3507a;
            synchronized (h0Var) {
                try {
                    Object g = h0Var.g(context);
                    aVar = null;
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        ie.c a9 = ie.j.a(-1, 6, null);
                        je.x xVar = new je.x(new n2(contentResolver, uriFor, new o2(a9, a.a.l(Looper.getMainLooper())), a9, context, null));
                        ge.s1 d10 = ge.a0.d();
                        ne.e eVar = ge.k0.f4372a;
                        g = je.b0.k(xVar, new le.d(kotlin.coroutines.e.c(d10, le.o.f5995a)), new je.i0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        h0Var.m(context, g);
                    }
                    j0Var = (je.j0) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3533i.i(((Number) j0Var.getValue()).floatValue());
            le.d dVar = this.f3532e;
            if (dVar == null) {
                kotlin.collections.i0.l("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f3534r = ge.a0.s(dVar, null, new a3.t(j0Var, this, aVar, 4), 3);
        }
        return this.f3533i.h();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
