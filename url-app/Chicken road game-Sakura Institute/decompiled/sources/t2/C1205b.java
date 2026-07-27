package t2;

import G1.n;
import H1.o;
import U1.k;
import X0.h;
import Z1.g;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import u2.InterfaceC1229b;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205b implements InterfaceC1207d, InterfaceC1208e {

    /* renamed from: a, reason: collision with root package name */
    public final g f10738a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10739b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1229b f10740c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f10741d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10742e;

    public C1205b(Context context, String str, Set set, InterfaceC1229b interfaceC1229b, Executor executor) {
        this.f10738a = new g(context, 1, str);
        this.f10741d = set;
        this.f10742e = executor;
        this.f10740c = interfaceC1229b;
        this.f10739b = context;
    }

    public final void a() {
        if (this.f10741d.size() <= 0) {
            new k().h(null);
            return;
        }
        if (!h.a(this.f10739b)) {
            new k().h(null);
            return;
        }
        CallableC1204a callableC1204a = new CallableC1204a(this);
        Executor executor = this.f10742e;
        o.e(executor, "Executor must not be null");
        executor.execute(new n(4, (Object) new k(), (Object) callableC1204a, false));
    }
}
