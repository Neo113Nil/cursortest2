package W3;

import K.o;
import a.AbstractC0415a;
import android.content.Context;
import h3.n;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final K3.c f3454a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3455b;

    /* renamed from: c, reason: collision with root package name */
    public final Y3.a f3456c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3457d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f3458e;

    public d(Context context, String str, Set set, Y3.a aVar, Executor executor) {
        this.f3454a = new K3.c(context, str);
        this.f3457d = set;
        this.f3458e = executor;
        this.f3456c = aVar;
        this.f3455b = context;
    }

    public final n a() {
        return !o.a(this.f3455b) ? AbstractC0415a.r("") : AbstractC0415a.g(new c(this, 0), this.f3458e);
    }

    public final void b() {
        if (this.f3457d.size() <= 0) {
            AbstractC0415a.r(null);
        } else if (o.a(this.f3455b)) {
            AbstractC0415a.g(new c(this, 1), this.f3458e);
        } else {
            AbstractC0415a.r(null);
        }
    }
}
