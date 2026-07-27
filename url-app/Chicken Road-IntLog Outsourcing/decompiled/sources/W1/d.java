package W1;

import I1.o;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final K1.c f3398a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3399b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1.a f3400c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3401d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f3402e;

    public d(Context context, String str, Set set, Y1.a aVar, Executor executor) {
        this.f3398a = new K1.c(context, str);
        this.f3401d = set;
        this.f3402e = executor;
        this.f3400c = aVar;
        this.f3399b = context;
    }

    public final o a() {
        if (!A.h.a(this.f3399b)) {
            return B0.f.r("");
        }
        return B0.f.f(this.f3402e, new c(this, 0));
    }

    public final void b() {
        if (this.f3401d.size() <= 0) {
            B0.f.r(null);
        } else if (!A.h.a(this.f3399b)) {
            B0.f.r(null);
        } else {
            B0.f.f(this.f3402e, new c(this, 1));
        }
    }
}
