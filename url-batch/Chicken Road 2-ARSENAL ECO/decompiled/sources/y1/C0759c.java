package y1;

import a.AbstractC0219a;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import k1.n;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    public final m1.c f6229a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6230b;

    /* renamed from: c, reason: collision with root package name */
    public final A1.a f6231c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f6232d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f6233e;

    public C0759c(Context context, String str, Set set, A1.a aVar, Executor executor) {
        this.f6229a = new m1.c(context, str);
        this.f6232d = set;
        this.f6233e = executor;
        this.f6231c = aVar;
        this.f6230b = context;
    }

    public final n a() {
        if (!z.e.a(this.f6230b)) {
            return AbstractC0219a.p("");
        }
        return AbstractC0219a.f(this.f6233e, new CallableC0758b(0, this));
    }

    public final void b() {
        if (this.f6232d.size() <= 0) {
            AbstractC0219a.p(null);
        } else if (!z.e.a(this.f6230b)) {
            AbstractC0219a.p(null);
        } else {
            AbstractC0219a.f(this.f6233e, new CallableC0758b(1, this));
        }
    }
}
